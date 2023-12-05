package day_15;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.channels.Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uploadfile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/upload/");

//Uploading file using sendkeys
		
		driver.findElement(By.xpath("//input[@class='upload_txt']")).sendKeys("C:\\Users\\HP\\Desktop\\QuickRevise\\click intercepted exception.txt");
		
//Uploading file using Robot class
		
/*	WebElement ele=	driver.findElement(By.xpath("//input[@class='upload_txt']"));
	Actions ac=new Actions(driver);
	ac.moveToElement(ele).click().perform(); //new window will display
	
	//Create Robot class
	
	Robot rb = new Robot();
	
	//select the file from local folder
	
	StringSelection sc =new StringSelection("C:\\Users\\HP\\Desktop\\QuickRevise\\click intercepted exception.txt");
	
	Thread.sleep(5000);
	
	//copy the file	 
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	
	//paste the file
	rb.keyPress(KeyEvent.VK_CONTROL); //press cntrl
	rb.keyPress(KeyEvent.VK_V);//press v to paste
	
	rb.keyRelease(KeyEvent.VK_CONTROL);//release cntrl
	rb.keyRelease(KeyEvent.VK_V);//release v 
	
	
	
	 //Move to next field by using TAB 
	   
	//   ac.sendKeys(Keys.TAB);
	//   ac.perform();
	   
// Press enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER); */

	}

}
