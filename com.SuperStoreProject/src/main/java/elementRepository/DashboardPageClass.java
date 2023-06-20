package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.GeneralUtilities;

public class DashboardPageClass {
	
	WebDriver driver;
	
	GeneralUtilities gl=new GeneralUtilities();
	
	public DashboardPageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Dashboard']")
	WebElement dashboard;
	
	@FindBy(xpath="//a[text()='Company']")
	WebElement company;
	
	@FindBy(xpath="//a[text()='Clients']")
	WebElement clients;
	
	@FindBy(xpath="//a[@href='/payrollapp/worker/index']")
	WebElement workers;
	
	@FindBy(xpath="//a[text()='Deduction']")
	WebElement deduction;
	
	@FindBy(xpath="//a[text()='TimeSheet']")
	WebElement timeSheet;
	
	@FindBy(xpath="//a[text()='Payslip']")
	WebElement paySlip;
	
	@FindBy(xpath="//a[text()='Invoice']")
	WebElement inVoice;
	
	@FindBy(xpath="//a[text()='Report']")
	WebElement report;
	
	@FindBy(xpath="//a[@href='/payrollapp/user']")
	WebElement settings;
	
	@FindBy(xpath="//p[contains(text(),'Welcome')]")
	WebElement dashboardDisplyMsg;
	
	@FindBy(xpath="//img[@src='/payrollapp/images/logo.png']")
	WebElement logo;
	
	
	
	public Boolean isdashboardDisplyMsgDisplayed() {
		return gl.isDisplayedMethod(dashboardDisplyMsg);
		
	}
	
	public void clickOnClientTab() {
		gl.clickElement(clients);
		
	}
	
	public boolean isClientTabDisplayed() {
		return gl.isDisplayedMethod(logo);
	}
	
	public void clickOnWorkersTab() {
		gl.javascriptClick(driver, workers );
	}
	
	public boolean isWorkersTabDisplayed() {
		return gl.isDisplayedMethod(logo);
	}
	public boolean isLogoDisplayed() {
		return gl.isDisplayedMethod(logo);
	}
	
	public void clickOnDeductionTab() {
		gl.javascriptClick(driver, deduction);
	}
	
	public boolean isDeductionTabDisplayed() {
		return gl.isDisplayedMethod(logo);
	}
	
	
	
	

}
