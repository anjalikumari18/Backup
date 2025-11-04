package ActClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		
		driver.findElement(By.id("userName")).sendKeys("Anjali");
		 WebElement Password_tf = driver.findElement(By.id("password"));
		 Password_tf.sendKeys("Password@123798");
		 
		 WebElement eye_button = driver.findElement(By.xpath("(//img[@class=\"ng-star-inserted\"])[1]"));
		 Actions act=new Actions(driver);
		 act.clickAndHold(eye_button).perform();
		 Thread.sleep(3000);
		 act.release(eye_button).perform();
		 
	
	}

}
