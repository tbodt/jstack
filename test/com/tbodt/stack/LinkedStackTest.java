/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tbodt.stack;

import java.util.Iterator;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author theodore
 */
public class LinkedStackTest {
    
    public LinkedStackTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of iterator method, of class LinkedStack.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        LinkedStack instance = new LinkedStack();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class LinkedStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedStack instance = new LinkedStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class LinkedStack.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object e = null;
        LinkedStack instance = new LinkedStack();
        boolean expResult = false;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
