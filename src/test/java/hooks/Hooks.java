package hooks;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

   @Before
   public void before(){
       System.out.println("Before Methodu her scenariodan veya scenario outlinedan önce çalışır");
   }

    @After
    public void hooks(Scenario scenario){
          if (scenario.isFailed()){
              final byte [] failedScreenshot =((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);


          }
    }
}
