package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptionsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
//to mximize the browser

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

driver.get("https://www.facebook.com/r.php?entry_point=login");

WebElement month = driver.findElement(By.id("month"));

Select month_dropdown=new Select(month);
 List<WebElement> Allmonths = month_dropdown.getOptions();
 
 for (WebElement month1 : Allmonths) {
	System.out.println(month1.getText());
}
 //To check whether the dropdown is multtiselect or not?
 System.out.println("The dropdown is multisselect??" +month_dropdown.isMultiple());
 
 
 
 
 
 

		

	}

}
