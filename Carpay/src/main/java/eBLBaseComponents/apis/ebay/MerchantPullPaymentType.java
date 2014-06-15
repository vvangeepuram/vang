/**
 * MerchantPullPaymentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * MerchantPullPayment 
 * 				Parameters to make initiate a pull payment
 */
public class MerchantPullPaymentType  implements java.io.Serializable {
    /* The amount to charge to the customer. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Only numeric characters and a decimal separator are allowed. Limit:
     * 10 single-byte characters, including two for decimals You must set
     * the currencyID attribute to one of the three-character currency code
     * for any of the supported PayPal currencies. */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* Preapproved Payments billing agreement identification number
     * between the PayPal customer and you. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character limit: 19 single-byte alphanumeric characters.
     * 
     * 						
     * The format of a billing agreement identification number is the single-character
     * prefix B, followed by a hyphen and an alphanumeric character string:
     * 
     * 
     * 						
     * B-unique_alphanumeric_string */
    private java.lang.String mpID;

    /* Specifies type of PayPal payment you require 
     * 
     * 						
     * Optional */
    private eBLBaseComponents.apis.ebay.MerchantPullPaymentCodeType paymentType;

    /* Text entered by the customer in the Note field during enrollment
     * 
     * 
     * 						
     * Optional */
    private java.lang.String memo;

    /* Subject line of confirmation email sent to recipient
     * 			
     * 						
     * Optional */
    private java.lang.String emailSubject;

    /* The tax charged on the transaction
     * 						
     * 						
     * Optional */
    private CoreComponentTypes.apis.ebay.BasicAmountType tax;

    /* Per-transaction shipping charge 
     * 						
     * 						
     * Optional */
    private CoreComponentTypes.apis.ebay.BasicAmountType shipping;

    /* Per-transaction handling charge
     * 									
     * 						
     * Optional */
    private CoreComponentTypes.apis.ebay.BasicAmountType handling;

    /* Name of purchased item
     * 				
     * 						
     * Optional */
    private java.lang.String itemName;

    /* Reference number of purchased item
     * 			
     * 						
     * Optional */
    private java.lang.String itemNumber;

    /* Your invoice number  
     * 	
     * 						
     * Optional */
    private java.lang.String invoice;

    /* Custom annotation field for tracking or other use
     * 				
     * 						
     * Optional */
    private java.lang.String custom;

    /* An identification code for use by third-party applications
     * to identify transactions. 
     * 	
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 32 single-byte alphanumeric characters */
    private java.lang.String buttonSource;

    /* Passed in soft descriptor string to be appended. 
     * 	
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: single-byte alphanumeric characters */
    private java.lang.String softDescriptor;

    public MerchantPullPaymentType() {
    }

    public MerchantPullPaymentType(
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           java.lang.String mpID,
           eBLBaseComponents.apis.ebay.MerchantPullPaymentCodeType paymentType,
           java.lang.String memo,
           java.lang.String emailSubject,
           CoreComponentTypes.apis.ebay.BasicAmountType tax,
           CoreComponentTypes.apis.ebay.BasicAmountType shipping,
           CoreComponentTypes.apis.ebay.BasicAmountType handling,
           java.lang.String itemName,
           java.lang.String itemNumber,
           java.lang.String invoice,
           java.lang.String custom,
           java.lang.String buttonSource,
           java.lang.String softDescriptor) {
           this.amount = amount;
           this.mpID = mpID;
           this.paymentType = paymentType;
           this.memo = memo;
           this.emailSubject = emailSubject;
           this.tax = tax;
           this.shipping = shipping;
           this.handling = handling;
           this.itemName = itemName;
           this.itemNumber = itemNumber;
           this.invoice = invoice;
           this.custom = custom;
           this.buttonSource = buttonSource;
           this.softDescriptor = softDescriptor;
    }


    /**
     * Gets the amount value for this MerchantPullPaymentType.
     * 
     * @return amount   * The amount to charge to the customer. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Only numeric characters and a decimal separator are allowed. Limit:
     * 10 single-byte characters, including two for decimals You must set
     * the currencyID attribute to one of the three-character currency code
     * for any of the supported PayPal currencies.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this MerchantPullPaymentType.
     * 
     * @param amount   * The amount to charge to the customer. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Only numeric characters and a decimal separator are allowed. Limit:
     * 10 single-byte characters, including two for decimals You must set
     * the currencyID attribute to one of the three-character currency code
     * for any of the supported PayPal currencies.
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the mpID value for this MerchantPullPaymentType.
     * 
     * @return mpID   * Preapproved Payments billing agreement identification number
     * between the PayPal customer and you. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character limit: 19 single-byte alphanumeric characters.
     * 
     * 						
     * The format of a billing agreement identification number is the single-character
     * prefix B, followed by a hyphen and an alphanumeric character string:
     * 
     * 
     * 						
     * B-unique_alphanumeric_string
     */
    public java.lang.String getMpID() {
        return mpID;
    }


    /**
     * Sets the mpID value for this MerchantPullPaymentType.
     * 
     * @param mpID   * Preapproved Payments billing agreement identification number
     * between the PayPal customer and you. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character limit: 19 single-byte alphanumeric characters.
     * 
     * 						
     * The format of a billing agreement identification number is the single-character
     * prefix B, followed by a hyphen and an alphanumeric character string:
     * 
     * 
     * 						
     * B-unique_alphanumeric_string
     */
    public void setMpID(java.lang.String mpID) {
        this.mpID = mpID;
    }


    /**
     * Gets the paymentType value for this MerchantPullPaymentType.
     * 
     * @return paymentType   * Specifies type of PayPal payment you require 
     * 
     * 						
     * Optional
     */
    public eBLBaseComponents.apis.ebay.MerchantPullPaymentCodeType getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this MerchantPullPaymentType.
     * 
     * @param paymentType   * Specifies type of PayPal payment you require 
     * 
     * 						
     * Optional
     */
    public void setPaymentType(eBLBaseComponents.apis.ebay.MerchantPullPaymentCodeType paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the memo value for this MerchantPullPaymentType.
     * 
     * @return memo   * Text entered by the customer in the Note field during enrollment
     * 
     * 
     * 						
     * Optional
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this MerchantPullPaymentType.
     * 
     * @param memo   * Text entered by the customer in the Note field during enrollment
     * 
     * 
     * 						
     * Optional
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the emailSubject value for this MerchantPullPaymentType.
     * 
     * @return emailSubject   * Subject line of confirmation email sent to recipient
     * 			
     * 						
     * Optional
     */
    public java.lang.String getEmailSubject() {
        return emailSubject;
    }


    /**
     * Sets the emailSubject value for this MerchantPullPaymentType.
     * 
     * @param emailSubject   * Subject line of confirmation email sent to recipient
     * 			
     * 						
     * Optional
     */
    public void setEmailSubject(java.lang.String emailSubject) {
        this.emailSubject = emailSubject;
    }


    /**
     * Gets the tax value for this MerchantPullPaymentType.
     * 
     * @return tax   * The tax charged on the transaction
     * 						
     * 						
     * Optional
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this MerchantPullPaymentType.
     * 
     * @param tax   * The tax charged on the transaction
     * 						
     * 						
     * Optional
     */
    public void setTax(CoreComponentTypes.apis.ebay.BasicAmountType tax) {
        this.tax = tax;
    }


    /**
     * Gets the shipping value for this MerchantPullPaymentType.
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
     * Sets the shipping value for this MerchantPullPaymentType.
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
     * Gets the handling value for this MerchantPullPaymentType.
     * 
     * @return handling   * Per-transaction handling charge
     * 									
     * 						
     * Optional
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getHandling() {
        return handling;
    }


    /**
     * Sets the handling value for this MerchantPullPaymentType.
     * 
     * @param handling   * Per-transaction handling charge
     * 									
     * 						
     * Optional
     */
    public void setHandling(CoreComponentTypes.apis.ebay.BasicAmountType handling) {
        this.handling = handling;
    }


    /**
     * Gets the itemName value for this MerchantPullPaymentType.
     * 
     * @return itemName   * Name of purchased item
     * 				
     * 						
     * Optional
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this MerchantPullPaymentType.
     * 
     * @param itemName   * Name of purchased item
     * 				
     * 						
     * Optional
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the itemNumber value for this MerchantPullPaymentType.
     * 
     * @return itemNumber   * Reference number of purchased item
     * 			
     * 						
     * Optional
     */
    public java.lang.String getItemNumber() {
        return itemNumber;
    }


    /**
     * Sets the itemNumber value for this MerchantPullPaymentType.
     * 
     * @param itemNumber   * Reference number of purchased item
     * 			
     * 						
     * Optional
     */
    public void setItemNumber(java.lang.String itemNumber) {
        this.itemNumber = itemNumber;
    }


    /**
     * Gets the invoice value for this MerchantPullPaymentType.
     * 
     * @return invoice   * Your invoice number  
     * 	
     * 						
     * Optional
     */
    public java.lang.String getInvoice() {
        return invoice;
    }


    /**
     * Sets the invoice value for this MerchantPullPaymentType.
     * 
     * @param invoice   * Your invoice number  
     * 	
     * 						
     * Optional
     */
    public void setInvoice(java.lang.String invoice) {
        this.invoice = invoice;
    }


    /**
     * Gets the custom value for this MerchantPullPaymentType.
     * 
     * @return custom   * Custom annotation field for tracking or other use
     * 				
     * 						
     * Optional
     */
    public java.lang.String getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this MerchantPullPaymentType.
     * 
     * @param custom   * Custom annotation field for tracking or other use
     * 				
     * 						
     * Optional
     */
    public void setCustom(java.lang.String custom) {
        this.custom = custom;
    }


    /**
     * Gets the buttonSource value for this MerchantPullPaymentType.
     * 
     * @return buttonSource   * An identification code for use by third-party applications
     * to identify transactions. 
     * 	
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 32 single-byte alphanumeric characters
     */
    public java.lang.String getButtonSource() {
        return buttonSource;
    }


    /**
     * Sets the buttonSource value for this MerchantPullPaymentType.
     * 
     * @param buttonSource   * An identification code for use by third-party applications
     * to identify transactions. 
     * 	
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 32 single-byte alphanumeric characters
     */
    public void setButtonSource(java.lang.String buttonSource) {
        this.buttonSource = buttonSource;
    }


    /**
     * Gets the softDescriptor value for this MerchantPullPaymentType.
     * 
     * @return softDescriptor   * Passed in soft descriptor string to be appended. 
     * 	
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: single-byte alphanumeric characters
     */
    public java.lang.String getSoftDescriptor() {
        return softDescriptor;
    }


    /**
     * Sets the softDescriptor value for this MerchantPullPaymentType.
     * 
     * @param softDescriptor   * Passed in soft descriptor string to be appended. 
     * 	
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: single-byte alphanumeric characters
     */
    public void setSoftDescriptor(java.lang.String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantPullPaymentType)) return false;
        MerchantPullPaymentType other = (MerchantPullPaymentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.mpID==null && other.getMpID()==null) || 
             (this.mpID!=null &&
              this.mpID.equals(other.getMpID()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.emailSubject==null && other.getEmailSubject()==null) || 
             (this.emailSubject!=null &&
              this.emailSubject.equals(other.getEmailSubject()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.shipping==null && other.getShipping()==null) || 
             (this.shipping!=null &&
              this.shipping.equals(other.getShipping()))) &&
            ((this.handling==null && other.getHandling()==null) || 
             (this.handling!=null &&
              this.handling.equals(other.getHandling()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.itemNumber==null && other.getItemNumber()==null) || 
             (this.itemNumber!=null &&
              this.itemNumber.equals(other.getItemNumber()))) &&
            ((this.invoice==null && other.getInvoice()==null) || 
             (this.invoice!=null &&
              this.invoice.equals(other.getInvoice()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
            ((this.buttonSource==null && other.getButtonSource()==null) || 
             (this.buttonSource!=null &&
              this.buttonSource.equals(other.getButtonSource()))) &&
            ((this.softDescriptor==null && other.getSoftDescriptor()==null) || 
             (this.softDescriptor!=null &&
              this.softDescriptor.equals(other.getSoftDescriptor())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getMpID() != null) {
            _hashCode += getMpID().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getEmailSubject() != null) {
            _hashCode += getEmailSubject().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getShipping() != null) {
            _hashCode += getShipping().hashCode();
        }
        if (getHandling() != null) {
            _hashCode += getHandling().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getItemNumber() != null) {
            _hashCode += getItemNumber().hashCode();
        }
        if (getInvoice() != null) {
            _hashCode += getInvoice().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        if (getButtonSource() != null) {
            _hashCode += getButtonSource().hashCode();
        }
        if (getSoftDescriptor() != null) {
            _hashCode += getSoftDescriptor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchantPullPaymentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullPaymentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MpID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullPaymentCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EmailSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("handling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Handling"));
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
        elemField.setFieldName("invoice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Invoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SoftDescriptor"));
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
