package day_14;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
//method 1 to take screenshot
		
	/*	//convert the webdriver object to take screenshot
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		
		//call getscreenshot method to take screen shot
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		
		//move the image to new location
		File Destination=new File("C:\\Users\\HP\\Desktop\\Screenshots\\img1.jpg");
		
		//copy from source to destination
		Files.copy(source, Destination); */
		
//method 2 to take screenshot
		
	/*	File screenshot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Files.copy(screenshot1, new File("C:\\Users\\HP\\Desktop\\Screenshots\\img2.jpg"));
		Files.copy(screenshot1, new File("D:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\Screenshot\\img2.png"));*/
		
		
//method 3 to take screenshot
		
		TakesScreenshot screenshot2=((TakesScreenshot)driver);
		File source1=screenshot2.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\screenshot\\image3"+".png";
		Files.copy(source1, new File(destination)); 




	}

}
