/**
 * BMGetInventoryRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BMGetInventoryRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* Hosted Button ID of the button to return inventory for.
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

    public BMGetInventoryRequestType() {
    }

    public BMGetInventoryRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String hostedButtonID) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.hostedButtonID = hostedButtonID;
    }


    /**
     * Gets the hostedButtonID value for this BMGetInventoryRequestType.
     * 
     * @return hostedButtonID   * Hosted Button ID of the button to return inventory for.
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
     * Sets the hostedButtonID value for this BMGetInventoryRequestType.
     * 
     * @param hostedButtonID   * Hosted Button ID of the button to return inventory for.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BMGetInventoryRequestType)) return false;
        BMGetInventoryRequestType other = (BMGetInventoryRequestType) obj;
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
              this.hostedButtonID.equals(other.getHostedButtonID())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BMGetInventoryRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMGetInventoryRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostedButtonID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "HostedButtonID"));
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
