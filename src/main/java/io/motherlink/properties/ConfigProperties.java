package io.motherlink.properties;
import lombok.Getter;
import static java.util.Objects.isNull;

public class ConfigProperties {
    private static final String
            PROPERTIES_FILE_NAME = "config.properties",
            BROWSER_NAME = "browserName",
            BROWSER_SIZE = "browserSize";

    @Getter
    private static final boolean CLEAR_COOKIES = true;
    @Getter
    private static final boolean CLEAR_REPORTS_DIR = true;
    @Getter
    private static final boolean MAKE_SCREENSHOTS = true;
    @Getter
    private static final boolean SAVE_PAGE_SOURCE = true;

    public static String getBrowserName() {
        String systemProperty = System.getProperty(BROWSER_NAME);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, BROWSER_NAME);
    }

    public static String getBrowserSize() {
        String systemProperty = System.getProperty(BROWSER_SIZE);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, BROWSER_SIZE);
    }

    public static boolean getCookie() {
        return CLEAR_COOKIES;
    }
}
