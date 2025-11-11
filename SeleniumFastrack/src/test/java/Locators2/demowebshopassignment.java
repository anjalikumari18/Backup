package Locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshopassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//Search the product on search bar
		driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
		//click on the search button
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		//click on the first computer
		driver.findElement(By.linkText("Build your own cheap computer")).click();
		//Clicking on Processor,RAM, HDD, Software
		driver.findElement(By.xpath("//input[@value=\"65\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value=\"55\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value=\"58\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value=\"95\"]")).click();
		
		//Click on Add to cart button
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-72\"]")).click();
		
		//Capturing the confirmation message from the notification bar
		Thread.sleep(2000);
		WebElement confirmation = driver.findElement(By.xpath("//p[text()=\"The product has been added to your \"]"));
		System.out.println(confirmation.getText());
		
		
		
		

	}

}
