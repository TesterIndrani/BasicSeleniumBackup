package popups;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
/*  Scenario: Login to ActiTime URL-> Click on 'Tasks'-> Select first checkbox in tasks list
 * -> Hidden division pop-up is highlighted-> Click on 'Delete' button  */

public class HiddenPopup {

	public static void main(String[] args) {
	
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.cssSelector("div#container_tasks")).click();
		driver.findElement(By.xpath("(//div[@class='checkbox inactive'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='bulkOperationsPanel']/div[text()='Delete']")).click();	
	}
}
