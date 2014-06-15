/**
 * DoVoidRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoVoidRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* The value of the original authorization identification number
     * returned by a PayPal product. 
     * 
     * 										
     * If you are voiding a transaction that has been reauthorized, use the
     * ID from the original authorization, and not the reauthorization.
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: 19 single-byte characters */
    private java.lang.String authorizationID;

    /* An informational note about this settlement that is displayed
     * to the payer in email and in  transaction history. 
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limits: 255 single-byte characters */
    private java.lang.String note;

    /* Unique id for each API request to prevent duplicate payments.
     * 											
     * 											
     * 											
     * 											Character length and limits: 38 single-byte characters
     * maximum. */
    private java.lang.String msgSubID;

    public DoVoidRequestType() {
    }

    public DoVoidRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String authorizationID,
           java.lang.String note,
           java.lang.String msgSubID) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.authorizationID = authorizationID;
        this.note = note;
        this.msgSubID = msgSubID;
    }


    /**
     * Gets the authorizationID value for this DoVoidRequestType.
     * 
     * @return authorizationID   * The value of the original authorization identification number
     * returned by a PayPal product. 
     * 
     * 										
     * If you are voiding a transaction that has been reauthorized, use the
     * ID from the original authorization, and not the reauthorization.
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: 19 single-byte characters
     */
    public java.lang.String getAuthorizationID() {
        return authorizationID;
    }


    /**
     * Sets the authorizationID value for this DoVoidRequestType.
     * 
     * @param authorizationID   * The value of the original authorization identification number
     * returned by a PayPal product. 
     * 
     * 										
     * If you are voiding a transaction that has been reauthorized, use the
     * ID from the original authorization, and not the reauthorization.
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: 19 single-byte characters
     */
    public void setAuthorizationID(java.lang.String authorizationID) {
        this.authorizationID = authorizationID;
    }


    /**
     * Gets the note value for this DoVoidRequestType.
     * 
     * @return note   * An informational note about this settlement that is displayed
     * to the payer in email and in  transaction history. 
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limits: 255 single-byte characters
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this DoVoidRequestType.
     * 
     * @param note   * An informational note about this settlement that is displayed
     * to the payer in email and in  transaction history. 
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limits: 255 single-byte characters
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the msgSubID value for this DoVoidRequestType.
     * 
     * @return msgSubID   * Unique id for each API request to prevent duplicate payments.
     * 											
     * 											
     * 											
     * 											Character length and limits: 38 single-byte characters
     * maximum.
     */
    public java.lang.String getMsgSubID() {
        return msgSubID;
    }


    /**
     * Sets the msgSubID value for this DoVoidRequestType.
     * 
     * @param msgSubID   * Unique id for each API request to prevent duplicate payments.
     * 											
     * 											
     * 											
     * 											Character length and limits: 38 single-byte characters
     * maximum.
     */
    public void setMsgSubID(java.lang.String msgSubID) {
        this.msgSubID = msgSubID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoVoidRequestType)) return false;
        DoVoidRequestType other = (DoVoidRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authorizationID==null && other.getAuthorizationID()==null) || 
             (this.authorizationID!=null &&
              this.authorizationID.equals(other.getAuthorizationID()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.msgSubID==null && other.getMsgSubID()==null) || 
             (this.msgSubID!=null &&
              this.msgSubID.equals(other.getMsgSubID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAuthorizationID() != null) {
            _hashCode += getAuthorizationID().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoVoidRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoVoidRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "AuthorizationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgSubID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "MsgSubID"));
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
