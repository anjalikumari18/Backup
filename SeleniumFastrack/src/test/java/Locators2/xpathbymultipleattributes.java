package Locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbymultipleattributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//enter email in subscribe text field
		driver.findElement(By.xpath("//input[@id=\"newsletter-email\" and @name=\"NewsletterEmail\" ]")).sendKeys("anjali@gmail.com");
		//click on subscribe button
		driver.findElement(By.xpath("//input[@type=\"button\" and @value=\"Subscribe\"]")).click();
		Thread.sleep(2000);
		//Capture the confirmation msg
		WebElement confimration_msg = driver.findElement(By.xpath("//div[contains(text(),'Thank you for signing up!')]"));
        //print msg using getText()
		System.out.println(confimration_msg.getText());
		
		

	}

}
