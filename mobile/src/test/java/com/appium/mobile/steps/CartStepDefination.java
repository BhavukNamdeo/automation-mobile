package com.appium.mobile.steps;

import com.appium.mobile.DriverManager;
import com.appium.mobile.pages.HomePage;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CartStepDefination {
	
	AppiumDriver driver = DriverManager.getInstance();
	HomePage homePage =  new HomePage(driver);
	
	@Given ("User is on Cart page")
	public void userOnCartPage() {
		
		
	}
	
    @Then ("Check list of items added")
    public void verifyListOfItem() {
    	
    }

}
