package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//finding username element using id() as Locator 
	   	 driver.findElement(By.id("username")).sendKeys("admin");
				
		//finding password element using name() as Locator 
		 driver.findElement(By.name("pwd")).sendKeys("manager"); 
		//-OR- driver.findElement(By.className("textField pwdfield")).sendKeys("manager");- didn't work

		//finding Login element using id() or className() as Locator
		//driver.findElement(By.id("loginButtonContainer")).click();
		//driver.findElement(By.id("loginButton")).click();
		  driver.findElement(By.className("initial")).click();
		  
		  Thread.sleep(2000);
		  
		  //finding View Time-Track element using linkText()
		 // driver.findElement(By.linkText("View Time-Track")).click();
		  
		  //finding View Time-Track element using partialLinkText()		 
		  driver.findElement(By.partialLinkText("View Time")).click();	  
	}
}
