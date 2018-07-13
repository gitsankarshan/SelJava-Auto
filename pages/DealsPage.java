package com.testersconnect.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DealsPage

{
	@FindBy(xpath = "//a[@id='nav-primary-sales-branch']")
	public WebElement salesMenu;

	@FindBy(xpath = "//a[@id='nav-secondary-deals']")
	public WebElement selectDeals;

	@FindBy(xpath = "//span[contains(text(),'Create deal')]")
	public WebElement btnCreateDeal;

	@FindBy(xpath = "//input[@data-field='dealname']")
	public WebElement txtDealName;

	@FindBy(xpath = "//button/span/span[@class='private-dropdown__button-label uiDropdown__buttonLabel']")
	public List<WebElement> dropDownLblPipeline;

	@FindBy(xpath = "//span/span/span[.='Sales Pipeline']")
	public WebElement dropDownSalesPipeLine;

	@FindBy(xpath = "//button/span/span[@class='private-dropdown__button-label uiDropdown__buttonLabel']")
	public List<WebElement> dropDownLblDealStage;

	@FindBy(xpath = "//span/span/span[.='Presentation Scheduled']")
	public WebElement dropDownPresentation;

	@FindBy(xpath = "//input[@data-field='amount']")
	public WebElement txtAmount;

	@FindBy(xpath = "//span[.='Create']")
	public WebElement btnConfirmCreateDeal;

	@FindBy(xpath = "//i18n-string[.='Deals']")
	public WebElement btnGoBackDeal;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement txtSearchDeal;

	@FindBy(xpath = "//a[.='Convoy']")
	public WebElement lnkSelectDeal;

	@FindBy(xpath = "//span[contains(@class,'private-checkbox__icon private-checkbox__dash')]")
	public List<WebElement> checkDelete;
	// List<WebElement> is used to select one item from xpath,which has more than 1
	// match.

	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	public WebElement btnDelete;

	@FindBy(xpath = "//textarea")
	public WebElement txtPopUpDelete;

	@FindBy(xpath = "//div/button/span[.='Delete']")
	public WebElement btnConfirmDelete;

	@FindBy(xpath = "//h2")
	public WebElement lblVerifyDelete;

	@FindBy(xpath = "//span/span[.='blank']")
	public List<WebElement> pipeLineList;

	@FindBy(xpath = "//span/span[.='success']")
	public List<WebElement> verifyPipeLineList;
}
