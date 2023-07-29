package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserMethods {

	public static void main(String[] args) throws Throwable {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//Launching the URL
		driver.get("https://www.amazon.in/");
		
		//maximize screen
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//minimize screen
		driver.manage().window().minimize();

		/*
		//printing the title of WebPage
		String data = driver.getTitle();
		System.out.println(data);
		
		//prints current URL of the application
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		//close method closes only the current focusing window
		//driver.close();
		
		//close all the windows
		//driver.quit();
		 */
		
		
	}
	
}
