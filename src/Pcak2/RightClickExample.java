package Pcak2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RightClickExample {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.orangehrm.com/"); 
        driver.manage().window().maximize();

        // Explicit Wait for visibility
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        WebElement rightClickElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("Form_submitForm_action_request")));
        
        // Perform right-click
        Actions act = new Actions(driver);
        
//        act.contextClick(rightClickElement).build().perform();
//        
//        driver.quit();
        
        WebElement mousehover=driver.findElement(By.xpath("//a[text()='Solutions']"));
        
        act.moveToElement(mousehover).build().perform();
        Thread.sleep(2000);
        
       
    }


        
	}

