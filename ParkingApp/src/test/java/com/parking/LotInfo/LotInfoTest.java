/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parking.LotInfo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeremiah
 */
public class LotInfoTest {
    
    public LotInfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of taken method, of class LotInfo.
     */
    @Test
    public void testTaken() {
        System.out.println("taken");
        LotInfo instance = new LotInfo();
        boolean expResult = false;
        boolean result = instance.taken();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class LotInfo.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String des = "";
        String loc = "";
        boolean iso = false;
        boolean ish = false;
        LotInfo instance = new LotInfo();
        instance.update(des, loc, iso, ish);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of status method, of class LotInfo.
     */
    @Test
    public void testStatus() {
        System.out.println("status");
        LotInfo instance = new LotInfo();
        instance.status();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
