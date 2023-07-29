package advanceScenarios;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestionsEx2 {

		public static void main(String[] args) throws Throwable {


			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("//button[text()='No thanks']")).click();
			
			//driver.findElement(By.xpath("//div[@aria-label='No thanks']")).click();
			//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
			//List<WebElement> allLinks = driver.findElements(By.tagName("b"));
			driver.findElement(By.name("/q")).sendKeys("selenium");
			Thread.sleep(2000);


			List<WebElement> allLinks = driver.findElements(By.xpath("//b"));

			for(WebElement wb:allLinks)
			{
				System.out.println(wb.getText());
			}
			
			driver.findElement(By.xpath("//b[text()=' framework']")).click();
	}

}
