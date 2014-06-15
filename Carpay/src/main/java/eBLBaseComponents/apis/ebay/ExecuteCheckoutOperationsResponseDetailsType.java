/**
 * ExecuteCheckoutOperationsResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ExecuteCheckoutOperationsResponseDetailsType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.SetDataResponseType setDataResponse;

    private eBLBaseComponents.apis.ebay.AuthorizationResponseType authorizationResponse;

    public ExecuteCheckoutOperationsResponseDetailsType() {
    }

    public ExecuteCheckoutOperationsResponseDetailsType(
           eBLBaseComponents.apis.ebay.SetDataResponseType setDataResponse,
           eBLBaseComponents.apis.ebay.AuthorizationResponseType authorizationResponse) {
           this.setDataResponse = setDataResponse;
           this.authorizationResponse = authorizationResponse;
    }


    /**
     * Gets the setDataResponse value for this ExecuteCheckoutOperationsResponseDetailsType.
     * 
     * @return setDataResponse
     */
    public eBLBaseComponents.apis.ebay.SetDataResponseType getSetDataResponse() {
        return setDataResponse;
    }


    /**
     * Sets the setDataResponse value for this ExecuteCheckoutOperationsResponseDetailsType.
     * 
     * @param setDataResponse
     */
    public void setSetDataResponse(eBLBaseComponents.apis.ebay.SetDataResponseType setDataResponse) {
        this.setDataResponse = setDataResponse;
    }


    /**
     * Gets the authorizationResponse value for this ExecuteCheckoutOperationsResponseDetailsType.
     * 
     * @return authorizationResponse
     */
    public eBLBaseComponents.apis.ebay.AuthorizationResponseType getAuthorizationResponse() {
        return authorizationResponse;
    }


    /**
     * Sets the authorizationResponse value for this ExecuteCheckoutOperationsResponseDetailsType.
     * 
     * @param authorizationResponse
     */
    public void setAuthorizationResponse(eBLBaseComponents.apis.ebay.AuthorizationResponseType authorizationResponse) {
        this.authorizationResponse = authorizationResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteCheckoutOperationsResponseDetailsType)) return false;
        ExecuteCheckoutOperationsResponseDetailsType other = (ExecuteCheckoutOperationsResponseDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setDataResponse==null && other.getSetDataResponse()==null) || 
             (this.setDataResponse!=null &&
              this.setDataResponse.equals(other.getSetDataResponse()))) &&
            ((this.authorizationResponse==null && other.getAuthorizationResponse()==null) || 
             (this.authorizationResponse!=null &&
              this.authorizationResponse.equals(other.getAuthorizationResponse())));
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
        if (getSetDataResponse() != null) {
            _hashCode += getSetDataResponse().hashCode();
        }
        if (getAuthorizationResponse() != null) {
            _hashCode += getAuthorizationResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecuteCheckoutOperationsResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExecuteCheckoutOperationsResponseDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setDataResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetDataResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetDataResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationResponseType"));
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
