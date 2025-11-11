package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webelement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search_button = driver.findElement(By.xpath("//input[@value=\"Search\"]"));
		File temp = search_button.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Errorshots/searchbutton.png");
		FileHandler.copy(temp, perm);
		

	}

}
