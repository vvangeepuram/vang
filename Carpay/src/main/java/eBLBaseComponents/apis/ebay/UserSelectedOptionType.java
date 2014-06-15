/**
 * UserSelectedOptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Information on user selected options
 */
public class UserSelectedOptionType  implements java.io.Serializable {
    private java.lang.String shippingCalculationMode;

    private java.lang.String insuranceOptionSelected;

    private java.lang.String shippingOptionIsDefault;

    private CoreComponentTypes.apis.ebay.BasicAmountType shippingOptionAmount;

    private java.lang.String shippingOptionName;

    public UserSelectedOptionType() {
    }

    public UserSelectedOptionType(
           java.lang.String shippingCalculationMode,
           java.lang.String insuranceOptionSelected,
           java.lang.String shippingOptionIsDefault,
           CoreComponentTypes.apis.ebay.BasicAmountType shippingOptionAmount,
           java.lang.String shippingOptionName) {
           this.shippingCalculationMode = shippingCalculationMode;
           this.insuranceOptionSelected = insuranceOptionSelected;
           this.shippingOptionIsDefault = shippingOptionIsDefault;
           this.shippingOptionAmount = shippingOptionAmount;
           this.shippingOptionName = shippingOptionName;
    }


    /**
     * Gets the shippingCalculationMode value for this UserSelectedOptionType.
     * 
     * @return shippingCalculationMode
     */
    public java.lang.String getShippingCalculationMode() {
        return shippingCalculationMode;
    }


    /**
     * Sets the shippingCalculationMode value for this UserSelectedOptionType.
     * 
     * @param shippingCalculationMode
     */
    public void setShippingCalculationMode(java.lang.String shippingCalculationMode) {
        this.shippingCalculationMode = shippingCalculationMode;
    }


    /**
     * Gets the insuranceOptionSelected value for this UserSelectedOptionType.
     * 
     * @return insuranceOptionSelected
     */
    public java.lang.String getInsuranceOptionSelected() {
        return insuranceOptionSelected;
    }


    /**
     * Sets the insuranceOptionSelected value for this UserSelectedOptionType.
     * 
     * @param insuranceOptionSelected
     */
    public void setInsuranceOptionSelected(java.lang.String insuranceOptionSelected) {
        this.insuranceOptionSelected = insuranceOptionSelected;
    }


    /**
     * Gets the shippingOptionIsDefault value for this UserSelectedOptionType.
     * 
     * @return shippingOptionIsDefault
     */
    public java.lang.String getShippingOptionIsDefault() {
        return shippingOptionIsDefault;
    }


    /**
     * Sets the shippingOptionIsDefault value for this UserSelectedOptionType.
     * 
     * @param shippingOptionIsDefault
     */
    public void setShippingOptionIsDefault(java.lang.String shippingOptionIsDefault) {
        this.shippingOptionIsDefault = shippingOptionIsDefault;
    }


    /**
     * Gets the shippingOptionAmount value for this UserSelectedOptionType.
     * 
     * @return shippingOptionAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getShippingOptionAmount() {
        return shippingOptionAmount;
    }


    /**
     * Sets the shippingOptionAmount value for this UserSelectedOptionType.
     * 
     * @param shippingOptionAmount
     */
    public void setShippingOptionAmount(CoreComponentTypes.apis.ebay.BasicAmountType shippingOptionAmount) {
        this.shippingOptionAmount = shippingOptionAmount;
    }


    /**
     * Gets the shippingOptionName value for this UserSelectedOptionType.
     * 
     * @return shippingOptionName
     */
    public java.lang.String getShippingOptionName() {
        return shippingOptionName;
    }


    /**
     * Sets the shippingOptionName value for this UserSelectedOptionType.
     * 
     * @param shippingOptionName
     */
    public void setShippingOptionName(java.lang.String shippingOptionName) {
        this.shippingOptionName = shippingOptionName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSelectedOptionType)) return false;
        UserSelectedOptionType other = (UserSelectedOptionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shippingCalculationMode==null && other.getShippingCalculationMode()==null) || 
             (this.shippingCalculationMode!=null &&
              this.shippingCalculationMode.equals(other.getShippingCalculationMode()))) &&
            ((this.insuranceOptionSelected==null && other.getInsuranceOptionSelected()==null) || 
             (this.insuranceOptionSelected!=null &&
              this.insuranceOptionSelected.equals(other.getInsuranceOptionSelected()))) &&
            ((this.shippingOptionIsDefault==null && other.getShippingOptionIsDefault()==null) || 
             (this.shippingOptionIsDefault!=null &&
              this.shippingOptionIsDefault.equals(other.getShippingOptionIsDefault()))) &&
            ((this.shippingOptionAmount==null && other.getShippingOptionAmount()==null) || 
             (this.shippingOptionAmount!=null &&
              this.shippingOptionAmount.equals(other.getShippingOptionAmount()))) &&
            ((this.shippingOptionName==null && other.getShippingOptionName()==null) || 
             (this.shippingOptionName!=null &&
              this.shippingOptionName.equals(other.getShippingOptionName())));
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
        if (getShippingCalculationMode() != null) {
            _hashCode += getShippingCalculationMode().hashCode();
        }
        if (getInsuranceOptionSelected() != null) {
            _hashCode += getInsuranceOptionSelected().hashCode();
        }
        if (getShippingOptionIsDefault() != null) {
            _hashCode += getShippingOptionIsDefault().hashCode();
        }
        if (getShippingOptionAmount() != null) {
            _hashCode += getShippingOptionAmount().hashCode();
        }
        if (getShippingOptionName() != null) {
            _hashCode += getShippingOptionName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserSelectedOptionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserSelectedOptionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCalculationMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingCalculationMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceOptionSelected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InsuranceOptionSelected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingOptionIsDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingOptionIsDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingOptionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingOptionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingOptionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingOptionName"));
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
