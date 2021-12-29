package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class HomePage extends BasePage{
    public @FindBy(xpath = "//input[@name='first_name']") WebElement textfield_FirstName;
    public @FindBy(css = "//input[@name='last_name']") WebElement textfield_LastName;
    public @FindBy(xpath = "//input[@name='email']") WebElement textfield_EmailAddress;
    public @FindBy(xpath = "//textarea[@name='message']") WebElement textfield_Message;
    public @FindBy(css = "a.login") WebElement button_Signin;

    public HomePage() throws IOException {
        super();
    }

    public HomePage getHomePage() throws IOException {
        getDriver().get("http://automationpractice.com/");
        return new HomePage();
    }

    public HomePage clickOnSignInButton() throws Exception {
        waitAndClickElement(button_Signin);
        return new HomePage();
    }


/*
    public HomePage enterLasttName(DataTable dataTable, int row, int column) throws Exception {
        List<List<String>> data = dataTable.raw();
        sendKeysToWebElement(textfield_LastName, data.get(row).get(column));
        return new HomePage();
    }

    public HomePage enterEmailAddress(String emailAddress) throws Exception {
        sendKeysToWebElement(textfield_EmailAddress, emailAddress);
        return new HomePage();
    }

    public HomePage enterComments(DataTable dataTable, int row, int column) throws Exception {
        List<List<String>> data = dataTable.raw();
        sendKeysToWebElement(textfield_Message, data.get(row).get(column));
        return new HomePage();
    }

    public HomePage clickOnSubmiButton() throws Exception {
        waitAndClickElement(button_Submit);
        return new HomePage();
    }

    public HomePage confirmContactUsFormSubmissionWasSuccessful() throws Exception {
        WebElement thanksContactUsPage = getDriver().findElement(By.xpath(".//*[@id='contact_reply']/h1"));
        WaitUntilWebElementIsVisible(thanksContactUsPage);
        Assert.assertEquals("thankyouforyourmessage!", thanksContactUsPage.getText().toLowerCase().replaceAll("[ ()0-9]", ""));
        return new HomePage();
    }*/
}
