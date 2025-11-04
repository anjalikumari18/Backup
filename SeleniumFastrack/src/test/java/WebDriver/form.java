package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
	driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.partialLinkText("downloads")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		driver.findElement(By.id("FirstName")).sendKeys("Anjali");
		
		driver.findElement(By.name("Email")).sendKeys("ghjktf@gmail.com");
		
		driver.findElement(By.name("Gender")).click();
		
		*/
		
	}

}
