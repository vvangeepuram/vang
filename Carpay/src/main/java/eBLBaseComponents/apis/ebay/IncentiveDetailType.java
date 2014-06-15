/**
 * IncentiveDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class IncentiveDetailType  implements java.io.Serializable {
    private java.lang.String redemptionCode;

    private java.lang.String displayCode;

    private java.lang.String programId;

    private eBLBaseComponents.apis.ebay.IncentiveTypeCodeType incentiveType;

    private java.lang.String incentiveDescription;

    private eBLBaseComponents.apis.ebay.IncentiveAppliedToType[] appliedTo;

    private java.lang.String status;

    private java.lang.String errorCode;

    public IncentiveDetailType() {
    }

    public IncentiveDetailType(
           java.lang.String redemptionCode,
           java.lang.String displayCode,
           java.lang.String programId,
           eBLBaseComponents.apis.ebay.IncentiveTypeCodeType incentiveType,
           java.lang.String incentiveDescription,
           eBLBaseComponents.apis.ebay.IncentiveAppliedToType[] appliedTo,
           java.lang.String status,
           java.lang.String errorCode) {
           this.redemptionCode = redemptionCode;
           this.displayCode = displayCode;
           this.programId = programId;
           this.incentiveType = incentiveType;
           this.incentiveDescription = incentiveDescription;
           this.appliedTo = appliedTo;
           this.status = status;
           this.errorCode = errorCode;
    }


    /**
     * Gets the redemptionCode value for this IncentiveDetailType.
     * 
     * @return redemptionCode
     */
    public java.lang.String getRedemptionCode() {
        return redemptionCode;
    }


    /**
     * Sets the redemptionCode value for this IncentiveDetailType.
     * 
     * @param redemptionCode
     */
    public void setRedemptionCode(java.lang.String redemptionCode) {
        this.redemptionCode = redemptionCode;
    }


    /**
     * Gets the displayCode value for this IncentiveDetailType.
     * 
     * @return displayCode
     */
    public java.lang.String getDisplayCode() {
        return displayCode;
    }


    /**
     * Sets the displayCode value for this IncentiveDetailType.
     * 
     * @param displayCode
     */
    public void setDisplayCode(java.lang.String displayCode) {
        this.displayCode = displayCode;
    }


    /**
     * Gets the programId value for this IncentiveDetailType.
     * 
     * @return programId
     */
    public java.lang.String getProgramId() {
        return programId;
    }


    /**
     * Sets the programId value for this IncentiveDetailType.
     * 
     * @param programId
     */
    public void setProgramId(java.lang.String programId) {
        this.programId = programId;
    }


    /**
     * Gets the incentiveType value for this IncentiveDetailType.
     * 
     * @return incentiveType
     */
    public eBLBaseComponents.apis.ebay.IncentiveTypeCodeType getIncentiveType() {
        return incentiveType;
    }


    /**
     * Sets the incentiveType value for this IncentiveDetailType.
     * 
     * @param incentiveType
     */
    public void setIncentiveType(eBLBaseComponents.apis.ebay.IncentiveTypeCodeType incentiveType) {
        this.incentiveType = incentiveType;
    }


    /**
     * Gets the incentiveDescription value for this IncentiveDetailType.
     * 
     * @return incentiveDescription
     */
    public java.lang.String getIncentiveDescription() {
        return incentiveDescription;
    }


    /**
     * Sets the incentiveDescription value for this IncentiveDetailType.
     * 
     * @param incentiveDescription
     */
    public void setIncentiveDescription(java.lang.String incentiveDescription) {
        this.incentiveDescription = incentiveDescription;
    }


    /**
     * Gets the appliedTo value for this IncentiveDetailType.
     * 
     * @return appliedTo
     */
    public eBLBaseComponents.apis.ebay.IncentiveAppliedToType[] getAppliedTo() {
        return appliedTo;
    }


    /**
     * Sets the appliedTo value for this IncentiveDetailType.
     * 
     * @param appliedTo
     */
    public void setAppliedTo(eBLBaseComponents.apis.ebay.IncentiveAppliedToType[] appliedTo) {
        this.appliedTo = appliedTo;
    }

    public eBLBaseComponents.apis.ebay.IncentiveAppliedToType getAppliedTo(int i) {
        return this.appliedTo[i];
    }

    public void setAppliedTo(int i, eBLBaseComponents.apis.ebay.IncentiveAppliedToType _value) {
        this.appliedTo[i] = _value;
    }


    /**
     * Gets the status value for this IncentiveDetailType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this IncentiveDetailType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the errorCode value for this IncentiveDetailType.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this IncentiveDetailType.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncentiveDetailType)) return false;
        IncentiveDetailType other = (IncentiveDetailType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.redemptionCode==null && other.getRedemptionCode()==null) || 
             (this.redemptionCode!=null &&
              this.redemptionCode.equals(other.getRedemptionCode()))) &&
            ((this.displayCode==null && other.getDisplayCode()==null) || 
             (this.displayCode!=null &&
              this.displayCode.equals(other.getDisplayCode()))) &&
            ((this.programId==null && other.getProgramId()==null) || 
             (this.programId!=null &&
              this.programId.equals(other.getProgramId()))) &&
            ((this.incentiveType==null && other.getIncentiveType()==null) || 
             (this.incentiveType!=null &&
              this.incentiveType.equals(other.getIncentiveType()))) &&
            ((this.incentiveDescription==null && other.getIncentiveDescription()==null) || 
             (this.incentiveDescription!=null &&
              this.incentiveDescription.equals(other.getIncentiveDescription()))) &&
            ((this.appliedTo==null && other.getAppliedTo()==null) || 
             (this.appliedTo!=null &&
              java.util.Arrays.equals(this.appliedTo, other.getAppliedTo()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode())));
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
        if (getRedemptionCode() != null) {
            _hashCode += getRedemptionCode().hashCode();
        }
        if (getDisplayCode() != null) {
            _hashCode += getDisplayCode().hashCode();
        }
        if (getProgramId() != null) {
            _hashCode += getProgramId().hashCode();
        }
        if (getIncentiveType() != null) {
            _hashCode += getIncentiveType().hashCode();
        }
        if (getIncentiveDescription() != null) {
            _hashCode += getIncentiveDescription().hashCode();
        }
        if (getAppliedTo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedTo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedTo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IncentiveDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveDetailType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redemptionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RedemptionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DisplayCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProgramId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incentiveType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveTypeCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incentiveDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AppliedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveAppliedToType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorCode"));
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
