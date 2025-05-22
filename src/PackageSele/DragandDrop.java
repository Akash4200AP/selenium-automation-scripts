package PackageSele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

    public static void main(String[] args) throws Exception {
        
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.automationtesting.in/Static.html");
        
        driver.manage().window().maximize();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(5, 200)");
        		

        Thread.sleep(2000);
        
        // Locate source and target elements using Selenium locators
        WebElement source = driver.findElement(By.id("mongo"));
        WebElement target = driver.findElement(By.id("msg"));
        
        // Perform drag-and-drop action
        Actions s = new Actions(driver);
        s.dragAndDrop(source, target).build().perform();
        
        js.executeScript("window.scrollBy(5, 300)");
        
        // Pause to observe the result
        Thread.sleep(2000);
        
       
    }
}
