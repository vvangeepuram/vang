/**
 * AmountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CoreComponentTypes.apis.ebay;

public class AmountType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private double _value;

    private eBLBaseComponents.apis.ebay.CurrencyCodeType currencyID;  // attribute

    public AmountType() {
    }

    // Simple Types must have a String constructor
    public AmountType(double _value) {
        this._value = _value;
    }
    public AmountType(java.lang.String _value) {
        this._value = new Double(_value).doubleValue();
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return new Double(_value).toString();
    }


    /**
     * Gets the _value value for this AmountType.
     * 
     * @return _value
     */
    public double get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this AmountType.
     * 
     * @param _value
     */
    public void set_value(double _value) {
        this._value = _value;
    }


    /**
     * Gets the currencyID value for this AmountType.
     * 
     * @return currencyID
     */
    public eBLBaseComponents.apis.ebay.CurrencyCodeType getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this AmountType.
     * 
     * @param currencyID
     */
    public void setCurrencyID(eBLBaseComponents.apis.ebay.CurrencyCodeType currencyID) {
        this.currencyID = currencyID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AmountType)) return false;
        AmountType other = (AmountType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._value == other.get_value() &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID())));
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
        _hashCode += new Double(get_value()).hashCode();
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AmountType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("currencyID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "currencyID"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CurrencyCodeType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
