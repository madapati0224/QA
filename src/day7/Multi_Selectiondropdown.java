package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//day 8 class
public class Multi_Selectiondropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\HP\\Downloads\\chromedriver-win64.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		
//we can select multiple elements from the dropdown.
		
		Select ide=new Select(driver.findElement(By.xpath("//Select[@id='ide']")));
		
//check condition
		
	/*	if(ide.isMultiple()) {
			ide.selectByIndex(0); //Eclipse
			ide.selectByIndex(1);  //IntelliJ IDEA
			ide.selectByIndex(3); //NetBeans   */  
		
		
	/*	if(ide.isMultiple()) {
			ide.selectByValue("vs");
			ide.selectByValue("ec"); */
		
	/*	if(ide.isMultiple()) {
			ide.selectByVisibleText("IntelliJ IDEA");
			ide.selectByVisibleText("NetBeans");*/
			
//To know list of elements
			
			List<WebElement> listele=ide.getOptions();
			
			System.out.println("Total element:"+listele.size()); //4 
			
//To display element with their names	
			
			for(int i=0;i<=4;i++)
			{
			String names=listele.get(i).getText();
			System.out.println("List of names:"+names);
				
			}
		

			
			
		}
		
		

	}


