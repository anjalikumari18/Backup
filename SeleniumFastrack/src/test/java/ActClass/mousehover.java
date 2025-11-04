package ActClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		WebElement COMP = driver.findElement(By.partialLinkText("COMPUTERS"));
		
		Actions act=new Actions(driver);
		act.moveToElement(COMP).perform();
		
		WebElement notes = driver.findElement(By.partialLinkText("Notebooks"));
		
		act.moveToElement(notes).perform();
		
		

		
		
	}

}
