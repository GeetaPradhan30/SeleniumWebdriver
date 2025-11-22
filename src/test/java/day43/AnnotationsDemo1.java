package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * 1.Login-----@BeforeMethod
 * 2.Search----@Test
 * 3.Logout----@AfterMethod
 * 4.Login
 * 5.Advance Search
 * 6.Logout
 * 
 * */

public class AnnotationsDemo1 
{
	@BeforeClass
	void login()
	{
		System.out.println("This is login");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search..");
	}
	@Test(priority=2)
	void advanceSearch()
	{
		System.out.println("This is advance search..");
	}
	@AfterClass
	void logout()
	{
		System.out.println("This is logout");
	}

}
