package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FLoginpage;
import pages.FRoom;
import pages.Messengerpage;

public class Verifycontacttohellfcenter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		 FLoginpage  lLoginpage =new  FLoginpage(driver);
		 lLoginpage.openmessenger();
		 Messengerpage  messengerpage =new Messengerpage (driver);
		 messengerpage .openroom();
		 FRoom froom=new  FRoom(driver);
		 froom.visitourhelpcenter();

	}

}
