package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetGooglePageTitle {
	
	@Test
	public void testGetPageTitle() {
	
	WebDriverManager.firefoxdriver().setup();
	//WebDriver driver= new ChromeDriver();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	driver.close();
}
}