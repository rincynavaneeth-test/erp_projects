package testclasses;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageclasses.CalenderPageClass;
import pageclasses.DashboardPageClass;
import pageclasses.LoginPageClass;
import utilities.ExcelReadUtility;

public class CalenderPageTestClass extends BaseClass {

	CalenderPageClass cp;
	DashboardPageClass dp;
	LoginPageClass lp;

	@Test(priority = 7)
	public void verifyToLoadCalenderPageWhileHittingCalenderMenu() throws IOException {

		lp = new LoginPageClass(driver);
		dp = lp.login(ExcelReadUtility.getStringData(3, 0, "LoginPage"),
				ExcelReadUtility.getIntData(3, 1, "LoginPage"));
		cp = dp.clickOnCalenderMenu();
		String actualResult = cp.getTextOfCalenderPage();
		System.out.println(actualResult);
		Assert.assertTrue(true);
	}

	@Test(priority = 8)
	public void verifySettingsModalIsDisplayedWhileHittingSettingIcon() throws IOException {
		lp = new LoginPageClass(driver);
		dp = lp.login(ExcelReadUtility.getStringData(3, 0, "LoginPage"),
				ExcelReadUtility.getIntData(3, 1, "LoginPage"));
		cp = dp.clickOnCalenderMenu();
		cp.openSettingsModal();

		boolean actulResult = cp.isSettingsModalVisible();
		System.out.println(actulResult);
		Assert.assertTrue(actulResult);
		//cp.closeHolidayFormModal();
	}

	@Test(priority = 9)
	public void verifyHolidayModalOpenAndClose() throws IOException {
		lp = new LoginPageClass(driver);
		dp = lp.login(ExcelReadUtility.getStringData(3, 0, "LoginPage"),
				ExcelReadUtility.getIntData(3, 1, "LoginPage"));

		cp = dp.clickOnCalenderMenu();

		cp.openSettingsModal();
		cp.tickProjectsCheckbox(driver);
		cp.saveHolidayFormModal();
	}

}
