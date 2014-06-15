/**
 * DoReauthorizationResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoReauthorizationResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    /* A new authorization identification number.
     * 								
     * 										Character length and limits: 19 single-byte characters */
    private java.lang.String authorizationID;

    private eBLBaseComponents.apis.ebay.AuthorizationInfoType authorizationInfo;

    /* Return msgsubid back to merchant */
    private java.lang.String msgSubID;

    public DoReauthorizationResponseType() {
    }

    public DoReauthorizationResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String authorizationID,
           eBLBaseComponents.apis.ebay.AuthorizationInfoType authorizationInfo,
           java.lang.String msgSubID) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.authorizationID = authorizationID;
        this.authorizationInfo = authorizationInfo;
        this.msgSubID = msgSubID;
    }


    /**
     * Gets the authorizationID value for this DoReauthorizationResponseType.
     * 
     * @return authorizationID   * A new authorization identification number.
     * 								
     * 										Character length and limits: 19 single-byte characters
     */
    public java.lang.String getAuthorizationID() {
        return authorizationID;
    }


    /**
     * Sets the authorizationID value for this DoReauthorizationResponseType.
     * 
     * @param authorizationID   * A new authorization identification number.
     * 								
     * 										Character length and limits: 19 single-byte characters
     */
    public void setAuthorizationID(java.lang.String authorizationID) {
        this.authorizationID = authorizationID;
    }


    /**
     * Gets the authorizationInfo value for this DoReauthorizationResponseType.
     * 
     * @return authorizationInfo
     */
    public eBLBaseComponents.apis.ebay.AuthorizationInfoType getAuthorizationInfo() {
        return authorizationInfo;
    }


    /**
     * Sets the authorizationInfo value for this DoReauthorizationResponseType.
     * 
     * @param authorizationInfo
     */
    public void setAuthorizationInfo(eBLBaseComponents.apis.ebay.AuthorizationInfoType authorizationInfo) {
        this.authorizationInfo = authorizationInfo;
    }


    /**
     * Gets the msgSubID value for this DoReauthorizationResponseType.
     * 
     * @return msgSubID   * Return msgsubid back to merchant
     */
    public java.lang.String getMsgSubID() {
        return msgSubID;
    }


    /**
     * Sets the msgSubID value for this DoReauthorizationResponseType.
     * 
     * @param msgSubID   * Return msgsubid back to merchant
     */
    public void setMsgSubID(java.lang.String msgSubID) {
        this.msgSubID = msgSubID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoReauthorizationResponseType)) return false;
        DoReauthorizationResponseType other = (DoReauthorizationResponseType) obj;
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
            ((this.authorizationInfo==null && other.getAuthorizationInfo()==null) || 
             (this.authorizationInfo!=null &&
              this.authorizationInfo.equals(other.getAuthorizationInfo()))) &&
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
        if (getAuthorizationInfo() != null) {
            _hashCode += getAuthorizationInfo().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoReauthorizationResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReauthorizationResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "AuthorizationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationInfoType"));
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
