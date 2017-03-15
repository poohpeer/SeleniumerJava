package seleniumer.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Logger;

import static com.google.common.io.Resources.getResource;

/**
 * Created by Puper on 15/3/2017.
 */
public class WebDriverFactory {

    private static final Logger log = Logger.getLogger(WebDriverFactory.class.getName());
    private WebDriver driver = null;

    public WebDriver getNewDriver(DriverGender driver, DriverType driverType) throws URISyntaxException {
        log.info("Initializing new " + driver.name() + " driver");
        if (driver == DriverGender.chrome){
            URL resource = WebDriverFactory.class.getClassLoader().getResource("chromedriver");
            String driverPath = resource.toURI().getPath();
            System.setProperty(driver.getSystemProperty(), driverPath);
            if (driverType == DriverType.local){
                this.driver = new ChromeDriver();
            }
        }
        return this.driver;
    }

    public WebDriver getDriver(DriverGender driver, DriverType driverType) throws URISyntaxException {
        if (this.driver == null){
            return getNewDriver(driver, driverType);
        }
        return this.driver;
    }
}