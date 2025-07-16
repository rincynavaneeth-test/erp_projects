package testclasses;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageclasses.CalenderPageClass;
import pageclasses.DashboardPageClass;
import pageclasses.LoginPageClass;
import pageclasses.OpportunitiesPageClass;
import utilities.ExcelReadUtility;

public class DashboardPageTestClass extends BaseClass {

	DashboardPageClass dp;
	LoginPageClass lp;
	Actions act;

	@Test(priority = 3, groups = {"Group 1"})
	public void verifyLogoIsDisplayedAfterLogin() throws IOException {
		lp = new LoginPageClass(driver);
		dp = lp.login(ExcelReadUtility.getStringData(3, 0, "LoginPage"),
				ExcelReadUtility.getIntData(3, 1, "LoginPage"));

		boolean actualResult = dp.isLogoDisplayed();
		System.out.println(actualResult);
		Assert.assertTrue(actualResult, "Logo is not displayed after login");
	}

}