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
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * An implementation of a stack as a linked list.
 * @author theodore
 */
public class LinkedStack<E> extends AbstractStack<E> {

    /**
     * Constructs an empty {@code LinkedStack}.
     */
    public LinkedStack() {
        this(Collections.EMPTY_LIST);
    }
    
    /**
     * Constructs an {@code LinkedStack} whose elements come from {@code collection}.
     * @param collection the collection to construct the stack from.
     */
    public LinkedStack(Collection<E> collection) {
        links = new LinkedList<E>(collection);
    }

    @Override
    public Iterator<E> iterator() {
        return links.iterator();
    }

    @Override
    public int size() {
        return links.size();
    }

    @Override
    public boolean add(E e) {
        links.addFirst(e);
        return true;
    }
    
    private LinkedList<E> links;
}
