package day45;

import org.testng.annotations.Test;

public class SignupTest 
{
	@Test(priority=1, groups= {"regression"})
	void Signupbyemail()
	{
		System.out.println("This is signup by email");
	}

	@Test(priority=2, groups= {"regression"})
	void Signupbyfacebook()
	{
		System.out.println("This is signup by facebook");
		
	}
	
	@Test(priority=3, groups="regression")
	void Signupbytwitter()
	{
		System.out.println("This signup by twitter");
	}
}
