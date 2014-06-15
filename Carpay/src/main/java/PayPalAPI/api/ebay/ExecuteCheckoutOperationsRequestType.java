/**
 * ExecuteCheckoutOperationsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class ExecuteCheckoutOperationsRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.ExecuteCheckoutOperationsRequestDetailsType executeCheckoutOperationsRequestDetails;

    public ExecuteCheckoutOperationsRequestType() {
    }

    public ExecuteCheckoutOperationsRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.ExecuteCheckoutOperationsRequestDetailsType executeCheckoutOperationsRequestDetails) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.executeCheckoutOperationsRequestDetails = executeCheckoutOperationsRequestDetails;
    }


    /**
     * Gets the executeCheckoutOperationsRequestDetails value for this ExecuteCheckoutOperationsRequestType.
     * 
     * @return executeCheckoutOperationsRequestDetails
     */
    public eBLBaseComponents.apis.ebay.ExecuteCheckoutOperationsRequestDetailsType getExecuteCheckoutOperationsRequestDetails() {
        return executeCheckoutOperationsRequestDetails;
    }


    /**
     * Sets the executeCheckoutOperationsRequestDetails value for this ExecuteCheckoutOperationsRequestType.
     * 
     * @param executeCheckoutOperationsRequestDetails
     */
    public void setExecuteCheckoutOperationsRequestDetails(eBLBaseComponents.apis.ebay.ExecuteCheckoutOperationsRequestDetailsType executeCheckoutOperationsRequestDetails) {
        this.executeCheckoutOperationsRequestDetails = executeCheckoutOperationsRequestDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteCheckoutOperationsRequestType)) return false;
        ExecuteCheckoutOperationsRequestType other = (ExecuteCheckoutOperationsRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.executeCheckoutOperationsRequestDetails==null && other.getExecuteCheckoutOperationsRequestDetails()==null) || 
             (this.executeCheckoutOperationsRequestDetails!=null &&
              this.executeCheckoutOperationsRequestDetails.equals(other.getExecuteCheckoutOperationsRequestDetails())));
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
        if (getExecuteCheckoutOperationsRequestDetails() != null) {
            _hashCode += getExecuteCheckoutOperationsRequestDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecuteCheckoutOperationsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExecuteCheckoutOperationsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executeCheckoutOperationsRequestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExecuteCheckoutOperationsRequestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExecuteCheckoutOperationsRequestDetailsType"));
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
