
import org.fest.swing.core.EmergencyAbortListener;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import main.Login;

public class LoginTest {

	
	private static EmergencyAbortListener mEmergencyAbortListener;
    private FrameFixture mFrame;

    public LoginTest(){
    }


    @Before
    public void setUp(){
        mFrame = new FrameFixture(new Login());
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
    	
    	mFrame.textBox("TxtUserName").requireEnabled();
    	
    	mFrame.label("jLabel1").requireText("P2P JAVA Library Managemnet System");
    	mFrame.label("jLabel2").requireText("User Name:");
    	mFrame.label("jLabel3").requireText("Password:");
    	mFrame.panel("jPanel1").requireVisible();
    	
    	//Test for jpasswordfield using junit
    	
  
    }
}
