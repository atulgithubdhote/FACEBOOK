package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class FinalCLasstestng extends Base{
			private	WebDriver driver;
			private	NEWLoginpage  nEWLoginpage;
			String data;
			private int testID ;
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
				@Test
				public void verifyloginSENDDATA() throws Exception {
					testID=123;
				String	data=utility.geteceldata("B", 0, 0);
				nEWLoginpage.sendusername(data);
			 data=utility.geteceldata("B", 0, 1);
			 nEWLoginpage.sendpassword(data);
			 nEWLoginpage.clicklogin();
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
					driver.close();
				}
}
