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

import java.util.Collection;

/**
 * An interface describing a stack collection. Similar to <tt>java.util.Stack</tt>
 * @author theodore
 * @see java.util.Collection
 * @see java.util.Stack
 */
public interface Stack<E> extends Collection<E> { 
    /**
     * Pushes an object onto the stack.
     * @param item the item to push onto the stack.
     * @return whether this push operation actually modified the stack.
     */
    boolean push(E item);
    /**
     * Returns the top of the stack without popping it.
     * @return the top of the stack.
     */
    E peek();
    /**
     * Removes the top of the stack and returns it.
     * @return the top of the stack, after removing it.
     */
    E pop();   
}
