package elementRepository;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.netty.handler.codec.http.multipart.FileUpload;
import utility.GeneralUtilities;

public class TimesheetPageClass {

	WebDriver driver;
	
	GeneralUtilities gl=new GeneralUtilities();
	FileUpload fu=new FileUpload();
	
	
	public  TimesheetPageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//a[@href='/payrollapp/timesheet/create']")
	WebElement createTimeSheet;
	
	@FindBy(xpath = "//input[@class='file-caption-name']")
	WebElement selectAnImage;
	
	@FindBy(xpath = "//*[text()='Browse …']//following::input")
	WebElement browse;
	
	public void clickOnCreateTimeSheet() {
		
		gl.clickElement(createTimeSheet);
	}
	public void clickOnBrowse() {
         
		gl.javascriptClick(driver, selectAnImage);
		gl.keyPressTab(driver);
		gl.javascriptClick(driver, browse);
	}
	
	public void uploadAnImage(String str) {
		
		
		//gl.sendKeysUploadImage(selectAnImage,str);
	}
}
