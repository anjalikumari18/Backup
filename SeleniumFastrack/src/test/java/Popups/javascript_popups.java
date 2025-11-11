package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement confirmation_popup = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		confirmation_popup.click();
		Thread.sleep(2000);

		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		//To handle propmt popup
		WebElement prompt_popup = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		prompt_popup.click();
		
		driver.switchTo().alert().sendKeys("Anjali");
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		
		
		

		
		
		
		
		
		

	}

}
