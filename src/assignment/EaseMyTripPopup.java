package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//NOT WORKING


public class EaseMyTripPopup {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.partialLinkText("Hotels")).click();
		
			//	driver.findElement(By.cssSelector("[id='htl_dates']")).click();
			
			//driver.findElement(By.xpath("//div[@class='htl_dates' and @id='htl_dates']")).click();
		
			driver.findElement(By.cssSelector("[id='btnSearch']")).click();
				
				Thread.sleep(5000);
				driver.quit();
	}

}
