/**
 * DoCaptureResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class DoCaptureResponseDetailsType  implements java.io.Serializable {
    /* The authorization identification number you specified in the
     * request. 
     * Character length and limits: 19 single-byte characters maximum */
    private java.lang.String authorizationID;

    /* Information about the transaction */
    private eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo;

    /* Return msgsubid back to merchant */
    private java.lang.String msgSubID;

    /* Partner funding source id corresponding to the FS used in authorization. */
    private java.lang.String partnerFundingSourceID;

    public DoCaptureResponseDetailsType() {
    }

    public DoCaptureResponseDetailsType(
           java.lang.String authorizationID,
           eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo,
           java.lang.String msgSubID,
           java.lang.String partnerFundingSourceID) {
           this.authorizationID = authorizationID;
           this.paymentInfo = paymentInfo;
           this.msgSubID = msgSubID;
           this.partnerFundingSourceID = partnerFundingSourceID;
    }


    /**
     * Gets the authorizationID value for this DoCaptureResponseDetailsType.
     * 
     * @return authorizationID   * The authorization identification number you specified in the
     * request. 
     * Character length and limits: 19 single-byte characters maximum
     */
    public java.lang.String getAuthorizationID() {
        return authorizationID;
    }


    /**
     * Sets the authorizationID value for this DoCaptureResponseDetailsType.
     * 
     * @param authorizationID   * The authorization identification number you specified in the
     * request. 
     * Character length and limits: 19 single-byte characters maximum
     */
    public void setAuthorizationID(java.lang.String authorizationID) {
        this.authorizationID = authorizationID;
    }


    /**
     * Gets the paymentInfo value for this DoCaptureResponseDetailsType.
     * 
     * @return paymentInfo   * Information about the transaction
     */
    public eBLBaseComponents.apis.ebay.PaymentInfoType getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this DoCaptureResponseDetailsType.
     * 
     * @param paymentInfo   * Information about the transaction
     */
    public void setPaymentInfo(eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo) {
        this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the msgSubID value for this DoCaptureResponseDetailsType.
     * 
     * @return msgSubID   * Return msgsubid back to merchant
     */
    public java.lang.String getMsgSubID() {
        return msgSubID;
    }


    /**
     * Sets the msgSubID value for this DoCaptureResponseDetailsType.
     * 
     * @param msgSubID   * Return msgsubid back to merchant
     */
    public void setMsgSubID(java.lang.String msgSubID) {
        this.msgSubID = msgSubID;
    }


    /**
     * Gets the partnerFundingSourceID value for this DoCaptureResponseDetailsType.
     * 
     * @return partnerFundingSourceID   * Partner funding source id corresponding to the FS used in authorization.
     */
    public java.lang.String getPartnerFundingSourceID() {
        return partnerFundingSourceID;
    }


    /**
     * Sets the partnerFundingSourceID value for this DoCaptureResponseDetailsType.
     * 
     * @param partnerFundingSourceID   * Partner funding source id corresponding to the FS used in authorization.
     */
    public void setPartnerFundingSourceID(java.lang.String partnerFundingSourceID) {
        this.partnerFundingSourceID = partnerFundingSourceID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCaptureResponseDetailsType)) return false;
        DoCaptureResponseDetailsType other = (DoCaptureResponseDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorizationID==null && other.getAuthorizationID()==null) || 
             (this.authorizationID!=null &&
              this.authorizationID.equals(other.getAuthorizationID()))) &&
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo()))) &&
            ((this.msgSubID==null && other.getMsgSubID()==null) || 
             (this.msgSubID!=null &&
              this.msgSubID.equals(other.getMsgSubID()))) &&
            ((this.partnerFundingSourceID==null && other.getPartnerFundingSourceID()==null) || 
             (this.partnerFundingSourceID!=null &&
              this.partnerFundingSourceID.equals(other.getPartnerFundingSourceID())));
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
        if (getAuthorizationID() != null) {
            _hashCode += getAuthorizationID().hashCode();
        }
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        if (getPartnerFundingSourceID() != null) {
            _hashCode += getPartnerFundingSourceID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCaptureResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoCaptureResponseDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgSubID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MsgSubID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerFundingSourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PartnerFundingSourceID"));
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
