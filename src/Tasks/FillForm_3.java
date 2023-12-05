package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm_3 {

	public static void main(String[] args) throws InterruptedException {
//launch browser		
		WebDriver driver=new ChromeDriver();
//Open url		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
        Thread.sleep(5000);
//Maximize screen        
        driver.manage().window().maximize();
//First name field       
        driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Medapati");
//Last name field       
        driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Girija");
//mobile number field        
        driver.findElement(By.id("RESULT_TextField-3")).sendKeys("0123456789");
//country field       
     //   driver.findElement(By.name("RESULT_TextField-4")).sendKeys("India");
        driver.findElement(By.cssSelector("input#RESULT_TextField-4")).sendKeys("India");
//city field        
        driver.findElement(By.name("RESULT_TextField-5")).sendKeys("Vizag");
         
          
        driver.findElement(By.id("RESULT_TextField-6")).sendKeys("demo123@gmail.com");
        
//Select the gender 
       driver.findElement(By.xpath("//*[@id=\'q26\']/table/tbody/tr[2]/td/label")).click();
        
        
        
        
        
        
	}

}
