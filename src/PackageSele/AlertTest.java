package PackageSele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// WebDriver= WebDriver is an Interface
		// driver= driver is a WebDriver reference variable
		// = Assignment operator
		// new = is a keyword which using it create a new object
		// ChromeDriver= is a Class that implements WebDriver methods(.findElement(),
		// get(), Navigate().back(), .getText()) etc-->This all WebDriver methods are
		// abstracted
		// Hence these methods are overridden in ChromeDriver class

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0, 200)");

		js.executeScript(
				"document.evaluate(\"//button[@id='confirmButton']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();");

//	    WebDriverWait wait=new WebDriverWait(driver,30);
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='confirmButton']"))).click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();

		String alertmessage = driver.switchTo().alert().getText();

		System.out.println(alertmessage);
		Thread.sleep(2000);
		alert.accept();

	}

}
