package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Task:
1. open Url:http://the-internet.herokuapp.com/iframe
2. switch to frame
3. clear the text
4. Enter new text */

public class The_Internet_10 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.driver.Chrome"," C:\\Users\\HP\\Downloads\\chromedriver-win64.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	WebElement ifrm	=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
	driver.switchTo().frame(ifrm);
	
	WebElement text=driver.findElement(By.xpath("//*[text()='Your content goes here.']/self::p"));
	text.clear();
	
	Thread.sleep(5000);
	
	text.sendKeys("Hi World..");
	}
	

}
