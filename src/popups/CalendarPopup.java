	package popups;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


//Scenario:Launch MakemyTrip URL-> Select Departure & select 20th of March 2023-> Select Return & select 17th of April 2023

public class CalendarPopup {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.findElement(By.xpath("//div[text()='March 2023']"
				+ "/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='30']")).click();
//use either: //div[text()='March 2023'] or //div[text()='March' and //span[text()='2023']]
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		driver.findElement(By.xpath("//div[text()='April' and //span[text()='2023']]"
				+ "/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='17']")).click();		
//use either : //div[text()='April 2023'] or //div[text()='April' and //span[text()='2023']]		
	}
}
