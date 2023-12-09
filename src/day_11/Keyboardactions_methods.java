package day_11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Keyboard action-to enter data and for copy and paste

public class Keyboardactions_methods {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//Create Oject of Actions
		Actions act=new Actions(driver);
		


/*To enter the uppercase letters
  act.keyDown(Keys.SHIFT);//to press the shift key
   act.keyUp(Keys.SHIFT); //Relase the shift key from press. or we can on capslockon*/
   
   
//Enter Firstname Field -Type in uppercase
		
	driver.findElement(By.xpath("//input[@name='name']")).click(); //click is used to place the curser on the filed
	act.keyDown(Keys.SHIFT);//press shift key
	act.sendKeys("Medapati");
	act.keyUp(Keys.SHIFT);//Release shift key
   act.perform();
   
//Enter Lastname Field
   
   driver.findElement(By.xpath("//input[@name='name'][2]")).click();
   act.sendKeys("Girija");
   act.perform();
   
//Enter Email
   
   driver.findElement(By.xpath("//input[@type='text'][3]")).click();
   act.sendKeys("demo@123");
   act.perform(); 
   
//password -Wriiting in uppercase
   
   driver.findElement(By.xpath("//input[@type='password']")).click();
   act.sendKeys("girija"); 
   act.perform();
   
//Repeat password-copy the password and paste i.e., ctrl A(select the data) , ctrl c and crtl v used in keyboard
   
   //Select the password data
    
   act.keyDown(Keys.CONTROL); //press the cntrl
   act.sendKeys("a"); //select all data of password "ctrl+A"
   act.keyUp(Keys.CONTROL);
   act.perform();
   
   //Copy the selected data
   
   act.keyDown(Keys.CONTROL);//Press the contol key
   act.sendKeys("c");//copy the selected data
   act.keyUp(Keys.CONTROL);//relese ctrl key
   act.perform();
   
   //Move to next field by using TAB form passowrd field to repeatpaswd field
   
   act.sendKeys(Keys.TAB);
   act.perform();
   
 //Paste in Repeat password Field
   
   act.keyDown(Keys.CONTROL);//ctrl key press
   act.sendKeys("v");// press v->ctrl v-tp paste
   act.keyUp(Keys.CONTROL);//ctrl key release
   act.perform();
   
   
   
   
   
		

	}

}
