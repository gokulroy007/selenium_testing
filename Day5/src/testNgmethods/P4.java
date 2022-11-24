package testNgmethods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P4 {
  @BeforeClass
  public void Login() 
  {
	System.out.println("login successfull")  ;
  }
  @Test
  public void operation()
  {
	  System.out.println("opertaion successsfull");
  }
  @AfterClass
  public void close()
  {
	  System.out.println("closing successfull");
  }
}
