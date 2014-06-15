/**
 * PaymentMeansType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class PaymentMeansType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.SellerPaymentMethodCodeType typeCodeID;

    public PaymentMeansType() {
    }

    public PaymentMeansType(
           eBLBaseComponents.apis.ebay.SellerPaymentMethodCodeType typeCodeID) {
           this.typeCodeID = typeCodeID;
    }


    /**
     * Gets the typeCodeID value for this PaymentMeansType.
     * 
     * @return typeCodeID
     */
    public eBLBaseComponents.apis.ebay.SellerPaymentMethodCodeType getTypeCodeID() {
        return typeCodeID;
    }


    /**
     * Sets the typeCodeID value for this PaymentMeansType.
     * 
     * @param typeCodeID
     */
    public void setTypeCodeID(eBLBaseComponents.apis.ebay.SellerPaymentMethodCodeType typeCodeID) {
        this.typeCodeID = typeCodeID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentMeansType)) return false;
        PaymentMeansType other = (PaymentMeansType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.typeCodeID==null && other.getTypeCodeID()==null) || 
             (this.typeCodeID!=null &&
              this.typeCodeID.equals(other.getTypeCodeID())));
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
        if (getTypeCodeID() != null) {
            _hashCode += getTypeCodeID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentMeansType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentMeansType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeCodeID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TypeCodeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerPaymentMethodCodeType"));
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
