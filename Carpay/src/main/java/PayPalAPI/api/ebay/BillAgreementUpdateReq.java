/**
 * BillAgreementUpdateReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BillAgreementUpdateReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.BAUpdateRequestType BAUpdateRequest;

    public BillAgreementUpdateReq() {
    }

    public BillAgreementUpdateReq(
           PayPalAPI.api.ebay.BAUpdateRequestType BAUpdateRequest) {
           this.BAUpdateRequest = BAUpdateRequest;
    }


    /**
     * Gets the BAUpdateRequest value for this BillAgreementUpdateReq.
     * 
     * @return BAUpdateRequest
     */
    public PayPalAPI.api.ebay.BAUpdateRequestType getBAUpdateRequest() {
        return BAUpdateRequest;
    }


    /**
     * Sets the BAUpdateRequest value for this BillAgreementUpdateReq.
     * 
     * @param BAUpdateRequest
     */
    public void setBAUpdateRequest(PayPalAPI.api.ebay.BAUpdateRequestType BAUpdateRequest) {
        this.BAUpdateRequest = BAUpdateRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillAgreementUpdateReq)) return false;
        BillAgreementUpdateReq other = (BillAgreementUpdateReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BAUpdateRequest==null && other.getBAUpdateRequest()==null) || 
             (this.BAUpdateRequest!=null &&
              this.BAUpdateRequest.equals(other.getBAUpdateRequest())));
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
        if (getBAUpdateRequest() != null) {
            _hashCode += getBAUpdateRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillAgreementUpdateReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BillAgreementUpdateReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAUpdateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BAUpdateRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BAUpdateRequestType"));
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
