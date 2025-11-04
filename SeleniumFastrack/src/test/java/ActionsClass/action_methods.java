package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/buttons");
		
		
		WebElement dbclick_btn = driver.findElement(By.id("doubleClickBtn"));
		Actions act=new Actions(driver);
		act.doubleClick(dbclick_btn).perform();
		
		WebElement rightclick_btn = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightclick_btn).perform();
		
		WebElement click_btn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		act.click(click_btn).perform();
		
		WebElement confirmation_msg1 = driver.findElement(By.id("doubleClickMessage"));
		System.out.println(confirmation_msg1.getText());
		
		WebElement confirmation_msg2 = driver.findElement(By.id("rightClickMessage"));
		System.out.println(confirmation_msg2.getText());

		WebElement confirmation_msg3 = driver.findElement(By.id("dynamicClickMessage"));
		System.out.println(confirmation_msg3.getText());

		

	}

}
