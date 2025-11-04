package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://shoppersstack.com/products_page/39");
		
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		
		WebElement check_button = driver.findElement(By.id("Check"));

		//Explicit wait 
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(check_button));
		
		/*
		
		//Fluent Wait
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.withTimeout(Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(check_button));
		
		
		*/
		check_button.click();
		driver.findElement(By.id("Check")).click();

		
	}

}
