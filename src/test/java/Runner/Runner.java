package Runner;

import Utils.Setup;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

/**
 * Created by sudomjiaran on 3/21/2016 AD.
 */

@CucumberOptions(
        format = {"pretty", "html:target/cucumber-html-report"},
        features = "src/test/Features/",
        glue = "Definitions",
        tags = "@Test1"
)

public class Runner extends AbstractTestNGCucumberTests {

    Setup setup = new Setup();

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        setup.Setup();
    }

    @AfterMethod
    public void tearDown() {
        setup.TearDown();
    }
}
