/**
 * ReceiverInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * ReceiverInfoType 
 * 				Receiver information.
 */
public class ReceiverInfoType  implements java.io.Serializable {
    /* Email address or account ID of the payment recipient (the seller).
     * Equivalent to Receiver if payment is sent to primary account. 
     * Character length and limitations: 127 single-byte alphanumeric characters */
    private java.lang.String business;

    /* Primary email address of the payment recipient (the seller).
     * If you are the recipient of the payment and the payment is sent to
     * your non-primary email address, the value of Receiver is still your
     * primary email address. 
     * Character length and limitations: 127 single-byte alphanumeric characters */
    private java.lang.String receiver;

    /* Unique account ID of the payment recipient (the seller). This
     * value is the same as the value of the recipient's referral ID. */
    private java.lang.String receiverID;

    public ReceiverInfoType() {
    }

    public ReceiverInfoType(
           java.lang.String business,
           java.lang.String receiver,
           java.lang.String receiverID) {
           this.business = business;
           this.receiver = receiver;
           this.receiverID = receiverID;
    }


    /**
     * Gets the business value for this ReceiverInfoType.
     * 
     * @return business   * Email address or account ID of the payment recipient (the seller).
     * Equivalent to Receiver if payment is sent to primary account. 
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public java.lang.String getBusiness() {
        return business;
    }


    /**
     * Sets the business value for this ReceiverInfoType.
     * 
     * @param business   * Email address or account ID of the payment recipient (the seller).
     * Equivalent to Receiver if payment is sent to primary account. 
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public void setBusiness(java.lang.String business) {
        this.business = business;
    }


    /**
     * Gets the receiver value for this ReceiverInfoType.
     * 
     * @return receiver   * Primary email address of the payment recipient (the seller).
     * If you are the recipient of the payment and the payment is sent to
     * your non-primary email address, the value of Receiver is still your
     * primary email address. 
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public java.lang.String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this ReceiverInfoType.
     * 
     * @param receiver   * Primary email address of the payment recipient (the seller).
     * If you are the recipient of the payment and the payment is sent to
     * your non-primary email address, the value of Receiver is still your
     * primary email address. 
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public void setReceiver(java.lang.String receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the receiverID value for this ReceiverInfoType.
     * 
     * @return receiverID   * Unique account ID of the payment recipient (the seller). This
     * value is the same as the value of the recipient's referral ID.
     */
    public java.lang.String getReceiverID() {
        return receiverID;
    }


    /**
     * Sets the receiverID value for this ReceiverInfoType.
     * 
     * @param receiverID   * Unique account ID of the payment recipient (the seller). This
     * value is the same as the value of the recipient's referral ID.
     */
    public void setReceiverID(java.lang.String receiverID) {
        this.receiverID = receiverID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiverInfoType)) return false;
        ReceiverInfoType other = (ReceiverInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.business==null && other.getBusiness()==null) || 
             (this.business!=null &&
              this.business.equals(other.getBusiness()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.receiverID==null && other.getReceiverID()==null) || 
             (this.receiverID!=null &&
              this.receiverID.equals(other.getReceiverID())));
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
        if (getBusiness() != null) {
            _hashCode += getBusiness().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getReceiverID() != null) {
            _hashCode += getReceiverID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceiverInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReceiverInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("business");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Business"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReceiverID"));
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
