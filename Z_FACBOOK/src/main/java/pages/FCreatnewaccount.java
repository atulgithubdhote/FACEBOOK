package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class FCreatnewaccount {
	

	// webelement declar
		@FindBy (xpath="//input[@aria-label='First name']")
		private	WebElement firstname ;
		@ FindBy (xpath="//input[@aria-label='Surname']")
		private WebElement lastname;
		@FindBy (xpath="//select[@id='day']")
		private WebElement day;
		@FindBy (xpath="//select[@id='month']")
		private	WebElement month;
		@FindBy (xpath="//select[@id='year']")
		private	WebElement year;
		
		
		//variable webelement initialisation
		public FCreatnewaccount (WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		
		public void sendfirstname() {
			firstname.sendKeys("atul");
		}
		public void sendlastname() 
		{lastname.sendKeys("dhote");}
		public void selectday() 
			{Select d=new Select(day);
			d.selectByIndex(16);
			}
		public void selectmonth() {
			Select m= new Select(month);
			m.selectByValue("2");;
		}
		public void selectyear() {
			Select y= new Select(year);
		    y.selectByVisibleText("2021");
		}
		


	}


