/**
 * AccountEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class AccountEntryType  implements java.io.Serializable {
    /* Balance as of a given entry, can be 0.00. */
    private CoreComponentTypes.apis.ebay.AmountType balance;

    /* Credit Amount for a detail entry, can be 0.00. */
    private CoreComponentTypes.apis.ebay.AmountType credit;

    /* Date entry was posted, in GMT. */
    private java.util.Calendar date;

    /* Debit Amount for this detail entry, can be 0.00. */
    private CoreComponentTypes.apis.ebay.AmountType debit;

    /* Item number if transaction is associated with an auction or
     * 0 
     * 			           if no item is associated with an account entry. */
    private java.lang.String itemID;

    /* Memo line for an account entry, can be empty string. */
    private java.lang.String memo;

    /* eBay reference number for an account entry. */
    private int refNumber;

    /* Integer code for account details entry type. This element
     * 			           element specifies an index to a table of explanations
     * for 
     * 			           accounting charges. */
    private int accountEntryDetailsType;

    public AccountEntryType() {
    }

    public AccountEntryType(
           CoreComponentTypes.apis.ebay.AmountType balance,
           CoreComponentTypes.apis.ebay.AmountType credit,
           java.util.Calendar date,
           CoreComponentTypes.apis.ebay.AmountType debit,
           java.lang.String itemID,
           java.lang.String memo,
           int refNumber,
           int accountEntryDetailsType) {
           this.balance = balance;
           this.credit = credit;
           this.date = date;
           this.debit = debit;
           this.itemID = itemID;
           this.memo = memo;
           this.refNumber = refNumber;
           this.accountEntryDetailsType = accountEntryDetailsType;
    }


    /**
     * Gets the balance value for this AccountEntryType.
     * 
     * @return balance   * Balance as of a given entry, can be 0.00.
     */
    public CoreComponentTypes.apis.ebay.AmountType getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this AccountEntryType.
     * 
     * @param balance   * Balance as of a given entry, can be 0.00.
     */
    public void setBalance(CoreComponentTypes.apis.ebay.AmountType balance) {
        this.balance = balance;
    }


    /**
     * Gets the credit value for this AccountEntryType.
     * 
     * @return credit   * Credit Amount for a detail entry, can be 0.00.
     */
    public CoreComponentTypes.apis.ebay.AmountType getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this AccountEntryType.
     * 
     * @param credit   * Credit Amount for a detail entry, can be 0.00.
     */
    public void setCredit(CoreComponentTypes.apis.ebay.AmountType credit) {
        this.credit = credit;
    }


    /**
     * Gets the date value for this AccountEntryType.
     * 
     * @return date   * Date entry was posted, in GMT.
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this AccountEntryType.
     * 
     * @param date   * Date entry was posted, in GMT.
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the debit value for this AccountEntryType.
     * 
     * @return debit   * Debit Amount for this detail entry, can be 0.00.
     */
    public CoreComponentTypes.apis.ebay.AmountType getDebit() {
        return debit;
    }


    /**
     * Sets the debit value for this AccountEntryType.
     * 
     * @param debit   * Debit Amount for this detail entry, can be 0.00.
     */
    public void setDebit(CoreComponentTypes.apis.ebay.AmountType debit) {
        this.debit = debit;
    }


    /**
     * Gets the itemID value for this AccountEntryType.
     * 
     * @return itemID   * Item number if transaction is associated with an auction or
     * 0 
     * 			           if no item is associated with an account entry.
     */
    public java.lang.String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this AccountEntryType.
     * 
     * @param itemID   * Item number if transaction is associated with an auction or
     * 0 
     * 			           if no item is associated with an account entry.
     */
    public void setItemID(java.lang.String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the memo value for this AccountEntryType.
     * 
     * @return memo   * Memo line for an account entry, can be empty string.
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this AccountEntryType.
     * 
     * @param memo   * Memo line for an account entry, can be empty string.
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the refNumber value for this AccountEntryType.
     * 
     * @return refNumber   * eBay reference number for an account entry.
     */
    public int getRefNumber() {
        return refNumber;
    }


    /**
     * Sets the refNumber value for this AccountEntryType.
     * 
     * @param refNumber   * eBay reference number for an account entry.
     */
    public void setRefNumber(int refNumber) {
        this.refNumber = refNumber;
    }


    /**
     * Gets the accountEntryDetailsType value for this AccountEntryType.
     * 
     * @return accountEntryDetailsType   * Integer code for account details entry type. This element
     * 			           element specifies an index to a table of explanations
     * for 
     * 			           accounting charges.
     */
    public int getAccountEntryDetailsType() {
        return accountEntryDetailsType;
    }


    /**
     * Sets the accountEntryDetailsType value for this AccountEntryType.
     * 
     * @param accountEntryDetailsType   * Integer code for account details entry type. This element
     * 			           element specifies an index to a table of explanations
     * for 
     * 			           accounting charges.
     */
    public void setAccountEntryDetailsType(int accountEntryDetailsType) {
        this.accountEntryDetailsType = accountEntryDetailsType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountEntryType)) return false;
        AccountEntryType other = (AccountEntryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.credit==null && other.getCredit()==null) || 
             (this.credit!=null &&
              this.credit.equals(other.getCredit()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.debit==null && other.getDebit()==null) || 
             (this.debit!=null &&
              this.debit.equals(other.getDebit()))) &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            this.refNumber == other.getRefNumber() &&
            this.accountEntryDetailsType == other.getAccountEntryDetailsType();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getCredit() != null) {
            _hashCode += getCredit().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDebit() != null) {
            _hashCode += getDebit().hashCode();
        }
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        _hashCode += getRefNumber();
        _hashCode += getAccountEntryDetailsType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AccountEntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Debit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemIDType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountEntryDetailsType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AccountEntryDetailsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
