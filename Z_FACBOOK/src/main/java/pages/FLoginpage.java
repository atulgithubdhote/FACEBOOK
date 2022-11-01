package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FLoginpage {

	
		// webelement declar
		@FindBy (xpath="//input[@id='email']")
	private	WebElement username;
		
		@FindBy (xpath="// input[@type='password']")
		private	WebElement password;
		@FindBy (xpath="//button[@id='u_0_5_DD']")
		private	WebElement login;
		@FindBy (xpath="//a[@href='https://messenger.com/']")
		private	WebElement messenger;
	
		@FindBy (xpath="//a[text()='Sign up for Facebook']")
		WebElement creatnewacc;
		
		//variable webelement initialisation
		public FLoginpage(WebDriver driver) {
			PageFactory.initElements(driver, this);}
		
			
			//variable action
			public void sendusername() {
				username.sendKeys("9604184296");
			}
			public  void sendpassword() {
				 password.sendKeys("atuldhot");
			}
			public void clicklogin() {
				login.click();
			}
			public void openmessenger() {
				messenger.click();
			}
			public void creatnewacc() {
				creatnewacc.click();
			}
			
		
	}


