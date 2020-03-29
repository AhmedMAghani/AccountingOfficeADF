package model.BCs.common;

import java.io.Serializable;

import java.math.BigDecimal;

import oracle.jbo.JboException;
import oracle.jbo.SQLDatumException;
import oracle.jbo.Transaction;
import oracle.jbo.domain.DomainInterface;
import oracle.jbo.domain.DomainOwnerInterface;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 27 01:36:11 EET 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Money implements DomainInterface, Serializable {
    public Money(String obj) {
        mData = (new BigDecimal(obj));
        validate();
    }

    public Money(BigDecimal val) {
        mData = val;
        validate();
    }
    
    private BigDecimal mData;

    protected Money() {
        mData = null;
    }

    public Object getData() {
        return mData;
    }

    /**
     * <b>Internal:</b> <em>Applications should not use this method.</em>
     */
    public void setContext(DomainOwnerInterface owner, Transaction trans, Object obj) {
    }

    /**
     * Implements domain validation logic and throws a JboException on error.
     */
    protected void validate() {
        //  ### Implement custom domain validation logic here. ###
        if (mData.longValue() <0)
            throw new SQLDatumException(Money.class, "please enter non Negative number", null, null);
    }

    public String toString() {
        if (mData != null) {
            return mData.toString();
        }
        return "<null>";
    }

    public boolean equals(Object obj) {
        if (obj instanceof DomainInterface) {
            if (mData != null) {
                return mData.equals(((DomainInterface) obj).getData());
            }
            return ((DomainInterface) obj).getData() == null;
        }
        return false;
    }
}

