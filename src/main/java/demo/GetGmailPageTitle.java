package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetGmailPageTitle {

	@Test
	public void testGetGmailPageTitle(){
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
