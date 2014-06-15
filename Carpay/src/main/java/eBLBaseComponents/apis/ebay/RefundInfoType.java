/**
 * RefundInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class RefundInfoType  implements java.io.Serializable {
    /* Refund status whether it is Instant or Delayed. */
    private eBLBaseComponents.apis.ebay.PaymentStatusCodeType refundStatus;

    /* Tells us the reason when refund payment status is Delayed. */
    private eBLBaseComponents.apis.ebay.PendingStatusCodeType pendingReason;

    public RefundInfoType() {
    }

    public RefundInfoType(
           eBLBaseComponents.apis.ebay.PaymentStatusCodeType refundStatus,
           eBLBaseComponents.apis.ebay.PendingStatusCodeType pendingReason) {
           this.refundStatus = refundStatus;
           this.pendingReason = pendingReason;
    }


    /**
     * Gets the refundStatus value for this RefundInfoType.
     * 
     * @return refundStatus   * Refund status whether it is Instant or Delayed.
     */
    public eBLBaseComponents.apis.ebay.PaymentStatusCodeType getRefundStatus() {
        return refundStatus;
    }


    /**
     * Sets the refundStatus value for this RefundInfoType.
     * 
     * @param refundStatus   * Refund status whether it is Instant or Delayed.
     */
    public void setRefundStatus(eBLBaseComponents.apis.ebay.PaymentStatusCodeType refundStatus) {
        this.refundStatus = refundStatus;
    }


    /**
     * Gets the pendingReason value for this RefundInfoType.
     * 
     * @return pendingReason   * Tells us the reason when refund payment status is Delayed.
     */
    public eBLBaseComponents.apis.ebay.PendingStatusCodeType getPendingReason() {
        return pendingReason;
    }


    /**
     * Sets the pendingReason value for this RefundInfoType.
     * 
     * @param pendingReason   * Tells us the reason when refund payment status is Delayed.
     */
    public void setPendingReason(eBLBaseComponents.apis.ebay.PendingStatusCodeType pendingReason) {
        this.pendingReason = pendingReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefundInfoType)) return false;
        RefundInfoType other = (RefundInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refundStatus==null && other.getRefundStatus()==null) || 
             (this.refundStatus!=null &&
              this.refundStatus.equals(other.getRefundStatus()))) &&
            ((this.pendingReason==null && other.getPendingReason()==null) || 
             (this.pendingReason!=null &&
              this.pendingReason.equals(other.getPendingReason())));
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
        if (getRefundStatus() != null) {
            _hashCode += getRefundStatus().hashCode();
        }
        if (getPendingReason() != null) {
            _hashCode += getPendingReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RefundInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefundInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefundStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentStatusCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PendingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PendingStatusCodeType"));
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
