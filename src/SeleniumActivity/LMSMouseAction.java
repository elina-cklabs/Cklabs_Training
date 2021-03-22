package SeleniumActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LMSMouseAction {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://lms.training-support.net/alchemy/lessons/ibm-sdet-long-batch-5-java/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//img[contains(@class,'avatar')"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Course Home']")).click();
	}

}
