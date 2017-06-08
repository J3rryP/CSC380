package test;

import library.DBManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import library.Inventory;
import library.Book;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by davidkyere & jerrypisagih on 6/5/17.
 */
class InventoryTest {

    @Test
    void addBook() throws IOException {
        Inventory invent = new Inventory();
        Book b = new Book("1", "Mastering VB6", "Mr. J. K ", "MSN" , "1999", "Programming", "VB6, Programming ", "Issued");
        invent.addBook(b);

        File console = new File("inventory.txt");

        Scanner sc = new Scanner(console);
        String pass = b.toString();
        if(sc.hasNextLine()) {
            String s = sc.nextLine();
            assertTrue(s.equals(pass));
        }


    }

    @Test
    void editBook() throws IOException {
        Inventory invent = new Inventory();
        Book b = new Book("2", "Oracle Handbook", "Mr. Oracle ", "Oracle Press " , "2010", "Database", "Oracle, Database", "Issued");
        Book b1 = new Book("1", "Mastering VB6", "Mr. J. K ", "MSN" , "1999", "Programming", "VB6, Programming ", "Issued");
        Book b3 = new Book("1", "Mastering VB6", "Mr. J. K ", "MSN" , "2017", "Programming", "VB6, Programming ", "Issued");
        invent.addBook(b);
        invent.editBook(b1,b3);
        String pass = b3.toString();

        ArrayList<String> books = DBManager.readAll("inventory.txt");

        int found = books.indexOf(b3.toString());
        String s = books.get(found);

        assertTrue(s.equals(pass));
    }

    @Test
    void deleteBook() throws IOException {
        Inventory invent = new Inventory();
        Book b = new Book("2", "Oracle Handbook", "Mr. Oracle ", "Oracle Press " , "2010", "Database", "Oracle, Database", "Issued");
        invent.deleteBook(b);

        ArrayList<String> books = DBManager.readAll("inventory.txt");
        int found = books.indexOf(b.toString());
        assertTrue(found == -1);

    }

}