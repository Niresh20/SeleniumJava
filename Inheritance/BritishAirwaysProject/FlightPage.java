package britishAirwaysProject.BritishAirwaysProject;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.github.dockerjava.api.model.Driver;

import commonuseractions.CommonActionMethods;
import io.netty.handler.codec.http.Cookie;
import utils.DriverFactory;

public class FlightPage extends CommonActionMethods {
	
	
	@FindBy(id = "flightTab")
	WebElement flightTab;
	
	
	@FindBy (xpath = "//input[@aria-label=\"From, search bar Departure field\"]")
	WebElement departure;
	
	@FindBy(xpath = "//input[@aria-label=\"To, search bar Destination field\"]")
	WebElement destination;
	
	
	@FindBy (id = "flight-outbound-date-selector")
	WebElement flightOutbound;
	
	@FindBy (xpath = "//div[@class=\"datepicker-table-dates-container\"]/table//tr[6]/td//span[text()=\"31\"]")
	WebElement outBoundDate;
	
	@FindBy (xpath = "//span[text()=\"Search\"]/parent::button")
	WebElement search;
	
	@FindBy (xpath = "//div[@data-ng-click=\"togglePaxMixPicker()\"]")
	WebElement passenger;
	
	@FindBy (xpath = "//div[text()=\"Adults\"]/parent::div/following-sibling::div//button[@data-ng-click=\"minus()\"]")
	WebElement minusButton;
	
	@FindBy (xpath = "//div[text()=\"Adults\"]/parent::div/following-sibling::div//button[@data-ng-click=\"plus()\"]")
	WebElement plusButton;
	
	@FindBy (xpath = "(//div[@class=\"passenger-submix\"]/div[2]//p[@data-ng-if=\"messageDescription\"])[1]")
	WebElement warningMsg;
	
	@FindBy (xpath =   "//button[@data-ng-click='togglePaxMixPicker()']")
	WebElement confirmPassenger;
	
	
	String message= "There must be at least one adult per booking for online bookings. To book for young adults travelling alone, please contact us.";
	
	public FlightPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(DriverFactory.getDriver(), 30), this);
	} 
	
	
	/*
	 * public void clearCookies() { Driver }
	 */
	
	public void flightsTab() {
		try {
			clickMethod(flightTab, "Flights");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void departureField() {
		try {
			clickMethod(departure, "Departure");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void departureFieldEnter() {
		try {
			sendKeysMethod(departure, "Delhi");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void destinationField() {
		try {
			clickMethod(destination, "Destination");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void destinationFieldEnter() {
		try {
			sendKeysMethod(destination, "Singapore");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void flightOutBound() {
		try {
			clickMethod(flightOutbound, "Flight Outbound");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void flightOutBoundDate() {
		try {			
		
			isElementPresent(outBoundDate);
			webWait(outBoundDate);
			clickMethod(outBoundDate, "Outbound");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void passengerSelection() {
		try {
			clickMethod(passenger, "Passenger selection");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void valWarningMsg() {
		try {
			webWait(minusButton);
			clickMethod(minusButton, "Minus");
			String errorMessage=getTextElement(warningMsg, "warning message");
			
			if(message.equals(errorMessage)) {
				System.out.println("Error message is displaying as expected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void plusPassenger() {
		try {
			clickMethod(plusButton, "Plus");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void confirmPassengerButton() {
		try {
			//webWait(confirmPassenger);
			clickMethod(confirmPassenger, "Confirm");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void clickSearch() {
		try {
			webWait(search);
			clickMethod(search, "Search");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	}

