package seleniumer.java;

/**
 * Created by Puper on 15/3/2017.
 */
public enum DriverGender {

    chrome("webdriver.chrome.driver"),
    firefox("Firefox Driver");

    private String systemProperty;

    DriverGender(String systemProperty) {
        this.systemProperty = systemProperty;
    }

    public String getSystemProperty() {
        return systemProperty;
    }
}
