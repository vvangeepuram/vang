/**
 * ErrorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ErrorType  implements java.io.Serializable {
    private java.lang.String shortMessage;

    private java.lang.String longMessage;

    /* Error code can be used by a receiving application to debugging
     * a response 
     * 		       		message. These codes will need to be uniquely defined for
     * each application. */
    private org.apache.axis.types.Token errorCode;

    /* SeverityCode indicates whether the error is an application
     * 		                   level error or if it is informational error,
     * i.e., warning. */
    private eBLBaseComponents.apis.ebay.SeverityCodeType severityCode;

    /* This optional element may carry additional application-specific
     * error variables 
     * 		                   that indicate specific information about the
     * error condition particularly in the 
     * 		                   cases where there are multiple instances of the
     * ErrorType which require 
     * 		                   additional context. */
    private eBLBaseComponents.apis.ebay.ErrorParameterType[] errorParameters;

    public ErrorType() {
    }

    public ErrorType(
           java.lang.String shortMessage,
           java.lang.String longMessage,
           org.apache.axis.types.Token errorCode,
           eBLBaseComponents.apis.ebay.SeverityCodeType severityCode,
           eBLBaseComponents.apis.ebay.ErrorParameterType[] errorParameters) {
           this.shortMessage = shortMessage;
           this.longMessage = longMessage;
           this.errorCode = errorCode;
           this.severityCode = severityCode;
           this.errorParameters = errorParameters;
    }


    /**
     * Gets the shortMessage value for this ErrorType.
     * 
     * @return shortMessage
     */
    public java.lang.String getShortMessage() {
        return shortMessage;
    }


    /**
     * Sets the shortMessage value for this ErrorType.
     * 
     * @param shortMessage
     */
    public void setShortMessage(java.lang.String shortMessage) {
        this.shortMessage = shortMessage;
    }


    /**
     * Gets the longMessage value for this ErrorType.
     * 
     * @return longMessage
     */
    public java.lang.String getLongMessage() {
        return longMessage;
    }


    /**
     * Sets the longMessage value for this ErrorType.
     * 
     * @param longMessage
     */
    public void setLongMessage(java.lang.String longMessage) {
        this.longMessage = longMessage;
    }


    /**
     * Gets the errorCode value for this ErrorType.
     * 
     * @return errorCode   * Error code can be used by a receiving application to debugging
     * a response 
     * 		       		message. These codes will need to be uniquely defined for
     * each application.
     */
    public org.apache.axis.types.Token getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ErrorType.
     * 
     * @param errorCode   * Error code can be used by a receiving application to debugging
     * a response 
     * 		       		message. These codes will need to be uniquely defined for
     * each application.
     */
    public void setErrorCode(org.apache.axis.types.Token errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the severityCode value for this ErrorType.
     * 
     * @return severityCode   * SeverityCode indicates whether the error is an application
     * 		                   level error or if it is informational error,
     * i.e., warning.
     */
    public eBLBaseComponents.apis.ebay.SeverityCodeType getSeverityCode() {
        return severityCode;
    }


    /**
     * Sets the severityCode value for this ErrorType.
     * 
     * @param severityCode   * SeverityCode indicates whether the error is an application
     * 		                   level error or if it is informational error,
     * i.e., warning.
     */
    public void setSeverityCode(eBLBaseComponents.apis.ebay.SeverityCodeType severityCode) {
        this.severityCode = severityCode;
    }


    /**
     * Gets the errorParameters value for this ErrorType.
     * 
     * @return errorParameters   * This optional element may carry additional application-specific
     * error variables 
     * 		                   that indicate specific information about the
     * error condition particularly in the 
     * 		                   cases where there are multiple instances of the
     * ErrorType which require 
     * 		                   additional context.
     */
    public eBLBaseComponents.apis.ebay.ErrorParameterType[] getErrorParameters() {
        return errorParameters;
    }


    /**
     * Sets the errorParameters value for this ErrorType.
     * 
     * @param errorParameters   * This optional element may carry additional application-specific
     * error variables 
     * 		                   that indicate specific information about the
     * error condition particularly in the 
     * 		                   cases where there are multiple instances of the
     * ErrorType which require 
     * 		                   additional context.
     */
    public void setErrorParameters(eBLBaseComponents.apis.ebay.ErrorParameterType[] errorParameters) {
        this.errorParameters = errorParameters;
    }

    public eBLBaseComponents.apis.ebay.ErrorParameterType getErrorParameters(int i) {
        return this.errorParameters[i];
    }

    public void setErrorParameters(int i, eBLBaseComponents.apis.ebay.ErrorParameterType _value) {
        this.errorParameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorType)) return false;
        ErrorType other = (ErrorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shortMessage==null && other.getShortMessage()==null) || 
             (this.shortMessage!=null &&
              this.shortMessage.equals(other.getShortMessage()))) &&
            ((this.longMessage==null && other.getLongMessage()==null) || 
             (this.longMessage!=null &&
              this.longMessage.equals(other.getLongMessage()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.severityCode==null && other.getSeverityCode()==null) || 
             (this.severityCode!=null &&
              this.severityCode.equals(other.getSeverityCode()))) &&
            ((this.errorParameters==null && other.getErrorParameters()==null) || 
             (this.errorParameters!=null &&
              java.util.Arrays.equals(this.errorParameters, other.getErrorParameters())));
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
        if (getShortMessage() != null) {
            _hashCode += getShortMessage().hashCode();
        }
        if (getLongMessage() != null) {
            _hashCode += getLongMessage().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getSeverityCode() != null) {
            _hashCode += getSeverityCode().hashCode();
        }
        if (getErrorParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrorParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrorParameters(), i);
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
        new org.apache.axis.description.TypeDesc(ErrorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShortMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LongMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SeverityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SeverityCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorParameterType"));
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
