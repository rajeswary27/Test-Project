package executePageClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPageClass;
import elementRepository.LoginPageClass;
import elementRepository.WorkersPageClass;

public class ExecuteWorkersPageClass extends BaseClass {
	
	   LoginPageClass lp;
	   DashboardPageClass dp;
	   WorkersPageClass wp;
	   
	   
	 @Test(priority=0)
	 public void verify_To_Create_New_Worker() throws IOException {
		 
		  lp=new LoginPageClass(driver);
		  dp=new DashboardPageClass(driver);
		  wp=new WorkersPageClass(driver);
		  lp.login("carol", "1q2w3e4r");
		  dp.clickOnWorkersTab();
		  wp.clickOnCreateWorkersTab();
		  wp.selectValueFromGender(0);
		  wp.selectValueFromBranch(1);
		  wp.selectValueFromDivision(1);
		  wp.typeIntoFirstName(wp.readFirstName(10, 1));
		  wp.typeIntoLastName(wp.readLastName(11, 1));
		  wp.typeIntoDateOfBirth(wp.readDOB(17, 1));
		  wp.selectValueFromEmploymentType(1);
		  wp.selectValueFromPayslipMethod(1);
		  wp.typeIntoAddress(wp.readAddress(12, 1));
		  wp.typeIntoPhone(wp.readPhone(13, 1));
		  wp.typeIntoPostCode(wp.readPostcode(15, 1));
		  wp.typeIntoNiNumber(wp.readNiNumber(16, 1));
		  wp.typeIntoEmail(wp.readEmail(14, 1));
		  wp.clickOnNextButton();
		  wp.selectValueFromPaymentMethod(0);
		  wp.typeIntoStartDate(wp.readStartDate(18, 1));
		  wp.typeIntoAccoutName(wp.readAccountName(19, 1));
		  wp.typeIntoAccountNumber(wp.readAccountNumber(20, 1));
		  wp.typeIntoSortCode(wp.readSortCode(21, 1));
		  wp.clickOnSaveButton();
		  
		  String actual_Result = wp.getTextCreatedWorkerName();
		  String expected_Result ="WORKER BANK DETAILS: DEVI DAS";
		  Assert.assertEquals(actual_Result, expected_Result);
}
	 
	 @Test(priority=1)
	 public void verify_To_Search_A_Worker()   {
		  
		  lp=new LoginPageClass(driver);
		  dp=new DashboardPageClass(driver);
		  wp=new WorkersPageClass(driver);
		  lp.login("carol", "1q2w3e4r");
		  dp.clickOnWorkersTab();
		  wp.typeIntoserachBoxWorkersFirstName("Devi");
		  wp.typeIntoserachBoxWorkersLastName("Das");
		  wp.clickSearchButton();
		  
		  Boolean actual_Result=wp.isSearchWorkerNameDisplayed();
		  Assert.assertTrue(actual_Result);
		  
}
	 
	 @Test(priority=2)
	 public void verify_To_Delete_A_Worker() {
		 
		 lp=new LoginPageClass(driver);
		  dp=new DashboardPageClass(driver);
		  wp=new WorkersPageClass(driver);
		  lp.login("carol", "1q2w3e4r");
		  dp.clickOnWorkersTab();
		  wp.typeIntoserachBoxWorkersFirstName("Devi");
		  wp.typeIntoserachBoxWorkersLastName("Das");
		  wp.clickSearchButton();
		  wp.clickDeleteButton();
		  wp.acceptAlert();
		  
		  Boolean actual_Result=wp.isDisplayedNoResultFound();
		  Assert.assertTrue(actual_Result);
		 
	 }
}
