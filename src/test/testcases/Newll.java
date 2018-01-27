package test.testcases;

import java.util.concurrent.TimeUnit;

import org.jboss.netty.util.Timeout;
import org.openqa.selenium.Alert;

public class Newll extends UserLibrary{

	public static void TC03_sarathi()    {
		
		// TODO Auto-generated method stub
		
		try {
			boolean status;
//			enableTakingScreenshots();
			enableHighlight();

			plog="  Url opened";
			flog="Not opened Url";
			OpenUrl(getData("URL"));
			//			OpenUrl("https://s4testing.nic.in/sarathiservice/sarathiHomePublic.do");
//		ClickElement(".//*[@id='cssmenu']/ul/li[2]/a");
			
			plog="clicked on Apply Online Button";
			flog="Not Clicked On Apply Online Button";
			ClickElement(".//*[@id='cssmenu']/ul/li[1]/a/span[1]");
			
			plog="clicked on New Learner Licence Button";
			flog="Not click on New Learner Licence Button";
			ClickElement(".//*[@id='cssmenu']/ul/li[1]/ul/li[1]/a");
			
			plog="clicked on Continue Button";
			flog="not clicked on continue Button";
			ClickElement(".//*[@id='bdheight']/div/div/div[2]/div[1]/div/div[3]/input[1]");
			
			plog="clicked on Submit Button";
			flog="not clicked on Submit Button";
			ClickElement(".//*[@id='submitOfNewLL']");
			
			plog="selected the state from dropdown list";
			flog="not selected state from drop down list";
			ClickElement(".//*[@id='licenceFromState']");
//			SetImplicitWait(3000);

			plog="selected the state value from dropdown list";
			flog="not selected state value from drop down list";
			ClickElement(".//*[@value='RJ']");
//			SelectOPtionByValue(".//*[@id='licenceFromState']", "RJ");
			
			plog="selected the RTO from dropdown list";
			flog="not selected RTO from drop down list";
			ClickElement(".//*[@id='licenceFromRTO']");
			
			plog="selected the RTO value from dropdown list";
			flog="not selected RTO value from drop down list";
			ClickElement(".//*[@value='RJ10']");
//			SelectOPtionByValue(".//*[@id='licenceFromRTO']", "RJ10");
			
			plog="Entered firstname";
			flog="Not Entered firstname";
//			SetTextAndEscape(".//*[@id='fname']", getData("FirstName"));
			SetText(".//*[@id='fname']", getData("FirstName"));	
			
			plog="Entered lastname";
			flog="Not Entered lastname";
			SetText(".//*[@id='lname']", getData("LastName"));
			
			plog="clicked on relationtype button";
			flog="Not clicked on relationtype button";
//			SetText(".//*[@id='relationType']", getData("RelationType"));
			ClickElement(".//*[@id='relationType']");
			
			plog="selected relation type";
			flog="not selected relation type";
			ClickElement(".//*[@value='F']");
			
			plog="Entered fathername";
			flog="Not entered fathername";
			SetText(".//*[@id='swdfName']", getData("FatherName"));
			
			plog="checked gender";
			flog="Not checked gender";
			ClickElement(".//*[@id='gender2']");
			
			plog="Entered DateOfBirth";
			flog="Not Entered DateOfBirth";
			SetText(".//*[@id='dateOfBirth']", getData("DOB"));
			
			plog="Selected countryname";
			flog="Not selected countryname";
			ClickElement(".//*[@id='countryOfBirth']");
			
			plog="Selected value of countryname";
			flog="Not selected value of countryname";
			ClickElement(".//*[@value='IND']");
			
			plog="Selected Qualification";
			flog="Not selected Qualification";
			ClickElement(".//*[@id='eduQual']");
						
			plog="Selected value of  Qualification";
			flog="Not selected value of Qualification";
			ClickElement(".//*[@value='8']");
			
			plog="Selected bloodgroup";
			flog="Not selected bloodgroup";
			ClickElement(".//*[@id='bloodGroup']");
			
			plog="Selected value of bloodgroup";
			flog="Not selected value of bloodgroup";
			ClickElement(".//*[@value='O+']");
			
			plog="Entered Mobile Number";
			flog="Not Entered Mobile Number";
			SetText(".//*[@id='mobileNumber']", getData("MobileNumber"));
			
			plog="Selected District Name";
			flog="Not selected District Name";
			ClickElement(".//*[@id='presDistrict']");
			
			plog="Selected value of District Name";
			flog="Not selected value of District Name";
			ClickElement(".//*[@id='presDistrict']/option[12]");
			
			plog="Selected Tahsil Name";
			flog="Not selected Tahsil Name";
			ClickElement(".//*[@id='presSubDistrict']");
			
			plog="Selected value of Tahsil Name";
			flog="Not selected value of Tahsil Name";
			ClickElement(".//*[@value='485']");

			plog="Entered Pincode";
			flog="Not Entered Pincode";
			SetText(".//*[@id='presPinCode']", getData("PinCode"));
			
			plog="Selected checkbox of copy to permanent address";
			flog="Not Selected checkbox of copy to permanent address";
			ClickElement(".//*[@id='presSameAsPerm']");
			
			plog="Selected Covlist";
			flog="Not selected Covlist";
			ClickElement(".//*[@id='covsList']/option[1]");
			ClickElement(".//*[@id='newLLApplForm_0']");
			ClickElement(".//*[@id='covsList']/option[3]");
			ClickElement(".//*[@id='newLLApplForm_0']");
			
			plog="Clicked on submit button";
			flog="Not Clicked on submit button";
			ClickElement(".//*[@id='submitButton']");
			
	        Alert alert = driver.switchTo().alert();		

	        alert.accept();	

		}
		catch (Exception e) {
			
			System.out.println("Error message "+e);
		}
	}

}
