package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitClass {
	
	public void elementToBeClickable(WebDriver driver,WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
				  wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void presenceOfElementLocated(WebDriver driver,String value) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(10))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
				  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
		
	}
	
	public void visibilityOfWait(WebDriver driver,WebElement element) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(10))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
				  wait.until(ExpectedConditions.visibilityOf(element));
		
	}
}
