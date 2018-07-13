package com.testersconnect.tasks;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testersconnect.common.Utils;
import com.testersconnect.pages.ContactPage;
import com.testersconnect.tests.TestCaseBase;

public class ContactPageActions {

	ContactPage cp;

	public ContactPageActions() {

		cp = PageFactory.initElements(TestCaseBase.driver, ContactPage.class);
	}

	public void createContact() throws InterruptedException {
		cp.contactMenu.click();
		cp.lnkContact.click();
		cp.btnCreateContact.click();
		Utils.sleep(5000);
		cp.txtEmail.sendKeys("smith@gmail.com");
		cp.txtFname.sendKeys("Smith");
		cp.txtLname.sendKeys("Sulevan");
		Thread.sleep(5000);
		cp.txtJtitle.sendKeys("SystemEngg");
		Utils.sleep(5000);
		cp.btnConfirmContact.click();

	}

	public void searchContact(String name) {

		Utils.sleep(5000);
		cp.txtContactSearch.sendKeys("Smith Sulevan");

	}

	public void verifyHSContact() {
		Utils.sleep(5000);
		cp.btngoBack.click();
		//cp.selectContact.click();
		Utils.sleep(5000);
		boolean rc = cp.selectContact.isDisplayed();
		Assert.assertEquals(rc, true);
		Utils.sleep(5000);
		cp.selectContact.click();

	}

	public void goBackHSButton() {
		Utils.sleep(5000);
		cp.selectContact.click();

	}

	public void deleteHSContact() {
		Utils.sleep(5000);
		cp.btnAction.click();
		Utils.sleep(5000);
		cp.menuItemDelete.click();
		Utils.sleep(5000);
		cp.btnPopUpDelete.click();

	}

	public void verifyDeleteContact() {

		Utils.sleep(5000);
		cp.searchDelContact.sendKeys("Smith Sulevan");
		boolean ver = cp.lblNoContacts.isDisplayed();
		Assert.assertEquals(ver, true);
	}

}
