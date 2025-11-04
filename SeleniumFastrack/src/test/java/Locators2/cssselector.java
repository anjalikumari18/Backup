package Locators2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.cssSelector("input[value=\"Search store\"]")).sendKeys("Book");
		
		driver.findElement(By.cssSelector("input[value=\"Search\"]")).click();
		
		driver.findElement(By.linkText("Health Book")).click();
		
		driver.findElement(By.cssSelector("input[id=\"add-to-cart-button-22\"]")).click();


	}

}
