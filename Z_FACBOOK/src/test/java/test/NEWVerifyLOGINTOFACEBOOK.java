package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.NEWLoginpage;
import utils.utility;
public class NEWVerifyLOGINTOFACEBOOK {
	private WebDriver driver;
	SoftAssert ss;
	private  int testID;
	String data ;
	int row=0;
	NEWLoginpage  nEWLoginpage ;
	
	/*@BeforeClass
	public void lounchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
	}*/
	@BeforeClass
	public void lounchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
	}
	@BeforeMethod
	public void gotofacebook() {
		driver.get("https://www.facebook.com/login/");	 
		  nEWLoginpage=new NEWLoginpage (driver);
			 ss=new SoftAssert();
			

	}
	@Test   //(invocationCount=3)
	public void senddata() throws Exception {
		testID=123;
		
	data=	utility.geteceldata("B", 0, 0);
	nEWLoginpage.sendusername(data);
	
	data=	utility.geteceldata("B", 0, 1);
	nEWLoginpage.sendpassword(data);
	Thread.sleep(2000);
	nEWLoginpage.clicklogin();
String url=	driver.getCurrentUrl();
	ss.assertEquals(url,"https://www.facebook.com/login/");
	ss.assertAll();
//	testID++;
	}
    @AfterMethod
    public void failscreenshot(ITestResult result) throws Exception {
    	if(ITestResult.FAILURE==result.getStatus()) {
    		utility.scrrenshot(driver, testID);	
    	}
    }
    @AfterClass
    public void clossedbrowser() {
    	driver.close();
    }
    
}
