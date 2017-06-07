package library;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by davidkyere & jerrypisagih on 6/5/17.
 */

public class DBManager {

    private static final String adminFile  = "admin.txt";

    public static void write(String s){
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            fw = new FileWriter(adminFile);
            bw = new BufferedWriter(fw);
            bw.write(s);
            bw.newLine();

            System.out.println("success");


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(bw != null)
                    bw.close();
                if(fw != null)
                    fw.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }

    public static ArrayList<String> readAll() throws FileNotFoundException , IOException{
        File console = new File(adminFile);
        BufferedReader reader = new BufferedReader(new FileReader(console));
        ArrayList<String> credentials = new ArrayList<String>();

        String line ;
        while((line = reader.readLine()) != null){
            credentials.add(line);
        }
        reader.close();
        return credentials;
    }

    public static void writeAll(ArrayList<String> s) throws IOException {
        BufferedWriter bw = null;
        FileWriter fw = null;

        File console = new File(adminFile);
        if(console.exists()) console.delete();

        fw = new FileWriter(adminFile);
        bw = new BufferedWriter(fw);

        for(String pass : s){
            bw.write(pass);
            bw.newLine();
        }
        bw.close();

    }

}
