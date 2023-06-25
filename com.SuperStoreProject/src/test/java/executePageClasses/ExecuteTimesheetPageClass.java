package executePageClasses;

import java.awt.AWTException;

import org.testng.annotations.Test;

import elementRepository.DashboardPageClass;
import elementRepository.LoginPageClass;
import elementRepository.TimesheetPageClass;

public class ExecuteTimesheetPageClass extends BaseClass{
	LoginPageClass lp;
	DashboardPageClass dp;
	TimesheetPageClass tp;
	
  @Test
  public void VerifyToCreateANewTimesheet() throws AWTException {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  tp=new TimesheetPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	  dp.clickOnTimeSheetTab();
	  tp.clickOnCreateTimeSheet();
	  tp.clickOnBrowse();
	  
	  tp.uploadAnImage(System.getProperty("user.dir")+"\\src\\test\\resources\\sample.jpg");
	  
  }
}