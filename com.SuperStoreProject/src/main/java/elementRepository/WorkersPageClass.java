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

public class WorkersPageClass {

	WebDriver driver;

	GeneralUtilities gl = new GeneralUtilities();
	ExplicitWait ewait = new ExplicitWait();
	FluentWaitClass fwait = new FluentWaitClass();

	public WorkersPageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/payrollapp/worker/create']")
	WebElement createWorker;

	@FindBy(xpath = "//input[@id='workersearch-first_name']")
	WebElement searchBoxFirstName;

	@FindBy(xpath = "//input[@id='workersearch-last_name']")
	WebElement searchBoxLastName;

	@FindBy(xpath = "//input[@id='workersearch-postcode']")
	WebElement searchBoxPostcode;

	@FindBy(xpath = "//input[@id='workersearch-ni_number']")
	WebElement searchBoxNiNumber;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;

	@FindBy(xpath = "//button[@type='reset']")
	WebElement resetButton;

	@FindBy(xpath = "//select[@id='worker-gender']")
	WebElement gender;

	@FindBy(xpath = "//select[@id='worker-branch_id']")
	WebElement branch;

	@FindBy(xpath = "//input[@id='worker-first_name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='worker-last_name']")
	WebElement lastName;

	@FindBy(xpath = "//select[@id='worker-division_id']")
	WebElement division;

	@FindBy(xpath = "//select[@id='worker-employment_type']")
	WebElement employmentType;

	@FindBy(xpath = "//select[@id='worker-payslip_method']")
	WebElement payslipMethod;

	@FindBy(xpath = "//input[@id='worker-address1']")
	WebElement workersAddress;

	@FindBy(xpath = "//input[@id='worker-phone']")
	WebElement workersphone;

	@FindBy(xpath = "//input[@id='worker-postcode']")
	WebElement workersPostcode;

	@FindBy(xpath = "//input[@id='worker-dob']")
	WebElement workersDOB;

	@FindBy(xpath = "//input[@id='worker-ni_number']")
	WebElement niNumber;

	@FindBy(xpath = "//input[@id='worker-email']")
	WebElement email;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement nextButton;

	@FindBy(xpath = "//select[contains(@name,'Worker[payment_method]')]")
	WebElement workersPaymentMethod;

	@FindBy(xpath = "//input[@id='worker-start_date']")
	WebElement startDate;

	@FindBy(xpath = "//input[@id='worker-ac_name']")
	WebElement accountName;

	@FindBy(xpath = "//input[@id='worker-ac_no']")
	WebElement accountNumber;

	@FindBy(xpath = "//input[@id='worker-sort_code']")
	WebElement sortCode;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveButton;

	@FindBy(xpath = "//div[@class='col-sm-6 page-title']")
	WebElement createdWorkerName;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody//tr//td[2]")
	WebElement searchWorkerName;

	@FindBy(xpath = "//*[@class='glyphicon glyphicon-trash']")
	WebElement deleteButton;

	@FindBy(xpath = "//div[@class='empty']")
	WebElement noResultFound;

	public void clickOnCreateWorkersTab() {
		gl.clickElement(createWorker);
	}

	public void selectValueFromGender(int index) {
		gl.selectByIndexMethod(gender, index);
	}

	public void selectValueFromBranch(int index) {
		gl.selectByIndexMethod(branch, index);
	}

	public void selectValueFromDivision(int index) {
		gl.selectByIndexMethod(division, index);
	}

	public void typeIntoFirstName(String str) {
		gl.typeIntoElement(firstName, str);
	}

	public void typeIntoLastName(String str) {
		gl.typeIntoElement(lastName, str);
	}

	public void typeIntoDateOfBirth(String str) {
		gl.typeIntoElement(workersDOB, str);
	}

	public void selectValueFromEmploymentType(int index) {
		gl.selectByIndexMethod(employmentType, index);
	}

	public void selectValueFromPayslipMethod(int index) {
		gl.selectByIndexMethod(payslipMethod, index);
	}

	public void typeIntoAddress(String str) {
		gl.typeIntoElement(workersAddress, str);
	}

	public void typeIntoPhone(String str) {
		gl.typeIntoElement(workersphone, str);
	}

	public void typeIntoPostCode(String str) {
		gl.typeIntoElement(workersPostcode, str);
	}

	public void typeIntoNiNumber(String str) {
		gl.javascriptScrollToElement(driver, niNumber);
		gl.typeIntoElement(niNumber, str);
	}

	public void typeIntoEmail(String str) {
		gl.typeIntoElement(email, str);
	}

	public void clickOnNextButton() {
		// ewait.elementToBeClickableWait(driver, nextButton);
		gl.javascriptClick(driver, nextButton);
	}

	public void selectValueFromPaymentMethod(int index) {
		gl.selectByIndexMethod(workersPaymentMethod, index);
	}

	public void typeIntoStartDate(String str) {
		gl.typeIntoElement(startDate, str);
	}

	public void typeIntoAccoutName(String str) {
		gl.typeIntoElement(accountName, str);
	}

	public void typeIntoAccountNumber(String str) {
		gl.typeIntoElement(accountNumber, str);
	}

	public void typeIntoSortCode(String str) {
		gl.typeIntoElement(sortCode, str);
	}

	public void clickOnSaveButton() {
		ewait.elementToBeClickableWait(driver, saveButton);
		gl.javascriptClick(driver, saveButton);
	}

	public String getTextCreatedWorkerName() {
		return gl.getTextOfAnElement(createdWorkerName);
	}

	public void typeIntoserachBoxWorkersFirstName(String str) {
		gl.typeIntoElement(searchBoxFirstName, str);
	}

	public void typeIntoserachBoxWorkersLastName(String str) {
		gl.typeIntoElement(searchBoxLastName, str);
	}

	public void clickSearchButton() {
		ewait.elementToBeClickableWait(driver, searchButton);
		gl.javascriptClick(driver, searchButton);
	}

	public Boolean isSearchWorkerNameDisplayed() {
		fwait.visibilityOfWait(driver, searchWorkerName);
		return gl.isDisplayedMethod(searchWorkerName);

	}

	public void clickDeleteButton() {
		gl.javascriptClick(driver, deleteButton);
	}

	public void acceptAlert() {
		gl.acceptAlert(driver);
	}

	public boolean isDisplayedNoResultFound() {
		return gl.isDisplayedMethod(noResultFound);
	}

	public String readFirstName(int r, int c) throws IOException {
		return ExcelRead.readStringData(r, c);
	}

	public String readLastName(int r, int c) throws IOException {
		return ExcelRead.readStringData(r, c);
	}

	public String readAddress(int r, int c) throws IOException {
		return ExcelRead.readStringData(r, c);
	}

	public String readPhone(int r, int c) throws IOException {
		return ExcelRead.readIntegerData(r, c);
	}

	public String readDOB(int r, int c) throws IOException {
		return ExcelRead.readIntegerData(r, c);
	}

	public String readEmail(int r, int c) throws IOException {
		return ExcelRead.readStringData(r, c);
	}

	public String readPostcode(int r, int c) throws IOException {
		return ExcelRead.readIntegerData(r, c);
	}

	public String readNiNumber(int r, int c) throws IOException {
		return ExcelRead.readIntegerData(r, c);
	}

	public String readStartDate(int r, int c) throws IOException {
		return ExcelRead.readIntegerData(r, c);
	}

	public String readAccountName(int r, int c) throws IOException {
		return ExcelRead.readStringData(r, c);
	}

	public String readAccountNumber(int r, int c) throws IOException {
		return ExcelRead.readIntegerData(r, c);
	}

	public String readSortCode(int r, int c) throws IOException {
		return ExcelRead.readIntegerData(r, c);
	}

}
