import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTests {

    @Test
    public void loginIntoApp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("sauce")
                .setPlatformName("Android")
                .setApp("/Users/sanjeev.kumar1/work/appium-java/src/main/resources/my-app.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        try {
            System.out.println("Successfully opened the app");
        } finally {
            driver.quit();
        }
    }
}
