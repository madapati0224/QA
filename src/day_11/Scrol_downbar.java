package day_11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrol_downbar {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.geeksforgeeks.org/javascriptexecutor-in-selenium/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//-------------------------------SCROLLDOWN THE PAGE-------------------------------------------------
		  /*For scroll we are not having any method in Actions so...
		   * To scrollthe bar we use JAVASCRIPT
		   * JavascriptExecutor is an interface that is used to execute JavaScript with Selenium webdriver
		   * JavaScript is a programming language that interacts with HTML in a browser,
		   * To use JavaScript function in Selenium, JavascriptExecutor method is required.
		   */
		     
 JavascriptExecutor js=(JavascriptExecutor)driver; //create driver instance
 
 /*By using instance variable we scrol the bar in 3ways
  
  * We can scroll by using WebElement(til will scroll til that paticular element)
  * We can Scroll by using window.ScrollBy(It will scroll til bottom of the page)
  * We can scroll by using Pixel 
  */
 
// We can scroll by using WebElement
 
 WebElement ele =driver.findElement(By.xpath("//*[text()='2. ExecuteAsyncScript']"));
 
  js.executeScript("arguments[0].scrollIntoView();", ele);//Scroll by Webelement //aruments[0]-To perform action on scrollbar,aruments[1]- not to perform action on scrollbar
		 
//We can Scroll by using window.ScrollBy
  
 // js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//strt from 0
 

	}

}
