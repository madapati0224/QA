package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

/*Task:
1. open url: https://adactinhotelapp.com/index.php
2. login to application
3. select the dropdown values after login
username: vamshinani
password: Vamshi@133
*/

public class Dropdowns_Adactin_selectmultiele_8 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.driver.chrome"," C:\\Users\\HP\\Downloads\\chromedriver-win64.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://adactinhotelapp.com/index.php");
	
	//driver.findElement(By.id("username")).sendKeys("vamshinani");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vamshinani");
	
	//driver.findElement(By.id("password")).sendKeys("Vamshi@133");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vamshi@133");
	
	//driver.findElement(By.id("login")).click();
	driver.findElement(By.xpath("//input[@id='login']")).click();
	
	driver.findElement(By.xpath("//Select[@name='location']"));
	
	
		Select loc =new Select(driver.findElement(By.xpath("//Select[@name='location']")));
			loc.selectByValue("Sydney");
			
		Select Hotel=new Select(driver.findElement(By.xpath("//Select[@name='hotels']")));
		  Hotel.selectByIndex(2);
	
		 Select RoomType=new Select(driver.findElement(By.xpath("//Select[@name='room_type']")));
		 RoomType.selectByVisibleText("Deluxe");
		 
		 Select Noofrooms=new Select(driver.findElement(By.xpath("//Select[@name='room_nos']")));
		  Noofrooms.selectByIndex(4);
		  
		  Select Adultsperroom=new Select(driver.findElement(By.xpath("//Select[@name='adult_room']")));
		  Adultsperroom.selectByValue("2");
		  
		  Select ChildrenperRoom=new Select(driver.findElement(By.xpath("//select[@name='child_room']"))); 
	      ChildrenperRoom.selectByVisibleText("None");
	}   

}
