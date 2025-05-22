package PackageSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//"C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
public class SimpleDragandDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome-win64\\chrome-win64\\chrome.exe");
		ChromeDriver driver= new ChromeDriver();
		 
	    driver.get("https://demoqa.com/droppable/");
	    
	    WebElement x=driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement y=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
	    
	    Actions act=new Actions(driver);
	    
	    act.dragAndDrop(x, y).build().perform();
	    
	    System.out.println("Drag and Drop completed Successfully");
	}

}
