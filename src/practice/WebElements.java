package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WebElement methods 

public class WebElements {

	public static void main(String[] args) {

		/*
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		
		//xpath by contains Attribute as to avoid numerical values in '_97vu img' attribute	
		WebElement logo = driver.findElement(By.xpath("//img[contains(@class,'vu img')]"));
		
		//getCssValue() to get font size of logo
		String fontSize = logo.getCssValue("font-size");
		System.out.println("Font size of Facebook logo is = "+fontSize);
		
		//getCssValue() to get colour of emailId textbox
		WebElement emailTextBox= driver.findElement(By.xpath("//input[@name='email']"));
		String color = emailTextBox.getCssValue("color");
		System.out.println(color);
		
		
		//getLocation() to get location of kannada text
		WebElement kannadatext= driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
				Point value = kannadatext.getLocation();
				System.out.println(value);
				System.out.println(value.getX());		//X coordinate
				System.out.println(value.getY());		//Y coordinate
				
		//getSize() to get size of any WebElement		
		
		//getRect()
		*/		
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");			
		
		//clear()
		
		//isDisplayed()
		
		WebElement logoImage = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		

		//isEnabled() to check if we can enter value in that field
		WebElement data = driver.findElement(By.id("username"));
		if(data.isEnabled())
			data.sendKeys("admin");
		else
			System.out.println("not enabled");
		
		//isSelected() can be used for radio buttons also 
		WebElement value = driver.findElement(By.xpath("//input[@type='checkbox']"));
			value.click();	//to tick checkbox
		if(value.isSelected())
			System.out.println("checkbox is selected");	
		else
			System.out.println("checkbox is not selected"); 
		
		//getAttribute() to get Attribute values of any element
		WebElement usernameBox = driver.findElement(By.id("username"));
		String value1= usernameBox.getAttribute("id");
		System.out.println("value for id is: "+ value1);
		String value2 = usernameBox.getAttribute("type");
		System.out.println("value for type is: "+ value2);	
		
		WebElement loginButton = driver.findElement(By.xpath("//a[@id='loginButton']"));
		String value3 = loginButton.getAttribute("href");
		System.out.println("value for href is: "+ value3);
		String value4 = loginButton.getAttribute("name");
		System.out.println("value for name is: "+value4);	//returns null as there is no name attribute
		
		
		//getTagName()
		String value5 = usernameBox.getTagName();
		System.out.println("HTML tagname for Username textbox is: "+value5);
		String value6 = loginButton.getTagName();
		System.out.println("HTML tagname for Login Button is: "+value6);
				
		/*
			//getArialRole to get type of the WebElement(checkbox/textfield/radio/link)
				WebElement user = driver.findElement(By.id("username"));
				System.out.println(user.getAriaRole());
				
				WebElement password = driver.findElement(By.name("pwd"));
				System.out.println(password.getAriaRole());
				
				WebElement login = driver.findElement(By.id("loginButton"));
				System.out.println(login.getAriaRole());
				
				WebElement keepLogin = driver.findElement(By.name("remember"));
				System.out.println(keepLogin.getAriaRole());
			*/		
	}

}
