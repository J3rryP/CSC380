import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by davidkyere on 6/5/17.
 */
public class Administrator {

    public Administrator(){

    }

    public void newUser(String username , String password){
        String credentials = username + " " + password;
        DBManager.write(credentials);
    }

    public void editUser(String username , String opassword , String password) throws IOException{
        String ocredentials = username + " " + password;
        String credential = username + " " + password;

        ArrayList<String> passes = DBManager.readAll();
        int opass = passes.indexOf(ocredentials);
        passes.remove(opass);
        passes.add(credential);

        DBManager.writeAll(passes);
    }

    //delete user
}
