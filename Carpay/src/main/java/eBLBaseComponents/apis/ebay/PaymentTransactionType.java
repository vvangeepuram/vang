/**
 * PaymentTransactionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * PaymentTransactionType 
 * 				Information about a PayPal payment from the seller side
 */
public class PaymentTransactionType  implements java.io.Serializable {
    /* Information about the recipient of the payment */
    private eBLBaseComponents.apis.ebay.ReceiverInfoType receiverInfo;

    /* Information about the payer */
    private eBLBaseComponents.apis.ebay.PayerInfoType payerInfo;

    /* This field is for holding ReferenceId for shippment sent from
     * Merchant to the 3rd Party */
    private java.lang.String TPLReferenceID;

    /* Information about the transaction */
    private eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo;

    /* Information about an individual item in the transaction */
    private eBLBaseComponents.apis.ebay.PaymentItemInfoType paymentItemInfo;

    /* Information about an individual Offer and Coupon information
     * in the transaction */
    private eBLBaseComponents.apis.ebay.OfferCouponInfoType offerCouponInfo;

    /* Information about Secondary Address */
    private eBLBaseComponents.apis.ebay.AddressType secondaryAddress;

    /* Information about the user selected options. */
    private eBLBaseComponents.apis.ebay.UserSelectedOptionType userSelectedOptions;

    /* Information about the Gift message. */
    private java.lang.String giftMessage;

    /* Information about the Gift receipt. */
    private java.lang.String giftReceipt;

    /* Information about the Gift Wrap name. */
    private java.lang.String giftWrapName;

    /* Information about the Gift Wrap amount. */
    private CoreComponentTypes.apis.ebay.BasicAmountType giftWrapAmount;

    /* Information about the Buyer email. */
    private java.lang.String buyerEmailOptIn;

    /* Information about the survey question. */
    private java.lang.String surveyQuestion;

    /* Information about the survey choice selected by the user. */
    private java.lang.String[] surveyChoiceSelected;

    public PaymentTransactionType() {
    }

    public PaymentTransactionType(
           eBLBaseComponents.apis.ebay.ReceiverInfoType receiverInfo,
           eBLBaseComponents.apis.ebay.PayerInfoType payerInfo,
           java.lang.String TPLReferenceID,
           eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo,
           eBLBaseComponents.apis.ebay.PaymentItemInfoType paymentItemInfo,
           eBLBaseComponents.apis.ebay.OfferCouponInfoType offerCouponInfo,
           eBLBaseComponents.apis.ebay.AddressType secondaryAddress,
           eBLBaseComponents.apis.ebay.UserSelectedOptionType userSelectedOptions,
           java.lang.String giftMessage,
           java.lang.String giftReceipt,
           java.lang.String giftWrapName,
           CoreComponentTypes.apis.ebay.BasicAmountType giftWrapAmount,
           java.lang.String buyerEmailOptIn,
           java.lang.String surveyQuestion,
           java.lang.String[] surveyChoiceSelected) {
           this.receiverInfo = receiverInfo;
           this.payerInfo = payerInfo;
           this.TPLReferenceID = TPLReferenceID;
           this.paymentInfo = paymentInfo;
           this.paymentItemInfo = paymentItemInfo;
           this.offerCouponInfo = offerCouponInfo;
           this.secondaryAddress = secondaryAddress;
           this.userSelectedOptions = userSelectedOptions;
           this.giftMessage = giftMessage;
           this.giftReceipt = giftReceipt;
           this.giftWrapName = giftWrapName;
           this.giftWrapAmount = giftWrapAmount;
           this.buyerEmailOptIn = buyerEmailOptIn;
           this.surveyQuestion = surveyQuestion;
           this.surveyChoiceSelected = surveyChoiceSelected;
    }


    /**
     * Gets the receiverInfo value for this PaymentTransactionType.
     * 
     * @return receiverInfo   * Information about the recipient of the payment
     */
    public eBLBaseComponents.apis.ebay.ReceiverInfoType getReceiverInfo() {
        return receiverInfo;
    }


    /**
     * Sets the receiverInfo value for this PaymentTransactionType.
     * 
     * @param receiverInfo   * Information about the recipient of the payment
     */
    public void setReceiverInfo(eBLBaseComponents.apis.ebay.ReceiverInfoType receiverInfo) {
        this.receiverInfo = receiverInfo;
    }


    /**
     * Gets the payerInfo value for this PaymentTransactionType.
     * 
     * @return payerInfo   * Information about the payer
     */
    public eBLBaseComponents.apis.ebay.PayerInfoType getPayerInfo() {
        return payerInfo;
    }


    /**
     * Sets the payerInfo value for this PaymentTransactionType.
     * 
     * @param payerInfo   * Information about the payer
     */
    public void setPayerInfo(eBLBaseComponents.apis.ebay.PayerInfoType payerInfo) {
        this.payerInfo = payerInfo;
    }


    /**
     * Gets the TPLReferenceID value for this PaymentTransactionType.
     * 
     * @return TPLReferenceID   * This field is for holding ReferenceId for shippment sent from
     * Merchant to the 3rd Party
     */
    public java.lang.String getTPLReferenceID() {
        return TPLReferenceID;
    }


    /**
     * Sets the TPLReferenceID value for this PaymentTransactionType.
     * 
     * @param TPLReferenceID   * This field is for holding ReferenceId for shippment sent from
     * Merchant to the 3rd Party
     */
    public void setTPLReferenceID(java.lang.String TPLReferenceID) {
        this.TPLReferenceID = TPLReferenceID;
    }


    /**
     * Gets the paymentInfo value for this PaymentTransactionType.
     * 
     * @return paymentInfo   * Information about the transaction
     */
    public eBLBaseComponents.apis.ebay.PaymentInfoType getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this PaymentTransactionType.
     * 
     * @param paymentInfo   * Information about the transaction
     */
    public void setPaymentInfo(eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo) {
        this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the paymentItemInfo value for this PaymentTransactionType.
     * 
     * @return paymentItemInfo   * Information about an individual item in the transaction
     */
    public eBLBaseComponents.apis.ebay.PaymentItemInfoType getPaymentItemInfo() {
        return paymentItemInfo;
    }


    /**
     * Sets the paymentItemInfo value for this PaymentTransactionType.
     * 
     * @param paymentItemInfo   * Information about an individual item in the transaction
     */
    public void setPaymentItemInfo(eBLBaseComponents.apis.ebay.PaymentItemInfoType paymentItemInfo) {
        this.paymentItemInfo = paymentItemInfo;
    }


    /**
     * Gets the offerCouponInfo value for this PaymentTransactionType.
     * 
     * @return offerCouponInfo   * Information about an individual Offer and Coupon information
     * in the transaction
     */
    public eBLBaseComponents.apis.ebay.OfferCouponInfoType getOfferCouponInfo() {
        return offerCouponInfo;
    }


    /**
     * Sets the offerCouponInfo value for this PaymentTransactionType.
     * 
     * @param offerCouponInfo   * Information about an individual Offer and Coupon information
     * in the transaction
     */
    public void setOfferCouponInfo(eBLBaseComponents.apis.ebay.OfferCouponInfoType offerCouponInfo) {
        this.offerCouponInfo = offerCouponInfo;
    }


    /**
     * Gets the secondaryAddress value for this PaymentTransactionType.
     * 
     * @return secondaryAddress   * Information about Secondary Address
     */
    public eBLBaseComponents.apis.ebay.AddressType getSecondaryAddress() {
        return secondaryAddress;
    }


    /**
     * Sets the secondaryAddress value for this PaymentTransactionType.
     * 
     * @param secondaryAddress   * Information about Secondary Address
     */
    public void setSecondaryAddress(eBLBaseComponents.apis.ebay.AddressType secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }


    /**
     * Gets the userSelectedOptions value for this PaymentTransactionType.
     * 
     * @return userSelectedOptions   * Information about the user selected options.
     */
    public eBLBaseComponents.apis.ebay.UserSelectedOptionType getUserSelectedOptions() {
        return userSelectedOptions;
    }


    /**
     * Sets the userSelectedOptions value for this PaymentTransactionType.
     * 
     * @param userSelectedOptions   * Information about the user selected options.
     */
    public void setUserSelectedOptions(eBLBaseComponents.apis.ebay.UserSelectedOptionType userSelectedOptions) {
        this.userSelectedOptions = userSelectedOptions;
    }


    /**
     * Gets the giftMessage value for this PaymentTransactionType.
     * 
     * @return giftMessage   * Information about the Gift message.
     */
    public java.lang.String getGiftMessage() {
        return giftMessage;
    }


    /**
     * Sets the giftMessage value for this PaymentTransactionType.
     * 
     * @param giftMessage   * Information about the Gift message.
     */
    public void setGiftMessage(java.lang.String giftMessage) {
        this.giftMessage = giftMessage;
    }


    /**
     * Gets the giftReceipt value for this PaymentTransactionType.
     * 
     * @return giftReceipt   * Information about the Gift receipt.
     */
    public java.lang.String getGiftReceipt() {
        return giftReceipt;
    }


    /**
     * Sets the giftReceipt value for this PaymentTransactionType.
     * 
     * @param giftReceipt   * Information about the Gift receipt.
     */
    public void setGiftReceipt(java.lang.String giftReceipt) {
        this.giftReceipt = giftReceipt;
    }


    /**
     * Gets the giftWrapName value for this PaymentTransactionType.
     * 
     * @return giftWrapName   * Information about the Gift Wrap name.
     */
    public java.lang.String getGiftWrapName() {
        return giftWrapName;
    }


    /**
     * Sets the giftWrapName value for this PaymentTransactionType.
     * 
     * @param giftWrapName   * Information about the Gift Wrap name.
     */
    public void setGiftWrapName(java.lang.String giftWrapName) {
        this.giftWrapName = giftWrapName;
    }


    /**
     * Gets the giftWrapAmount value for this PaymentTransactionType.
     * 
     * @return giftWrapAmount   * Information about the Gift Wrap amount.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getGiftWrapAmount() {
        return giftWrapAmount;
    }


    /**
     * Sets the giftWrapAmount value for this PaymentTransactionType.
     * 
     * @param giftWrapAmount   * Information about the Gift Wrap amount.
     */
    public void setGiftWrapAmount(CoreComponentTypes.apis.ebay.BasicAmountType giftWrapAmount) {
        this.giftWrapAmount = giftWrapAmount;
    }


    /**
     * Gets the buyerEmailOptIn value for this PaymentTransactionType.
     * 
     * @return buyerEmailOptIn   * Information about the Buyer email.
     */
    public java.lang.String getBuyerEmailOptIn() {
        return buyerEmailOptIn;
    }


    /**
     * Sets the buyerEmailOptIn value for this PaymentTransactionType.
     * 
     * @param buyerEmailOptIn   * Information about the Buyer email.
     */
    public void setBuyerEmailOptIn(java.lang.String buyerEmailOptIn) {
        this.buyerEmailOptIn = buyerEmailOptIn;
    }


    /**
     * Gets the surveyQuestion value for this PaymentTransactionType.
     * 
     * @return surveyQuestion   * Information about the survey question.
     */
    public java.lang.String getSurveyQuestion() {
        return surveyQuestion;
    }


    /**
     * Sets the surveyQuestion value for this PaymentTransactionType.
     * 
     * @param surveyQuestion   * Information about the survey question.
     */
    public void setSurveyQuestion(java.lang.String surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }


    /**
     * Gets the surveyChoiceSelected value for this PaymentTransactionType.
     * 
     * @return surveyChoiceSelected   * Information about the survey choice selected by the user.
     */
    public java.lang.String[] getSurveyChoiceSelected() {
        return surveyChoiceSelected;
    }


    /**
     * Sets the surveyChoiceSelected value for this PaymentTransactionType.
     * 
     * @param surveyChoiceSelected   * Information about the survey choice selected by the user.
     */
    public void setSurveyChoiceSelected(java.lang.String[] surveyChoiceSelected) {
        this.surveyChoiceSelected = surveyChoiceSelected;
    }

    public java.lang.String getSurveyChoiceSelected(int i) {
        return this.surveyChoiceSelected[i];
    }

    public void setSurveyChoiceSelected(int i, java.lang.String _value) {
        this.surveyChoiceSelected[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentTransactionType)) return false;
        PaymentTransactionType other = (PaymentTransactionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiverInfo==null && other.getReceiverInfo()==null) || 
             (this.receiverInfo!=null &&
              this.receiverInfo.equals(other.getReceiverInfo()))) &&
            ((this.payerInfo==null && other.getPayerInfo()==null) || 
             (this.payerInfo!=null &&
              this.payerInfo.equals(other.getPayerInfo()))) &&
            ((this.TPLReferenceID==null && other.getTPLReferenceID()==null) || 
             (this.TPLReferenceID!=null &&
              this.TPLReferenceID.equals(other.getTPLReferenceID()))) &&
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo()))) &&
            ((this.paymentItemInfo==null && other.getPaymentItemInfo()==null) || 
             (this.paymentItemInfo!=null &&
              this.paymentItemInfo.equals(other.getPaymentItemInfo()))) &&
            ((this.offerCouponInfo==null && other.getOfferCouponInfo()==null) || 
             (this.offerCouponInfo!=null &&
              this.offerCouponInfo.equals(other.getOfferCouponInfo()))) &&
            ((this.secondaryAddress==null && other.getSecondaryAddress()==null) || 
             (this.secondaryAddress!=null &&
              this.secondaryAddress.equals(other.getSecondaryAddress()))) &&
            ((this.userSelectedOptions==null && other.getUserSelectedOptions()==null) || 
             (this.userSelectedOptions!=null &&
              this.userSelectedOptions.equals(other.getUserSelectedOptions()))) &&
            ((this.giftMessage==null && other.getGiftMessage()==null) || 
             (this.giftMessage!=null &&
              this.giftMessage.equals(other.getGiftMessage()))) &&
            ((this.giftReceipt==null && other.getGiftReceipt()==null) || 
             (this.giftReceipt!=null &&
              this.giftReceipt.equals(other.getGiftReceipt()))) &&
            ((this.giftWrapName==null && other.getGiftWrapName()==null) || 
             (this.giftWrapName!=null &&
              this.giftWrapName.equals(other.getGiftWrapName()))) &&
            ((this.giftWrapAmount==null && other.getGiftWrapAmount()==null) || 
             (this.giftWrapAmount!=null &&
              this.giftWrapAmount.equals(other.getGiftWrapAmount()))) &&
            ((this.buyerEmailOptIn==null && other.getBuyerEmailOptIn()==null) || 
             (this.buyerEmailOptIn!=null &&
              this.buyerEmailOptIn.equals(other.getBuyerEmailOptIn()))) &&
            ((this.surveyQuestion==null && other.getSurveyQuestion()==null) || 
             (this.surveyQuestion!=null &&
              this.surveyQuestion.equals(other.getSurveyQuestion()))) &&
            ((this.surveyChoiceSelected==null && other.getSurveyChoiceSelected()==null) || 
             (this.surveyChoiceSelected!=null &&
              java.util.Arrays.equals(this.surveyChoiceSelected, other.getSurveyChoiceSelected())));
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
        if (getReceiverInfo() != null) {
            _hashCode += getReceiverInfo().hashCode();
        }
        if (getPayerInfo() != null) {
            _hashCode += getPayerInfo().hashCode();
        }
        if (getTPLReferenceID() != null) {
            _hashCode += getTPLReferenceID().hashCode();
        }
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        if (getPaymentItemInfo() != null) {
            _hashCode += getPaymentItemInfo().hashCode();
        }
        if (getOfferCouponInfo() != null) {
            _hashCode += getOfferCouponInfo().hashCode();
        }
        if (getSecondaryAddress() != null) {
            _hashCode += getSecondaryAddress().hashCode();
        }
        if (getUserSelectedOptions() != null) {
            _hashCode += getUserSelectedOptions().hashCode();
        }
        if (getGiftMessage() != null) {
            _hashCode += getGiftMessage().hashCode();
        }
        if (getGiftReceipt() != null) {
            _hashCode += getGiftReceipt().hashCode();
        }
        if (getGiftWrapName() != null) {
            _hashCode += getGiftWrapName().hashCode();
        }
        if (getGiftWrapAmount() != null) {
            _hashCode += getGiftWrapAmount().hashCode();
        }
        if (getBuyerEmailOptIn() != null) {
            _hashCode += getBuyerEmailOptIn().hashCode();
        }
        if (getSurveyQuestion() != null) {
            _hashCode += getSurveyQuestion().hashCode();
        }
        if (getSurveyChoiceSelected() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSurveyChoiceSelected());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSurveyChoiceSelected(), i);
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
        new org.apache.axis.description.TypeDesc(PaymentTransactionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReceiverInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReceiverInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPLReferenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TPLReferenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentItemInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentItemInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentItemInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerCouponInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OfferCouponInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OfferCouponInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SecondaryAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
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
        elemField.setFieldName("giftMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftWrapName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftWrapName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftWrapAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftWrapAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerEmailOptIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerEmailOptIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyQuestion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SurveyQuestion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyChoiceSelected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SurveyChoiceSelected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
