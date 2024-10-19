package campaignModule;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToCreateCampaignTest {
	@Test(groups = "SmokeTest")
	public void createCampaign()
	{
		
		Reporter.log("Campaign creted successfully",true);
		Reporter.log("Done",true);
		String BROWSER=System.getProperty("Browser");
		String URL=System.getProperty("Url");
		String USERNAME=System.getProperty("Username");
		String PWD=System.getProperty("Password");
		System.out.println("Brower is"+BROWSER);
		System.out.println("URL is"+URL);
		System.out.println("Username is"+USERNAME);
		System.out.println("Password is"+PWD);
		
	}
	

}
