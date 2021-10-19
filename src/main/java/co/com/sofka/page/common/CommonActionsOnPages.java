package co.com.sofka.page.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


public class CommonActionsOnPages {

    private WebDriver driver;

    public CommonActionsOnPages(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public CommonActionsOnPages(WebDriver driver, int seconds) {
        super();
        this.driver = driver;
    }

    protected void pageFactoryInitElement(WebDriver driver, Object page) {
        PageFactory.initElements(driver, page);
    }

    protected void clearFields(By by) {
        driver.findElement(by).clear();
    }

    protected void type(By by, CharSequence... keysToSend) {
        driver.findElement(by).sendKeys(keysToSend);
    }

    //page factory
    protected void type(WebElement webElement, CharSequence... keysToSend) {
        webElement.sendKeys(keysToSend);
    }

    protected void clickOn(By by) {
        driver.findElement(by).click();
    }

    protected void clickOn(WebElement webElement){
        webElement.click();
    }

    protected String getText(By by) {
        return driver.findElement(by).getText();
    }

    protected void hoverElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    public String messageLeaveCompare(By by) {
        return getText(by);
    }


    public void scrollTo(By locator) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(locator));
    }



}


