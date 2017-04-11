
import org.fest.swing.core.EmergencyAbortListener;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.TransactionReport;

public class TransactionReportTest {

	
	private static EmergencyAbortListener mEmergencyAbortListener;
    private FrameFixture mFrame;

    public TransactionReportTest(){
    }


    @Before
    public void setUp(){
        mFrame = new FrameFixture(new TransactionReport());
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
    	mFrame.button("jButton1").requireEnabled();
    	mFrame.scrollPane("jScrollPane1").requireEnabled();
    	
    	mFrame.table("jTable1").requireVisible();
    	
    	mFrame.label("jLabel1").requireText("P2P Library - Transcation Report");
    	
    	
    	//Test for jpasswordfield using junit
    	
  
    }
}
