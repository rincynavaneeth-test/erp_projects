package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;
import utilities.WaitUtility;

public class OpportunitiesPageClass {

	WebDriver driver;
	GeneralUtilities glu = new GeneralUtilities();
	WaitUtility wu = new WaitUtility();

	public OpportunitiesPageClass(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Opportunities']")
	WebElement Opportunities;
	@FindBy(xpath = "//a[@href='https://erp.qabible.in/admin/opportunities/create']")
	WebElement new_opportunities;

	public String getTextOfOpportunities() {

		return glu.getTextOfElement(Opportunities);
	}

	public NewOpportunitiesPageClass clickOnNewOpportunities() {
		glu.clickUsingJavaScriptExecutor(driver, new_opportunities);
		return new NewOpportunitiesPageClass(driver);
	}



}
