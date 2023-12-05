package day9;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle_switch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome"," C:\\Users\\HP\\Downloads\\chromedriver-win64.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//getwindowHandle(): It will return the single window id.
		
//	String id=	driver.getWindowHandle();
//	System.out.println("Particular window id:"+id);//65AF3DCDDC93A7E16DAEB9D145B6CE89

//--------------------------------------New Tab--------------------------------------------
	
//getwindowHandles(): It will return the multiple window ids.
		
/*	driver.findElement(By.xpath("//button[text()='New Tab']")).click();
   
	Set<String> ids=driver.getWindowHandles();
	
		
//Lets Switch from one window to other window by using switchTo():
	//We can switch in 2 ways by using Iteration and by using List
	
//method1:Iterator:
	
	Iterator<String> ids1=ids.iterator();
	
	String parent=ids1.next();
	String child=ids1.next();
	
//	System.out.println("parent window id:"+parent);//27E6BEC83F03800071336AEC8440BEBC
//	System.out.println("child window id:"+child);//CE635990AD2937FF2D300E2EAD36FA80*/
	
//switch from parent to child
	
	//String childurl= driver.switchTo().window(child).getCurrentUrl();
	//System.out.println("child window url:"+childurl);//child window url:https://demoqa.com/sample
	
//switch from child to parent
	
   //	parenturl=driver.switchTo().window(parent).getCurrentUrl();
 //   System.out.println("child window url:"+parenturl);*///child window url:https://demoqa.com/browser-windows
	
//--------------------------------------windowButton----------------------------------	
//method2:List
/*driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		

	Set<String> ids=driver.getWindowHandles();//multiple ids
		
	List<String> ids2=new ArrayList(ids);
	
	String parent=ids2.get(0);
	String child=ids2.get(1);
	
	System.out.println("parent window id:"+parent);
	System.out.println("child window id:"+child);

//switch from parent to child
	String childurl=driver.switchTo().window(child).getCurrentUrl();
	System.out.println("Childurl:"+childurl);
	
//switch from child to parent
	String parenturl=driver.switchTo().window(parent).getCurrentUrl();
	System.out.println("parenturl:"+parenturl);*/
	
	//--------------------------messageWindowButton------------------------------------
	
driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();

Set<String> ids=driver.getWindowHandles();//multiple ids

List<String> ids3=new ArrayList(ids);

String parent=ids3.get(0);
String child=ids3.get(1);

System.out.println("parent window id:"+parent);
System.out.println("child window id:"+child);

//switch from child to parent
	String parenturl=driver.switchTo().window(parent).getCurrentUrl();
	//Thread.sleep(5000);
	System.out.println("parenturl:"+parenturl);////demoqa.com/browser-windows

//switch from parent to child
	int childhashcode=driver.switchTo().window(child).hashCode();
	//Thread.sleep(5000);
	System.out.println("childhashcode:"+childhashcode);//1498016680
	

		
	
	
	
	
	
	
		
		
		
		
		
		
		
	}

}
