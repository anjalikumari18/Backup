package Javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://doodles.google/search/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);

		jse.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(2000);
//Implementing scroll to
		
		jse.executeScript("window.scrollTo(0,0)");
		
		jse.executeScript("window.scrollTo(0,1200)");
		
		jse.executeScript("window.scrollTo(0,200)");




		

	}

}
