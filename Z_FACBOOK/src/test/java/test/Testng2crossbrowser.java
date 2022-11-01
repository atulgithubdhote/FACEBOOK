package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.FLoginpage;
import pages.FRoom;
import pages.Messengerpage;


public class Testng2crossbrowser {
	private WebDriver driver;
	private FLoginpage  lLoginpage;
	private Messengerpage  messengerpage;
	private FRoom froom;
@Parameters ("browser")
@BeforeTest
public void lounchBrouser(String browsername) {
	if (browsername.equals("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\velocity\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver=new ChromeDriver();
	 }
	if(browsername.equals("Firfox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\velocity\\firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	}
		
}
	@BeforeClass
	public void POMObject() {
		  lLoginpage =new  FLoginpage(driver);
		  messengerpage =new Messengerpage (driver);
			 froom=new  FRoom(driver);
		
	}
@BeforeMethod
public void gotoRoompage() {
	driver.get("https://www.facebook.com/login/");	 
	 lLoginpage.openmessenger();
	  messengerpage .openroom();	 
}

@ Test
public void Verifygotohelfcenter() {
	
	System.out.println("first test");
	 froom.visitourhelpcenter();
	String url= driver.getCurrentUrl();
	String ttl=driver.getTitle();
	//we can add message in assertion after fail
	//Assert.assertEquals(url,"https://www.messenger.com/help"," message" );
	Assert.assertEquals(url,"https://www.messenger.com/help" );
//	Assert.assertEquals(ttl, false);
	//https://www.messenger.com/help
}
@Test
public void Verifygotomessengerpage() {
	System.out.println("second test");
	froom.clickreturntomessenger();
String url=	driver.getCurrentUrl();
	Assert.assertEquals(url,"https://www.messenger.com/" );
	
}
@AfterMethod
public void aftermethod() {
	System.out.println("logout");
}
@AfterClass
public void Objectclossed() {
	lLoginpage =  null;
	  messengerpage =null;
		 froom=  null;
		 froom=null;
}
@AfterTest
public void aftertest() {
	System.out.println("after test closed browser");
	driver.close();
	driver=null;
	System.gc();//garbagecollection
}

}


