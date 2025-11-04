package ActClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.timr.co/mobile-drag-drop/demo/");
		
		WebElement draggable_item1 = driver.findElement(By.linkText("one"));
		WebElement droppable_area = driver.findElement(By.id("bin"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(draggable_item1, droppable_area).perform();
		
				
		
		
	}

}
