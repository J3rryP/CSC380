


import org.fest.swing.core.EmergencyAbortListener;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.BookMaster;


public class BookMasterTest {
	
	private static EmergencyAbortListener mEmergencyAbortListener;
    private FrameFixture mFrame;

    public BookMasterTest(){
    }


    @Before
    public void setUp(){
        mFrame = new FrameFixture(new BookMaster());
        mFrame.show();
    }

    
    @After
    public void tearDown(){
       if(mFrame != null)
    	mFrame.cleanUp();
    }

    @Test
    public void shouldEnterAnagramAndReturnTrue() {
    	mFrame.comboBox("CmbCategory").requireItemCount(3);
    	mFrame.comboBox("CmbCategory").requireSelection(1);
        mFrame.button("CmdClose").requireEnabled();
        mFrame.button("CmdFirst").requireEnabled();
        mFrame.button("CmdNew").requireEnabled();
        mFrame.button("CmdSave").requireEnabled();
        mFrame.button("CmdLast").requireEnabled();
        mFrame.button("CmdNext").requireEnabled();
        mFrame.button("CmdPrevious").requireEnabled();
        mFrame.button("CmdEdit").requireEnabled();
        mFrame.label("LblPosition").requireEnabled();
        mFrame.textBox("TxtYear").requireEnabled();
        mFrame.textBox("TxtPublisher").requireEnabled();
        mFrame.textBox("TxtKeywords").requireEnabled();
        mFrame.textBox("TxtBookTitle").requireEnabled();
        mFrame.textBox("TxtBookID").requireEnabled();
        mFrame.textBox("TxtBookID").requireNotEditable();
        mFrame.textBox("TxtAuthor").requireEnabled();
        mFrame.label("jLabel1").requireText("P2P Library - Book Master");
        mFrame.label("jLabel2").requireText("Book ID:");
        mFrame.label("jLabel3").requireText("Book Title:");
        mFrame.label("jLabel4").requireText("Author:");
        mFrame.label("jLabel5").requireText("Publisher:");
        mFrame.label("jLabel6").requireText("Year Publish:");
        mFrame.label("jLabel7").requireText("Search Keyword:");
        mFrame.label("jLabel8").requireText("Category:");
        
    }
}
