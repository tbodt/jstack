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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author theodore
 */
public class ArrayStack<E> extends AbstractStack<E> {
    
    /**
     * Constructs an empty {@code ArrayStack}.
     */
    public ArrayStack() {
        this(Collections.EMPTY_LIST);
    }
    
    /**
     * Constructs an {@code ArrayStack} whose elements come from {@code collection}.
     * @param collection the collection to construct the stack from. The first element returned by the iterator becomes the top of the stack.
     */
    public ArrayStack(Collection<E> collection) {
        stack = new ArrayList<E>(collection);
    }

    @Override
    public Iterator<E> iterator() {
        return stack.iterator();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean add(E e) {
        stack.add(0, e);
        return true;
    }
    
    private ArrayList<E> stack;
}
