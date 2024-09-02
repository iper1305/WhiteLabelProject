package io.motherlink.pages.logic;
import com.codeborne.selenide.Condition;
import io.motherlink.base.BasePage;
import io.motherlink.pages.elements.BillingEntitiesPageElements;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillingEntitiesPageLogic extends BillingEntitiesPageElements implements BasePage {

    public BillingEntitiesPageLogic searchEntity(String entity) {
        clearAndType(searchInput, entity);
        return this;
    }

    public BillingEntitiesPageLogic clickNewEntityButton() {
        newEntityButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic clickRegistrationToggle() {
        noRegistrationCodeToggle.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic clickVATToggle() {
        noVATToggle.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic enterCompanyName(String companyName) {
        getSharedData.setCompanyName(companyName);
        clearAndType(companyNameInput, getSharedData.getCompanyName());
        return this;
    }

    public BillingEntitiesPageLogic enterRegistrationCode(String registrationCode) {
        clearAndType(registrationCodeInput, registrationCode);
        return this;
    }

    public BillingEntitiesPageLogic enterVatNumber(String vatNumber) {
        clearAndType(vatInput, vatNumber);
        return this;
    }

    public BillingEntitiesPageLogic clickNextButton() {
        nextButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic clickCountryButton() {
        countryButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic searchCountry(String country) {
        clearAndType(searchInputInModalWindow, country);
        return this;
    }

    public BillingEntitiesPageLogic selectCountry() {
        countryOption.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic enterAddress(String address) {
        clearAndType(addressInput, address);
        return this;
    }

    public BillingEntitiesPageLogic enterCity(String city) {
        clearAndType(cityInput, city);
        return this;
    }

    public BillingEntitiesPageLogic enterState(String state) {
        clearAndType(stateInput, state);
        return this;
    }

    public BillingEntitiesPageLogic enterZip(String zip) {
        clearAndType(zipInput, zip);
        return this;
    }

    public BillingEntitiesPageLogic clickDoneButton() {
        doneButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic clickCancelButton() {
        cancelButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic clickCompanyAddressButton() {
        companyAddressButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic clickCompanyDetailsButton() {
        companyDetailsButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic clickActionButton() {
        actionButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic clickEditButton() {
        editButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic clickDeleteButton() {
        deleteButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic clickConfirmDeleteButton() {
        confirmDeleteButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic checkCompanyName(String companyName) {
        assertEquals(companyName, getValueAttribute(companyNameInput));
        return this;
    }

    public BillingEntitiesPageLogic checkRegistrationCode(String registrationCode) {
        assertEquals(registrationCode, getValueAttribute(registrationCodeInput));
        return this;
    }

    public BillingEntitiesPageLogic checkVat(String vat) {
        assertEquals(vat, getValueAttribute(vatInput));
        return this;
    }

    public BillingEntitiesPageLogic checkCountry(String country) {
        assertEquals(country, getMessage(estoniaButton));
        return this;
    }

    public BillingEntitiesPageLogic checkAddress(String address) {
        assertEquals(address, getValueAttribute(addressInput));
        return this;
    }

    public BillingEntitiesPageLogic checkCity(String city) {
        assertEquals(city, getValueAttribute(cityInput));
        return this;
    }

    public BillingEntitiesPageLogic checkState(String state) {
        assertEquals(state, getValueAttribute(stateInput));
        return this;
    }

    public BillingEntitiesPageLogic checkZip(String zip) {
        assertEquals(zip, getValueAttribute(zipInput));
        return this;
    }

    public BillingEntitiesPageLogic clickUserButton() {
        userButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic clickSignOutButton() {
        signOutButton.shouldBe(Condition.visible).click();
        return this;
    }

    public BillingEntitiesPageLogic sleeping(int time) {
        waiting(time);
        return this;
    }
}
