/**
 * DoExpressCheckoutPaymentResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class DoExpressCheckoutPaymentResponseDetailsType  implements java.io.Serializable {
    /* The timestamped token value that was returned by SetExpressCheckoutResponse
     * and passed on GetExpressCheckoutDetailsRequest. 
     * 
     * 						
     * Character length and limitations:20 single-byte characters */
    private java.lang.String token;

    /* Information about the transaction */
    private eBLBaseComponents.apis.ebay.PaymentInfoType[] paymentInfo;

    private java.lang.String billingAgreementID;

    private java.lang.String redirectRequired;

    /* Memo entered by sender in PayPal Review Page note field.
     * 						
     * 						
     * 							Optional
     * 						
     * 						
     * 						Character length and limitations: 255 single-byte alphanumeric
     * characters */
    private java.lang.String note;

    /* Unique id passed in the DoEC call. */
    private java.lang.String msgSubID;

    /* Redirect back to PayPal, PayPal can host the success page. */
    private java.lang.String successPageRedirectRequested;

    /* Information about the user selected options. */
    private eBLBaseComponents.apis.ebay.UserSelectedOptionType userSelectedOptions;

    /* Information about Coupled Payment transactions. */
    private eBLBaseComponents.apis.ebay.CoupledPaymentInfoType[] coupledPaymentInfo;

    public DoExpressCheckoutPaymentResponseDetailsType() {
    }

    public DoExpressCheckoutPaymentResponseDetailsType(
           java.lang.String token,
           eBLBaseComponents.apis.ebay.PaymentInfoType[] paymentInfo,
           java.lang.String billingAgreementID,
           java.lang.String redirectRequired,
           java.lang.String note,
           java.lang.String msgSubID,
           java.lang.String successPageRedirectRequested,
           eBLBaseComponents.apis.ebay.UserSelectedOptionType userSelectedOptions,
           eBLBaseComponents.apis.ebay.CoupledPaymentInfoType[] coupledPaymentInfo) {
           this.token = token;
           this.paymentInfo = paymentInfo;
           this.billingAgreementID = billingAgreementID;
           this.redirectRequired = redirectRequired;
           this.note = note;
           this.msgSubID = msgSubID;
           this.successPageRedirectRequested = successPageRedirectRequested;
           this.userSelectedOptions = userSelectedOptions;
           this.coupledPaymentInfo = coupledPaymentInfo;
    }


    /**
     * Gets the token value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @return token   * The timestamped token value that was returned by SetExpressCheckoutResponse
     * and passed on GetExpressCheckoutDetailsRequest. 
     * 
     * 						
     * Character length and limitations:20 single-byte characters
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @param token   * The timestamped token value that was returned by SetExpressCheckoutResponse
     * and passed on GetExpressCheckoutDetailsRequest. 
     * 
     * 						
     * Character length and limitations:20 single-byte characters
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the paymentInfo value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @return paymentInfo   * Information about the transaction
     */
    public eBLBaseComponents.apis.ebay.PaymentInfoType[] getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @param paymentInfo   * Information about the transaction
     */
    public void setPaymentInfo(eBLBaseComponents.apis.ebay.PaymentInfoType[] paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public eBLBaseComponents.apis.ebay.PaymentInfoType getPaymentInfo(int i) {
        return this.paymentInfo[i];
    }

    public void setPaymentInfo(int i, eBLBaseComponents.apis.ebay.PaymentInfoType _value) {
        this.paymentInfo[i] = _value;
    }


    /**
     * Gets the billingAgreementID value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @return billingAgreementID
     */
    public java.lang.String getBillingAgreementID() {
        return billingAgreementID;
    }


    /**
     * Sets the billingAgreementID value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @param billingAgreementID
     */
    public void setBillingAgreementID(java.lang.String billingAgreementID) {
        this.billingAgreementID = billingAgreementID;
    }


    /**
     * Gets the redirectRequired value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @return redirectRequired
     */
    public java.lang.String getRedirectRequired() {
        return redirectRequired;
    }


    /**
     * Sets the redirectRequired value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @param redirectRequired
     */
    public void setRedirectRequired(java.lang.String redirectRequired) {
        this.redirectRequired = redirectRequired;
    }


    /**
     * Gets the note value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @return note   * Memo entered by sender in PayPal Review Page note field.
     * 						
     * 						
     * 							Optional
     * 						
     * 						
     * 						Character length and limitations: 255 single-byte alphanumeric
     * characters
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @param note   * Memo entered by sender in PayPal Review Page note field.
     * 						
     * 						
     * 							Optional
     * 						
     * 						
     * 						Character length and limitations: 255 single-byte alphanumeric
     * characters
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the msgSubID value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @return msgSubID   * Unique id passed in the DoEC call.
     */
    public java.lang.String getMsgSubID() {
        return msgSubID;
    }


    /**
     * Sets the msgSubID value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @param msgSubID   * Unique id passed in the DoEC call.
     */
    public void setMsgSubID(java.lang.String msgSubID) {
        this.msgSubID = msgSubID;
    }


    /**
     * Gets the successPageRedirectRequested value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @return successPageRedirectRequested   * Redirect back to PayPal, PayPal can host the success page.
     */
    public java.lang.String getSuccessPageRedirectRequested() {
        return successPageRedirectRequested;
    }


    /**
     * Sets the successPageRedirectRequested value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @param successPageRedirectRequested   * Redirect back to PayPal, PayPal can host the success page.
     */
    public void setSuccessPageRedirectRequested(java.lang.String successPageRedirectRequested) {
        this.successPageRedirectRequested = successPageRedirectRequested;
    }


    /**
     * Gets the userSelectedOptions value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @return userSelectedOptions   * Information about the user selected options.
     */
    public eBLBaseComponents.apis.ebay.UserSelectedOptionType getUserSelectedOptions() {
        return userSelectedOptions;
    }


    /**
     * Sets the userSelectedOptions value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @param userSelectedOptions   * Information about the user selected options.
     */
    public void setUserSelectedOptions(eBLBaseComponents.apis.ebay.UserSelectedOptionType userSelectedOptions) {
        this.userSelectedOptions = userSelectedOptions;
    }


    /**
     * Gets the coupledPaymentInfo value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @return coupledPaymentInfo   * Information about Coupled Payment transactions.
     */
    public eBLBaseComponents.apis.ebay.CoupledPaymentInfoType[] getCoupledPaymentInfo() {
        return coupledPaymentInfo;
    }


    /**
     * Sets the coupledPaymentInfo value for this DoExpressCheckoutPaymentResponseDetailsType.
     * 
     * @param coupledPaymentInfo   * Information about Coupled Payment transactions.
     */
    public void setCoupledPaymentInfo(eBLBaseComponents.apis.ebay.CoupledPaymentInfoType[] coupledPaymentInfo) {
        this.coupledPaymentInfo = coupledPaymentInfo;
    }

    public eBLBaseComponents.apis.ebay.CoupledPaymentInfoType getCoupledPaymentInfo(int i) {
        return this.coupledPaymentInfo[i];
    }

    public void setCoupledPaymentInfo(int i, eBLBaseComponents.apis.ebay.CoupledPaymentInfoType _value) {
        this.coupledPaymentInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoExpressCheckoutPaymentResponseDetailsType)) return false;
        DoExpressCheckoutPaymentResponseDetailsType other = (DoExpressCheckoutPaymentResponseDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              java.util.Arrays.equals(this.paymentInfo, other.getPaymentInfo()))) &&
            ((this.billingAgreementID==null && other.getBillingAgreementID()==null) || 
             (this.billingAgreementID!=null &&
              this.billingAgreementID.equals(other.getBillingAgreementID()))) &&
            ((this.redirectRequired==null && other.getRedirectRequired()==null) || 
             (this.redirectRequired!=null &&
              this.redirectRequired.equals(other.getRedirectRequired()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.msgSubID==null && other.getMsgSubID()==null) || 
             (this.msgSubID!=null &&
              this.msgSubID.equals(other.getMsgSubID()))) &&
            ((this.successPageRedirectRequested==null && other.getSuccessPageRedirectRequested()==null) || 
             (this.successPageRedirectRequested!=null &&
              this.successPageRedirectRequested.equals(other.getSuccessPageRedirectRequested()))) &&
            ((this.userSelectedOptions==null && other.getUserSelectedOptions()==null) || 
             (this.userSelectedOptions!=null &&
              this.userSelectedOptions.equals(other.getUserSelectedOptions()))) &&
            ((this.coupledPaymentInfo==null && other.getCoupledPaymentInfo()==null) || 
             (this.coupledPaymentInfo!=null &&
              java.util.Arrays.equals(this.coupledPaymentInfo, other.getCoupledPaymentInfo())));
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
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getPaymentInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillingAgreementID() != null) {
            _hashCode += getBillingAgreementID().hashCode();
        }
        if (getRedirectRequired() != null) {
            _hashCode += getRedirectRequired().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        if (getSuccessPageRedirectRequested() != null) {
            _hashCode += getSuccessPageRedirectRequested().hashCode();
        }
        if (getUserSelectedOptions() != null) {
            _hashCode += getUserSelectedOptions().hashCode();
        }
        if (getCoupledPaymentInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoupledPaymentInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoupledPaymentInfo(), i);
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
        new org.apache.axis.description.TypeDesc(DoExpressCheckoutPaymentResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoExpressCheckoutPaymentResponseDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RedirectRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("successPageRedirectRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SuccessPageRedirectRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSelectedOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserSelectedOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserSelectedOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupledPaymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupledPaymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupledPaymentInfoType"));
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
