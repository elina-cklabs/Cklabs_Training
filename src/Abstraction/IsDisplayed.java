package Abstraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		//isDisplayed() method returns boolean value either True or False
		Boolean Display = driver.findElement(By.xpath("//span[text()='Next']")).isDisplayed();
		//To print the value
		System.out.println("Element displayed is :"+Display);
		//isEnabled() method returns boolean value either True or False 
		Boolean Enable = driver.findElement(By.xpath("//span[text()='Next']")).isEnabled();
		System.out.println("Element enabled is :"+Enable);
		//Passing value as "softwaretestingmaterial" in the email field
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("elina@cklabs.in");
		//to click on next button
		driver.findElement(By.xpath("//span[text()='Next']/following::div")).click();
		Thread.sleep(5000);
		//isSelected() method returns boolean value either True or False
		Boolean Select = driver.findElement(By.xpath("//input[contains(@class,'VfPpkd')]")).isSelected();
		System.out.println("Element selected is :"+Select);
	}

}
