package Pcak2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XPath1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.wix.com/");

		Thread.sleep(2000);

		//driver.findElement(By.xpath("//a[text()='Wix Studio']//parent::li[@class='lSccWn']")).click();

		driver.findElement(By.xpath(
				"//span[text()='Get Started']//parent::span[@class='StylableButton2545352419__container']//parent::a[@rel='noreferrer noopener']//parent::div[@id='comp-m14q5pef']"))
			.click();	
			
	System.out.println("Title::==>"+driver.getTitle());
	System.out.println("Current Url::==>" +driver.getCurrentUrl());
	
//	WebDriverWait wait=new WebDriverWait(driver, 30);
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-hook='signup.email']"))).sendKeys("your.email@example.com");
	
	JavascriptExecutor abc=(JavascriptExecutor)driver;
	abc.executeScript("var element = document.evaluate(\"//div[@data-hook='signup.email']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;" +
		    "element.value = 'your.email@example.com';");
	
	
//	JavascriptExecutor abc=(JavascriptExecutor)driver;
//	abc.executeScript("var element = document.evaluate(\"//div[@class='wds_1_128_0_Box__root wds_1_128_0_Box---direction-8-vertical TcDD7L x6A3lW']//div[@data-hook='signup.email']//div[@data-hook='labelledElement-children']//div[@class='wds_1_128_0_Input__wrapper']//input[@data-hook='wsr-input']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;" +
//		    "element.value = 'your.email@example.com';");
	
//	driver.findElement(By.xpath("//div[@data-hook='signup.email']")).sendKeys("avpatil@gmail.com")	;
//	driver.findElement(By.id("//input[@id='labelled-element-2905b931-a458-bb59-244f-69843dd465ee']")).sendKeys("avpatil@gmail.com");
//	driver.findElement(By.id("//input[@id='labelled-element-2905b931-a458-bb59-244f-69843dd465ee']")).sendKeys("avpatil@gmail.com");
//	driver.findElement(By.xpath("//input[@class='wds_1_144_0_Input__input']//parent::div[@class='wds_1_144_0_Input__wrapper']//parent::div[@class='wds_1_144_0_Input__wrapper']//input[@id='labelled-element-fb7584da-d025-809e-88f9-0b2a5c7d5bbf']"))
//	  .sendKeys("admin123");
//	driver.findElement(By.id("//input[@id='labelled-element-33722a77-9606-19db-02bd-0ae33372a5c6']")).sendKeys("admin123");
	Thread.sleep(2000);
	
	}

}
