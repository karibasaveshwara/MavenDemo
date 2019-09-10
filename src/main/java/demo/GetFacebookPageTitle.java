package demo;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFacebookPageTitle {
	@Test
	public void testGetFacebookPageTitle() throws AWTException, InterruptedException{
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver= new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
	}
}
