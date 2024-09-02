package io.motherlink.properties;
import static java.util.Objects.isNull;

public class ApplicationAccessProperties {
    private static final String
            PROPERTIES_FILE_NAME = "applicationAccess.properties",
            LOGIN = "login",
            PASSWORD = "password";

    public static String getLoginData() {
        String systemProperty = System.getProperty(LOGIN);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, LOGIN);
    }

    public static String getPasswordData() {
        String systemProperty = System.getProperty(PASSWORD);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, PASSWORD);
    }
}
