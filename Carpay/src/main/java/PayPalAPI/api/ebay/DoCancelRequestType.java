/**
 * DoCancelRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoCancelRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* Msg Sub Id that was used for the orginal operation. */
    private java.lang.String cancelMsgSubID;

    /* Original API's type */
    private eBLBaseComponents.apis.ebay.APIType APIType;

    /* Unique id for each API request to prevent duplicate payments.
     * 											
     * 											
     * 											
     * 											Character length and limits: 38 single-byte characters
     * maximum. */
    private java.lang.String msgSubID;

    public DoCancelRequestType() {
    }

    public DoCancelRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String cancelMsgSubID,
           eBLBaseComponents.apis.ebay.APIType APIType,
           java.lang.String msgSubID) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.cancelMsgSubID = cancelMsgSubID;
        this.APIType = APIType;
        this.msgSubID = msgSubID;
    }


    /**
     * Gets the cancelMsgSubID value for this DoCancelRequestType.
     * 
     * @return cancelMsgSubID   * Msg Sub Id that was used for the orginal operation.
     */
    public java.lang.String getCancelMsgSubID() {
        return cancelMsgSubID;
    }


    /**
     * Sets the cancelMsgSubID value for this DoCancelRequestType.
     * 
     * @param cancelMsgSubID   * Msg Sub Id that was used for the orginal operation.
     */
    public void setCancelMsgSubID(java.lang.String cancelMsgSubID) {
        this.cancelMsgSubID = cancelMsgSubID;
    }


    /**
     * Gets the APIType value for this DoCancelRequestType.
     * 
     * @return APIType   * Original API's type
     */
    public eBLBaseComponents.apis.ebay.APIType getAPIType() {
        return APIType;
    }


    /**
     * Sets the APIType value for this DoCancelRequestType.
     * 
     * @param APIType   * Original API's type
     */
    public void setAPIType(eBLBaseComponents.apis.ebay.APIType APIType) {
        this.APIType = APIType;
    }


    /**
     * Gets the msgSubID value for this DoCancelRequestType.
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
     * Sets the msgSubID value for this DoCancelRequestType.
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
        if (!(obj instanceof DoCancelRequestType)) return false;
        DoCancelRequestType other = (DoCancelRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cancelMsgSubID==null && other.getCancelMsgSubID()==null) || 
             (this.cancelMsgSubID!=null &&
              this.cancelMsgSubID.equals(other.getCancelMsgSubID()))) &&
            ((this.APIType==null && other.getAPIType()==null) || 
             (this.APIType!=null &&
              this.APIType.equals(other.getAPIType()))) &&
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
        if (getCancelMsgSubID() != null) {
            _hashCode += getCancelMsgSubID().hashCode();
        }
        if (getAPIType() != null) {
            _hashCode += getAPIType().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCancelRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCancelRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelMsgSubID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CancelMsgSubID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APIType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "APIType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "APIType"));
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
