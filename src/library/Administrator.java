package library;

import library.DBManager;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by davidkyere & jerrypisagih on 6/5/17.
 */
public class Administrator {

    private static final String adminFile  = "admin.txt";

    public Administrator(){

    }

    public void newUser(String username , String password) throws IOException{
        String credentials = username + " " + password;
        DBManager.write(credentials,adminFile);
    }

    public void editUser(String username , String opassword , String password) throws IOException{
        String ocredentials = username + " " + opassword;
        String credential = username + " " + password;

        ArrayList<String> passes = DBManager.readAll(adminFile);
        int opass = passes.indexOf(ocredentials);

        passes.remove(opass);
        passes.add(credential);

        DBManager.writeAll(passes,adminFile);
    }

    public void deleteUser(String username , String password) throws IOException {
        String credentials = username + " " + password;

        ArrayList<String> passes = DBManager.readAll(adminFile);
        int found = passes.indexOf(credentials);

        passes.remove(found);

        try {
            DBManager.writeAll(passes,adminFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
