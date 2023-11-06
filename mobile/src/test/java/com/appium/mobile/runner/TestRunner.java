package com.appium.mobile.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "D:\\Automation_WorkSpace\\mobile\\src\\test\\resources\\Features", glue = {
		"com.appium.mobile.steps" }, monochrome = true, plugin = {"pretty",
                "html:target/cucumber-reports/HTMLcucumber.html",
                "json:target/cucumber-reports/JSONcucumber.json",
                "json:target/cucumber-reports/XMLcucumber.xml"})
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
