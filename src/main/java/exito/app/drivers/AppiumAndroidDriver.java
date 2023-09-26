package exito.app.drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;


public class AppiumAndroidDriver {

    public static AppiumDriver<MobileElement> driver;

    public static AppiumAndroidDriver appium() throws MalformedURLException {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "android");
            capabilities.setCapability("deviceName", "vivo 1935");
            capabilities.setCapability("UDID", "ebc32238");
            capabilities.setCapability("appPackage", "com.exito.appcompania");
            capabilities.setCapability("appActivity", "com.exito.appcompania.views.initialaccess.activities.SplashActivity");
            capabilities.setCapability("noReset", "true");
            URL url=new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver(url, capabilities);
            return new AppiumAndroidDriver();
    }
    public AppiumDriver<MobileElement> iniciar() {
        return driver;
    }
}
