package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetGmailPageTitle {

	@Test
	public void testGetGmailPageTitle() throws InterruptedException{
        ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("Extent.html");
		ExtentReports extent= new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		ExtentTest test=extent.createTest("Gmail title", "Get the title of Gmail page");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		test.log(Status.INFO, "Get URL");
		System.out.println(driver.getTitle());
		test.log(Status.INFO, "Get title");
		Thread.sleep(2000);
		driver.close();
		test.log(Status.INFO, "Close driver");
		extent.flush();
	}
}
