package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWait;
import utility.FluentWaitClass;
import utility.GeneralUtilities;

public class DeductionPageClass {
	
	WebDriver driver;
	
	GeneralUtilities gl=new GeneralUtilities();
	ExplicitWait ewait=new ExplicitWait();
	FluentWaitClass fwait=new FluentWaitClass();
	
	public DeductionPageClass(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/payrollapp/deduction/create']")
	WebElement addDeduction;
	
	@FindBy(xpath = "//span[text()='-- Please Select --']")
	WebElement pleaseSelect;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement selectTextBox;
	
	@FindBy(xpath="//select[@id='deduction-type']")
	WebElement type;
	
	@FindBy(xpath="//input[@id='deduction-amount']")
	WebElement amount;
	
	@FindBy(xpath="//input[@id='deduction-effective_from']")
	WebElement date;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement saveButton;
	
	@FindBy(xpath="//div[@class='col-sm-6 page-title']")
	WebElement createdName;
	
	public void clickOnAddDeductionTab() {
		gl.clickElement(addDeduction);
	}
	
     public void selectValueFromWorker(String str) {
		gl.clickElement(pleaseSelect);
		gl.typeIntoElement(selectTextBox,str);
	}
	
	public void selectValueFromTextBox() {
		gl.sendKeysClick(driver,selectTextBox);
	}
	
	public void selectValueFromType(int index) {
		gl.selectByIndexMethod(type, index);
	}
	public void typeIntoAmount(String str) {
		gl.typeIntoElement(amount, str);
	}
	
	public void typeIntoEffectiveFrom(String str) {
		gl.typeIntoElement(date, str);
	}
	
	public void clickSaveButton() {
		gl.clickElement(saveButton);
	}
	
	public void clickPleaseSelect() {
		gl.clickElement(pleaseSelect);
	}
	
	public void typeIntoSelectTextBox(String str) {
		gl.typeIntoElement(selectTextBox, str);
	}
	
	public boolean isCreatedNameDispalyed() {
		return gl.isDisplayedMethod(createdName);
		}
	

	
}
