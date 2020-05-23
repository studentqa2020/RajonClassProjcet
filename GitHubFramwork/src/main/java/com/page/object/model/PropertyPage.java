package com.page.object.model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyPage {

	public PropertyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//*[@type='text']")
	private WebElement NewYork;

	public WebElement getNewYork() {
		return NewYork;

	}

	@FindBy(xpath = "//*[@class='ui-icon ui-form__search']")
	private WebElement Search;

	public WebElement getSearch() {
		return Search;
	}
	
	@FindBy(xpath = "//*[@value='Search']")
	private WebElement Value;
	
	public WebElement getValue() {
		return Value;
	}
	
	@FindBy(xpath = "//*[@class='listing-results-price text-price']")
	private List<WebElement> Homeprice;
	
	public List<WebElement> getHomeprice() {
		return Homeprice;
	}
	@FindBy(xpath="//img[@class='js-lazy-loaded']")////img[@class='js-lazy-loaded']
	private WebElement PropertyLogo;
	
	public WebElement getPropertyLogo() {
		return PropertyLogo;
	}
	@FindBy(xpath="(//h4[@class='ui-agent__name'])[1]")
	private WebElement AgentName;
	
	public WebElement getAgentName() {
		return AgentName;
	}
	
	@FindBy(xpath="(//*[@class='ui-link'])[4]")
	private WebElement AgentPhoneNum;
	
	public WebElement getAgentPhoneNum() {
		return AgentPhoneNum;
	}
	
	@FindBy(xpath="//*[@id='header-account-panel__signed-in-link']")
	private WebElement MyZooplaBtn;
	
	public WebElement getMyZooplaBtn() {
		return MyZooplaBtn;
	}
	
	@FindBy(xpath="//span[contains(text(),'Sign out')]")
	private WebElement SignOut;
	
	public WebElement getSignOut() {
		return SignOut;
	}
	

	
}
