package PackageSele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewProjectAutomation {
		
		public static void main(String[] args) throws InterruptedException {
	    	//ChromeBrowser Setup
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    	
	    	//Create ChromDriver object
	        WebDriver driver = new ChromeDriver();
	       
	        //Implicit wait used and it is applicable for all the element
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        //Open url using .get Method
	        driver.get("https://www.woodenstreet.com/"); 
	        //Maximize window 
	        driver.manage().window().maximize();
	        //Used Thread.sleep used to slow down the execution process for a specific time to observe or verify each step in the test
	        Thread.sleep(2000);
	        
	        driver.navigate().refresh(); //Refresh page
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[@class='whislist-cart']")).click(); //Locate element on webpage using Xpath
	        System.out.println("whishlist-cart clicked and user is redirected to signup page");
	        Thread.sleep(2000);
	        

	}

}
