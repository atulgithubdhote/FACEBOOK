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



import browsersetup.Base;
import pages.FLoginpage;
	import pages.FRoom;
	import pages.Messengerpage;
	public class Newif_elsebrowsersetup  extends Base{

	
		private WebDriver driver;
		private FLoginpage  lLoginpage;
		private Messengerpage  messengerpage;
		private FRoom froom;
	@Parameters("browser")
	@BeforeTest
	public void lounchBrouser(String browsername) {
		if (browsername.equals("Chrome")) {
	//driver=	Base.opencromebrowser(); bcz we extend base class
			driver=	opencromebrowser();
		 }
		if(browsername.equals("Firfox")) {
		//driver=	Base.firfoxbrowser();
		driver=	firfoxbrowser();
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
//		Assert.assertEquals(ttl, false);
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




