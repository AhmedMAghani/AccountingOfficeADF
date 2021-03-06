package model.BCs.VOs;

import java.math.BigDecimal;

import java.sql.Timestamp;

import model.BCs.common.Money;

import oracle.jbo.domain.BFileDomain;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Mar 28 02:58:06 EET 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Cash_VORowImpl extends ViewRowImpl {
    public static final int ENTITY_CASH_EO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        StartDate,
        LastTransactionDate,
        CurrentCash,
        UpdatedCash,
        CompanyCash,
        OfficeCash,
        CashId;
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
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int LASTTRANSACTIONDATE = AttributesEnum.LastTransactionDate.index();
    public static final int CURRENTCASH = AttributesEnum.CurrentCash.index();
    public static final int UPDATEDCASH = AttributesEnum.UpdatedCash.index();
    public static final int COMPANYCASH = AttributesEnum.CompanyCash.index();
    public static final int OFFICECASH = AttributesEnum.OfficeCash.index();
    public static final int CASHID = AttributesEnum.CashId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Cash_VORowImpl() {
    }

    /**
     * Gets Cash_EO entity object.
     * @return the Cash_EO
     */
    public EntityImpl getCash_EO() {
        return (EntityImpl) getEntity(ENTITY_CASH_EO);
    }

    /**
     * Gets the attribute value for START_DATE using the alias name StartDate.
     * @return the START_DATE
     */
    public Timestamp getStartDate() {
        return (Timestamp) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for START_DATE using the alias name StartDate.
     * @param value value to set the START_DATE
     */
    public void setStartDate(Timestamp value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for LAST_TRANSACTION_DATE using the alias name LastTransactionDate.
     * @return the LAST_TRANSACTION_DATE
     */
    public Timestamp getLastTransactionDate() {
        return (Timestamp) getAttributeInternal(LASTTRANSACTIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_TRANSACTION_DATE using the alias name LastTransactionDate.
     * @param value value to set the LAST_TRANSACTION_DATE
     */
    public void setLastTransactionDate(Timestamp value) {
        setAttributeInternal(LASTTRANSACTIONDATE, value);
    }

    /**
     * Gets the attribute value for CURRENT_CASH using the alias name CurrentCash.
     * @return the CURRENT_CASH
     */
    public BigDecimal getCurrentCash() {
        return (BigDecimal) getAttributeInternal(CURRENTCASH);
    }

    /**
     * Sets <code>value</code> as attribute value for CURRENT_CASH using the alias name CurrentCash.
     * @param value value to set the CURRENT_CASH
     */
    public void setCurrentCash(BigDecimal value) {
        setAttributeInternal(CURRENTCASH, value);
    }

    /**
     * Gets the attribute value for UPDATED_CASH using the alias name UpdatedCash.
     * @return the UPDATED_CASH
     */
    public BigDecimal getUpdatedCash() {
        return (BigDecimal) getAttributeInternal(UPDATEDCASH);
    }

    /**
     * Sets <code>value</code> as attribute value for UPDATED_CASH using the alias name UpdatedCash.
     * @param value value to set the UPDATED_CASH
     */
    public void setUpdatedCash(BigDecimal value) {
        setAttributeInternal(UPDATEDCASH, value);
    }

    /**
     * Gets the attribute value for COMPANY_CASH using the alias name CompanyCash.
     * @return the COMPANY_CASH
     */
    public BigDecimal getCompanyCash() {
        return (BigDecimal) getAttributeInternal(COMPANYCASH);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPANY_CASH using the alias name CompanyCash.
     * @param value value to set the COMPANY_CASH
     */
    public void setCompanyCash(BigDecimal value) {
        setAttributeInternal(COMPANYCASH, value);
    }

    /**
     * Gets the attribute value for OFFICE_CASH using the alias name OfficeCash.
     * @return the OFFICE_CASH
     */
    public BigDecimal getOfficeCash() {
        return (BigDecimal) getAttributeInternal(OFFICECASH);
    }

    /**
     * Sets <code>value</code> as attribute value for OFFICE_CASH using the alias name OfficeCash.
     * @param value value to set the OFFICE_CASH
     */
    public void setOfficeCash(BigDecimal value) {
        setAttributeInternal(OFFICECASH, value);
    }

    /**
     * Gets the attribute value for CASH_ID using the alias name CashId.
     * @return the CASH_ID
     */
    public BigDecimal getCashId() {
        return (BigDecimal) getAttributeInternal(CASHID);
    }

    /**
     * Sets <code>value</code> as attribute value for CASH_ID using the alias name CashId.
     * @param value value to set the CASH_ID
     */
    public void setCashId(BigDecimal value) {
        setAttributeInternal(CASHID, value);
    }
}

