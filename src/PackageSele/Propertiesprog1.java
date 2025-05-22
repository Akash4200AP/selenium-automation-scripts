package PackageSele;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertiesprog1 {

	public static void main(String[] args) throws Exception {

		// Locate url file properties
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\Repository\\Url.properties");
		// Load File using FileInputStream class
		FileInputStream fi = new FileInputStream(f);
		// Read file data using Property class
		Properties p = new Properties();
		p.load(fi);

		// Locate TestData file properties
		File f1 = new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\Repository\\TestData.properties");
		// Load File using FileInputStream class
		FileInputStream fi1 = new FileInputStream(f);
		// Read file data using Property class
		Properties p1 = new Properties();
		p.load(fi1);
		
		// Locate Locators file properties
		File f2 = new File("C:\\Users\\HP\\eclipse-workspace\\SeleniumProject\\Repository\\Locators.properties");
		// Load File using FileInputStream class
		FileInputStream fi2 = new FileInputStream(f);
		// Read file data using Property class
		Properties p2 = new Properties();
		p.load(fi2);

		//Set property of chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(p.getProperty("url_1"));

	}

}
