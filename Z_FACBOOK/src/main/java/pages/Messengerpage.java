package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Messengerpage {
//declaration
	@FindBy (xpath="//a[@href='https://www.messenger.com/rooms']")
	private	WebElement room;
		@FindBy (xpath="//a[@href='https://www.messenger.com/features']")
		private WebElement feature;
		//initialisation
		
		public Messengerpage(WebDriver driver123) {
			PageFactory.initElements(driver123, this);
		}
		public void openroom() {
			room.click();
		}
     public void openfeature() {
	feature.click();
}
	}


