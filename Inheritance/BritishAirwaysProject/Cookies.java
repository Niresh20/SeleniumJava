package britishAirwaysProject.BritishAirwaysProject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import commonuseractions.CommonActionMethods;
import utils.DriverFactory;

public class Cookies extends CommonActionMethods {
	
	
	@FindBy(id = "ensCloseBanner")
	WebElement homePageCookies;
	
	public Cookies() {
		PageFactory.initElements(new AjaxElementLocatorFactory(DriverFactory.getDriver(), 30), this);
	} 
	
	
	public void acceptCookies() {
		try {
			clickMethod(homePageCookies, "Cookies");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}

