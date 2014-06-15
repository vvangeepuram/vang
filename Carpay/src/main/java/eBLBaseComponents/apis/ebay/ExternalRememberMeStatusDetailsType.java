/**
 * ExternalRememberMeStatusDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ExternalRememberMeStatusDetailsType  implements java.io.Serializable {
    /* Required field that reports status of opt-in or login bypass
     * attempt.
     * 								0 = Success - successful opt-in or ExternalRememberMeID specified
     * in SetExpressCheckout
     * 									is valid.
     * 								1 = Invalid ID - ExternalRememberMeID specified in SetExpressCheckout
     * is invalid.
     * 								2 = Internal Error - System error or outage during opt-in
     * or login bypass.  Can retry
     * 									opt-in or login bypass next time.  Flow will force full authentication
     * and allow buyer
     * 									to complete transaction.
     * 								-1 = None - the return value does not signify any valid remember
     * me status. */
    private java.math.BigInteger externalRememberMeStatus;

    /* Identifier returned on external-remember-me-opt-in to allow
     * the merchant to request
     * 								bypass of PayPal login through external remember me on behalf
     * of the buyer in future
     * 								transactions.  The ExternalRememberMeID is a 17-character
     * alphanumeric (encrypted)
     * 								string.  This field has meaning only to the merchant. */
    private java.lang.String externalRememberMeID;

    public ExternalRememberMeStatusDetailsType() {
    }

    public ExternalRememberMeStatusDetailsType(
           java.math.BigInteger externalRememberMeStatus,
           java.lang.String externalRememberMeID) {
           this.externalRememberMeStatus = externalRememberMeStatus;
           this.externalRememberMeID = externalRememberMeID;
    }


    /**
     * Gets the externalRememberMeStatus value for this ExternalRememberMeStatusDetailsType.
     * 
     * @return externalRememberMeStatus   * Required field that reports status of opt-in or login bypass
     * attempt.
     * 								0 = Success - successful opt-in or ExternalRememberMeID specified
     * in SetExpressCheckout
     * 									is valid.
     * 								1 = Invalid ID - ExternalRememberMeID specified in SetExpressCheckout
     * is invalid.
     * 								2 = Internal Error - System error or outage during opt-in
     * or login bypass.  Can retry
     * 									opt-in or login bypass next time.  Flow will force full authentication
     * and allow buyer
     * 									to complete transaction.
     * 								-1 = None - the return value does not signify any valid remember
     * me status.
     */
    public java.math.BigInteger getExternalRememberMeStatus() {
        return externalRememberMeStatus;
    }


    /**
     * Sets the externalRememberMeStatus value for this ExternalRememberMeStatusDetailsType.
     * 
     * @param externalRememberMeStatus   * Required field that reports status of opt-in or login bypass
     * attempt.
     * 								0 = Success - successful opt-in or ExternalRememberMeID specified
     * in SetExpressCheckout
     * 									is valid.
     * 								1 = Invalid ID - ExternalRememberMeID specified in SetExpressCheckout
     * is invalid.
     * 								2 = Internal Error - System error or outage during opt-in
     * or login bypass.  Can retry
     * 									opt-in or login bypass next time.  Flow will force full authentication
     * and allow buyer
     * 									to complete transaction.
     * 								-1 = None - the return value does not signify any valid remember
     * me status.
     */
    public void setExternalRememberMeStatus(java.math.BigInteger externalRememberMeStatus) {
        this.externalRememberMeStatus = externalRememberMeStatus;
    }


    /**
     * Gets the externalRememberMeID value for this ExternalRememberMeStatusDetailsType.
     * 
     * @return externalRememberMeID   * Identifier returned on external-remember-me-opt-in to allow
     * the merchant to request
     * 								bypass of PayPal login through external remember me on behalf
     * of the buyer in future
     * 								transactions.  The ExternalRememberMeID is a 17-character
     * alphanumeric (encrypted)
     * 								string.  This field has meaning only to the merchant.
     */
    public java.lang.String getExternalRememberMeID() {
        return externalRememberMeID;
    }


    /**
     * Sets the externalRememberMeID value for this ExternalRememberMeStatusDetailsType.
     * 
     * @param externalRememberMeID   * Identifier returned on external-remember-me-opt-in to allow
     * the merchant to request
     * 								bypass of PayPal login through external remember me on behalf
     * of the buyer in future
     * 								transactions.  The ExternalRememberMeID is a 17-character
     * alphanumeric (encrypted)
     * 								string.  This field has meaning only to the merchant.
     */
    public void setExternalRememberMeID(java.lang.String externalRememberMeID) {
        this.externalRememberMeID = externalRememberMeID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalRememberMeStatusDetailsType)) return false;
        ExternalRememberMeStatusDetailsType other = (ExternalRememberMeStatusDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalRememberMeStatus==null && other.getExternalRememberMeStatus()==null) || 
             (this.externalRememberMeStatus!=null &&
              this.externalRememberMeStatus.equals(other.getExternalRememberMeStatus()))) &&
            ((this.externalRememberMeID==null && other.getExternalRememberMeID()==null) || 
             (this.externalRememberMeID!=null &&
              this.externalRememberMeID.equals(other.getExternalRememberMeID())));
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
        if (getExternalRememberMeStatus() != null) {
            _hashCode += getExternalRememberMeStatus().hashCode();
        }
        if (getExternalRememberMeID() != null) {
            _hashCode += getExternalRememberMeID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalRememberMeStatusDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeStatusDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRememberMeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRememberMeID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
