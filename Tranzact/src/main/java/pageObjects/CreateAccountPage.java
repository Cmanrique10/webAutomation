package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class CreateAccountPage extends BasePage {
    public @FindBy(id = "email_create")    WebElement txtF_email;
    public @FindBy(css = "#SubmitCreate")    WebElement btn_createAccount;
    public @FindBy(css = "input#id_gender1")    WebElement opt_malegender;
    public @FindBy(id = "customer_firstname")    WebElement txtF_CfirstName;
    public @FindBy(id = "customer_lastname")    WebElement txtF_ClastName;
    public @FindBy(id = "email")    WebElement txtF_emailCreateAccount;
    public @FindBy(id = "passwd")    WebElement txtF_password;
    public @FindBy(id = "days")    WebElement drpD_Days;
    public @FindBy(id = "months")    WebElement drpD_Months;
    public @FindBy(id = "years")    WebElement drpD_Years;
    public @FindBy(id = "firstname")    WebElement txtF_firstName;
    public @FindBy(id = "lastname")    WebElement txtF_lastName;
    public @FindBy(id = "company")    WebElement txtF_company;
    public @FindBy(id = "address1")    WebElement txtF_address;
    public @FindBy(id = "city")    WebElement txtF_city;
    public @FindBy(id = "id_state")    WebElement drpD_state;
    public @FindBy(id = "postcode")    WebElement txtF_zcode;
    public @FindBy(id = "id_country")    WebElement drpD_country;
    public @FindBy(id = "other")    WebElement txtF_addInformation;
    public @FindBy(id = "phone")    WebElement txtF_homePhone;
    public @FindBy(id = "phone_mobile")    WebElement txtF_mobilePhone;
    public @FindBy(id = "alias")    WebElement txtF_futuresReferences;
    public @FindBy(id = "submitAccount")    WebElement btn_registerAccount;


    public CreateAccountPage() throws IOException {
        super();
    }

    public CreateAccountPage enterEmail(String email) throws Exception {
        sendKeysToWebElement(txtF_email, email);
        return new CreateAccountPage();
    }

    public CreateAccountPage clickOnCreateAnAccountButton() throws Exception {
        waitAndClickElement(btn_createAccount);
        return new CreateAccountPage();
    }

    public CreateAccountPage clickOnMaleGenderopt() throws Exception {
        waitAndClickElement(opt_malegender);
        return new CreateAccountPage();
    }


    public CreateAccountPage enterCFirstName(String cfirstName) throws Exception {
        sendKeysToWebElement(txtF_CfirstName, cfirstName);
        return new CreateAccountPage();
    }

    public CreateAccountPage enterCLastName(String clastName) throws Exception {
        sendKeysToWebElement(txtF_ClastName, clastName);
        return new CreateAccountPage();
    }

    public CreateAccountPage enterEmailAccount(String emailAccount) throws Exception {
        sendKeysToWebElement(txtF_emailCreateAccount, emailAccount);
        return new CreateAccountPage();
    }

    public CreateAccountPage enterPassword(String password) throws Exception {
        sendKeysToWebElement(txtF_password, password);
        return new CreateAccountPage();
    }

    public CreateAccountPage selectDay(int day) throws Exception {
        Select opt = new Select(drpD_Days);
        opt.selectByIndex(day);
        return new CreateAccountPage();
    }

    public CreateAccountPage selectMonth(String month) throws Exception {
        Select opt = new Select(drpD_Months);
        opt.selectByValue(month);
        return new CreateAccountPage();
    }

    public CreateAccountPage selectYear(String year) throws Exception {
        Select opt = new Select(drpD_Years);
        opt.selectByValue(year);
        return new CreateAccountPage();
    }


    public CreateAccountPage enterAdressFirstName(String firstName) throws Exception {
        sendKeysToWebElement(txtF_firstName, firstName);
        return new CreateAccountPage();
    }

    public CreateAccountPage enterAdressLastName(String lastName) throws Exception {
        sendKeysToWebElement(txtF_lastName, lastName);
        return new CreateAccountPage();
    }

    public CreateAccountPage enterCompany(String company) throws Exception {
        sendKeysToWebElement(txtF_company, company);
        return new CreateAccountPage();
    }

    public CreateAccountPage enterAddress(String address) throws Exception {
        sendKeysToWebElement(txtF_address, address);
        return new CreateAccountPage();
    }

    public CreateAccountPage enterCity(String city) throws Exception {
        sendKeysToWebElement(txtF_city, city);
        return new CreateAccountPage();
    }

    public CreateAccountPage selectState(int state) throws Exception {
        Select opt = new Select(drpD_state);
        opt.selectByIndex(state);
        return new CreateAccountPage();
    }

    public CreateAccountPage enterZode(String zcode) throws Exception {
        sendKeysToWebElement(txtF_zcode, zcode);
        return new CreateAccountPage();
    }

    public CreateAccountPage selectCountry(String country) throws Exception {
        Select opt = new Select(drpD_country);
        opt.selectByValue(country);
        return new CreateAccountPage();
    }

    public CreateAccountPage enteradditionalInfo(String ainfo) throws Exception {
        sendKeysToWebElement(txtF_addInformation, ainfo);
        return new CreateAccountPage();
    }public CreateAccountPage enterHomePhone(String hPhone) throws Exception {
        sendKeysToWebElement(txtF_homePhone, hPhone);
        return new CreateAccountPage();
    }public CreateAccountPage enterMobilePhone(String mPhone) throws Exception {
        sendKeysToWebElement(txtF_mobilePhone, mPhone);
        return new CreateAccountPage();
    }public CreateAccountPage enterFuturesReferences(String fReferences) throws Exception {
        sendKeysToWebElement(txtF_futuresReferences, fReferences);
        return new CreateAccountPage();
    }


    public CreateAccountPage clickOnRegisterAccountButton() throws Exception {
        waitAndClickElement(btn_registerAccount);
        return new CreateAccountPage();
    }
/*
    public CreateAccountPage selectMonth(String month) throws Exception {
        clickOnTextFromDropdownList(drpD_Months,month);
        return new CreateAccountPage();
    }

    public CreateAccountPage selectYear(String year) throws Exception {
        clickOnTextFromDropdownList(drpD_Years,year);
        return new CreateAccountPage();
    }*/
}
