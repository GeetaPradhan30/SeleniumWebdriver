package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * 1.Open app
 * 2.checklogo
 * 3.Login
 * 4.Logout
 */

public class FirstTestcase 
{
	WebDriver driver;
	@Test(priority=1)
void openapp()
{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	
}
@Test(priority=2)
void Testlogo()
{
	Boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	System.out.println("Logo is displayed: "+status);
}
@Test(priority=3)
void Login()
{
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Admin123");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
}

@Test(priority=4)
void Logout()
{
	driver.quit();
}





}
