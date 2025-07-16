package pageclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.GeneralUtilities;
import utilities.WaitUtility;

public class CalenderPageClass {

	WebDriver driver;
	WaitUtility wu = new WaitUtility();
	GeneralUtilities glu = new GeneralUtilities();

	public CalenderPageClass(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@title='Calendar']")
	WebElement calender;

	@FindBy(xpath = "//a[@data-target='#myModal']//i[@class='fa fa-cogs']")
	WebElement openHolidayModalButton;

	@FindBy(xpath = "//div[@class='modal-content']")
	WebElement modalBox;

	@FindBy(xpath = "//button[@class='close' or @data-dismiss='modal' or text()='Close']")
	WebElement closeButton;

	@FindBy(css = "a[data-target='#calendar_settings_modal']")
	WebElement calendarSettingsIcon;

	@FindBy(name = "gcal_api_key")
	WebElement googleCalendarApiInput;

	@FindBy(name = "gcal_id")
	WebElement calendarIdInput;

	@FindBy(name = "project_on_calendar")
	WebElement projectsCheckbox;

	@FindBy(xpath = "//button[@type='submit' and contains(text(),'Save')]")
	private WebElement saveButton;

	public String getTextOfCalenderPage() {

		return glu.getTextOfElement(calender);
	}

	public void openSettingsModal() {
		wu.waitForElementToBeClickableByWebElement(driver, openHolidayModalButton, 5);
		openHolidayModalButton.click();
	}

	public boolean isSettingsModalVisible() {
		try {
			// Wait for modal to be invisible
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			return !wait.until(ExpectedConditions.invisibilityOf(modalBox));
		} catch (Exception e) {
			return false; // Assume it's not visible on exception
		}
	}

	public void saveHolidayFormModal() {
		saveButton.click();
	}

	public void closeHolidayFormModal() {
		closeButton.click();
	}

	public void tickProjectsCheckbox(WebDriver driver) {
		glu.clickUsingJavaScriptExecutor(driver, projectsCheckbox);
	}
}
