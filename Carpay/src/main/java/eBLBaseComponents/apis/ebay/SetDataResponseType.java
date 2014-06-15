/**
 * SetDataResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class SetDataResponseType  implements java.io.Serializable {
    /* If Checkout session was initialized successfully, the corresponding
     * token is returned in this element. */
    private java.lang.String token;

    private eBLBaseComponents.apis.ebay.AddressType[] shippingAddresses;

    private eBLBaseComponents.apis.ebay.ErrorType[] setDataError;

    public SetDataResponseType() {
    }

    public SetDataResponseType(
           java.lang.String token,
           eBLBaseComponents.apis.ebay.AddressType[] shippingAddresses,
           eBLBaseComponents.apis.ebay.ErrorType[] setDataError) {
           this.token = token;
           this.shippingAddresses = shippingAddresses;
           this.setDataError = setDataError;
    }


    /**
     * Gets the token value for this SetDataResponseType.
     * 
     * @return token   * If Checkout session was initialized successfully, the corresponding
     * token is returned in this element.
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this SetDataResponseType.
     * 
     * @param token   * If Checkout session was initialized successfully, the corresponding
     * token is returned in this element.
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the shippingAddresses value for this SetDataResponseType.
     * 
     * @return shippingAddresses
     */
    public eBLBaseComponents.apis.ebay.AddressType[] getShippingAddresses() {
        return shippingAddresses;
    }


    /**
     * Sets the shippingAddresses value for this SetDataResponseType.
     * 
     * @param shippingAddresses
     */
    public void setShippingAddresses(eBLBaseComponents.apis.ebay.AddressType[] shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
    }

    public eBLBaseComponents.apis.ebay.AddressType getShippingAddresses(int i) {
        return this.shippingAddresses[i];
    }

    public void setShippingAddresses(int i, eBLBaseComponents.apis.ebay.AddressType _value) {
        this.shippingAddresses[i] = _value;
    }


    /**
     * Gets the setDataError value for this SetDataResponseType.
     * 
     * @return setDataError
     */
    public eBLBaseComponents.apis.ebay.ErrorType[] getSetDataError() {
        return setDataError;
    }


    /**
     * Sets the setDataError value for this SetDataResponseType.
     * 
     * @param setDataError
     */
    public void setSetDataError(eBLBaseComponents.apis.ebay.ErrorType[] setDataError) {
        this.setDataError = setDataError;
    }

    public eBLBaseComponents.apis.ebay.ErrorType getSetDataError(int i) {
        return this.setDataError[i];
    }

    public void setSetDataError(int i, eBLBaseComponents.apis.ebay.ErrorType _value) {
        this.setDataError[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetDataResponseType)) return false;
        SetDataResponseType other = (SetDataResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.shippingAddresses==null && other.getShippingAddresses()==null) || 
             (this.shippingAddresses!=null &&
              java.util.Arrays.equals(this.shippingAddresses, other.getShippingAddresses()))) &&
            ((this.setDataError==null && other.getSetDataError()==null) || 
             (this.setDataError!=null &&
              java.util.Arrays.equals(this.setDataError, other.getSetDataError())));
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
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getShippingAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSetDataError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSetDataError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSetDataError(), i);
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
        new org.apache.axis.description.TypeDesc(SetDataResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetDataResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setDataError");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetDataError"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
