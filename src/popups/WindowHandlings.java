package popups;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/* Scenario: Launch 'https://demo.automationtesting.in/Windows.html' URl-> Select [Open New Seperate Windows]
-> Click on [click] button-> New window with 'Selenium' title is opened-> Click on [Get Tickets]
->New window with 'Register - Selenium Conf' is opened-> Switch back to main window i.e. with title as 'Frames & windows'

Window currently in focus is called parent window. Other windows that are currently open are called child windows. 
getWindowHandles() function returns ids of all the windows opened at that moment. The return type is Set of strings.
Set is used because the insertion order is not preserved while opening multiple windows. 
*/
public class WindowHandlings {

	public static void main(String[] args) throws Throwable {

		ChromeOptions options=new ChromeOptions(); 
		options.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click(); 
		//with the above line, child window is opened but, focus is still on main window
		
		Thread.sleep(4000);
		
		Set<String> allId = driver.getWindowHandles();  	//returns the set of ids of all the windows(focused+child) that are open
		
		for(String childId:allId)		//random child window is selected each time since, order is not preserved in set
		{
			driver.switchTo().window(childId);  //switching the focus to child window to get its title
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Selenium"))		//searching for window with title as Selenium
			{
				break;						//will exit loop once we find the required window
			}
		}
		
		driver.findElement(By.xpath("//a[text()='Get Tickets']")).click();
		
		Thread.sleep(4000);

		Set<String> allId1 = driver.getWindowHandles();  	
		
		for(String childId:allId1)	
		{
			Thread.sleep(2000);
			driver.switchTo().window(childId);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Frames & windows"))		//searching for window with title as Frames & windows
			{
				break;
			}
		}
		
	}

}
