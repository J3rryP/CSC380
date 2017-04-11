

import org.fest.swing.core.EmergencyAbortListener;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Login;
import main.ReceiveBook;

public class ReceiveBookTest {
	
	private static EmergencyAbortListener mEmergencyAbortListener;
    private FrameFixture mFrame;

    public ReceiveBookTest(){
    }


    @Before
    public void setUp(){
        mFrame = new FrameFixture(new ReceiveBook());
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
    	mFrame.button("CmdMemberDetails").requireEnabled();
    	mFrame.button("CmdReceiveBook").requireVisible();
    	mFrame.button("CmdReset").requireEnabled();
    	
    	mFrame.textBox("TxtBookDetails").requireEnabled();
    	mFrame.textBox("TxtMemberID").requireEnabled();
    	mFrame.textBox("TxtMemberName").requireEnabled();
    	
    	mFrame.label("LblBookID").requireVisible();
    	mFrame.label("jLabel2").requireText("Name :");
    	mFrame.label("jLabel3").requireText("Member ID :");
    	mFrame.label("jLabel1").requireText("P2P Library - Receive Book");
    	mFrame.label("jLabel4").requireVisible();
    	
    	//Test for jpasswordfield using junit
    	
  
    }

}
