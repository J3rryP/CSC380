
import org.fest.swing.core.EmergencyAbortListener;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.UserMaster;

public class UserMasterTest {

	
	private static EmergencyAbortListener mEmergencyAbortListener;
    private FrameFixture mFrame;

    public UserMasterTest(){
    }


    @Before
    public void setUp(){
        mFrame = new FrameFixture(new UserMaster());
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
    	mFrame.button("CmdEdit").requireEnabled();
    	mFrame.button("CmdFirst").requireEnabled();
    	mFrame.button("CmdLast").requireEnabled();
    	mFrame.button("CmdNew").requireEnabled();
    	mFrame.button("CmdNext").requireEnabled();
    	mFrame.button("CmdPrevious").requireEnabled();
    	mFrame.button("CmdSave").requireEnabled();
    	mFrame.checkBox("ChkUserActive").requireEnabled();
    	mFrame.comboBox("CmbUserType").requireEnabled();
    	
    	mFrame.textBox("TxtUserName").requireEnabled();
    	mFrame.textBox("TxtPassword").requireEnabled();
    	
    	mFrame.label("LblPosition").requireVisible();
    	mFrame.label("jLabel1").requireText("P2P Library - User Master");
    	mFrame.label("jLabel3").requireText("User Name :");
    	mFrame.label("jLabel4").requireText("Password :");
    	mFrame.label("jLabel8").requireText("User Type :");
    	
    	//Test for jpasswordfield using junit
    	
  
    }
}
