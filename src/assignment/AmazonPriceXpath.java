package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPriceXpath {
	public static void main(String[] args) throws Throwable {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Navigate to 'All'->click on 'Men's Fashion'->click on 'Watches'->click on 'Fossil brand'->Print the price
		
		driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();	
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Men's Fashion")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Watches")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@class='a-dynamic-image sl-sobe-carousel-sub-card-img']")).click();
		
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Price of the Fossil watch: " + price);	
}
}
