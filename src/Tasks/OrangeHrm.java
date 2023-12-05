package Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		1) Launch browser
		2) open url
			https://opensource-demo.orangehrmlive.com/
		3) Provide username  - Admin
		4) Provide password  - admin123
		5) Click on Login button */
		
//1) Launch browser		
		WebDriver driver=new ChromeDriver();
		
//2) open url
		//https://opensource-demo.orangehrmlive.com/
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		
//maximize screen
		driver.manage().window().maximize();
		
//3) Provide username  - Admin
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
//4) Provide password  - admin123
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
//5) Click on Login button
		
driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		


		
		
		
		

	}

}
