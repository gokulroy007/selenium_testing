package multclasses;

import org.testng.annotations.Test;

public class Class3 {
	@Test(priority=6)
	  public void feedback()
	  {
		  System.out.println("feedback is successfully taken");
	  }
	  @Test(priority=7)
	  public void close()
	  {
		  System.out.println("successully closed");
	  }
  }

