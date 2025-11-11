package Javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabledElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/in/java/technologies/javase-jdk25-doc-downloads.html");
		
		driver.findElement(By.linkText("jdk-25.0.1_doc-all.zip")).click();
		
		WebElement disabled_btn = driver.findElement(By.linkText("Download jdk-25.0.1_doc-all.zip"));
		
		//To click on disabled element
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",disabled_btn);
		
		
		

		
		
	}

}
