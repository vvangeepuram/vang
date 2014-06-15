/**
 * MassPayRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class MassPayRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* Subject line of the email sent to all recipients. This subject
     * is not contained in the input file; you must create it with your application.
     * 
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limitations: 255 single-byte alphanumeric characters */
    private java.lang.String emailSubject;

    /* Indicates how you identify the recipients of payments in all
     * MassPayItems: either by EmailAddress (ReceiverEmail in MassPayItem),
     * PhoneNumber (ReceiverPhone in MassPayItem), or by UserID (ReceiverID
     * in MassPayItem). 
     * 
     * 										
     * 										You must specify one or the other of EmailAddress or UserID. */
    private eBLBaseComponents.apis.ebay.ReceiverInfoCodeType receiverType;

    /* Known as BN code, to track the partner referred merchant transactions.
     * 
     * 
     * Optional
     * 
     * Character length and limitations: 32 single-byte alphanumeric characters */
    private java.lang.String buttonSource;

    /* Details of each payment. A single MassPayRequest can include
     * up to 250 MassPayItems. */
    private PayPalAPI.api.ebay.MassPayRequestItemType[] massPayItem;

    public MassPayRequestType() {
    }

    public MassPayRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String emailSubject,
           eBLBaseComponents.apis.ebay.ReceiverInfoCodeType receiverType,
           java.lang.String buttonSource,
           PayPalAPI.api.ebay.MassPayRequestItemType[] massPayItem) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.emailSubject = emailSubject;
        this.receiverType = receiverType;
        this.buttonSource = buttonSource;
        this.massPayItem = massPayItem;
    }


    /**
     * Gets the emailSubject value for this MassPayRequestType.
     * 
     * @return emailSubject   * Subject line of the email sent to all recipients. This subject
     * is not contained in the input file; you must create it with your application.
     * 
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public java.lang.String getEmailSubject() {
        return emailSubject;
    }


    /**
     * Sets the emailSubject value for this MassPayRequestType.
     * 
     * @param emailSubject   * Subject line of the email sent to all recipients. This subject
     * is not contained in the input file; you must create it with your application.
     * 
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public void setEmailSubject(java.lang.String emailSubject) {
        this.emailSubject = emailSubject;
    }


    /**
     * Gets the receiverType value for this MassPayRequestType.
     * 
     * @return receiverType   * Indicates how you identify the recipients of payments in all
     * MassPayItems: either by EmailAddress (ReceiverEmail in MassPayItem),
     * PhoneNumber (ReceiverPhone in MassPayItem), or by UserID (ReceiverID
     * in MassPayItem). 
     * 
     * 										
     * 										You must specify one or the other of EmailAddress or UserID.
     */
    public eBLBaseComponents.apis.ebay.ReceiverInfoCodeType getReceiverType() {
        return receiverType;
    }


    /**
     * Sets the receiverType value for this MassPayRequestType.
     * 
     * @param receiverType   * Indicates how you identify the recipients of payments in all
     * MassPayItems: either by EmailAddress (ReceiverEmail in MassPayItem),
     * PhoneNumber (ReceiverPhone in MassPayItem), or by UserID (ReceiverID
     * in MassPayItem). 
     * 
     * 										
     * 										You must specify one or the other of EmailAddress or UserID.
     */
    public void setReceiverType(eBLBaseComponents.apis.ebay.ReceiverInfoCodeType receiverType) {
        this.receiverType = receiverType;
    }


    /**
     * Gets the buttonSource value for this MassPayRequestType.
     * 
     * @return buttonSource   * Known as BN code, to track the partner referred merchant transactions.
     * 
     * 
     * Optional
     * 
     * Character length and limitations: 32 single-byte alphanumeric characters
     */
    public java.lang.String getButtonSource() {
        return buttonSource;
    }


    /**
     * Sets the buttonSource value for this MassPayRequestType.
     * 
     * @param buttonSource   * Known as BN code, to track the partner referred merchant transactions.
     * 
     * 
     * Optional
     * 
     * Character length and limitations: 32 single-byte alphanumeric characters
     */
    public void setButtonSource(java.lang.String buttonSource) {
        this.buttonSource = buttonSource;
    }


    /**
     * Gets the massPayItem value for this MassPayRequestType.
     * 
     * @return massPayItem   * Details of each payment. A single MassPayRequest can include
     * up to 250 MassPayItems.
     */
    public PayPalAPI.api.ebay.MassPayRequestItemType[] getMassPayItem() {
        return massPayItem;
    }


    /**
     * Sets the massPayItem value for this MassPayRequestType.
     * 
     * @param massPayItem   * Details of each payment. A single MassPayRequest can include
     * up to 250 MassPayItems.
     */
    public void setMassPayItem(PayPalAPI.api.ebay.MassPayRequestItemType[] massPayItem) {
        this.massPayItem = massPayItem;
    }

    public PayPalAPI.api.ebay.MassPayRequestItemType getMassPayItem(int i) {
        return this.massPayItem[i];
    }

    public void setMassPayItem(int i, PayPalAPI.api.ebay.MassPayRequestItemType _value) {
        this.massPayItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MassPayRequestType)) return false;
        MassPayRequestType other = (MassPayRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.emailSubject==null && other.getEmailSubject()==null) || 
             (this.emailSubject!=null &&
              this.emailSubject.equals(other.getEmailSubject()))) &&
            ((this.receiverType==null && other.getReceiverType()==null) || 
             (this.receiverType!=null &&
              this.receiverType.equals(other.getReceiverType()))) &&
            ((this.buttonSource==null && other.getButtonSource()==null) || 
             (this.buttonSource!=null &&
              this.buttonSource.equals(other.getButtonSource()))) &&
            ((this.massPayItem==null && other.getMassPayItem()==null) || 
             (this.massPayItem!=null &&
              java.util.Arrays.equals(this.massPayItem, other.getMassPayItem())));
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
        if (getEmailSubject() != null) {
            _hashCode += getEmailSubject().hashCode();
        }
        if (getReceiverType() != null) {
            _hashCode += getReceiverType().hashCode();
        }
        if (getButtonSource() != null) {
            _hashCode += getButtonSource().hashCode();
        }
        if (getMassPayItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMassPayItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMassPayItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MassPayRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "MassPayRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "EmailSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReceiverType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReceiverInfoCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ButtonSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("massPayItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "MassPayItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "MassPayRequestItemType"));
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
