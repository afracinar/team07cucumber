package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", //raporların daha okunaklı olması için eklenir
                "html:target/default-cucumber-reports.html", //html raporu browser da açılır.sağ tık yapıp open in dememiz lazım
                "json:target/json-reports/cucumber.json", //json raporu üzerine çift tıklayıp açılır
                "junit:target/xml-report/cucumber.xlm", //junit raporu üzerine çift tıklayıp açılır
                "rerun:target/failed_scenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" //spark raporu için
        },
        monochrome = true, //concole'daki bilgilerin okunaklı olmasını sağlar
        features = "/.src/test/resources/features",//features folder path
        glue = {"stepdefinitions" ,"hooks"},//stepdefinitions path
        tags = "",
        dryRun = false

)
public class Runner {
}
