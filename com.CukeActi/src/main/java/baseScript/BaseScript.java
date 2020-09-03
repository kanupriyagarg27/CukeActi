package baseScript;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseScript {
	public static WebDriver driver;
	public static Properties prop;

	public BaseScript() {
		try {
			System.out.println("I am in BaseScript constructor");
			File src = new File(".\\src\\test\\resources\\env.properties");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
			System.out.println("file not found " + e.getMessage());
		}
	}

	public static void initApp() {

		System.out.println("i am in basescript initApp");
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\browserdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\browserdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.manage().deleteAllCookies();

	}

	public static void geturl() {
		String myurl = prop.getProperty("url");
		driver.get(myurl);
	}
}
