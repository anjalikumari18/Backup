package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class action_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
		
		driver.findElement(By.id("gender-female")).click();
		WebElement first_name = driver.findElement(By.id("FirstName"));
		first_name.sendKeys("Anjali");
		Thread.sleep(1000);
		first_name.clear();
		Thread.sleep(1000);
		first_name.sendKeys("Person");
		
		WebElement last_name = driver.findElement(By.name("LastName"));
		last_name.sendKeys("Singh");
		Thread.sleep(1000);
		last_name.clear();
		Thread.sleep(1000);
		last_name.sendKeys("Testing");
		
		WebElement email = driver.findElement(By.id("Email"));
		Thread.sleep(1000);
		email.sendKeys("anjali@!@3");		
		Thread.sleep(1000);	
		email.clear();
		Thread.sleep(1000);
    	email.sendKeys("testing@gmail.com");
		
		
	    WebElement password = driver.findElement(By.name("Password"));
	    password.sendKeys("pass123");
		WebElement confirm_password = driver.findElement(By.id("ConfirmPassword"));
		confirm_password.sendKeys("pass123");
		driver.findElement(By.id("register-button")).submit();


		

	}

}
