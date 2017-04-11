

import org.fest.swing.core.EmergencyAbortListener;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.MainForm;

public class MainFormTest {


	private static EmergencyAbortListener mEmergencyAbortListener;
    private FrameFixture mFrame;

    public MainFormTest(){
    }


    @Before
    public void setUp(){
        mFrame = new FrameFixture(new MainForm());
        mFrame.show();
    }

    
    @After
    public void tearDown(){
       if(mFrame != null)
    	mFrame.cleanUp();
    }

    @Test
    public void shouldEnterAnagramAndReturnTrue() {
    	//mFrame.button("CmdClose").requireEnabled();
    	//mFrame.button("CmdOk").requireEnabled();
    	
    	mFrame.menuItem("jMenuItem1").requireEnabled();
    	mFrame.menuItem("jMenuItem2").requireEnabled();
    	mFrame.menuItem("jMenuItem3").requireEnabled();
    	mFrame.menuItem("jMenuItem4").requireEnabled();
    	mFrame.menuItem("jMenuItem5").requireEnabled();
    	mFrame.menuItem("jMenuItem6").requireEnabled();
    	mFrame.menuItem("jMenuItem7").requireEnabled();
    	mFrame.menuItem("jMenuItem8").requireEnabled();
    	mFrame.menuItem("MnuBookMaster").requireEnabled();
    	mFrame.menuItem("MnuBookStatus").requireEnabled();
    	mFrame.menuItem("MnuExits").requireEnabled();
    	mFrame.menuItem("MnuSearchBook").requireEnabled();
    	
    	mFrame.label("jLabel1").requireText("Welcome to P2P Library System");
    	mFrame.label("jLabel2").requireText("[Java + MySQL]");
    	mFrame.panel("jPanel1").requireVisible();
    	
    	//Test for jpasswordfield using junit
    	
  
    }
}
