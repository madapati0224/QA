package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyr_Form_4 {

	public static void main(String[] args) throws InterruptedException {
	
//launch browser	
		ChromeDriver driver=new ChromeDriver();
		
//open url
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//By using Xpath operator--> <=  -first name
		driver.findElement(By.xpath("//input[@maxlength<=10]")).sendKeys("Girija");
		
//By using Xpath condition--> AND	-last name	
		driver.findElement(By.xpath("//input[@maxlength=15and@name='name']")).sendKeys("Medapati");

//By using xpath Axes-->following sibling -email
driver.findElement(By.xpath("//*[@name='name']/following::input[2]")).sendKeys("Demo1@gmail.com");

//By using xpath Axes-->Preceding sibling  -Password
	driver.findElement(By.xpath("//*[@for='psw-repeat']/preceding::input[1]")).sendKeys("xxxx@1234");	  

//By using xpath Axes-->following sibling -Repeat Password   
	driver.findElement(By.xpath("//*[@type='password']/following::input[1]")).sendKeys("xxxx@1234");

	
//By using xpath Axes-->following sibling -Refresh
	//driver.findElement(By.xpath("//*[@maxlength=10]/following::input[5]")).click();
	
	}

}
