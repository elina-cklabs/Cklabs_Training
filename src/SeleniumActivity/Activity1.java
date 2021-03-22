package SeleniumActivity;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Activity1 {

	public static void main(String[] args) throws InterruptedException {
		//ctrl+shift+O
		 // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
 
        //Open the browser
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait (driver, 20);
        //Find the checkbox
        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox1']"));
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
 
        driver.findElement(By.id("toggleCheckbox")).click();
 
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
        if(checkboxInput.isDisplayed()==true) {
         checkboxInput.click();
        }
      
      wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("xyz"))));
      Wait fluentwait = new FluentWait(driver)
    		    .withTimeout(Duration.ofSeconds(45))
    		    .pollingEvery(Duration.ofSeconds(5))
    		    .ignoring(NoSuchElementException.class);
      fluentwait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='checkbox1']"))));
        //Close the browser
        driver.close();
 
		    }
		

	

}
