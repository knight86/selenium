package pl.lait.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainMenuTest {
	
	
	WebDriver driver;
	
	@Before
	public void start() {
		driver = Init.getDriver();
		}
	
	
	@Test
	public void mainMenu() {
		driver.findElement(By.linkText("CONTACT")).click();
	}
}
