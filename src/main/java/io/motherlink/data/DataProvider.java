package io.motherlink.data;
import com.github.javafaker.Faker;

public class DataProvider {
    static Faker faker = new Faker();

    public static String getRandomCompany() {
        return faker.company().name();
    }
}
