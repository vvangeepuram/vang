/**
 * OptionSelectionDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class OptionSelectionDetailsType  implements java.io.Serializable {
    /* Option Selection.
     * 								
     * 								
     * 								
     * 								Character length and limitations: 12 single-byte alphanumeric
     * characters */
    private java.lang.String optionSelection;

    /* Option Price. */
    private java.lang.String price;

    /* Option Type */
    private eBLBaseComponents.apis.ebay.OptionTypeListType optionType;

    private PayPalAPI.api.ebay.InstallmentDetailsType[] paymentPeriod;

    public OptionSelectionDetailsType() {
    }

    public OptionSelectionDetailsType(
           java.lang.String optionSelection,
           java.lang.String price,
           eBLBaseComponents.apis.ebay.OptionTypeListType optionType,
           PayPalAPI.api.ebay.InstallmentDetailsType[] paymentPeriod) {
           this.optionSelection = optionSelection;
           this.price = price;
           this.optionType = optionType;
           this.paymentPeriod = paymentPeriod;
    }


    /**
     * Gets the optionSelection value for this OptionSelectionDetailsType.
     * 
     * @return optionSelection   * Option Selection.
     * 								
     * 								
     * 								
     * 								Character length and limitations: 12 single-byte alphanumeric
     * characters
     */
    public java.lang.String getOptionSelection() {
        return optionSelection;
    }


    /**
     * Sets the optionSelection value for this OptionSelectionDetailsType.
     * 
     * @param optionSelection   * Option Selection.
     * 								
     * 								
     * 								
     * 								Character length and limitations: 12 single-byte alphanumeric
     * characters
     */
    public void setOptionSelection(java.lang.String optionSelection) {
        this.optionSelection = optionSelection;
    }


    /**
     * Gets the price value for this OptionSelectionDetailsType.
     * 
     * @return price   * Option Price.
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this OptionSelectionDetailsType.
     * 
     * @param price   * Option Price.
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the optionType value for this OptionSelectionDetailsType.
     * 
     * @return optionType   * Option Type
     */
    public eBLBaseComponents.apis.ebay.OptionTypeListType getOptionType() {
        return optionType;
    }


    /**
     * Sets the optionType value for this OptionSelectionDetailsType.
     * 
     * @param optionType   * Option Type
     */
    public void setOptionType(eBLBaseComponents.apis.ebay.OptionTypeListType optionType) {
        this.optionType = optionType;
    }


    /**
     * Gets the paymentPeriod value for this OptionSelectionDetailsType.
     * 
     * @return paymentPeriod
     */
    public PayPalAPI.api.ebay.InstallmentDetailsType[] getPaymentPeriod() {
        return paymentPeriod;
    }


    /**
     * Sets the paymentPeriod value for this OptionSelectionDetailsType.
     * 
     * @param paymentPeriod
     */
    public void setPaymentPeriod(PayPalAPI.api.ebay.InstallmentDetailsType[] paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public PayPalAPI.api.ebay.InstallmentDetailsType getPaymentPeriod(int i) {
        return this.paymentPeriod[i];
    }

    public void setPaymentPeriod(int i, PayPalAPI.api.ebay.InstallmentDetailsType _value) {
        this.paymentPeriod[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OptionSelectionDetailsType)) return false;
        OptionSelectionDetailsType other = (OptionSelectionDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.optionSelection==null && other.getOptionSelection()==null) || 
             (this.optionSelection!=null &&
              this.optionSelection.equals(other.getOptionSelection()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.optionType==null && other.getOptionType()==null) || 
             (this.optionType!=null &&
              this.optionType.equals(other.getOptionType()))) &&
            ((this.paymentPeriod==null && other.getPaymentPeriod()==null) || 
             (this.paymentPeriod!=null &&
              java.util.Arrays.equals(this.paymentPeriod, other.getPaymentPeriod())));
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
        if (getOptionSelection() != null) {
            _hashCode += getOptionSelection().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getOptionType() != null) {
            _hashCode += getOptionType().hashCode();
        }
        if (getPaymentPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentPeriod(), i);
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
        new org.apache.axis.description.TypeDesc(OptionSelectionDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "OptionSelectionDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionSelection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "OptionSelection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "OptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionTypeListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "PaymentPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "InstallmentDetailsType"));
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
