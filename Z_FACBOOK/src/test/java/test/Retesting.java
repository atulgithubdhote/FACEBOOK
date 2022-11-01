package test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browsersetup.Base;
import pages.NEWLoginpage;
import utils.utility;

public class Retesting {
	private	WebDriver driver;
	private	NEWLoginpage  nEWLoginpage;
	String data;
	int row=0;
	private int testID =123;
		@BeforeTest
		public void openbrowser() {
			driver=Base.opencromebrowser() ;////importantline othervise give execption; null driver
			//System.setProperty("webdriver.chrome.driver", "C:\\velocity\\chromedriver_win32 (1)\\chromedriver.exe");
			// driver=new ChromeDriver();
			 
		}
		@BeforeClass
		public void POMobject() {
		  nEWLoginpage =new NEWLoginpage (driver);
		  }
		@BeforeMethod
		public void Gotofacebook() {
			driver.get("https://www.facebook.com/login/");
		}
		@Test (invocationCount=3)
		public void verifyloginSENDDATA() throws Exception {
			testID=123;
		String	data=utility.geteceldata("B", row, 0);
		nEWLoginpage.sendusername(data);
	 data=utility.geteceldata("B", row, 1);
	 nEWLoginpage.sendpassword(data);
	 nEWLoginpage.clicklogin();
	 row++;
	 
		}
		@AfterMethod
		public  void faiilscreenshot(ITestResult result) throws Exception {
			if(ITestResult.FAILURE==result.getStatus()) {
				utility.scrrenshot(driver, testID);
			}
		}
		@AfterClass
		public void closedriver() {
			nEWLoginpage=null;
		}
		@AfterTest
		public void aftertest() {
			driver.quit();
		}
}
