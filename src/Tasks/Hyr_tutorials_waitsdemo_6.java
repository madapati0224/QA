package Tasks;
import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		public class Hyr_tutorials_waitsdemo_6 {
     public static void main(String[] args) {
				 WebDriver driver=new ChromeDriver();
				 
				 driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
				 driver.manage().window().maximize();
				 
//-------------------------------Implicit_wait-------------------------------------------
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Textbox1 :
		driver.findElement(By.id("btn1")).click(); 
		driver.findElement(By.id("txt1")).sendKeys("Medapati");

		//-----------------------------Explicit_wait--------------------------------------------
		//Textbox2 : Within 5secons its not able to find the element ,so applied Explicit_wait to find that particular element

		//Declaration		 
				 WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				 
		driver.findElement(By.id("btn2")).click();

		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));

		driver.findElement(By.id("txt2")).sendKeys("Girija");
		
	//	driver.close();
				 
				 
				 


			

		

	}

}
