package co.com.sofka.page.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;


public class CommonActionsOnPages {

    private WebDriver driver;
    private WebDriverWait webDriverExplicitWait;

    public CommonActionsOnPages(WebDriver driver) {
        super();
        this.driver = driver;
    }

    protected void clearFields(By by){
        driver.findElement(by).clear();
    }

    protected void type(By by, CharSequence... keysToSend){
        driver.findElement(by).sendKeys(keysToSend);
    }

    protected void clickOn(By by){
        driver.findElement(by).click();
    }

    protected String getText(By by){
        return driver.findElement(by).getText();
    }

    protected void hoverElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }


    public String messageLeaveCompare(By by) {
        return getText(by);
    }

    public void withExplicitWaitTypeInto(By by, CharSequence... keysToSend){
        webDriverExplicitWait.until(elementToBeClickable(by)).sendKeys(keysToSend);
    }

    public void scrollTo(By locator){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(locator));
    }
}


