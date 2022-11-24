package multclasses;

import org.testng.annotations.Test;

public class Class1 {
  @Test(priority=1)
  public void Login()
  {
	  System.out.println("welcome to Newtours");
  }
  @Test(priority=2)
  public void customerdetails()
  {
	  System.out.println("customer details are successfully updated");
  }
  @Test(priority=3)
  public void productdetails()
  {
	  System.out.println("product details are successfully updated");
  }
}
