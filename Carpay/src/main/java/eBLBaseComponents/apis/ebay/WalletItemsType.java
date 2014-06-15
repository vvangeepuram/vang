/**
 * WalletItemsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Details about an Item stored in the PayPal Wallet.
 */
public class WalletItemsType  implements java.io.Serializable {
    /* (Optional)Identifies a wallet item of a given type. The format
     * varies depending on the type. */
    private eBLBaseComponents.apis.ebay.WalletItemType type;

    /* (Optional)Uniquely identifies a wallet item of given type.
     * Format varies depending on the type.
     * 								Character length and limitations: 64 single-byte characters
     * maximum. */
    private java.lang.String id;

    /* (Optional)Description of wallet item.
     * 								Character length and limitations: 512 single-byte characters
     * maximum. */
    private java.lang.String description;

    public WalletItemsType() {
    }

    public WalletItemsType(
           eBLBaseComponents.apis.ebay.WalletItemType type,
           java.lang.String id,
           java.lang.String description) {
           this.type = type;
           this.id = id;
           this.description = description;
    }


    /**
     * Gets the type value for this WalletItemsType.
     * 
     * @return type   * (Optional)Identifies a wallet item of a given type. The format
     * varies depending on the type.
     */
    public eBLBaseComponents.apis.ebay.WalletItemType getType() {
        return type;
    }


    /**
     * Sets the type value for this WalletItemsType.
     * 
     * @param type   * (Optional)Identifies a wallet item of a given type. The format
     * varies depending on the type.
     */
    public void setType(eBLBaseComponents.apis.ebay.WalletItemType type) {
        this.type = type;
    }


    /**
     * Gets the id value for this WalletItemsType.
     * 
     * @return id   * (Optional)Uniquely identifies a wallet item of given type.
     * Format varies depending on the type.
     * 								Character length and limitations: 64 single-byte characters
     * maximum.
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this WalletItemsType.
     * 
     * @param id   * (Optional)Uniquely identifies a wallet item of given type.
     * Format varies depending on the type.
     * 								Character length and limitations: 64 single-byte characters
     * maximum.
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the description value for this WalletItemsType.
     * 
     * @return description   * (Optional)Description of wallet item.
     * 								Character length and limitations: 512 single-byte characters
     * maximum.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WalletItemsType.
     * 
     * @param description   * (Optional)Description of wallet item.
     * 								Character length and limitations: 512 single-byte characters
     * maximum.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WalletItemsType)) return false;
        WalletItemsType other = (WalletItemsType) obj;
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
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WalletItemsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "WalletItemsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "WalletItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Id"));
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
