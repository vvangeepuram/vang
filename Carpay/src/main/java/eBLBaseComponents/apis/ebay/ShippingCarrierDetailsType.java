/**
 * ShippingCarrierDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ShippingCarrierDetailsType  implements java.io.Serializable {
    /* Calculated cost of shipping, based on shipping parameters and
     * 
     *                                     selected shipping service. Only
     * returned if ShippingType = 2
     *                                     (i.e., calculated shipping rate). */
    private CoreComponentTypes.apis.ebay.AmountType carrierShippingFee;

    private CoreComponentTypes.apis.ebay.AmountType insuranceFee;

    private eBLBaseComponents.apis.ebay.InsuranceOptionCodeType insuranceOption;

    /* Optional fees a seller might assess for the shipping of the
     * item. */
    private CoreComponentTypes.apis.ebay.AmountType packagingHandlingCosts;

    /* Describes any error message associated with the attempt 
     *                                    to calculate shipping rates. If
     * there was no error, returns 
     *                               	  "No Error" (without the quotation
     * marks). */
    private java.lang.String shippingRateErrorMessage;

    /* is unique identified of shipping carrier, without this element
     * the whole node makes no sence */
    private eBLBaseComponents.apis.ebay.ShippingServiceCodeType shippingService;

    public ShippingCarrierDetailsType() {
    }

    public ShippingCarrierDetailsType(
           CoreComponentTypes.apis.ebay.AmountType carrierShippingFee,
           CoreComponentTypes.apis.ebay.AmountType insuranceFee,
           eBLBaseComponents.apis.ebay.InsuranceOptionCodeType insuranceOption,
           CoreComponentTypes.apis.ebay.AmountType packagingHandlingCosts,
           java.lang.String shippingRateErrorMessage,
           eBLBaseComponents.apis.ebay.ShippingServiceCodeType shippingService) {
           this.carrierShippingFee = carrierShippingFee;
           this.insuranceFee = insuranceFee;
           this.insuranceOption = insuranceOption;
           this.packagingHandlingCosts = packagingHandlingCosts;
           this.shippingRateErrorMessage = shippingRateErrorMessage;
           this.shippingService = shippingService;
    }


    /**
     * Gets the carrierShippingFee value for this ShippingCarrierDetailsType.
     * 
     * @return carrierShippingFee   * Calculated cost of shipping, based on shipping parameters and
     * 
     *                                     selected shipping service. Only
     * returned if ShippingType = 2
     *                                     (i.e., calculated shipping rate).
     */
    public CoreComponentTypes.apis.ebay.AmountType getCarrierShippingFee() {
        return carrierShippingFee;
    }


    /**
     * Sets the carrierShippingFee value for this ShippingCarrierDetailsType.
     * 
     * @param carrierShippingFee   * Calculated cost of shipping, based on shipping parameters and
     * 
     *                                     selected shipping service. Only
     * returned if ShippingType = 2
     *                                     (i.e., calculated shipping rate).
     */
    public void setCarrierShippingFee(CoreComponentTypes.apis.ebay.AmountType carrierShippingFee) {
        this.carrierShippingFee = carrierShippingFee;
    }


    /**
     * Gets the insuranceFee value for this ShippingCarrierDetailsType.
     * 
     * @return insuranceFee
     */
    public CoreComponentTypes.apis.ebay.AmountType getInsuranceFee() {
        return insuranceFee;
    }


    /**
     * Sets the insuranceFee value for this ShippingCarrierDetailsType.
     * 
     * @param insuranceFee
     */
    public void setInsuranceFee(CoreComponentTypes.apis.ebay.AmountType insuranceFee) {
        this.insuranceFee = insuranceFee;
    }


    /**
     * Gets the insuranceOption value for this ShippingCarrierDetailsType.
     * 
     * @return insuranceOption
     */
    public eBLBaseComponents.apis.ebay.InsuranceOptionCodeType getInsuranceOption() {
        return insuranceOption;
    }


    /**
     * Sets the insuranceOption value for this ShippingCarrierDetailsType.
     * 
     * @param insuranceOption
     */
    public void setInsuranceOption(eBLBaseComponents.apis.ebay.InsuranceOptionCodeType insuranceOption) {
        this.insuranceOption = insuranceOption;
    }


    /**
     * Gets the packagingHandlingCosts value for this ShippingCarrierDetailsType.
     * 
     * @return packagingHandlingCosts   * Optional fees a seller might assess for the shipping of the
     * item.
     */
    public CoreComponentTypes.apis.ebay.AmountType getPackagingHandlingCosts() {
        return packagingHandlingCosts;
    }


    /**
     * Sets the packagingHandlingCosts value for this ShippingCarrierDetailsType.
     * 
     * @param packagingHandlingCosts   * Optional fees a seller might assess for the shipping of the
     * item.
     */
    public void setPackagingHandlingCosts(CoreComponentTypes.apis.ebay.AmountType packagingHandlingCosts) {
        this.packagingHandlingCosts = packagingHandlingCosts;
    }


    /**
     * Gets the shippingRateErrorMessage value for this ShippingCarrierDetailsType.
     * 
     * @return shippingRateErrorMessage   * Describes any error message associated with the attempt 
     *                                    to calculate shipping rates. If
     * there was no error, returns 
     *                               	  "No Error" (without the quotation
     * marks).
     */
    public java.lang.String getShippingRateErrorMessage() {
        return shippingRateErrorMessage;
    }


    /**
     * Sets the shippingRateErrorMessage value for this ShippingCarrierDetailsType.
     * 
     * @param shippingRateErrorMessage   * Describes any error message associated with the attempt 
     *                                    to calculate shipping rates. If
     * there was no error, returns 
     *                               	  "No Error" (without the quotation
     * marks).
     */
    public void setShippingRateErrorMessage(java.lang.String shippingRateErrorMessage) {
        this.shippingRateErrorMessage = shippingRateErrorMessage;
    }


    /**
     * Gets the shippingService value for this ShippingCarrierDetailsType.
     * 
     * @return shippingService   * is unique identified of shipping carrier, without this element
     * the whole node makes no sence
     */
    public eBLBaseComponents.apis.ebay.ShippingServiceCodeType getShippingService() {
        return shippingService;
    }


    /**
     * Sets the shippingService value for this ShippingCarrierDetailsType.
     * 
     * @param shippingService   * is unique identified of shipping carrier, without this element
     * the whole node makes no sence
     */
    public void setShippingService(eBLBaseComponents.apis.ebay.ShippingServiceCodeType shippingService) {
        this.shippingService = shippingService;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingCarrierDetailsType)) return false;
        ShippingCarrierDetailsType other = (ShippingCarrierDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carrierShippingFee==null && other.getCarrierShippingFee()==null) || 
             (this.carrierShippingFee!=null &&
              this.carrierShippingFee.equals(other.getCarrierShippingFee()))) &&
            ((this.insuranceFee==null && other.getInsuranceFee()==null) || 
             (this.insuranceFee!=null &&
              this.insuranceFee.equals(other.getInsuranceFee()))) &&
            ((this.insuranceOption==null && other.getInsuranceOption()==null) || 
             (this.insuranceOption!=null &&
              this.insuranceOption.equals(other.getInsuranceOption()))) &&
            ((this.packagingHandlingCosts==null && other.getPackagingHandlingCosts()==null) || 
             (this.packagingHandlingCosts!=null &&
              this.packagingHandlingCosts.equals(other.getPackagingHandlingCosts()))) &&
            ((this.shippingRateErrorMessage==null && other.getShippingRateErrorMessage()==null) || 
             (this.shippingRateErrorMessage!=null &&
              this.shippingRateErrorMessage.equals(other.getShippingRateErrorMessage()))) &&
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
        if (getCarrierShippingFee() != null) {
            _hashCode += getCarrierShippingFee().hashCode();
        }
        if (getInsuranceFee() != null) {
            _hashCode += getInsuranceFee().hashCode();
        }
        if (getInsuranceOption() != null) {
            _hashCode += getInsuranceOption().hashCode();
        }
        if (getPackagingHandlingCosts() != null) {
            _hashCode += getPackagingHandlingCosts().hashCode();
        }
        if (getShippingRateErrorMessage() != null) {
            _hashCode += getShippingRateErrorMessage().hashCode();
        }
        if (getShippingService() != null) {
            _hashCode += getShippingService().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingCarrierDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingCarrierDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierShippingFee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CarrierShippingFee"));
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
        elemField.setFieldName("packagingHandlingCosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PackagingHandlingCosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingRateErrorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingRateErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingServiceCodeType"));
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
