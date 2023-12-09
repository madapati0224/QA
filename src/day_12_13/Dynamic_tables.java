package day_12_13;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_tables {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//popup window		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed());
		   driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		   
//click on cutomers
		   driver.findElement(By.xpath("//li[@id='menu-customer']")).click();
		   driver.findElement(By.xpath("//a[text()='Customers']")).click();
		   
//finding showing no of pages (right bottom)
		   
		String totalpagestext=  driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
         System.out.println("Showing Total no.of pages:"+totalpagestext);//Total no.of pages:Showing 1 to 10 of 15893 (1590 Pages)

        
//Find (1590 Pages) from the given text(right bottom)..Pages numbers are not constant
         
         //Converting string to interger-->int =Interger.parseInt(String)
 /*     int totalpages=Integer.parseInt(totalpagestext .substring(totalpagestext.indexOf("(")+1,totalpagestext.indexOf("Pages")-1)) ;
       System.out.println("Total no.of pages:"+totalpages);
       
//Print til 5 pages out of 1590 pages
       
       for(int p=1;p<6;p++)  // upto 5 pages will display//     for(int p=1;p<totalpages;p++)-->will display all pages
      {
    	
    	  if(totalpages>1)
    	 {
    	WebElement	active_pages= driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));
    		 System.out.println("Active pages:"+active_pages.getText());
    		 
    	 }
     
       
  //No of rows in active in eachpage
     int  noOfrows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		System.out.println("total no of rows:"+noOfrows);
		for(int r=1;r<=noOfrows;r++) {
			String c_name=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
			System.out.println(c_name);
	}}*/
		
//No of checkbox  in eachpage
/*	int	noofcheckboxes=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
	System.out.println("total no of checkboxes:"+noofcheckboxes);
	for(int r=1;r<=noOfrows;r++) {
		String c_name=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[1]")).getText();
		System.out.println(c_name);*/
//}
       
 //click on checkbox if email is ceo@wolfchip.com
   	
   	List<WebElement> totaldata=driver.findElements(By.xpath("//div[@id='customer']//td"));
   	
   	for(WebElement text:totaldata)
   	{
   		String x=text.getText();
   	
   		if(x.equals("ceo@wolfchip.com"))
   		{
   			driver.findElement(By.xpath("//input[@type='checkbox' and @value='8215']")).click();
   		}
   	}
		
}}
