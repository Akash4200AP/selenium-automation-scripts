package PackageSele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class IframePract {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("https://vinothqaacademy.com/iframe/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame("homepage");
		
		driver.findElement(By.xpath("//a[text()='Docs']")).click();
		
		Thread.sleep(2000);
		
		

	}

}
