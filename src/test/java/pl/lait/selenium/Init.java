package pl.lait.selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;

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
	
	public static void printScr(WebDriver driver, String folderName, String testName) {

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Long milis = timestamp.getTime();

		WebDriver driver_tmp = new Augmenter().augment(driver);
		File srcFile = ((TakesScreenshot) driver_tmp).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(srcFile, new File("target/"+ folderName +"/"+ testName +"-" + milis + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}