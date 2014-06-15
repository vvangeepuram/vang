/**
 * MerchantDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class MerchantDataType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.TupleType[] merchantDataTuple;

    public MerchantDataType() {
    }

    public MerchantDataType(
           eBLBaseComponents.apis.ebay.TupleType[] merchantDataTuple) {
           this.merchantDataTuple = merchantDataTuple;
    }


    /**
     * Gets the merchantDataTuple value for this MerchantDataType.
     * 
     * @return merchantDataTuple
     */
    public eBLBaseComponents.apis.ebay.TupleType[] getMerchantDataTuple() {
        return merchantDataTuple;
    }


    /**
     * Sets the merchantDataTuple value for this MerchantDataType.
     * 
     * @param merchantDataTuple
     */
    public void setMerchantDataTuple(eBLBaseComponents.apis.ebay.TupleType[] merchantDataTuple) {
        this.merchantDataTuple = merchantDataTuple;
    }

    public eBLBaseComponents.apis.ebay.TupleType getMerchantDataTuple(int i) {
        return this.merchantDataTuple[i];
    }

    public void setMerchantDataTuple(int i, eBLBaseComponents.apis.ebay.TupleType _value) {
        this.merchantDataTuple[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantDataType)) return false;
        MerchantDataType other = (MerchantDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchantDataTuple==null && other.getMerchantDataTuple()==null) || 
             (this.merchantDataTuple!=null &&
              java.util.Arrays.equals(this.merchantDataTuple, other.getMerchantDataTuple())));
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
        if (getMerchantDataTuple() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMerchantDataTuple());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMerchantDataTuple(), i);
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
        new org.apache.axis.description.TypeDesc(MerchantDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantDataTuple");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantDataTuple"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TupleType"));
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
