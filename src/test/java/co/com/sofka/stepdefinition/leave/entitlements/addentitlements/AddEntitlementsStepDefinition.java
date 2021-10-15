package co.com.sofka.stepdefinition.leave.entitlements.addentitlements;

import co.com.sofka.model.leave.entitlements.addentitlements.AddEntitlementsModel;
import co.com.sofka.model.login.LoginModel;
import co.com.sofka.page.leave.entitlements.addentitlements.AddEntitlements;
import co.com.sofka.page.login.Login;
import co.com.sofka.stepdefinition.setup.WebUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class AddEntitlementsStepDefinition extends WebUI {

    private LoginModel loginModel;
    private AddEntitlements addEntitlements;
    private AddEntitlementsModel addEntitlementsModel;

    private String SELECT_LEAVE_TYPE = "US - Vacation";
    private String SELECT_LEAVE_PERIOD = "2021-01-01 - 2021-12-31";
    private String MESSAGE_SAVED = "Successfully Deleted";

    //Scenario: Para un empleado existente, programarle el período de vacaciones

    @Given("el automatizador se encuentra en la pagina de OrangeHRM modulo leave")
    public void elAutomatizadorSeEncuentraEnLaPaginaDeOrangeHRMModuloLeave() {
        generalSetUp();
        dataScenarioOne();
        Login login = new Login(driver, loginModel);
        login.loginInto();
    }

    @Then("el usuario ingresa los campos solicitados por el formulario para la programación de las vacaciones")
    public void elUsuarioIngresaLosCamposSolicitadosPorElFormularioParaLaProgramacionDeLasVacaciones() {
        //Assertions.assertEquals(SELECT_LEAVE_TYPE, addEntitlements.messageLeaveType());
        dataAddLeaveEntitlement();
        addEntitlements = new AddEntitlements(driver, addEntitlementsModel);
        addEntitlements.EnterLeaveEntitlements();
        addEntitlements.AddEntitlements();
    }

    @When("el sistema arroja que se ha agregado el empleado al periodo de vacaciones")
    public void elSistemaArrojaQueSeHaAgregadoElEmpleadoAlPeriodoDeVacaciones() {
        addEntitlements.clickSave();
        //Assertions.assertEquals(MESSAGE_SAVED,addEntitlements.messageSaved());
        driveQuit();
    }

    public void dataScenarioOne() {
        loginModel = new LoginModel();
        loginModel.setUserName("Admin");
        loginModel.setPassword("admin123");
    }

    public void dataAddLeaveEntitlement(){
        addEntitlementsModel = new AddEntitlementsModel();
        addEntitlementsModel.setEntitlementsEmployeeEmpName("Alice Duv");
        addEntitlementsModel.setEntitlement("7");
    }
}
