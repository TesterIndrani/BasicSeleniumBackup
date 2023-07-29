package advanceScenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//xpath for images in webpages with svg tagname  
public class SvgTag {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();	
			
		//To click on Microphone. Note: Attribute values shouldn't contain numeric values
		driver.findElement(By.xpath("//*[name()='svg' and @class='goxjub']")).click();
	}
}
