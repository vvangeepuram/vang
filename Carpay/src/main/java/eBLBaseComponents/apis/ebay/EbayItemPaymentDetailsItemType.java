/**
 * EbayItemPaymentDetailsItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * EbayItemPaymentDetailsItemType - Type declaration to be used by
 * other schemas.
 * 				Information about an Ebay Payment Item.
 */
public class EbayItemPaymentDetailsItemType  implements java.io.Serializable {
    /* Auction ItemNumber. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 765 single-byte characters */
    private java.lang.String itemNumber;

    /* Auction Transaction ID. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte characters */
    private java.lang.String auctionTransactionId;

    /* Ebay Order ID. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 64 single-byte characters */
    private java.lang.String orderId;

    /* Ebay Cart ID.
     * 						
     * 						
     * 							Optional
     * 						
     * 						
     * 							Character length and limitations: 64 single-byte characters */
    private java.lang.String cartID;

    public EbayItemPaymentDetailsItemType() {
    }

    public EbayItemPaymentDetailsItemType(
           java.lang.String itemNumber,
           java.lang.String auctionTransactionId,
           java.lang.String orderId,
           java.lang.String cartID) {
           this.itemNumber = itemNumber;
           this.auctionTransactionId = auctionTransactionId;
           this.orderId = orderId;
           this.cartID = cartID;
    }


    /**
     * Gets the itemNumber value for this EbayItemPaymentDetailsItemType.
     * 
     * @return itemNumber   * Auction ItemNumber. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 765 single-byte characters
     */
    public java.lang.String getItemNumber() {
        return itemNumber;
    }


    /**
     * Sets the itemNumber value for this EbayItemPaymentDetailsItemType.
     * 
     * @param itemNumber   * Auction ItemNumber. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 765 single-byte characters
     */
    public void setItemNumber(java.lang.String itemNumber) {
        this.itemNumber = itemNumber;
    }


    /**
     * Gets the auctionTransactionId value for this EbayItemPaymentDetailsItemType.
     * 
     * @return auctionTransactionId   * Auction Transaction ID. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte characters
     */
    public java.lang.String getAuctionTransactionId() {
        return auctionTransactionId;
    }


    /**
     * Sets the auctionTransactionId value for this EbayItemPaymentDetailsItemType.
     * 
     * @param auctionTransactionId   * Auction Transaction ID. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 255 single-byte characters
     */
    public void setAuctionTransactionId(java.lang.String auctionTransactionId) {
        this.auctionTransactionId = auctionTransactionId;
    }


    /**
     * Gets the orderId value for this EbayItemPaymentDetailsItemType.
     * 
     * @return orderId   * Ebay Order ID. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 64 single-byte characters
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this EbayItemPaymentDetailsItemType.
     * 
     * @param orderId   * Ebay Order ID. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 64 single-byte characters
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the cartID value for this EbayItemPaymentDetailsItemType.
     * 
     * @return cartID   * Ebay Cart ID.
     * 						
     * 						
     * 							Optional
     * 						
     * 						
     * 							Character length and limitations: 64 single-byte characters
     */
    public java.lang.String getCartID() {
        return cartID;
    }


    /**
     * Sets the cartID value for this EbayItemPaymentDetailsItemType.
     * 
     * @param cartID   * Ebay Cart ID.
     * 						
     * 						
     * 							Optional
     * 						
     * 						
     * 							Character length and limitations: 64 single-byte characters
     */
    public void setCartID(java.lang.String cartID) {
        this.cartID = cartID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EbayItemPaymentDetailsItemType)) return false;
        EbayItemPaymentDetailsItemType other = (EbayItemPaymentDetailsItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemNumber==null && other.getItemNumber()==null) || 
             (this.itemNumber!=null &&
              this.itemNumber.equals(other.getItemNumber()))) &&
            ((this.auctionTransactionId==null && other.getAuctionTransactionId()==null) || 
             (this.auctionTransactionId!=null &&
              this.auctionTransactionId.equals(other.getAuctionTransactionId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.cartID==null && other.getCartID()==null) || 
             (this.cartID!=null &&
              this.cartID.equals(other.getCartID())));
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
        if (getItemNumber() != null) {
            _hashCode += getItemNumber().hashCode();
        }
        if (getAuctionTransactionId() != null) {
            _hashCode += getAuctionTransactionId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getCartID() != null) {
            _hashCode += getCartID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EbayItemPaymentDetailsItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EbayItemPaymentDetailsItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auctionTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuctionTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CartID"));
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
