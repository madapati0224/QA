package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_methods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
//1.To navigate from one application to other application
		driver.navigate().to("https://www.flipkart.com/");
		
//2.To navigate backward
		driver.navigate().back();
		
//3.To navigate forward
		driver.navigate().forward();
		
//4.To navigate and refresh
		driver.navigate().refresh();

	
	}

}
