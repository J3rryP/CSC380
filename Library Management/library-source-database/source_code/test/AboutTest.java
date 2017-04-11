
import static org.junit.Assert.*;

import org.fest.swing.core.EmergencyAbortListener;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.About;


public class AboutTest {

	private static EmergencyAbortListener mEmergencyAbortListener;
    private FrameFixture mFrame;

    public AboutTest(){
    }


    @Before
    public void setUp(){
        mFrame = new FrameFixture(new About());
        mFrame.show();
    }

    
    @After
    public void tearDown(){
       if(mFrame != null)
    	mFrame.cleanUp();
    }

    @Test
    public void shouldEnterAnagramAndReturnTrue() {
    	mFrame.label("jLabel1").requireText("P2P Library System");
        mFrame.label("jLabel2").requireText("[Java + MySQL]");
        mFrame.label("jLabel3").requireText("http://www.programmer2programmer.net");
        mFrame.label("jLabel4").requireText("ajprofessionals@gmail.com");
        
    }
    
}
