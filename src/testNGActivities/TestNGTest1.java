package testNGActivities;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest1 {
	
	@BeforeSuite
 	public void beforesuite() {
 		System.out.println("before suite");
 	}
	
	@BeforeTest
 	public void beforetest() {
 		System.out.println("before test");
 	}
	
	@BeforeClass
 	public void beforeclass() {
 		System.out.println("before class");
 	}

 	@BeforeMethod(groups= {"smoke"})
 	public void beforemethod() {
 		System.out.println("before method");
 	}
	
  @Test(priority = 0)
  public void first() {
	  System.out.println("Hello world");
	  Reporter.log("Typing hello world");
  }
  
  @Test(priority = 1)
  public void second() {
	  System.out.println("Hello world2");
	  Reporter.log("Typing hello world 2");
  }
  @Test(priority = 3)
  public void third() {
	  System.out.println("hello world 3");
  }
  

	@AfterMethod(groups= {"smoke"})
	public void aftermethod() {
		System.out.println("after method");
	}
	
	@AfterClass
 	public void afterclass() {
 		System.out.println("after class");
 	}
	
	@AfterTest
 	public void aftertest() {
 		System.out.println("after test");
 	}
	
	@AfterSuite
 	public void aftersuite() {
 		System.out.println("after suite");
 	}
  
}
