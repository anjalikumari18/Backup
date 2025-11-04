package ActClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/buttons");

		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick).perform();
		
		WebElement dblconf_msg = driver.findElement(By.id("doubleClickMessage"));
		System.out.println(dblconf_msg.getText());
		
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightclick).perform();
		
		WebElement rightclickconf_msg = driver.findElement(By.id("rightClickMessage"));
		System.out.println(rightclickconf_msg.getText());
		
		
		
		

	}

}
