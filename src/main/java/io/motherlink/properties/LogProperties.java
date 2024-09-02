package io.motherlink.properties;
import static java.util.Objects.isNull;

public class LogProperties {
    private static final String
            PROPERTIES_FILE_NAME = "log.properties",
            LOG_REQUEST = "logRequest",
            LOG_RESPONSE = "logResponse";

    public static String logRequest() {
        String systemProperty = System.getProperty(LOG_REQUEST);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, LOG_REQUEST);
    }

    public static String logResponse() {
        String systemProperty = System.getProperty(LOG_RESPONSE);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, LOG_RESPONSE);
    }
}
