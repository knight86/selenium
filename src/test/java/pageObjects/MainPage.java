package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium.Init;

public class MainPage {

	WebDriver driver;
	
	@FindBy(linkText = "CONTACT")
	WebElement contactLink;
	
	@FindBy(linkText = "REGISTER")
	WebElement registerLink;
	
	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;
	
	@FindBy(linkText = "SUPPORT")
	WebElement supportLink;
	
	public MainPage() {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void contactLinkClick() {
		contactLink.click();
	}
	public void registerLinkClick() {
		contactLink.click();
	}
	public void supportLinkClick() {
		contactLink.click();
	}
	public void signOnLinkClick() {
		signOnLink.click();
	}
}
