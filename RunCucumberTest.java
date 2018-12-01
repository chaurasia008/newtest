package com.AssQues5_6_9.sdet.automation;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.cucumber.listener.ExtentProperties;*/



@RunWith(Cucumber.class)
@CucumberOptions(
	features="src\\main\\features\\Assignment5",
			tags={"@Regression,@Smoke"},
			glue = {"com.AssQues5_6_9.sdet.automation.StepDefinition"})
	//format= {"pretty", "html:target/cucumber"})


public class RunCucumberTest {
	
	
	}



