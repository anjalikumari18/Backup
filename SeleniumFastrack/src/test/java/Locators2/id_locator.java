package Locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Anjali");
		driver.findElement(By.name("LastName")).sendKeys("Singh");
		driver.findElement(By.id("Email")).sendKeys("anjali1234@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("password12345");
		driver.findElement(By.id("Password")).sendKeys("password12345");
		driver.findElement(By.id("register-button")).click();

		
		
		
	}

}
