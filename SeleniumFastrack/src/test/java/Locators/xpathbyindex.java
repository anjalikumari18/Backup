package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("iphone 17");
		
		driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]")).click();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Apple iPhone 17')])[11]")).click();


	}

}
