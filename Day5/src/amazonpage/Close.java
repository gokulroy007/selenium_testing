package amazonpage;

import org.testng.annotations.AfterTest;

public class Close extends Operations{
  @AfterTest
  public void close() 
  {
	  d.close();
  }
}
