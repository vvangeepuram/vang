/**
 * CalculatedShippingRateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class CalculatedShippingRateType  implements java.io.Serializable {
    /* Potal/zip code from where package will be shipped. */
    private java.lang.String originatingPostalCode;

    /* Indicates an item that cannot go through the stamping machine
     * 
     *                               	  at the shipping service office (a
     * value of True) and requires 
     *                               	  special or fragile handling. Only
     * returned if ShippingType = 2. */
    private java.lang.Boolean shippingIrregular;

    /* contains information about shipping fees per each shipping
     * service chosen by the seller */
    private eBLBaseComponents.apis.ebay.ShippingCarrierDetailsType[] carrierDetails;

    /* May need to be moved into details - wait for George! The size
     * of the package to be shipped. Possible values are:
     *     					  None
     *     					  Letter
     *     					  Large envelope
     *     					  USPS flat rate envelope
     *    	 				  Package/thick envelope
     *     					  USPS large package/oversize 1
     *     					  Very large package/oversize 2
     *     					  UPS Letter */
    private eBLBaseComponents.apis.ebay.ShippingPackageCodeType shippingPackage;

    /* Shipping weight unit of measure (major). If unit of weight
     * is kilogram 
     *                               	  (i.e., metric system) this would
     * be the exact weight value in kilogram 
     *                               	  (i.e., complete decimal number, e.g.,
     * 2.23 kg). Only returned if 
     *                               	  ShippingType is 2. */
    private CoreComponentTypes.apis.ebay.MeasureType weightMajor;

    /* Shipping weight unit of measure (minor). If unit of weight
     * is  in pounds and/or
     *                               	  ounces, this would be the exact weight
     * value in ounces (i.e., complete 
     *                               	  decimal number, e.g., 8.2 or 8.0
     * ounces). Only returned if ShippingType is 2. */
    private CoreComponentTypes.apis.ebay.MeasureType weightMinor;

    public CalculatedShippingRateType() {
    }

    public CalculatedShippingRateType(
           java.lang.String originatingPostalCode,
           java.lang.Boolean shippingIrregular,
           eBLBaseComponents.apis.ebay.ShippingCarrierDetailsType[] carrierDetails,
           eBLBaseComponents.apis.ebay.ShippingPackageCodeType shippingPackage,
           CoreComponentTypes.apis.ebay.MeasureType weightMajor,
           CoreComponentTypes.apis.ebay.MeasureType weightMinor) {
           this.originatingPostalCode = originatingPostalCode;
           this.shippingIrregular = shippingIrregular;
           this.carrierDetails = carrierDetails;
           this.shippingPackage = shippingPackage;
           this.weightMajor = weightMajor;
           this.weightMinor = weightMinor;
    }


    /**
     * Gets the originatingPostalCode value for this CalculatedShippingRateType.
     * 
     * @return originatingPostalCode   * Potal/zip code from where package will be shipped.
     */
    public java.lang.String getOriginatingPostalCode() {
        return originatingPostalCode;
    }


    /**
     * Sets the originatingPostalCode value for this CalculatedShippingRateType.
     * 
     * @param originatingPostalCode   * Potal/zip code from where package will be shipped.
     */
    public void setOriginatingPostalCode(java.lang.String originatingPostalCode) {
        this.originatingPostalCode = originatingPostalCode;
    }


    /**
     * Gets the shippingIrregular value for this CalculatedShippingRateType.
     * 
     * @return shippingIrregular   * Indicates an item that cannot go through the stamping machine
     * 
     *                               	  at the shipping service office (a
     * value of True) and requires 
     *                               	  special or fragile handling. Only
     * returned if ShippingType = 2.
     */
    public java.lang.Boolean getShippingIrregular() {
        return shippingIrregular;
    }


    /**
     * Sets the shippingIrregular value for this CalculatedShippingRateType.
     * 
     * @param shippingIrregular   * Indicates an item that cannot go through the stamping machine
     * 
     *                               	  at the shipping service office (a
     * value of True) and requires 
     *                               	  special or fragile handling. Only
     * returned if ShippingType = 2.
     */
    public void setShippingIrregular(java.lang.Boolean shippingIrregular) {
        this.shippingIrregular = shippingIrregular;
    }


    /**
     * Gets the carrierDetails value for this CalculatedShippingRateType.
     * 
     * @return carrierDetails   * contains information about shipping fees per each shipping
     * service chosen by the seller
     */
    public eBLBaseComponents.apis.ebay.ShippingCarrierDetailsType[] getCarrierDetails() {
        return carrierDetails;
    }


    /**
     * Sets the carrierDetails value for this CalculatedShippingRateType.
     * 
     * @param carrierDetails   * contains information about shipping fees per each shipping
     * service chosen by the seller
     */
    public void setCarrierDetails(eBLBaseComponents.apis.ebay.ShippingCarrierDetailsType[] carrierDetails) {
        this.carrierDetails = carrierDetails;
    }

    public eBLBaseComponents.apis.ebay.ShippingCarrierDetailsType getCarrierDetails(int i) {
        return this.carrierDetails[i];
    }

    public void setCarrierDetails(int i, eBLBaseComponents.apis.ebay.ShippingCarrierDetailsType _value) {
        this.carrierDetails[i] = _value;
    }


    /**
     * Gets the shippingPackage value for this CalculatedShippingRateType.
     * 
     * @return shippingPackage   * May need to be moved into details - wait for George! The size
     * of the package to be shipped. Possible values are:
     *     					  None
     *     					  Letter
     *     					  Large envelope
     *     					  USPS flat rate envelope
     *    	 				  Package/thick envelope
     *     					  USPS large package/oversize 1
     *     					  Very large package/oversize 2
     *     					  UPS Letter
     */
    public eBLBaseComponents.apis.ebay.ShippingPackageCodeType getShippingPackage() {
        return shippingPackage;
    }


    /**
     * Sets the shippingPackage value for this CalculatedShippingRateType.
     * 
     * @param shippingPackage   * May need to be moved into details - wait for George! The size
     * of the package to be shipped. Possible values are:
     *     					  None
     *     					  Letter
     *     					  Large envelope
     *     					  USPS flat rate envelope
     *    	 				  Package/thick envelope
     *     					  USPS large package/oversize 1
     *     					  Very large package/oversize 2
     *     					  UPS Letter
     */
    public void setShippingPackage(eBLBaseComponents.apis.ebay.ShippingPackageCodeType shippingPackage) {
        this.shippingPackage = shippingPackage;
    }


    /**
     * Gets the weightMajor value for this CalculatedShippingRateType.
     * 
     * @return weightMajor   * Shipping weight unit of measure (major). If unit of weight
     * is kilogram 
     *                               	  (i.e., metric system) this would
     * be the exact weight value in kilogram 
     *                               	  (i.e., complete decimal number, e.g.,
     * 2.23 kg). Only returned if 
     *                               	  ShippingType is 2.
     */
    public CoreComponentTypes.apis.ebay.MeasureType getWeightMajor() {
        return weightMajor;
    }


    /**
     * Sets the weightMajor value for this CalculatedShippingRateType.
     * 
     * @param weightMajor   * Shipping weight unit of measure (major). If unit of weight
     * is kilogram 
     *                               	  (i.e., metric system) this would
     * be the exact weight value in kilogram 
     *                               	  (i.e., complete decimal number, e.g.,
     * 2.23 kg). Only returned if 
     *                               	  ShippingType is 2.
     */
    public void setWeightMajor(CoreComponentTypes.apis.ebay.MeasureType weightMajor) {
        this.weightMajor = weightMajor;
    }


    /**
     * Gets the weightMinor value for this CalculatedShippingRateType.
     * 
     * @return weightMinor   * Shipping weight unit of measure (minor). If unit of weight
     * is  in pounds and/or
     *                               	  ounces, this would be the exact weight
     * value in ounces (i.e., complete 
     *                               	  decimal number, e.g., 8.2 or 8.0
     * ounces). Only returned if ShippingType is 2.
     */
    public CoreComponentTypes.apis.ebay.MeasureType getWeightMinor() {
        return weightMinor;
    }


    /**
     * Sets the weightMinor value for this CalculatedShippingRateType.
     * 
     * @param weightMinor   * Shipping weight unit of measure (minor). If unit of weight
     * is  in pounds and/or
     *                               	  ounces, this would be the exact weight
     * value in ounces (i.e., complete 
     *                               	  decimal number, e.g., 8.2 or 8.0
     * ounces). Only returned if ShippingType is 2.
     */
    public void setWeightMinor(CoreComponentTypes.apis.ebay.MeasureType weightMinor) {
        this.weightMinor = weightMinor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalculatedShippingRateType)) return false;
        CalculatedShippingRateType other = (CalculatedShippingRateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originatingPostalCode==null && other.getOriginatingPostalCode()==null) || 
             (this.originatingPostalCode!=null &&
              this.originatingPostalCode.equals(other.getOriginatingPostalCode()))) &&
            ((this.shippingIrregular==null && other.getShippingIrregular()==null) || 
             (this.shippingIrregular!=null &&
              this.shippingIrregular.equals(other.getShippingIrregular()))) &&
            ((this.carrierDetails==null && other.getCarrierDetails()==null) || 
             (this.carrierDetails!=null &&
              java.util.Arrays.equals(this.carrierDetails, other.getCarrierDetails()))) &&
            ((this.shippingPackage==null && other.getShippingPackage()==null) || 
             (this.shippingPackage!=null &&
              this.shippingPackage.equals(other.getShippingPackage()))) &&
            ((this.weightMajor==null && other.getWeightMajor()==null) || 
             (this.weightMajor!=null &&
              this.weightMajor.equals(other.getWeightMajor()))) &&
            ((this.weightMinor==null && other.getWeightMinor()==null) || 
             (this.weightMinor!=null &&
              this.weightMinor.equals(other.getWeightMinor())));
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
        if (getOriginatingPostalCode() != null) {
            _hashCode += getOriginatingPostalCode().hashCode();
        }
        if (getShippingIrregular() != null) {
            _hashCode += getShippingIrregular().hashCode();
        }
        if (getCarrierDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarrierDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarrierDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShippingPackage() != null) {
            _hashCode += getShippingPackage().hashCode();
        }
        if (getWeightMajor() != null) {
            _hashCode += getWeightMajor().hashCode();
        }
        if (getWeightMinor() != null) {
            _hashCode += getWeightMinor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalculatedShippingRateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CalculatedShippingRateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OriginatingPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingIrregular");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingIrregular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CarrierDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingCarrierDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingPackageCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightMajor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "WeightMajor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "MeasureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightMinor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "WeightMinor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "MeasureType"));
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
