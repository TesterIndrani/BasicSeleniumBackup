package assignment;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
/* Scenario: Launch Naukri URL-> Hover over 'Jobs'-> Click on 'Jobs by skill' will navigate to 'Browse Jobs by IT/Non-IT Skills'
 -> Click on 'Services' will open new window 'Resume Writing Services'-> Get the title of that window
 -> navigate back to 'Browse Jobs by IT/Non-IT Skills' page and get the title of the window
*/
public class NaukriHandling {

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

		//switching to 'Resume Writing Services' window
		Set<String> allId = driver.getWindowHandles();  	
		for(String childId:allId)	
		{
			Thread.sleep(2000);
			driver.switchTo().window(childId);
			String title = driver.getTitle();
			if(title.contains("Resume Writing Services"))
			{
				System.out.println(title);
				break;
			}
		}
		
		//switching back to 'Browse Jobs by IT/Non-IT Skills' window
		Set<String> allId1 = driver.getWindowHandles();  		
		for(String childId:allId1)	
		{
			Thread.sleep(2000);
			driver.switchTo().window(childId);
			String title = driver.getTitle();
			if(title.contains("Browse Jobs by IT/Non-IT Skills"))
			{
				System.out.println(title);
				break;
			}
		}
		
	}
}
