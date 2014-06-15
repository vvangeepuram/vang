/**
 * CoupledPaymentInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Information about Coupled Payment transactions.
 */
public class CoupledPaymentInfoType  implements java.io.Serializable {
    /* ID received in the Coupled Payment Request */
    private java.lang.String coupledPaymentRequestID;

    /* ID that uniquely identifies this CoupledPayment. Generated
     * by PP in Response */
    private java.lang.String coupledPaymentID;

    public CoupledPaymentInfoType() {
    }

    public CoupledPaymentInfoType(
           java.lang.String coupledPaymentRequestID,
           java.lang.String coupledPaymentID) {
           this.coupledPaymentRequestID = coupledPaymentRequestID;
           this.coupledPaymentID = coupledPaymentID;
    }


    /**
     * Gets the coupledPaymentRequestID value for this CoupledPaymentInfoType.
     * 
     * @return coupledPaymentRequestID   * ID received in the Coupled Payment Request
     */
    public java.lang.String getCoupledPaymentRequestID() {
        return coupledPaymentRequestID;
    }


    /**
     * Sets the coupledPaymentRequestID value for this CoupledPaymentInfoType.
     * 
     * @param coupledPaymentRequestID   * ID received in the Coupled Payment Request
     */
    public void setCoupledPaymentRequestID(java.lang.String coupledPaymentRequestID) {
        this.coupledPaymentRequestID = coupledPaymentRequestID;
    }


    /**
     * Gets the coupledPaymentID value for this CoupledPaymentInfoType.
     * 
     * @return coupledPaymentID   * ID that uniquely identifies this CoupledPayment. Generated
     * by PP in Response
     */
    public java.lang.String getCoupledPaymentID() {
        return coupledPaymentID;
    }


    /**
     * Sets the coupledPaymentID value for this CoupledPaymentInfoType.
     * 
     * @param coupledPaymentID   * ID that uniquely identifies this CoupledPayment. Generated
     * by PP in Response
     */
    public void setCoupledPaymentID(java.lang.String coupledPaymentID) {
        this.coupledPaymentID = coupledPaymentID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoupledPaymentInfoType)) return false;
        CoupledPaymentInfoType other = (CoupledPaymentInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coupledPaymentRequestID==null && other.getCoupledPaymentRequestID()==null) || 
             (this.coupledPaymentRequestID!=null &&
              this.coupledPaymentRequestID.equals(other.getCoupledPaymentRequestID()))) &&
            ((this.coupledPaymentID==null && other.getCoupledPaymentID()==null) || 
             (this.coupledPaymentID!=null &&
              this.coupledPaymentID.equals(other.getCoupledPaymentID())));
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
        if (getCoupledPaymentRequestID() != null) {
            _hashCode += getCoupledPaymentRequestID().hashCode();
        }
        if (getCoupledPaymentID() != null) {
            _hashCode += getCoupledPaymentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CoupledPaymentInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupledPaymentInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupledPaymentRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupledPaymentRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupledPaymentID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupledPaymentID"));
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
