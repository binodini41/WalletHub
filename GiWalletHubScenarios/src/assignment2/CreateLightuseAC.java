package assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class CreateLightuseAC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://wallethub.com/join/light");
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("em")).clear();
		driver.findElement(By.name("em")).sendKeys("askbinu1@gmail.com"); //Enter a valid email id
		
		driver.findElement(By.name("pw1")).clear();
		driver.findElement(By.name("pw1")).sendKeys("Ld@12345"); //Enter valid  password
		
		driver.findElement(By.name("pw2")).clear();
		driver.findElement(By.name("pw2")).sendKeys("Ld@12345"); //Enter valid confirm password
		
		driver.findElement(By.xpath("//*[@id='join-light']/form/div/div[4]/label/span")).click();
        driver.findElement(By.xpath("//*[@id='join-light']/form/div/div[6]/button")).click();
        
        driver.get("https://wallethub.com/profile/test-insurance-company-13732055i");
       
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.cssSelector("#reviews-section > div.review-stat-box > div.review-action.ng-enter-element > review-star > div > svg:nth-child(4)"));
        actions.moveToElement(target).perform();
        System.out.println("The mouse is hover on the star");
        Thread.sleep(2000);
        target.click();
        Thread.sleep(2000);
        //div[@span[text()='Select...']
        WebElement element=driver.findElement(By.xpath("//*[@id='reviews-section']/modal-dialog/div/div/write-review/div/ng-dropdown/div/span"));
        element.click();
        WebElement clickItem=driver.findElement(By.xpath("//*[@id='reviews-section']/modal-dialog/div/div/write-review/div/ng-dropdown/div/ul/li[2]"));
        clickItem.click();
               
        Thread.sleep(1000);
        
       WebElement textArea= driver.findElement(By.cssSelector("#reviews-section > modal-dialog > div > div > write-review > div > div.android > textarea"));
       textArea.sendKeys("Its my pleasure to giving the test of wallet hub and written the script for there assignment,May be my code is going to work and my assignments get passed with good score.Thanking of Wallet hub HrTeam");
       Thread.sleep(2000);
       WebElement subBtn=driver.findElement(By.cssSelector("#reviews-section > modal-dialog > div > div > write-review > sub-navigation > div > div.sbn-action.semi-bold-font.btn.fixed-w-c.tall"));
       subBtn.click();
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//*[@id='viewport']/header/div/div[1]/a/span[2]")).click();
driver.findElement(By.xpath("//*[@id='viewport']/header/div/nav[3]/div[2]/a[1]")).click();
Thread.sleep(1000);
driver.findElement(By.name("em")).sendKeys("askb0@gmail.com"); //Enter valid user name
driver.findElement(By.name("pw")).sendKeys("Ld@12345"); //enter valid password
driver.findElement(By.xpath("//*[@id='join-login']/form/div[4]/button[2]/span")).click();

       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='scroller']/main/div[2]/div/section/div/div/div/div[2]/a")).click();
       
     WebElement text= driver.findElement(By.xpath("//*[@id='reviews-section']/section/article[1]/div[4]"));
       
     String Textvalue =text.getText();
     System.out.println("The textvalue is: " +Textvalue);
     if(Textvalue != null)
     {
    	 System.out.println("The Test case is pass");
     }else{
    	 
    	 System.out.println("The test case is fail");
     }
 Thread.sleep(3000);
       driver.quit();
	}

}
