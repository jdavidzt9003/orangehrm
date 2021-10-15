package co.com.sofka.page.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CommonActionsOnPages {

    private WebDriver driver;

    public CommonActionsOnPages(WebDriver driver) {
        super();
        this.driver = driver;
    }

    protected void type(By by, CharSequence... keysToSend){
        driver.findElement(by).sendKeys(keysToSend);
    }

    protected void clickOn(By by){
        driver.findElement(by).click();
    }

    protected void viewMessage(By by){
        driver.findElement(by).isDisplayed();
    }

    protected String getText(By by){
        return driver.findElement(by).getText();
    }
}
