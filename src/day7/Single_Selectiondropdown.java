package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/* We hav 3 methods for dropdowns
 * 1.SelectByvalue()
 * 2.SelectByvisibletext()
 * 3.SelectByIndex()
 */

public class Single_Selectiondropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
//Syntax:Select obj=new Select(locator);
		
		Select obj=new Select(driver.findElement(By.xpath("//Select[@id='course']")));
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		

		//obj.selectByValue("select");
		//obj.selectByValue("java");
		//obj.selectByValue("net");
		//obj.selectByValue("python");
		//obj.selectByValue("js");

//obj.selectByVisibleText("Select");
//obj.selectByVisibleText("Java");
//obj.selectByVisibleText("Dot Net");
//obj.selectByVisibleText("Python");
//obj.selectByVisibleText("Javascript");
		
		//obj.selectByIndex(0);
		//obj.selectByIndex(1);
		//obj.selectByIndex(2);
		//obj.selectByIndex(3);
		// obj.selectByIndex(4);
		
//To know total elements 
	List<WebElement> alloptions=obj.getOptions();
	
	System.out.println("Total elements:"+alloptions.size());
	
//Element names
	
	for(int i=0;i<=5;i++) { //loop
	
	String options=alloptions.get(i).getText();
	
	System.out.println(options);//Select,Java,DotNet,Python,Javascript
	
		
		//driver.close();
		


	}}

}
