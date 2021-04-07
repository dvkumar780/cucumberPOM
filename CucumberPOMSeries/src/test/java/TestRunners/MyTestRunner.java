package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"E:\\Java Programs\\CucumberPOMSeries\\srs\\test\\resources\\com\\Features\\login.feature"},
		glue={"StepDefinitions","AppHooks"},
		monochrome=true,
		/*format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"},*/
		//tags={"@Functional","@smoketesting","@sanitytesting","@regressiontesting"},
        dryRun=false,
        strict=true,
        plugin = {"pretty"}
        
		)

public class MyTestRunner {

}
