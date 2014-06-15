/**
 * DoAuthorizationResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoAuthorizationResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    /* An authorization identification number. 
     * 								
     * 										
     * Character length and limits: 19 single-byte characters */
    private java.lang.String transactionID;

    /* The amount and currency you specified in the request. */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    private eBLBaseComponents.apis.ebay.AuthorizationInfoType authorizationInfo;

    /* Return msgsubid back to merchant */
    private java.lang.String msgSubID;

    public DoAuthorizationResponseType() {
    }

    public DoAuthorizationResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String transactionID,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           eBLBaseComponents.apis.ebay.AuthorizationInfoType authorizationInfo,
           java.lang.String msgSubID) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.transactionID = transactionID;
        this.amount = amount;
        this.authorizationInfo = authorizationInfo;
        this.msgSubID = msgSubID;
    }


    /**
     * Gets the transactionID value for this DoAuthorizationResponseType.
     * 
     * @return transactionID   * An authorization identification number. 
     * 								
     * 										
     * Character length and limits: 19 single-byte characters
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this DoAuthorizationResponseType.
     * 
     * @param transactionID   * An authorization identification number. 
     * 								
     * 										
     * Character length and limits: 19 single-byte characters
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the amount value for this DoAuthorizationResponseType.
     * 
     * @return amount   * The amount and currency you specified in the request.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DoAuthorizationResponseType.
     * 
     * @param amount   * The amount and currency you specified in the request.
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the authorizationInfo value for this DoAuthorizationResponseType.
     * 
     * @return authorizationInfo
     */
    public eBLBaseComponents.apis.ebay.AuthorizationInfoType getAuthorizationInfo() {
        return authorizationInfo;
    }


    /**
     * Sets the authorizationInfo value for this DoAuthorizationResponseType.
     * 
     * @param authorizationInfo
     */
    public void setAuthorizationInfo(eBLBaseComponents.apis.ebay.AuthorizationInfoType authorizationInfo) {
        this.authorizationInfo = authorizationInfo;
    }


    /**
     * Gets the msgSubID value for this DoAuthorizationResponseType.
     * 
     * @return msgSubID   * Return msgsubid back to merchant
     */
    public java.lang.String getMsgSubID() {
        return msgSubID;
    }


    /**
     * Sets the msgSubID value for this DoAuthorizationResponseType.
     * 
     * @param msgSubID   * Return msgsubid back to merchant
     */
    public void setMsgSubID(java.lang.String msgSubID) {
        this.msgSubID = msgSubID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAuthorizationResponseType)) return false;
        DoAuthorizationResponseType other = (DoAuthorizationResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.authorizationInfo==null && other.getAuthorizationInfo()==null) || 
             (this.authorizationInfo!=null &&
              this.authorizationInfo.equals(other.getAuthorizationInfo()))) &&
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
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAuthorizationInfo() != null) {
            _hashCode += getAuthorizationInfo().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAuthorizationResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoAuthorizationResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionID"));
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
        elemField.setFieldName("authorizationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationInfoType"));
        elemField.setMinOccurs(0);
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
