/**
 * UATPDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * UATP Card Details Type
 */
public class UATPDetailsType  implements java.io.Serializable {
    /* UATP Card Number */
    private java.lang.String UATPNumber;

    /* UATP Card expirty month */
    private int expMonth;

    /* UATP Card expirty year */
    private int expYear;

    public UATPDetailsType() {
    }

    public UATPDetailsType(
           java.lang.String UATPNumber,
           int expMonth,
           int expYear) {
           this.UATPNumber = UATPNumber;
           this.expMonth = expMonth;
           this.expYear = expYear;
    }


    /**
     * Gets the UATPNumber value for this UATPDetailsType.
     * 
     * @return UATPNumber   * UATP Card Number
     */
    public java.lang.String getUATPNumber() {
        return UATPNumber;
    }


    /**
     * Sets the UATPNumber value for this UATPDetailsType.
     * 
     * @param UATPNumber   * UATP Card Number
     */
    public void setUATPNumber(java.lang.String UATPNumber) {
        this.UATPNumber = UATPNumber;
    }


    /**
     * Gets the expMonth value for this UATPDetailsType.
     * 
     * @return expMonth   * UATP Card expirty month
     */
    public int getExpMonth() {
        return expMonth;
    }


    /**
     * Sets the expMonth value for this UATPDetailsType.
     * 
     * @param expMonth   * UATP Card expirty month
     */
    public void setExpMonth(int expMonth) {
        this.expMonth = expMonth;
    }


    /**
     * Gets the expYear value for this UATPDetailsType.
     * 
     * @return expYear   * UATP Card expirty year
     */
    public int getExpYear() {
        return expYear;
    }


    /**
     * Sets the expYear value for this UATPDetailsType.
     * 
     * @param expYear   * UATP Card expirty year
     */
    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UATPDetailsType)) return false;
        UATPDetailsType other = (UATPDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.UATPNumber==null && other.getUATPNumber()==null) || 
             (this.UATPNumber!=null &&
              this.UATPNumber.equals(other.getUATPNumber()))) &&
            this.expMonth == other.getExpMonth() &&
            this.expYear == other.getExpYear();
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
        if (getUATPNumber() != null) {
            _hashCode += getUATPNumber().hashCode();
        }
        _hashCode += getExpMonth();
        _hashCode += getExpYear();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UATPDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UATPDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UATPNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UATPNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExpMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExpYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
