package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgActivity1 {
 
	
	    WebDriver driver;
	    
	    @BeforeSuite
	    public void beforeSuite123() {
	    	
	    	System.out.println("before suite");
	    }
	    
	    @BeforeTest
	    public void beforeTest() {
	    	
	    	System.out.println("before test");
	    }
	    
	    @BeforeClass
	    public void beforeClass() {
	    	
	    	System.out.println("before class");
	    }
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("https://www.training-support.net");
	    }

	    @Test (groups = { "Car" })
	    public void exampleTestCase() {
	        // Check the title of the page
	        String title = driver.getTitle();
	            
	        //Print the title of the page
	        System.out.println("Page title is: " + title);
	            
	            //Assertion for page title
	        Assert.assertEquals("Training Support", title);
	                    
	        //Find the clickable link on the page and click it
	        driver.findElement(By.id("about-link")).click();
	                    
	        //Print title of new page
	        System.out.println("New page title is: " + driver.getTitle());
	        
	        Assert.assertEquals(driver.getTitle(), "About Training Support");
	        
	    }
	    
	    @Test(priority = 1, enabled = false)
	    public void test2() {
	    	String condition ="Skip Test";

	        if(condition.equals("Skip Test")){
	    	throw new SkipException("Skipping - This is not ready for testing ");
	        } else {
	    	//Execute test case when conditions are satisfied
	        	System.out.println("test2");
	        }
	    	
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }

	    
}
