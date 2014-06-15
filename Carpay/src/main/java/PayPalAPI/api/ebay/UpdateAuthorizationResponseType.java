/**
 * UpdateAuthorizationResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class UpdateAuthorizationResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    /* An authorization identification number.
     * 										
     * 										
     * 										Character length and limits: 19 single-byte characters */
    private java.lang.String transactionID;

    private eBLBaseComponents.apis.ebay.AuthorizationInfoType authorizationInfo;

    public UpdateAuthorizationResponseType() {
    }

    public UpdateAuthorizationResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String transactionID,
           eBLBaseComponents.apis.ebay.AuthorizationInfoType authorizationInfo) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.transactionID = transactionID;
        this.authorizationInfo = authorizationInfo;
    }


    /**
     * Gets the transactionID value for this UpdateAuthorizationResponseType.
     * 
     * @return transactionID   * An authorization identification number.
     * 										
     * 										
     * 										Character length and limits: 19 single-byte characters
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this UpdateAuthorizationResponseType.
     * 
     * @param transactionID   * An authorization identification number.
     * 										
     * 										
     * 										Character length and limits: 19 single-byte characters
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the authorizationInfo value for this UpdateAuthorizationResponseType.
     * 
     * @return authorizationInfo
     */
    public eBLBaseComponents.apis.ebay.AuthorizationInfoType getAuthorizationInfo() {
        return authorizationInfo;
    }


    /**
     * Sets the authorizationInfo value for this UpdateAuthorizationResponseType.
     * 
     * @param authorizationInfo
     */
    public void setAuthorizationInfo(eBLBaseComponents.apis.ebay.AuthorizationInfoType authorizationInfo) {
        this.authorizationInfo = authorizationInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAuthorizationResponseType)) return false;
        UpdateAuthorizationResponseType other = (UpdateAuthorizationResponseType) obj;
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
            ((this.authorizationInfo==null && other.getAuthorizationInfo()==null) || 
             (this.authorizationInfo!=null &&
              this.authorizationInfo.equals(other.getAuthorizationInfo())));
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
        if (getAuthorizationInfo() != null) {
            _hashCode += getAuthorizationInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateAuthorizationResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAuthorizationResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationInfoType"));
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
