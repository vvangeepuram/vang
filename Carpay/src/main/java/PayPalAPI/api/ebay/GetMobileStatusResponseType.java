/**
 * GetMobileStatusResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class GetMobileStatusResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    /* Indicates whether the phone is activated for mobile payments */
    private java.math.BigInteger isActivated;

    /* Indicates whether the password is enabled for particular account */
    private java.math.BigInteger isPasswordSet;

    /* Indicates whether there is a payment pending from the phone */
    private java.math.BigInteger paymentPending;

    public GetMobileStatusResponseType() {
    }

    public GetMobileStatusResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           java.math.BigInteger isActivated,
           java.math.BigInteger isPasswordSet,
           java.math.BigInteger paymentPending) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.isActivated = isActivated;
        this.isPasswordSet = isPasswordSet;
        this.paymentPending = paymentPending;
    }


    /**
     * Gets the isActivated value for this GetMobileStatusResponseType.
     * 
     * @return isActivated   * Indicates whether the phone is activated for mobile payments
     */
    public java.math.BigInteger getIsActivated() {
        return isActivated;
    }


    /**
     * Sets the isActivated value for this GetMobileStatusResponseType.
     * 
     * @param isActivated   * Indicates whether the phone is activated for mobile payments
     */
    public void setIsActivated(java.math.BigInteger isActivated) {
        this.isActivated = isActivated;
    }


    /**
     * Gets the isPasswordSet value for this GetMobileStatusResponseType.
     * 
     * @return isPasswordSet   * Indicates whether the password is enabled for particular account
     */
    public java.math.BigInteger getIsPasswordSet() {
        return isPasswordSet;
    }


    /**
     * Sets the isPasswordSet value for this GetMobileStatusResponseType.
     * 
     * @param isPasswordSet   * Indicates whether the password is enabled for particular account
     */
    public void setIsPasswordSet(java.math.BigInteger isPasswordSet) {
        this.isPasswordSet = isPasswordSet;
    }


    /**
     * Gets the paymentPending value for this GetMobileStatusResponseType.
     * 
     * @return paymentPending   * Indicates whether there is a payment pending from the phone
     */
    public java.math.BigInteger getPaymentPending() {
        return paymentPending;
    }


    /**
     * Sets the paymentPending value for this GetMobileStatusResponseType.
     * 
     * @param paymentPending   * Indicates whether there is a payment pending from the phone
     */
    public void setPaymentPending(java.math.BigInteger paymentPending) {
        this.paymentPending = paymentPending;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMobileStatusResponseType)) return false;
        GetMobileStatusResponseType other = (GetMobileStatusResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isActivated==null && other.getIsActivated()==null) || 
             (this.isActivated!=null &&
              this.isActivated.equals(other.getIsActivated()))) &&
            ((this.isPasswordSet==null && other.getIsPasswordSet()==null) || 
             (this.isPasswordSet!=null &&
              this.isPasswordSet.equals(other.getIsPasswordSet()))) &&
            ((this.paymentPending==null && other.getPaymentPending()==null) || 
             (this.paymentPending!=null &&
              this.paymentPending.equals(other.getPaymentPending())));
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
        if (getIsActivated() != null) {
            _hashCode += getIsActivated().hashCode();
        }
        if (getIsPasswordSet() != null) {
            _hashCode += getIsPasswordSet().hashCode();
        }
        if (getPaymentPending() != null) {
            _hashCode += getPaymentPending().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMobileStatusResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetMobileStatusResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActivated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "IsActivated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPasswordSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "IsPasswordSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "PaymentPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
