package multclasses;

import org.testng.annotations.Test;

public class Class2 {
	@Test(priority=4)
	  public void paymentdetails()
	  {
		  System.out.println("payment is successfully credited");
	  }
	  @Test(priority=5)
	  public void deliveryprocess()
	  {
		  System.out.println("product is successfully deliverd");
	  }
	 
  }

