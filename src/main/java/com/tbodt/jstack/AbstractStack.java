/*
 * Copyright (c) 2014 Theodore Dubois.
 * 
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * and the GNU Lesser General Public License for more details (copies are
 * included in the LICENSE and LICENSE.LESSER files that accompanied this code).
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.tbodt.jstack;

import java.util.AbstractCollection;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * An abstract implementation of a Stack. 
 * 
 * <p>Requires that the implementor override:
 * <ul>
 * <li>{@code Collection.add} to push.</li>
 * <li>{@code Collection.iterator} to return an iterator traversing down from the top of the stack.</li>
 * <li>{@code Collection.size} to return the current size of the stack.</li>
 * </ul>
 * @param <E> the type of the elements
 * @author Theodore Dubois
 */
public abstract class AbstractStack<E> extends AbstractCollection<E> implements Stack<E> {
    
    @Override
    public boolean add(E e) {
        push(e);
        return true; // I can't imagine a stack that isn't modified if something is pushed
    }
    
    @Override
    public E peek() {
        Iterator<E> iterator = iterator();
        if (!iterator.hasNext())
            throw new EmptyStackException();
        return iterator.next();
    }

    @Override
    public E pop() {
        Iterator<E> iterator = iterator();
        E e;
        if (!iterator.hasNext())
            throw new EmptyStackException();
        e = iterator.next();
        iterator.remove();
        return e;
    }

}
