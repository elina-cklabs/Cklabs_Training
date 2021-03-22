package testNGActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest2 {
	
  @Test(groups= {"smoke"})
  public void second() {
	  System.out.println("hello world2");
  }
  @BeforeClass(groups= {"smoke"})
  public void beforeClass() {
	  System.out.println("Before class2");
  }

  @AfterClass(groups= {"smoke"})
  public void afterClass() {
	  System.out.println("After class2");
  }

}
