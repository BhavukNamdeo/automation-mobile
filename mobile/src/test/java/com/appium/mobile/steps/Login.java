package com.appium.mobile.steps;

import io.cucumber.java.en.*;

public class Login {
	@Given("The user is on Login page")
	public void the_user_is_on_login_page() {
	    System.out.println("Login 1st Step");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
	    System.out.println("Login 2nd Step");
	}

	@When("Clicks on Sign in Button")
	public void clicks_on_sign_in_button() {
		System.out.println("Login 3rd Step");
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Login 4th Step");
	}

}