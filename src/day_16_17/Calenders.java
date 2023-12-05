package day_16_17;

import java.awt.Window;

//awt-abstract window toolkit

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
//To scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,150)","");
		
//calender-1: Select date from current month
		
		//driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		
    // int  day=26; //current date in the month
		//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();//10/26/2023-mm/day/yyyy
	
	//	int day =10; //paste date in the month
	//	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
	
	//	int day=29;//Future date in current month
	//	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();

//	Select future year and months
		
	/*	String month="February 2024";
		int day=24;
		
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		while(true)
		{
		String currentmonth=	driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();//Title of current month and year
			if(currentmonth.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//forward button
			}
					
		}
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
		
		*/

//Select paste year and months
		
		String month="February 1996";
		int day=24;
		
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		
		while(true)
		{
		String currentmonth=	driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();//Title of current month and year
			if(currentmonth.equals(month))
			{
				break;
				
			}
		
			else
			{
				driver.findElement(By.xpath("//span[text()='Prev']")).click();//backward button
			}
					
		}
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
		

		
//calender-2 :select date from current month when it has previous and future dates		
	
	/*	int day=2;
		
		driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td [not(contains(@class,' ui-datepicker-other-month '))]//a[text()="+day+"]")).click();//by using NOT we hav written xpath to remove the next month dates
	*/
		
//Calender-6:Enter the dates by using sendkeys
		
	//	driver.findElement(By.xpath("//input[@id='sixth_date_picker']")).sendKeys("10/26/2023");//current date
		
	//	driver.findElement(By.xpath("//input[@id='sixth_date_picker']")).sendKeys("10/01/2023");//paste date
		
	//	driver.findElement(By.xpath("//input[@id='sixth_date_picker']")).sendKeys("02/24/2024");//Future date
	
	

}
}