package base;

import org.testng.annotations.Test;

import constants.ConstantsClass;
import extentReport.ExtentManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class BaseClass {

	public static WebDriver driver;
	WebDriverWait explicitWait;
	public static Properties property;

	public static void readProperty() throws IOException {
		property = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + ConstantsClass.propertiesFilePath);
		property.load(file);

	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		readProperty();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(property.getProperty("baseurl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConstantsClass.implicitWaitTimeout));
	}

	@AfterMethod
	public void afterMethod() {
		// driver.quit();
	}

	@BeforeSuite
	public void createReport() {
		ExtentManager.createInstance();
	}

}