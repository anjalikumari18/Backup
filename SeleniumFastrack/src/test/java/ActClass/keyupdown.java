package ActClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyupdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-female")).click();
		WebElement FN = driver.findElement(By.id("FirstName"));
		
		Actions act=new Actions(driver);
		
		act.keyDown(FN, Keys.SHIFT).sendKeys(FN, "anjali").keyUp(FN, Keys.SHIFT).perform();
		
		WebElement LN = driver.findElement(By.name("LastName"));

		act.keyDown(LN, Keys.ENTER).sendKeys("Singh").keyUp(LN, Keys.ENTER).perform();
		
		


	}

}
