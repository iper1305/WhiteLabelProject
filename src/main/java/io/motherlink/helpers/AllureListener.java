package io.motherlink.helpers;
import io.motherlink.properties.ConfigProperties;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import static io.motherlink.properties.ConfigProperties.getBrowserName;

public class AllureListener {
    public static void setUp() {
        switch (getBrowserName()) {
            case "chrome": {
                WebDriverManager.chromedriver().clearDriverCache().setup();
                break;
            }
            case "firefox": {
                WebDriverManager.firefoxdriver().clearDriverCache().setup();
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + getBrowserName());
        }

        Configuration.timeout = 10000;
        Configuration.browser = getBrowserName();
        Configuration.browserSize = ConfigProperties.getBrowserSize();
    }
}
