package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium.Init;

public class LoginPage {
	
		WebDriver driver;
		
		@FindBy(name = "userName")
		WebElement userNameInput;
		
		@FindBy(name = "password")
		WebElement passwordInput;
		
		@FindBy(name = "login")
		WebElement loginButton;
		
		public LoginPage() {
			System.out.println("wewnątrz konstruktora LoginPage");
			driver = Init.getDriver();
			PageFactory.initElements(driver, this);
}
		
		public void loginAs(String login, String passwd) {
			userNameInput.sendKeys(login);
			passwordInput.sendKeys(passwd);
			loginButton.click();
		}
}
