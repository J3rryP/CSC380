package library;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by davidkyere & jerrypisagih on 6/5/17.
 */

public class DBManager {


    private static final String inventory = "inventory.txt";

    public static void write(String s, String db) throws IOException {
        BufferedWriter bw = null;
        FileWriter fw = null;

        fw = new FileWriter(db,true);
        bw = new BufferedWriter(fw);
        bw.write(s);
        bw.newLine();

        bw.close();
        fw.close();

    }

    public static ArrayList<String> readAll(String db) throws FileNotFoundException , IOException{
        File console = new File(db);
        BufferedReader reader = new BufferedReader(new FileReader(console));
        ArrayList<String> credentials = new ArrayList<String>();

        String line ;
        while((line = reader.readLine()) != null){
            credentials.add(line);
        }
        reader.close();
        return credentials;
    }

    public static void writeAll(ArrayList<String> s, String db) throws IOException {
        BufferedWriter bw = null;
        FileWriter fw = null;

        File console = new File(db);
        if(console.exists()) console.delete();

        fw = new FileWriter(db);
        bw = new BufferedWriter(fw);

        for(String pass : s){
            bw.write(pass);
            bw.newLine();
        }
        bw.close();

    }

}
