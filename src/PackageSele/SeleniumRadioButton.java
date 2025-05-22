package PackageSele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumRadioButton {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		List<WebElement> radios = driver.findElements(By.xpath("//label[@class='_58mt']"));

		System.out.println(radios.size());

		String expected = "Female";

		for (int i = 0; i < radios.size(); i++) {

			if (radios.get(i).getText().equalsIgnoreCase(expected)) {
				radios.get(i).click();
			}

		}
		
	    

		WebElement dropdown = driver.findElement(By.xpath("//select[@aria-label='Day']"));

		Select select = new Select(dropdown);
		//Thread.sleep(2000);
		//select.selectByValue("28");
		
		}

	

	

}
