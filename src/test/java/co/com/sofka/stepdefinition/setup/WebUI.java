package co.com.sofka.stepdefinition.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUI {
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String WEBDRIVER_CHROME_DRIVER_PATH = "src/test/resources/driver/chrome/chromedriver.exe";
    private static final String URL = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

    protected WebDriver driver;

    protected void setUpWebDriver(){
        System.setProperty(WEBDRIVER_CHROME_DRIVER, WEBDRIVER_CHROME_DRIVER_PATH);
    }

    protected void setUpWebDriverUrl(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    protected void driveQuit(){
        driver.quit();
    }

    protected void generalSetUp(){
        setUpWebDriver();
        setUpWebDriverUrl();
    }
}
