package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);// Selenium dev added==>driver null value
	}

	@FindBy(xpath = " //*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
	private WebElement Cookies;

	public WebElement getCookies() {
		return Cookies;
	}

	@FindBy(xpath = "//*[@class='button button--tertiary-dark account-link__text']")
	private WebElement SignBnt;

	public WebElement getSignBnt() {
		return SignBnt;

	}

	@FindBy(xpath = "//*[@name='signin_email']")
	private WebElement Email;

	public WebElement getEmail() {
		return Email;
	}

	@FindBy(xpath = " //*[@name='signin_password']")
	private WebElement Password;

	public WebElement getPassword() {
		return Password;

	}

	@FindBy(xpath = " //*[@value='Sign in']")
	private WebElement Submited;

	public WebElement getSubmited() {
		return Submited;

	}

	
}
