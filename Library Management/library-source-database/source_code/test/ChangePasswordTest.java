
import javax.swing.JPasswordField;

import org.fest.swing.core.EmergencyAbortListener;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.ChangePassword;

public class ChangePasswordTest {

	private static EmergencyAbortListener mEmergencyAbortListener;
    private FrameFixture mFrame;

    public ChangePasswordTest(){
    }


    @Before
    public void setUp(){
        mFrame = new FrameFixture(new ChangePassword());
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
    	mFrame.button("CmdOk").requireEnabled();
    	mFrame.label("jLabel1").requireText("P2P Library - Change Password");
    	mFrame.label("jLabel3").requireText("Old Password:");
    	mFrame.label("jLabel4").requireText("New Password:");
    	mFrame.label("jLabel5").requireText("Confirm Password:");
    	
    	//Test for jpasswordfield using junit
    	
  
    }
	
}
