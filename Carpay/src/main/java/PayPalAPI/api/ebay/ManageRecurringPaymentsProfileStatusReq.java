/**
 * ManageRecurringPaymentsProfileStatusReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class ManageRecurringPaymentsProfileStatusReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusRequestType manageRecurringPaymentsProfileStatusRequest;

    public ManageRecurringPaymentsProfileStatusReq() {
    }

    public ManageRecurringPaymentsProfileStatusReq(
           PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusRequestType manageRecurringPaymentsProfileStatusRequest) {
           this.manageRecurringPaymentsProfileStatusRequest = manageRecurringPaymentsProfileStatusRequest;
    }


    /**
     * Gets the manageRecurringPaymentsProfileStatusRequest value for this ManageRecurringPaymentsProfileStatusReq.
     * 
     * @return manageRecurringPaymentsProfileStatusRequest
     */
    public PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusRequestType getManageRecurringPaymentsProfileStatusRequest() {
        return manageRecurringPaymentsProfileStatusRequest;
    }


    /**
     * Sets the manageRecurringPaymentsProfileStatusRequest value for this ManageRecurringPaymentsProfileStatusReq.
     * 
     * @param manageRecurringPaymentsProfileStatusRequest
     */
    public void setManageRecurringPaymentsProfileStatusRequest(PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusRequestType manageRecurringPaymentsProfileStatusRequest) {
        this.manageRecurringPaymentsProfileStatusRequest = manageRecurringPaymentsProfileStatusRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageRecurringPaymentsProfileStatusReq)) return false;
        ManageRecurringPaymentsProfileStatusReq other = (ManageRecurringPaymentsProfileStatusReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manageRecurringPaymentsProfileStatusRequest==null && other.getManageRecurringPaymentsProfileStatusRequest()==null) || 
             (this.manageRecurringPaymentsProfileStatusRequest!=null &&
              this.manageRecurringPaymentsProfileStatusRequest.equals(other.getManageRecurringPaymentsProfileStatusRequest())));
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
        if (getManageRecurringPaymentsProfileStatusRequest() != null) {
            _hashCode += getManageRecurringPaymentsProfileStatusRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageRecurringPaymentsProfileStatusReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ManageRecurringPaymentsProfileStatusReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageRecurringPaymentsProfileStatusRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManageRecurringPaymentsProfileStatusRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManageRecurringPaymentsProfileStatusRequestType"));
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
