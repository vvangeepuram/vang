/**
 * ShippingInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ShippingInfoType  implements java.io.Serializable {
    private java.lang.String shippingMethod;

    private java.lang.String shippingCarrier;

    private CoreComponentTypes.apis.ebay.BasicAmountType shippingAmount;

    private CoreComponentTypes.apis.ebay.BasicAmountType handlingAmount;

    private CoreComponentTypes.apis.ebay.BasicAmountType insuranceAmount;

    public ShippingInfoType() {
    }

    public ShippingInfoType(
           java.lang.String shippingMethod,
           java.lang.String shippingCarrier,
           CoreComponentTypes.apis.ebay.BasicAmountType shippingAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType handlingAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType insuranceAmount) {
           this.shippingMethod = shippingMethod;
           this.shippingCarrier = shippingCarrier;
           this.shippingAmount = shippingAmount;
           this.handlingAmount = handlingAmount;
           this.insuranceAmount = insuranceAmount;
    }


    /**
     * Gets the shippingMethod value for this ShippingInfoType.
     * 
     * @return shippingMethod
     */
    public java.lang.String getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this ShippingInfoType.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(java.lang.String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the shippingCarrier value for this ShippingInfoType.
     * 
     * @return shippingCarrier
     */
    public java.lang.String getShippingCarrier() {
        return shippingCarrier;
    }


    /**
     * Sets the shippingCarrier value for this ShippingInfoType.
     * 
     * @param shippingCarrier
     */
    public void setShippingCarrier(java.lang.String shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
    }


    /**
     * Gets the shippingAmount value for this ShippingInfoType.
     * 
     * @return shippingAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getShippingAmount() {
        return shippingAmount;
    }


    /**
     * Sets the shippingAmount value for this ShippingInfoType.
     * 
     * @param shippingAmount
     */
    public void setShippingAmount(CoreComponentTypes.apis.ebay.BasicAmountType shippingAmount) {
        this.shippingAmount = shippingAmount;
    }


    /**
     * Gets the handlingAmount value for this ShippingInfoType.
     * 
     * @return handlingAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getHandlingAmount() {
        return handlingAmount;
    }


    /**
     * Sets the handlingAmount value for this ShippingInfoType.
     * 
     * @param handlingAmount
     */
    public void setHandlingAmount(CoreComponentTypes.apis.ebay.BasicAmountType handlingAmount) {
        this.handlingAmount = handlingAmount;
    }


    /**
     * Gets the insuranceAmount value for this ShippingInfoType.
     * 
     * @return insuranceAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getInsuranceAmount() {
        return insuranceAmount;
    }


    /**
     * Sets the insuranceAmount value for this ShippingInfoType.
     * 
     * @param insuranceAmount
     */
    public void setInsuranceAmount(CoreComponentTypes.apis.ebay.BasicAmountType insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingInfoType)) return false;
        ShippingInfoType other = (ShippingInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod()))) &&
            ((this.shippingCarrier==null && other.getShippingCarrier()==null) || 
             (this.shippingCarrier!=null &&
              this.shippingCarrier.equals(other.getShippingCarrier()))) &&
            ((this.shippingAmount==null && other.getShippingAmount()==null) || 
             (this.shippingAmount!=null &&
              this.shippingAmount.equals(other.getShippingAmount()))) &&
            ((this.handlingAmount==null && other.getHandlingAmount()==null) || 
             (this.handlingAmount!=null &&
              this.handlingAmount.equals(other.getHandlingAmount()))) &&
            ((this.insuranceAmount==null && other.getInsuranceAmount()==null) || 
             (this.insuranceAmount!=null &&
              this.insuranceAmount.equals(other.getInsuranceAmount())));
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
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        if (getShippingCarrier() != null) {
            _hashCode += getShippingCarrier().hashCode();
        }
        if (getShippingAmount() != null) {
            _hashCode += getShippingAmount().hashCode();
        }
        if (getHandlingAmount() != null) {
            _hashCode += getHandlingAmount().hashCode();
        }
        if (getInsuranceAmount() != null) {
            _hashCode += getInsuranceAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "HandlingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InsuranceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
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
