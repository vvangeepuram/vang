/**
 * BMManageButtonStatusRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BMManageButtonStatusRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* Button ID of Hosted button.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 10 single-byte numeric characters */
    private java.lang.String hostedButtonID;

    /* Requested Status change for hosted button.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 1 single-byte alphanumeric characters */
    private eBLBaseComponents.apis.ebay.ButtonStatusType buttonStatus;

    public BMManageButtonStatusRequestType() {
    }

    public BMManageButtonStatusRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String hostedButtonID,
           eBLBaseComponents.apis.ebay.ButtonStatusType buttonStatus) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.hostedButtonID = hostedButtonID;
        this.buttonStatus = buttonStatus;
    }


    /**
     * Gets the hostedButtonID value for this BMManageButtonStatusRequestType.
     * 
     * @return hostedButtonID   * Button ID of Hosted button.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 10 single-byte numeric characters
     */
    public java.lang.String getHostedButtonID() {
        return hostedButtonID;
    }


    /**
     * Sets the hostedButtonID value for this BMManageButtonStatusRequestType.
     * 
     * @param hostedButtonID   * Button ID of Hosted button.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 10 single-byte numeric characters
     */
    public void setHostedButtonID(java.lang.String hostedButtonID) {
        this.hostedButtonID = hostedButtonID;
    }


    /**
     * Gets the buttonStatus value for this BMManageButtonStatusRequestType.
     * 
     * @return buttonStatus   * Requested Status change for hosted button.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 1 single-byte alphanumeric characters
     */
    public eBLBaseComponents.apis.ebay.ButtonStatusType getButtonStatus() {
        return buttonStatus;
    }


    /**
     * Sets the buttonStatus value for this BMManageButtonStatusRequestType.
     * 
     * @param buttonStatus   * Requested Status change for hosted button.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 1 single-byte alphanumeric characters
     */
    public void setButtonStatus(eBLBaseComponents.apis.ebay.ButtonStatusType buttonStatus) {
        this.buttonStatus = buttonStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BMManageButtonStatusRequestType)) return false;
        BMManageButtonStatusRequestType other = (BMManageButtonStatusRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostedButtonID==null && other.getHostedButtonID()==null) || 
             (this.hostedButtonID!=null &&
              this.hostedButtonID.equals(other.getHostedButtonID()))) &&
            ((this.buttonStatus==null && other.getButtonStatus()==null) || 
             (this.buttonStatus!=null &&
              this.buttonStatus.equals(other.getButtonStatus())));
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
        if (getHostedButtonID() != null) {
            _hashCode += getHostedButtonID().hashCode();
        }
        if (getButtonStatus() != null) {
            _hashCode += getButtonStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BMManageButtonStatusRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMManageButtonStatusRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostedButtonID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "HostedButtonID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ButtonStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonStatusType"));
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
