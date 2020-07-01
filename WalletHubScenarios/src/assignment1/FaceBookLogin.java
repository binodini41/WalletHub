package assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		String[] username={"@", "sahoobinodini@gmail.com"}; //Enter a valid user name
		String[] password= {"@", "kai@1234"}; //Enter a valid password
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		for(String j:username){
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(j);
		System.out.println("email");
		for(int i =0; i<password.length; i++){
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(password[i]);
		System.out.println("pass");
		}
		}
		driver.findElement(By.id("u_0_b")).click();
		System.out.println("Hello world");
		}
		

	
}
