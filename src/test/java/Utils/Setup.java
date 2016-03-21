package Utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by sudomjiaran on 3/21/2016 AD.
 */
public class Setup {
    public static AppiumDriver driver = null;

    public void Setup() throws MalformedURLException {
        URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("app", "/Users/sudomjiaran/Desktop/calculator.apk");

        driver = new AndroidDriver(serverAddress, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void TearDown() {
        driver.quit();
    }
}