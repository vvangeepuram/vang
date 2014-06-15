/**
 * SellerDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Details about the seller.
 */
public class SellerDetailsType  implements java.io.Serializable {
    /* Unique identifier for the seller.
     * 						Optional */
    private java.lang.String sellerId;

    /* The user name of the user at the marketplaces site.
     * 						Optional */
    private java.lang.String sellerUserName;

    /* Date when the user registered with the marketplace.
     * 						Optional */
    private java.util.Calendar sellerRegistrationDate;

    /* Seller Paypal Account Id contains the seller EmailId or PayerId
     * or PhoneNo passed during the Request. */
    private java.lang.String payPalAccountID;

    /* Unique PayPal customer account identification number (of the
     * seller). This feild is meant for Response. This field is ignored,
     * if passed in the Request. */
    private java.lang.String secureMerchantAccountID;

    public SellerDetailsType() {
    }

    public SellerDetailsType(
           java.lang.String sellerId,
           java.lang.String sellerUserName,
           java.util.Calendar sellerRegistrationDate,
           java.lang.String payPalAccountID,
           java.lang.String secureMerchantAccountID) {
           this.sellerId = sellerId;
           this.sellerUserName = sellerUserName;
           this.sellerRegistrationDate = sellerRegistrationDate;
           this.payPalAccountID = payPalAccountID;
           this.secureMerchantAccountID = secureMerchantAccountID;
    }


    /**
     * Gets the sellerId value for this SellerDetailsType.
     * 
     * @return sellerId   * Unique identifier for the seller.
     * 						Optional
     */
    public java.lang.String getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this SellerDetailsType.
     * 
     * @param sellerId   * Unique identifier for the seller.
     * 						Optional
     */
    public void setSellerId(java.lang.String sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the sellerUserName value for this SellerDetailsType.
     * 
     * @return sellerUserName   * The user name of the user at the marketplaces site.
     * 						Optional
     */
    public java.lang.String getSellerUserName() {
        return sellerUserName;
    }


    /**
     * Sets the sellerUserName value for this SellerDetailsType.
     * 
     * @param sellerUserName   * The user name of the user at the marketplaces site.
     * 						Optional
     */
    public void setSellerUserName(java.lang.String sellerUserName) {
        this.sellerUserName = sellerUserName;
    }


    /**
     * Gets the sellerRegistrationDate value for this SellerDetailsType.
     * 
     * @return sellerRegistrationDate   * Date when the user registered with the marketplace.
     * 						Optional
     */
    public java.util.Calendar getSellerRegistrationDate() {
        return sellerRegistrationDate;
    }


    /**
     * Sets the sellerRegistrationDate value for this SellerDetailsType.
     * 
     * @param sellerRegistrationDate   * Date when the user registered with the marketplace.
     * 						Optional
     */
    public void setSellerRegistrationDate(java.util.Calendar sellerRegistrationDate) {
        this.sellerRegistrationDate = sellerRegistrationDate;
    }


    /**
     * Gets the payPalAccountID value for this SellerDetailsType.
     * 
     * @return payPalAccountID   * Seller Paypal Account Id contains the seller EmailId or PayerId
     * or PhoneNo passed during the Request.
     */
    public java.lang.String getPayPalAccountID() {
        return payPalAccountID;
    }


    /**
     * Sets the payPalAccountID value for this SellerDetailsType.
     * 
     * @param payPalAccountID   * Seller Paypal Account Id contains the seller EmailId or PayerId
     * or PhoneNo passed during the Request.
     */
    public void setPayPalAccountID(java.lang.String payPalAccountID) {
        this.payPalAccountID = payPalAccountID;
    }


    /**
     * Gets the secureMerchantAccountID value for this SellerDetailsType.
     * 
     * @return secureMerchantAccountID   * Unique PayPal customer account identification number (of the
     * seller). This feild is meant for Response. This field is ignored,
     * if passed in the Request.
     */
    public java.lang.String getSecureMerchantAccountID() {
        return secureMerchantAccountID;
    }


    /**
     * Sets the secureMerchantAccountID value for this SellerDetailsType.
     * 
     * @param secureMerchantAccountID   * Unique PayPal customer account identification number (of the
     * seller). This feild is meant for Response. This field is ignored,
     * if passed in the Request.
     */
    public void setSecureMerchantAccountID(java.lang.String secureMerchantAccountID) {
        this.secureMerchantAccountID = secureMerchantAccountID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellerDetailsType)) return false;
        SellerDetailsType other = (SellerDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sellerId==null && other.getSellerId()==null) || 
             (this.sellerId!=null &&
              this.sellerId.equals(other.getSellerId()))) &&
            ((this.sellerUserName==null && other.getSellerUserName()==null) || 
             (this.sellerUserName!=null &&
              this.sellerUserName.equals(other.getSellerUserName()))) &&
            ((this.sellerRegistrationDate==null && other.getSellerRegistrationDate()==null) || 
             (this.sellerRegistrationDate!=null &&
              this.sellerRegistrationDate.equals(other.getSellerRegistrationDate()))) &&
            ((this.payPalAccountID==null && other.getPayPalAccountID()==null) || 
             (this.payPalAccountID!=null &&
              this.payPalAccountID.equals(other.getPayPalAccountID()))) &&
            ((this.secureMerchantAccountID==null && other.getSecureMerchantAccountID()==null) || 
             (this.secureMerchantAccountID!=null &&
              this.secureMerchantAccountID.equals(other.getSecureMerchantAccountID())));
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
        if (getSellerId() != null) {
            _hashCode += getSellerId().hashCode();
        }
        if (getSellerUserName() != null) {
            _hashCode += getSellerUserName().hashCode();
        }
        if (getSellerRegistrationDate() != null) {
            _hashCode += getSellerRegistrationDate().hashCode();
        }
        if (getPayPalAccountID() != null) {
            _hashCode += getPayPalAccountID().hashCode();
        }
        if (getSecureMerchantAccountID() != null) {
            _hashCode += getSecureMerchantAccountID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellerDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerRegistrationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerRegistrationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayPalAccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secureMerchantAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SecureMerchantAccountID"));
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
