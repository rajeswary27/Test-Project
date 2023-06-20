package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.GeneralUtilities;

public class LoginPageClass {
	
	WebDriver driver;
	
	GeneralUtilities gl=new GeneralUtilities();
	
	public LoginPageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	} 
	
	@FindBy(xpath = "//input[@id='loginform-username']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='loginform-password']")
	WebElement passwd; 
	
	@FindBy(xpath ="//button[@name='login-button']" )
	WebElement login;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	WebElement carol_Thomas;
	
	@FindBy(xpath="//p[contains(text(),'Incorrect usernam')]")
	WebElement incorrect_Msg;
	
	
	public String getUrl() {
		
		return gl.getCurrentUrl(driver);
		
	}
	
	public void login(String uname,String pword) {
		
		gl.typeIntoElement(userName,uname);
		gl.typeIntoElement(passwd,pword);
		gl.clickElement(login);
		
	}
	
	public Boolean isCarolThomasDisplayed() {
		
		return gl.isDisplayedMethod(carol_Thomas);
		
	}
	
	public String getTextOfIncorectMsg() {
		return gl.getTextOfAnElement(incorrect_Msg);
		
	}
	
	
	
	
	
	


}
