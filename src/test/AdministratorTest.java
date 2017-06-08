package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import library.Administrator;
import library.Book;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by davidkyere & jerrypisagih on 6/5/17.
 */
class AdministratorTest {
    @org.junit.jupiter.api.Test
    void newUser() throws FileNotFoundException, IOException{
        Administrator admin = new Administrator();
        admin.newUser("david","1234");

        File console = new File("admin.txt");

        Scanner sc = new Scanner(console);
        String pass = "david 1234";
        System.out.println(pass);
        if(sc.hasNextLine()) {
            String s = sc.nextLine();
            assertTrue(s.equals(pass));
        }

    }

    @org.junit.jupiter.api.Test
    void editUser() throws IOException {
        Administrator admin = new Administrator();
        admin.editUser("david","1234" ,"abcd");

        File console = new File("admin.txt");

        Scanner sc = new Scanner(console);
        String pass = "david abcd";
        if(sc.hasNextLine()) {
            String s = sc.nextLine();
            assertTrue(s.equals(pass));
        }

    }

    @org.junit.jupiter.api.Test
    void deleteUser() throws IOException {
        Administrator admin = new Administrator();
        admin.deleteUser("david","abcd");

        File console = new File("admin.txt");

        Scanner sc = new Scanner(console);
        String s = null;
        if(sc.hasNextLine()) {
            s = sc.nextLine();
        }

        assertNull(s);

    }

}