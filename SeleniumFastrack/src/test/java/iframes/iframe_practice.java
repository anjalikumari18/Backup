package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Frames.html");
		//By index
		//driver.switchTo().frame(0);
		
		//By name/id- copy paste the value of name/id
		//driver.switchTo().frame("singleframe");
		
		//By creating webelement of iframe
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@name=\"SingleFrame\"]"));
		
		driver.switchTo().frame(iframe1);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Anjali");
		
		//To switch back to the immediate parent
		driver.switchTo().parentFrame();
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		//Switching driver control to the outer iframe
		WebElement Outer_iframe = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(Outer_iframe);
		//Switching driver control to the inner iframe
		WebElement inner_frame = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		driver.switchTo().frame(inner_frame);
		//Entering value in the textfield present in inner frame
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Singh");
		//To switch back to the parent page in case of nested iframes
		driver.switchTo().defaultContent();
		//Clicking on button present in the parent page
		driver.findElement(By.xpath("(//span[text()='Automation demo tools'])[1]")).click();
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
