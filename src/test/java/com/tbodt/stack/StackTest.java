/*
 * Copyright (C) 2014 Theodore Dubois
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.tbodt.stack;

import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Theodore Dubois
 */
public class StackTest {

    @Test
    public void testArrayStack() {
        Stack<Integer> stack = new ArrayStack<Integer>();
        for (int i = 0; i <= 20; i++)
            stack.push(i);
        int count = 20;
        Iterator<Integer> iter = stack.iterator();
        while ( iter.hasNext() ) {
            assertTrue(iter.next().intValue() == count);
            count--;
        }
        for (int i = 20; i >= 0; i--)
            assertTrue(stack.pop().equals(i));
    }
}
