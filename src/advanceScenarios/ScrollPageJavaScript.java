package advanceScenarios;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageJavaScript {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver; //downcasting driver object to JavascriptExecutor type
		
		for(int i=0; i<3; i++)
		{
			js.executeScript("window.scrollBy(0,800)");	//scrolling down 800 pixels
			Thread.sleep(1000);
		}
		for(int i=0; i<3; i++)
		{
			js.executeScript("window.scrollBy(0,-800)");	//scrolling up 800 pixels
			Thread.sleep(1000);
		}
		
		//we can scroll in both X and Y axis. To scroll horizontally give some value instead of "0"
	}

}
