/**
 * CoupledBucketsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class CoupledBucketsType  implements java.io.Serializable {
    /* Relationship Type - LifeTime (default) */
    private eBLBaseComponents.apis.ebay.CoupleType coupleType;

    /* Identifier for this relation */
    private java.lang.String coupledPaymentRequestID;

    private java.lang.String[] paymentRequestID;

    public CoupledBucketsType() {
    }

    public CoupledBucketsType(
           eBLBaseComponents.apis.ebay.CoupleType coupleType,
           java.lang.String coupledPaymentRequestID,
           java.lang.String[] paymentRequestID) {
           this.coupleType = coupleType;
           this.coupledPaymentRequestID = coupledPaymentRequestID;
           this.paymentRequestID = paymentRequestID;
    }


    /**
     * Gets the coupleType value for this CoupledBucketsType.
     * 
     * @return coupleType   * Relationship Type - LifeTime (default)
     */
    public eBLBaseComponents.apis.ebay.CoupleType getCoupleType() {
        return coupleType;
    }


    /**
     * Sets the coupleType value for this CoupledBucketsType.
     * 
     * @param coupleType   * Relationship Type - LifeTime (default)
     */
    public void setCoupleType(eBLBaseComponents.apis.ebay.CoupleType coupleType) {
        this.coupleType = coupleType;
    }


    /**
     * Gets the coupledPaymentRequestID value for this CoupledBucketsType.
     * 
     * @return coupledPaymentRequestID   * Identifier for this relation
     */
    public java.lang.String getCoupledPaymentRequestID() {
        return coupledPaymentRequestID;
    }


    /**
     * Sets the coupledPaymentRequestID value for this CoupledBucketsType.
     * 
     * @param coupledPaymentRequestID   * Identifier for this relation
     */
    public void setCoupledPaymentRequestID(java.lang.String coupledPaymentRequestID) {
        this.coupledPaymentRequestID = coupledPaymentRequestID;
    }


    /**
     * Gets the paymentRequestID value for this CoupledBucketsType.
     * 
     * @return paymentRequestID
     */
    public java.lang.String[] getPaymentRequestID() {
        return paymentRequestID;
    }


    /**
     * Sets the paymentRequestID value for this CoupledBucketsType.
     * 
     * @param paymentRequestID
     */
    public void setPaymentRequestID(java.lang.String[] paymentRequestID) {
        this.paymentRequestID = paymentRequestID;
    }

    public java.lang.String getPaymentRequestID(int i) {
        return this.paymentRequestID[i];
    }

    public void setPaymentRequestID(int i, java.lang.String _value) {
        this.paymentRequestID[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoupledBucketsType)) return false;
        CoupledBucketsType other = (CoupledBucketsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coupleType==null && other.getCoupleType()==null) || 
             (this.coupleType!=null &&
              this.coupleType.equals(other.getCoupleType()))) &&
            ((this.coupledPaymentRequestID==null && other.getCoupledPaymentRequestID()==null) || 
             (this.coupledPaymentRequestID!=null &&
              this.coupledPaymentRequestID.equals(other.getCoupledPaymentRequestID()))) &&
            ((this.paymentRequestID==null && other.getPaymentRequestID()==null) || 
             (this.paymentRequestID!=null &&
              java.util.Arrays.equals(this.paymentRequestID, other.getPaymentRequestID())));
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
        if (getCoupleType() != null) {
            _hashCode += getCoupleType().hashCode();
        }
        if (getCoupledPaymentRequestID() != null) {
            _hashCode += getCoupledPaymentRequestID().hashCode();
        }
        if (getPaymentRequestID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentRequestID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentRequestID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CoupledBucketsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupledBucketsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupleType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupledPaymentRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupledPaymentRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentRequestID"));
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
