package PackageSele;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkbox {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		
		driver.get("https://the-internet.herokuapp.com/");
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='content']//ul//a"));
		
		Thread.sleep(2000);
		
		int a=list.size();
		System.out.println(a);
		
		for(int i=0; i<list.size(); i++)
		{
		
			if(list.get(i).getText().equalsIgnoreCase("Dropdown"))
			{
				
				list.get(i).click();
				break;
				
			}
			
		}
		
		//1st Way
		
//		  WebDriverWait wait=new WebDriverWait(driver, 20);
//		WebElement bb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='dropdown']")));
//		bb.click();
//		
//		Select sel=new Select(bb);
//		sel.selectByVisibleText("Option 2");
//		  Thread.sleep(2000);
		
		//2nd way
        
//		WebElement ele=driver.findElement(By.xpath("//select[@id='dropdown']"));
//		Select se=new Select(ele);
//		se.selectByValue("1");
	  
		//3rd way
		driver.findElement(By.xpath("//select[@id='dropdown']")).sendKeys("Option 1");
		
		Thread.sleep(2000);
		  
         driver.navigate().back();
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//*[text()='Checkboxes']")).click();
         
        List<WebElement> elems=driver.findElements(By.xpath("//form[@id='checkboxes']/input"));
        System.out.println(elems.size()); 
        
        driver.findElement(By.xpath("//input[2]")).click();
        driver.findElement(By.xpath("//input[1]")).click();
           
        
	}
}
