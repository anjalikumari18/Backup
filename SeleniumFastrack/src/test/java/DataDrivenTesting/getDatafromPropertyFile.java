package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDatafromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.get("https://www.facebook.com/");
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\ClassDocs\\facebookdata.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String USER = prop.getProperty("username");
		String PASS = prop.getProperty("password");
		
		System.out.println(USER);
		System.out.println(PASS);
		
			
		d.findElement(By.id("email")).sendKeys(USER);
		d.findElement(By.id("pass")).sendKeys(PASS);
		//d.findElement(By.name("login")).click();
		
		
		
		
		
	}

}
