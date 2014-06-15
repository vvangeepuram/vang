/**
 * BillOutstandingAmountRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BillOutstandingAmountRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.BillOutstandingAmountRequestDetailsType billOutstandingAmountRequestDetails;

    public BillOutstandingAmountRequestType() {
    }

    public BillOutstandingAmountRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.BillOutstandingAmountRequestDetailsType billOutstandingAmountRequestDetails) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.billOutstandingAmountRequestDetails = billOutstandingAmountRequestDetails;
    }


    /**
     * Gets the billOutstandingAmountRequestDetails value for this BillOutstandingAmountRequestType.
     * 
     * @return billOutstandingAmountRequestDetails
     */
    public eBLBaseComponents.apis.ebay.BillOutstandingAmountRequestDetailsType getBillOutstandingAmountRequestDetails() {
        return billOutstandingAmountRequestDetails;
    }


    /**
     * Sets the billOutstandingAmountRequestDetails value for this BillOutstandingAmountRequestType.
     * 
     * @param billOutstandingAmountRequestDetails
     */
    public void setBillOutstandingAmountRequestDetails(eBLBaseComponents.apis.ebay.BillOutstandingAmountRequestDetailsType billOutstandingAmountRequestDetails) {
        this.billOutstandingAmountRequestDetails = billOutstandingAmountRequestDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillOutstandingAmountRequestType)) return false;
        BillOutstandingAmountRequestType other = (BillOutstandingAmountRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.billOutstandingAmountRequestDetails==null && other.getBillOutstandingAmountRequestDetails()==null) || 
             (this.billOutstandingAmountRequestDetails!=null &&
              this.billOutstandingAmountRequestDetails.equals(other.getBillOutstandingAmountRequestDetails())));
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
        if (getBillOutstandingAmountRequestDetails() != null) {
            _hashCode += getBillOutstandingAmountRequestDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillOutstandingAmountRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillOutstandingAmountRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOutstandingAmountRequestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillOutstandingAmountRequestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillOutstandingAmountRequestDetailsType"));
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
