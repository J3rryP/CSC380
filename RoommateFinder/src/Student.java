/**
 * Created by david yeboah on 7/21/17.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.Objects;

public class Student {

    protected long id;
    protected String username;
    protected String password;
    protected String lastLogin;
    protected boolean isActive = true;
    protected String email;
    protected String gender;
    protected String year;
    protected String description;
    protected String major;
    protected String language;

    protected ArrayList<Student> matches;

    public Student(){
        matches = new ArrayList<Student>();
    }
<<<<<<< HEAD
    School schools = new School("");
    
=======

>>>>>>> 247e8cac7bde41449544d4bea261f27f928fb13b
    public Student(long i , String u , String p , boolean a , String e , String y , String g , String d, String m, String l){
        this.id = i;
        this.username = u;
        this.password = p;
        this.lastLogin = Calendar.getInstance().getTime().toString();
        this.isActive = a;
        this.email = e;
        this.gender = g;
        this.year = y;
        this.major = m;
        this.language = l;
        matches = new ArrayList<Student>();
    }
<<<<<<< HEAD
   
=======
>>>>>>> 247e8cac7bde41449544d4bea261f27f928fb13b

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin.toString();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public boolean addMatches(Student s){
        return this.matches.add(s);
    }

    public boolean removeMatches(Student s){
        return this.matches.remove(s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id,this.email);
    }

<<<<<<< HEAD
    void setSchool(School schools) {
        
        this.schools = schools;

    }
    public String getSchool(){
        
     return schools.getName();   
    }
    }
=======
}
>>>>>>> 247e8cac7bde41449544d4bea261f27f928fb13b
