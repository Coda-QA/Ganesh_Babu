package sample;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Tests {
	
	WebDriver driver;
	
	@BeforeSuite
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Seleniumdrivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void flightSearch() throws InterruptedException
	{
		driver.get("https://www.goibibo.com/");
		Home h=new Home(driver);
		h.selectFrom("Chennai (MAA)");
		h.selectTo("Delhi (DEL)");	
		
	}

}
