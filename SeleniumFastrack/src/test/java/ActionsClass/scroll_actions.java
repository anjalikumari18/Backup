package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll_actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("Macbook");
		driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]")).click();
		
		Actions act=new Actions(driver);
		//executing scrollByAmount
		//act.scrollByAmount(0, 7000).perform();
		
		
		WebElement macbook = driver.findElement(By.xpath("//div[text()='Apple M5 - (24 GB/1 TB SSD/macOS Tahoe) MDE64HN/A']"));

		//executing scroll to element
		act.scrollToElement(macbook).click(macbook).perform();
		
		
		

	}

}
