/**
 * ManagePendingTransactionStatusReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class ManagePendingTransactionStatusReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.ManagePendingTransactionStatusRequestType managePendingTransactionStatusRequest;

    public ManagePendingTransactionStatusReq() {
    }

    public ManagePendingTransactionStatusReq(
           PayPalAPI.api.ebay.ManagePendingTransactionStatusRequestType managePendingTransactionStatusRequest) {
           this.managePendingTransactionStatusRequest = managePendingTransactionStatusRequest;
    }


    /**
     * Gets the managePendingTransactionStatusRequest value for this ManagePendingTransactionStatusReq.
     * 
     * @return managePendingTransactionStatusRequest
     */
    public PayPalAPI.api.ebay.ManagePendingTransactionStatusRequestType getManagePendingTransactionStatusRequest() {
        return managePendingTransactionStatusRequest;
    }


    /**
     * Sets the managePendingTransactionStatusRequest value for this ManagePendingTransactionStatusReq.
     * 
     * @param managePendingTransactionStatusRequest
     */
    public void setManagePendingTransactionStatusRequest(PayPalAPI.api.ebay.ManagePendingTransactionStatusRequestType managePendingTransactionStatusRequest) {
        this.managePendingTransactionStatusRequest = managePendingTransactionStatusRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagePendingTransactionStatusReq)) return false;
        ManagePendingTransactionStatusReq other = (ManagePendingTransactionStatusReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.managePendingTransactionStatusRequest==null && other.getManagePendingTransactionStatusRequest()==null) || 
             (this.managePendingTransactionStatusRequest!=null &&
              this.managePendingTransactionStatusRequest.equals(other.getManagePendingTransactionStatusRequest())));
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
        if (getManagePendingTransactionStatusRequest() != null) {
            _hashCode += getManagePendingTransactionStatusRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagePendingTransactionStatusReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ManagePendingTransactionStatusReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managePendingTransactionStatusRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManagePendingTransactionStatusRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManagePendingTransactionStatusRequestType"));
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
