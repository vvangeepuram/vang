/**
 * BillingApprovalDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class BillingApprovalDetailsType  implements java.io.Serializable {
    /* The Type of Approval requested - Billing Agreement or Profile */
    private eBLBaseComponents.apis.ebay.ApprovalTypeType approvalType;

    /* The Approval subtype - Must be MerchantInitiatedBilling for
     * BillingAgreement ApprovalType */
    private eBLBaseComponents.apis.ebay.ApprovalSubTypeType approvalSubType;

    /* Description about the Order */
    private eBLBaseComponents.apis.ebay.OrderDetailsType orderDetails;

    /* Directives about the type of payment */
    private eBLBaseComponents.apis.ebay.PaymentDirectivesType paymentDirectives;

    /* Client may pass in its identification of this Billing Agreement.
     * It used for the client's tracking purposes. */
    private java.lang.String custom;

    public BillingApprovalDetailsType() {
    }

    public BillingApprovalDetailsType(
           eBLBaseComponents.apis.ebay.ApprovalTypeType approvalType,
           eBLBaseComponents.apis.ebay.ApprovalSubTypeType approvalSubType,
           eBLBaseComponents.apis.ebay.OrderDetailsType orderDetails,
           eBLBaseComponents.apis.ebay.PaymentDirectivesType paymentDirectives,
           java.lang.String custom) {
           this.approvalType = approvalType;
           this.approvalSubType = approvalSubType;
           this.orderDetails = orderDetails;
           this.paymentDirectives = paymentDirectives;
           this.custom = custom;
    }


    /**
     * Gets the approvalType value for this BillingApprovalDetailsType.
     * 
     * @return approvalType   * The Type of Approval requested - Billing Agreement or Profile
     */
    public eBLBaseComponents.apis.ebay.ApprovalTypeType getApprovalType() {
        return approvalType;
    }


    /**
     * Sets the approvalType value for this BillingApprovalDetailsType.
     * 
     * @param approvalType   * The Type of Approval requested - Billing Agreement or Profile
     */
    public void setApprovalType(eBLBaseComponents.apis.ebay.ApprovalTypeType approvalType) {
        this.approvalType = approvalType;
    }


    /**
     * Gets the approvalSubType value for this BillingApprovalDetailsType.
     * 
     * @return approvalSubType   * The Approval subtype - Must be MerchantInitiatedBilling for
     * BillingAgreement ApprovalType
     */
    public eBLBaseComponents.apis.ebay.ApprovalSubTypeType getApprovalSubType() {
        return approvalSubType;
    }


    /**
     * Sets the approvalSubType value for this BillingApprovalDetailsType.
     * 
     * @param approvalSubType   * The Approval subtype - Must be MerchantInitiatedBilling for
     * BillingAgreement ApprovalType
     */
    public void setApprovalSubType(eBLBaseComponents.apis.ebay.ApprovalSubTypeType approvalSubType) {
        this.approvalSubType = approvalSubType;
    }


    /**
     * Gets the orderDetails value for this BillingApprovalDetailsType.
     * 
     * @return orderDetails   * Description about the Order
     */
    public eBLBaseComponents.apis.ebay.OrderDetailsType getOrderDetails() {
        return orderDetails;
    }


    /**
     * Sets the orderDetails value for this BillingApprovalDetailsType.
     * 
     * @param orderDetails   * Description about the Order
     */
    public void setOrderDetails(eBLBaseComponents.apis.ebay.OrderDetailsType orderDetails) {
        this.orderDetails = orderDetails;
    }


    /**
     * Gets the paymentDirectives value for this BillingApprovalDetailsType.
     * 
     * @return paymentDirectives   * Directives about the type of payment
     */
    public eBLBaseComponents.apis.ebay.PaymentDirectivesType getPaymentDirectives() {
        return paymentDirectives;
    }


    /**
     * Sets the paymentDirectives value for this BillingApprovalDetailsType.
     * 
     * @param paymentDirectives   * Directives about the type of payment
     */
    public void setPaymentDirectives(eBLBaseComponents.apis.ebay.PaymentDirectivesType paymentDirectives) {
        this.paymentDirectives = paymentDirectives;
    }


    /**
     * Gets the custom value for this BillingApprovalDetailsType.
     * 
     * @return custom   * Client may pass in its identification of this Billing Agreement.
     * It used for the client's tracking purposes.
     */
    public java.lang.String getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this BillingApprovalDetailsType.
     * 
     * @param custom   * Client may pass in its identification of this Billing Agreement.
     * It used for the client's tracking purposes.
     */
    public void setCustom(java.lang.String custom) {
        this.custom = custom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingApprovalDetailsType)) return false;
        BillingApprovalDetailsType other = (BillingApprovalDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.approvalType==null && other.getApprovalType()==null) || 
             (this.approvalType!=null &&
              this.approvalType.equals(other.getApprovalType()))) &&
            ((this.approvalSubType==null && other.getApprovalSubType()==null) || 
             (this.approvalSubType!=null &&
              this.approvalSubType.equals(other.getApprovalSubType()))) &&
            ((this.orderDetails==null && other.getOrderDetails()==null) || 
             (this.orderDetails!=null &&
              this.orderDetails.equals(other.getOrderDetails()))) &&
            ((this.paymentDirectives==null && other.getPaymentDirectives()==null) || 
             (this.paymentDirectives!=null &&
              this.paymentDirectives.equals(other.getPaymentDirectives()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom())));
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
        if (getApprovalType() != null) {
            _hashCode += getApprovalType().hashCode();
        }
        if (getApprovalSubType() != null) {
            _hashCode += getApprovalSubType().hashCode();
        }
        if (getOrderDetails() != null) {
            _hashCode += getOrderDetails().hashCode();
        }
        if (getPaymentDirectives() != null) {
            _hashCode += getPaymentDirectives().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingApprovalDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingApprovalDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ApprovalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ApprovalTypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ApprovalSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ApprovalSubTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OrderDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OrderDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDirectives");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDirectives"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDirectivesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Custom"));
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
