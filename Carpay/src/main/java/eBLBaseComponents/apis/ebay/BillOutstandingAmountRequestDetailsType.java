/**
 * BillOutstandingAmountRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class BillOutstandingAmountRequestDetailsType  implements java.io.Serializable {
    private java.lang.String profileID;

    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    private java.lang.String note;

    public BillOutstandingAmountRequestDetailsType() {
    }

    public BillOutstandingAmountRequestDetailsType(
           java.lang.String profileID,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           java.lang.String note) {
           this.profileID = profileID;
           this.amount = amount;
           this.note = note;
    }


    /**
     * Gets the profileID value for this BillOutstandingAmountRequestDetailsType.
     * 
     * @return profileID
     */
    public java.lang.String getProfileID() {
        return profileID;
    }


    /**
     * Sets the profileID value for this BillOutstandingAmountRequestDetailsType.
     * 
     * @param profileID
     */
    public void setProfileID(java.lang.String profileID) {
        this.profileID = profileID;
    }


    /**
     * Gets the amount value for this BillOutstandingAmountRequestDetailsType.
     * 
     * @return amount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BillOutstandingAmountRequestDetailsType.
     * 
     * @param amount
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the note value for this BillOutstandingAmountRequestDetailsType.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this BillOutstandingAmountRequestDetailsType.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillOutstandingAmountRequestDetailsType)) return false;
        BillOutstandingAmountRequestDetailsType other = (BillOutstandingAmountRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profileID==null && other.getProfileID()==null) || 
             (this.profileID!=null &&
              this.profileID.equals(other.getProfileID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote())));
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
        if (getProfileID() != null) {
            _hashCode += getProfileID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillOutstandingAmountRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillOutstandingAmountRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProfileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Note"));
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
