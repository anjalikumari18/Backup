package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//https://the-internet.herokuapp.com/basic_auth
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("");


	}

}
