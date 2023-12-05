package Tasks;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calenders_16_17 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='third_date_picker']")).click();
		
		int day=03;
		Select sc=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		 
		sc.selectByVisibleText("Nov");
		//sc.selectByValue("9");//oct
		
		Select sc1=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		sc1.selectByValue("2022");
		
//xpath for date table and for date 
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
		
	}

}
