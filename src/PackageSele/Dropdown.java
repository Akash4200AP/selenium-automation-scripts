package PackageSele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(2000);
		
//		//1st way
//
//       List <WebElement> month=driver.findElements(By.xpath("//select[@id='month']/option"));
//       System.out.println(month.size());
//       month.get(6).click();
//      System.out.println(month.get(6).isEnabled()); 
//      System.out.println(month.get(6).isDisplayed());
//      boolean s= month.get(6).isSelected();
//      System.out.println(s);
      
      //2nd way
      
     // driver.findElement(By.xpath("//select[@id='month']")).sendKeys("feb");
      
      //3rd way
      
//      WebElement c=driver.findElement(By.xpath("//select[@id='month']"));
//       Thread.sleep(2000);
//      Select C1=new Select(c);
//      Thread.sleep(2000);
//      C1.selectByValue("4");
//      C1.selectByVisibleText("May");
      
       //4th Way
    
      
      List<WebElement> c2=driver.findElements(By.xpath("//select[@id='month']/option"));
      
      for(int i =0; i<c2.size(); i++)
      {
    	  if(c2.get(i).getText().equalsIgnoreCase("oct")); 
    	  c2.get(i).click();
      }
		
		
		
		
		
		
		
		
		

	}

}
