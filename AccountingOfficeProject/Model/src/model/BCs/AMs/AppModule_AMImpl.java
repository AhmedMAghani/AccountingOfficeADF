package model.BCs.AMs;

import java.math.BigDecimal;

import model.BCs.EOs.OfficeExpences_EOImpl;
import model.BCs.VOs.Cash_VOImpl;
import model.BCs.VOs.Contracts_VOImpl;
import model.BCs.VOs.OfficeIncome_VOImpl;
import model.BCs.VOs.Tasks_VOImpl;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.TransactionEvent;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Mar 28 02:19:20 EET 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModule_AMImpl extends ApplicationModuleImpl {
    Cash_VOImpl cashVO;
    Key cashPrimaryKey;
    Row[] cashRowArr = new Row[1];
    Row cashRow;
    /**
     * This is the default constructor (do not remove).
     */
    public AppModule_AMImpl() {
    }

    /**
     * Container's getter for Cash1.
     * @return Cash1
     */
    public Cash_VOImpl getCash1() {
        return (Cash_VOImpl) findViewObject("Cash1");
    }

    /**
     * Container's getter for Companies1.
     * @return Companies1
     */
    public ViewObjectImpl getCompanies1() {
        return (ViewObjectImpl) findViewObject("Companies1");
    }

    /**
     * Container's getter for Contracts1.
     * @return Contracts1
     */
    public Contracts_VOImpl getContracts1() {
        return (Contracts_VOImpl) findViewObject("Contracts1");
    }

    /**
     * Container's getter for Employees1.
     * @return Employees1
     */
    public ViewObjectImpl getEmployees1() {
        return (ViewObjectImpl) findViewObject("Employees1");
    }

    /**
     * Container's getter for OfficeExpences1.
     * @return OfficeExpences1
     */
    public ViewObjectImpl getOfficeExpences1() {
        return (ViewObjectImpl) findViewObject("OfficeExpences1");
    }

    /**
     * Container's getter for OfficeIncome1.
     * @return OfficeIncome1
     */
    public OfficeIncome_VOImpl getOfficeIncome1() {
        return (OfficeIncome_VOImpl) findViewObject("OfficeIncome1");
    }

    /**
     * Container's getter for Tasks1.
     * @return Tasks1
     */
    public Tasks_VOImpl getTasks1() {
        return (Tasks_VOImpl) findViewObject("Tasks1");
    }

    /**
     * Container's getter for Contracts2.
     * @return Contracts2
     */
    public Contracts_VOImpl getContracts2() {
        return (Contracts_VOImpl) findViewObject("Contracts2");
    }

    /**
     * Container's getter for Contracts3.
     * @return Contracts3
     */
    public Contracts_VOImpl getContracts3() {
        return (Contracts_VOImpl) findViewObject("Contracts3");
    }

    /**
     * Container's getter for OfficeExpences2.
     * @return OfficeExpences2
     */
    public ViewObjectImpl getOfficeExpences2() {
        return (ViewObjectImpl) findViewObject("OfficeExpences2");
    }

    /**
     * Container's getter for OfficeIncome2.
     * @return OfficeIncome2
     */
    public OfficeIncome_VOImpl getOfficeIncome2() {
        return (OfficeIncome_VOImpl) findViewObject("OfficeIncome2");
    }

    /**
     * Container's getter for Tasks2.
     * @return Tasks2
     */
    public Tasks_VOImpl getTasks2() {
        return (Tasks_VOImpl) findViewObject("Tasks2");
    }

    /**
     * Container's getter for Tasks3.
     * @return Tasks3
     */
    public Tasks_VOImpl getTasks3() {
        return (Tasks_VOImpl) findViewObject("Tasks3");
    }

    /**
     * Container's getter for Tasks4.
     * @return Tasks4
     */
    public Tasks_VOImpl getTasks4() {
        return (Tasks_VOImpl) findViewObject("Tasks4");
    }

    /**
     * Container's getter for Tasks5.
     * @return Tasks5
     */
    public Tasks_VOImpl getTasks5() {
        return (Tasks_VOImpl) findViewObject("Tasks5");
    }

    /**
     * Container's getter for Tasks6.
     * @return Tasks6
     */
    public Tasks_VOImpl getTasks6() {
        return (Tasks_VOImpl) findViewObject("Tasks6");
    }

    /**
     * Container's getter for ContactTypesStatic1.
     * @return ContactTypesStatic1
     */
    public ViewObjectImpl getContactTypesStatic1() {
        return (ViewObjectImpl) findViewObject("ContactTypesStatic1");
    }

    /**
     * Container's getter for TaskTypsStatic1.
     * @return TaskTypsStatic1
     */
    public ViewObjectImpl getTaskTypsStatic1() {
        return (ViewObjectImpl) findViewObject("TaskTypsStatic1");
    }

    /**
     * Container's getter for TasksStatusStatic1.
     * @return TasksStatusStatic1
     */
    public ViewObjectImpl getTasksStatusStatic1() {
        return (ViewObjectImpl) findViewObject("TasksStatusStatic1");
    }

    /**
     * Container's getter for IncomeTypesStatic1.
     * @return IncomeTypesStatic1
     */
    public ViewObjectImpl getIncomeTypesStatic1() {
        return (ViewObjectImpl) findViewObject("IncomeTypesStatic1");
    }

    /**
     * Container's getter for ExpencesTypesStatic1.
     * @return ExpencesTypesStatic1
     */
    public ViewObjectImpl getExpencesTypesStatic1() {
        return (ViewObjectImpl) findViewObject("ExpencesTypesStatic1");
    }

    /**
     * Container's getter for EducationTypesStatic1.
     * @return EducationTypesStatic1
     */
    public ViewObjectImpl getEducationTypesStatic1() {
        return (ViewObjectImpl) findViewObject("EducationTypesStatic1");
    }

    /**
     * Container's getter for jobTitleStatic1.
     * @return jobTitleStatic1
     */
    public ViewObjectImpl getjobTitleStatic1() {
        return (ViewObjectImpl) findViewObject("jobTitleStatic1");
    }

    /**
     * Container's getter for TrueFalseStatic1.
     * @return TrueFalseStatic1
     */
    public ViewObjectImpl getTrueFalseStatic1() {
        return (ViewObjectImpl) findViewObject("TrueFalseStatic1");
    }

    /**
     * Container's getter for CompaniesContracts_VL1.
     * @return CompaniesContracts_VL1
     */
    public ViewLinkImpl getCompaniesContracts_VL1() {
        return (ViewLinkImpl) findViewLink("CompaniesContracts_VL1");
    }

    /**
     * Container's getter for EmployeesContrancts_VL1.
     * @return EmployeesContrancts_VL1
     */
    public ViewLinkImpl getEmployeesContrancts_VL1() {
        return (ViewLinkImpl) findViewLink("EmployeesContrancts_VL1");
    }

    /**
     * Container's getter for ContractOfficeExpences_VL1.
     * @return ContractOfficeExpences_VL1
     */
    public ViewLinkImpl getContractOfficeExpences_VL1() {
        return (ViewLinkImpl) findViewLink("ContractOfficeExpences_VL1");
    }

    /**
     * Container's getter for ContractOfficeIncomeFk_VL1.
     * @return ContractOfficeIncomeFk_VL1
     */
    public ViewLinkImpl getContractOfficeIncomeFk_VL1() {
        return (ViewLinkImpl) findViewLink("ContractOfficeIncomeFk_VL1");
    }

    /**
     * Container's getter for CompaniesTasksFk_VL1.
     * @return CompaniesTasksFk_VL1
     */
    public ViewLinkImpl getCompaniesTasksFk_VL1() {
        return (ViewLinkImpl) findViewLink("CompaniesTasksFk_VL1");
    }

    /**
     * Container's getter for ContractTasksFk_VL1.
     * @return ContractTasksFk_VL1
     */
    public ViewLinkImpl getContractTasksFk_VL1() {
        return (ViewLinkImpl) findViewLink("ContractTasksFk_VL1");
    }

    /**
     * Container's getter for EmployeesTaskesPk_VL1.
     * @return EmployeesTaskesPk_VL1
     */
    public ViewLinkImpl getEmployeesTaskesPk_VL1() {
        return (ViewLinkImpl) findViewLink("EmployeesTaskesPk_VL1");
    }

    /**
     * Container's getter for OfficeExpencesTasksFk_VL1.
     * @return OfficeExpencesTasksFk_VL1
     */
    public ViewLinkImpl getOfficeExpencesTasksFk_VL1() {
        return (ViewLinkImpl) findViewLink("OfficeExpencesTasksFk_VL1");
    }

    /**
     * Container's getter for OfficeIncomeTasksFk_VL1.
     * @return OfficeIncomeTasksFk_VL1
     */
    public ViewLinkImpl getOfficeIncomeTasksFk_VL1() {
        return (ViewLinkImpl) findViewLink("OfficeIncomeTasksFk_VL1");
    }

    /**
     * Container's getter for TotalExpancesSQL1.
     * @return TotalExpancesSQL1
     */
    public ViewObjectImpl getTotalExpancesSQL1() {
        return (ViewObjectImpl) findViewObject("TotalExpancesSQL1");
    }
}

