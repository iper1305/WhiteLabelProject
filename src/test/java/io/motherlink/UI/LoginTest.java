package io.motherlink.UI;
import io.motherlink.base.*;
import io.motherlink.pages.logic.LoginPageLogic;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.open;
import static io.motherlink.properties.ApplicationAccessProperties.*;
import static io.motherlink.properties.EnvProperties.*;

@Feature("Tests for check login")
@Story("User should be able to log in with valid credentials")
@Tag("Login")
@Tag("Positive")
@Severity(SeverityLevel.CRITICAL)
public class LoginTest extends BaseTest {
    LoginPageLogic loginPageLogic = new LoginPageLogic();

    @DisplayName("Login with the valid email and password")
    public void userLogin() {
        open(getBaseURL() + getLoginPath());
        loginPageLogic
                .enterEmail(getLoginData())
                .enterPassword(getPasswordData())
                .sleeping(15000);
    }
}
