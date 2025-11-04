package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.className("commonModal__close")).click();

		driver.findElement(By.xpath("//label[@for=\"departure\"]")).click();
		
		for(;;) {
		try {
			driver.findElement(By.xpath("//div[@aria-label=\"Wed Mar 18 2026\"]")).click();
		} catch (Exception e) {
			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
		}
		}

	}

}
