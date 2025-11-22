package day48;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * Login
 * search
 * logout
 * login
 * adv search
 * logout
 */

public class AnnotationsDemo1
{
	@BeforeClass
	void login()
	{
		System.out.println("This is login..");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search..");
	}
	@Test(priority=2)
	void advSearch()
	{
		System.out.println("This is advSearch..");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is logout..");
	}
}
