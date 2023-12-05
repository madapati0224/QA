package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//We can write x-paths manually by using  OPERATORS,CONDITIONS and FUNCTIONS
public class Manual_xpaths {
	public static void main(String[] args) throws InterruptedException {
	
		
/*xpath operators
 * = -->text and numeric
 * != -->text and numeric
 * <,>,<=,>= -->for numerics
 */

//Basic Relative Xpath syntax-->//tagname[@variable='value'] or *[@variable='value']
 
//launch browser
		WebDriver driver=new ChromeDriver();
		
//open url
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#");
	Thread.sleep(5000); //wait for 5seconds after thread executed
	
//maximize
	  driver.manage().window().maximize();
		
// '=' and '!=' OPERATORS -->text and numeric:First name  & Lastname
	
  // By using numeric value:
	  
	   // driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("xxxxx"); //By using = operator
	  // driver.findElement(By.xpath("//input[@maxlength!=10]")).sendKeys("M"); //By using != operator
	  
  // By using Text value:
	  
	  // driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Girija"); //By using = operator
	 
	 // driver.findElement(By.xpath("//input[@name!='name']")); //It will indicate the value which is not with name


/*xpath CONDITIONS --> finding element with combination of 2 attributes
 * AND 
 * OR
 * NOT
 */
	  
//By using AND operator	  
	 // driver.findElement(By.xpath("//input[@maxlength=10and@name='name']")).sendKeys("yyyy");
	// driver.findElement(By.xpath("//input[@maxlength=15and@name='name']")).sendKeys("aaaaa");
	  
//By using OR..at_least one should match
	 //  driver.findElement(By.xpath("//input[@maxlength=10or@name='name']")).sendKeys("Girija");
	 //  driver.findElement(By.xpath("//input[@maxlength=15or@name='name']")).sendKeys("Devi");

//By using NOT operator	  
	 // driver.findElement(By.xpath("//input[not(@maxlength=10)]")).sendKeys("zzzz");
	 // driver.findElement(By.xpath("//input[not(@maxlength=15)]")).sendKeys("zzzz1");	
	  
    //Xpath functions-->Text(),conatins(),starts-with() //Mostly sutiable , when there is a dynamic change in Xpath
	  
//1.Xpath Text():When we are not having any attributes then we can use text()
	  
	//  driver.findElement(By.xpath("//a[text()='Sign in into account']"));//.click();

//2.xpath conatins():Finding the element by using contains method by attribute and its value.
	  
	 // driver.findElement(By.xpath("//a[contains(@title,'facebook')]")).click();
	     //or
	  driver.findElement(By.xpath("//a[contains(@title,'book')]")).click();
	  
//3.Xpath starts-with().we can find element by using starting word 
	//  driver.findElement(By.xpath("//a[starts-with(@title,'face')]")).click();
	  
	  
	  
	  
	  

	}

}
