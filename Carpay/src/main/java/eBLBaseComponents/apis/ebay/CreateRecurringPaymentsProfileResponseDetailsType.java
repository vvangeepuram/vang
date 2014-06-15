/**
 * CreateRecurringPaymentsProfileResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class CreateRecurringPaymentsProfileResponseDetailsType  implements java.io.Serializable {
    /* Recurring Billing Profile ID */
    private java.lang.String profileID;

    /* Recurring Billing Profile Status */
    private eBLBaseComponents.apis.ebay.RecurringPaymentsProfileStatusType profileStatus;

    /* Transaction id from DCC initial payment */
    private java.lang.String transactionID;

    /* Response from DCC initial payment */
    private java.lang.String DCCProcessorResponse;

    /* Return code if DCC initial payment fails */
    private java.lang.String DCCReturnCode;

    public CreateRecurringPaymentsProfileResponseDetailsType() {
    }

    public CreateRecurringPaymentsProfileResponseDetailsType(
           java.lang.String profileID,
           eBLBaseComponents.apis.ebay.RecurringPaymentsProfileStatusType profileStatus,
           java.lang.String transactionID,
           java.lang.String DCCProcessorResponse,
           java.lang.String DCCReturnCode) {
           this.profileID = profileID;
           this.profileStatus = profileStatus;
           this.transactionID = transactionID;
           this.DCCProcessorResponse = DCCProcessorResponse;
           this.DCCReturnCode = DCCReturnCode;
    }


    /**
     * Gets the profileID value for this CreateRecurringPaymentsProfileResponseDetailsType.
     * 
     * @return profileID   * Recurring Billing Profile ID
     */
    public java.lang.String getProfileID() {
        return profileID;
    }


    /**
     * Sets the profileID value for this CreateRecurringPaymentsProfileResponseDetailsType.
     * 
     * @param profileID   * Recurring Billing Profile ID
     */
    public void setProfileID(java.lang.String profileID) {
        this.profileID = profileID;
    }


    /**
     * Gets the profileStatus value for this CreateRecurringPaymentsProfileResponseDetailsType.
     * 
     * @return profileStatus   * Recurring Billing Profile Status
     */
    public eBLBaseComponents.apis.ebay.RecurringPaymentsProfileStatusType getProfileStatus() {
        return profileStatus;
    }


    /**
     * Sets the profileStatus value for this CreateRecurringPaymentsProfileResponseDetailsType.
     * 
     * @param profileStatus   * Recurring Billing Profile Status
     */
    public void setProfileStatus(eBLBaseComponents.apis.ebay.RecurringPaymentsProfileStatusType profileStatus) {
        this.profileStatus = profileStatus;
    }


    /**
     * Gets the transactionID value for this CreateRecurringPaymentsProfileResponseDetailsType.
     * 
     * @return transactionID   * Transaction id from DCC initial payment
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this CreateRecurringPaymentsProfileResponseDetailsType.
     * 
     * @param transactionID   * Transaction id from DCC initial payment
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the DCCProcessorResponse value for this CreateRecurringPaymentsProfileResponseDetailsType.
     * 
     * @return DCCProcessorResponse   * Response from DCC initial payment
     */
    public java.lang.String getDCCProcessorResponse() {
        return DCCProcessorResponse;
    }


    /**
     * Sets the DCCProcessorResponse value for this CreateRecurringPaymentsProfileResponseDetailsType.
     * 
     * @param DCCProcessorResponse   * Response from DCC initial payment
     */
    public void setDCCProcessorResponse(java.lang.String DCCProcessorResponse) {
        this.DCCProcessorResponse = DCCProcessorResponse;
    }


    /**
     * Gets the DCCReturnCode value for this CreateRecurringPaymentsProfileResponseDetailsType.
     * 
     * @return DCCReturnCode   * Return code if DCC initial payment fails
     */
    public java.lang.String getDCCReturnCode() {
        return DCCReturnCode;
    }


    /**
     * Sets the DCCReturnCode value for this CreateRecurringPaymentsProfileResponseDetailsType.
     * 
     * @param DCCReturnCode   * Return code if DCC initial payment fails
     */
    public void setDCCReturnCode(java.lang.String DCCReturnCode) {
        this.DCCReturnCode = DCCReturnCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateRecurringPaymentsProfileResponseDetailsType)) return false;
        CreateRecurringPaymentsProfileResponseDetailsType other = (CreateRecurringPaymentsProfileResponseDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profileID==null && other.getProfileID()==null) || 
             (this.profileID!=null &&
              this.profileID.equals(other.getProfileID()))) &&
            ((this.profileStatus==null && other.getProfileStatus()==null) || 
             (this.profileStatus!=null &&
              this.profileStatus.equals(other.getProfileStatus()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.DCCProcessorResponse==null && other.getDCCProcessorResponse()==null) || 
             (this.DCCProcessorResponse!=null &&
              this.DCCProcessorResponse.equals(other.getDCCProcessorResponse()))) &&
            ((this.DCCReturnCode==null && other.getDCCReturnCode()==null) || 
             (this.DCCReturnCode!=null &&
              this.DCCReturnCode.equals(other.getDCCReturnCode())));
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
        if (getProfileID() != null) {
            _hashCode += getProfileID().hashCode();
        }
        if (getProfileStatus() != null) {
            _hashCode += getProfileStatus().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getDCCProcessorResponse() != null) {
            _hashCode += getDCCProcessorResponse().hashCode();
        }
        if (getDCCReturnCode() != null) {
            _hashCode += getDCCReturnCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateRecurringPaymentsProfileResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreateRecurringPaymentsProfileResponseDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProfileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProfileStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringPaymentsProfileStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DCCProcessorResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DCCProcessorResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DCCReturnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DCCReturnCode"));
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
