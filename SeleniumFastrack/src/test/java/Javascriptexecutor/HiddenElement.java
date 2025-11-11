package Javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement hidden_btn = driver.findElement(By.id("custom_gender"));
		
		//To enter values in a hidden element
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='cannot specify'",hidden_btn);

		
		
		

	}

}
