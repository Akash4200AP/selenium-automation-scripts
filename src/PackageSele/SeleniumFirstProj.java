package PackageSele;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProj {

	public static void main(String[] args) throws Exception {

		// Set System Property my giving Chromedriver path

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// Lunch ChromeBrowser

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); -->Implicit
		// wait applicable for each of the element, chromebrowser instance
		// will wait for 60 sec for each elements to locate

		Thread.sleep(2000); // It is explicit wait applied to see each and every step one after another, if
							// we are not using it then ChromeBrowser
							// instance will do fast execution within a second

		// Window Maximize
		driver.manage().window().maximize();

		Thread.sleep(2000);

		// To Get Specified Url using .get() method
		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		// To navigate specific url use .navigate().to
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);

		// To navigate back means comes back to previous window
		driver.navigate().back();
		Thread.sleep(2000);

		// To forward to next window
		driver.navigate().forward();
		Thread.sleep(2000);

		// To refresh the current page
		driver.navigate().refresh();
		Thread.sleep(2000);

		// To get CurrentUrl use .getCurrentUrl method and puted into print statement
		// beacuse we want to print it on console
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);

		// To get Title of current window use .getTitle() method and puted into print
		// statement beacuse we want to print it on console
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.close(); // Close the window

	}

}
