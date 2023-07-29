package popups;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
/*Scenario: Launch Monster URL-> Click on [Upload Resume]-> Click on [Or select file to upload]
->Pass the file path/filename.type-> The file will be uploaded */

public class FileUploadPopup {

	public static void main(String[] args){

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		WebElement data = driver.findElement(By.id("file-upload"));
		data.sendKeys("/Users/indrani/Downloads/Indrani Resume.pdf");
		System.out.println("File Uploaded successfully");
	}
}
