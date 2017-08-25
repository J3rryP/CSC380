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
public class LogInGUITest {
    
    @org.junit.jupiter.api.Test
    public void testlogInButtonActionPerformed() {
        
        LogInGUI s = new LogInGUI();
        
        Student t = new Student();
        
        s.email = "joe@aol.com";
        s.password = "putty2";
        
        assertFalse(t.email == "joe@aol.com");
        assertFalse(t.password == "putty2");

    
    
    }
    
       

    

    
}
