package Tasks;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myshop_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
//No.of slides available
		
		List<WebElement> Slides=driver.findElements(By.className("homeslider-container"));
		System.out.println("No.of sliders avaliable:"+Slides.size());
		
//No.of images available
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("No.of images avaliable:"+images.size());
		
//No.of Links available
		
            List<WebElement> Links=  driver.findElements(By.tagName("a"));
            System.out.println("No.of Links avaliable:"+Links.size());
	}

}
