package io.motherlink.pages.elements;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BillingEntitiesPageElements {
    protected SelenideElement
            userButton = $x("//button[@class='btn btn-sm btn-secondary rounded-md px-[6px] ']"),
            signOutButton = $x(" //button[contains(.,'Sign out')]"),
            searchInput = $x("//input[@placeholder='Search...']"),
            newEntityButton = $x("//button//span[.='New entity']"),
            companyNameInput = $x("//input[@id='name']"),
            registrationCodeInput = $x("//input[@id='registrationCode']"),
            vatInput = $x("//input[@id='vat']"),
            noRegistrationCodeToggle = $x("//div[contains(text(), 'No registration')]/following-sibling::label//input[@type='checkbox']"),
            noVATToggle = $x("//div[contains(text(), 'No VAT')]/following-sibling::label"),
            nextButton = $x("//button[.='Next']"),
            countryButton = $x("//button[@id='id']//span[.='Select']"),
            estoniaButton = $x("//button[@id='id']//span[.='Estonia']"),
            searchInputInModalWindow = $x("//div[@role='menu']//input[@placeholder='Search...']"),
            countryOption = $x("//a[@role='menuitem']//span[.='Estonia']"),
            addressInput = $x("//input[@id='address']"),
            cityInput = $x("//input[@id='city']"),
            stateInput = $x("//input[@id='state']"),
            zipInput = $x("//input[@id='zip']"),
            doneButton = $x("//button[.='Done']"),
            cancelButton = $x("//button[contains(.,'Cancel')]"),
            actionButton = $x("//span[@class='inline-block icon-dots-vertical']"),
            editButton = $x("//button[contains(.,'Edit')]"),
            deleteButton = $x("//button[contains(.,'Delete')]"),
            confirmDeleteButton = $x("//button[contains(.,'Yes, delete')]"),
            companyAddressButton = $x("//button[contains(.,'Company address')]"),
            companyDetailsButton = $x("//button[contains(.,'Company details')]");
}
