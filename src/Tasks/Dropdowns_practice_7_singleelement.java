package Tasks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdowns_practice_7_singleelement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/dropdowns1");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	//	Select drpdown=new Select(driver.findElement(By.xpath("//Select[@id='first']")));
		
	/*	drpdown.selectByValue("Microsoft"); //Bing
		drpdown.selectByValue("Google");   //Google
		drpdown.selectByValue("Yahoo");   //This is visible text
		drpdown.selectByValue("Apple");  //Iphone
		drpdown.selectByValue("Yah");   //Yahoo */
		
	/*	drpdown.selectByVisibleText("Bing");  //Bing
		drpdown.selectByVisibleText("Google");//Google
		drpdown.selectByVisibleText("This is visible text");//This is visible text
		drpdown.selectByVisibleText("Iphone");//Iphone
		drpdown.selectByVisibleText("Yahoo");//Yahoo */
		
	/*	drpdown.selectByIndex(0);  //Bing
		//drpdown.selectByIndex(1);//Google
		//drpdown.selectByIndex(2);//This is visible text
	    //drpdown.selectByIndex(3);//Iphone
		//drpdown.selectByIndex(4);//Yahoo */
		
	/*To know total elements 
		List<WebElement> alloptions=drpdown.getOptions();
		
		for(int i=0;i<alloptions.size();i++) { //loop
		
		String options=alloptions.get(i).getText();
		
		System.out.println(options);//Bing,Google,This is visible text,Iphone,Yahoo
		
		}*/
		
//--------------------------------------------------------------------------------------------	
		
//Select drpdown=new Select(driver.findElement(By.xpath("//Select[@id='animals']")));	

		//drpdown.selectByValue("cat"); //cat
		//drpdown.selectByValue("babycat");   //Baby Cat
		//drpdown.selectByValue("big baby cat");   //Big Baby Cat
		//drpdown.selectByValue("avatar");  //Avatar */
		
//To know total elements
  
/*		List<WebElement> alloptions=drpdown.getOptions();
		
		System.out.println("Total no.of elements:"+alloptions.size());//4
		
		for(int i=0;i<alloptions.size();i++) { //loop
		
		String options=alloptions.get(i).getText();
		
		System.out.println(options);//Avatar,Big Baby Cat,Baby Cat,Cat
		
		}*/
		
//----------------------------------------------------------------------------------------
	//	Select drpdown=new Select(driver.findElement(By.xpath("//Select[@id='order-same']")));
		
	//	drpdown.selectByVisibleText("Bing");  //Bing
	//	drpdown.selectByVisibleText("Google");//Google
	//	drpdown.selectByVisibleText("Iphone");//Iphone
	//	drpdown.selectByVisibleText("Yahoo");//Yahoo 
		
//To know total elements
		  
		/*List<WebElement> allotions=drpdown.getOptions();
				
				System.out.println("Total no.of elements:"+alloptions.size());//4
				
				for(int i=0;i<alloptions.size();i++) { //loop
				
				String options=alloptions.get(i).getText();
				
				System.out.println(options);//Bing,Google, Iphone,Yahoo
				
				}*/
				
//---------------------------------------------------------------------------------------------------				
//Select drpdown=new Select(driver.findElement(By.xpath("//Select[@id='order-changed']")));
	
	//	drpdown.selectByIndex(0);  //Iphone
		//drpdown.selectByIndex(1);//Bing
		//drpdown.selectByIndex(2);//Yahoo
	  //  drpdown.selectByIndex(3);//Google
	    
 //To know total elements
		  
	  /*	 List<WebElement> alloptions = drpdown.getOptions();
	  				
	  				System.out.println("Total no.of elements:"+alloptions.size());//4
	  				
	  				for(int i=0;i<alloptions.size();i++) { //loop
	  				
	  				String options=alloptions.get(i).getText();
	  				
	  				System.out.println(options);//Iphone,Bing, Yahoo,Google
	  				
	  				}*/
//-------------------------------------------------------------------------------------------
		                       //Explicitwait
		
//Declaration-
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 
//Implementation-
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'custom\']"))).click();
		 
		 
}
	}
