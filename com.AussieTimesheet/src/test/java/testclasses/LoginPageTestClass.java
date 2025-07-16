package testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import dataProvider.DataProviderClass;
import pageclasses.DashboardPageClass;
import pageclasses.LoginPageClass;
import utilities.ExcelReadUtility;

public class LoginPageTestClass extends BaseClass {

	LoginPageClass lp;
	DashboardPageClass dp;

	@Test(priority = 2, groups = {"Group 1"})
	public void verifySuccessfullLogin() throws IOException {

		lp = new LoginPageClass(driver);
		lp.login(ExcelReadUtility.getStringData(3, 0, "LoginPage"), ExcelReadUtility.getIntData(3, 1, "LoginPage"));
		dp = new DashboardPageClass(driver);
		String actualResult = dp.getTextOfDashboard();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, "Dashboard");

	}

	@Test(priority = 1, dataProvider = "unsuccessfullLogin", dataProviderClass = DataProviderClass.class, groups = {"Group 2"})
	public void verifyUnsuccessfullLogin(String u, String p) throws IOException {

		lp = new LoginPageClass(driver);
		dp = lp.login(u, p);
		String actualResult = lp.getTextOfErrorMessage();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, "username or password information doesn't exist!");
	}
	
	@Test(priority = 3)
	public void verifyRememberMeCheckboxFunctionality() {

	    lp = new LoginPageClass(driver);
	    lp.clickOnRememberMeCheckbox();
	    boolean isDisplayed = lp.isRememberMeCheckboxSelected();
	    Assert.assertTrue(isDisplayed, "Remember Me checkbox is not visible");
	    System.out.println("Display status: " + (isDisplayed ? "Displayed" : "Not Displayed"));



}
}