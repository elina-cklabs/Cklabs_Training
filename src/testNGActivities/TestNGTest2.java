package testNGActivities;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest2 {


	@BeforeTest
 	public void beforetest() {
 		System.out.println("before test3");
 	}
  @Test(priority = 3)
  public void third() {
	  System.out.println("hello world 3");
	  Reporter.log("Typing hello world3");
  }
  @AfterTest
	public void aftertest() {
		System.out.println("after test 3");
	}
	
}
