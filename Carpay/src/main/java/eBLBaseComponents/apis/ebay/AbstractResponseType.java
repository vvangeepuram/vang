/**
 * AbstractResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Base type definition of a response payload that can carry any 
 *                     type of payload content with following optional
 * elements:
 *                     	- timestamp of response message, 
 *                     	- application level acknowledgement, and 
 *                     	- application-level errors and warnings.
 */
public abstract class AbstractResponseType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    /* This value represents the date and time (GMT) when the response
     * 
     *   				        was generated by a service provider (as a result of
     * processing 
     *   				        of a request). */
    private java.util.Calendar timestamp;

    /* Application level acknowledgement code. */
    private eBLBaseComponents.apis.ebay.AckCodeType ack;

    /* CorrelationID may be used optionally with an application 
     *                                    level acknowledgement. */
    private java.lang.String correlationID;

    private eBLBaseComponents.apis.ebay.ErrorType[] errors;

    /* This refers to the version of the response payload schema. */
    private java.lang.String version;

    /* This refers to the specific software build that was used in
     * the deployment 
     *                                for processing the request and generating
     * the response. */
    private java.lang.String build;

    private org.apache.axis.message.MessageElement [] _any;

    public AbstractResponseType() {
    }

    public AbstractResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any) {
           this.timestamp = timestamp;
           this.ack = ack;
           this.correlationID = correlationID;
           this.errors = errors;
           this.version = version;
           this.build = build;
           this._any = _any;
    }


    /**
     * Gets the timestamp value for this AbstractResponseType.
     * 
     * @return timestamp   * This value represents the date and time (GMT) when the response
     * 
     *   				        was generated by a service provider (as a result of
     * processing 
     *   				        of a request).
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this AbstractResponseType.
     * 
     * @param timestamp   * This value represents the date and time (GMT) when the response
     * 
     *   				        was generated by a service provider (as a result of
     * processing 
     *   				        of a request).
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the ack value for this AbstractResponseType.
     * 
     * @return ack   * Application level acknowledgement code.
     */
    public eBLBaseComponents.apis.ebay.AckCodeType getAck() {
        return ack;
    }


    /**
     * Sets the ack value for this AbstractResponseType.
     * 
     * @param ack   * Application level acknowledgement code.
     */
    public void setAck(eBLBaseComponents.apis.ebay.AckCodeType ack) {
        this.ack = ack;
    }


    /**
     * Gets the correlationID value for this AbstractResponseType.
     * 
     * @return correlationID   * CorrelationID may be used optionally with an application 
     *                                    level acknowledgement.
     */
    public java.lang.String getCorrelationID() {
        return correlationID;
    }


    /**
     * Sets the correlationID value for this AbstractResponseType.
     * 
     * @param correlationID   * CorrelationID may be used optionally with an application 
     *                                    level acknowledgement.
     */
    public void setCorrelationID(java.lang.String correlationID) {
        this.correlationID = correlationID;
    }


    /**
     * Gets the errors value for this AbstractResponseType.
     * 
     * @return errors
     */
    public eBLBaseComponents.apis.ebay.ErrorType[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this AbstractResponseType.
     * 
     * @param errors
     */
    public void setErrors(eBLBaseComponents.apis.ebay.ErrorType[] errors) {
        this.errors = errors;
    }

    public eBLBaseComponents.apis.ebay.ErrorType getErrors(int i) {
        return this.errors[i];
    }

    public void setErrors(int i, eBLBaseComponents.apis.ebay.ErrorType _value) {
        this.errors[i] = _value;
    }


    /**
     * Gets the version value for this AbstractResponseType.
     * 
     * @return version   * This refers to the version of the response payload schema.
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AbstractResponseType.
     * 
     * @param version   * This refers to the version of the response payload schema.
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the build value for this AbstractResponseType.
     * 
     * @return build   * This refers to the specific software build that was used in
     * the deployment 
     *                                for processing the request and generating
     * the response.
     */
    public java.lang.String getBuild() {
        return build;
    }


    /**
     * Sets the build value for this AbstractResponseType.
     * 
     * @param build   * This refers to the specific software build that was used in
     * the deployment 
     *                                for processing the request and generating
     * the response.
     */
    public void setBuild(java.lang.String build) {
        this.build = build;
    }


    /**
     * Gets the _any value for this AbstractResponseType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AbstractResponseType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractResponseType)) return false;
        AbstractResponseType other = (AbstractResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.ack==null && other.getAck()==null) || 
             (this.ack!=null &&
              this.ack.equals(other.getAck()))) &&
            ((this.correlationID==null && other.getCorrelationID()==null) || 
             (this.correlationID!=null &&
              this.correlationID.equals(other.getCorrelationID()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.build==null && other.getBuild()==null) || 
             (this.build!=null &&
              this.build.equals(other.getBuild()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getAck() != null) {
            _hashCode += getAck().hashCode();
        }
        if (getCorrelationID() != null) {
            _hashCode += getCorrelationID().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getBuild() != null) {
            _hashCode += getBuild().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(AbstractResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AbstractResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ack");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Ack"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AckCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CorrelationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("build");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Build"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
