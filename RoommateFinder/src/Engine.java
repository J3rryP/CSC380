/*
 * To change    s license header, choose License Headers in Project Properties.
 * To change    s template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dborelli
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Engine {
    
    ArrayList<Student> obj;
    
    public Engine(){
        obj = new ArrayList<>();
    }
    
    public ArrayList<Student> all(int id){
        Connection conn = null;
        Statement  stmt = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://104.197.99.28:3306/room";
            conn = DriverManager.getConnection(url, "root", "123ppp");  // Get a connection from the pool
            stmt = conn.createStatement();
            String f = "select * from students where id !="+id;
            
            ResultSet rs = null;
            rs = stmt.executeQuery(f);
            
            while (rs.next()) {
                Student s = new Student();
                s.name = rs.getString("name");
                s.email = rs.getString("email");
                s.gender = rs.getString("gender");
                s.year = rs.getString("year");
                s.building = rs.getString("building");
                s.language = rs.getString("language");
                s.major = rs.getString("major");
                s.id = rs.getInt("id");
                obj.add(s);
            }
        }catch(Exception se){
            se.printStackTrace();
        }
        return obj;
    }
    
    public int update(int id , int target){
        Connection conn = null;
        Statement  stmt = null;
        int check = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://104.197.99.28:3306/room";
            conn = DriverManager.getConnection(url, "root", "123ppp");  // Get a connection from the pool
            stmt = conn.createStatement();
            
            ResultSet rs = null;
            String[] parts = null;
            String g = "select new from students where id ="+id;
            rs = stmt.executeQuery(g);
            if(rs.next()){
               String a = rs.getString("new");
               if(a != null){
               parts = a.split(";");
               
               for(String b : parts){
                    if(b.equals(""+target)) {
                    check = 1;
                    }
                }
               }
            }
            
            if(check == 1 ){
                String f = "update students set matches = concat(matches,'"+target+";') where id ="+id;
                stmt.execute(f);
                String t = "update students set matches = concat(matches,'"+id+";') where id ="+target;
                stmt.execute(t);
            
            }else {
                String f = "update students set new = concat(new,'"+id+";') where id ="+target;
                stmt.execute(f);
            }
            
        }catch(Exception se){
            se.printStackTrace();
        }
        return check;
    }
   
    
    public Student single(String i){
         Connection conn = null;
        Statement  stmt = null;
        Student s = new Student();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://104.197.99.28:3306/room";
            conn = DriverManager.getConnection(url, "root", "123ppp");  // Get a connection from the pool
            stmt = conn.createStatement();
            String f = "select * from students where name = '"+i+"'";
            System.out.println(f);
            ResultSet rs = null;
            rs = stmt.executeQuery(f);
            
            while (rs.next()) {
                s.name = rs.getString("name");
                s.email = rs.getString("email");
                s.gender = rs.getString("gender");
                s.year = rs.getString("year");
                s.building = rs.getString("building");
                s.language = rs.getString("language");
                s.major = rs.getString("major");
                s.id = rs.getInt("id");
            }
        }catch(Exception se){
            se.printStackTrace();
        }
        return s;
    
    }
    
    
    
}
