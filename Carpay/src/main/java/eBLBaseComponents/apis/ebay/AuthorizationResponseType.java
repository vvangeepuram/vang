/**
 * AuthorizationResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class AuthorizationResponseType  implements java.io.Serializable {
    /* Status will denote whether Auto authorization was successful
     * or not. */
    private eBLBaseComponents.apis.ebay.AckCodeType status;

    private eBLBaseComponents.apis.ebay.ErrorType[] authorizationError;

    public AuthorizationResponseType() {
    }

    public AuthorizationResponseType(
           eBLBaseComponents.apis.ebay.AckCodeType status,
           eBLBaseComponents.apis.ebay.ErrorType[] authorizationError) {
           this.status = status;
           this.authorizationError = authorizationError;
    }


    /**
     * Gets the status value for this AuthorizationResponseType.
     * 
     * @return status   * Status will denote whether Auto authorization was successful
     * or not.
     */
    public eBLBaseComponents.apis.ebay.AckCodeType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AuthorizationResponseType.
     * 
     * @param status   * Status will denote whether Auto authorization was successful
     * or not.
     */
    public void setStatus(eBLBaseComponents.apis.ebay.AckCodeType status) {
        this.status = status;
    }


    /**
     * Gets the authorizationError value for this AuthorizationResponseType.
     * 
     * @return authorizationError
     */
    public eBLBaseComponents.apis.ebay.ErrorType[] getAuthorizationError() {
        return authorizationError;
    }


    /**
     * Sets the authorizationError value for this AuthorizationResponseType.
     * 
     * @param authorizationError
     */
    public void setAuthorizationError(eBLBaseComponents.apis.ebay.ErrorType[] authorizationError) {
        this.authorizationError = authorizationError;
    }

    public eBLBaseComponents.apis.ebay.ErrorType getAuthorizationError(int i) {
        return this.authorizationError[i];
    }

    public void setAuthorizationError(int i, eBLBaseComponents.apis.ebay.ErrorType _value) {
        this.authorizationError[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthorizationResponseType)) return false;
        AuthorizationResponseType other = (AuthorizationResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.authorizationError==null && other.getAuthorizationError()==null) || 
             (this.authorizationError!=null &&
              java.util.Arrays.equals(this.authorizationError, other.getAuthorizationError())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAuthorizationError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorizationError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorizationError(), i);
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
        new org.apache.axis.description.TypeDesc(AuthorizationResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AckCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationError");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationError"));
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
