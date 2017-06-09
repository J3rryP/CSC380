package library;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by davidkyere & jerrypisagih on 6/5/17.
 */
public class Transaction {

    public Transaction(){

    }

    public String issueBook(String member_id , String book_id){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = new Date();
        return dateFormat.format(d);
    }

    public String recieveBook(String member id , String book id ){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = new Date();
        return dateFormat.format(d);
    }

    public ArrayList<String> getReport(){
        return null;
    }
}
