/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Jeremiah
 */
public class SchoolTest {

    /**
     * Test of contains method, of class School.
     */
    @org.junit.jupiter.api.Test
    public void testContains() {
        System.out.println("contains");
        
        School z = new School("Oswego");
        Student s = new Student();
        z.add(s);
        
        assertTrue(z.contains(s)==true);
    }

    /**
     * Test of add method, of class School.
     */
    @org.junit.jupiter.api.Test
    public void testAdd_SchoolBuilding() {
        System.out.println("add");
     
        School z = new School("Oswego");
        
        
        School.Building s = new School.Building("A",9);
        
        assertTrue(s.capacity == 9);
        assertTrue(s.getName() == "A");
    }
    /**
     * Test of add method, of class School.
     */
    @org.junit.jupiter.api.Test
    public void testAdd_ErrorType_SchoolBuilding() {
        System.out.println("add");
        
        School.Building s = new School.Building("Hart Hall", 2);
        
        Student w = new Student();
        
        School a = new School("Oswego");
        
        a.add(w, s);
        
        assertTrue(s.contains(w)== true);
       
        
    }


    /**
     * Test of add method, of class School.
     */
    @org.junit.jupiter.api.Test
    public void testAdd_ErrorType() {
        System.out.println("add");
       
        School z = new School("Oswego");
        
        Student s = new Student();
        
        z.add(s);
        
        assertTrue(z.contains(s)== true );
    }

    /**
     * Test of remove method, of class School.
     */
    @org.junit.jupiter.api.Test
    public void testRemove() {
        System.out.println("remove");
        
        School n = new School("Oswego");
        
        Student y = new Student();
        
        n.add(y);
        
        n.remove(y);
        
        assertFalse(n.contains(y) == true);
       
    }

    /**
     * Test of getName method, of class School.
     */
    @org.junit.jupiter.api.Test
    public void testGetName() {
        System.out.println("getName");
        
        School.Building z = new School.Building("Hart Hall",11);
        
        assertTrue("Hart Hall".equals(z.getName()));
        
      
    }

    /**
     * Test of getStudents method, of class School.
     */
    @org.junit.jupiter.api.Test
    public void testGetStudents() {
        System.out.println("getStudents");
       
        School.Building z = new School.Building("R",3);
        Student r = new Student();
        
        z.add(r);
        
        assertTrue(z.getStudents() == r);
        
    }
    
}
