package test.testcases;

import org.openqa.selenium.By;

public class LLSlotbooking extends UserLibrary {

public static void TC05_LLSlotBooking()  {
		
			try {
				boolean status;
				enableHighlight();
				enableTakingScreenshots();
								
		plog="  Url opened";
		flog="Not opened Url";
		OpenUrl("https://s4testing.nic.in/sarathiservice/sarathiHomePublic.do");
				
		plog="  Click on Appointments";
		flog="Not Clicked On Appointments";
		ClickElement(".//*[@id='cssmenu']/ul/li[3]/a/span[1]");
		
		plog="click on Learner Licence Test";
		flog="Not clicked on Learner Licence Test";
		ClickElement(".//*[@id='cssmenu']/ul/li[3]/ul/li[1]/a");
		
		plog="select SarathiService button";
		flog="Not selected SarathiService button";
		ClickElement(".//*[@id='llslotipform_subtype1']");
		
		plog="enter application number";
		flog="Not entered application number";
		ClickElement(".//*[@id='applno1']");
		SetText(".//*[@id='applno1']", getData("ApplicationNumber"));    
		
		plog="enter Date Of Birth";
		flog="Not entered Date Of Birth";
		ClickElement(".//*[@id='dob']");
		SetText(".//*[@id='dob']", getData("DOB"));
		wait(10);
		
//		//ClickElement("//input[@id='captchaImg']");
//		String captchaValue = driver.findElement(By.id("//input[@id='captchaImg']")).getText(); 
//		//Thread.sleep(5000);//this will read the captcha
//        System.out.println(captchaValue);
//        SetText(".//*[@id='captcha']", captchaValue);
		
		plog="  Clicked on submit button";
		flog="Not Clicked On submit button";
		ClickElement(".//*[@id='llslotipform_   SAVE   ']");
		
		plog="  Clicked on Proceed to book button";
		flog="Not Clicked On proceed to book button";
		ClickElement(".//*[@id='dispappldetform_PROCEEDTOBOOK']");
		
		plog="  Clicked on Date";
		flog="Not Clicked On Date";
		ClickElement(".//*[@id='calview']/div[2]/table/tbody/tr[7]/td[4]/a");
		
		plog="  Click on Available seats";
		flog="Not Clicked On Availble seats";
		ClickElement(".//*[@id='10.00AM-11.00AM5']");
		
		plog="  Clicked on BookSlot Button";
		flog="Not Clicked On BookSlot Button";
		ClickElement(".//*[@id='slotbtn']");
		
		plog="  Click on Confirm To Slot book button";
		flog="Not Clicked On Confirm to slot book button";
		ClickElement(".//*[@id='slotcnfrmbtn']");
   
	} catch (Exception e) {
	// TODO: handle exception
}
		
	}
}





