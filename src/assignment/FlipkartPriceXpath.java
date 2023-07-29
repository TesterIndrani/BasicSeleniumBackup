package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPriceXpath {
	
	public static void main(String[] args) throws Throwable{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//Close pop-up->Enter 'bluetooth headphones' in search text box->Print the price of the first headphone listed
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement data = driver.findElement(By.xpath("//input[@type='text']"));
		data.sendKeys("bluetooth headphones");
		data.submit();

		Thread.sleep(1000);

		System.out.println("Price=" + driver.findElement(By.xpath("//div[text()='₹798']")).getText());	
	}
}