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
public class SignUpGUITest {
    
   @org.junit.jupiter.api.Test
    public void testmCheckBoxActionPerformed() {
        
        SignUpGUI s = new SignUpGUI();
        
        s.gender = "M";
        
        assertTrue("F" == s.gender);
    }
    
    @org.junit.jupiter.api.Test
    public void testfCheckBoxActionPerformed() {
        
        SignUpGUI s = new SignUpGUI();
        
        s.gender = "F";
        
        assertTrue("M" == s.gender);
    }
    
    @org.junit.jupiter.api.Test
    public void testfreshmanCheckBoxActionPerformed() {
        
        SignUpGUI s = new SignUpGUI();
        
        s.year = "freshman";
        
        assertTrue("sophomore" == s.year);
    }
    
    @org.junit.jupiter.api.Test
    public void testsophomoreCheckBoxActionPerformed() {
        
        SignUpGUI s = new SignUpGUI();
        
        s.year = "sophomore";
        
        assertTrue("senior" == s.year);
    }
    
    @org.junit.jupiter.api.Test
    public void testjuniorCheckBoxActionPerformed() {
        
        SignUpGUI s = new SignUpGUI();
        
        s.year = "junior";
        
        assertTrue("freshman" == s.year);
    }
    
    @org.junit.jupiter.api.Test
    public void testseniorCheckBoxActionPerformed() {
        
        SignUpGUI s = new SignUpGUI();
        
        s.year = "senior";
        
        assertTrue("junior" == s.year);
    }
    
    @org.junit.jupiter.api.Test
    public void testmComboBoxActionPerformed() {
        
        SignUpGUI s = new SignUpGUI();
        
        s.major = "Computer Science";
        
        assertTrue("Chemistry" == s.major);
    }
    
    @org.junit.jupiter.api.Test
    public void testemailFieldActionPerformed() {
        
        SignUpGUI s = new SignUpGUI();
        
        s.email = "joe@aol.com";
        
        assertTrue("joe2@aol.com" == s.email);
    }
    
    @org.junit.jupiter.api.Test
    public void testpassFieldActionPerformed() {
        
        SignUpGUI s = new SignUpGUI();
        
        s.password = "putty1";
        
        assertTrue("putty2" == s.password);
    }
    
    @org.junit.jupiter.api.Test
    public void testlComboBoxActionPerformed() {
        
        SignUpGUI s = new SignUpGUI();
        
        s.language = "English";
        
        assertTrue("Spanish" == s.language);
    }
    
    @org.junit.jupiter.api.Test
    public void testbComboBoxActionPerformed() {
        
        SignUpGUI s = new SignUpGUI();
        
        s.building = "Hart";
        
        assertTrue("Oneida" == s.building);
    }
    
}
