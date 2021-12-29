package transacMain;

import base.DriverFactory;
import org.testng.annotations.Test;

public class test extends DriverFactory {


    @Test
    public void performingActions() throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "C:chromedriver.exe");

        //Initializing the browser driver
        //WebDriver driver = new ChromeDriver();

            //Navigating through a particular website
        driver.get("https://www.browserstack.com");

        System.out.println("Selenium Webdriver Script in Chrome");
        driver.quit();
   //     driver.findElement().sendKeys()
    }
}
