package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Allmethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Name:		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Girija");
		
//Email:
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("demo@123@gmail.com");
		
//Phone:
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("0891123456");
		
//Address:
		
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("xxxxx");
		
//Gender:Radio button -select one option
		
		driver.findElement(By.xpath("//input[@id='female']")).click();
		
//Scrolldown
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,250)", "");//scroll by pixel
		
//checkbox
	List<WebElement> totaldays=	driver.findElements(By.xpath("//div[@class='form-group']//child::label[text()='Days:']//following::div[@class='form-check form-check-inline']"));
	System.out.println("Total day avaliable:"+totaldays.size());
	
	//select 1,2 check box
	
	
	for(int i=0;i<2;i++)  
	{
		totaldays.get(i).click(); //select the 2 checkbox
	}
	
	Thread.sleep(5000);
	
	/*for(int i=0;i<2;i++)
	{
		if(totaldays.get(i).isSelected()); //unselect checkbox
		totaldays.get(i).click();
	}*/
	
	//select last 2 checkboxes
	
/*	for(int i=5;i<totaldays.size();i++)
	{
		totaldays.get(i).click(); //select check box
	}
	
	Thread.sleep(5000);
	
	for(int i=5;i<totaldays.size();i++)
	{
		if(totaldays.get(i).isSelected());//unslect the checkbox
		totaldays.get(i).click();
	}*/
	
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("window.scrollBy(0,250)", "");
	
//country:dropdown
	
	WebElement countrys=driver.findElement(By.xpath("//select[@id='country']"));
	
	
	Select sc=new Select(countrys);
	sc.selectByValue("india");
	
//colours-multiple select
	
	WebElement colors=driver.findElement(By.xpath("//select[@id='colors']"));
	
	Select sc2 =new Select(colors);
	
	if(sc2.isMultiple())
	{
		sc2.selectByVisibleText("Red");
		sc2.selectByValue("blue");
	}
	
//calender
	
//current date in current month
	
	/*int day=2;
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='3'][2]")).click();
	
	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click(); */
	
//after month date
	
	String month="December 2023";
	int day=3;
	
	while(true)
	{
String currentmont=driver.findElement(By.xpath("//div[@class='ui-datepicker-title'])")).getText();

if(currentmont.equals(month))
break;

else
{
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e'][1]")).click();
}

	}
	
	
	
	
	

		

//clse:
		
	Thread.sleep(5000);
driver.close();
		

	}

}
