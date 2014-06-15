/**
 * FaultDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class FaultDetailsType  implements java.io.Serializable {
    /* Error code can be used by a receiving application to debugging
     * a SOAP response 
     * 		       		message that contain one or more SOAP Fault detail objects,
     * i.e., fault detail sub-elements. 
     * 		       		These codes will need to be uniquely defined for each fault
     * scenario. */
    private java.lang.String errorCode;

    /* Severity indicates whether the error is a serious fault
     * 		                   or if it is informational error, i.e., warning. */
    private java.lang.String severity;

    private java.lang.String detailedMessage;

    public FaultDetailsType() {
    }

    public FaultDetailsType(
           java.lang.String errorCode,
           java.lang.String severity,
           java.lang.String detailedMessage) {
           this.errorCode = errorCode;
           this.severity = severity;
           this.detailedMessage = detailedMessage;
    }


    /**
     * Gets the errorCode value for this FaultDetailsType.
     * 
     * @return errorCode   * Error code can be used by a receiving application to debugging
     * a SOAP response 
     * 		       		message that contain one or more SOAP Fault detail objects,
     * i.e., fault detail sub-elements. 
     * 		       		These codes will need to be uniquely defined for each fault
     * scenario.
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this FaultDetailsType.
     * 
     * @param errorCode   * Error code can be used by a receiving application to debugging
     * a SOAP response 
     * 		       		message that contain one or more SOAP Fault detail objects,
     * i.e., fault detail sub-elements. 
     * 		       		These codes will need to be uniquely defined for each fault
     * scenario.
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the severity value for this FaultDetailsType.
     * 
     * @return severity   * Severity indicates whether the error is a serious fault
     * 		                   or if it is informational error, i.e., warning.
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this FaultDetailsType.
     * 
     * @param severity   * Severity indicates whether the error is a serious fault
     * 		                   or if it is informational error, i.e., warning.
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }


    /**
     * Gets the detailedMessage value for this FaultDetailsType.
     * 
     * @return detailedMessage
     */
    public java.lang.String getDetailedMessage() {
        return detailedMessage;
    }


    /**
     * Sets the detailedMessage value for this FaultDetailsType.
     * 
     * @param detailedMessage
     */
    public void setDetailedMessage(java.lang.String detailedMessage) {
        this.detailedMessage = detailedMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FaultDetailsType)) return false;
        FaultDetailsType other = (FaultDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.detailedMessage==null && other.getDetailedMessage()==null) || 
             (this.detailedMessage!=null &&
              this.detailedMessage.equals(other.getDetailedMessage())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getDetailedMessage() != null) {
            _hashCode += getDetailedMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FaultDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FaultDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailedMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DetailedMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
