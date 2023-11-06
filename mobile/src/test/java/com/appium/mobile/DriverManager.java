package com.appium.mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import com.appium.mobile.pages.HomePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

public class DriverManager {

	static AppiumDriver driver;

	public static AppiumDriver getInstance() {
		File appFilePath;
		System.out.println("Inside getInstance method of DriverManager");
		try {
			UiAutomator2Options options = new UiAutomator2Options();
			appFilePath = new File(
					"D:\\Automation_WorkSpace\\mobile\\src\\test\\resources\\Android-MyDemoAppRN.1.3.0.build-244.apk");
			String apkPath = appFilePath.getAbsolutePath();

			options.setPlatformName("Android").setPlatformVersion("12.0")
					.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2).setDeviceName("emulator-5554")
					.setAppPackage("com.saucelabs.mydemoapp.rn").setAppActivity(".MainActivity").setApp(apkPath)
					.setNoReset(false);

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
			System.out.println("Driver instance created Successfully");
		} catch (Exception exp) {
			System.out.println("Handle exception");
			driver.quit();
		}

		return driver;

	}

}
