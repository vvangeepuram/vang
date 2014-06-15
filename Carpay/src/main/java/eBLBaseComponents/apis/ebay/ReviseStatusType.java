/**
 * ReviseStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Contains the revise status information details (e.g., item properties
 * 
 * 			information). ths node contains system set data only - always output
 * and always all data. no minccurs needed,
 * 			except for motors specific data, since it wil lnot be retruned
 * for non motors items
 */
public class ReviseStatusType  implements java.io.Serializable {
    /* Indicates whether the item was revised since the auction started. */
    private boolean itemRevised;

    /* If true, indicates that a Buy It Now Price was added for
     * 			              	the item. Only returned for Motors items. */
    private java.lang.Boolean buyItNowAdded;

    /* Replaces BinLowered as of API version 305. If true,
     * 			             		indicates that the Buy It Now Price was lowered
     * for the
     * 			             		item. Only returned for Motors items. */
    private java.lang.Boolean buyItNowLowered;

    /* If true, indicates that the Reserve Price was lowered for
     * 			                  the item. Only returned for Motors items. */
    private java.lang.Boolean reserveLowered;

    /* If true, indicates that the Reserve Price was removed
     * 			                  from the item. Only returned for eBay Motors
     * items. */
    private java.lang.Boolean reserveRemoved;

    public ReviseStatusType() {
    }

    public ReviseStatusType(
           boolean itemRevised,
           java.lang.Boolean buyItNowAdded,
           java.lang.Boolean buyItNowLowered,
           java.lang.Boolean reserveLowered,
           java.lang.Boolean reserveRemoved) {
           this.itemRevised = itemRevised;
           this.buyItNowAdded = buyItNowAdded;
           this.buyItNowLowered = buyItNowLowered;
           this.reserveLowered = reserveLowered;
           this.reserveRemoved = reserveRemoved;
    }


    /**
     * Gets the itemRevised value for this ReviseStatusType.
     * 
     * @return itemRevised   * Indicates whether the item was revised since the auction started.
     */
    public boolean isItemRevised() {
        return itemRevised;
    }


    /**
     * Sets the itemRevised value for this ReviseStatusType.
     * 
     * @param itemRevised   * Indicates whether the item was revised since the auction started.
     */
    public void setItemRevised(boolean itemRevised) {
        this.itemRevised = itemRevised;
    }


    /**
     * Gets the buyItNowAdded value for this ReviseStatusType.
     * 
     * @return buyItNowAdded   * If true, indicates that a Buy It Now Price was added for
     * 			              	the item. Only returned for Motors items.
     */
    public java.lang.Boolean getBuyItNowAdded() {
        return buyItNowAdded;
    }


    /**
     * Sets the buyItNowAdded value for this ReviseStatusType.
     * 
     * @param buyItNowAdded   * If true, indicates that a Buy It Now Price was added for
     * 			              	the item. Only returned for Motors items.
     */
    public void setBuyItNowAdded(java.lang.Boolean buyItNowAdded) {
        this.buyItNowAdded = buyItNowAdded;
    }


    /**
     * Gets the buyItNowLowered value for this ReviseStatusType.
     * 
     * @return buyItNowLowered   * Replaces BinLowered as of API version 305. If true,
     * 			             		indicates that the Buy It Now Price was lowered
     * for the
     * 			             		item. Only returned for Motors items.
     */
    public java.lang.Boolean getBuyItNowLowered() {
        return buyItNowLowered;
    }


    /**
     * Sets the buyItNowLowered value for this ReviseStatusType.
     * 
     * @param buyItNowLowered   * Replaces BinLowered as of API version 305. If true,
     * 			             		indicates that the Buy It Now Price was lowered
     * for the
     * 			             		item. Only returned for Motors items.
     */
    public void setBuyItNowLowered(java.lang.Boolean buyItNowLowered) {
        this.buyItNowLowered = buyItNowLowered;
    }


    /**
     * Gets the reserveLowered value for this ReviseStatusType.
     * 
     * @return reserveLowered   * If true, indicates that the Reserve Price was lowered for
     * 			                  the item. Only returned for Motors items.
     */
    public java.lang.Boolean getReserveLowered() {
        return reserveLowered;
    }


    /**
     * Sets the reserveLowered value for this ReviseStatusType.
     * 
     * @param reserveLowered   * If true, indicates that the Reserve Price was lowered for
     * 			                  the item. Only returned for Motors items.
     */
    public void setReserveLowered(java.lang.Boolean reserveLowered) {
        this.reserveLowered = reserveLowered;
    }


    /**
     * Gets the reserveRemoved value for this ReviseStatusType.
     * 
     * @return reserveRemoved   * If true, indicates that the Reserve Price was removed
     * 			                  from the item. Only returned for eBay Motors
     * items.
     */
    public java.lang.Boolean getReserveRemoved() {
        return reserveRemoved;
    }


    /**
     * Sets the reserveRemoved value for this ReviseStatusType.
     * 
     * @param reserveRemoved   * If true, indicates that the Reserve Price was removed
     * 			                  from the item. Only returned for eBay Motors
     * items.
     */
    public void setReserveRemoved(java.lang.Boolean reserveRemoved) {
        this.reserveRemoved = reserveRemoved;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReviseStatusType)) return false;
        ReviseStatusType other = (ReviseStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemRevised == other.isItemRevised() &&
            ((this.buyItNowAdded==null && other.getBuyItNowAdded()==null) || 
             (this.buyItNowAdded!=null &&
              this.buyItNowAdded.equals(other.getBuyItNowAdded()))) &&
            ((this.buyItNowLowered==null && other.getBuyItNowLowered()==null) || 
             (this.buyItNowLowered!=null &&
              this.buyItNowLowered.equals(other.getBuyItNowLowered()))) &&
            ((this.reserveLowered==null && other.getReserveLowered()==null) || 
             (this.reserveLowered!=null &&
              this.reserveLowered.equals(other.getReserveLowered()))) &&
            ((this.reserveRemoved==null && other.getReserveRemoved()==null) || 
             (this.reserveRemoved!=null &&
              this.reserveRemoved.equals(other.getReserveRemoved())));
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
        _hashCode += (isItemRevised() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBuyItNowAdded() != null) {
            _hashCode += getBuyItNowAdded().hashCode();
        }
        if (getBuyItNowLowered() != null) {
            _hashCode += getBuyItNowLowered().hashCode();
        }
        if (getReserveLowered() != null) {
            _hashCode += getReserveLowered().hashCode();
        }
        if (getReserveRemoved() != null) {
            _hashCode += getReserveRemoved().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReviseStatusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReviseStatusType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemRevised");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemRevised"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyItNowAdded");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyItNowAdded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyItNowLowered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyItNowLowered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveLowered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReserveLowered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveRemoved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReserveRemoved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
