/**
 * BMButtonSearchResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BMButtonSearchResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.ButtonSearchResultType[] buttonSearchResult;

    public BMButtonSearchResponseType() {
    }

    public BMButtonSearchResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.ButtonSearchResultType[] buttonSearchResult) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.buttonSearchResult = buttonSearchResult;
    }


    /**
     * Gets the buttonSearchResult value for this BMButtonSearchResponseType.
     * 
     * @return buttonSearchResult
     */
    public eBLBaseComponents.apis.ebay.ButtonSearchResultType[] getButtonSearchResult() {
        return buttonSearchResult;
    }


    /**
     * Sets the buttonSearchResult value for this BMButtonSearchResponseType.
     * 
     * @param buttonSearchResult
     */
    public void setButtonSearchResult(eBLBaseComponents.apis.ebay.ButtonSearchResultType[] buttonSearchResult) {
        this.buttonSearchResult = buttonSearchResult;
    }

    public eBLBaseComponents.apis.ebay.ButtonSearchResultType getButtonSearchResult(int i) {
        return this.buttonSearchResult[i];
    }

    public void setButtonSearchResult(int i, eBLBaseComponents.apis.ebay.ButtonSearchResultType _value) {
        this.buttonSearchResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BMButtonSearchResponseType)) return false;
        BMButtonSearchResponseType other = (BMButtonSearchResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.buttonSearchResult==null && other.getButtonSearchResult()==null) || 
             (this.buttonSearchResult!=null &&
              java.util.Arrays.equals(this.buttonSearchResult, other.getButtonSearchResult())));
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
        if (getButtonSearchResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getButtonSearchResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getButtonSearchResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BMButtonSearchResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMButtonSearchResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonSearchResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonSearchResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonSearchResult"));
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
