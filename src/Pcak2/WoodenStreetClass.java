package Pcak2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class WoodenStreetClass {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.woodenstreet.com/"); 
        driver.manage().window().maximize();
        try {
            WebElement loginClose = driver.findElement(By.xpath("//div[@id='login-pop']//div[@id='loginclose1']"));
            loginClose.click();
            System.out.println("Closed login pop-up.");
        } catch (Exception e) {
            System.out.println("Login pop-up not displayed.");
        }
        
        WebElement w1 = driver.findElement(By.xpath("//a[text()='Dining & Kitchen']"));
        Actions act = new Actions(driver);
        act.moveToElement(w1).build().perform();
        Thread.sleep(2000);

        
       List<WebElement> ele = driver.findElements(By.xpath("//li[4]/a/following-sibling::ul//a"));
      // List<WebElement> ele = driver.findElements(By.xpath("//li[4]/a/following-sibling::ul/li//a"));
        int a = ele.size();
        System.out.println("Number of options: " + a);
        

        
        for (int i = 0; i < ele.size(); i++) {
        	System.out.println("all option:" +ele.get(i).getText());
            
        	String s1="Teapots";
        	if(ele.get(i).getText().equalsIgnoreCase(s1))
        	{
        		ele.get(i).click();
        		break;
        		
        	}
                
}
    }
}
