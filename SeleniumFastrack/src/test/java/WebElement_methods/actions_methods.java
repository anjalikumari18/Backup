package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actions_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
	    driver.findElement(By.linkText("Register")).click();
	    
	    WebElement firstname = driver.findElement(By.id("FirstName"));
 
	    firstname.sendKeys("Anjali");
	    Thread.sleep(2000);
	    firstname.clear();
	    Thread.sleep(2000);
        firstname.sendKeys("AK");
		
        driver.findElement(By.id("register-button")).submit();
	}

}
