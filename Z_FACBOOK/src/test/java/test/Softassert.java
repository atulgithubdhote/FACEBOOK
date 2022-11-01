package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.FLoginpage;
import pages.FRoom;
import pages.Messengerpage;

public class Softassert {
	private WebDriver driver;
	private FLoginpage  lLoginpage;
	private Messengerpage  messengerpage;
	private SoftAssert soft;
	private FRoom froom;
@BeforeClass
public void lounchBrouser() {
	System.setProperty("webdriver.chrome.driver", "C:\\velocity\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver=new ChromeDriver();
	// driver.get("https://www.facebook.com/login/");
}
@BeforeMethod
public void gotoRoompage() {
	driver.get("https://www.facebook.com/login/");	 
	
	  lLoginpage =new  FLoginpage(driver);
	 lLoginpage.openmessenger();
	 messengerpage =new Messengerpage (driver);
	 messengerpage .openroom();
	 froom=new  FRoom(driver);
	 soft=new  SoftAssert();
	 
	 
}
@ Test
public void Verifygotohelfcenter() {
	
	System.out.println("first test");
	 froom.visitourhelpcenter();
	String url= driver.getCurrentUrl();
	String ttl=driver.getTitle();
	//we can add message in assertion after fail
	//Assert.assertEquals(url,"https://www.messenger.com/help"," message" );
	
	soft.assertEquals(url,"https://www.messenger.com/help" );
soft.assertAll();
	//https://www.messenger.com/help
	
}
@Test
public void Verifygotomessengerpage() {
	System.out.println("second test");
	froom.clickreturntomessenger();
String url=	driver.getCurrentUrl();
	soft.assertEquals(url,"https://www.messenger.com/" );
	soft.assertAll();
	
}
@AfterMethod
public void aftermethod() {
	System.out.println("logout");
}
@AfterClass
public void aftetrclass() {
	System.out.println("after class");
}

}


