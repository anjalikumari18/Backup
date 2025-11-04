package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		//Second line of code
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);

		
		driver.manage().window().fullscreen();
		
		

		
		

	}

}
