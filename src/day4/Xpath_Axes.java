package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes {

	public static void main(String[] args) throws InterruptedException {
		/*Xpath Axes is mostly used to handle web tables
		 * Xpath Axes keywords-->child,parent,Ancestor(Grandparent),Descendant(Grand child),
		 * Preceding-sibling(before),Following-sibling(After)
		 */

//launch browser
		WebDriver driver=new ChromeDriver();
		
//Open url
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#");
		
//maximize window
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
//Enter first name
		driver.findElement(By.xpath("//input[@maxlength=15]/preceding::input[1]")).sendKeys("xxxxxxx");
//Enter last name
		driver.findElement(By.xpath("//input[@maxlength=10]/following::input[1]")).sendKeys("yyyyyyy");
//Enter email
		driver.findElement(By.xpath("//input[@maxlength=10]/following::input[2]")).sendKeys("Demo2@gmail.com");
//Enter password
		driver.findElement(By.xpath("//input[@maxlength=10]/following::input[3]")).sendKeys("123a");
//Enter Repeat password	
		driver.findElement(By.xpath("//input[@maxlength=10]/following::input[4]")).sendKeys("123a");
		

	}

}
