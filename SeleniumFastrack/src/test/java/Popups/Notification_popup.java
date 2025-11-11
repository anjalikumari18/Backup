package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--disable-notifications");
		opt.addArguments("-incognito");
		
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.yatra.com/");

		
		

	}

}
