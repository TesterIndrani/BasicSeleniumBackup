package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
	
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
	//cssSelector using id() and CSS expression [AttributeName='AttributeValue']
		//driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");				
		//driver.findElement(By.cssSelector("#username")).sendKeys("admin"); 
		
	//cssSelector using id() and CSS expression htmltag[AttributeName='AttributeValue']
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		
	//cssSelector using className() and CSS expression [AttributeName='AttributeValue']
		//driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
		//driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");// since ".textField pwdfield" doesn't match


	//cssSelector using className() and CSS expression htmltag[AttributeName='AttributeValue']
		//driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager"); //since "input.textField pwdfield" doesn't match
		
		Thread.sleep(4000);
		driver.close();
	}

}
