package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FCreatnewaccount;
import pages.FLoginpage;

public class VerifyCreatNewaccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//3td version
		//driver.manage().window().maximize();
		//==========		FLoginpage================
		FLoginpage fLoginpage =new FLoginpage(driver);
		fLoginpage.creatnewacc();
		//=======================FCreatnewaccount=========
		FCreatnewaccount fCreatnewaccount =new FCreatnewaccount (driver);
		fCreatnewaccount .sendfirstname();
		fCreatnewaccount.sendlastname();
		fCreatnewaccount.selectday();
		fCreatnewaccount.selectmonth();
		fCreatnewaccount.selectyear();
		
	
		
		
	}

}
