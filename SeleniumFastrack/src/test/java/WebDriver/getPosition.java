package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Point coordinates = driver.manage().window().getPosition();
		System.out.println("The coordinates are "+coordinates);
		System.out.println("The x coordinate is "+coordinates.getX());
		System.out.println("The y coordinate is "+coordinates.getY());
		
		//setPosition implementation
		driver.manage().window().setPosition(new Point(89, 100));


	}

}
