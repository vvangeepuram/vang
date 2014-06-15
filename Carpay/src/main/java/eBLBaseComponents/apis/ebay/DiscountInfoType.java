/**
 * DiscountInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Describes discount information.
 */
public class DiscountInfoType  implements java.io.Serializable {
    /* (Optional)Item name.
     * 								Character length and limits: 127 single-byte characters */
    private java.lang.String name;

    /* (Optional)Description of the discount.
     * 								Character length and limits: 127 single-byte characters */
    private java.lang.String description;

    /* (Optional)Amount discounted.
     * 								The value includes an amount and a 3-character currency code. */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* (Optional)Offer type. */
    private eBLBaseComponents.apis.ebay.RedeemedOfferType redeemedOfferType;

    /* (Optional)Offer ID.
     * 								Character length and limits: 64 single-byte characters. */
    private java.lang.String redeemedOfferId;

    /* (Optional)Loyalty points accrued. */
    private java.math.BigDecimal pointsAccrued;

    public DiscountInfoType() {
    }

    public DiscountInfoType(
           java.lang.String name,
           java.lang.String description,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           eBLBaseComponents.apis.ebay.RedeemedOfferType redeemedOfferType,
           java.lang.String redeemedOfferId,
           java.math.BigDecimal pointsAccrued) {
           this.name = name;
           this.description = description;
           this.amount = amount;
           this.redeemedOfferType = redeemedOfferType;
           this.redeemedOfferId = redeemedOfferId;
           this.pointsAccrued = pointsAccrued;
    }


    /**
     * Gets the name value for this DiscountInfoType.
     * 
     * @return name   * (Optional)Item name.
     * 								Character length and limits: 127 single-byte characters
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DiscountInfoType.
     * 
     * @param name   * (Optional)Item name.
     * 								Character length and limits: 127 single-byte characters
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this DiscountInfoType.
     * 
     * @return description   * (Optional)Description of the discount.
     * 								Character length and limits: 127 single-byte characters
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DiscountInfoType.
     * 
     * @param description   * (Optional)Description of the discount.
     * 								Character length and limits: 127 single-byte characters
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the amount value for this DiscountInfoType.
     * 
     * @return amount   * (Optional)Amount discounted.
     * 								The value includes an amount and a 3-character currency code.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DiscountInfoType.
     * 
     * @param amount   * (Optional)Amount discounted.
     * 								The value includes an amount and a 3-character currency code.
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the redeemedOfferType value for this DiscountInfoType.
     * 
     * @return redeemedOfferType   * (Optional)Offer type.
     */
    public eBLBaseComponents.apis.ebay.RedeemedOfferType getRedeemedOfferType() {
        return redeemedOfferType;
    }


    /**
     * Sets the redeemedOfferType value for this DiscountInfoType.
     * 
     * @param redeemedOfferType   * (Optional)Offer type.
     */
    public void setRedeemedOfferType(eBLBaseComponents.apis.ebay.RedeemedOfferType redeemedOfferType) {
        this.redeemedOfferType = redeemedOfferType;
    }


    /**
     * Gets the redeemedOfferId value for this DiscountInfoType.
     * 
     * @return redeemedOfferId   * (Optional)Offer ID.
     * 								Character length and limits: 64 single-byte characters.
     */
    public java.lang.String getRedeemedOfferId() {
        return redeemedOfferId;
    }


    /**
     * Sets the redeemedOfferId value for this DiscountInfoType.
     * 
     * @param redeemedOfferId   * (Optional)Offer ID.
     * 								Character length and limits: 64 single-byte characters.
     */
    public void setRedeemedOfferId(java.lang.String redeemedOfferId) {
        this.redeemedOfferId = redeemedOfferId;
    }


    /**
     * Gets the pointsAccrued value for this DiscountInfoType.
     * 
     * @return pointsAccrued   * (Optional)Loyalty points accrued.
     */
    public java.math.BigDecimal getPointsAccrued() {
        return pointsAccrued;
    }


    /**
     * Sets the pointsAccrued value for this DiscountInfoType.
     * 
     * @param pointsAccrued   * (Optional)Loyalty points accrued.
     */
    public void setPointsAccrued(java.math.BigDecimal pointsAccrued) {
        this.pointsAccrued = pointsAccrued;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiscountInfoType)) return false;
        DiscountInfoType other = (DiscountInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.redeemedOfferType==null && other.getRedeemedOfferType()==null) || 
             (this.redeemedOfferType!=null &&
              this.redeemedOfferType.equals(other.getRedeemedOfferType()))) &&
            ((this.redeemedOfferId==null && other.getRedeemedOfferId()==null) || 
             (this.redeemedOfferId!=null &&
              this.redeemedOfferId.equals(other.getRedeemedOfferId()))) &&
            ((this.pointsAccrued==null && other.getPointsAccrued()==null) || 
             (this.pointsAccrued!=null &&
              this.pointsAccrued.equals(other.getPointsAccrued())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getRedeemedOfferType() != null) {
            _hashCode += getRedeemedOfferType().hashCode();
        }
        if (getRedeemedOfferId() != null) {
            _hashCode += getRedeemedOfferId().hashCode();
        }
        if (getPointsAccrued() != null) {
            _hashCode += getPointsAccrued().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiscountInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DiscountInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redeemedOfferType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RedeemedOfferType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RedeemedOfferType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redeemedOfferId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RedeemedOfferId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointsAccrued");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PointsAccrued"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
