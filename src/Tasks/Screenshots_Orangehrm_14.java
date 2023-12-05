package Tasks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

/*Task:
1. Open url: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
2. take screenshot
3. login to the application
4. take screenshot*/

public class Screenshots_Orangehrm_14 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
//full screenshot -TakesScreenshot-->It is a Interface
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE); //screenshot file wil store in src folder but we dont know where it will store so we will create our own location

//Create a file
	 //created own location
         File target=new File("D:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\Screenshot\\img1.png");

         //copy from src to target file which we created		
		Files.copy(src, target);
		
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();

Thread.sleep(1000);

//full screenshot -TakesScreenshot-->It is a Interface

		TakesScreenshot ts1=(TakesScreenshot)driver;
		File src1=ts.getScreenshotAs(OutputType.FILE); //screenshot file wil store in src folder but we dont know where it will store so we will create our own location

//Create a file
		
       File target1=new File("D:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\Screenshot\\img2.png");

       //copy from src to target file which we created		
		Files.copy(src1, target1);
		
		
		

	}

}
