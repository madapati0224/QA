package Tasks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* we can Handle and switch windows in 2 ways
 * By converting set to List
 * By using Iterator
 */

public class HYR_tutorial_windowHandles_9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\HP\\Downloads\\chromedriver-win64.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//-------------to get current window id----------------
	//String currentid=driver.getWindowHandle();
	//System.out.println("Current window id:"+currentid);//23AF9AF5D28625031E7465738BFAD67D
	
//------------to get multiple window ids--------------
		
//------------------------------newWindow--------------------------------------------
		
/*	driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
 * 
	Set<String> ids=driver.getWindowHandles();//Multipe ids will return
	//System.out.println("multiple window ids:"+ids);//[8547823CA2B284D440CF97DAD8A2B0F2, 87AB1D061DCDAA441E375625F1FE0D91]
	
	List<String> winids=new ArrayList(ids);
	String parent=winids.get(0);
	String child=winids.get(1);
	
	System.out.println("Parent id:"+parent);//Parent id:2670D13A2BBD8A4269AEAEC71271B5C3
	System.out.println("Child id:"+child);//Child id:ECDA47AD99E9284D6CF1A2681DBE0819
	

//	Swtich from child to parent
 Thread.sleep(5000);
	String parenturl=driver.switchTo().window(parent).getCurrentUrl();
	System.out.println("Parent url:"+parenturl);
	
	
//Swtich from parent to child
 Thread.sleep(5000);
	String Childurl=driver.switchTo().window(child).getCurrentUrl();
	System.out.println("Child url:"+Childurl);
	*/
		
//----------------------------------Open newTab--------------------------------------
	/*	driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		
	Set<String>	ids=driver.getWindowHandles();//Multipe ids will return
	
   Iterator<String> ids2=ids.iterator();
   
   String parent=ids2.next();
   String child=ids2.next();
   
   System.out.println("Parent:"+parent);
   System.out.println("Child:"+child);
   
 //Child to parent
   Thread.sleep(5000);
 String parent_title= driver.switchTo().window(parent).getTitle();
 System.out.println("Parent Tiltle:"+parent_title); //Parent Tiltle:Window Handles Practice - H Y R Tutorials
 
 Thread.sleep(5000);
 String child_Tilte=driver.switchTo().window(child).getTitle();
 System.out.println("Child Title:"+child_Tilte); //Child Title:AlertsDemo - H Y R Tutorials */
		
//--------------------------Open multiple windows-----------------------------
		
/*	driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
 
   Set<String> ids=driver.getWindowHandles();//Multipe ids will return
   
   List<String> ids3=new ArrayList(ids);
   
   String parent=ids3.get(0);
   String child1_win=ids3.get(1);
   String child2_win=ids3.get(2);
   
   System.out.println("Parent id:"+parent);
   System.out.println("child1_win id:"+child1_win);
   System.out.println("child2_win id:"+child2_win);
   
//Switch child to parent
 
   Thread.sleep(5000);
  String parenturl= driver.switchTo().window(parent).getCurrentUrl();
  System.out.println("Parent URL:"+parenturl);//www.hyrtutorials.com/p/window-handles-practice.html

//Switch parent to child1_win 
  Thread.sleep(5000);
  String child1_winurl=driver.switchTo().window(child1_win).getCurrentUrl();
  System.out.println("Child1 URL:"+child1_winurl);//www.hyrtutorials.com/p/add-padding-to-containers.html
  
//Switch child1_win to child2_win
  Thread.sleep(5000);
  String child2_winurl=driver.switchTo().window(child2_win).getCurrentUrl();
  System.out.println("Child2 URL:"+child2_winurl); //www.hyrtutorials.com/p/basic-controls.html*/
		
//-------------------------------------Open multiple Tabs----------------------------------------

driver.findElement(By.xpath("//button[@id='newTabsBtn']")).click();
	
	Set<String> ids=driver.getWindowHandles();//Multipe ids will return
	
Iterator<String> ids4=ids.iterator();

String parent=ids4.next();
String child1_tab=ids4.next();
String child2_tab=ids4.next();

System.out.println("Parent id:"+parent);
System.out.println("child1_tab id:"+child1_tab);
System.out.println("child2_tab id:"+child2_tab);

//child to parent
Thread.sleep(5000);
String parent_Title=driver.switchTo().window(parent).getTitle();
System.out.println("Parent Tilte:"+parent_Title);//Window Handles Practice - H Y R Tutorials

//Parent to child1_tab
Thread.sleep(5000);
String Child1_Title=driver.switchTo().window(child1_tab).getTitle();
System.out.println("Child1 Tilte:"+Child1_Title);//Basic Controls - H Y R Tutorials

//child1_tab to child2_tab
Thread.sleep(5000);
String Child2_Title=driver.switchTo().window(child2_tab).getTitle();
System.out.println("Child2 Tilte:"+Child2_Title);//AlertsDemo - H Y R Tutorials
	
//----------------------Open multiple Tabs and Windows-----------------------------------------
/*	driver.findElement(By.xpath("//button[@id='newTabsWindowsBtn']")).click();
	
Set<String>ids=driver.getWindowHandles(); //Multipe ids will return
	
List<String> ids5=new ArrayList(ids);

String parent=ids5.get(0);
String child1=ids5.get(1);
String child2=ids5.get(2);
String child3=ids5.get(3);
String child4=ids5.get(4);

System.out.println("Parent id:"+parent);
System.out.println("Child1 id:"+child1);
System.out.println("Child2 id:"+child2);
System.out.println("child3 id:"+child3);
System.out.println("child4 id:"+child4);

//Child to parent
Thread.sleep(5000);
String par_url=driver.switchTo().window(parent).getCurrentUrl();
System.out.println("parent_url:"+par_url);//https://www.hyrtutorials.com/p/window-handles-practice.html

//parent to child1
Thread.sleep(5000);
String child1_Url=driver.switchTo().window(child1).getCurrentUrl();
System.out.println("child1_Url:"+child1_Url);//https://www.hyrtutorials.com/p/alertsdemo.html

//child1 to child2
Thread.sleep(5000);
String child2_Url=driver.switchTo().window(child2).getCurrentUrl();
System.out.println("child2_Url:"+child2_Url);//https://www.hyrtutorials.com/p/basic-controls.html

//child2 to child3
Thread.sleep(5000);
String child3_Url=driver.switchTo().window(child3).getCurrentUrl();
System.out.println("child3_Url:"+child3_Url);//https://www.hyrtutorials.com/p/add-padding-to-containers.html

//child3 to child4
Thread.sleep(5000);
String child4_Url=driver.switchTo().window(child4).getCurrentUrl();
System.out.println("child4_Url:"+child4_Url);//https://www.hyrtutorials.com/p/contactus.html*/






   
   
	

	}

}
