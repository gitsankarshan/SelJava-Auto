package com.testersconnect.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.testersconnect.common.Utils;
import com.testersconnect.pages.LoginPage;
import com.testersconnect.tests.TestCaseBase;

public class LoginPageActions {

	public static WebDriver driver;
	LoginPage lp;

	public LoginPageActions() {
		// page object

		lp = PageFactory.initElements(TestCaseBase.driver, LoginPage.class);// lp is page object(pageObjectModel)
	}

	public void login(String un, String pwd) {

		lp.txtUserName.sendKeys(un);// txtUserName=web elements
		lp.txtpassword.sendKeys(pwd);
		lp.btnlogin.click();

	}

}
