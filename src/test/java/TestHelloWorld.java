import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import seleniumer.java.DriverGender;
import seleniumer.java.DriverType;
import seleniumer.java.WebDriverFactory;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by Puper on 15/3/2017.
 */
public class TestHelloWorld {

    static WebDriver driver = null;

    @BeforeClass
    public static void setUp() throws URISyntaxException {
        System.out.println("Getting Driver");
        WebDriverFactory driverFactory = new WebDriverFactory();
        driver = driverFactory.getDriver(DriverGender.chrome, DriverType.local);
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Closing Driver");
        driver.close();
    }

    @Test
    public void testOne() throws MalformedURLException {
        driver.navigate().to(new URL("http://google.com"));
        System.out.println(driver.getTitle());
    }
}
