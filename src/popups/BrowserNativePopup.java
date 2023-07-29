package popups;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
//Scenario: Browser should be launched in Incognito mode and URL should be loaded 

public class BrowserNativePopup {

	public static void main(String[] args) {

				ChromeOptions option = new ChromeOptions();
				option.addArguments("--remote-allow-origins=*","incognito");
//Note: once Chrome issue is fixed replace above line with option.addArguments("incognito")

				WebDriver driver = new ChromeDriver(option);
				driver.get("https://www.yatra.com/");	
	}
}
