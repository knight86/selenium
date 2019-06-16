package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium.Init;

public class ReservationPage {

	WebDriver driver;
	
	
	
	@FindBy(xpath = "/html/body/div/"
			+ "table/tbody/tr/"
			+ "td[2]/table/tbody/tr[4]/td/table/tbody/tr/"
			+ "td[2]/table/tbody/tr[5]/td/form/table/tbody/"
			+ "tr[2]/td[2]/b/font/input[2]")
	WebElement oneWayRadio;
	
	@FindBy (name = "passCount")
	WebElement passSelect;
	
	@FindBy (name = "fromPort")
	WebElement fromPortSelectWebElem;

	@FindBy (name = "toMonth")
	WebElement toMonthSelectWebElem;
	
	@FindBy (name = "toDay")
	WebElement toDaySelectWebElem;
	
	@FindBy (name = "airline")
	WebElement toAirlaneSelectWebElem;
	
	@FindBy (name = "fromDay")
	WebElement fromDaySelectWebElem;
	
	@FindBy (name = "toPort")
	WebElement toPortSelectWebElem;
	
	@FindBy (name = "fromMonth")
	WebElement fromMonthSelectWebElem;
	
	@FindBy(xpath = "/html/body/div/table/tbody/"
			+ "tr/td[2]/table/tbody/tr[4]/td/table/"
			+ "tbody/tr/td[2]/table/tbody/tr[5]/td/"
			+ "form/table/tbody/tr[9]/td[2]/font/font/input[1]")
	WebElement service;
	
	@FindBy (name = "findFlights")
	WebElement continueBtn;
	
	public ReservationPage () {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void oneWay() {
		oneWayRadio.click();
	}
	
	public void passengersCount(String number) {
		Select pass = new Select(passSelect);
		pass.selectByValue(number);
	}
	
	public void from(String fromPort, String fromDay, String fromMonth) {
		
		Select fp = new Select(fromPortSelectWebElem);
		fp.selectByVisibleText(fromPort);
		
		Select fd = new Select(fromDaySelectWebElem);
		fd.selectByValue(fromDay);
				
		Select fm = new Select(fromMonthSelectWebElem);
		fm.selectByValue(fromMonth);
		
	}
	
	public void to(String toPort, String toDay, String toMonth) {
		Select tp = new Select(toPortSelectWebElem);
		tp.selectByValue(toPort);
		Select td = new Select(toDaySelectWebElem);
		td.selectByValue(toDay);
		Select tm = new Select(toMonthSelectWebElem);
		tm.selectByValue(toMonth);
	}
	
	public void airlane(String name) {
		Select airL = new Select(toAirlaneSelectWebElem);
		airL.selectByVisibleText(name);
	}
	
	public void serviceBusinesClass() {
		service.click();
	}
	public void continiueButtonClick() {
		continueBtn.click();
	}
}
