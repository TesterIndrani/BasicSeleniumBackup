package advanceScenarios;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExample {

	public static void main(String[] args) throws Throwable  {

		WebDriver driver = new ChromeDriver();

		//implicit wait is used every time a webpage is loaded through script
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.get("https://demo.actitime.com/login.do");  //internally implicit wait is called
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER); //internally implicit wait is called
		
		//explicit wait is used for a particular condition to be satisfied. Timeout=4 sec, Default polling time=0.5 sec
		driver.findElement(By.linkText("View Time-Track")).click();
		WebDriverWait expWait = new WebDriverWait(driver,Duration.ofSeconds(4));
		expWait.until(ExpectedConditions.titleContains("View Time-Track")); //condition: Title of Webpage is 'Enter Time-Track'

		
		//fluent wait is similar to explicit wait except, polling time is customisable. Timeout=4 sec, polling time=2 sec
		driver.findElement(By.linkText("Lock Time-Track")).click();
		FluentWait fluWait = new FluentWait(driver);
		fluWait.withTimeout(Duration.ofSeconds(4));
		fluWait.pollingEvery(Duration.ofSeconds(2));
		fluWait.until(ExpectedConditions.titleContains("Lock Time-Track"));
		
		//java wait is used for fixed amount of wait time
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}
}
