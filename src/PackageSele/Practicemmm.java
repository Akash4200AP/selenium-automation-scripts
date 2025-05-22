package PackageSele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicemmm {

    public static void main(String[] args) throws Exception {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    
        
        driver.get("https://testautomationpractice.blogspot.com/");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
        
//        List<WebElement> list = driver.findElements(By.xpath("//div[@id='HTML8']//div[@class='widget-content']//table//tr//td//input"));
//        
//        System.out.println("Total checkboxes: " + list.size());
        
//        WebElement alart=driver.findElement(By.xpath("//button[text()='Simple Alert']"));
//        alart.click();
//        
//        Alert al=driver.switchTo().alert();
//        Thread.sleep(2000);
//        al.accept();
        
//     WebElement dd=driver.findElement(By.xpath("//button[text()='START']"));
//     System.out.println(dd.getText());
//     Thread.sleep(2000);
//     dd.click();
//     System.out.println(dd.getText());
//     
//      List<WebElement> radio=driver.findElements(By.xpath("//div[@class='form-group']//div[@class='form-check form-check-inline']/input[@type='radio']"));	
//       
//      System.out.println(radio.size());
//      
//      for (int i = 0; i < radio.size(); i++) {
//    	    if (radio.get(i).getAttribute("value").equalsIgnoreCase("Female")) {
//    	        radio.get(i).click();
//    	        break;
//    	    }
//    	}
        
        WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
        
        Actions s=new Actions(driver);
        s.dragAndDrop(source, target).build().perform();
        

        
        
        
        
//        List<WebElement> list = driver.findElements(By.xpath("//div[@class='widget HTML']//div[@class='widget-content']//div[@class='table-container']/table/tbody/tr/td/input"));
//        System.out.println("Total checkboxes: " + list.size());
//      
//        
//        for(int i=0; i<list.size(); i++)
//        {
//        	
//        	list.get(i).click();
//        	
//        }
//        
        
       
    }
}
