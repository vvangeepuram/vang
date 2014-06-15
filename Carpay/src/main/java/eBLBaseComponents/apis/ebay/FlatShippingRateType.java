/**
 * FlatShippingRateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class FlatShippingRateType  implements java.io.Serializable {
    /* Any additional shipping costs for the item. */
    private CoreComponentTypes.apis.ebay.AmountType additionalShippingCosts;

    private CoreComponentTypes.apis.ebay.AmountType flatShippingHandlingCosts;

    private CoreComponentTypes.apis.ebay.AmountType insuranceFee;

    private eBLBaseComponents.apis.ebay.InsuranceOptionCodeType insuranceOption;

    private eBLBaseComponents.apis.ebay.ShippingServiceCodeType shippingService;

    public FlatShippingRateType() {
    }

    public FlatShippingRateType(
           CoreComponentTypes.apis.ebay.AmountType additionalShippingCosts,
           CoreComponentTypes.apis.ebay.AmountType flatShippingHandlingCosts,
           CoreComponentTypes.apis.ebay.AmountType insuranceFee,
           eBLBaseComponents.apis.ebay.InsuranceOptionCodeType insuranceOption,
           eBLBaseComponents.apis.ebay.ShippingServiceCodeType shippingService) {
           this.additionalShippingCosts = additionalShippingCosts;
           this.flatShippingHandlingCosts = flatShippingHandlingCosts;
           this.insuranceFee = insuranceFee;
           this.insuranceOption = insuranceOption;
           this.shippingService = shippingService;
    }


    /**
     * Gets the additionalShippingCosts value for this FlatShippingRateType.
     * 
     * @return additionalShippingCosts   * Any additional shipping costs for the item.
     */
    public CoreComponentTypes.apis.ebay.AmountType getAdditionalShippingCosts() {
        return additionalShippingCosts;
    }


    /**
     * Sets the additionalShippingCosts value for this FlatShippingRateType.
     * 
     * @param additionalShippingCosts   * Any additional shipping costs for the item.
     */
    public void setAdditionalShippingCosts(CoreComponentTypes.apis.ebay.AmountType additionalShippingCosts) {
        this.additionalShippingCosts = additionalShippingCosts;
    }


    /**
     * Gets the flatShippingHandlingCosts value for this FlatShippingRateType.
     * 
     * @return flatShippingHandlingCosts
     */
    public CoreComponentTypes.apis.ebay.AmountType getFlatShippingHandlingCosts() {
        return flatShippingHandlingCosts;
    }


    /**
     * Sets the flatShippingHandlingCosts value for this FlatShippingRateType.
     * 
     * @param flatShippingHandlingCosts
     */
    public void setFlatShippingHandlingCosts(CoreComponentTypes.apis.ebay.AmountType flatShippingHandlingCosts) {
        this.flatShippingHandlingCosts = flatShippingHandlingCosts;
    }


    /**
     * Gets the insuranceFee value for this FlatShippingRateType.
     * 
     * @return insuranceFee
     */
    public CoreComponentTypes.apis.ebay.AmountType getInsuranceFee() {
        return insuranceFee;
    }


    /**
     * Sets the insuranceFee value for this FlatShippingRateType.
     * 
     * @param insuranceFee
     */
    public void setInsuranceFee(CoreComponentTypes.apis.ebay.AmountType insuranceFee) {
        this.insuranceFee = insuranceFee;
    }


    /**
     * Gets the insuranceOption value for this FlatShippingRateType.
     * 
     * @return insuranceOption
     */
    public eBLBaseComponents.apis.ebay.InsuranceOptionCodeType getInsuranceOption() {
        return insuranceOption;
    }


    /**
     * Sets the insuranceOption value for this FlatShippingRateType.
     * 
     * @param insuranceOption
     */
    public void setInsuranceOption(eBLBaseComponents.apis.ebay.InsuranceOptionCodeType insuranceOption) {
        this.insuranceOption = insuranceOption;
    }


    /**
     * Gets the shippingService value for this FlatShippingRateType.
     * 
     * @return shippingService
     */
    public eBLBaseComponents.apis.ebay.ShippingServiceCodeType getShippingService() {
        return shippingService;
    }


    /**
     * Sets the shippingService value for this FlatShippingRateType.
     * 
     * @param shippingService
     */
    public void setShippingService(eBLBaseComponents.apis.ebay.ShippingServiceCodeType shippingService) {
        this.shippingService = shippingService;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlatShippingRateType)) return false;
        FlatShippingRateType other = (FlatShippingRateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalShippingCosts==null && other.getAdditionalShippingCosts()==null) || 
             (this.additionalShippingCosts!=null &&
              this.additionalShippingCosts.equals(other.getAdditionalShippingCosts()))) &&
            ((this.flatShippingHandlingCosts==null && other.getFlatShippingHandlingCosts()==null) || 
             (this.flatShippingHandlingCosts!=null &&
              this.flatShippingHandlingCosts.equals(other.getFlatShippingHandlingCosts()))) &&
            ((this.insuranceFee==null && other.getInsuranceFee()==null) || 
             (this.insuranceFee!=null &&
              this.insuranceFee.equals(other.getInsuranceFee()))) &&
            ((this.insuranceOption==null && other.getInsuranceOption()==null) || 
             (this.insuranceOption!=null &&
              this.insuranceOption.equals(other.getInsuranceOption()))) &&
            ((this.shippingService==null && other.getShippingService()==null) || 
             (this.shippingService!=null &&
              this.shippingService.equals(other.getShippingService())));
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
        if (getAdditionalShippingCosts() != null) {
            _hashCode += getAdditionalShippingCosts().hashCode();
        }
        if (getFlatShippingHandlingCosts() != null) {
            _hashCode += getFlatShippingHandlingCosts().hashCode();
        }
        if (getInsuranceFee() != null) {
            _hashCode += getInsuranceFee().hashCode();
        }
        if (getInsuranceOption() != null) {
            _hashCode += getInsuranceOption().hashCode();
        }
        if (getShippingService() != null) {
            _hashCode += getShippingService().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlatShippingRateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlatShippingRateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalShippingCosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AdditionalShippingCosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flatShippingHandlingCosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlatShippingHandlingCosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceFee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InsuranceFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InsuranceOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InsuranceOptionCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingServiceCodeType"));
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
