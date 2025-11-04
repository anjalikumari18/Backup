package ActClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollbyamount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=macbooks&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 1800).perform();

		
		
		
	}

}
