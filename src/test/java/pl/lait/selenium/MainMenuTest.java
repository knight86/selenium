package pl.lait.selenium;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.LoginPage;
import pageObjects.MainPage;


public class MainMenuTest {

	
	WebDriver driver;

	@Before
	public void start() {
		System.out.println("wewnątrz metody start - @before");
		driver = Init.getDriver();
	}

	@Test
	public void topMenuTest() {
		MainPage mp = new MainPage();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		mp.contactLinkClick();
		mp.registerLinkClick();
		mp.supportLinkClick();
		mp.signOnLinkClick();
		
		title = driver.getTitle();
		System.out.println(title);
		
		Init.sleep(1);
	}

	@Test
	public void login() {
		String title = driver.getTitle();
		System.out.println(title);
		
		LoginPage lp = new LoginPage();
		MainPage mp = new MainPage();
		
		mp.signOnLinkClick();
		lp.loginAs("knight86", "stefan");
		
		title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertTrue("page title is wrong", title.equals("Find a Flight: Mercury Tours:"));
		
		Init.sleep(1);
	}

	@After
	public void quit() {
		Init.close();
	}
}
