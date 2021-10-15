package co.com.sofka.page.leave.entitlements.addentitlements;

import co.com.sofka.model.leave.entitlements.addentitlements.AddEntitlementsModel;
import co.com.sofka.page.common.CommonActionsOnPages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AddEntitlements extends CommonActionsOnPages {

    private By menuLeaveViewLeaveModule = By.id("menu_leave_viewLeaveModule");
    private By menuLeaveEntitlements = By.id("menu_leave_Entitlements");
    private By menuLeaveAddLeaveEntitlement = By.id("menu_leave_addLeaveEntitlement");
    private By checkBoxAddMultiplesEmployees = By.id("entitlements_filters_bulk_assign");
    private By entitlementsEmployeeEmpName = By.xpath("//*[@id=\"entitlements_employee_empName\"]");
    private By selectEmployeeEmpName = By.xpath("/html/body/div[4]/ul/li[1");
    private By selectLeaveType = By.id("entitlements_leave_type");
    private By getTextLeaveType = By.xpath("//*[@id=\"entitlements_leave_type\"]/option[10]");
    private By selectLeavePeriod = By.id("period");
    private By getTextLeavePeriod = By.xpath("//*[@id=\"period\"]/option[2]");
    private By entitlement = By.id("entitlements_entitlement");
    private By btnSave = By.id("btnSave");

    private By messageSaved = By.className("message success fadable");

    //Inicializar la clase AddEntitlementsModel
    private AddEntitlementsModel addEntitlementsModel = new AddEntitlementsModel();

    public AddEntitlements(WebDriver driver, AddEntitlementsModel addEntitlementsModel) {
        super(driver);
        this.addEntitlementsModel = addEntitlementsModel;
    }

    public void EnterLeaveEntitlements() {
        clickOn(menuLeaveViewLeaveModule);
        clickOn(menuLeaveEntitlements);
        clickOn(menuLeaveAddLeaveEntitlement);
    }

    public void AddEntitlements() {
        clearFields(entitlementsEmployeeEmpName);
        clickOn(entitlementsEmployeeEmpName);
        type(entitlementsEmployeeEmpName, addEntitlementsModel.getEntitlementsEmployeeEmpName());
        clickOn(selectLeaveType);
        clickOn(getTextLeaveType);
        clickOn(selectLeavePeriod);
        clickOn(getTextLeavePeriod);
        type(entitlement, addEntitlementsModel.getEntitlement());
        clickOn(btnSave);
    }

    public void clickSave(){
        clickOn(btnSave);
    }

    public String messageLeaveType() {
        return getText(getTextLeaveType);
    }

    public String messageSaved(){
        return getText(messageSaved);
    }
}
