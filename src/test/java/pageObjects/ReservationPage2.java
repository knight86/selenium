package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium.Init;

public class ReservationPage2 {

	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")
	WebElement radio3;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input")
	WebElement radio6;
	
	@FindBy(name = "reserveFlights")
	WebElement continueBtn;
	
	//---- 3rd step of reservation ---
	
	@FindBy(name = "passFirst0")
	WebElement passFirst0;
	
	@FindBy(name = "passLasr0")
	WebElement passLast0;
	
	@FindBy(name = "buyFlights")
	WebElement purchase;
	
	public ReservationPage2() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
		}
	
	public void radio3click() {
		radio3.click();
	}
	public void radio6click() {
		radio6.click();	
		}
	public void continueBtnClick() {
		continueBtn.click();
	}
	public void pass0(String first, String last) {
		passFirst0.sendKeys(first);
		passLast0.sendKeys(last);
	}	
	public void purchase() {
		purchase.click();
		}
	}
