package io.motherlink.pages.elements;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPageElements {
    protected SelenideElement
            emailInput = $x("//input[@id='email']"),
            passwordInput = $x("//input[@id='password']"),
            signInButton = $x("//button[@class='btn btn-primary w-full']");
}
