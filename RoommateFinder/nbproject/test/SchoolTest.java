/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Set;
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
public class SchoolTest {
    
    public SchoolTest() {
    }

    /**
     * Test of contains method, of class School.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Student student = null;
        School instance = null;
        boolean expResult = false;
        boolean result = instance.contains(student);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class School.
     */
    @Test
    public void testAdd_SchoolBuilding() {
        System.out.println("add");
        School.Building building = null;
        School instance = null;
        boolean expResult = false;
        boolean result = instance.add(building);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class School.
     */
    @Test
    public void testAdd_ErrorType_SchoolBuilding() {
        System.out.println("add");
        Student student = null;
        School.Building building = null;
        School instance = null;
        boolean expResult = false;
        boolean result = instance.add(student, building);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class School.
     */
    @Test
    public void testAdd_ErrorType_int() {
        System.out.println("add");
        Student student = null;
        int buildingIndex = 0;
        School instance = null;
        boolean expResult = false;
        boolean result = instance.add(student, buildingIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class School.
     */
    @Test
    public void testAdd_ErrorType() {
        System.out.println("add");
        Student student = null;
        School instance = null;
        boolean expResult = false;
        boolean result = instance.add(student);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class School.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Student student = null;
        School instance = null;
        boolean expResult = false;
        boolean result = instance.remove(student);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class School.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        School instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class School.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        School instance = null;
        Set<Student> expResult = null;
        Set<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
