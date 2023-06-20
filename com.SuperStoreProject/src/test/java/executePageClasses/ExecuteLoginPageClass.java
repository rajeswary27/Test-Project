package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPageClass;

public class ExecuteLoginPageClass extends BaseClass {
	
LoginPageClass lp;

  @Test
  public void verify_The_Correct_Page_Is_Open_While_Hitting_The_Url() {
	  
	lp=new LoginPageClass(driver);
	String actual_Result = lp.getUrl();
	String expected_Result = "https://qabible.in/payrollapp/site/login";
	Assert.assertEquals(actual_Result, expected_Result);
	
  }
  
  @Test(dataProviderClass = DataProviderLogin.class,dataProvider = "DataProvider2")
  public void verify_Successfull_Login(String name,String pw ) {
	  
	  lp=new LoginPageClass(driver);
	  lp.login( name,pw);
	  Boolean actual_Result = lp.isCarolThomasDisplayed();
	  Assert.assertTrue(actual_Result);
	  
  }
  
  @Test(dataProviderClass = DataProviderLogin.class,dataProvider = "DataProvider1")
  public void verify_UnSuccessful_Login(String name,String pw ) {
	  
	  lp=new LoginPageClass(driver);
	  lp.login(name, pw);
	  String actual_Result = lp.getTextOfIncorectMsg();
	  String expected_Result = "Incorrect username or password.";
	  Assert.assertEquals(actual_Result, expected_Result);
	 
      	  
  }
  
 
}
