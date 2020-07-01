package assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Way2assignment2 {

	@Test
	public void Way2assignment2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://wallethub.com/profile/test_insurance_company/");
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
driver.findElement(By.name("em")).sendKeys("askbinu80@gmail.com");
driver.findElement(By.name("pw")).sendKeys("Ld@12345");
driver.findElement(By.xpath("//*[@id='join-login']/form/div[4]/button[2]/span")).click();

       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='scroller']/main/div[2]/div/section/div/div/div/div[2]/a")).click();
       
     WebElement text= driver.findElement(By.xpath("//*[@id='reviews-section']/section/article[1]/div[4]"));
       
     String Textvalue =text.getText();
     System.out.println("The textvalue is: " +Textvalue);
     Assert.assertEquals(Textvalue, "Its my pleasure to giving the test of wallet hub and written the script for there assignment,May be my code is going to work and my assignments get passed with good score.Thanking of Wallet hub HrTeam");
    
     
    
 Thread.sleep(3000);
       driver.quit();
	}

		
		

	}


