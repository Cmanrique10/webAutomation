package stepDefinition;

import base.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.UUID;

public class Steps extends DriverFactory {

    @Given("The AutomationPractice Store home page is displayed")
    public void the_automation_practice_store_home_page_is_displayed() throws IOException {
        homePage.getHomePage();
    }

    @And("I click on Sign in button")
    public void i_click_on_sign_in_button() throws Exception {
        homePage.clickOnSignInButton();
    }

    @And("I enter a valid email address account")
    public void i_enter_a_valid_email_address_account() throws Exception {
        createAccountPage.enterEmail("camilo.manrique@avantica.net");
    }

    @And("I click on Create an account button")
    public void i_click_on_create_an_account_button() throws Exception {
        createAccountPage.clickOnCreateAnAccountButton();
    }

    @And("I enter information in the Personal Information section")
    public void i_enter_information_in_the_personal_information_section() throws Exception {
        String uuid = UUID.randomUUID().toString();


        createAccountPage.clickOnMaleGenderopt();
        createAccountPage.enterCFirstName("Camilo");
        createAccountPage.enterCLastName("Manrique");
        createAccountPage.enterEmailAccount(uuid+"@abc.com");
        createAccountPage.enterPassword("camilo20");
        createAccountPage.selectDay(30);
        createAccountPage.selectMonth("11");
        createAccountPage.selectYear("1990");

    }

    @And("I enter my Adress in the Adress section")
    public void i_enter_my_adress_in_the_adress_section() throws Exception {
        createAccountPage.enterAdressFirstName("Lucas");
        createAccountPage.enterAdressLastName("Manrique");
        createAccountPage.enterCompany("Scotiabank");
        createAccountPage.enterAddress("Av 38 Julio");
        createAccountPage.enterCity("Los Olivos");
        createAccountPage.selectState(12);
        createAccountPage.enterZode("00000");
        createAccountPage.selectCountry("21");
        createAccountPage.enteradditionalInfo("houston");
        createAccountPage.enterHomePhone("992881707");
        createAccountPage.enterMobilePhone("924060179");
        createAccountPage.enterFuturesReferences("cuadra 14");

    }

    @When("I click on the Register button")
    public void i_click_on_the_register_button() throws Exception {
        createAccountPage.clickOnRegisterAccountButton();
    }

    @Then("I should be presented AutomationPractice Store page with my logged in user.")
    public void i_should_be_presented_automation_practice_store_page_with_my_logged_in_user()throws Exception{
        dashboardPage.confirmTitleWasSuccessful();
        dashboardPage.confirmRegisterWasSuccessful("Camilo Manrique");
        dashboardPage.confirmlogoutBtnIsPresent();


    }

}
