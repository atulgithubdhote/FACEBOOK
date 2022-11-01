package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NEWLoginpage {
	WebDriver driver;
	@FindBy (xpath="//input[@id='email']")
	private	WebElement username;
		
		@FindBy (xpath="// input[@type='password']")
		private	WebElement password;
		@FindBy (xpath="//button[@id='loginbutton']")
		private	WebElement login;
		@FindBy (xpath="//a[@href='https://messenger.com/']")
		private	WebElement messenger;
	
		@FindBy (xpath="//a[text()='Sign up for Facebook']")
		WebElement creatnewacc;
		
		//variable webelement initialisation
		public  NEWLoginpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;}
		
			
			//variable action
			public void sendusername(String data) {
				username.sendKeys(data);
			}
			public  void sendpassword(String pas) {
				 password.sendKeys(pas);
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
