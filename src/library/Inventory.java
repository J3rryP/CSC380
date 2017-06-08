package library;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by davidkyere & jerrypisagih on 6/5/17.
 */
public class Inventory {

    private static final String inventory  = "inventory.txt";

    public Inventory(){
    }

    public void addBook(Book s) throws IOException {
        DBManager.write(s.toString(),inventory);
    }

    public void editBook(Book ob , Book nb) throws IOException {
        ArrayList<String> allbooks = DBManager.readAll(inventory);
        System.out.println("size is "+ allbooks.size());
        int found = allbooks.indexOf(ob.toString());
        allbooks.remove(found);
        allbooks.add(nb.toString());
        DBManager.writeAll(allbooks,inventory);

    }

    public void deleteBook(Book s) throws IOException {
        ArrayList<String> allBooks = DBManager.readAll(inventory);
        allBooks.remove(s.toString());
        DBManager.writeAll(allBooks,inventory);
    }


}
