package PackageSele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://int.zigzag.lk/collections/new-arrivals-1");

		driver.manage().window().maximize();

		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		WebElement tc = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='0c8-MuiIconButton-label']//*[name()='svg']")));
		Thread.sleep(2000);
		tc.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement ab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='d-flex align-items-center']//span[contains(text(),'Collections')]")));
		
		Actions act = new Actions(driver);

		act.moveToElement(ab).perform();
		
		Thread.sleep(2000);
		
	}

}
