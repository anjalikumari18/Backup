package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timr.co/mobile-drag-drop/demo/");
		
		WebElement draggable_item1 = driver.findElement(By.id("one"));
		WebElement draggable_item2 = driver.findElement(By.id("two"));
		WebElement draggable_item3 = driver.findElement(By.id("three"));
		WebElement draggable_item4 = driver.findElement(By.id("four"));
		WebElement draggable_item5 = driver.findElement(By.id("five"));
		
		WebElement droppable_area = driver.findElement(By.id("innerBin"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(draggable_item1, droppable_area).perform();
		Thread.sleep(2000);
		act.dragAndDrop(draggable_item2, droppable_area).perform();
		Thread.sleep(2000);
		act.dragAndDrop(draggable_item3, droppable_area).perform();
		Thread.sleep(2000);
		act.dragAndDrop(draggable_item4, droppable_area).perform();
		Thread.sleep(2000);
		act.dragAndDrop(draggable_item5, droppable_area).perform();


		
	
	
	}

}
