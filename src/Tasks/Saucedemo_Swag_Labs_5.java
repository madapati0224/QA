package Tasks;

/*Task:
1. Launch https://www.saucedemo.com/
2. Login
3. Logout
**credentials are on the website*/

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo_Swag_Labs_5 {
	
	static WebDriver driver; //outside the main method we have declared to access the object in every method
	
public static void main(String[] args)throws InterruptedException {
		driver=new ChromeDriver();
		Launch();
		textbox();
		Login();
		open_menu();
		Logout();
		close();
	}
   public static void Launch() {
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	public static void textbox() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		
//Checking weather navigating to Swag Labs page or not
		
	String Excpt_Title="Swag Labs";
	WebElement title=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
	String act_Title=title.getText();
	
	if(act_Title.equals(Excpt_Title))
	{
		System.out.println("Test pass:"+act_Title);
	}else
	{
		System.out.println("Test fail:"+act_Title);	
	}
		
}
	
	public static void Login() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='login-button']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
}
	
	public static void open_menu() throws InterruptedException   {
		
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(3000);

//Checking weather navigating to Products page or not
		
		String Excpt_label="Products";
	WebElement product_label=driver.findElement(By.xpath("//span[text()='Products']"));
	String act_label=product_label.getText();
	
	if(act_label.equals(Excpt_label))
	{
		System.out.println("Test pass:"+act_label);
	}else
	{
		System.out.println("Test fail:"+act_label);
	}
		
}
	
	public static void Logout()  throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='Logout']")).click(); //Inner text used
		Thread.sleep(3000);
	}
	
	public static void close() {
		driver.close();
	}
	

		
	
		
		

	

}
