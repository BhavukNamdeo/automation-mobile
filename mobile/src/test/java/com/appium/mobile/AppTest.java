package com.appium.mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

/**
 * Unit test for simple App.
 */
public class AppTest {

	public static void main(String[] args) throws MalformedURLException {
		//ClassLoader classLoader = AppTest.class.getClassLoader();
		AndroidDriver driver = null;
		UiAutomator2Options options = new UiAutomator2Options();
		File file = new File("D:\\Automation_WorkSpace\\mobile\\src\\test\\resources\\Android-MyDemoAppRN.1.3.0.build-244.apk");
		String apkPath = file.getAbsolutePath();

		options.setPlatformName("Android").setPlatformVersion("12.0")
				.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2)
				.setDeviceName("emulator-5554").setAppPackage("com.saucelabs.mydemoapp.rn")
				.setAppActivity(".MainActivity").setApp(apkPath).setNoReset(false);

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
		WebElement contentHeader = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView"));
		System.out.println(contentHeader.getText());
		
		System.out.println("Complete");
		driver.removeApp("com.saucelabs.mydemoapp.rn");
		driver.quit();
	}
}
