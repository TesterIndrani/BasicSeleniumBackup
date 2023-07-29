package advanceScenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Actions class methods to replicate mouse actions

public class ActionsClass {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		
		//1st Scenario: To hover over and right click on element 
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement data = driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']"));
		
		Actions act = new Actions(driver);   //for creating virtual cursor
		act.moveToElement(data).perform();			//To hover over an Element		
		act.contextClick(data).perform();  			//Right click on Element
		
		
		//2nd Scenario : double click on element
	/*	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));		
		Actions act = new Actions(driver);
		act.doubleClick(click).perform();	*/	
		
		
		//3rd Scenario: Drag one element and drop on other element i.e. drag and drop
	/*	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(1000);
		WebElement drag = driver.findElement(By.xpath("//div[contains(@style,'position')]"));
		WebElement drop = driver.findElement(By.xpath("//div[contains(@class,'droppable')]"));
		
		Actions act = new Actions(driver);
	//	act.dragAndDrop(drag, drop).perform(); OR
		act.clickAndHold(drag).perform();
		act.release(drop).perform();  */
	
		
		//4th Scenario: To pass values to text field and perform action
	/*	driver.get("https://demo.actitime.com/login.do");
		WebElement data = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		WebElement login = driver.findElement(By.id("loginButton"));

		Actions act = new Actions(driver);
		//act.sendKeys(data,"admin").perform();
		//act.sendKeys(pass,"manager").perform(); 	
		act.sendKeys(data,"admin").sendKeys(pass,"manager").sendKeys(login).build().perform();	*/
	}

}
