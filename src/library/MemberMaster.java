package library;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by davidkyere & jerrypisagih on 6/5/17.
 */
public class MemberMaster {

    private static final String memberFile  = "member.txt";

    public MemberMaster(){

    }

    public void addMember(Member s) throws IOException {
        DBManager.write(s.toString(),memberFile);
    }

    public void editMember(Member om , Member nm) throws IOException {
        ArrayList<String> allbooks = DBManager.readAll(memberFile);
        System.out.println("size is "+ allbooks.size());
        int found = allbooks.indexOf(om.toString());
        allbooks.remove(found);
        allbooks.add(nm.toString());
        DBManager.writeAll(allbooks,memberFile);
    }

    public ArrayList<Member> getAllMembers(){
        return null;
    }

    public Member getMember(){
        return null;
    }

    public void getMemberStatus(){

    }

    public void setMemberStatus(){

    }


}
