package testclasses;

import java.io.IOException;
import java.util.Base64;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageclasses.DashboardPageClass;
import pageclasses.LoginPageClass;
import pageclasses.NewOpportunitiesPageClass;
import pageclasses.OpportunitiesPageClass;
import utilities.ExcelReadUtility;

public class NewOpportunitiesPageTestClass extends BaseClass {

	LoginPageClass lp;
	DashboardPageClass dp;
	OpportunitiesPageClass op;
	NewOpportunitiesPageClass nop;

}