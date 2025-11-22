package day46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParralelTest 
{
	WebDriver driver;

	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
	 driver.get("");	
	}
	
	@Test(priority=1)
	void TestLogo()
	{
		
	}
	
	@Test(priority=2)
	void TestTitle()
	{
		
	}
	
	@Test(priority=3)
	void TestURL()
	{
		
	}
	
	void TearDown()
	{
		
	}
}
