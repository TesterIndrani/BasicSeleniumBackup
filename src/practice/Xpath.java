package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Relative Xpath
public class Xpath {

	public static void main(String[] args) {
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	
//xpath by Attribute:  //htmltag[@AttributeName='AttributeValue'] for Username textbox 
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		//can also use input[@id='username'] or input[@name='username']

//xpath by Attribute:  //htmltag[@AttributeName='AttributeValue'] for Username textbox 
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");

//xpath by Visible Text:  //htmltag[text()='AttributeValue'] for Login button
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		
		
		
		
	}
	
}
