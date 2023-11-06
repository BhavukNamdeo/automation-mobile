package com.appium.mobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	AppiumDriver driver;
	private BasePage basePage = BasePage.getInstance();
	
	public HomePage(AppiumDriver driver) {
		this.driver = driver;
		// initialize the home page objects.(Ex: homePageTitle)
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView")
	/* DefaultGenericMobileElement class has been removed completely together with
	its descendants (MobileElement, IOSElement, AndroidElement etc.). Use
	WebElement instead of MobileElement. - java-client v8 and appium 2.0 */
	//private WebElement homePageTitle;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView")
	private WebElement openMenuOption;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"cart badge\"]/android.widget.ImageView")
	private WebElement cartIcon;
	
	public void verifyHomePageTile() {
		System.out.println("====Inside Home Page=======");
		WebElement homePageTitle = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView"));
		System.out.println("Value of home page header is: " + homePageTitle.getText());
		Assert.assertEquals(homePageTitle.getText(), "Products");
		//driver.quit();
	}
	
	public void verifyOpenMenuOption() {
		System.out.println("===Inside Verify Menu Option Method====");
		if (openMenuOption.isDisplayed()) {
			System.out.println("Menu Option displayed Successfully");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	public void verifyCartIcon() {
		System.out.println("===Inside Verify Cart Icon Method====");
		if (cartIcon.isDisplayed()) {
			basePage.waitForElementClickable(driver, cartIcon);
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	public void clickFirstItemOnHomePage() {
		
	}
}
