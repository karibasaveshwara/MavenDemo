package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFacebookPageTitle {
	@Test
	public void testGetFacebookPageTitle(){
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver= new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
