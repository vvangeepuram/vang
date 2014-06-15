/**
 * UpdateAuthorizationRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class UpdateAuthorizationRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* The value of the authorizationâtransaction identification number
     * returned by a PayPal product.
     * 										
     * 										
     * 										
     * 										
     * 										Character length and limits: 19 single-byte characters maximum */
    private java.lang.String transactionID;

    /* Shipping Address for this transaction. */
    private eBLBaseComponents.apis.ebay.AddressType shipToAddress;

    /* IP Address of the buyer */
    private java.lang.String IPAddress;

    public UpdateAuthorizationRequestType() {
    }

    public UpdateAuthorizationRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String transactionID,
           eBLBaseComponents.apis.ebay.AddressType shipToAddress,
           java.lang.String IPAddress) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.transactionID = transactionID;
        this.shipToAddress = shipToAddress;
        this.IPAddress = IPAddress;
    }


    /**
     * Gets the transactionID value for this UpdateAuthorizationRequestType.
     * 
     * @return transactionID   * The value of the authorizationâtransaction identification number
     * returned by a PayPal product.
     * 										
     * 										
     * 										
     * 										
     * 										Character length and limits: 19 single-byte characters maximum
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this UpdateAuthorizationRequestType.
     * 
     * @param transactionID   * The value of the authorizationâtransaction identification number
     * returned by a PayPal product.
     * 										
     * 										
     * 										
     * 										
     * 										Character length and limits: 19 single-byte characters maximum
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the shipToAddress value for this UpdateAuthorizationRequestType.
     * 
     * @return shipToAddress   * Shipping Address for this transaction.
     */
    public eBLBaseComponents.apis.ebay.AddressType getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this UpdateAuthorizationRequestType.
     * 
     * @param shipToAddress   * Shipping Address for this transaction.
     */
    public void setShipToAddress(eBLBaseComponents.apis.ebay.AddressType shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the IPAddress value for this UpdateAuthorizationRequestType.
     * 
     * @return IPAddress   * IP Address of the buyer
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this UpdateAuthorizationRequestType.
     * 
     * @param IPAddress   * IP Address of the buyer
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAuthorizationRequestType)) return false;
        UpdateAuthorizationRequestType other = (UpdateAuthorizationRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.IPAddress==null && other.getIPAddress()==null) || 
             (this.IPAddress!=null &&
              this.IPAddress.equals(other.getIPAddress())));
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
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
        }
        if (getIPAddress() != null) {
            _hashCode += getIPAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateAuthorizationRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAuthorizationRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShipToAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "IPAddress"));
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
