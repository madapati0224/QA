package day_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//Frame1
	WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frm1);
	
	driver.findElement(By.name("mytext1")).sendKeys("SmokeTesting");
	
	  
	
//Frame2 -directly w cant switch to frame 2 ,1st we have to go to main window and then have to switch to frm2 for that we use defaultcontent()
    
	driver.switchTo().defaultContent(); //Go to main window
    
     WebElement frm2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
     driver.switchTo().frame(frm2);
     
     driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("SanityTesting") ;    
   //  driver.findElement(By.name("mytext2")).sendKeys("SanityTesting");
     
     
//Frame3
    driver.switchTo().defaultContent(); //to main window
     
  WebElement  frm3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
  driver.switchTo().frame(frm3);
  
    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Regressiontesting");
 // driver.findElement(By.name("mytext3")).sendKeys("RegressionTesting");
	
  
 // handle frames when one frame is inserted inside another frame
	
 //  WebElement iframe= driver.findElement(By.xpath("/html/body/center/iframe")); 
 //  driver.switchTo().frame(iframe) ;//using webelement
    
         //or  By using index we can switch to iframes
   driver.switchTo().frame(0) ;
	
	driver.findElement(By.cssSelector("div.AB7Lab")).click();
	
//frame4
	driver.switchTo().defaultContent();//Go to main window
	
	WebElement frm4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
	driver.switchTo().frame(frm4);
	
	driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("FunctionalTesting");
	//driver.findElement(By.name("mytext4")).sendKeys("FunctionalTesting");
	
//frame5
	driver.switchTo().defaultContent();//Go to main window
	
	WebElement frm5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
	driver.switchTo().frame(frm5);
	
	driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Re-Testing");
  // driver.findElement(By.name("mytext5")).sendKeys("Re-Testing");

	
	
	}

}
