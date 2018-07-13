package com.testersconnect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(linkText = "signout")
	public WebElement lnkLogOut;

	// css="span[class= 'nav-dropdown-arrow']"

	@FindBy(xpath = "//img[@class= 'nav-avatar']")
	public WebElement profileArrow;

	// verify Login
	@FindBy(xpath = "//img[@class=' nav-avatar ']")
	public WebElement imgProfile;

	@FindBy(xpath = "//div[@class='user-info-email']")
	public WebElement profileEmail;

	 //WebElement signout=driver.findElement(By.id(""));
	 //signout.click();
}
