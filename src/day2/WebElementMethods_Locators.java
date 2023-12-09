package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods_Locators {

	public static void main(String[] args) throws InterruptedException {
		/*Webelement methods        Locators-id,name,class name,tag name,Linked text,partial linked text
		 * a.findelement();         Customized locators-x-path,Css selector
		 * b.Findelements();       -->classname and tagname mostly used to identify the multiple webelements.
		 * c.sendKeys();
		 * d.click();
		 * e.clear();
		 * f.Submit();
		 */
		
//Launch browser
		WebDriver driver=new ChromeDriver();
		
//Open url /-https://www.amazon.in/
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
//maximize the window
		
		driver.manage().window().maximize();
		
//a.findelement();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		Thread.sleep(5000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
// b.Findelements(); Number of images
		
	// Number of images in a page
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("number of images in current page:"+images.size());
		
	//Number of Links avaliable in a page
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("number of Links in current page:"+Links.size());
		
		

		

	}

}
