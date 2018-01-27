package test.testcases;

public class SlotbookingLlapplicationstatus extends UserLibrary {

	public static void TC06_SlotBookingLL() {
		// TODO Auto-generated method stub
		
		try {
			boolean status;
			enableHighlight();
			enableTakingScreenshots();
							
			plog="  Url opened";
			flog="Not opened Url";
			OpenUrl("https://s4testing.nic.in/sarathiservice/sarathiHomePublic.do");
			
			plog="  Clicked on Apply Online";
			flog="Not Clicked On Apply Online";
			ClickElement(".//*[@id='cssmenu']/ul/li[1]/a/span[1]");
					
			plog="  Clicked on Application status";
			flog="Not Clicked On Applcation status";
			ClickElement(".//*[@id='cssmenu']/ul/li[1]/ul/li[8]/a");
			
			plog=" Entered Application Number";
			flog="Not Entered  Applcation Number";
			SetText(".//*[@id='applNum']", getData("ApplicationNumber"));
			
			plog="  Entered DOB";
			flog="Not ENtered DOB";
			SetText(".//*[@id='dateOfBirth']", getData("DOB"));
			
			plog="  Clicked on submit button";
			flog="Not Clicked On submit button";
			ClickElement(".//*[@id='submit']");
			
			plog="  Click on LL slot book button";
			flog="Not Clicked On LL slot book button";
			ClickElement(".//*[@id='crd5']");
			
			plog="  Clicked on Proceed button";
			flog="Not Clicked On Proceed button";
			ClickElement(".//*[@id='applViewStages_0']");
			
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
