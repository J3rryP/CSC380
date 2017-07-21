import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by david yeboah on 7/21/17.
 */
import java.util.Calendar;
import java.util.Date;

class StudentTest {
    @org.junit.jupiter.api.Test
    void setId() {
        Student s = new Student();
        s.setId(45);
        assertTrue(s.getId()==45);
    }

    @org.junit.jupiter.api.Test
    void setEmail() {
        Student s = new Student();
        s.setEmail("d@123.com");
        assertTrue(s.getEmail().equals("d@123.com"));
    }

    @org.junit.jupiter.api.Test
    void setActive() {
        Student s = new Student();
        s.setIsActive(true);
        assertTrue(s.isActive()==true);
    }

    @org.junit.jupiter.api.Test
    void setLastLogin() { //mili test
        Student s = new Student();
        Date d = Calendar.getInstance().getTime();
        System.out.println(d.toString());
        s.setLastLogin(d);
        assertTrue(s.getLastLogin().equals(Calendar.getInstance().getTime().toString()));
    }

    @org.junit.jupiter.api.Test
    void setPassword() {
        Student s = new Student();
        s.setPassword("hus");
        assertTrue(s.getPassword().equals("hus"));
    }

    @org.junit.jupiter.api.Test
    void setUsername() {
        Student s = new Student();
        s.setUsername("climatehack");
        assertTrue(s.getUsername().equals("climatehack"));
    }


    @org.junit.jupiter.api.Test
    void setYear() {
        Student s = new Student();
        s.setYear("sophomore");
        assertTrue(s.getYear().equals("sophomore"));
    }


    @org.junit.jupiter.api.Test
    void setDescription() {
        Student s = new Student();
        s.setDescription("i'm not a smoker");
        assertTrue(s.getDescription().equals("i'm not a smoker"));
    }

    @org.junit.jupiter.api.Test
    void setGender() {
        Student s = new Student();
        s.setGender("male");
        assertTrue(s.getGender().equals("male"));
    }


    @org.junit.jupiter.api.Test
    void setLanguage() {
        Student s = new Student();
        s.setLanguage("english");
        assertTrue(s.getLanguage().equals("english"));
    }

    @org.junit.jupiter.api.Test
    void setMajor() {
        Student s = new Student();
        s.setMajor("comp sci");
        assertTrue(s.getMajor().equals("comp sci"));
    }

    @org.junit.jupiter.api.Test
    void addMatches() {
        Student s = new Student();
        Student d = new Student();
        d.setId(46);
        s.addMatches(d);
        assertTrue(s.getMatches().contains(d));
    }

    @org.junit.jupiter.api.Test
    void removeMatches() {
        Student s  = new Student();
        Student d = new Student();
        d.setId(46);
        s.addMatches(d);
        assertTrue(s.getMatches().contains(d));
        s.removeMatches(d);
        assertFalse(s.getMatches().contains(d));
    }

}