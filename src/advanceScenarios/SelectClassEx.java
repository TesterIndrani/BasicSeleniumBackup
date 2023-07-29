package advanceScenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//to select options from dropdown

public class SelectClassEx {

	public static void main(String[] args) throws Throwable {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		
		//selectByIndex
		WebElement daylist = driver.findElement(By.id("day"));
		Select selD = new Select(daylist);
		selD.selectByIndex(0);
		
		//selectByValue
		WebElement monthlist = driver.findElement(By.id("month"));
		Select selM = new Select(monthlist);
		selM.selectByValue("10");
		
		//selectByVisibleText
		WebElement yearlist = driver.findElement(By.id("year"));
		Select selY = new Select(yearlist);
		selY.selectByVisibleText("1993");			
	}
}
