package demo;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GetFacebookPageTitle {
	@Test
	public void testGetFacebookPageTitle() throws AWTException, InterruptedException{
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("Extent.html");
		
		ExtentReports extent= new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		System.setProperty("webdriver.chrome.driver", "C://Users//kt//Mavenjava//drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		//test.log(Status.INFO, "Get URL");
		
		System.out.println(driver.getTitle());
		//test.log(Status.INFO, "Get title");
		Thread.sleep(2000);
		driver.close();
		//test.log(Status.INFO, "Close driver");
		extent.flush();
		
	}
}
