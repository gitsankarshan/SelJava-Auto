package com.testersconnect.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testersconnect.tasks.ContactPageActions;
import com.testersconnect.tasks.HomePageActions;
import com.testersconnect.tasks.LoginPageActions;
import com.testersconnect.tasks.DealsPageActions;

public class SmokeTestSuite extends TestCaseBase {

	String HS_USER_NAME = "chanku26@gmail.com";
	public String HS_PASSWORD = "Hubspot@123";
	/*
	 * @Test(priority=1, description="Verifies Login Functionality in Hubspot ")
	 * 
	 * public void verify_hs_login() { LoginPageActions lpa= new LoginPageActions();
	 * lpa.login(HS_USER_NAME, HS_PASSWORD);
	 */

	@Test(priority = 1, description = "Verify Login Functionality in Hubspot")
	public void verifyLogin() {
		// Arrange
		LoginPageActions lpa = new LoginPageActions();
		HomePageActions hpa = new HomePageActions();

		// Act
		lpa.login("chanku26@gmail.com", "Hubspot@123");

		// Assert
		hpa.verifyHSLogin("chanku26@gmail.com");
	}

	/*
	 * @Test(priority = 2, description = "verify contact manager Functionality")
	 * public void verifyContact() throws InterruptedException {
	 * 
	 * // Arrange ContactPageActions cpa = new ContactPageActions();
	 * Thread.sleep(5000); // Act cpa.createContact(); // Assert //
	 * cpa.searchContact("Smith Sulevan");
	 * 
	 * // cpa.verifyHSContact(); }
	 * 
	 * // cpa.goBackHSButton();
	 * 
	 * @Test(priority = 3, description = "verify delete contact functionality")
	 * public void deleteContact() { ContactPageActions cpa = new
	 * ContactPageActions();
	 * 
	 * // cpa.searchContact("Smith Sulevan");
	 * 
	 * cpa.deleteHSContact();
	 * 
	 * cpa.verifyDeleteContact(); } /*
	 * 
	 * @Test(priority= 3, description=
	 * "verify go back button after contact verification") public void goBack()
	 * throws InterruptedException { //Arrange ContactPageActions cpa=new
	 * ContactPageActions(); Thread.sleep(5000); //Act cpa.goBackHSButton();
	 * //Assert
	 * 
	 * }
	 */

	@Test(priority = 4, description = "verify Create Deal Functionality in HS")
	public void verifyDeal() throws InterruptedException {

		DealsPageActions spa = new DealsPageActions();

		Thread.sleep(5000);
		spa.createDeal();

		Thread.sleep(5000);
		spa.searchDeal("Convoy");

		Thread.sleep(5000);
		spa.verifyHSDeal();
		
		Thread.sleep(5000);
		spa.updateDeal();
		
		Thread.sleep(5000);
		spa.verifyUpdateDeal();

		/*Thread.sleep(5000);
		spa.deleteDeal();

		Thread.sleep(5000);
		spa.verifyDealDelete();*/
	}

}
