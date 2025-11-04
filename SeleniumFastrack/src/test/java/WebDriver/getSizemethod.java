package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("The dimesnions are"+size);
		System.out.println("The height is"+size.getHeight());
		System.out.println("The width is "+size.getWidth());
		
	}

}
