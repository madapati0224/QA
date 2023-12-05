package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreatingMethods_andselect_checkbox_Radi_button {
	
	static WebDriver driver; //Inside the class declared the variable ,so that we can call to any method
   
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		Launch();
		Elements();
		TextBox();
		Checkbox();
		Radiobutton();
		close();
	}
		public static void Launch() {
			driver.get("https://demoqa.com/forms");
			
			driver.manage().window().maximize();
		}
		
	public static void Elements()  throws InterruptedException  { 
			driver.findElement(By.xpath("//div[@class='header-text']/following::div[1]")).click(); //click on Element
		   Thread.sleep(7000);

//validation-To check weather navigated to exact page or not
		  String Excpt_Title="DEMOQA";
		  String act_Title=driver.getTitle();
		  
			 if(act_Title.equals(Excpt_Title)) {
				 System.out.println("Test is pass:"+act_Title);
			 }else
			 {
				 System.out.println("Test is fail");
			 }
	}
	
   public static void TextBox()  throws InterruptedException {
			driver.findElement(By.xpath("//span[text()='Text Box']")).click();//click on text box
			Thread.sleep(7000);
		   driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("M aaaaa"); //Full name
		   driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Demo123@gmail.com");//Email
		   driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("door no:xxx");//Address
		   driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("permanentAddress yyy");//permanentAddress

//validation-To check weather navigated to exact page or not
		   String Excpt_Label1="Text Box";
		WebElement Label1= driver.findElement(By.xpath("//div[text()='Text Box']"));
		String act_Label1=Label1.getText();
		
		if(act_Label1.equals(Excpt_Label1))
		{
			System.out.println("Test pass:"+act_Label1);
		}else
		{
			System.out.println("Test fail");
		}
}
   
  //To select Checkbox and validate
		
public static void Checkbox()  throws InterruptedException {
			 driver.findElement(By.xpath("//span[text()='Check Box']")).click();
			 Thread.sleep(7000);
			 driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).click();
			 Thread.sleep(7000);
			 
//validation-To check weather navigated to exact page or not
			String excpt_label2="Check Box";
		WebElement Label2=driver.findElement(By.xpath("//div[text()='Check Box']"));
			String act_label2=Label2.getText();
			
		if(act_label2.equals(excpt_label2)) 
			{
				System.out.println("Test pass:"+act_label2);
			}else
			{
				System.out.println("Test fail");
			}	
	}

//To select Radiobutton and validate
			 
 public static void Radiobutton() throws InterruptedException    {
        
			// WebElement element =  driver.findElement(By.xpath("//span[contains(text(),'Check Box')]/following::*[1]"));
			 WebElement element =  driver.findElement(By.xpath("//span[text()='Radio Button']"));
			 Thread.sleep(7000);
				
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element); element.click();
			 Thread.sleep(7000);
			 
			 driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
			 Thread.sleep(7000);
			 
//validation-To check weather navigated to exact page or not
			 String excpt_label3="Radio Button";
			WebElement Label3= driver.findElement(By.xpath("//div[text()='Radio Button']"));
			String act_label3=Label3.getText();
			
			if(act_label3.equals(excpt_label3))
			{
				System.out.println("Test pass:"+act_label3);
			}else
			{
				System.out.println("Test fail");
			}
		 }
		
		
		public static void close() {
			driver.close();
		}

	

}
