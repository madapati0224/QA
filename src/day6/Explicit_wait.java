package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.id("alert")).click();
	
	
//----------------------using Explicit because its taken more than 5 seconds to identify the element
//Declaration-
	   WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(10));
	
//Implementation-	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("populate-text"))).click();
	
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("display-other-button"))).click();//The button will be Displayed in 10 Seconds
	
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("enable-button"))).click();

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox"))).click();
	
//---------------------------------------OR---Implicit all the 10 sec elements--------------------------------

	  /*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.id("populate-text")).click();
driver.findElement(By.id("display-other-button")).click(); //The button will be Displayed in 10 Seconds
driver.findElement(By.id("enable-button")).click();
driver.findElement(By.id("checkbox")).click();
	
	*/
	
	
	
	
	
	
	
	
	}
}