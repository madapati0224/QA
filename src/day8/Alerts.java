package day8;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	

	public static void main(String[] args)  {
		 
		System.setProperty("weddriver.driver.chrome","C:\\Users\\HP\\Downloads\\chromedriver-win64.exe");
		
		WebDriver driver=new ChromeDriver();
		
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.manage().window().maximize();
		
		
//SwitchTo ()- is used when we are working with multiple browsers
		
	
	
//Simple Alert:
		//driver.findElement(By.id("alertBox")).click(); //Alert popup/box will apper
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alertBox"))).click();
		
		String popupmsg= driver.switchTo().alert().getText();
		
		System.out.println("Pop-up text:"+popupmsg); //Pop-up text:I am an alert box!
		
		driver.switchTo().alert().accept();//click on ok
	
			
//Confirm box:
		
	//driver.findElement(By.id("confirmBox")).click(); //display a confirm box.
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmBox"))).click();
		String Popupmsg=driver.switchTo().alert().getText();
		System.out.println("Pop-up text:"+Popupmsg);
		
		driver.switchTo().alert().dismiss();	
	
	
//Prompt box:Text have to ENTER
		
		//driver.findElement(By.id("promptBox")).click();//display a prompt box.
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("promptBox"))).click();
      driver.switchTo().alert().sendKeys("Girija");
      
		driver.switchTo().alert().accept(); 
		
		//Popup box output
	//	You entered text Girija in propmt popup
		
		
	
	
		
		
		
		
		

	}

}
