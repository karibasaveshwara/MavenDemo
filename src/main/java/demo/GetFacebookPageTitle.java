package demo;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFacebookPageTitle {
	@Test
	public void testGetFacebookPageTitle() throws AWTException, InterruptedException{
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("Extent.html");
		
		ExtentReports extent= new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		ExtentTest test=extent.createTest("Facebook title", "Get the title of Facebook page");
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver= new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		test.log(Status.INFO, "Get URL");
		
		System.out.println(driver.getTitle());
		test.log(Status.INFO, "Get title");
		Thread.sleep(2000);
		driver.close();
		test.log(Status.INFO, "Close driver");
		extent.flush();
		
	}
}
