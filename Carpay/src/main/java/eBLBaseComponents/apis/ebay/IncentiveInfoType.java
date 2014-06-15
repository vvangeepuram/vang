/**
 * IncentiveInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Details of incentive application on individual bucket.
 */
public class IncentiveInfoType  implements java.io.Serializable {
    /* Incentive redemption code. */
    private java.lang.String incentiveCode;

    /* Defines which bucket or item that the incentive should be applied
     * to. */
    private eBLBaseComponents.apis.ebay.IncentiveApplyIndicationType[] applyIndication;

    public IncentiveInfoType() {
    }

    public IncentiveInfoType(
           java.lang.String incentiveCode,
           eBLBaseComponents.apis.ebay.IncentiveApplyIndicationType[] applyIndication) {
           this.incentiveCode = incentiveCode;
           this.applyIndication = applyIndication;
    }


    /**
     * Gets the incentiveCode value for this IncentiveInfoType.
     * 
     * @return incentiveCode   * Incentive redemption code.
     */
    public java.lang.String getIncentiveCode() {
        return incentiveCode;
    }


    /**
     * Sets the incentiveCode value for this IncentiveInfoType.
     * 
     * @param incentiveCode   * Incentive redemption code.
     */
    public void setIncentiveCode(java.lang.String incentiveCode) {
        this.incentiveCode = incentiveCode;
    }


    /**
     * Gets the applyIndication value for this IncentiveInfoType.
     * 
     * @return applyIndication   * Defines which bucket or item that the incentive should be applied
     * to.
     */
    public eBLBaseComponents.apis.ebay.IncentiveApplyIndicationType[] getApplyIndication() {
        return applyIndication;
    }


    /**
     * Sets the applyIndication value for this IncentiveInfoType.
     * 
     * @param applyIndication   * Defines which bucket or item that the incentive should be applied
     * to.
     */
    public void setApplyIndication(eBLBaseComponents.apis.ebay.IncentiveApplyIndicationType[] applyIndication) {
        this.applyIndication = applyIndication;
    }

    public eBLBaseComponents.apis.ebay.IncentiveApplyIndicationType getApplyIndication(int i) {
        return this.applyIndication[i];
    }

    public void setApplyIndication(int i, eBLBaseComponents.apis.ebay.IncentiveApplyIndicationType _value) {
        this.applyIndication[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncentiveInfoType)) return false;
        IncentiveInfoType other = (IncentiveInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.incentiveCode==null && other.getIncentiveCode()==null) || 
             (this.incentiveCode!=null &&
              this.incentiveCode.equals(other.getIncentiveCode()))) &&
            ((this.applyIndication==null && other.getApplyIndication()==null) || 
             (this.applyIndication!=null &&
              java.util.Arrays.equals(this.applyIndication, other.getApplyIndication())));
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
        if (getIncentiveCode() != null) {
            _hashCode += getIncentiveCode().hashCode();
        }
        if (getApplyIndication() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyIndication());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyIndication(), i);
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
        new org.apache.axis.description.TypeDesc(IncentiveInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incentiveCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyIndication");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ApplyIndication"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveApplyIndicationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
