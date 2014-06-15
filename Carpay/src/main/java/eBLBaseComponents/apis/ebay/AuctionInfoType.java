/**
 * AuctionInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * AuctionInfoType 
 * 				Basic information about an auction.
 */
public class AuctionInfoType  implements java.io.Serializable {
    /* Customer's auction ID */
    private java.lang.String buyerID;

    /* Auction's close date */
    private java.util.Calendar closingDate;

    private java.lang.String multiItem;  // attribute

    public AuctionInfoType() {
    }

    public AuctionInfoType(
           java.lang.String buyerID,
           java.util.Calendar closingDate,
           java.lang.String multiItem) {
           this.buyerID = buyerID;
           this.closingDate = closingDate;
           this.multiItem = multiItem;
    }


    /**
     * Gets the buyerID value for this AuctionInfoType.
     * 
     * @return buyerID   * Customer's auction ID
     */
    public java.lang.String getBuyerID() {
        return buyerID;
    }


    /**
     * Sets the buyerID value for this AuctionInfoType.
     * 
     * @param buyerID   * Customer's auction ID
     */
    public void setBuyerID(java.lang.String buyerID) {
        this.buyerID = buyerID;
    }


    /**
     * Gets the closingDate value for this AuctionInfoType.
     * 
     * @return closingDate   * Auction's close date
     */
    public java.util.Calendar getClosingDate() {
        return closingDate;
    }


    /**
     * Sets the closingDate value for this AuctionInfoType.
     * 
     * @param closingDate   * Auction's close date
     */
    public void setClosingDate(java.util.Calendar closingDate) {
        this.closingDate = closingDate;
    }


    /**
     * Gets the multiItem value for this AuctionInfoType.
     * 
     * @return multiItem
     */
    public java.lang.String getMultiItem() {
        return multiItem;
    }


    /**
     * Sets the multiItem value for this AuctionInfoType.
     * 
     * @param multiItem
     */
    public void setMultiItem(java.lang.String multiItem) {
        this.multiItem = multiItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuctionInfoType)) return false;
        AuctionInfoType other = (AuctionInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.buyerID==null && other.getBuyerID()==null) || 
             (this.buyerID!=null &&
              this.buyerID.equals(other.getBuyerID()))) &&
            ((this.closingDate==null && other.getClosingDate()==null) || 
             (this.closingDate!=null &&
              this.closingDate.equals(other.getClosingDate()))) &&
            ((this.multiItem==null && other.getMultiItem()==null) || 
             (this.multiItem!=null &&
              this.multiItem.equals(other.getMultiItem())));
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
        if (getBuyerID() != null) {
            _hashCode += getBuyerID().hashCode();
        }
        if (getClosingDate() != null) {
            _hashCode += getClosingDate().hashCode();
        }
        if (getMultiItem() != null) {
            _hashCode += getMultiItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuctionInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuctionInfoType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("multiItem");
        attrField.setXmlName(new javax.xml.namespace.QName("", "multiItem"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ClosingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
