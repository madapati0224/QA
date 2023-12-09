package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_methods {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.driver.chrome","C:\\Users\\HP\\Downloads\\chromedriver-win64.exe");//chrome driverpath
		 
		
		//EdgeDriver driver=new EdgeDriver();//launches edge browser
		
	//ChromeDriver driver=new ChromeDriver();
		//or
//1.To launch Browser:
		WebDriver driver =new ChromeDriver();
	
//2.To open url in browser:
		driver.get("https://www.amazon.in/");
		
//3.To maximize the application:
		driver.manage().window().maximize();
		
//4.To get the Titles of the application
		
		String Title=driver.getTitle();
		System.out.println("Titles in the webpage:"+Title);
		        //or
		//System.out.println(driver.getTitle());
		
//5.To get source code:
		String sourcecode= driver.getPageSource();
		System.out.println("Display source code:"+sourcecode);
		        //or
	//	System.out.println(driver.getPageSource());
		
//6.To get currenturl in browser
		String currenturl=driver.getCurrentUrl();
		System.out.println("Display current url:"+currenturl);
		        //or
		//System.out.println(driver.getCurrentUrl());
		
//7.To close particular tab/browser
		driver.close();
		
		
		
		
		

		
		

	}

}
