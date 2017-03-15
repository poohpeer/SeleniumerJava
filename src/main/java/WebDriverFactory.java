import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by Puper on 15/3/2017.
 */
public class WebDriverFactory {
    private WebDriver driver = null;

    public void getNewDriver(DriverGender driver, DriverType driverType){
        if (driver == DriverGender.chrome){
            System.setProperty("webdriver.chrome.driver", "C:/Users/Puper/Downloads/chromedriver.exe");
            if (driverType == DriverType.local){
                this.driver = new ChromeDriver();
            }
        }
    }

    public WebDriver getDriver(DriverGender driver, DriverType driverType){
        if (this.driver == null){
            getNewDriver(driver, driverType);
        }
        return this.driver;
    }
}