package elementRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelRead;
import utility.ExplicitWait;
import utility.FluentWaitClass;
import utility.GeneralUtilities;

public class ClientPageClass {
	
	WebDriver driver;
	
	GeneralUtilities gl=new GeneralUtilities();
	ExplicitWait ewait=new ExplicitWait();
	FluentWaitClass fwait=new FluentWaitClass();
	
	public ClientPageClass(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[@href='/payrollapp/client/create']")
	WebElement createClient;

	@FindBy(xpath = "//input[@id='clientsearch-client_name']")
    WebElement serachBoxClientName;
	
	@FindBy(xpath = "//input[@id='clientsearch-id']")
	WebElement serachBoxclientId;
	
	@FindBy(xpath ="//button[contains(text(),'Search')]")
	WebElement searchButton;
	
	@FindBy(xpath ="//button[contains(text(),'Reset')]")
	WebElement resetButton;
	
	@FindBy(xpath = "//select[@id='client-branch_id']")
	WebElement branch;

	@FindBy(xpath ="//select[@id='client-invoice_order']")
    WebElement invoiceOrder;

	@FindBy(xpath ="//select[@id='client-division_id']")
	WebElement division;

	@FindBy(xpath ="//input[@id='client-invoice_contact']")
    WebElement invoiceContact;

	@FindBy(xpath ="//select[@id='client-invoice_delivery_method']")
    WebElement invoiceDeliveryMethod;
	
	@FindBy(xpath ="//input[@id='client-client_name']")
	WebElement clientName;
	
	@FindBy(xpath ="//input[@id='client-phone']")
	WebElement phone;

	@FindBy(xpath ="//select[@id='client-master_document']")
	WebElement masterDocument;

	@FindBy(xpath ="//textarea[@id='client-client_address']")
    WebElement clientAddress;

	@FindBy(xpath ="//input[@id='client-settilement_days']")
    WebElement settelmentDays;
	
	@FindBy(xpath ="//input[@id='client-email']")
	WebElement email;
	
	@FindBy(xpath ="//select[@id='client-vat_rate']")
	WebElement vatRate;
	
	@FindBy(xpath ="//input[@id='client-postcode']")
	WebElement postCode;
	
	@FindBy(xpath ="//input[@id='client-company_reg']")
	WebElement companyReg;

	@FindBy(xpath ="//button[contains(text(),'Save')]")
	WebElement save;
	
	@FindBy(xpath="//table//tbody//tr[2]//td")
	WebElement createdClientName;
	
	@FindBy(xpath="//button[text()='Search']")
	WebElement search;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr//td[2]")
	WebElement searchClientName;
	
	public void clickOnCreateClientTab() {
	gl.clickElement(createClient);
	}
	
	public void selectValueFromBranch(int index) {
	gl.selectByIndexMethod(branch,index);
	}
	
	public void selectValueFromInvoiceOrder(int index){
    gl.selectByIndexMethod(invoiceOrder,index);
	}
	
	public void selectValueFromDivision(int index) {
	gl.selectByIndexMethod(division,index);
	}
	
	public void typeIntoInvoiceContact(String str) {
	gl.typeIntoElement(invoiceContact,str);
	}
	
	public void selectValueFromInvoiceDelivery(int index) {
    gl.selectByIndexMethod(invoiceDeliveryMethod,index);
	}

	public void typeIntoInvoiceClientName(String str) {
	gl.typeIntoElement(clientName,str);
	}
	
	public void typeIntoPhoneNumber(String str) {
	gl.typeIntoElement(phone,str);
	}
	
	public void selectValueMasterDocument(int index) {
	gl.selectByIndexMethod(masterDocument, index);
	}
	
	public void typeIntoClientAddress(String str) {
	gl.typeIntoElement(clientAddress,str);
	}
	
	public void typeIntoSettelmentDays(String str) {
	gl.typeIntoElement(settelmentDays,str);
	}
	
	public void typeIntoPostCode(String str) {
	gl.javascriptScrollToElement(driver, postCode);
	gl.typeIntoElement(postCode,str);
	}
	
	public void typeIntoEmail(String str) {
	gl.typeIntoElement(email, str);
	}
	
	public void selectVatRate(int index) {
	gl.selectByIndexMethod(vatRate,index);
	}
	
	public void typeIntoCompanyReg(String str) {
	gl.typeIntoElement(companyReg,str);
    }
	
	public void clickOnSaveButton() {
	ewait.elementToBeClickableWait(driver, save);
	gl.javascriptClick(driver,save);
	}
	
	public boolean isCreatedClientNameDispalyed() {
	return gl.isDisplayedMethod(createdClientName);
	}
	
	public void typeIntoserachBoxClientName(String str) {
		gl.typeIntoElement(serachBoxClientName, str);
	}
	
	public void clickSearch() {
		ewait.elementToBeClickableWait(driver, search);
		gl.javascriptClick(driver, search);
	}
	
	public Boolean isSearchClientNameDisplayed() {
		fwait.visibilityOfWait(driver,searchClientName);
		return gl.isDisplayedMethod(searchClientName);
		
	}
	
	public String getTextSearchClientName() {
		return gl.getTextOfAnElement(serachBoxClientName);
	}
	
	public String readInvoiceContact(int r,int c) throws IOException {
		return ExcelRead.readIntegerData(r,c);
	}
	
	public String readClientName(int r,int c) throws IOException {
		return ExcelRead.readStringData(r,c);
	}
	
	public String readPhoneNumber(int r,int c) throws IOException {
		return ExcelRead.readIntegerData(r,c);
	}
	
	public String readClientAddress(int r,int c) throws IOException {
		return ExcelRead.readStringData(r,c);
	}
	
	public String readSettelmentDays(int r,int c) throws IOException {
		return ExcelRead.readIntegerData(r,c);
	}
	
	public String readPostCode(int r,int c) throws IOException {
		return ExcelRead.readIntegerData(r,c);
	}
	
	public String readEmail(int r,int c) throws IOException {
		return ExcelRead.readStringData(r,c);
	}
	
	public String readCompanyReg(int r,int c) throws IOException {
		return ExcelRead.readStringData(r,c);
	} 
	
}




