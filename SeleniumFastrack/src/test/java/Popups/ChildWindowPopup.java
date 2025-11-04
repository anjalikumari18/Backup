package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		
		String parentID = driver.getWindowHandle();
		Set<String> allIDs = driver.getWindowHandles();
		allIDs.remove(parentID);
		for(String id:allIDs) {
			driver.switchTo().window(id);
		}
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("anjali");
		System.out.println("name sent already");
		
		

		
	}

}
