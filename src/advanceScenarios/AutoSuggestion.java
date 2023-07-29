package advanceScenarios;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//try for Amazon and Google as well

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("bluetooth");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("li"));
		
		for(WebElement wb:allLinks)
		{
			System.out.println(wb.getText());
			if(wb.getText().contains(" headphones"))
			{
				wb.click();
				break;
			}
			
		}
		
	}
}

//div[text()= ' earphone']
