package pageclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;
import utilities.WaitUtility;

public class LoginPageClass {

	WebDriver driver;
	GeneralUtilities glu = new GeneralUtilities();
	WaitUtility wu = new WaitUtility();

	public LoginPageClass(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='user_name']")
	WebElement username;
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElement invalid;

	// action method
	public DashboardPageClass login(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		wu.waitForElementToBeClickableByWebElement(driver, login, 5);
		login.click();
		return new DashboardPageClass(driver);
	}

	public String getTextOfErrorMessage() {
		wu.waitForElementToBeVisibleByWebElement(driver, invalid, 3);
		return glu.getTextOfElement(invalid);
	}
}