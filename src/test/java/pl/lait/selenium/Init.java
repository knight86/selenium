package pl.lait.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {

	static WebDriver driver = null;

	public static WebDriver getDriver() {
		System.out.println("wewn getDriver");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Paweł\\Desktop\\Kurs tester\\chromedriver_win32\\chromedriver.exe");
		if(driver == null) {
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		return driver;
		} else {
			return driver;
		}
		
	}

	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void close() {
		driver.quit();
		driver = null;
	}
}