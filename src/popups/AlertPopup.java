package popups;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/* Scenario: To handle Alert pop-up
Login to ActiTime-> Click on Settings-> Click on 'Types of Work'-> Click on [Create Type of Work]
-> Enter name-> Press [Cancel]-> Alert Pop-up appears-> Click on [OK] or [Cancel] */

public class AlertPopup {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'button_settings')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Types of Work")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Indrani");
		driver.findElement(By.xpath("//input[contains(@value,' Cancel')]")).click();
	
		Alert alt = driver.switchTo().alert();	//to switch the focus to Alert pop-up
		Thread.sleep(2000);
	     String text = alt.getText();
	     System.out.println(text);
	     alt.accept();		//To select [OK]
		//alt.dismiss();	//To select [Cancel]	
	}
}
