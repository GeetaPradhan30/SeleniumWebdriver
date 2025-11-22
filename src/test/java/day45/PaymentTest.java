package day45;

import org.testng.annotations.Test;

public class PaymentTest 
{
	@Test(priority=1, groups= {"sanity","regression","functional"})
	void paymentinRupees()
	{
	System.out.println("Payment in rupees");	
	}
	
	@Test(priority=2, groups= {"sanity", "regression", "functional"})
	void paymentinDoller()
	{
		System.out.println("Payment in doller");
	}

}
