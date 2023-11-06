package com.appium.mobile.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class BasePage {
	
	public static BasePage basepageInstance = null;
	public static final Duration WAIT_FOR_ELEMENT_TIMEOUT = Duration.ofSeconds(30);
	
	public static BasePage getInstance() {
		if (basepageInstance == null) {
			basepageInstance = new BasePage();
		}
		return basepageInstance;
	}

	public void waitForElementClickable(AppiumDriver driver, WebElement element) {
		System.out.println("Wating for web element");
		WebDriverWait wait = new WebDriverWait(driver, WAIT_FOR_ELEMENT_TIMEOUT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		System.out.println("****Element is Clickable******");
	}
}
