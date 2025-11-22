package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo 
{
	@Test
  void TestTilte()
  {
  String exp_title="opencart";
  String act_title="openshop";
  
  Assert.assertEquals(exp_title, act_title);
  }
	
	
 
 
}
