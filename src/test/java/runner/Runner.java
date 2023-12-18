package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", //raporlarin daha okunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome=true, //raporlarin konsolda okunakli sekilde cikmasi icin

        features = "./src/test/resources/features", //features folder path
        glue = {"stepdefinition","hooks"},    //stepdefinitions path
        tags = "@n11",
        dryRun = false
)
public class Runner {
}
