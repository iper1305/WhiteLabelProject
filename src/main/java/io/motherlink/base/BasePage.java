package io.motherlink.base;
import com.codeborne.selenide.*;
import io.motherlink.sharedData.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public interface BasePage {
    SharedData getSharedData = SharedDataSingleton.get();

    default void clearAndType(SelenideElement element, String value) {
        while (!element.getAttribute("value").equals("")) {
            clearData(element);
        }
        element.setValue(value);
    }

    default void clearData(SelenideElement element) {
        executeJavaScript("var el = arguments[0]; el.value = ''; el.dispatchEvent(new Event('change')); el.dispatchEvent(new Event('input'));", element);
    }

    default String getMessage(SelenideElement element) {
        return getSpecificAttribute(element, "textContent");
    }

    default String getValueAttribute(SelenideElement element) {
        return getSpecificAttribute(element, "value");
    }

    default String getSpecificAttribute(SelenideElement element, String attribute) {
        return element.getAttribute(attribute).trim().replaceAll("\\s", " ");
    }

    default void waiting(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}