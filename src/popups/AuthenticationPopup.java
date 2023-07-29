package popups;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/* Scenario: Launch URL while passing credentials for authentication through script-> 
If credentials are correct, pop-up is closed and we can access website  */

public class AuthenticationPopup {
	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Syntax: https://username:password@URL
		//URL: https://the-internet.herokuapp.com/basic_auth/ 	
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth/");
	}
}
