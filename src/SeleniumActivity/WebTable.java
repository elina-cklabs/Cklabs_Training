package SeleniumActivity;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebTable {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		 
	        //Open the browser
	        driver.get("https://www.training-support.net/selenium/tables");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        List<WebElement> Rows = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
	        System.out.println("Row size "+Rows.size());
	        List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
	        System.out.println("column size "+columns.size());
	        for(int i=1;i<=Rows.size();i++) {
	        	for(int j=1;j<=columns.size();j++) {
	        		System.out.print(driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr["+i+"]/td["+j+"]")).getText());
	        		System.out.print("--");
	        	}
	        	System.out.println("");
	        }
	        
	        driver.quit();

	}

}
