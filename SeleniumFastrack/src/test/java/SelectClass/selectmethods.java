package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				WebDriver driver=new ChromeDriver();
		//to mximize the browser
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/books");

		WebElement sortByDpdown = driver.findElement(By.id("products-orderby"));
		
		Select dropdown1=new Select(sortByDpdown);
		//dropdown1.selectByIndex(4);
		//dropdown1.selectByValue("https://demowebshop.tricentis.com/books?orderby=15");
		//dropdown1.selectByVisibleText("Name: Z to A");
		dropdown1.selectByContainsVisibleText("Price: Low to ");
		
		WebElement display_dropdown = driver.findElement(By.id("products-pagesize"));
		
		Select dropdown2=new Select(display_dropdown);
		dropdown2.selectByVisibleText("12");
		
		WebElement viewas_dropdown = driver.findElement(By.id("products-viewmode"));
		Select dropdown3=new Select(viewas_dropdown);
		dropdown3.selectByIndex(1);  //index starts from 0
		
		
	}

}
