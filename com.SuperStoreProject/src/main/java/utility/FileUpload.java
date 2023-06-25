package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload {
	
	public void fileUpload() throws AWTException {
		
		
		Robot rb = new Robot();
		// Store the File path to the StringSelection class
		StringSelection filePath = new StringSelection(System.getProperty("user.dir")+"\\src\\test\\resources\\sample.jpg");

		//Copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.delay(2);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2);
		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("file uploaded..");
		//driver.findElement(By.id("file-submit")).click();
		}
	}

