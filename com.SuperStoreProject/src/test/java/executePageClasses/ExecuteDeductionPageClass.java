package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPageClass;
import elementRepository.DeductionPageClass;
import elementRepository.LoginPageClass;
import retryAnalyzer.RetryAnalyzer;

public class ExecuteDeductionPageClass extends BaseClass{
	
	   LoginPageClass lp;
	   DashboardPageClass dp;
	   DeductionPageClass dd;
  
	   @Test(retryAnalyzer = RetryAnalyzer.class)
	   public void verify_The_Page_Deduction_Is_Open_While_Clicking_On_Deductions_Tab_Or_Not() {
		   
		      lp=new LoginPageClass(driver);
			  dp=new DashboardPageClass(driver);
			  dd=new DeductionPageClass(driver);
			  lp.login("carol", "1q2w3e4r");
			  dp.clickOnDeductionTab();
			  Boolean actual_Result=dp.isDeductionTabDisplayed();
			  Assert.assertTrue(actual_Result);
			  
			  
	   }
	   
	   @Test(retryAnalyzer = RetryAnalyzer.class)
	   public void verify_To_Add_A_New_Deduction() {
		   
		      lp=new LoginPageClass(driver);
			  dp=new DashboardPageClass(driver);
			  dd=new DeductionPageClass(driver);
			  lp.login("carol", "1q2w3e4r");
			  dp.clickOnDeductionTab();
			  dd.clickOnAddDeductionTab();
			  dd.selectValueFromWorker("Riya");
			  dd.selectValueFromTextBox();
			  dd.selectValueFromType(1);
			  dd.typeIntoAmount("3000");
			  dd.typeIntoEffectiveFrom("13-06-2023");
			  dd.clickSaveButton();
			  Boolean actual_Result=dd.isCreatedNameDispalyed();
			  Assert.assertTrue(actual_Result);
			  
			  
		   
	   }
}
