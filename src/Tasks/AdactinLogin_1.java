package Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinLogin_1 {

	public static void main(String[] args) throws InterruptedException {

		/*
		1) Launch browser
		2) open url
			https://adactinhotelapp.com/
		3) Provide username  - Batch018 
		4) Provide password  - admin123
		5) Click on Login button */

//1) Launch browser
		 
		WebDriver driver=new ChromeDriver();
		
//2) open url
		// https://adactinhotelapp.com/
		
		driver.get("https://adactinhotelapp.com/");
		
		Thread.sleep(5000);
		
//maximize the window
		
		driver.manage().window().maximize();
		
//3) Provide username  - Admin
		
		//WebElement id=driver.findElement(By.id("username"));//By using attribute id
		//id.sendKeys("Batch018");
		
		WebElement name=driver.findElement(By.name("username"));//By using attribute name
		name.sendKeys("Batch018");
		
		
		
//4) Provide password  - admin123
		//WebElement pswdid=driver.findElement(By.id("password"));//By using attribute id
		//pswdid.sendKeys("admin123");
		
		WebElement pswdname=driver.findElement(By.name("password"));//By using attribute name
		pswdname.sendKeys("admin123");
		
	
		
//5) Click on Login button
	//driver.findElement(By.id("login")).sendKeys(Keys.ENTER);//By using attribute id
	driver.findElement(By.name("login")).sendKeys(Keys.ENTER);//By using attribute name
    
	
//Navigation methods:

	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);

	//1.To navigate from one application to other application
			driver.navigate().to("https://www.flipkart.com/");
			Thread.sleep(5000);	
			
	//2.To navigate backward
			driver.navigate().back();
			
	//3.To navigate forward
			driver.navigate().forward();
			
	//4.To navigate and refresh
			driver.navigate().refresh();
	}

}
