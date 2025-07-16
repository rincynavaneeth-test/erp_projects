package testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageclasses.DashboardPageClass;
import pageclasses.LoginPageClass;
import pageclasses.NewOpportunitiesPageClass;
import pageclasses.OpportunitiesPageClass;
import utilities.ExcelReadUtility;
import utilities.RandomUtility;

public class OpportunitiesPageTestClass extends BaseClass {

	LoginPageClass lp;
	DashboardPageClass dp;
	OpportunitiesPageClass op;
	NewOpportunitiesPageClass nop;

	@Test(priority = 4)
	public void verifyToLoadOpportunitiesPageWhileHittingDashboardMenu() throws IOException {

		lp = new LoginPageClass(driver);
		dp = lp.login(ExcelReadUtility.getStringData(3, 0, "LoginPage"),
				ExcelReadUtility.getIntData(3, 1, "LoginPage"));
		op = dp.clickOnOpportunitiesMenu();
		String actualResult = op.getTextOfOpportunities();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, "Opportunities");

	}

	@Test(priority = 5)
	public void verifyToLoadNewOpportunitiesPageWhileHittingOpportunitiesMenu() throws IOException {
		lp = new LoginPageClass(driver);
		dp = lp.login(ExcelReadUtility.getStringData(3, 0, "LoginPage"),
				ExcelReadUtility.getIntData(3, 1, "LoginPage"));
		op = dp.clickOnOpportunitiesMenu();
		op.clickOnNewOpportunities();
		String actualTitle = nop.getPageTitleText();
	    Assert.assertEquals(actualTitle, "New Opportunity");

	}
	
	@Test(priority = 6)
	public void verifyNewOpportunityCanBeCreated() throws IOException {
	    lp = new LoginPageClass(driver);
	    dp = lp.login(
	        ExcelReadUtility.getStringData(3, 0, "LoginPage"),
	        ExcelReadUtility.getIntData(3, 1, "LoginPage")
	    );

	    op = dp.clickOnOpportunitiesMenu();
	    op.clickOnNewOpportunities();

	    String opportunityName = "Enterprise Deal " + RandomUtility.generateRandomString(5);

	    NewOpportunitiesPageClass nop = new NewOpportunitiesPageClass(driver);
	    nop.enterOpportunityNameAndSave(opportunityName);

	    Assert.assertTrue(nop.isSuccessMessageDisplayed(), "Success message not shown");
	    Assert.assertEquals(nop.getSuccessMessageText(), "Opportunity added successfully", "Message text mismatch");
	}
}
