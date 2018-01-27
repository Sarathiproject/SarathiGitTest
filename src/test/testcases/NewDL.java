package test.testcases;

import org.openqa.selenium.Alert;

public class NewDL extends UserLibrary {

	public static void TC04_NewDL() {
		// TODO Auto-generated method stub
		
		try {
			boolean status;
//			enableHighlight();
//			enableTakingScreenshots();
			
			plog="  Url opened";
			flog="Not opened Url";
			OpenUrl("https://s4testing.nic.in/sarathiservice/sarathiHomePublic.do");
			
			plog="clicked on Apply Online Button";
			flog="Not Clicked On Apply Online Button";
			ClickElement(".//*[@id='cssmenu']/ul/li[1]/a/span[1]");
			
			plog="clicked on New Driving Licence Button";
			flog="Not clicked on New Driving Licence Button";
			ClickElement(".//*[@id='cssmenu']/ul/li[1]/ul/li[2]/a");
			
			plog="clicked on Continue Button";
			flog="not clicked on continue Button";
			ClickElement(".//*[@id='bdheight']/div/div/div[2]/div[1]/div/div[3]/input[1]");
			
			plog="Entered LLicence Number";
			flog="Not Entered LLicence Number";
			SetText(".//*[@id='learningLicence']", getData("LicenceNumber"));
			
			plog="Entered Date Of Birth";
			flog="Not Entered Date Of Birth";
			SetText(".//*[@id='DOB']", getData("DOB"));
			
			plog="Clicked On Ok Button";
			flog="Not Clicked On Ok Button";
			ClickElement(".//*[@id='ok']");
			
			plog="Entered Mobile Number";
			flog="Not Entered Mobile Number";
			SetText(".//*[@id='mobileNumber']", getData("MobileNumber"));
			
			plog="Clicked On Select All Button";
			flog="Not Clicked On Select All Button";
			ClickElement(".//*[@id='selectAll']");
			wait(7);
			plog="Clicked On Submit Button";
			flog="Not Clicked On Submit Button";
			ClickElement(".//*[@id='sub']");
			
			// Switching to Alert        
	        Alert alert = driver.switchTo().alert();		
	        	        		
	        // Accepting alert		
	        alert.accept();	
	        wait(5);
	        
	        SetText(".//*[@id='divToPrint']/div[1]/div[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/b", getData(""));
	        System.out.println("Application Number");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
		}
	}
}
