/**
 * DoReauthorizationRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoReauthorizationRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* The value of a previously authorized transaction identification
     * number returned by a PayPal product. You can obtain a buyer's transaction
     * number from the TransactionID element of the PayerInfo structure returned
     * by GetTransactionDetailsResponse. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: 19 single-byte characters maximum */
    private java.lang.String authorizationID;

    /* Amount to reauthorize. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* Unique id for each API request to prevent duplicate payments.
     * 										
     * 										
     * 										
     * 										Character length and limits: 38 single-byte characters maximum. */
    private java.lang.String msgSubID;

    public DoReauthorizationRequestType() {
    }

    public DoReauthorizationRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String authorizationID,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           java.lang.String msgSubID) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.authorizationID = authorizationID;
        this.amount = amount;
        this.msgSubID = msgSubID;
    }


    /**
     * Gets the authorizationID value for this DoReauthorizationRequestType.
     * 
     * @return authorizationID   * The value of a previously authorized transaction identification
     * number returned by a PayPal product. You can obtain a buyer's transaction
     * number from the TransactionID element of the PayerInfo structure returned
     * by GetTransactionDetailsResponse. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: 19 single-byte characters maximum
     */
    public java.lang.String getAuthorizationID() {
        return authorizationID;
    }


    /**
     * Sets the authorizationID value for this DoReauthorizationRequestType.
     * 
     * @param authorizationID   * The value of a previously authorized transaction identification
     * number returned by a PayPal product. You can obtain a buyer's transaction
     * number from the TransactionID element of the PayerInfo structure returned
     * by GetTransactionDetailsResponse. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: 19 single-byte characters maximum
     */
    public void setAuthorizationID(java.lang.String authorizationID) {
        this.authorizationID = authorizationID;
    }


    /**
     * Gets the amount value for this DoReauthorizationRequestType.
     * 
     * @return amount   * Amount to reauthorize. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DoReauthorizationRequestType.
     * 
     * @param amount   * Amount to reauthorize. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the msgSubID value for this DoReauthorizationRequestType.
     * 
     * @return msgSubID   * Unique id for each API request to prevent duplicate payments.
     * 										
     * 										
     * 										
     * 										Character length and limits: 38 single-byte characters maximum.
     */
    public java.lang.String getMsgSubID() {
        return msgSubID;
    }


    /**
     * Sets the msgSubID value for this DoReauthorizationRequestType.
     * 
     * @param msgSubID   * Unique id for each API request to prevent duplicate payments.
     * 										
     * 										
     * 										
     * 										Character length and limits: 38 single-byte characters maximum.
     */
    public void setMsgSubID(java.lang.String msgSubID) {
        this.msgSubID = msgSubID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoReauthorizationRequestType)) return false;
        DoReauthorizationRequestType other = (DoReauthorizationRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authorizationID==null && other.getAuthorizationID()==null) || 
             (this.authorizationID!=null &&
              this.authorizationID.equals(other.getAuthorizationID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.msgSubID==null && other.getMsgSubID()==null) || 
             (this.msgSubID!=null &&
              this.msgSubID.equals(other.getMsgSubID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAuthorizationID() != null) {
            _hashCode += getAuthorizationID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoReauthorizationRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReauthorizationRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "AuthorizationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgSubID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "MsgSubID"));
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
