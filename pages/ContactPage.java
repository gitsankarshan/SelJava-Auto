package com.testersconnect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

	/*
	 * @FindBy(id="hs-nav-v4") public WebElement contactArrow;
	 */

	@FindBy(xpath = "//a[@id='nav-primary-contacts-branch']")
	public WebElement contactMenu;

	@FindBy(xpath = "//a[@id='nav-secondary-contacts']")
	public WebElement lnkContact;

	@FindBy(xpath = "//span[contains(text(),'Create contact')]")
	public WebElement btnCreateContact;

	@FindBy(xpath = "//input[@data-field='email']")
	public WebElement txtEmail;

	@FindBy(xpath = "//input[@data-field='firstname']")
	public WebElement txtFname;

	@FindBy(xpath = "//input[@data-field='lastname']")
	public WebElement txtLname;

	@FindBy(xpath = "//input[@data-field='jobtitle']")
	public WebElement txtJtitle;

	@FindBy(xpath = "//button/span[contains(text(),'Create contact')]")
	public WebElement btnConfirmContact;
	
	@FindBy(xpath="//input[@type='search']")
	public WebElement txtContactSearch;
	
	
	@FindBy(xpath="//a[.='Smith Sulevan']")
	public WebElement selectContact;
	
	
	/*
	@FindBy(xpath="")
	public WebElement verifyContact;*/
	
	//To Delete & verify Contact.
	
	@FindBy(xpath="//*[.='Contacts']")
	public WebElement btngoBack;
	
	@FindBy(xpath="//button[@data-selenium-test='profile-settings-actions-btn']")
	public WebElement btnAction;

	@FindBy(xpath="//button[@data-selenium-test='profile-settings-profileSettings.delete']")
	public WebElement menuItemDelete;
	
	@FindBy(xpath="//i18n-string[@data-key='deleteModal.buttonText']")
	public WebElement btnPopUpDelete;
	
	@FindBy(css="input[type='search']") //css path
	public WebElement searchDelContact;
	
	@FindBy(xpath="//h2[contains(text(),'No contacts')]")
	public WebElement lblNoContacts;

}


