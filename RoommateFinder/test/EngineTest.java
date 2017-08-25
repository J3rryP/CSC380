/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dborelli
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class EngineTest {
    @Test
    void all() { //everything but 6
        Engine e = new Engine();
        ArrayList<Student> s = e.all(6);
        boolean check = false;
        for(Student a: s){
            check = a.getId() != 6;
        }
        assertTrue(check);

    }

    @Test
    void update() { //updates both users matches
        Engine e = new Engine();
        e.update(6,7);
        Student s = e.single("Kofi");
        String f[] =new String[1];
        if(!(s.equals("null"))) {
            System.out.println(s.getMatches1());
            f = s.getMatches1().split(";");
        }
        boolean check = false;
        for(int a = 0 ; a < f.length; a++){
            if(f[a].equals("6")) check = true;
        }
        assertTrue(check);
    }

    @Test
    void single() {
        Engine e = new Engine();
        Student s = e.single("David");
        boolean check = false;
        check = s.getName().equals("David");
        assertTrue(check);
    }


