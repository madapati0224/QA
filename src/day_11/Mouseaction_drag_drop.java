package day_11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction_drag_drop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/droppable");
	
//Create object for Actions
		Actions act=new Actions(driver);
		
//---------------------------------SIMPLE------------------------------------------------
		
/*	WebElement From=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement To=driver.findElement(By.xpath("//div[@id='droppable'][1]"));
	
	act.dragAndDrop(From, To).perform();*/
	
//------------------------------ACCEPT---------------------------------------------------
	/*driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']")).click();
	
	WebElement from=driver.findElement(By.xpath("//div[@id='acceptable']"));
	WebElement to =driver.findElement(By.xpath("//div[@id='droppableExample-tabpane-accept']/descendant::div[5]"));
	act.dragAndDrop(from, to).perform();
	
	
	WebElement from1=driver.findElement(By.xpath("//div[@id='notAcceptable']"));
	WebElement to1 =driver.findElement(By.xpath("//div[@id='droppableExample-tabpane-accept']/descendant::div[5]"));
	act.dragAndDrop(from1, to1).perform();*/
	
//--------------------------------------Prevent Propogation----------------------------------------
	driver.findElement(By.xpath("//a[contains(text(),'Prevent' )]")).click();
	
	
	
	/*WebElement From1=driver.findElement(By.xpath("//div[@id='ppDropContainer']/child::div[@id='dragBox']"));
	WebElement Too=driver.findElement(By.xpath("//div[@id='ppDropContainer']/descendant::div[@id='notGreedyDropBox']"));
	act.dragAndDrop(From1, Too).perform();*/
	
	WebElement From1=driver.findElement(By.xpath("//div[@id='dragBox']"));
	WebElement Too=driver.findElement(By.xpath("//div[@id='notGreedyDropBox']"));
	act.dragAndDrop(From1, Too).perform();
	
	
	/*driver.navigate().refresh();
	driver.findElement(By.xpath("//a[contains(text(),'Prevent' )]")).click();
	
	WebElement FroM1=driver.findElement(By.xpath("//div[@id='ppDropContainer']/child::div[@id='dragBox']"));
	WebElement Too1=driver.findElement(By.xpath("//div[@id='ppDropContainer']/descendant::div[@id='greedyDropBox']"));
	act.dragAndDrop(FroM1, Too1).perform();*/
 
//------------------------------Revert Draggable---------------------------------------------
/*	driver.findElement(By.xpath("//a[@id='droppableExample-tab-revertable']")).click();
	
	WebElement From2=driver.findElement(By.xpath("//div[@id='revertable']"));
	WebElement To2=driver.findElement(By.xpath("//div[@id='droppableExample-tabpane-revertable']/descendant::div[5]"));
	act.dragAndDrop(From2, To2).perform();
	
	
	WebElement from3=driver.findElement(By.xpath("//div[@id='notRevertable']"));
	WebElement to3=driver.findElement(By.xpath("//div[@id='droppableExample-tabpane-revertable']/descendant::div[5]"));
	act.dragAndDrop(from3, to3).perform();*/
	
	
	

	}

}
