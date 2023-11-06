package com.appium.mobile.steps;

import java.net.MalformedURLException;

import com.appium.mobile.DriverManager;
import com.appium.mobile.pages.HomePage;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class HomeStepDefination {

	AppiumDriver driver = DriverManager.getInstance();
	HomePage homePage = new HomePage(driver);
	
	@After
	public void closeDriver() {
		if (driver != null) {
			//driver.close();
			driver.quit();
			System.out.println("===Driver closed Successfully===");
		}
	}

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.out.println("User is on Home Page");	
	}

	@Then("Verify Tile")
	public void verify_tile() {
		homePage.verifyHomePageTile();
	}
	
//	@And("Close Appication")
//	public void close_application() {
//		System.out.println("===Inside Close application Method====");
//		driver.quit();
//		System.out.println("===Driver close successfully====");
//	}

	@Then("Verify open menu option")
	public void verify_open_menu_option() {
		homePage.verifyOpenMenuOption();
	}

	@Then("Verify Cart option is clickable")
	public void verify_cart_option_is_clickable() {
		homePage.verifyCartIcon();
	}
}
