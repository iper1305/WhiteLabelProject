package io.motherlink.base;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.motherlink.helpers.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

public class BaseTest implements BasePage {
    @BeforeAll
    public static void setUp() {
        AllureListener.setUp();
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.makeScreenshot();
        Attach.pageSource();
        Attach.browserConsoleLogs();
    }
}
