package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//to mximize the browser
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement day_dropdown = driver.findElement(By.id("day"));
		
		
		Select drop1=new Select(day_dropdown);
		
		drop1.selectByVisibleText("18");
		//drop1.deselectByValue("18");
		
		
		
		System.out.println(drop1.isMultiple());
		
		
	}

}
