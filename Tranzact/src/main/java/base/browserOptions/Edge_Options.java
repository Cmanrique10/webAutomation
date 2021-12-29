package base.browserOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Edge_Options {
    public static void main(String[] args) {
        //setup driver
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/java/drivers/msedgedriver.exe");

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        edgeOptions.setCapability(CapabilityType.PLATFORM_NAME, "Windows 10");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("http://www.webdriveruniversity.com");
        driver.manage().window().maximize();
        driver.quit();
    }
}
