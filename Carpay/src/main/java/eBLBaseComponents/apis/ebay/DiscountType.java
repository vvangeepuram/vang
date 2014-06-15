/**
 * DiscountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Describes discount information
 */
public class DiscountType  implements java.io.Serializable {
    /* Item nameOptional
     * 								Character length and limits: 127 single-byte characters */
    private java.lang.String name;

    /* description of the discountOptional
     * 								Character length and limits: 127 single-byte characters */
    private java.lang.String description;

    /* amount discountedOptional */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* offer typeOptional */
    private eBLBaseComponents.apis.ebay.RedeemedOfferType redeemedOfferType;

    /* offer IDOptional
     * 								Character length and limits: 64 single-byte characters */
    private java.lang.String redeemedOfferID;

    public DiscountType() {
    }

    public DiscountType(
           java.lang.String name,
           java.lang.String description,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           eBLBaseComponents.apis.ebay.RedeemedOfferType redeemedOfferType,
           java.lang.String redeemedOfferID) {
           this.name = name;
           this.description = description;
           this.amount = amount;
           this.redeemedOfferType = redeemedOfferType;
           this.redeemedOfferID = redeemedOfferID;
    }


    /**
     * Gets the name value for this DiscountType.
     * 
     * @return name   * Item nameOptional
     * 								Character length and limits: 127 single-byte characters
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DiscountType.
     * 
     * @param name   * Item nameOptional
     * 								Character length and limits: 127 single-byte characters
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this DiscountType.
     * 
     * @return description   * description of the discountOptional
     * 								Character length and limits: 127 single-byte characters
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DiscountType.
     * 
     * @param description   * description of the discountOptional
     * 								Character length and limits: 127 single-byte characters
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the amount value for this DiscountType.
     * 
     * @return amount   * amount discountedOptional
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DiscountType.
     * 
     * @param amount   * amount discountedOptional
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the redeemedOfferType value for this DiscountType.
     * 
     * @return redeemedOfferType   * offer typeOptional
     */
    public eBLBaseComponents.apis.ebay.RedeemedOfferType getRedeemedOfferType() {
        return redeemedOfferType;
    }


    /**
     * Sets the redeemedOfferType value for this DiscountType.
     * 
     * @param redeemedOfferType   * offer typeOptional
     */
    public void setRedeemedOfferType(eBLBaseComponents.apis.ebay.RedeemedOfferType redeemedOfferType) {
        this.redeemedOfferType = redeemedOfferType;
    }


    /**
     * Gets the redeemedOfferID value for this DiscountType.
     * 
     * @return redeemedOfferID   * offer IDOptional
     * 								Character length and limits: 64 single-byte characters
     */
    public java.lang.String getRedeemedOfferID() {
        return redeemedOfferID;
    }


    /**
     * Sets the redeemedOfferID value for this DiscountType.
     * 
     * @param redeemedOfferID   * offer IDOptional
     * 								Character length and limits: 64 single-byte characters
     */
    public void setRedeemedOfferID(java.lang.String redeemedOfferID) {
        this.redeemedOfferID = redeemedOfferID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiscountType)) return false;
        DiscountType other = (DiscountType) obj;
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
            ((this.redeemedOfferID==null && other.getRedeemedOfferID()==null) || 
             (this.redeemedOfferID!=null &&
              this.redeemedOfferID.equals(other.getRedeemedOfferID())));
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
        if (getRedeemedOfferID() != null) {
            _hashCode += getRedeemedOfferID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiscountType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DiscountType"));
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
        elemField.setFieldName("redeemedOfferID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RedeemedOfferID"));
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
