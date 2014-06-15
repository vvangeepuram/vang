/**
 * ExternalPartnerTrackingDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ExternalPartnerTrackingDetailsType  implements java.io.Serializable {
    /* PayPal will just log this string. There will NOT be any business
     * logic around it, nor any decisions made based on the value of the
     * string that is passed in.
     *                                 From a tracking/analytical perspective,
     * PayPal would not infer any meaning to any specific value.
     *                                 We would just segment the traffic
     * based on the value passed (Cart and None as an example) and track
     * different
     *                                 metrics like risk/conversion etc based
     * on these segments.
     *                                 The external partner would control
     * the value of what gets passed and we take that value as is and generate
     * data based on it. 
     *                                 Optional */
    private java.lang.String externalPartnerSegmentID;

    public ExternalPartnerTrackingDetailsType() {
    }

    public ExternalPartnerTrackingDetailsType(
           java.lang.String externalPartnerSegmentID) {
           this.externalPartnerSegmentID = externalPartnerSegmentID;
    }


    /**
     * Gets the externalPartnerSegmentID value for this ExternalPartnerTrackingDetailsType.
     * 
     * @return externalPartnerSegmentID   * PayPal will just log this string. There will NOT be any business
     * logic around it, nor any decisions made based on the value of the
     * string that is passed in.
     *                                 From a tracking/analytical perspective,
     * PayPal would not infer any meaning to any specific value.
     *                                 We would just segment the traffic
     * based on the value passed (Cart and None as an example) and track
     * different
     *                                 metrics like risk/conversion etc based
     * on these segments.
     *                                 The external partner would control
     * the value of what gets passed and we take that value as is and generate
     * data based on it. 
     *                                 Optional
     */
    public java.lang.String getExternalPartnerSegmentID() {
        return externalPartnerSegmentID;
    }


    /**
     * Sets the externalPartnerSegmentID value for this ExternalPartnerTrackingDetailsType.
     * 
     * @param externalPartnerSegmentID   * PayPal will just log this string. There will NOT be any business
     * logic around it, nor any decisions made based on the value of the
     * string that is passed in.
     *                                 From a tracking/analytical perspective,
     * PayPal would not infer any meaning to any specific value.
     *                                 We would just segment the traffic
     * based on the value passed (Cart and None as an example) and track
     * different
     *                                 metrics like risk/conversion etc based
     * on these segments.
     *                                 The external partner would control
     * the value of what gets passed and we take that value as is and generate
     * data based on it. 
     *                                 Optional
     */
    public void setExternalPartnerSegmentID(java.lang.String externalPartnerSegmentID) {
        this.externalPartnerSegmentID = externalPartnerSegmentID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalPartnerTrackingDetailsType)) return false;
        ExternalPartnerTrackingDetailsType other = (ExternalPartnerTrackingDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalPartnerSegmentID==null && other.getExternalPartnerSegmentID()==null) || 
             (this.externalPartnerSegmentID!=null &&
              this.externalPartnerSegmentID.equals(other.getExternalPartnerSegmentID())));
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
        if (getExternalPartnerSegmentID() != null) {
            _hashCode += getExternalPartnerSegmentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalPartnerTrackingDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalPartnerTrackingDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalPartnerSegmentID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalPartnerSegmentID"));
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
