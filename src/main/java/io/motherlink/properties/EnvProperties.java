package io.motherlink.properties;
import static java.util.Objects.isNull;

public class EnvProperties {
    private static final String
            PROPERTIES_FILE_NAME = "env.properties",
            BASE_URL = "baseURL",
            LOGIN_PATH = "loginPath",
            LANGUAGE_PATH = "languagePath",
            BILLING_PATH = "billingPath";

    public static String getBaseURL() {
        String systemProperty = System.getProperty(BASE_URL);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, BASE_URL);
    }

    public static String getLoginPath() {
        String systemProperty = System.getProperty(LOGIN_PATH);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, LOGIN_PATH);
    }

    public static String getLanguagePath() {
        String systemProperty = System.getProperty(LANGUAGE_PATH);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, LANGUAGE_PATH);
    }

    public static String getBillingPath() {
        String systemProperty = System.getProperty(BILLING_PATH);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, BILLING_PATH);
    }
}
