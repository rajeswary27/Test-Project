package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {
	
	public void clickElement(WebElement element)
	{
		element.click();
	}
	public void clearElement(WebElement element){
		element.clear();
	}
	public void typeIntoElement(WebElement element,String str){
		
		element.sendKeys(str);
		
	}
	public String getTextOfAnElement(WebElement element) {
		return element.getText();
	}
	public String getAttributeMethod(WebElement element,String str) {
	return element.getAttribute(str);
	}
		
	public boolean isDisplayedMethod(WebElement element){
		return element.isDisplayed();
	}
	
	public Boolean isEnabledMethod(WebElement element){
		return element.isEnabled();
	}
	
	public Boolean isSelectedMethod(WebElement element){
		return element.isSelected();
	}
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
		}
	
	public void alertSendKeys(WebDriver driver,String str) {
		driver.switchTo().alert().sendKeys(str);
	}
	public void selectByIndexMethod(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	
	public void selectByVisibleText(WebElement element,String str) {
		Select select=new Select(element);
		select.selectByVisibleText(str);
	}
	
	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	
	public void selectByValue(WebElement element,String str) {
		Select select=new Select(element);
		select.selectByValue(str);
		
	}
	
	public void alertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public String alertgetText(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}

	public void javascriptScrollToElement(WebDriver driver,WebElement element){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
		
	}
	
	public void javascriptClick(WebDriver driver,WebElement element){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);  
	}
	
	public void sendKeysClick(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.sendKeys(element, Keys.ENTER).build().perform();
	}
	


}
