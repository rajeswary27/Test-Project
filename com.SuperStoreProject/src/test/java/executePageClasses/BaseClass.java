package executePageClasses;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {

	WebDriver driver;
	public static Properties property;

	public static void readProperty() throws IOException {
		property = new Properties();
		FileInputStream f = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		property.load(f);

	}

	@Parameters({"browser"})
	@BeforeMethod
	public void beforeMethod(String browservalue) throws IOException {

		readProperty();
		if (browservalue.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browservalue.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get(property.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void afterMethod() {

		 driver.quit();
	}

}
