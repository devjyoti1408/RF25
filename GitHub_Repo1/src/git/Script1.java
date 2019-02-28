package git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Script1 {

	WebDriver driver;
	@BeforeMethod
	public void setUP()
	{
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
