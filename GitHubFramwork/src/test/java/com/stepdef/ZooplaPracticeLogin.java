package com.stepdef;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.config.BaseConfig;
import com.generic.code.CucumberCode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZooplaPracticeLogin {

	WebDriver Rajon;
	
	@Given("open a browser")
	public void open_a_browser() {
		Rajon = CucumberCode.setupBrowser();
	}	
	
	@Given("Put URL")
	public void put_URL() throws Throwable {
		CucumberCode.getURL(Rajon);
	   
	}

	@When("Accept Cookies")
	public void accept_Cookies() {
		CucumberCode.acceptCookies(Rajon);	    
	   
	}

	@When("Click Signin Link")
	public void click_Signin() {
	   CucumberCode.clickSignInLink(Rajon); 
	   
	}
	
	@When("put valid user name")
	public void put_valid_user_name() throws Throwable {
	    CucumberCode.enterUserName(Rajon);
	}

	@When("put valid password")
	public void put_valid_password() throws Throwable {
	    CucumberCode.enterPassword(Rajon);
	}


	@When("click sign in button")
	public void click_sign_in_button() {
	    CucumberCode.clickLogIn(Rajon);
	   
	}

	@When("search for properties in New York, Linconshire")
	public void search_for_properties_in_New_York_Linconshire() throws Throwable {
	    CucumberCode.searchCity(Rajon);
	   
	}

	@When("Sort the properties by Descending Order")	
	public void sort_the_properties_by_Descending_Order() throws Throwable {
	    CucumberCode.getProperty(Rajon);
	   
	}

	@When("select the Property")
	public void select_the_th_Property() {
	    
	}

	@When("Validate login was success")
	public void validate_login_was_success_sign_out_btn() {
	    CucumberCode.validateAgentInfo(Rajon);
	   
	}
	
	@Then("Sign Out")
	public void sign_Out() {
	    CucumberCode.getSignOut(Rajon);
	   
	}
}
