package model.BCs.VOs;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 25 16:30:54 EET 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Tasks_VORowImpl extends ViewRowImpl {

    public static final int ENTITY_TASKS_EO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        TaskId,
        EmpId,
        CompanyId,
        ContractId,
        TaskType,
        TaskState,
        TaskIssueDate,
        TaskCompleteDate,
        OfficeExpencesId,
        OfficeIncomeId,
        taskCompleteDateInt;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int TASKID = AttributesEnum.TaskId.index();
    public static final int EMPID = AttributesEnum.EmpId.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int TASKTYPE = AttributesEnum.TaskType.index();
    public static final int TASKSTATE = AttributesEnum.TaskState.index();
    public static final int TASKISSUEDATE = AttributesEnum.TaskIssueDate.index();
    public static final int TASKCOMPLETEDATE = AttributesEnum.TaskCompleteDate.index();
    public static final int OFFICEEXPENCESID = AttributesEnum.OfficeExpencesId.index();
    public static final int OFFICEINCOMEID = AttributesEnum.OfficeIncomeId.index();
    public static final int TASKCOMPLETEDATEINT = AttributesEnum.taskCompleteDateInt.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Tasks_VORowImpl() {
    }

    /**
     * Gets Tasks_EO entity object.
     * @return the Tasks_EO
     */
    public EntityImpl getTasks_EO() {
        return (EntityImpl) getEntity(ENTITY_TASKS_EO);
    }

    /**
     * Gets the attribute value for TASK_ID using the alias name TaskId.
     * @return the TASK_ID
     */
    public BigDecimal getTaskId() {
        return (BigDecimal) getAttributeInternal(TASKID);
    }

    /**
     * Sets <code>value</code> as attribute value for TASK_ID using the alias name TaskId.
     * @param value value to set the TASK_ID
     */
    public void setTaskId(BigDecimal value) {
        setAttributeInternal(TASKID, value);
    }

    /**
     * Gets the attribute value for EMP_ID using the alias name EmpId.
     * @return the EMP_ID
     */
    public BigDecimal getEmpId() {
        return (BigDecimal) getAttributeInternal(EMPID);
    }

    /**
     * Sets <code>value</code> as attribute value for EMP_ID using the alias name EmpId.
     * @param value value to set the EMP_ID
     */
    public void setEmpId(BigDecimal value) {
        setAttributeInternal(EMPID, value);
    }

    /**
     * Gets the attribute value for COMPANY_ID using the alias name CompanyId.
     * @return the COMPANY_ID
     */
    public BigDecimal getCompanyId() {
        return (BigDecimal) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPANY_ID using the alias name CompanyId.
     * @param value value to set the COMPANY_ID
     */
    public void setCompanyId(BigDecimal value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for CONTRACT_ID using the alias name ContractId.
     * @return the CONTRACT_ID
     */
    public BigDecimal getContractId() {
        return (BigDecimal) getAttributeInternal(CONTRACTID);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTRACT_ID using the alias name ContractId.
     * @param value value to set the CONTRACT_ID
     */
    public void setContractId(BigDecimal value) {
        setAttributeInternal(CONTRACTID, value);
    }

    /**
     * Gets the attribute value for TASK_TYPE using the alias name TaskType.
     * @return the TASK_TYPE
     */
    public BigDecimal getTaskType() {
        return (BigDecimal) getAttributeInternal(TASKTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for TASK_TYPE using the alias name TaskType.
     * @param value value to set the TASK_TYPE
     */
    public void setTaskType(BigDecimal value) {
        setAttributeInternal(TASKTYPE, value);
    }

    /**
     * Gets the attribute value for TASK_STATE using the alias name TaskState.
     * @return the TASK_STATE
     */
    public BigDecimal getTaskState() {
        return (BigDecimal) getAttributeInternal(TASKSTATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TASK_STATE using the alias name TaskState.
     * @param value value to set the TASK_STATE
     */
    public void setTaskState(BigDecimal value) {
        setAttributeInternal(TASKSTATE, value);
    }

    /**
     * Gets the attribute value for TASK_ISSUE_DATE using the alias name TaskIssueDate.
     * @return the TASK_ISSUE_DATE
     */
    public Timestamp getTaskIssueDate() {
        return (Timestamp) getAttributeInternal(TASKISSUEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TASK_ISSUE_DATE using the alias name TaskIssueDate.
     * @param value value to set the TASK_ISSUE_DATE
     */
    public void setTaskIssueDate(Timestamp value) {
        setAttributeInternal(TASKISSUEDATE, value);
    }

    /**
     * Gets the attribute value for TASK_COMPLETE_DATE using the alias name TaskCompleteDate.
     * @return the TASK_COMPLETE_DATE
     */
    public Timestamp getTaskCompleteDate() {
        return (Timestamp) getAttributeInternal(TASKCOMPLETEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TASK_COMPLETE_DATE using the alias name TaskCompleteDate.
     * @param value value to set the TASK_COMPLETE_DATE
     */
    public void setTaskCompleteDate(Timestamp value) {
        setAttributeInternal(TASKCOMPLETEDATE, value);
    }

    /**
     * Gets the attribute value for OFFICE_EXPENCES_ID using the alias name OfficeExpencesId.
     * @return the OFFICE_EXPENCES_ID
     */
    public BigDecimal getOfficeExpencesId() {
        return (BigDecimal) getAttributeInternal(OFFICEEXPENCESID);
    }

    /**
     * Sets <code>value</code> as attribute value for OFFICE_EXPENCES_ID using the alias name OfficeExpencesId.
     * @param value value to set the OFFICE_EXPENCES_ID
     */
    public void setOfficeExpencesId(BigDecimal value) {
        setAttributeInternal(OFFICEEXPENCESID, value);
    }

    /**
     * Gets the attribute value for OFFICE_INCOME_ID using the alias name OfficeIncomeId.
     * @return the OFFICE_INCOME_ID
     */
    public BigDecimal getOfficeIncomeId() {
        return (BigDecimal) getAttributeInternal(OFFICEINCOMEID);
    }

    /**
     * Sets <code>value</code> as attribute value for OFFICE_INCOME_ID using the alias name OfficeIncomeId.
     * @param value value to set the OFFICE_INCOME_ID
     */
    public void setOfficeIncomeId(BigDecimal value) {
        setAttributeInternal(OFFICEINCOMEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute taskCompleteDateInt.
     * @return the taskCompleteDateInt
     */
    public Integer gettaskCompleteDateInt() {
        return (Integer) getAttributeInternal(TASKCOMPLETEDATEINT);
    }
}

