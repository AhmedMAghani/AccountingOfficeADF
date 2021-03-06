package model.BCs.EOs;

import java.math.BigDecimal;

import java.math.BigInteger;

import java.time.LocalDate;

import java.util.Date;

import model.BCs.common.Money;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.BFileDomain;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Mar 26 11:01:22 EET 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OfficeIncome_EOImpl extends EntityImpl {
    private Contracts_EOImpl contractEntity,contractRecord;
    private Key contractPrimaryKey;
    private Date validationDate,currentDate;
    private BigDecimal incomeValue;
    private Integer incomeTypes;
    private BigDecimal contratOPIncome,contractIncome;
    /**
     * Validation method for ContractId.
     */
    public boolean validateContractId(BigDecimal contractid) {
        contractRecord = getContractRecord(contractid);
        validationDate =(Date) contractRecord.getAttribute("ContractEndDate");
        currentDate = new Date();
        if (validationDate.compareTo(currentDate)>0)
            return true;
        return false;
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
        if (operation==DML_INSERT)
            ubdateContracts();
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        IncomeId,
        ContractId,
        IncomeValue,
        IncomeType,
        Contracts,
        Tasks;
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
    public static final int CONTRACTS = AttributesEnum.Contracts.index();
    public static final int TASKS = AttributesEnum.Tasks.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OfficeIncome_EOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.BCs.EOs.OfficeIncome_EO");
    }


    /**
     * Gets the attribute value for IncomeId, using the alias name IncomeId.
     * @return the value of IncomeId
     */
    public BigDecimal getIncomeId() {
        return (BigDecimal) getAttributeInternal(INCOMEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for IncomeId.
     * @param value value to set the IncomeId
     */
    public void setIncomeId(BigDecimal value) {
        setAttributeInternal(INCOMEID, value);
    }

    /**
     * Gets the attribute value for ContractId, using the alias name ContractId.
     * @return the value of ContractId
     */
    public BigDecimal getContractId() {
        return (BigDecimal) getAttributeInternal(CONTRACTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContractId.
     * @param value value to set the ContractId
     */
    public void setContractId(BigDecimal value) {
        setAttributeInternal(CONTRACTID, value);
    }

    /**
     * Gets the attribute value for IncomeValue, using the alias name IncomeValue.
     * @return the value of IncomeValue
     */
    public BigDecimal getIncomeValue() {
        return (BigDecimal) getAttributeInternal(INCOMEVALUE);
    }


    /**
     * Sets <code>value</code> as the attribute value for IncomeValue.
     * @param value value to set the IncomeValue
     */
    public void setIncomeValue(BigDecimal value) {
        setAttributeInternal(INCOMEVALUE, value);
    }

    /**
     * Gets the attribute value for IncomeType, using the alias name IncomeType.
     * @return the value of IncomeType
     */
    public BigDecimal getIncomeType() {
        return (BigDecimal) getAttributeInternal(INCOMETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IncomeType.
     * @param value value to set the IncomeType
     */
    public void setIncomeType(BigDecimal value) {
        setAttributeInternal(INCOMETYPE, value);
    }

    /**
     * @return the associated entity Contracts_EOImpl.
     */
    public Contracts_EOImpl getContracts() {
        return (Contracts_EOImpl) getAttributeInternal(CONTRACTS);
    }

    /**
     * Sets <code>value</code> as the associated entity Contracts_EOImpl.
     */
    public void setContracts(Contracts_EOImpl value) {
        setAttributeInternal(CONTRACTS, value);
    }

    /**
     * @return the associated entity Tasks_EOImpl.
     */
    public Tasks_EOImpl getTasks() {
        return (Tasks_EOImpl) getAttributeInternal(TASKS);
    }

    /**
     * Sets <code>value</code> as the associated entity Tasks_EOImpl.
     */
    public void setTasks(Tasks_EOImpl value) {
        setAttributeInternal(TASKS, value);
    }


    /**
     * @param incomeId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal incomeId) {
        return new Key(new Object[] { incomeId });
    }

    private void ubdateContracts() {
        incomeValue = getIncomeValue();
        incomeTypes = getIncomeType().intValue();
        contractRecord = getContractRecord(getContractId());
        if (incomeTypes != 1) {
            contratOPIncome =
                (contractRecord.getContractDebit() == null) ? new BigDecimal("0") :
                contractRecord.getContractDebit();
            contractRecord.setContractDebit(contratOPIncome.add(incomeValue));
        } else {
            contractIncome =
                (contractRecord.getContractIncome() == null) ? new BigDecimal("0") :
                contractRecord.getContractIncome();
            contractRecord.setContractIncome(contractIncome.add(incomeValue));
        }
    }

    private Contracts_EOImpl getContractRecord(BigDecimal contractid) {
        contractPrimaryKey = Contracts_EOImpl.createPrimaryKey(contractid);
        return (Contracts_EOImpl) contractEntity.getDefinitionObject().findByPrimaryKey(getDBTransaction(),
                                                                                        contractPrimaryKey);
    }

}

