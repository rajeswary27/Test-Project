package executePageClasses;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.ClientPageClass;
import elementRepository.DashboardPageClass;
import elementRepository.LoginPageClass;


public class ExecuteClientPageClass extends BaseClass{
	
	   LoginPageClass lp;
	   DashboardPageClass dp;
	   ClientPageClass cp;
  
  
  @Test
  public void verify_To_Create_New_Client() throws IOException {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  cp=new ClientPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	  dp.clickOnClientTab();
	  cp.clickOnCreateClientTab();
	  cp.selectValueFromBranch(1);
	  cp.selectValueFromInvoiceOrder(1);
	  cp.selectValueFromDivision(1);
	  cp.typeIntoInvoiceContact(cp.readInvoiceContact(1, 1));
	  cp.selectValueFromInvoiceDelivery(1);
	  cp.typeIntoInvoiceClientName(cp.readClientName(0, 1));
	  cp.typeIntoPhoneNumber(cp.readPhoneNumber(2,1));
	  cp.selectValueMasterDocument(1);
	  cp.typeIntoClientAddress(cp.readClientAddress(3, 1));
	  cp.typeIntoSettelmentDays(cp.readSettelmentDays(4, 1));
	  cp.typeIntoPostCode(cp.readPostCode(6, 1));
	  cp.typeIntoEmail(cp.readEmail(5, 1));
	  cp.typeIntoCompanyReg(cp.readCompanyReg(7, 1));
	  cp.selectVatRate(2);
	  cp.clickOnSaveButton();
	  
	  Boolean actual_Result=cp.isCreatedClientNameDispalyed();
	  Assert.assertTrue(actual_Result);
	  
  }
  
  @Test
  public void verify_Client_Search_Functionality() throws IOException {
	  
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  cp=new ClientPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	  dp.clickOnClientTab();
	  cp.typeIntoserachBoxClientName(cp.readClientName(0, 1));
	  cp.clickSearch();
	  
	  Boolean actual_Result=cp.isSearchClientNameDisplayed();
	  Assert.assertTrue(actual_Result);
	  
	  
	  
	  
	  
	  
}
}
