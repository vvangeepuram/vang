/**
 * AdditionalAccountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * The AdditionalAccount component represents historical data related
 * to 
 * 	          accounts that the user held with a country of residency
 * other than 
 * 	          the current one. eBay users can have one active account
 * at a time. 
 * 	          For users who change their country of residency and modify
 * their 
 * 	          eBay registration to reflect this change, the new country
 * of residence 
 * 	          becomes the currently active account. Any account associated
 * with 
 * 	          a previous country is treated as an additional account.
 * Because the 
 * 	          currency for these additional accounts are different than
 * the active 
 * 	          account, each additional account includes an indicator
 * of the currency 
 * 	          for that account. Users who never change their country
 * of residence 
 * 	          will not have any additional accounts.
 */
public class AdditionalAccountType  implements java.io.Serializable {
    private CoreComponentTypes.apis.ebay.AmountType balance;

    private eBLBaseComponents.apis.ebay.CurrencyCodeType currency;

    private java.lang.String accountCode;

    public AdditionalAccountType() {
    }

    public AdditionalAccountType(
           CoreComponentTypes.apis.ebay.AmountType balance,
           eBLBaseComponents.apis.ebay.CurrencyCodeType currency,
           java.lang.String accountCode) {
           this.balance = balance;
           this.currency = currency;
           this.accountCode = accountCode;
    }


    /**
     * Gets the balance value for this AdditionalAccountType.
     * 
     * @return balance
     */
    public CoreComponentTypes.apis.ebay.AmountType getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this AdditionalAccountType.
     * 
     * @param balance
     */
    public void setBalance(CoreComponentTypes.apis.ebay.AmountType balance) {
        this.balance = balance;
    }


    /**
     * Gets the currency value for this AdditionalAccountType.
     * 
     * @return currency
     */
    public eBLBaseComponents.apis.ebay.CurrencyCodeType getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AdditionalAccountType.
     * 
     * @param currency
     */
    public void setCurrency(eBLBaseComponents.apis.ebay.CurrencyCodeType currency) {
        this.currency = currency;
    }


    /**
     * Gets the accountCode value for this AdditionalAccountType.
     * 
     * @return accountCode
     */
    public java.lang.String getAccountCode() {
        return accountCode;
    }


    /**
     * Sets the accountCode value for this AdditionalAccountType.
     * 
     * @param accountCode
     */
    public void setAccountCode(java.lang.String accountCode) {
        this.accountCode = accountCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdditionalAccountType)) return false;
        AdditionalAccountType other = (AdditionalAccountType) obj;
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
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.accountCode==null && other.getAccountCode()==null) || 
             (this.accountCode!=null &&
              this.accountCode.equals(other.getAccountCode())));
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getAccountCode() != null) {
            _hashCode += getAccountCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdditionalAccountType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AdditionalAccountType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CurrencyCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AccountCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
