package Locators2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("Shoes");
		
		driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]")).click();
		
		driver.findElement(By.linkText("HURRICANE Running Shoes For Men")).click();
		
		String parent_id = driver.getWindowHandle();
		Set<String> allIDs = driver.getWindowHandles();
		allIDs.remove(parent_id);
		
		for(String id:allIDs) {
			driver.switchTo().window(id);
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		}
		
		
		driver.close();
		
		

		
		
	}

}
