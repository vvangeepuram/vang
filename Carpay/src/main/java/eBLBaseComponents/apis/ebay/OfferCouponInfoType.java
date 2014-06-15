/**
 * OfferCouponInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * OffersAndCouponsInfoType
 *                                 Information about a Offers and Coupons.
 */
public class OfferCouponInfoType  implements java.io.Serializable {
    /* Type of the incentive */
    private java.lang.String type;

    /* ID of the Incentive used in transaction */
    private java.lang.String ID;

    /* Amount used on transaction */
    private java.lang.String amount;

    /* Amount Currency */
    private java.lang.String amountCurrency;

    public OfferCouponInfoType() {
    }

    public OfferCouponInfoType(
           java.lang.String type,
           java.lang.String ID,
           java.lang.String amount,
           java.lang.String amountCurrency) {
           this.type = type;
           this.ID = ID;
           this.amount = amount;
           this.amountCurrency = amountCurrency;
    }


    /**
     * Gets the type value for this OfferCouponInfoType.
     * 
     * @return type   * Type of the incentive
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OfferCouponInfoType.
     * 
     * @param type   * Type of the incentive
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the ID value for this OfferCouponInfoType.
     * 
     * @return ID   * ID of the Incentive used in transaction
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this OfferCouponInfoType.
     * 
     * @param ID   * ID of the Incentive used in transaction
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the amount value for this OfferCouponInfoType.
     * 
     * @return amount   * Amount used on transaction
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this OfferCouponInfoType.
     * 
     * @param amount   * Amount used on transaction
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountCurrency value for this OfferCouponInfoType.
     * 
     * @return amountCurrency   * Amount Currency
     */
    public java.lang.String getAmountCurrency() {
        return amountCurrency;
    }


    /**
     * Sets the amountCurrency value for this OfferCouponInfoType.
     * 
     * @param amountCurrency   * Amount Currency
     */
    public void setAmountCurrency(java.lang.String amountCurrency) {
        this.amountCurrency = amountCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfferCouponInfoType)) return false;
        OfferCouponInfoType other = (OfferCouponInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.amountCurrency==null && other.getAmountCurrency()==null) || 
             (this.amountCurrency!=null &&
              this.amountCurrency.equals(other.getAmountCurrency())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAmountCurrency() != null) {
            _hashCode += getAmountCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferCouponInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OfferCouponInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AmountCurrency"));
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
