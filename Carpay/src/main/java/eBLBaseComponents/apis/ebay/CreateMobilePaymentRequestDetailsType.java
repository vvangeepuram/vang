/**
 * CreateMobilePaymentRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class CreateMobilePaymentRequestDetailsType  implements java.io.Serializable {
    /* Type of the payment */
    private eBLBaseComponents.apis.ebay.MobilePaymentCodeType paymentType;

    /* How you want to obtain payment.  Defaults to Sale.
     * 
     * 						
     * 						
     * 						
     * 						
     * Authorization indicates that this payment is a basic authorization
     * subject to settlement with PayPal Authorization and Capture.
     * 
     * 						
     * Sale indicates that this is a final sale for which you are requesting
     * payment. */
    private eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction;

    /* Phone number of the user making the payment. */
    private eBLBaseComponents.apis.ebay.PhoneNumberType senderPhone;

    /* Type of recipient specified, i.e., phone number or email address */
    private eBLBaseComponents.apis.ebay.MobileRecipientCodeType recipientType;

    /* Email address of the recipient */
    private java.lang.String recipientEmail;

    /* Phone number of the recipipent */
    private eBLBaseComponents.apis.ebay.PhoneNumberType recipientPhone;

    /* Amount of item before tax and shipping */
    private CoreComponentTypes.apis.ebay.BasicAmountType itemAmount;

    /* The tax charged on the transaction
     * Tax
     * 
     * 						
     * Optional */
    private CoreComponentTypes.apis.ebay.BasicAmountType tax;

    /* Per-transaction shipping charge
     * 
     * 						
     * Optional */
    private CoreComponentTypes.apis.ebay.BasicAmountType shipping;

    /* Name of the item being ordered
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters */
    private java.lang.String itemName;

    /* SKU of the item being ordered
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters */
    private java.lang.String itemNumber;

    /* Memo entered by sender in PayPal Website Payments note field.
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters */
    private java.lang.String note;

    /* Unique ID for the order.  Required for non-P2P transactions
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters */
    private java.lang.String customID;

    /* Indicates whether the sender's phone number will be shared
     * with recipient
     * 
     * 						
     * Optional */
    private java.math.BigInteger sharePhoneNumber;

    /* Indicates whether the sender's home address will be shared
     * with recipient
     * 
     * 						
     * Optional */
    private java.math.BigInteger shareHomeAddress;

    public CreateMobilePaymentRequestDetailsType() {
    }

    public CreateMobilePaymentRequestDetailsType(
           eBLBaseComponents.apis.ebay.MobilePaymentCodeType paymentType,
           eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction,
           eBLBaseComponents.apis.ebay.PhoneNumberType senderPhone,
           eBLBaseComponents.apis.ebay.MobileRecipientCodeType recipientType,
           java.lang.String recipientEmail,
           eBLBaseComponents.apis.ebay.PhoneNumberType recipientPhone,
           CoreComponentTypes.apis.ebay.BasicAmountType itemAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType tax,
           CoreComponentTypes.apis.ebay.BasicAmountType shipping,
           java.lang.String itemName,
           java.lang.String itemNumber,
           java.lang.String note,
           java.lang.String customID,
           java.math.BigInteger sharePhoneNumber,
           java.math.BigInteger shareHomeAddress) {
           this.paymentType = paymentType;
           this.paymentAction = paymentAction;
           this.senderPhone = senderPhone;
           this.recipientType = recipientType;
           this.recipientEmail = recipientEmail;
           this.recipientPhone = recipientPhone;
           this.itemAmount = itemAmount;
           this.tax = tax;
           this.shipping = shipping;
           this.itemName = itemName;
           this.itemNumber = itemNumber;
           this.note = note;
           this.customID = customID;
           this.sharePhoneNumber = sharePhoneNumber;
           this.shareHomeAddress = shareHomeAddress;
    }


    /**
     * Gets the paymentType value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return paymentType   * Type of the payment
     */
    public eBLBaseComponents.apis.ebay.MobilePaymentCodeType getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param paymentType   * Type of the payment
     */
    public void setPaymentType(eBLBaseComponents.apis.ebay.MobilePaymentCodeType paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the paymentAction value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return paymentAction   * How you want to obtain payment.  Defaults to Sale.
     * 
     * 						
     * 						
     * 						
     * 						
     * Authorization indicates that this payment is a basic authorization
     * subject to settlement with PayPal Authorization and Capture.
     * 
     * 						
     * Sale indicates that this is a final sale for which you are requesting
     * payment.
     */
    public eBLBaseComponents.apis.ebay.PaymentActionCodeType getPaymentAction() {
        return paymentAction;
    }


    /**
     * Sets the paymentAction value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param paymentAction   * How you want to obtain payment.  Defaults to Sale.
     * 
     * 						
     * 						
     * 						
     * 						
     * Authorization indicates that this payment is a basic authorization
     * subject to settlement with PayPal Authorization and Capture.
     * 
     * 						
     * Sale indicates that this is a final sale for which you are requesting
     * payment.
     */
    public void setPaymentAction(eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction) {
        this.paymentAction = paymentAction;
    }


    /**
     * Gets the senderPhone value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return senderPhone   * Phone number of the user making the payment.
     */
    public eBLBaseComponents.apis.ebay.PhoneNumberType getSenderPhone() {
        return senderPhone;
    }


    /**
     * Sets the senderPhone value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param senderPhone   * Phone number of the user making the payment.
     */
    public void setSenderPhone(eBLBaseComponents.apis.ebay.PhoneNumberType senderPhone) {
        this.senderPhone = senderPhone;
    }


    /**
     * Gets the recipientType value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return recipientType   * Type of recipient specified, i.e., phone number or email address
     */
    public eBLBaseComponents.apis.ebay.MobileRecipientCodeType getRecipientType() {
        return recipientType;
    }


    /**
     * Sets the recipientType value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param recipientType   * Type of recipient specified, i.e., phone number or email address
     */
    public void setRecipientType(eBLBaseComponents.apis.ebay.MobileRecipientCodeType recipientType) {
        this.recipientType = recipientType;
    }


    /**
     * Gets the recipientEmail value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return recipientEmail   * Email address of the recipient
     */
    public java.lang.String getRecipientEmail() {
        return recipientEmail;
    }


    /**
     * Sets the recipientEmail value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param recipientEmail   * Email address of the recipient
     */
    public void setRecipientEmail(java.lang.String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }


    /**
     * Gets the recipientPhone value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return recipientPhone   * Phone number of the recipipent
     */
    public eBLBaseComponents.apis.ebay.PhoneNumberType getRecipientPhone() {
        return recipientPhone;
    }


    /**
     * Sets the recipientPhone value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param recipientPhone   * Phone number of the recipipent
     */
    public void setRecipientPhone(eBLBaseComponents.apis.ebay.PhoneNumberType recipientPhone) {
        this.recipientPhone = recipientPhone;
    }


    /**
     * Gets the itemAmount value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return itemAmount   * Amount of item before tax and shipping
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getItemAmount() {
        return itemAmount;
    }


    /**
     * Sets the itemAmount value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param itemAmount   * Amount of item before tax and shipping
     */
    public void setItemAmount(CoreComponentTypes.apis.ebay.BasicAmountType itemAmount) {
        this.itemAmount = itemAmount;
    }


    /**
     * Gets the tax value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return tax   * The tax charged on the transaction
     * Tax
     * 
     * 						
     * Optional
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param tax   * The tax charged on the transaction
     * Tax
     * 
     * 						
     * Optional
     */
    public void setTax(CoreComponentTypes.apis.ebay.BasicAmountType tax) {
        this.tax = tax;
    }


    /**
     * Gets the shipping value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return shipping   * Per-transaction shipping charge
     * 
     * 						
     * Optional
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getShipping() {
        return shipping;
    }


    /**
     * Sets the shipping value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param shipping   * Per-transaction shipping charge
     * 
     * 						
     * Optional
     */
    public void setShipping(CoreComponentTypes.apis.ebay.BasicAmountType shipping) {
        this.shipping = shipping;
    }


    /**
     * Gets the itemName value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return itemName   * Name of the item being ordered
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param itemName   * Name of the item being ordered
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the itemNumber value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return itemNumber   * SKU of the item being ordered
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public java.lang.String getItemNumber() {
        return itemNumber;
    }


    /**
     * Sets the itemNumber value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param itemNumber   * SKU of the item being ordered
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public void setItemNumber(java.lang.String itemNumber) {
        this.itemNumber = itemNumber;
    }


    /**
     * Gets the note value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return note   * Memo entered by sender in PayPal Website Payments note field.
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param note   * Memo entered by sender in PayPal Website Payments note field.
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the customID value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return customID   * Unique ID for the order.  Required for non-P2P transactions
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public java.lang.String getCustomID() {
        return customID;
    }


    /**
     * Sets the customID value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param customID   * Unique ID for the order.  Required for non-P2P transactions
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public void setCustomID(java.lang.String customID) {
        this.customID = customID;
    }


    /**
     * Gets the sharePhoneNumber value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return sharePhoneNumber   * Indicates whether the sender's phone number will be shared
     * with recipient
     * 
     * 						
     * Optional
     */
    public java.math.BigInteger getSharePhoneNumber() {
        return sharePhoneNumber;
    }


    /**
     * Sets the sharePhoneNumber value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param sharePhoneNumber   * Indicates whether the sender's phone number will be shared
     * with recipient
     * 
     * 						
     * Optional
     */
    public void setSharePhoneNumber(java.math.BigInteger sharePhoneNumber) {
        this.sharePhoneNumber = sharePhoneNumber;
    }


    /**
     * Gets the shareHomeAddress value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @return shareHomeAddress   * Indicates whether the sender's home address will be shared
     * with recipient
     * 
     * 						
     * Optional
     */
    public java.math.BigInteger getShareHomeAddress() {
        return shareHomeAddress;
    }


    /**
     * Sets the shareHomeAddress value for this CreateMobilePaymentRequestDetailsType.
     * 
     * @param shareHomeAddress   * Indicates whether the sender's home address will be shared
     * with recipient
     * 
     * 						
     * Optional
     */
    public void setShareHomeAddress(java.math.BigInteger shareHomeAddress) {
        this.shareHomeAddress = shareHomeAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateMobilePaymentRequestDetailsType)) return false;
        CreateMobilePaymentRequestDetailsType other = (CreateMobilePaymentRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.paymentAction==null && other.getPaymentAction()==null) || 
             (this.paymentAction!=null &&
              this.paymentAction.equals(other.getPaymentAction()))) &&
            ((this.senderPhone==null && other.getSenderPhone()==null) || 
             (this.senderPhone!=null &&
              this.senderPhone.equals(other.getSenderPhone()))) &&
            ((this.recipientType==null && other.getRecipientType()==null) || 
             (this.recipientType!=null &&
              this.recipientType.equals(other.getRecipientType()))) &&
            ((this.recipientEmail==null && other.getRecipientEmail()==null) || 
             (this.recipientEmail!=null &&
              this.recipientEmail.equals(other.getRecipientEmail()))) &&
            ((this.recipientPhone==null && other.getRecipientPhone()==null) || 
             (this.recipientPhone!=null &&
              this.recipientPhone.equals(other.getRecipientPhone()))) &&
            ((this.itemAmount==null && other.getItemAmount()==null) || 
             (this.itemAmount!=null &&
              this.itemAmount.equals(other.getItemAmount()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.shipping==null && other.getShipping()==null) || 
             (this.shipping!=null &&
              this.shipping.equals(other.getShipping()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.itemNumber==null && other.getItemNumber()==null) || 
             (this.itemNumber!=null &&
              this.itemNumber.equals(other.getItemNumber()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.customID==null && other.getCustomID()==null) || 
             (this.customID!=null &&
              this.customID.equals(other.getCustomID()))) &&
            ((this.sharePhoneNumber==null && other.getSharePhoneNumber()==null) || 
             (this.sharePhoneNumber!=null &&
              this.sharePhoneNumber.equals(other.getSharePhoneNumber()))) &&
            ((this.shareHomeAddress==null && other.getShareHomeAddress()==null) || 
             (this.shareHomeAddress!=null &&
              this.shareHomeAddress.equals(other.getShareHomeAddress())));
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
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getPaymentAction() != null) {
            _hashCode += getPaymentAction().hashCode();
        }
        if (getSenderPhone() != null) {
            _hashCode += getSenderPhone().hashCode();
        }
        if (getRecipientType() != null) {
            _hashCode += getRecipientType().hashCode();
        }
        if (getRecipientEmail() != null) {
            _hashCode += getRecipientEmail().hashCode();
        }
        if (getRecipientPhone() != null) {
            _hashCode += getRecipientPhone().hashCode();
        }
        if (getItemAmount() != null) {
            _hashCode += getItemAmount().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getShipping() != null) {
            _hashCode += getShipping().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getItemNumber() != null) {
            _hashCode += getItemNumber().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getCustomID() != null) {
            _hashCode += getCustomID().hashCode();
        }
        if (getSharePhoneNumber() != null) {
            _hashCode += getSharePhoneNumber().hashCode();
        }
        if (getShareHomeAddress() != null) {
            _hashCode += getShareHomeAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateMobilePaymentRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreateMobilePaymentRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MobilePaymentCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentActionCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SenderPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PhoneNumberType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecipientType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MobileRecipientCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecipientEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecipientPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PhoneNumberType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Shipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemNumber"));
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
        elemField.setFieldName("customID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CustomID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharePhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SharePhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shareHomeAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShareHomeAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
