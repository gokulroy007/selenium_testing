package testNgmethods;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void login_browser() 
  {
	  System.out.println("successfully opened");
  }
  @Test(priority=2)
  public void customer_details()
  {
	  System.out.println("customer details succesffully updated");
  }
  @Test(priority=3)
  public void payment_details()
  {
	  System.out.println("payment details are successfully credited");
  }
  @Test(priority=4)
  public void product_details()
  {
	  System.out.println("product details are successfully deliverd");
  }
  @Test(priority=6)
  public void feedback()
  {
	  System.out.println("Good quality product");
  }
  @Test(priority=5)
  public void deleivery()
  {
	  System.out.println("product is successfully deliverd");
  }
  @Test(enabled=false)
  public void dummy()
  {
	  System.out.println("it is Dummy");
  }
  @Test(priority=7)
  public void logoff()
  {
	  System.out.println("successfully signedoff");
  }
}
