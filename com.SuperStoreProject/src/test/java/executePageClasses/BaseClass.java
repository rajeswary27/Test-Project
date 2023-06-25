package executePageClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ScreenShot;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.internal.annotations.ITest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
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
	@BeforeMethod(groups = {"launch"})
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

	@AfterMethod(groups = {"close"})
	public void afterMethod(ITestResult itr) throws IOException {
		
		if(itr.getStatus()==ITestResult.FAILURE){
			ScreenShot src=new ScreenShot();
			src.takeScreenShot(driver, itr.getName());
			
		}
	
		 driver.quit();
	}
	
	@BeforeSuite(alwaysRun = true)
	public void createReport(final ITestContext testContext) {
		extendReport.ExtentManager.createInstance().createTest(testContext.getName(), "message");
	}

}
