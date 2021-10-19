package co.com.sofka.page.time.projectinfo.projects;

import co.com.sofka.model.time.projectinfo.projects.ProjectsModel;
import co.com.sofka.page.common.CommonActionsOnPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Projects extends CommonActionsOnPages {

    private ProjectsModel projectsModel;

    @FindBy(id = "menu_time_viewTimeModule")
    private WebElement menuTimeViewTimeModule;

    @FindBy(id = "menu_admin_ProjectInfo")
    private WebElement menuAdminProjectInfo;

    @FindBy(id = "menu_admin_viewProjects")
    private WebElement menuAdminViewProjects;

    @FindBy(xpath = "//*[@id=\"btnAdd\"]")
    private WebElement btnAdd;

    @FindBy(id = "addCustomerLink")
    private WebElement addCustomerLink;

    //Ventana de Dialogo add customer

    @FindBy(id = "addCustomer_customerName")
    private WebElement addCustomerCustomerName;

    @FindBy(id = "addCustomer_description")
    private WebElement addCustomerDescription;

    @FindBy(id = "dialogSave")
    private  WebElement dialogSave;

    //Continue Add Project

    @FindBy(xpath = "//*[@id=\"addProject_projectName\"]")
    private WebElement addProjectProjectName;

    @FindBy(id = "addProject_projectAdmin_1")
    private WebElement addProjectProjectAdmin_1;

    @FindBy(id = "addButton")
    private WebElement addButton;

    @FindBy(id ="addProject_projectAdmin_2")
    private WebElement addProjectProjectAdmin_2;

    @FindBy(id = "addProject_description")
    private WebElement addProjectDescription;

    @FindBy(id = "btnSave")
    private WebElement btnSave;

    @FindBy(id = "btnCopy")
    private WebElement btnCopy;

    //Dialog Copy
    @FindBy(id = "projectName")
    private WebElement projectName;

    @FindBy(id = "btnCopyDig")
    private WebElement btnCopyDig;


    public Projects(WebDriver driver, ProjectsModel projectsModel) {
        super(driver);
        pageFactoryInitElement(driver, this);
        this.projectsModel = projectsModel;
    }

    public Projects(WebDriver driver, ProjectsModel projectsModel, int secondsForExplicitWait) {

        super(driver, secondsForExplicitWait);
        pageFactoryInitElement(driver, this);
        this.projectsModel = projectsModel;

    }

    public void EnterProjects(){
        clickOn(menuTimeViewTimeModule);
        clickOn(menuAdminProjectInfo);
        clickOn(menuAdminViewProjects);
        clickOn(btnAdd);
    }

    public void formProject(){
        clickOn(addCustomerLink);
        type(addCustomerCustomerName, projectsModel.getAddCustomerCustomerName());
        type(addCustomerDescription, projectsModel.getAddCustomerDescription());
        clickOn(dialogSave);
        type(addProjectProjectName, projectsModel.getAddProjectProjectName());
        type(addProjectProjectAdmin_1, projectsModel.getAddProjectProjectAdmin_1());
        clickOn(addButton);
        type(addProjectProjectAdmin_2, projectsModel.getAddProjectProjectAdmin_2());
        type(addProjectDescription, projectsModel.getAddProjectDescription());
        clickOn(btnSave);
    }

    public void formCopy(){
        clickOn(btnCopy);
        type(projectName);
        clickOn(btnCopyDig);
    }

}
