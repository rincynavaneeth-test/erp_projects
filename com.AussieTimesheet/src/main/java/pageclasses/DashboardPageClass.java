package pageclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.GeneralUtilities;
import utilities.WaitUtility;

public class DashboardPageClass {

	WebDriver driver;
	WaitUtility wu = new WaitUtility();
	GeneralUtilities glu = new GeneralUtilities();

	public DashboardPageClass(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@src='https://erp.qabible.in/uploads/SurviCamLogoHighResTransparent.png']")
	WebElement logo;
	@FindBy(xpath = "//a[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//span[text()='Opportunities']")
	WebElement opportunities;
	@FindBy(xpath = "//a[@title='Calendar']")
	WebElement calender;
	@FindBy(xpath = "//span[text()='Warning']")
	WebElement warning;

	public String getTextOfDashboard() {

		return glu.getTextOfElement(dashboard);
	}

	public CalenderPageClass clickOnCalenderMenu() {
		glu.clickUsingJavaScriptExecutor(driver, calender);
		return new CalenderPageClass(driver);
	}

	public boolean isLogoDisplayed() {
		wu.waitForElementToBeClickableByWebElement(driver, logo, 5);
		return glu.isElementDisplayed(logo);
	}

	public OpportunitiesPageClass clickOnOpportunitiesMenu() {
		glu.clickUsingJavaScriptExecutor(driver, opportunities);
		return new OpportunitiesPageClass(driver);
	}

}