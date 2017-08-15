
/**
 * Created by david yeboah on 7/21/17.
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Calendar;
import java.util.Objects;
import java.io.*;

public class Student {

    protected long id;
    protected String name;
    protected String password;
    protected String lastLogin = "fish";
    protected String email;
    protected String gender;
    protected String year;
    protected String building;
    protected String major;
    protected String language;

    protected ArrayList<Student> matches;
    School schools = new School("");

    public Student() {
        matches = new ArrayList<Student>();
    }

    public Student(String u, String p, String e, String y, String g, String m, String l, String b) {
        this.name = u;
        this.password = p;
        this.lastLogin = Calendar.getInstance().getTime().toString();
        this.email = e;
        this.gender = g;
        this.year = y;
        this.major = m;
        this.language = l;
        this.building = b;
        matches = new ArrayList<Student>();
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;

    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin.toString();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public ArrayList<Student> getMatches() {
        return matches;
    }

    public String getLanguage() {
        return language;
    }

    public String getMajor() {
        return major;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setMatches(ArrayList<Student> matches) {
        this.matches = matches;
    }

    public boolean addMatches(Student s) {
        return this.matches.add(s);
    }

    public boolean removeMatches(Student s) {
        return this.matches.remove(s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.email);
    }

    void setSchool(School schools) {

        this.schools = schools;

    }

    public String getSchool() {

        return schools.getName();
    }

    public boolean save() throws IOException {
        Connection conn = null;
        Statement  stmt = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://104.197.99.28:3306/room";
            conn = DriverManager.getConnection(url, "root", "123ppp");  // Get a connection from the pool
            stmt = conn.createStatement();
            String f = "select * from students where strcmp(students.email,'"+this.email+"')=0";
            
            ResultSet rs = null;
            rs = stmt.executeQuery(f);
            
            if (!rs.next()) {
                String sql = "insert into students values('"+this.name+"','"+this.email+"','"+this.year+"','"+this.gender+"','"+this.major+"','"+this.language+"','"+this.building+"',null,null,null,null,'"+this.password+"');";
                stmt.execute(sql);
                return true;
            } else {
                System.out.println("User already exists");
                return false;
            }
        }catch(Exception se){
            se.printStackTrace();
        }
        return false;
    }
    
    public Student find(String n , String p) throws IOException{
        Connection conn = null;
        Statement  stmt = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://104.197.99.28:3306/room";
            conn = DriverManager.getConnection(url, "root", "123ppp");  // Get a connection from the pool
            stmt = conn.createStatement();
            String f = "select * from students where strcmp(students.email,'"+n+"')=0 and strcmp(students.password,'"+p+"')=0";
            System.out.println(f);
            ResultSet rs = null;
            rs = stmt.executeQuery(f);
            
            if (rs.next()) { //not all info about students are included .
                this.name = rs.getString("name");
                this.email = rs.getString("email");
                this.gender = rs.getString("gender");
                this.year = rs.getString("year");
                this.building = rs.getString("building");
                this.language = rs.getString("language");
                this.major = rs.getString("major");
                this.password = rs.getString("password");
                this.id = rs.getInt("id");
                this.lastLogin = rs.getString("matches");
                return this;
            } else {
                
                return null;
            }
        }catch(Exception se){
            se.printStackTrace();
        }
        return null;
    }
    
    public String [] mtches(String a []){
        Connection conn = null;
        Statement  stmt = null;
        int index  = 0;
        String [] results = new String[a.length];
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://104.197.99.28:3306/room";
            conn = DriverManager.getConnection(url, "root", "123ppp");  // Get a connection from the pool
            stmt = conn.createStatement();
            
            while(index < a.length){
                String f = "select * from students where id = "+a[index];
                System.out.println(f);
                ResultSet rs = null;
                rs = stmt.executeQuery(f);
            
                if (rs.next()) { //not all info about students are included .
                    String n = rs.getString("name");
                    results[index]= n;
                } 
                index++;
            }
            
        }catch(Exception se){
            se.printStackTrace();
        }
        return results;
    }
    
    public String [] check(){
       String [] q = {"No matches yet"};
        if(lastLogin!= null) {
                String [] ids = lastLogin.split(";");
                q = mtches(ids);
        }
        return q;
    }

}
