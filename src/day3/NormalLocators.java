package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalLocators {

	public static void main(String[] args) throws InterruptedException {
		
//Normal locators-id,name,linked text,partiallinkText,class name,Tag name
		
		WebDriver driver=new ChromeDriver();
		
driver.get("http://www.automationpractice.pl/index.php");

driver.manage().window().maximize();

//driver.findElement(By.id("search_query_top")).sendKeys("Dresses");

//driver.findElement(By.name("submit_search")).click();

//driver.findElement(By.linkText("Printed Chiffon Dress")).click();//preffered-Text link

//driver.findElement(By.partialLinkText("Printed Chiffon")).click(); //most not preferred bec some time similar name will be avaliable to some elements
		
List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
 System.out.println("No.of sliders:"+sliders.size());
 
 Thread.sleep(5000);
 
 List<WebElement> images=driver.findElements(By.tagName("img"));
 System.out.println("No.of images:"+images.size());
 
 List<WebElement> Links=driver.findElements(By.tagName("a"));
 System.out.println("No.of Links:"+Links.size());

	}

}
