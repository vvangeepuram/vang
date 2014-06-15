/**
 * IncentiveRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class IncentiveRequestDetailsType  implements java.io.Serializable {
    private java.lang.String requestId;

    private eBLBaseComponents.apis.ebay.IncentiveRequestCodeType requestType;

    private eBLBaseComponents.apis.ebay.IncentiveRequestDetailLevelCodeType requestDetailLevel;

    public IncentiveRequestDetailsType() {
    }

    public IncentiveRequestDetailsType(
           java.lang.String requestId,
           eBLBaseComponents.apis.ebay.IncentiveRequestCodeType requestType,
           eBLBaseComponents.apis.ebay.IncentiveRequestDetailLevelCodeType requestDetailLevel) {
           this.requestId = requestId;
           this.requestType = requestType;
           this.requestDetailLevel = requestDetailLevel;
    }


    /**
     * Gets the requestId value for this IncentiveRequestDetailsType.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this IncentiveRequestDetailsType.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the requestType value for this IncentiveRequestDetailsType.
     * 
     * @return requestType
     */
    public eBLBaseComponents.apis.ebay.IncentiveRequestCodeType getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this IncentiveRequestDetailsType.
     * 
     * @param requestType
     */
    public void setRequestType(eBLBaseComponents.apis.ebay.IncentiveRequestCodeType requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the requestDetailLevel value for this IncentiveRequestDetailsType.
     * 
     * @return requestDetailLevel
     */
    public eBLBaseComponents.apis.ebay.IncentiveRequestDetailLevelCodeType getRequestDetailLevel() {
        return requestDetailLevel;
    }


    /**
     * Sets the requestDetailLevel value for this IncentiveRequestDetailsType.
     * 
     * @param requestDetailLevel
     */
    public void setRequestDetailLevel(eBLBaseComponents.apis.ebay.IncentiveRequestDetailLevelCodeType requestDetailLevel) {
        this.requestDetailLevel = requestDetailLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncentiveRequestDetailsType)) return false;
        IncentiveRequestDetailsType other = (IncentiveRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.requestDetailLevel==null && other.getRequestDetailLevel()==null) || 
             (this.requestDetailLevel!=null &&
              this.requestDetailLevel.equals(other.getRequestDetailLevel())));
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
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getRequestDetailLevel() != null) {
            _hashCode += getRequestDetailLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IncentiveRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveRequestCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestDetailLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RequestDetailLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveRequestDetailLevelCodeType"));
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
