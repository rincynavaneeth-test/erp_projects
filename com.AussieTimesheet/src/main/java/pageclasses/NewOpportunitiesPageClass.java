package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.GeneralUtilities;
import utilities.WaitUtility;

public class NewOpportunitiesPageClass {

	WebDriver driver;
	GeneralUtilities glu = new GeneralUtilities();
	WaitUtility wu = new WaitUtility();

	public NewOpportunitiesPageClass(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://erp.qabible.in/admin/opportunities/create']")
	WebElement new_opportunities;
	
	@FindBy(name = "opportunity_name")
	WebElement opportunityNameInput;

	@FindBy(xpath = "//button[@type='submit' and text()='Save']")
	WebElement opportunitySaveButton;
	
	@FindBy(css = "div.alert.alert-success")
	WebElement successAlert;

	
	public void enterOpportunityNameAndSave(String opportunityName) {
	    wu.waitForElementToBeVisibleByWebElement(driver, opportunityNameInput, 5);
	    glu.clearAndSendKeys(opportunityNameInput, opportunityName);

	    wu.waitForElementToBeClickableByWebElement(driver, opportunitySaveButton, 5);
	    opportunitySaveButton.click();
	}
	
	public boolean isSuccessMessageDisplayed() {
	    wu.waitForElementToBeVisibleByWebElement(driver, successAlert, 5);
	    return successAlert.isDisplayed();
	}

	public String getSuccessMessageText() {
	    return successAlert.getText().trim();
	}

	public String getPageTitleText() {
		return glu.getTextOfElement(new_opportunities);
	}
	
}
