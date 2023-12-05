package day7;
//When selection tag is not present then how to select multiple text from dropdown.

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelectionclass {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\HP\\Downloads\\chromedriver-win64.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.findElement(By.xpath("//Select[@id='ide']"));
	
	List<WebElement> muldrpdwn=driver.findElements(By.xpath("//select[@id='ide']//option"));
	
//To find total elements in dropdown
	
	//int totleleindwn=  muldrpdwn.size();
	
	//System.out.println(totleleindwn);
	
//print all the options from dropdown
			//For loop
		/*	for(int i=0;i<muldrpdwn.size();i++) {
		String names=muldrpdwn.get(i).getText();
		System.out.println(names);
			}*/
		//For each
	/*	for(WebElement names:muldrpdwn){
			System.out.println(names.getText());*/
		
//select options from dropdown
	
	//For loop
	
/*	for(int i=0;i<muldrpdwn.size();i++)
	{
		String option=muldrpdwn.get(i).getText();
					
		if(option.equals("IntelliJ IDEA") || option.equals("NetBeans"))
		{
			muldrpdwn.get(i).click();
		}		

	}*/
	
	//for each loop
	
		for(WebElement names1:muldrpdwn) {
			String text=names1.getText();
			if(text.equals("IntelliJ IDEA") || text.equals("NetBeans"))
			{
				names1.click();
			}
	}


}}