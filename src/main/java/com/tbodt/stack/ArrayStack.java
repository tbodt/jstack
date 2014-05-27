/*
 * Copyright (c) 2013 Theodore Dubois.
 * 
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.tbodt.stack;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * A stack implemented with an array.
 *
 * @param <E> the type of the elements
 * @author Theodore Dubois
 */
public final class ArrayStack<E> extends AbstractStack<E> implements Cloneable {

    private E[] elements;
    private int top;
    private static final int DEFAULT_INITIAL_CAPACITY = 10;

    /**
     * Constructs an empty {@code ArrayStack}.
     */
    public ArrayStack() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    /**
     * Constructs an empty {@code ArrayStack} with the given initial capacity.
     *
     * @param capacity the initial capacity
     */
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    /**
     * Constructs an {@code ArrayStack} whose elements come from
     * {@code collection}.
     *
     * @param collection the collection to construct the stack from. The first
     * element returned by the iterator becomes the top of the stack.
     */
    public ArrayStack(Collection<E> collection) {
        for (E e : collection)
            push(e);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = top;

            @Override
            public boolean hasNext() {
                return index > 0;
            }

            @Override
            public E next() {
                return elements[--index];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("To remove from stack, use pop");
            }
        };
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public void push(E e) {
        elements[top++] = e;
        if (top >= elements.length)
            elements = Arrays.copyOf(elements, top * 2 + 1);
    }

    @Override
    public E pop() {
        E ret = elements[--top];
        elements[top + 1] = null;
        return ret;
    }

    @Override
    public ArrayStack<E> clone() {
        try {
            @SuppressWarnings("unchecked")
            ArrayStack<E> stack = (ArrayStack<E>) super.clone();
            stack.elements = elements.clone();
            return stack;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError(ex);
        }
    }
}
