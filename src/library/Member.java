package library;

/**
 * Created by davidkyere & jerrypisagih on 6/5/17.
 */
public class Member {
    String id;
    String name;
    String address;
    String email;
    String mobile_no;
    String status;


    public Member(String id , String name , String address , String email , String mobile_no , String status){
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.mobile_no = mobile_no;
        this.status = status;
    }

    public Member(){

    }

    public String getStatus() {
        return status;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + address + " " + email + " " + mobile_no + " " + status;
    }
}
