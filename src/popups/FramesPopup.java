package popups;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//Scenario: Launch JqueryUI URL-> Hold the 'Drag me to my target' box and drop it in 'Drop here' box

public class FramesPopup {

	@Test
	public void framesPopup() throws Throwable{

		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		FileInputStream fis = new FileInputStream("./commondata.properties.txt");	
		Properties pro = new Properties();
	 	pro.load(fis);		//take load(InputStream inStream) function
		String URL = pro.getProperty("DragDropUrl");
		driver.get(URL);
			
		//check the frames by searching with '//iframe' and check the index of the frame you want to inspect
		driver.switchTo().frame(0);		//since only one frame is there, so index is '0'
		Actions act = new Actions(driver);

		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));		
		act.dragAndDrop(drag, drop).perform();
	}
}
