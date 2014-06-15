/**
 * SetAuthFlowParamReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class SetAuthFlowParamReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.SetAuthFlowParamRequestType setAuthFlowParamRequest;

    public SetAuthFlowParamReq() {
    }

    public SetAuthFlowParamReq(
           PayPalAPI.api.ebay.SetAuthFlowParamRequestType setAuthFlowParamRequest) {
           this.setAuthFlowParamRequest = setAuthFlowParamRequest;
    }


    /**
     * Gets the setAuthFlowParamRequest value for this SetAuthFlowParamReq.
     * 
     * @return setAuthFlowParamRequest
     */
    public PayPalAPI.api.ebay.SetAuthFlowParamRequestType getSetAuthFlowParamRequest() {
        return setAuthFlowParamRequest;
    }


    /**
     * Sets the setAuthFlowParamRequest value for this SetAuthFlowParamReq.
     * 
     * @param setAuthFlowParamRequest
     */
    public void setSetAuthFlowParamRequest(PayPalAPI.api.ebay.SetAuthFlowParamRequestType setAuthFlowParamRequest) {
        this.setAuthFlowParamRequest = setAuthFlowParamRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetAuthFlowParamReq)) return false;
        SetAuthFlowParamReq other = (SetAuthFlowParamReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setAuthFlowParamRequest==null && other.getSetAuthFlowParamRequest()==null) || 
             (this.setAuthFlowParamRequest!=null &&
              this.setAuthFlowParamRequest.equals(other.getSetAuthFlowParamRequest())));
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
        if (getSetAuthFlowParamRequest() != null) {
            _hashCode += getSetAuthFlowParamRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetAuthFlowParamReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">SetAuthFlowParamReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setAuthFlowParamRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetAuthFlowParamRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetAuthFlowParamRequestType"));
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
