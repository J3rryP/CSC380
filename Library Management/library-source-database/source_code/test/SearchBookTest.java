

import org.fest.swing.core.EmergencyAbortListener;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.SearchBook;

public class SearchBookTest {
	private static EmergencyAbortListener mEmergencyAbortListener;
    private FrameFixture mFrame;

    public SearchBookTest(){
    }


    @Before
    public void setUp(){
        mFrame = new FrameFixture(new SearchBook());
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
    	
    	mFrame.textBox("TxtBookID").requireEnabled();
    	mFrame.textBox("TxtKeyword").requireEnabled();
    	mFrame.textBox("TxtTitle").requireEnabled();
    	
    	mFrame.table("jTable1").requireVisible();
    	mFrame.label("jLabel2").requireText("Searh by Book ID:");
    	mFrame.label("jLabel3").requireText("Title:");
    	mFrame.label("jLabel1").requireText("P2P Library - Search Book");
    	mFrame.label("jLabel4").requireText("Keyword :");
    	
    	//Test for jpasswordfield using junit
    	
  
    }
}
