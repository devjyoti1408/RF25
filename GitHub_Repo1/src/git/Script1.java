package git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script1 {

	WebDriver driver;
	@BeforeMethod
	public void setUP()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void openBrowser()
	{
		driver.get("http://localhost/login.do");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
