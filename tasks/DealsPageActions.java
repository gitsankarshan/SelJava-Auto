package com.testersconnect.tasks;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testersconnect.common.Utils;
import com.testersconnect.pages.DealsPage;
import com.testersconnect.tests.TestCaseBase;

public class DealsPageActions {

	DealsPage sp;

	public DealsPageActions() {
		sp = PageFactory.initElements(TestCaseBase.driver, DealsPage.class);

	}

	public void createDeal() throws InterruptedException {
		Thread.sleep(5000);
		sp.salesMenu.click();
		sp.selectDeals.click();
		sp.btnCreateDeal.click();

		Utils.sleep(5000);
		sp.txtDealName.sendKeys("Convoy");
		Utils.sleep(5000);
		sp.dropDownLblPipeline.get(0).click();
		sp.dropDownSalesPipeLine.click();
		Utils.sleep(5000);
		sp.dropDownLblDealStage.get(1).click();
		sp.dropDownPresentation.click();
		Utils.sleep(5000);
		sp.txtAmount.sendKeys("500000");
		Utils.sleep(5000);
		sp.btnConfirmCreateDeal.click();
		Utils.sleep(5000);
		sp.btnGoBackDeal.click();

	}

	public void searchDeal(String deal) {

		sp.txtSearchDeal.sendKeys("Convoy");

	}

	public void verifyHSDeal() {

		Utils.sleep(5000);
		boolean rd = sp.lnkSelectDeal.isDisplayed();
		Assert.assertEquals(rd, true);
		sp.txtSearchDeal.clear();

		// sp.lnkSelectDeal.click();

	}

	public void deleteDeal() {

		Utils.sleep(5000);
		sp.checkDelete.get(1).click();
		Utils.sleep(5000);
		sp.btnDelete.click();
		sp.txtPopUpDelete.sendKeys("1");
		sp.btnConfirmDelete.click();

	}

	public void verifyDealDelete() {

		Utils.sleep(5000);
		sp.txtSearchDeal.sendKeys("Convoy");
		Utils.sleep(5000);
		boolean ddel = sp.lblVerifyDelete.isDisplayed();
		Assert.assertEquals(ddel, true);

	}

	public void updateDeal() {
		sp.lnkSelectDeal.click();
		sp.pipeLineList.get(0).click();
	}

	public void verifyUpdateDeal() {

		Utils.sleep(5000);
		boolean pipe = sp.verifyPipeLineList.get(1).isDisplayed();
		Assert.assertEquals(pipe, true);
	}
}
