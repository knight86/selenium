package pl.lait.selenium;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MainMenuTest {

	WebDriver driver;

	@Before
	public void start() {
		driver = Init.getDriver();
	}
	
	@Test
	public void login() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("knight86");
		driver.findElement(By.name("password")).sendKeys("stefan");
		Init.sleep(2);
		driver.findElement(By.name("login")).click();
		Init.sleep(2);
		
		String oneWayXpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
		driver.findElement(By.xpath(oneWayXpath)).click();
	
	
	WebElement passSelect = driver.findElement(By.name("passCount"));
	Select pass = new Select(passSelect);
	pass.selectByValue("2");
	Init.sleep(1);
	
	WebElement fromSelect = driver.findElement(By.name("fromPort"));
	Select from = new Select(fromSelect);
	from.selectByValue("Frankfurt");
	Init.sleep(1);
	
	WebElement fromMonth = driver.findElement(By.name("fromMonth"));
	Select Month = new Select(fromMonth);
	Month.selectByValue("9");
	Init.sleep(1);
	
	WebElement fromDay = driver.findElement(By.name("fromDay"));
	Select Day = new Select(fromDay);
	Day.selectByValue("20");
	Init.sleep(1);
	
	WebElement toPort = driver.findElement(By.name("toPort"));
	Select Port = new Select(toPort);
	Port.selectByValue("Zurich");
	Init.sleep(1);
	
	WebElement toMonth = driver.findElement(By.name("toMonth"));
	Select doMonth = new Select(toMonth);
	doMonth.selectByValue("4");
	Init.sleep(1);

	WebElement toDay = driver.findElement(By.name("toDay"));
	Select iDay = new Select(toDay);
	iDay.selectByValue("13");
	Init.sleep(1);
	
	String preferencesXpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]";
	driver.findElement(By.xpath(preferencesXpath)).click();
	Init.sleep(1);
	
	WebElement toAirlane = driver.findElement(By.name("airline"));
	Select Airlane = new Select(toAirlane);
	Airlane.selectByVisibleText("Blue Skies Airlines");
	Init.sleep(1);
	
	driver.findElement(By.name("findFlights")).click();
	Init.sleep(1);
	
	}
	
	@After
	public void quit() {
		Init.close();
	}
}
