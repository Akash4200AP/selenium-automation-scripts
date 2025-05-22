package Pcak2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DrodownPracticeNew1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://practice.expandtesting.com/dropdown"); 
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
//        WebElement ele= driver.findElement(By.xpath("//select[@name='country']"));
//        Select s=new Select(ele);
//        s.selectByValue("BI");
        
        //Right Click Action
        WebElement ele2=driver.findElement(By.xpath("//a[text()='API Testing']"));
        Actions act=new Actions(driver);
        act.contextClick(ele2).perform();
        Thread.sleep(2000);
        
        
//        List<WebElement> listofcountry=driver.findElements(By.xpath("//div[@class='row mt-3']//div[@class='col-md-6']/p/select/option"));
//        Thread.sleep(2000);
//        listofcountry.size();
//        System.out.println("List of countries:" +listofcountry.size());
//        Thread.sleep(2000);
//        
//       for(int i=0; i<listofcountry.size();i++)
//       {
//    	   System.out.println("All countries list: "+listofcountry.get(i).getText());
//    	   String country="Yemen";
//    	   
//    	  if(listofcountry.get(i).getText().equalsIgnoreCase(country))
//    	   {
//    		   
//    		  
//    		  listofcountry.get(i).click() ;
//    	   }
//    	   
//    	   
//       }
        
        
        
	}

}
