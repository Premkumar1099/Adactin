package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import practice.comBaseclass.Baseclass;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\feature",glue = {"stepDefination","Hooks"},
tags = "@TC-104",stepNotifications = true,
plugin = {"html:target/report/Adactin.html","json:target/report/Adactin.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
publish = true,dryRun = false,monochrome = true)

public class Runner extends Baseclass{
	
	
	
}
