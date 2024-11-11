package TestCases;

import java.io.IOException;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjectClass.HealthandWellnessPage;
import TestBase.BaseClass;
 import Utills.ExcelUtils;

public class TC__03_HealthandWellnessPage extends BaseClass {

	@Test(groups = { "regression", "sanity", "master" })
	public void click() throws IOException {
		HealthandWellnessPage HWP = new HealthandWellnessPage(driver);
		boolean Actual = HWP.click();
		Assert.assertEquals(Actual, true);
		captureScreen("TC3");
  	}

	@Test(groups = { "regression", "master" })
	public void clickAgainWithExcelData() throws Exception {

		HealthandWellnessPage HWP = new HealthandWellnessPage(driver);
		List<String> ExcelInputData = ExcelUtils.InvalidData();
		System.out.println(ExcelInputData);
		boolean Actual = HWP.ClickOnHealthwithInvalidData(ExcelInputData);
		Assert.assertEquals(Actual, false);
		captureScreen("providing the invalid data");
 	}

	

	@Test(groups = { "regression", "master" })
	public void clickOnceAgain() throws Exception {

		HealthandWellnessPage HWP = new HealthandWellnessPage(driver);
		List<String> ExcelInputData1 = ExcelUtils.ValidData();
		System.out.println(ExcelInputData1);
		HWP.ClickOnHealthwithValidData(ExcelInputData1);
		captureScreen("providing the valid data");

 	}

	@Test(groups = { "regression", "master" })
	public void validate_Thankyou() throws IOException {
		HealthandWellnessPage HWP = new HealthandWellnessPage(driver);
		Assert.assertEquals(true, HWP.validate());
		captureScreen("Thank You Message");

 	}

}
