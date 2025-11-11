package Locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		//clicking on the third add to cart button using indexing
		driver.findElement(By.xpath("(//input[@type=\"button\"])[5]")).click();

		
		

	}

}
