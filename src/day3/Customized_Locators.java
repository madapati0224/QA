package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customized_Locators {

	public static void main(String[] args) throws InterruptedException {
			/*customized locators-
			 * css selector(tag and id;tag and class;Tag and attribute;tag class and attribute
			 * X-path-absolutexpath(full xpath); Relative xpath(partial xpath)
			 */
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			
			Thread.sleep(5000);
			driver.manage().window().maximize();
			
//Tag and id-->Tag and id is separated by using' #'
			
			driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("macbook");
			//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("macbook");//without tag

//Tag and class-->Tag and class is separated by using '.'	
			
			driver.findElement(By.cssSelector("button.button-1")).click();
			//driver.findElement(By.cssSelector(".button-1")).click();//without tag
	Thread.sleep(5000)	;
	
//Tag and attribute-->Tag and attribute is separated by using '[]'
			
			driver.findElement(By.cssSelector("input[name=q]")).sendKeys("jewelry");
		//driver.findElement(By.cssSelector("[name=q]")).sendKeys("jewelry");//without tag
			
//Tag class and attribute-->Tag and class is separated by using '.'and attribute'[]'-->.[]
			
			driver.findElement(By.cssSelector("button.button-1[type=submit]")).click();
		//driver.findElement(By.cssSelector(".button-1[type=submit]")).sendKeys(Keys.ENTER);//without tag
			

			
//If there is no any attribute,then also we can  get the name of the element, if it has inner text in the link 
			
			//customised locator-//a[text()='Elegant Gemstone Necklace (rental)']
			
	//String productname=driver.findElement(By.xpath("//a[text()='Elegant Gemstone Necklace (rental)']")).getText();
	  //System.out.println("name of the product:"+productname);  
			
//will return product name			
/*	String	productname1=driver.findElement(By.linkText("Elegant Gemstone Necklace (rental)")).getText();
		System.out.println("name of the product:"+productname1);
		
	
		  String productname2=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/h2/a")).getText();
		  System.out.println("name of the product:"+productname2);
		  Thread.sleep(5000);
		  
//To open that particular product			
		driver.findElement(By.linkText("Elegant Gemstone Necklace (rental)")).click(); */
		
		
			
/*Difference in absolute(full xpath) and Relative(partial xpath) eg:image name path
 * full xpath-->/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[1]/h1
 *Relative xpath or partial xpath-->//*[@id="product-details-form"]/div[2]/div[1]/div[2]/div[1]/h1
 */
	
	
	
	
	}

}
