package browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
public static WebDriver opencromebrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\velocity\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 return driver;
}

public static WebDriver firfoxbrowser() {
	System.setProperty("webdriver.gecko.driver", "C:\\velocity\\firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver	driver=new FirefoxDriver();
	 return driver;
}
}
