package advanceScenarios;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Robot class to handle keyboard action with multiple keys simultaneously 
Manual Scenario: Pass "trainee" to username box-> Select all using Ctrl+A in username box
-> Copy the text selected using Ctrl+C-> press TAB-> Paste the copied text using Ctrl+V -> press ENTER to login */  

public class RobotClassExample {

	public static void main(String[] args) throws Throwable {

		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("trainee");
		Robot r = new Robot();	
	//this class has 2 non-static methods(keyPress and keyRelease)..so we need to create object to access them
		
		//pressing Ctrl+A and then releasing Ctrl+A
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(1000);
		//pressing Ctrl+C and then releasing Ctrl+C
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(1000);
		//pressing Tab and then releasing Tab
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);
		//pressing Ctrl+V and then releasing Ctrl+V
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//pressing Enter and then releasing Enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
