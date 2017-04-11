

import org.fest.swing.core.EmergencyAbortListener;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.SearchMember;

public class SearchMemberTest {

	
	private static EmergencyAbortListener mEmergencyAbortListener;
    private FrameFixture mFrame;

    public SearchMemberTest(){
    }


    @Before
    public void setUp(){
        mFrame = new FrameFixture(new SearchMember());
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
    	
    	mFrame.textBox("TxtMemID").requireEnabled();
    	mFrame.textBox("TxtName").requireEnabled();
    	mFrame.textBox("TxtMobile").requireEnabled();
    	
    	mFrame.table("jTable1").requireVisible();
    	mFrame.label("jLabel2").requireText("Searh by Member ID:");
    	mFrame.label("jLabel3").requireText("Name:");
    	mFrame.label("jLabel1").requireText("P2P Library - Search Member");
    	mFrame.label("jLabel4").requireText("Mobile:");
    	
    	//Test for jpasswordfield using junit
    	
  
    }
}
