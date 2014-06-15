/**
 * GetTransactionDetailsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class GetTransactionDetailsRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* Unique identifier of a transaction. 
     * 
     * 
     * 
     * The details for some kinds of transactions cannot be retrieved with
     * GetTransactionDetailsRequest. You cannot obtain details of bank transfer
     * withdrawals, for example. 
     * 
     * Character length and limitations: 17 single-byte alphanumeric characters */
    private java.lang.String transactionID;

    public GetTransactionDetailsRequestType() {
    }

    public GetTransactionDetailsRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String transactionID) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.transactionID = transactionID;
    }


    /**
     * Gets the transactionID value for this GetTransactionDetailsRequestType.
     * 
     * @return transactionID   * Unique identifier of a transaction. 
     * 
     * 
     * 
     * The details for some kinds of transactions cannot be retrieved with
     * GetTransactionDetailsRequest. You cannot obtain details of bank transfer
     * withdrawals, for example. 
     * 
     * Character length and limitations: 17 single-byte alphanumeric characters
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this GetTransactionDetailsRequestType.
     * 
     * @param transactionID   * Unique identifier of a transaction. 
     * 
     * 
     * 
     * The details for some kinds of transactions cannot be retrieved with
     * GetTransactionDetailsRequest. You cannot obtain details of bank transfer
     * withdrawals, for example. 
     * 
     * Character length and limitations: 17 single-byte alphanumeric characters
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTransactionDetailsRequestType)) return false;
        GetTransactionDetailsRequestType other = (GetTransactionDetailsRequestType) obj;
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
              this.transactionID.equals(other.getTransactionID())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTransactionDetailsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetTransactionDetailsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionID"));
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
