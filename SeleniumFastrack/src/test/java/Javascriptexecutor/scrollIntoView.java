package Javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		WebElement Indian_flag = driver.findElement(By.xpath("//span[text()='India']"));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].scrollIntoView(true)",Indian_flag);
		Thread.sleep(3000);
		
		jse.executeScript("arguments[0].scrollIntoView(false)",Indian_flag);


		
		
		
		
	}

}
