/**
 * MassPayRequestItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;


/**
 * MassPayRequestItemType
 */
public class MassPayRequestItemType  implements java.io.Serializable {
    /* Email address of recipient. 
     * 
     * 								
     * 								
     * 								
     * 								
     * You must specify ReceiverEmail, ReceiverPhone, or ReceiverID, but
     * all MassPayItems in a request must use the same field to specify recipients.
     * 
     * 								
     * Character length and limitations: 127 single-byte characters maximum. */
    private java.lang.String receiverEmail;

    /* Phone number of recipient. 
     * 
     * 								
     * 								
     * 								
     * 								
     * You must specify ReceiverEmail, ReceiverPhone, or ReceiverID, but
     * all MassPayItems in a request must use the same field to specify recipients. */
    private java.lang.String receiverPhone;

    /* Unique PayPal customer account number. This value corresponds
     * to the value of PayerID returned by GetTransactionDetails. 
     * 
     * 								
     * 								
     * 								
     * 								
     * You must specify ReceiverEmail, ReceiverPhone, or ReceiverID, but
     * all MassPayItems in a request must use the same field to specify recipients.
     * 
     * 								
     * Character length and limitations: 17 single-byte characters maximum. */
    private java.lang.String receiverID;

    /* Payment amount. You must set the currencyID attribute to one
     * of the three-character currency codes for any of the supported PayPal
     * currencies. 
     * 
     * 								
     * 								
     * 								
     * 								
     * You cannot mix currencies in a single MassPayRequest. A single request
     * must include items that are of the same currency. */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* Transaction-specific identification number for tracking in
     * an accounting system. 
     * 
     * 								
     * Optional
     * 
     * 								
     * Character length and limitations: 30 single-byte characters. No whitespace
     * allowed. */
    private java.lang.String uniqueId;

    /* Custom note for each recipient. 
     * 
     * 								
     * Optional
     * 
     * 								
     * Character length and limitations: 4,000 single-byte alphanumeric characters */
    private java.lang.String note;

    public MassPayRequestItemType() {
    }

    public MassPayRequestItemType(
           java.lang.String receiverEmail,
           java.lang.String receiverPhone,
           java.lang.String receiverID,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           java.lang.String uniqueId,
           java.lang.String note) {
           this.receiverEmail = receiverEmail;
           this.receiverPhone = receiverPhone;
           this.receiverID = receiverID;
           this.amount = amount;
           this.uniqueId = uniqueId;
           this.note = note;
    }


    /**
     * Gets the receiverEmail value for this MassPayRequestItemType.
     * 
     * @return receiverEmail   * Email address of recipient. 
     * 
     * 								
     * 								
     * 								
     * 								
     * You must specify ReceiverEmail, ReceiverPhone, or ReceiverID, but
     * all MassPayItems in a request must use the same field to specify recipients.
     * 
     * 								
     * Character length and limitations: 127 single-byte characters maximum.
     */
    public java.lang.String getReceiverEmail() {
        return receiverEmail;
    }


    /**
     * Sets the receiverEmail value for this MassPayRequestItemType.
     * 
     * @param receiverEmail   * Email address of recipient. 
     * 
     * 								
     * 								
     * 								
     * 								
     * You must specify ReceiverEmail, ReceiverPhone, or ReceiverID, but
     * all MassPayItems in a request must use the same field to specify recipients.
     * 
     * 								
     * Character length and limitations: 127 single-byte characters maximum.
     */
    public void setReceiverEmail(java.lang.String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }


    /**
     * Gets the receiverPhone value for this MassPayRequestItemType.
     * 
     * @return receiverPhone   * Phone number of recipient. 
     * 
     * 								
     * 								
     * 								
     * 								
     * You must specify ReceiverEmail, ReceiverPhone, or ReceiverID, but
     * all MassPayItems in a request must use the same field to specify recipients.
     */
    public java.lang.String getReceiverPhone() {
        return receiverPhone;
    }


    /**
     * Sets the receiverPhone value for this MassPayRequestItemType.
     * 
     * @param receiverPhone   * Phone number of recipient. 
     * 
     * 								
     * 								
     * 								
     * 								
     * You must specify ReceiverEmail, ReceiverPhone, or ReceiverID, but
     * all MassPayItems in a request must use the same field to specify recipients.
     */
    public void setReceiverPhone(java.lang.String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }


    /**
     * Gets the receiverID value for this MassPayRequestItemType.
     * 
     * @return receiverID   * Unique PayPal customer account number. This value corresponds
     * to the value of PayerID returned by GetTransactionDetails. 
     * 
     * 								
     * 								
     * 								
     * 								
     * You must specify ReceiverEmail, ReceiverPhone, or ReceiverID, but
     * all MassPayItems in a request must use the same field to specify recipients.
     * 
     * 								
     * Character length and limitations: 17 single-byte characters maximum.
     */
    public java.lang.String getReceiverID() {
        return receiverID;
    }


    /**
     * Sets the receiverID value for this MassPayRequestItemType.
     * 
     * @param receiverID   * Unique PayPal customer account number. This value corresponds
     * to the value of PayerID returned by GetTransactionDetails. 
     * 
     * 								
     * 								
     * 								
     * 								
     * You must specify ReceiverEmail, ReceiverPhone, or ReceiverID, but
     * all MassPayItems in a request must use the same field to specify recipients.
     * 
     * 								
     * Character length and limitations: 17 single-byte characters maximum.
     */
    public void setReceiverID(java.lang.String receiverID) {
        this.receiverID = receiverID;
    }


    /**
     * Gets the amount value for this MassPayRequestItemType.
     * 
     * @return amount   * Payment amount. You must set the currencyID attribute to one
     * of the three-character currency codes for any of the supported PayPal
     * currencies. 
     * 
     * 								
     * 								
     * 								
     * 								
     * You cannot mix currencies in a single MassPayRequest. A single request
     * must include items that are of the same currency.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this MassPayRequestItemType.
     * 
     * @param amount   * Payment amount. You must set the currencyID attribute to one
     * of the three-character currency codes for any of the supported PayPal
     * currencies. 
     * 
     * 								
     * 								
     * 								
     * 								
     * You cannot mix currencies in a single MassPayRequest. A single request
     * must include items that are of the same currency.
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the uniqueId value for this MassPayRequestItemType.
     * 
     * @return uniqueId   * Transaction-specific identification number for tracking in
     * an accounting system. 
     * 
     * 								
     * Optional
     * 
     * 								
     * Character length and limitations: 30 single-byte characters. No whitespace
     * allowed.
     */
    public java.lang.String getUniqueId() {
        return uniqueId;
    }


    /**
     * Sets the uniqueId value for this MassPayRequestItemType.
     * 
     * @param uniqueId   * Transaction-specific identification number for tracking in
     * an accounting system. 
     * 
     * 								
     * Optional
     * 
     * 								
     * Character length and limitations: 30 single-byte characters. No whitespace
     * allowed.
     */
    public void setUniqueId(java.lang.String uniqueId) {
        this.uniqueId = uniqueId;
    }


    /**
     * Gets the note value for this MassPayRequestItemType.
     * 
     * @return note   * Custom note for each recipient. 
     * 
     * 								
     * Optional
     * 
     * 								
     * Character length and limitations: 4,000 single-byte alphanumeric characters
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this MassPayRequestItemType.
     * 
     * @param note   * Custom note for each recipient. 
     * 
     * 								
     * Optional
     * 
     * 								
     * Character length and limitations: 4,000 single-byte alphanumeric characters
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MassPayRequestItemType)) return false;
        MassPayRequestItemType other = (MassPayRequestItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiverEmail==null && other.getReceiverEmail()==null) || 
             (this.receiverEmail!=null &&
              this.receiverEmail.equals(other.getReceiverEmail()))) &&
            ((this.receiverPhone==null && other.getReceiverPhone()==null) || 
             (this.receiverPhone!=null &&
              this.receiverPhone.equals(other.getReceiverPhone()))) &&
            ((this.receiverID==null && other.getReceiverID()==null) || 
             (this.receiverID!=null &&
              this.receiverID.equals(other.getReceiverID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.uniqueId==null && other.getUniqueId()==null) || 
             (this.uniqueId!=null &&
              this.uniqueId.equals(other.getUniqueId()))) &&
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
        if (getReceiverEmail() != null) {
            _hashCode += getReceiverEmail().hashCode();
        }
        if (getReceiverPhone() != null) {
            _hashCode += getReceiverPhone().hashCode();
        }
        if (getReceiverID() != null) {
            _hashCode += getReceiverID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getUniqueId() != null) {
            _hashCode += getUniqueId().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MassPayRequestItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "MassPayRequestItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReceiverEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReceiverPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReceiverID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Note"));
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
