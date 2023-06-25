package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPageClass;
import elementRepository.LoginPageClass;
import retryAnalyzer.RetryAnalyzer;

public class ExecuteDashBoardPageClass extends BaseClass{
	
	DashboardPageClass dp;
	LoginPageClass lp;
	
	
	
  @Test
  public void f() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	
  }
  
  @Test(groups = {"group1"},retryAnalyzer = RetryAnalyzer.class)
  public void verify_Welcome_Msg_Is_Displayed_Or_Not() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	  Boolean actual_Result=dp.isdashboardDisplyMsgDisplayed();
	  System.out.println(actual_Result);
	  Assert.assertTrue(actual_Result);
	  
	  
  }
  @Test(groups = {"group1"},retryAnalyzer = RetryAnalyzer.class)
  public void verify_Client_Tab_Is_Displayed_Or_Not() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	  Boolean actual_Result=dp.isClientTabDisplayed();
	  Assert.assertTrue(actual_Result);
	  
  }
  
  @Test(groups = {"group1"},retryAnalyzer = RetryAnalyzer.class)
  public void verify_Workers_Tab_Is_Displayed_Or_Not() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	  Boolean actual_Result=dp.isWorkersTabDisplayed();
	  Assert.assertTrue(actual_Result);
	  
  }
  
  @Test(groups = {"group2"},retryAnalyzer = RetryAnalyzer.class)
  public void verify_The_Logo_Is_Displayed_Or_Not() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	  Boolean actual_Result=dp.isLogoDisplayed();
	  Assert.assertTrue(actual_Result);
	  
  }
  
  @Test(groups = {"group2"},retryAnalyzer = RetryAnalyzer.class)
  public void verify_Deduction_Tab_Is_Displayed_Or_Not() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	  Boolean actual_Result=dp.isDeductionTabDisplayed();
	  Assert.assertTrue(actual_Result);
	  
  }
  
  
}
