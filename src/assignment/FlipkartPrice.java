package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrice {
 
	public static void main(String[] args) throws Throwable{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	//Close pop-up->Enter 'bluetooth headphones' in search text box->Print the price of the first headphone listed
	
		driver.findElement(By.cssSelector("[class='_2KpZ6l _2doB4z']")).click(); //or use "._2doB4z"
						
		WebElement data = driver.findElement(By.cssSelector("[class='_3704LK']"));
		data.sendKeys("bluetooth headphones");
		data.submit();
			
		Thread.sleep(1000);
		
		String price=driver.findElement(By.cssSelector("div._30jeq3")).getText();
		System.out.println("Price of the first Bluetooth headphone: " + price);		
		
	}
}
