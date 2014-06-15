/**
 * SetDataRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class SetDataRequestType  implements java.io.Serializable {
    /* Details about Billing Agreements requested to be created. */
    private eBLBaseComponents.apis.ebay.BillingApprovalDetailsType[] billingApprovalDetails;

    /* Only needed if Auto Authorization is requested. The authentication
     * session token will be passed in here. */
    private eBLBaseComponents.apis.ebay.BuyerDetailType buyerDetail;

    /* Requests for specific buyer information like Billing Address
     * to be returned through GetExpressCheckoutDetails should be specified
     * under this. */
    private eBLBaseComponents.apis.ebay.InfoSharingDirectivesType infoSharingDirectives;

    /* The value 1 indicates that you require to retrieve the customer's
     * shipping address on file with PayPal. Any value other than 1 indicates
     * that no such requirement. */
    private java.lang.Boolean retrieveShippingAddress;

    /* the value is required by ACS team to specify the channel which
     * the partners are in. the channel will be used for risk assessment
     * 
     * 						the value is defined in biz/User/value_object/Channel.oml
     * 						Optional */
    private eBLBaseComponents.apis.ebay.UserChannelCodeType userChannel;

    /* The value 1 indicates that you require that the customer's
     * shipping address on file with PayPal be a confirmed address. Any value
     * other than 1 indicates that the customer's shipping address on file
     * with PayPal need NOT be a confirmed address. Setting this element
     * overrides the setting you have specified in the recipient's Merchant
     * Account Profile. 
     * 
     * 									
     * Optional */
    private java.lang.Boolean reqConfirmShipping;

    /* Information about the payment. */
    private eBLBaseComponents.apis.ebay.PaymentDetailsType[] paymentDetails;

    /* An optional set of values related to tracking for external
     * partner. */
    private eBLBaseComponents.apis.ebay.ExternalPartnerTrackingDetailsType externalPartnerTrackingDetails;

    public SetDataRequestType() {
    }

    public SetDataRequestType(
           eBLBaseComponents.apis.ebay.BillingApprovalDetailsType[] billingApprovalDetails,
           eBLBaseComponents.apis.ebay.BuyerDetailType buyerDetail,
           eBLBaseComponents.apis.ebay.InfoSharingDirectivesType infoSharingDirectives,
           java.lang.Boolean retrieveShippingAddress,
           eBLBaseComponents.apis.ebay.UserChannelCodeType userChannel,
           java.lang.Boolean reqConfirmShipping,
           eBLBaseComponents.apis.ebay.PaymentDetailsType[] paymentDetails,
           eBLBaseComponents.apis.ebay.ExternalPartnerTrackingDetailsType externalPartnerTrackingDetails) {
           this.billingApprovalDetails = billingApprovalDetails;
           this.buyerDetail = buyerDetail;
           this.infoSharingDirectives = infoSharingDirectives;
           this.retrieveShippingAddress = retrieveShippingAddress;
           this.userChannel = userChannel;
           this.reqConfirmShipping = reqConfirmShipping;
           this.paymentDetails = paymentDetails;
           this.externalPartnerTrackingDetails = externalPartnerTrackingDetails;
    }


    /**
     * Gets the billingApprovalDetails value for this SetDataRequestType.
     * 
     * @return billingApprovalDetails   * Details about Billing Agreements requested to be created.
     */
    public eBLBaseComponents.apis.ebay.BillingApprovalDetailsType[] getBillingApprovalDetails() {
        return billingApprovalDetails;
    }


    /**
     * Sets the billingApprovalDetails value for this SetDataRequestType.
     * 
     * @param billingApprovalDetails   * Details about Billing Agreements requested to be created.
     */
    public void setBillingApprovalDetails(eBLBaseComponents.apis.ebay.BillingApprovalDetailsType[] billingApprovalDetails) {
        this.billingApprovalDetails = billingApprovalDetails;
    }

    public eBLBaseComponents.apis.ebay.BillingApprovalDetailsType getBillingApprovalDetails(int i) {
        return this.billingApprovalDetails[i];
    }

    public void setBillingApprovalDetails(int i, eBLBaseComponents.apis.ebay.BillingApprovalDetailsType _value) {
        this.billingApprovalDetails[i] = _value;
    }


    /**
     * Gets the buyerDetail value for this SetDataRequestType.
     * 
     * @return buyerDetail   * Only needed if Auto Authorization is requested. The authentication
     * session token will be passed in here.
     */
    public eBLBaseComponents.apis.ebay.BuyerDetailType getBuyerDetail() {
        return buyerDetail;
    }


    /**
     * Sets the buyerDetail value for this SetDataRequestType.
     * 
     * @param buyerDetail   * Only needed if Auto Authorization is requested. The authentication
     * session token will be passed in here.
     */
    public void setBuyerDetail(eBLBaseComponents.apis.ebay.BuyerDetailType buyerDetail) {
        this.buyerDetail = buyerDetail;
    }


    /**
     * Gets the infoSharingDirectives value for this SetDataRequestType.
     * 
     * @return infoSharingDirectives   * Requests for specific buyer information like Billing Address
     * to be returned through GetExpressCheckoutDetails should be specified
     * under this.
     */
    public eBLBaseComponents.apis.ebay.InfoSharingDirectivesType getInfoSharingDirectives() {
        return infoSharingDirectives;
    }


    /**
     * Sets the infoSharingDirectives value for this SetDataRequestType.
     * 
     * @param infoSharingDirectives   * Requests for specific buyer information like Billing Address
     * to be returned through GetExpressCheckoutDetails should be specified
     * under this.
     */
    public void setInfoSharingDirectives(eBLBaseComponents.apis.ebay.InfoSharingDirectivesType infoSharingDirectives) {
        this.infoSharingDirectives = infoSharingDirectives;
    }


    /**
     * Gets the retrieveShippingAddress value for this SetDataRequestType.
     * 
     * @return retrieveShippingAddress   * The value 1 indicates that you require to retrieve the customer's
     * shipping address on file with PayPal. Any value other than 1 indicates
     * that no such requirement.
     */
    public java.lang.Boolean getRetrieveShippingAddress() {
        return retrieveShippingAddress;
    }


    /**
     * Sets the retrieveShippingAddress value for this SetDataRequestType.
     * 
     * @param retrieveShippingAddress   * The value 1 indicates that you require to retrieve the customer's
     * shipping address on file with PayPal. Any value other than 1 indicates
     * that no such requirement.
     */
    public void setRetrieveShippingAddress(java.lang.Boolean retrieveShippingAddress) {
        this.retrieveShippingAddress = retrieveShippingAddress;
    }


    /**
     * Gets the userChannel value for this SetDataRequestType.
     * 
     * @return userChannel   * the value is required by ACS team to specify the channel which
     * the partners are in. the channel will be used for risk assessment
     * 
     * 						the value is defined in biz/User/value_object/Channel.oml
     * 						Optional
     */
    public eBLBaseComponents.apis.ebay.UserChannelCodeType getUserChannel() {
        return userChannel;
    }


    /**
     * Sets the userChannel value for this SetDataRequestType.
     * 
     * @param userChannel   * the value is required by ACS team to specify the channel which
     * the partners are in. the channel will be used for risk assessment
     * 
     * 						the value is defined in biz/User/value_object/Channel.oml
     * 						Optional
     */
    public void setUserChannel(eBLBaseComponents.apis.ebay.UserChannelCodeType userChannel) {
        this.userChannel = userChannel;
    }


    /**
     * Gets the reqConfirmShipping value for this SetDataRequestType.
     * 
     * @return reqConfirmShipping   * The value 1 indicates that you require that the customer's
     * shipping address on file with PayPal be a confirmed address. Any value
     * other than 1 indicates that the customer's shipping address on file
     * with PayPal need NOT be a confirmed address. Setting this element
     * overrides the setting you have specified in the recipient's Merchant
     * Account Profile. 
     * 
     * 									
     * Optional
     */
    public java.lang.Boolean getReqConfirmShipping() {
        return reqConfirmShipping;
    }


    /**
     * Sets the reqConfirmShipping value for this SetDataRequestType.
     * 
     * @param reqConfirmShipping   * The value 1 indicates that you require that the customer's
     * shipping address on file with PayPal be a confirmed address. Any value
     * other than 1 indicates that the customer's shipping address on file
     * with PayPal need NOT be a confirmed address. Setting this element
     * overrides the setting you have specified in the recipient's Merchant
     * Account Profile. 
     * 
     * 									
     * Optional
     */
    public void setReqConfirmShipping(java.lang.Boolean reqConfirmShipping) {
        this.reqConfirmShipping = reqConfirmShipping;
    }


    /**
     * Gets the paymentDetails value for this SetDataRequestType.
     * 
     * @return paymentDetails   * Information about the payment.
     */
    public eBLBaseComponents.apis.ebay.PaymentDetailsType[] getPaymentDetails() {
        return paymentDetails;
    }


    /**
     * Sets the paymentDetails value for this SetDataRequestType.
     * 
     * @param paymentDetails   * Information about the payment.
     */
    public void setPaymentDetails(eBLBaseComponents.apis.ebay.PaymentDetailsType[] paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public eBLBaseComponents.apis.ebay.PaymentDetailsType getPaymentDetails(int i) {
        return this.paymentDetails[i];
    }

    public void setPaymentDetails(int i, eBLBaseComponents.apis.ebay.PaymentDetailsType _value) {
        this.paymentDetails[i] = _value;
    }


    /**
     * Gets the externalPartnerTrackingDetails value for this SetDataRequestType.
     * 
     * @return externalPartnerTrackingDetails   * An optional set of values related to tracking for external
     * partner.
     */
    public eBLBaseComponents.apis.ebay.ExternalPartnerTrackingDetailsType getExternalPartnerTrackingDetails() {
        return externalPartnerTrackingDetails;
    }


    /**
     * Sets the externalPartnerTrackingDetails value for this SetDataRequestType.
     * 
     * @param externalPartnerTrackingDetails   * An optional set of values related to tracking for external
     * partner.
     */
    public void setExternalPartnerTrackingDetails(eBLBaseComponents.apis.ebay.ExternalPartnerTrackingDetailsType externalPartnerTrackingDetails) {
        this.externalPartnerTrackingDetails = externalPartnerTrackingDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetDataRequestType)) return false;
        SetDataRequestType other = (SetDataRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingApprovalDetails==null && other.getBillingApprovalDetails()==null) || 
             (this.billingApprovalDetails!=null &&
              java.util.Arrays.equals(this.billingApprovalDetails, other.getBillingApprovalDetails()))) &&
            ((this.buyerDetail==null && other.getBuyerDetail()==null) || 
             (this.buyerDetail!=null &&
              this.buyerDetail.equals(other.getBuyerDetail()))) &&
            ((this.infoSharingDirectives==null && other.getInfoSharingDirectives()==null) || 
             (this.infoSharingDirectives!=null &&
              this.infoSharingDirectives.equals(other.getInfoSharingDirectives()))) &&
            ((this.retrieveShippingAddress==null && other.getRetrieveShippingAddress()==null) || 
             (this.retrieveShippingAddress!=null &&
              this.retrieveShippingAddress.equals(other.getRetrieveShippingAddress()))) &&
            ((this.userChannel==null && other.getUserChannel()==null) || 
             (this.userChannel!=null &&
              this.userChannel.equals(other.getUserChannel()))) &&
            ((this.reqConfirmShipping==null && other.getReqConfirmShipping()==null) || 
             (this.reqConfirmShipping!=null &&
              this.reqConfirmShipping.equals(other.getReqConfirmShipping()))) &&
            ((this.paymentDetails==null && other.getPaymentDetails()==null) || 
             (this.paymentDetails!=null &&
              java.util.Arrays.equals(this.paymentDetails, other.getPaymentDetails()))) &&
            ((this.externalPartnerTrackingDetails==null && other.getExternalPartnerTrackingDetails()==null) || 
             (this.externalPartnerTrackingDetails!=null &&
              this.externalPartnerTrackingDetails.equals(other.getExternalPartnerTrackingDetails())));
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
        if (getBillingApprovalDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingApprovalDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingApprovalDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuyerDetail() != null) {
            _hashCode += getBuyerDetail().hashCode();
        }
        if (getInfoSharingDirectives() != null) {
            _hashCode += getInfoSharingDirectives().hashCode();
        }
        if (getRetrieveShippingAddress() != null) {
            _hashCode += getRetrieveShippingAddress().hashCode();
        }
        if (getUserChannel() != null) {
            _hashCode += getUserChannel().hashCode();
        }
        if (getReqConfirmShipping() != null) {
            _hashCode += getReqConfirmShipping().hashCode();
        }
        if (getPaymentDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalPartnerTrackingDetails() != null) {
            _hashCode += getExternalPartnerTrackingDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetDataRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetDataRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingApprovalDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingApprovalDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingApprovalDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerDetailType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoSharingDirectives");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InfoSharingDirectives"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InfoSharingDirectivesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveShippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RetrieveShippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserChannelCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqConfirmShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReqConfirmShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalPartnerTrackingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalPartnerTrackingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalPartnerTrackingDetailsType"));
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
