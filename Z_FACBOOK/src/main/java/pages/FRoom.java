package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FRoom {
	@FindBy (xpath="//a[text()=' Return to messenger.com ']")
	private WebElement gobackmessenger;
	@FindBy (xpath="//a[text()=' Visit our help center ']")
	private WebElement visitourhelpcenter;
	public FRoom (WebDriver driver123) {
		PageFactory.initElements(driver123,this);
		
	}
	public void clickreturntomessenger() {
		gobackmessenger.click();
	}
	public void visitourhelpcenter() {
		visitourhelpcenter.click();
	}

}
