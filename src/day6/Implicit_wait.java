package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome"," C:\\Users\\HP\\Downloads\\chromedriver-win64.exe");
	
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//If anyone element is taking more than that given 5seconds time, then we will got for Explicit wait.
		
	
	}

}
