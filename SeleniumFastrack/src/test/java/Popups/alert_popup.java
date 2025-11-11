package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
        //To click on OK Button
		driver.switchTo().alert().accept();
		

	}

}
