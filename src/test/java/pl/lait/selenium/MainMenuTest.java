package pl.lait.selenium;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.ReservationPage;
import pageObjects.ReservationPage2;

@Ignore
public class MainMenuTest {

	
	WebDriver driver;
	LoginPage lp = new LoginPage();
	MainPage mp = new MainPage();
	ReservationPage rp = new ReservationPage();
	ReservationPage2 rp2 = new ReservationPage2();

	@Before
	public void start() {
		System.out.println("wewnątrz metody start - @before");
		driver = Init.getDriver();
	}

	//@Ignore
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
		Init.printScr(driver, "mainMenu", "menuOnly");
		Init.sleep(1);
	}
	
	@Ignore
	@Test
	public void login() {
		String title = driver.getTitle();
		System.out.println(title);
		
		mp.signOnLinkClick();
		lp.loginAs("knight86", "stefan");
		
		title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertTrue("page title is wrong", title.equals("Find a Flight: Mercury Tours:"));
		
		Init.sleep(1);
	}

	
	@Ignore
	@Test
	public void reservationTest() {
		mp.signOnLinkClick();
		lp.loginAs("knight86", "stefan");
		rp.oneWay();
		rp.passengersCount("2");
		rp.from("Frankfurt", "17", "5");
		rp.to("London", "19", "6");
		rp.airlane("Blue Skies Airlines");
		rp.serviceBusinesClass();
		rp.continiueButtonClick();
		
		rp2.pass0("Paweł", "MMM");
		rp2.continueBtnClick();
	}
	
	@After
	public void quit() {
		Init.close();
	}
}
