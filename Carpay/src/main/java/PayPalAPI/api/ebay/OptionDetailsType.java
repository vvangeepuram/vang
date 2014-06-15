/**
 * OptionDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class OptionDetailsType  implements java.io.Serializable {
    /* Option Name. */
    private java.lang.String optionName;

    private PayPalAPI.api.ebay.OptionSelectionDetailsType[] optionSelectionDetails;

    public OptionDetailsType() {
    }

    public OptionDetailsType(
           java.lang.String optionName,
           PayPalAPI.api.ebay.OptionSelectionDetailsType[] optionSelectionDetails) {
           this.optionName = optionName;
           this.optionSelectionDetails = optionSelectionDetails;
    }


    /**
     * Gets the optionName value for this OptionDetailsType.
     * 
     * @return optionName   * Option Name.
     */
    public java.lang.String getOptionName() {
        return optionName;
    }


    /**
     * Sets the optionName value for this OptionDetailsType.
     * 
     * @param optionName   * Option Name.
     */
    public void setOptionName(java.lang.String optionName) {
        this.optionName = optionName;
    }


    /**
     * Gets the optionSelectionDetails value for this OptionDetailsType.
     * 
     * @return optionSelectionDetails
     */
    public PayPalAPI.api.ebay.OptionSelectionDetailsType[] getOptionSelectionDetails() {
        return optionSelectionDetails;
    }


    /**
     * Sets the optionSelectionDetails value for this OptionDetailsType.
     * 
     * @param optionSelectionDetails
     */
    public void setOptionSelectionDetails(PayPalAPI.api.ebay.OptionSelectionDetailsType[] optionSelectionDetails) {
        this.optionSelectionDetails = optionSelectionDetails;
    }

    public PayPalAPI.api.ebay.OptionSelectionDetailsType getOptionSelectionDetails(int i) {
        return this.optionSelectionDetails[i];
    }

    public void setOptionSelectionDetails(int i, PayPalAPI.api.ebay.OptionSelectionDetailsType _value) {
        this.optionSelectionDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OptionDetailsType)) return false;
        OptionDetailsType other = (OptionDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.optionName==null && other.getOptionName()==null) || 
             (this.optionName!=null &&
              this.optionName.equals(other.getOptionName()))) &&
            ((this.optionSelectionDetails==null && other.getOptionSelectionDetails()==null) || 
             (this.optionSelectionDetails!=null &&
              java.util.Arrays.equals(this.optionSelectionDetails, other.getOptionSelectionDetails())));
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
        if (getOptionName() != null) {
            _hashCode += getOptionName().hashCode();
        }
        if (getOptionSelectionDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptionSelectionDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptionSelectionDetails(), i);
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
        new org.apache.axis.description.TypeDesc(OptionDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "OptionDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "OptionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionSelectionDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "OptionSelectionDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "OptionSelectionDetailsType"));
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
