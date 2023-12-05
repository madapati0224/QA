package Tasks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Task:
 *click on checkbox if the company name is amazon and
 * click on know more link in selenium company row
*/

public class Static_WebTables_12 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//how many number of rows in table
		
	int t_rows=	driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
	System.out.println("Total table rows:"+t_rows);
	
//how many number of colums in table
	
	int t_col=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	System.out.println("Total table columns:"+t_col);
	
//Reterive Amazon cell
	
	String companyname=driver.findElement(By.xpath("//table[@id='customers']//tr[3]//td[2]")).getText();
	System.out.println("company name:"+companyname);
	
//click on checkbox if the company name is amazon
	
	List<WebElement> tdata=driver.findElements(By.xpath("//table[@id='customers']//td"));
	
	for(WebElement x:tdata) {
		
		String value=x.getText(); //in value all td datas stored
		
		if(value.equals("Amazon"))
		{
			driver.findElement(By.xpath("//td[text()='Amazon']/preceding-sibling::td/input")).click();
		}
		
	}
	
//click on know more link in selenium company row
	
	driver.findElement(By.xpath("//td[text()='Selenium']/following-sibling::td[3]")).click();
		
		

	}

}
