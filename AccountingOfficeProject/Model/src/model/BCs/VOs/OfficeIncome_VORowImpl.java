package model.BCs.VOs;

import java.math.BigDecimal;

import java.math.BigInteger;

import model.BCs.EOs.OfficeIncome_EOImpl;

import model.BCs.common.Money;
import model.BCs.common.contractIdType;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.BFileDomain;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Mar 26 11:03:14 EET 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OfficeIncome_VORowImpl extends ViewRowImpl {
    public static final int ENTITY_OFFICEINCOME_EO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        IncomeId,
        ContractId,
        IncomeValue,
        IncomeType,
        Tasks,
        Contracts_VO1,
        IncomeTypesStatic_VO1;
        private static AttributesEnum[] vals = null;
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
    public static final int INCOMEID = AttributesEnum.IncomeId.index();
    public static final int CONTRACTID = AttributesEnum.ContractId.index();
    public static final int INCOMEVALUE = AttributesEnum.IncomeValue.index();
    public static final int INCOMETYPE = AttributesEnum.IncomeType.index();
    public static final int TASKS = AttributesEnum.Tasks.index();
    public static final int CONTRACTS_VO1 = AttributesEnum.Contracts_VO1.index();
    public static final int INCOMETYPESSTATIC_VO1 = AttributesEnum.IncomeTypesStatic_VO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OfficeIncome_VORowImpl() {
    }

    /**
     * Gets OfficeIncome_EO entity object.
     * @return the OfficeIncome_EO
     */
    public OfficeIncome_EOImpl getOfficeIncome_EO() {
        return (OfficeIncome_EOImpl) getEntity(ENTITY_OFFICEINCOME_EO);
    }

    /**
     * Gets the attribute value for INCOME_ID using the alias name IncomeId.
     * @return the INCOME_ID
     */
    public BigDecimal getIncomeId() {
        return (BigDecimal) getAttributeInternal(INCOMEID);
    }

    /**
     * Sets <code>value</code> as attribute value for INCOME_ID using the alias name IncomeId.
     * @param value value to set the INCOME_ID
     */
    public void setIncomeId(BigDecimal value) {
        setAttributeInternal(INCOMEID, value);
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
     * Gets the attribute value for INCOME_VALUE using the alias name IncomeValue.
     * @return the INCOME_VALUE
     */
    public BigDecimal getIncomeValue() {
        return (BigDecimal) getAttributeInternal(INCOMEVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for INCOME_VALUE using the alias name IncomeValue.
     * @param value value to set the INCOME_VALUE
     */
    public void setIncomeValue(BigDecimal value) {
        setAttributeInternal(INCOMEVALUE, value);
    }

    /**
     * Gets the attribute value for INCOME_TYPE using the alias name IncomeType.
     * @return the INCOME_TYPE
     */
    public BigDecimal getIncomeType() {
        return (BigDecimal) getAttributeInternal(INCOMETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for INCOME_TYPE using the alias name IncomeType.
     * @param value value to set the INCOME_TYPE
     */
    public void setIncomeType(BigDecimal value) {
        setAttributeInternal(INCOMETYPE, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link Tasks.
     */
    public Row getTasks() {
        return (Row) getAttributeInternal(TASKS);
    }

    /**
     * Sets the master-detail link Tasks between this object and <code>value</code>.
     */
    public void setTasks(Row value) {
        setAttributeInternal(TASKS, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Contracts_VO1.
     */
    public RowSet getContracts_VO1() {
        return (RowSet) getAttributeInternal(CONTRACTS_VO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> IncomeTypesStatic_VO1.
     */
    public RowSet getIncomeTypesStatic_VO1() {
        return (RowSet) getAttributeInternal(INCOMETYPESSTATIC_VO1);
    }
}

