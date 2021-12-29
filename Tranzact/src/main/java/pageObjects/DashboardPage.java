package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;

public class DashboardPage extends BasePage{
    public @FindBy(css = "a.account")     WebElement txtF_UserName;
    public @FindBy(css = "a.logout")     WebElement btn_logout;
    public DashboardPage() throws IOException {
        super();
    }


    public DashboardPage confirmTitleWasSuccessful() throws Exception {
        Assert.assertEquals(driver.getTitle(), "My account - My Store");
        return new DashboardPage();
    }

    public DashboardPage confirmRegisterWasSuccessful(String expected) throws Exception {
        Assert.assertEquals(txtF_UserName.getText(),expected);
        return new DashboardPage();
    }
    public DashboardPage confirmlogoutBtnIsPresent() throws Exception {

        Assert.assertEquals(btn_logout.isEnabled(),true);
        return new DashboardPage();
    }
}
