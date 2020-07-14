package testcases;

import org.testng.annotations.Test;

import base.BaseTestClass;
import pom.CabResult;
import pom.HomePage;
import utilities.Excelutil_POI;


public class CabSearchTestCase extends BaseTestClass {
	
	HomePage homepage;
	CabResult cabresult;
	
	
	@Test
	public void findingCabs() throws Exception {

		Excelutil_POI.setExcelFile("C:\\Users\\Piyush\\eclipse-workspace\\Makemytrip\\TestData\\MakeMyTrip.xlsx","Sheet1");

		invokeBrowser("chrome");
		homepage = openWebsite();
        homepage.selectCab() ;
		homepage.selectOneway();
		homepage.enterOrigin(Excelutil_POI.getCellData(1, 0));
		homepage.enterDestination(Excelutil_POI.getCellData(1, 1));
		homepage.dateSelect();
		homepage.timeSelect();
		homepage.clickbut();
//		homepage.Nextone();
		    homepage.suvkbut();
		    homepage.contactDet();;
		    homepage.contacttitle();
		    homepage.entername(Excelutil_POI.getCellData(1, 2));
		    homepage.entermobile(Excelutil_POI.getCellData(1,3));
		    homepage.enteremail(Excelutil_POI.getCellData(1, 4));
		    homepage.continueagain12();
		    homepage.Paynow();
   
	    
	}
}
	    
	    
	    
	  
	  

	    
//		homepage.Pswdfield();
		
		
	



//homepage.LoginBut();
//homepage.fbBut();
//homepage.Emailfield(Excelutil_POI.getCellData(1, 0));
//homepage.Login();