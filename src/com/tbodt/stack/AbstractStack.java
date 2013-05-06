/*
 * Copyright (c) 2013 Theodore Dubois.
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
package com.tbodt.stack;

import java.util.AbstractCollection;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * An abstract implementation of a Stack. Requires that the implementor override <tt>Collection.add</tt> to push,
 * <tt>Collection.iterator</tt> to return an iterator traversing down from the top of the stack,
 * and <tt>Collection.size</tt> to return the current size of the stack.
 * @author theodore
 */
public abstract class AbstractStack<E> extends AbstractCollection<E> implements Stack<E> {
    
    @Override
    public boolean push(E e) {
        return add(e);
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
