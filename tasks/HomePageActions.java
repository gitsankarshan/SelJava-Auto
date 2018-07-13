package com.testersconnect.tasks;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testersconnect.common.Utils;
import com.testersconnect.pages.HomePage;
import com.testersconnect.tests.TestCaseBase;

public class HomePageActions {

	HomePage hp;

	public HomePageActions() {

		hp = PageFactory.initElements(TestCaseBase.driver, HomePage.class);
	}
	// To verify Login method

	public void verifyHSLogin(String expEmail) {
		Utils.sleep(5000);
		hp.imgProfile.click();
		String actEmail = hp.profileEmail.getText();
		Assert.assertEquals(actEmail, expEmail);

	}

	public void logout() {

		
		hp.profileArrow.click();
		hp.lnkLogOut.click();

	}
}
