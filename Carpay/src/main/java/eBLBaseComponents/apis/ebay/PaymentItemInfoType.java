/**
 * PaymentItemInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * PaymentItemInfoType 
 * 				Information about a PayPal item.
 */
public class PaymentItemInfoType  implements java.io.Serializable {
    /* Invoice number you set in the original transaction.
     * 			
     * 						
     * 			Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String invoiceID;

    /* Custom field you set in the original transaction. 
     * 
     * 						
     * Character length and limitations: 127 single-byte alphanumeric characters */
    private java.lang.String custom;

    /* Memo entered by your customer in PayPal Website Payments note
     * field. 
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters */
    private java.lang.String memo;

    /* Amount of tax charged on transaction */
    private java.lang.String salesTax;

    /* Details about the indivudal purchased item */
    private eBLBaseComponents.apis.ebay.PaymentItemType[] paymentItem;

    /* Information about the transaction if it was created via PayPal
     * Subcriptions */
    private eBLBaseComponents.apis.ebay.SubscriptionInfoType subscription;

    /* Information about the transaction if it was created via an
     * auction */
    private eBLBaseComponents.apis.ebay.AuctionInfoType auction;

    public PaymentItemInfoType() {
    }

    public PaymentItemInfoType(
           java.lang.String invoiceID,
           java.lang.String custom,
           java.lang.String memo,
           java.lang.String salesTax,
           eBLBaseComponents.apis.ebay.PaymentItemType[] paymentItem,
           eBLBaseComponents.apis.ebay.SubscriptionInfoType subscription,
           eBLBaseComponents.apis.ebay.AuctionInfoType auction) {
           this.invoiceID = invoiceID;
           this.custom = custom;
           this.memo = memo;
           this.salesTax = salesTax;
           this.paymentItem = paymentItem;
           this.subscription = subscription;
           this.auction = auction;
    }


    /**
     * Gets the invoiceID value for this PaymentItemInfoType.
     * 
     * @return invoiceID   * Invoice number you set in the original transaction.
     * 			
     * 						
     * 			Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getInvoiceID() {
        return invoiceID;
    }


    /**
     * Sets the invoiceID value for this PaymentItemInfoType.
     * 
     * @param invoiceID   * Invoice number you set in the original transaction.
     * 			
     * 						
     * 			Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setInvoiceID(java.lang.String invoiceID) {
        this.invoiceID = invoiceID;
    }


    /**
     * Gets the custom value for this PaymentItemInfoType.
     * 
     * @return custom   * Custom field you set in the original transaction. 
     * 
     * 						
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public java.lang.String getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this PaymentItemInfoType.
     * 
     * @param custom   * Custom field you set in the original transaction. 
     * 
     * 						
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public void setCustom(java.lang.String custom) {
        this.custom = custom;
    }


    /**
     * Gets the memo value for this PaymentItemInfoType.
     * 
     * @return memo   * Memo entered by your customer in PayPal Website Payments note
     * field. 
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this PaymentItemInfoType.
     * 
     * @param memo   * Memo entered by your customer in PayPal Website Payments note
     * field. 
     * 
     * 						
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the salesTax value for this PaymentItemInfoType.
     * 
     * @return salesTax   * Amount of tax charged on transaction
     */
    public java.lang.String getSalesTax() {
        return salesTax;
    }


    /**
     * Sets the salesTax value for this PaymentItemInfoType.
     * 
     * @param salesTax   * Amount of tax charged on transaction
     */
    public void setSalesTax(java.lang.String salesTax) {
        this.salesTax = salesTax;
    }


    /**
     * Gets the paymentItem value for this PaymentItemInfoType.
     * 
     * @return paymentItem   * Details about the indivudal purchased item
     */
    public eBLBaseComponents.apis.ebay.PaymentItemType[] getPaymentItem() {
        return paymentItem;
    }


    /**
     * Sets the paymentItem value for this PaymentItemInfoType.
     * 
     * @param paymentItem   * Details about the indivudal purchased item
     */
    public void setPaymentItem(eBLBaseComponents.apis.ebay.PaymentItemType[] paymentItem) {
        this.paymentItem = paymentItem;
    }

    public eBLBaseComponents.apis.ebay.PaymentItemType getPaymentItem(int i) {
        return this.paymentItem[i];
    }

    public void setPaymentItem(int i, eBLBaseComponents.apis.ebay.PaymentItemType _value) {
        this.paymentItem[i] = _value;
    }


    /**
     * Gets the subscription value for this PaymentItemInfoType.
     * 
     * @return subscription   * Information about the transaction if it was created via PayPal
     * Subcriptions
     */
    public eBLBaseComponents.apis.ebay.SubscriptionInfoType getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this PaymentItemInfoType.
     * 
     * @param subscription   * Information about the transaction if it was created via PayPal
     * Subcriptions
     */
    public void setSubscription(eBLBaseComponents.apis.ebay.SubscriptionInfoType subscription) {
        this.subscription = subscription;
    }


    /**
     * Gets the auction value for this PaymentItemInfoType.
     * 
     * @return auction   * Information about the transaction if it was created via an
     * auction
     */
    public eBLBaseComponents.apis.ebay.AuctionInfoType getAuction() {
        return auction;
    }


    /**
     * Sets the auction value for this PaymentItemInfoType.
     * 
     * @param auction   * Information about the transaction if it was created via an
     * auction
     */
    public void setAuction(eBLBaseComponents.apis.ebay.AuctionInfoType auction) {
        this.auction = auction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentItemInfoType)) return false;
        PaymentItemInfoType other = (PaymentItemInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invoiceID==null && other.getInvoiceID()==null) || 
             (this.invoiceID!=null &&
              this.invoiceID.equals(other.getInvoiceID()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.salesTax==null && other.getSalesTax()==null) || 
             (this.salesTax!=null &&
              this.salesTax.equals(other.getSalesTax()))) &&
            ((this.paymentItem==null && other.getPaymentItem()==null) || 
             (this.paymentItem!=null &&
              java.util.Arrays.equals(this.paymentItem, other.getPaymentItem()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              this.subscription.equals(other.getSubscription()))) &&
            ((this.auction==null && other.getAuction()==null) || 
             (this.auction!=null &&
              this.auction.equals(other.getAuction())));
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
        if (getInvoiceID() != null) {
            _hashCode += getInvoiceID().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getSalesTax() != null) {
            _hashCode += getSalesTax().hashCode();
        }
        if (getPaymentItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscription() != null) {
            _hashCode += getSubscription().hashCode();
        }
        if (getAuction() != null) {
            _hashCode += getAuction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentItemInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentItemInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InvoiceID"));
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
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SalesTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SubscriptionInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Auction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuctionInfoType"));
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
