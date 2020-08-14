package com.generic.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.interactions.Actions;

import com.config.BaseConfig;
import com.page.object.model.PropertyPage;
import com.util.TakeAppScreenShot;
import com.util.Wait;

public class HomeSelection extends BaseLogin{

	public static void main(String[] args) throws Throwable {
		
		HomeSelection.homePage();
		
	}
	
	public static void homePage() throws Throwable {

		
		//GetLogin();

		PropertyPage MyProperty = new PropertyPage(driver);
		
		
		MyProperty.getNewYork().sendKeys(BaseConfig.getconfig("Location"));
			
		
		MyProperty.getSignOut().click();
			
		MyProperty.getHomeprice().forEach(price ->{
					
			System.out.println("Original Home price = "+ price.getText());
		});
				
			String [] Homeprice;
			List<Integer> AllPrices = new ArrayList<>();
			for(int i=0; i<MyProperty.getHomeprice().size();i++) {
				
				Homeprice = MyProperty.getHomeprice().get(i).getText().split(" ");
				AllPrices.add(Integer.parseInt(Homeprice[0].replace("£","").replace(",","").trim()));//.trim method removes white space
			}

			Collections.sort(AllPrices);
			Collections.reverse(AllPrices);
			System.out.println("Sorted Home Prices: "+AllPrices);
				
			Thread.sleep(3000);
			
			MyProperty.getHomeprice().get(4).click();	//Index 4 gives 5th Property
			
			new Wait().getExplicitWaitClicable(driver, MyProperty.getAgentName());
			
			if(MyProperty.getPropertyLogo().isDisplayed()) {
				System.out.println("Logo is available, See Screen Shot");
			} else {
				System.out.println("Logo is not avaialble");
			}
			
			System.out.println("Agent Name is: "+MyProperty.getAgentName().getText());
			System.out.println("Agent Phone # is: "+MyProperty.getAgentPhoneNum().getText());
			TakeAppScreenShot.captureScreenShot(driver, "Agent Info with Logo");
			
			Actions signOut = new Actions(driver);
			signOut.moveToElement(MyProperty.getSignOut()).build().perform();
			signOut.moveToElement(MyProperty.getSignOut()).build().perform();
			TakeAppScreenShot.captureScreenShot(driver, "User has signed out");
			MyProperty.getSignOut().click();
			
			driver.quit();	
}
}
