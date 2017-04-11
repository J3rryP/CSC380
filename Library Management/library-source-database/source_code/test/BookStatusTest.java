

import org.fest.swing.core.EmergencyAbortListener;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.BookStatus;

public class BookStatusTest {

	
	private static EmergencyAbortListener mEmergencyAbortListener;
    private FrameFixture mFrame;

    public BookStatusTest(){
    }


    @Before
    public void setUp(){
        mFrame = new FrameFixture(new BookStatus());
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
    	mFrame.label("jLabel1").requireText("P2P Library - Book Status");
    	mFrame.scrollPane("jScrollPane1").requireEnabled();
    	mFrame.table("jTable1").requireColumnCount(4);
    	mFrame.table("jTable1").requireVisible();
    }
}
