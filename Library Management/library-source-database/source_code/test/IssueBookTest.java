

import org.fest.swing.core.EmergencyAbortListener;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.timing.Timeout;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import main.IssueBook;

public class IssueBookTest {

	
	private static EmergencyAbortListener mEmergencyAbortListener;
    private FrameFixture mFrame;

    public IssueBookTest(){
    }


    @Before
    public void setUp(){
        mFrame = new FrameFixture(new IssueBook());
        mFrame.show();
    }

    
    @After
    public void tearDown(){
       if(mFrame != null)
    	mFrame.cleanUp();
    }

    @Test
    public void shouldEnterAnagramAndReturnTrue() {
    	mFrame.button("CmdClose").requireEnabled();
    	mFrame.button("CmdBookDetails").requireVisible();
    	mFrame.button("CmdIssueBook").requireVisible();
    	mFrame.button("CmdMemberDetails").requireEnabled();
    	mFrame.button("CmdReset").requireEnabled();
    	mFrame.textBox("TxtBookID").requireEnabled();
    	mFrame.textBox("TxtBookStatus").requireEnabled();
    	mFrame.textBox("TxtBookTitle").requireEnabled();
    	mFrame.textBox("TxtMemberStatus").requireEnabled();
    	mFrame.textBox("TxtMemberID").requireEnabled();
    	mFrame.textBox("TxtMemberName").requireEnabled();
    	mFrame.label("jLabel1").requireText("P2P Library - Issue Book");
    	mFrame.label("jLabel2").requireText("Name :");
    	mFrame.label("jLabel3").requireText("Member ID :");
    	mFrame.label("jLabel4").requireText("Book ID :");
    	mFrame.label("jLabel5").requireText("Title :");
    	//Test for jpasswordfield using junit
    	
  
    }
}
