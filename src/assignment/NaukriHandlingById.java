package assignment;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
/* Scenario: Launch Naukri URL-> Hover over 'Jobs'-> Click on 'Jobs by skill' will navigate to 'Browse Jobs by IT/Non-IT Skills'
-> Click on 'Services' will open new window 'Resume Writing Services'-> Get the title of that window
-> navigate back to 'Browse Jobs by IT/Non-IT Skills' page and get the title of the window
*/

public class NaukriHandlingById {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();	
		
		Actions act = new Actions(driver);	//creating virtual cursor
		WebElement data = driver.findElement(By.xpath("//div[text()='Jobs']"));
		act.moveToElement(data).perform();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Jobs by skill']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		Thread.sleep(1000);	
		
		String mainId = driver.getWindowHandle(); 	//id of main window
		String mainTitle = driver.getTitle();
		
		//switching to 'Resume Writing Services' window
		Set<String> allId = driver.getWindowHandles(); 	
		for(String id:allId)	
		{
			Thread.sleep(2000);
			if(!mainId.equals(id))		//to check main window is not selected
			{
				driver.switchTo().window(id);
				String childTitle = driver.getTitle();
				System.out.println("Child window Id: "+id+ "\nChild window Title: "+childTitle);
				break;
			}			
		}
		
		//switching back to 'Browse Jobs by IT/Non-IT Skills' window
		driver.switchTo().window(mainId);
		System.out.println("Main window Id: "+mainId+ "\nMain window Title: "+mainTitle);
	}
}
