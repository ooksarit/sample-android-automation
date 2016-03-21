package Definitions;

import Utils.Setup;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.testng.Assert.fail;

/**
 * Created by sudomjiaran on 3/21/2016 AD.
 */
public class TestDefs {

    AppiumDriver driver = Setup.driver;

    @Given("^I should see Welcome page$")
    public void iShouldSeeWelcomePage() throws Throwable {
        try {
            WebElement welcomePageElement = driver.findElement(By.xpath("//*[contains(@resource-id, 'welcome_page')]"));
            welcomePageElement.isDisplayed();
        } catch (Exception e) {
            fail("Display should be presented");
        }
    }

    @When("^I click Login button on Welcome page$")
    public void iClickLoginButtonOnWelcomePage() throws Throwable {
        WebElement loginButtonElement = driver.findElement(By.xpath("//*[contains(@resource-id, 'login_button')]"));
        loginButtonElement.click();
    }

    @Then("^I should see Login page$")
    public void iShouldSeeLoginPage() throws Throwable {
        WebElement loginPageElement = driver.findElement(By.xpath("//*[contains(@resource-id, 'login_page')]"));
        Assert.assertTrue(loginPageElement.getText().equalsIgnoreCase("51"), "Login page should be presented");
    }
}
