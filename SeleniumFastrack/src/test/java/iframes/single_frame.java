package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class single_frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
       // driver.switchTo().frame(1);   //By index
       // driver.switchTo().frame("SingleFrame");  //By name/id
		WebElement iframe_WE = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
		driver.switchTo().frame(iframe_WE);      //By creating Webelement of frame
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Anjali");
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
				
		//Switch to outer iframe
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);

		//Switch to inner iframe
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);

		//Enter name in inner iframe
		WebElement nestedInput = driver.findElement(By.xpath("//input[@type='text']"));
		nestedInput.sendKeys("Kumari");
		
	}

}
