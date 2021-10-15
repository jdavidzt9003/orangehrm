package co.com.sofka.stepdefinition.login;


import co.com.sofka.model.login.LoginModel;
import co.com.sofka.page.login.Login;
import co.com.sofka.stepdefinition.setup.WebUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;


public class LoginStepDefinition extends WebUI {

    private LoginModel loginModel;
    private Login login;

    //Given Background
    @Given("el usuario ingresa a la pagina de OrangeHRM sección login")
    public void elUsuarioIngresaALaPaginaDeOrangeHRMSeccionLogin() {
        generalSetUp();

    }

    //Scenario: Inicio de sesion exitoso
    @When("el usuario ingresa los datos de usuario y contraseña")
    public void elUsuarioIngresaLosDatosDeUsuarioYContrasena(){
        dataScenarioOne();
        login = new Login(driver, loginModel);
        login.loginInto();
    }

    @Then("el sistema permite el login exitoso")
    public void elSistemaPermiteElLoginExitoso() {
        System.out.println("Conexión Exitosa");
        driveQuit();
    }

    //Scenario: Inicio de sesión donde el password inválido
    @When("el usuario ingresa el usuario correcto y el password inválido")
    public void elUsuarioIngresaElUsuarioCorrectoYElPasswordInvalido() throws IOException {
        dataScenarioTwo();
        login = new Login(driver, loginModel);
        login.loginInto();
    }

    @Then("el sistema no debe permitir el acceso y mostrar el mensaje de credenciales invalidas para password")
    public void elSistemaNoDebePermitirElAccesoYMostrarElMensajeDeCredencialesInvalidasParaPassword() {
        Assertions.assertEquals("Invalid credentials", login.message());
        driveQuit();
    }

    //Scenario: Inicio de sesión donde el usuario es inválido
    @When("el usuario ingresa el usuario inválido y el password correcto")
    public void elUsuarioIngresaElUsuarioInvalidoYElPasswordCorrecto() throws IOException {
        dataScenarioThree();
        login = new Login(driver, loginModel);
        login.loginInto();
    }

    @Then("el sistema no debe permitir el acceso y mostrar el mensaje de credenciales invalidas para para usuario")
    public void elSistemaNoDebePermitirElAccesoYMostrarElMensajeDeCredencialesInvalidasParaParaUsuario() {
        Assertions.assertEquals("Invalid credentials", login.message());
        driveQuit();
    }

    //Scenario: Inicio de sesión donde no se introducen las credenciales
    @When("el usuario deja los campos usuario y password vacíos")
    public void elUsuarioDejaLosCamposUsuarioYPasswordVacios() throws IOException {
        //dataScenarioFour();
        login = new Login(driver, loginModel);
        login.clickBotton();
    }

    @Then("el sistema no debe permitir el ingreso y debe arrojar el mensaje de campo vacío")
    public void elSistemaNoDebePermitirElIngresoYDebeArrojarElMensajeDeCampoVacio() {
        Assertions.assertEquals("Username cannot be empty", login.message());
        driveQuit();
    }

    public void dataScenarioOne() {
        loginModel = new LoginModel();
        loginModel.setUserName("Admin");
        loginModel.setPassword("admin123");
    }

    public void dataScenarioTwo() {
        loginModel = new LoginModel();
        loginModel.setUserName("Admin");
        loginModel.setPassword("admin1");
    }

    public void dataScenarioThree() {
        loginModel = new LoginModel();
        loginModel.setUserName("Admin5");
        loginModel.setPassword("admin123");
    }

    public void dataScenarioFour() {
        loginModel = new LoginModel();
        loginModel.setUserName(" ");
        loginModel.setPassword("");
    }

}
