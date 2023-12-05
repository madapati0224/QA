package day_12_13;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*Tagname table: table
 * Table rows: tr
 * Table header: th
 * Single cell Table data: td
 * Entire table data: tbody(to know that row total data)
 * we have 2 tyes of tables:1.Static webtable(constant) 2.Dynamic webtable(everytime changes in the table)
*/

public class StaticWebTables {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//how many number of rows in table
		
	int trows= driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
	System.out.println("Total no .of row in a table:"+trows);
	
//how many number of columns in table
	
	int tcolumns=driver.findElements(By.xpath("//table[@id='customers']//th")).size();//if we count headers we can know total colums
	System.out.println("Total no .of columns in a table:"+tcolumns);
	
//To Retrive total data contained in the table
	
	System.out.println("Status"+"  "+"Company"+"  "+"Contact"+"  "+"Country"+"  "+"Action")	;//Header names in 1st row
	
	for(int r=2;r<=trows;r++) { //1st row contains the header and not data<td.we want data so we started from 2nd row
		for(int c=1;c<=tcolumns;c++) {
			
	
	String tdata=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td["+c+"]")).getText();
	   System.out.print(tdata +" ");
		}
	   System.out.println();
	}
	
//Reterive Bangalore cell
	
	String placename=driver.findElement(By.xpath("//table[@id='customers']//tr[4]//td[4]")).getText();
	System.out.println(placename);
	
//click on checkbox if the company name is ola
	
/*List<WebElement>  tabledata=driver.findElements(By.xpath("//table[@id='customers']//td"));

for(WebElement x:tabledata)
{
	String value=x.getText();
	if(value.equals("Ola"));{
		driver.findElement(By.xpath("//td[text()='Ola']//preceding-sibling::td//input")).click();
	}
	
//To Retrive 'know more' in ola row
	
	//driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td//a")).click();//or
	driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td[3]")).click(); */
	
// Print company names whose contact is opensource 
	
	for(int r=2;r<=trows;r++)
	{
	String contact =driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td[3]")).getText();//row changes and column same
	//System.out.println(value1); //Displays all contact names
	
	if(contact.equals("Open Source"))
	{
		String company =driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td[2]")).getText();
		System.out.println(contact+"     "+company);
	}
	
	}
	
//print company names which are in USA country
	
	for(int r=2;r<=trows;r++)
	{
	String	country=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td[4]")).getText();
	//System.out.println(country);
	if(country.equals("USA"))
	{
		String	companynames=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td[2]")).getText();	
	System.out.println(country+"   "+companynames);
	}
	}
	

	
}
	
	
	
	
		}
			
		
	
	
	
		
		

	


