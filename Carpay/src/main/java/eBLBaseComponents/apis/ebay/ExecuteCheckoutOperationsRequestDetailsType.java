/**
 * ExecuteCheckoutOperationsRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ExecuteCheckoutOperationsRequestDetailsType  implements java.io.Serializable {
    /* On your first invocation of ExecuteCheckoutOperationsRequest,
     * the value of this token is returned by ExecuteCheckoutOperationsResponse.
     * 						
     * 						
     * 						Optional
     * 						
     * 						
     * 						Include this element and its value only if you want to modify
     * an existing checkout session with another invocation of ExecuteCheckoutOperationsRequest;
     * for example, if you want the customer to edit his shipping address
     * on PayPal.
     * 						
     * 						
     * 						Character length and limitations: 20 single-byte characters */
    private java.lang.String token;

    /* All the Data required to initiate the checkout session is passed
     * in this element. */
    private eBLBaseComponents.apis.ebay.SetDataRequestType setDataRequest;

    /* If auto authorization is required, this should be passed in
     * with IsRequested set to yes. */
    private eBLBaseComponents.apis.ebay.AuthorizationRequestType authorizationRequest;

    public ExecuteCheckoutOperationsRequestDetailsType() {
    }

    public ExecuteCheckoutOperationsRequestDetailsType(
           java.lang.String token,
           eBLBaseComponents.apis.ebay.SetDataRequestType setDataRequest,
           eBLBaseComponents.apis.ebay.AuthorizationRequestType authorizationRequest) {
           this.token = token;
           this.setDataRequest = setDataRequest;
           this.authorizationRequest = authorizationRequest;
    }


    /**
     * Gets the token value for this ExecuteCheckoutOperationsRequestDetailsType.
     * 
     * @return token   * On your first invocation of ExecuteCheckoutOperationsRequest,
     * the value of this token is returned by ExecuteCheckoutOperationsResponse.
     * 						
     * 						
     * 						Optional
     * 						
     * 						
     * 						Include this element and its value only if you want to modify
     * an existing checkout session with another invocation of ExecuteCheckoutOperationsRequest;
     * for example, if you want the customer to edit his shipping address
     * on PayPal.
     * 						
     * 						
     * 						Character length and limitations: 20 single-byte characters
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this ExecuteCheckoutOperationsRequestDetailsType.
     * 
     * @param token   * On your first invocation of ExecuteCheckoutOperationsRequest,
     * the value of this token is returned by ExecuteCheckoutOperationsResponse.
     * 						
     * 						
     * 						Optional
     * 						
     * 						
     * 						Include this element and its value only if you want to modify
     * an existing checkout session with another invocation of ExecuteCheckoutOperationsRequest;
     * for example, if you want the customer to edit his shipping address
     * on PayPal.
     * 						
     * 						
     * 						Character length and limitations: 20 single-byte characters
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the setDataRequest value for this ExecuteCheckoutOperationsRequestDetailsType.
     * 
     * @return setDataRequest   * All the Data required to initiate the checkout session is passed
     * in this element.
     */
    public eBLBaseComponents.apis.ebay.SetDataRequestType getSetDataRequest() {
        return setDataRequest;
    }


    /**
     * Sets the setDataRequest value for this ExecuteCheckoutOperationsRequestDetailsType.
     * 
     * @param setDataRequest   * All the Data required to initiate the checkout session is passed
     * in this element.
     */
    public void setSetDataRequest(eBLBaseComponents.apis.ebay.SetDataRequestType setDataRequest) {
        this.setDataRequest = setDataRequest;
    }


    /**
     * Gets the authorizationRequest value for this ExecuteCheckoutOperationsRequestDetailsType.
     * 
     * @return authorizationRequest   * If auto authorization is required, this should be passed in
     * with IsRequested set to yes.
     */
    public eBLBaseComponents.apis.ebay.AuthorizationRequestType getAuthorizationRequest() {
        return authorizationRequest;
    }


    /**
     * Sets the authorizationRequest value for this ExecuteCheckoutOperationsRequestDetailsType.
     * 
     * @param authorizationRequest   * If auto authorization is required, this should be passed in
     * with IsRequested set to yes.
     */
    public void setAuthorizationRequest(eBLBaseComponents.apis.ebay.AuthorizationRequestType authorizationRequest) {
        this.authorizationRequest = authorizationRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteCheckoutOperationsRequestDetailsType)) return false;
        ExecuteCheckoutOperationsRequestDetailsType other = (ExecuteCheckoutOperationsRequestDetailsType) obj;
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
            ((this.setDataRequest==null && other.getSetDataRequest()==null) || 
             (this.setDataRequest!=null &&
              this.setDataRequest.equals(other.getSetDataRequest()))) &&
            ((this.authorizationRequest==null && other.getAuthorizationRequest()==null) || 
             (this.authorizationRequest!=null &&
              this.authorizationRequest.equals(other.getAuthorizationRequest())));
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
        if (getSetDataRequest() != null) {
            _hashCode += getSetDataRequest().hashCode();
        }
        if (getAuthorizationRequest() != null) {
            _hashCode += getAuthorizationRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecuteCheckoutOperationsRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExecuteCheckoutOperationsRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setDataRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetDataRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetDataRequestType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationRequestType"));
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
