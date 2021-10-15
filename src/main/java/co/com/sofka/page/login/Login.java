package co.com.sofka.page.login;

import co.com.sofka.model.login.LoginModel;
import co.com.sofka.page.common.CommonActionsOnPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Login extends CommonActionsOnPages {
    //se declara el modelo de datos
    private LoginModel loginModel = new LoginModel();

    private final By userName = By.id("txtUsername");
    private final By password = By.id("txtPassword");
    private final By btnLogin = By.id("btnLogin");

    //Validación de mensaje
    private final By labelMessage = By.xpath("//*[@id=\"spanMessage\"]");

    //constructor de la super clase
    public Login(WebDriver driver, LoginModel loginModel) {
        super(driver);
        this.loginModel = loginModel;
    }

    public void loginInto(){
        type(userName, loginModel.getUserName());
        type(password, loginModel.getPassword());
        clickOn(btnLogin);
    }

    public void clickBotton(){
        clickOn(btnLogin);
    }

    public String message() {
        return getText(labelMessage);
    }
}
