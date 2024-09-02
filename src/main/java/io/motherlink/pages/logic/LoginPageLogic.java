package io.motherlink.pages.logic;
import com.codeborne.selenide.Condition;
import io.motherlink.base.BasePage;
import io.motherlink.pages.elements.LoginPageElements;

public class LoginPageLogic extends LoginPageElements implements BasePage {
    public LoginPageLogic enterEmail(String email) {
        clearAndType(emailInput, email);
        return this;
    }

    public LoginPageLogic enterPassword(String password) {
        clearAndType(passwordInput, password);
        return this;
    }

    public LoginPageLogic clickSignInButton() {
        signInButton.shouldBe(Condition.visible).click();
        return this;
    }

    public LoginPageLogic sleeping(int time) {
        waiting(time);
        return this;
    }
}
