package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) throws Throwable{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		 
//typing the product in searchbox and clicking on searchlens
		/*	  
		WebElement data = driver.findElement(By.name("field-keywords"));  
		data.sendKeys("puma");		
		driver.findElement(By.id("nav-search-submit-button")).click();
		*/
		
		
//typing the product in searchbox and pressing Enter.  
//findElement() returns WebElement type object which can be used to perform multiple actions on the WebElement
		/*	
		WebElement data = driver.findElement(By.name("field-keywords"));
		data.sendKeys("puma");
		data.submit();  
		*/
		
		//linkText()
		//driver.findElement(By.linkText("Amazon miniTV")).click();
		
		//partialLinkText()
		driver.findElement(By.partialLinkText("Amazon m")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
