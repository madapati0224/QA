package day_11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouseactions_methods {
	//Mouse actions-double click,rightclick,click and drag and drop
	
	//For scroldown there are no methods in actions.so we used JAVASCRIPT METHOD or JAVASCRIPTEXECUTION class

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Create ACTIONS obj
		 
		 Actions act =new Actions (driver);
		 
//-------------------------------DOUBLE CLICK ME---------------------------------------------------------
		 
     WebElement doubleclk=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
     act.doubleClick(doubleclk).perform();
     
 String Text =  driver.findElement(By.xpath("//p[text()='You have done a double click']")).getText();;
      System.out.println("doubleClickMessage: "+Text);
      
//-------------------------------RIGHT CLICK ME---------------------------------------------------------
     
   WebElement Rightclick=  driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
   act.contextClick(Rightclick).perform();  //for rightclick Contextclick() is used.
   
String Text2= driver.findElement(By.xpath("//p[text()='You have done a right click']")).getText();;
  System.out.println("rightClickMessage:"+Text2);
   
//-------------------------------CLICK ME--------------------------------------------------------------
     
   WebElement Leftclick=driver.findElement(By.xpath("//button[text()='Click Me']"));
   act.click(Leftclick).perform();
   
  String Text3= driver.findElement(By.xpath("//p[text()='You have done a dynamic click']")).getText();
  System.out.println("dynamicClickMessage:"+Text3);
  
 
 
		

	}

}
