package io.motherlink.properties;
import static java.util.Objects.isNull;

public class EntityProperties {
    private static final String
            PROPERTIES_FILE_NAME = "entity.properties",
            COMPANY_NAME = "companyName",
            REGISTRATION_CODE = "registrationCode",
            COUNTRY = "country",
            ADDRESS = "address",
            CITY = "city",
            STATE = "state",
            ZIP = "ZIP";

    public static String getCompanyName() {
        String systemProperty = System.getProperty(COMPANY_NAME);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, COMPANY_NAME);
    }

    public static String getRegistrationCode() {
        String systemProperty = System.getProperty(REGISTRATION_CODE);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, REGISTRATION_CODE);
    }

    public static String getCountry() {
        String systemProperty = System.getProperty(COUNTRY);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, COUNTRY);
    }

    public static String getAddress() {
        String systemProperty = System.getProperty(ADDRESS);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, ADDRESS);
    }

    public static String getCity() {
        String systemProperty = System.getProperty(CITY);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, CITY);
    }

    public static String getState() {
        String systemProperty = System.getProperty(STATE);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, STATE);
    }

    public static String getZIP() {
        String systemProperty = System.getProperty(ZIP);
        return !isNull(systemProperty) ? systemProperty : PropertiesReader.getProperty(PROPERTIES_FILE_NAME, ZIP);
    }
}
