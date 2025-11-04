package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
//to mximize the browser

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

driver.get("https://omayo.blogspot.com/");

WebElement mutiselect_dropdown = driver.findElement(By.id("multiselect1"));

Select dropdown1=new Select(mutiselect_dropdown);
dropdown1.selectByIndex(0);
Thread.sleep(1000);
dropdown1.selectByValue("swiftx");
Thread.sleep(1000);
dropdown1.selectByVisibleText("Audi");
Thread.sleep(1000);

WebElement firstoption = dropdown1.getFirstSelectedOption();
System.out.println(firstoption.getText());

//To print all the selected options only

List<WebElement> allOptions = dropdown1.getAllSelectedOptions();
//Creating a temporary variable of type WebElement which will iterate through all the selected options (List<WebElement>)
for(WebElement option:allOptions) {
	System.out.println(option.getText());
}

//To deselect all values at once
//dropdown1.deselectAll();

/*
//deselect methods
dropdown1.deselectByIndex(0);
Thread.sleep(1000);

dropdown1.deselectByValue("swiftx");
Thread.sleep(1000);

dropdown1.deselectByVisibleText("Audi");

*/
		
System.out.println(dropdown1.isMultiple());
		
	}

}
