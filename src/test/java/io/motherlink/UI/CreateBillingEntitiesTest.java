package io.motherlink.UI;
import io.motherlink.base.BaseTest;
import io.motherlink.pages.logic.*;
import io.motherlink.properties.*;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;
import static io.motherlink.data.DataProvider.*;
import static io.motherlink.properties.EntityProperties.*;

@Feature("UI tests for 'Billing Entities' tab")
@Story("The user should be able to create new entity")
@Tag("Billing Entities")
@Tag("Positive")
@Severity(SeverityLevel.NORMAL)
public class CreateBillingEntitiesTest extends BaseTest {
    static LoginTest loginTest = new LoginTest();
    static BillingEntitiesPageLogic billingEntitiesPageLogic = new BillingEntitiesPageLogic();

    @BeforeAll
    static void userLogin() {
        loginTest.userLogin();
    }

    @Test
    @DisplayName("Create the billing entity and check data")
    @Execution(ExecutionMode.SAME_THREAD)
    public void createEntity() {
        open(EnvProperties.getBaseURL() + EnvProperties.getBillingPath());
        billingEntitiesPageLogic
                .clickNewEntityButton()
                .enterCompanyName(getRandomCompany())
                .enterRegistrationCode(getRegistrationCode())
                .clickVATToggle()
                .clickNextButton()
                .clickCountryButton()
                .searchCountry(getCountry())
                .selectCountry()
                .enterAddress(getAddress())
                .enterCity(getCity())
                .enterState(getState())
                .enterZip(getZIP())
                .clickDoneButton()
                .searchEntity(getCompanyName())
                .clickActionButton()
                .clickEditButton()
                .clickCompanyDetailsButton()
                .checkCompanyName(getSharedData.getCompanyName())
                .checkRegistrationCode(getRegistrationCode())
                .checkVat("")
                .clickCompanyAddressButton()
                .checkCountry(getCountry())
                .checkAddress(getAddress())
                .checkCity(getCity())
                .checkState(getState())
                .checkZip(getZIP())
                .clickCancelButton();

    }

    @AfterEach
    void deleteEntity() {
        refresh();
        billingEntitiesPageLogic
                .searchEntity(getCompanyName())
                .clickActionButton()
                .clickDeleteButton()
                .clickConfirmDeleteButton();
    }

    @AfterAll
    static void logoutUser() {
        billingEntitiesPageLogic
                .clickUserButton()
                .clickSignOutButton();
    }
}
