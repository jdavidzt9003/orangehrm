package co.com.sofka.stepdefinition.time.projectinfo.projects;

import co.com.sofka.model.login.LoginModel;
import co.com.sofka.model.time.projectinfo.projects.ProjectsModel;
import co.com.sofka.page.login.Login;
import co.com.sofka.page.time.projectinfo.projects.Projects;
import co.com.sofka.stepdefinition.setup.WebUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProjectsStepDefinition extends WebUI {

    private ProjectsModel projectsModel;
    private Projects projects;
    private LoginModel loginModel;

    //Scenario: Agregar nuevo proyecto
    @Given("el usuario esta en la página OrangeHRM modulo time project info")
    public void elUsuarioEstaEnLaPaginaOrangeHRMModuloTimeProjectInfo() {
        generalSetUp();
        dataScenarioOne();
        Login login = new Login(driver, loginModel);
        login.loginInto();
    }

    @When("agrega un nuevo proyecto haciendo la creacion de un cliente e ingresando minimo dos administradores de proyecto")
    public void agregaUnNuevoProyectoHaciendoLaCreacionDeUnClienteEIngresandoMinimoDosAdministradoresDeProyecto() {
        dataFormProjects();
        dataCopyForm();
        projects = new Projects(driver, projectsModel);
        projects.EnterProjects();
        projects.formProject();
        projects.formCopy();
    }

    @Then("el sistema deberá permitir la creación del nuevo proyecto")
    public void elSistemaDeberaPermitirLaCreaciónDelNuevoProyecto() {
        driveQuit();
    }

    public void dataScenarioOne() {
        loginModel = new LoginModel();
        loginModel.setUserName("Admin");
        loginModel.setPassword("admin123");
    }

    public void dataFormProjects(){
        projectsModel = new ProjectsModel();
        projectsModel.setAddCustomerCustomerName("New Customer");
        projectsModel.setAddCustomerDescription("Agregando descripción del nuevo customers");
        projectsModel.setAddProjectProjectName("Nuevo proyecto");
        projectsModel.setAddProjectProjectAdmin_1("Odis Adalwin");
        projectsModel.setAddProjectProjectAdmin_2("Fiona Grace");
        projectsModel.setAddProjectDescription("Agregando un nuevo nombre de proyecto");
    }

    public void dataCopyForm(){
        projectsModel.setProjectName("projectName");
    }

}
