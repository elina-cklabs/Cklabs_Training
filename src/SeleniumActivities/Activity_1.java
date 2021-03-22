package SeleniumActivities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_1 {

    public static void main(String[] args) {
	// Create a new instance of the Firefox driver
    	//ctrl+shift+o
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//Open the browser
	driver.get("https://www.training-support.net");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)"); //X ,Y
	//js.executeScript("arguments[0].scrollIntoView();",WebElement);

	//Example with ExpectedConditions
	WebDriverWait wait = new WebDriverWait (driver, 50);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='about-link']"))));
	driver.findElement(By.xpath("//a[@id='about-link']")).click();
	
	Wait fwait = new FluentWait(driver)
		    .withTimeout(Duration.ofSeconds(20))
		    .pollingEvery(Duration.ofSeconds(1))
		    .ignoring(Exception.class);
		
	//Close the browser
	driver.close();
    }

}

