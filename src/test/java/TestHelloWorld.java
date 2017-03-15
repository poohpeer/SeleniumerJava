import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Puper on 15/3/2017.
 */
public class TestHelloWorld {

    static WebDriver driver = null;

    @BeforeClass
    public static void setUp(){
        System.out.println("Getting Driver");
        WebDriverFactory driverFactory = new WebDriverFactory();
        driver = driverFactory.getDriver();
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Closing Driver");
        driver.close();
        driver.quit();
    }

    @Test
    public void testOne() throws MalformedURLException {
        driver.navigate().to(new URL("http://google.com"));
        System.out.println(driver.getTitle());
    }
}
