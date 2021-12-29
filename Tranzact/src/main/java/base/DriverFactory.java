package base;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CreateAccountPage;
import pageObjects.DashboardPage;
import pageObjects.HomePage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;
    public static HomePage homePage;
    public static CreateAccountPage createAccountPage;
    public static DashboardPage dashboardPage;


    public WebDriver getDriver() {
        try {
            Properties properties = new Properties();

            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");

            properties.load(file);

            String browserType = properties.getProperty("browser").toLowerCase().trim();

            switch (browserType) {
                case "chrome":
                    if (null == driver) {
                        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                        driver = new ChromeDriver(chromeOptions);
                        break;
                    }
                case "firefox":
                    if (null == driver) {
                        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/java/drivers/geckodriver.exe");
                        FirefoxOptions firefoxOptions = new FirefoxOptions();
                        firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                        driver = new FirefoxDriver(firefoxOptions);
                        break;
                    }
                case "edge":
                    if (null == driver) {
                        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/java/drivers/msedgedriver.exe");
                        EdgeOptions edgeOptions = new EdgeOptions();
                        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                        driver = new EdgeDriver(edgeOptions);
                        break;
                    }
            }
            driver.manage().window().maximize();

        } catch (Exception e) {
            System.out.println("Unable to load browser: " + e.getMessage());
        } finally {

            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            homePage = PageFactory.initElements(driver, HomePage.class);
            createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
            dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        }
        return driver;
    }
}
