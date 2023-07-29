package advanceScenarios;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) throws Throwable {

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			//List<WebElement> allLinks = driver.findElements(By.xpath("//a")); OR
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));

			
			int count =0;
			//forEach loop
			for(WebElement wb:allLinks)
			{
				System.out.println(wb.getText());
				count++;
			}
			
			System.out.println("Total no of Links: "+ count);
		
	}
	
}


