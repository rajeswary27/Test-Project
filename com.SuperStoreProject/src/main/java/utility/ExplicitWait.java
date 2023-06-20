package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	WebDriverWait wait;
	
	public void elementToBeClickableWait(WebDriver driver,WebElement element) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
   public void alertIsPresent(WebDriver driver) {
	  wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.alertIsPresent());
 }
 
  public void presentsOfElementLocated(WebDriver driver,String value) {
	 wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
	 
 }
 
  public void presentsOfElementLocatedById(WebDriver driver,String value) {
	 wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.id(value)));
	 
 }
 
  public void presentsOfElementLocatedByName(WebDriver driver,String value) {
	 wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.name(value)));
	 
 }

}
