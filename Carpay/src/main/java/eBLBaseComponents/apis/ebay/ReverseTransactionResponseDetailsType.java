/**
 * ReverseTransactionResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ReverseTransactionResponseDetailsType  implements java.io.Serializable {
    /* Unique transaction identifier of the reversal transaction created.
     * 
     *                         
     *                         Character length and limitations:17 single-byte
     * characters */
    private java.lang.String reverseTransactionID;

    /* Status of reversal request. */
    private java.lang.String status;

    public ReverseTransactionResponseDetailsType() {
    }

    public ReverseTransactionResponseDetailsType(
           java.lang.String reverseTransactionID,
           java.lang.String status) {
           this.reverseTransactionID = reverseTransactionID;
           this.status = status;
    }


    /**
     * Gets the reverseTransactionID value for this ReverseTransactionResponseDetailsType.
     * 
     * @return reverseTransactionID   * Unique transaction identifier of the reversal transaction created.
     * 
     *                         
     *                         Character length and limitations:17 single-byte
     * characters
     */
    public java.lang.String getReverseTransactionID() {
        return reverseTransactionID;
    }


    /**
     * Sets the reverseTransactionID value for this ReverseTransactionResponseDetailsType.
     * 
     * @param reverseTransactionID   * Unique transaction identifier of the reversal transaction created.
     * 
     *                         
     *                         Character length and limitations:17 single-byte
     * characters
     */
    public void setReverseTransactionID(java.lang.String reverseTransactionID) {
        this.reverseTransactionID = reverseTransactionID;
    }


    /**
     * Gets the status value for this ReverseTransactionResponseDetailsType.
     * 
     * @return status   * Status of reversal request.
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReverseTransactionResponseDetailsType.
     * 
     * @param status   * Status of reversal request.
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReverseTransactionResponseDetailsType)) return false;
        ReverseTransactionResponseDetailsType other = (ReverseTransactionResponseDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reverseTransactionID==null && other.getReverseTransactionID()==null) || 
             (this.reverseTransactionID!=null &&
              this.reverseTransactionID.equals(other.getReverseTransactionID()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getReverseTransactionID() != null) {
            _hashCode += getReverseTransactionID().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReverseTransactionResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReverseTransactionResponseDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReverseTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
