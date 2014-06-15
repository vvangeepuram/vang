/**
 * ThreeDSecureResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * 3DS remaining fields.
 */
public class ThreeDSecureResponseType  implements java.io.Serializable {
    private java.lang.String vpas;

    private java.lang.String eciSubmitted3DS;

    public ThreeDSecureResponseType() {
    }

    public ThreeDSecureResponseType(
           java.lang.String vpas,
           java.lang.String eciSubmitted3DS) {
           this.vpas = vpas;
           this.eciSubmitted3DS = eciSubmitted3DS;
    }


    /**
     * Gets the vpas value for this ThreeDSecureResponseType.
     * 
     * @return vpas
     */
    public java.lang.String getVpas() {
        return vpas;
    }


    /**
     * Sets the vpas value for this ThreeDSecureResponseType.
     * 
     * @param vpas
     */
    public void setVpas(java.lang.String vpas) {
        this.vpas = vpas;
    }


    /**
     * Gets the eciSubmitted3DS value for this ThreeDSecureResponseType.
     * 
     * @return eciSubmitted3DS
     */
    public java.lang.String getEciSubmitted3DS() {
        return eciSubmitted3DS;
    }


    /**
     * Sets the eciSubmitted3DS value for this ThreeDSecureResponseType.
     * 
     * @param eciSubmitted3DS
     */
    public void setEciSubmitted3DS(java.lang.String eciSubmitted3DS) {
        this.eciSubmitted3DS = eciSubmitted3DS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThreeDSecureResponseType)) return false;
        ThreeDSecureResponseType other = (ThreeDSecureResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vpas==null && other.getVpas()==null) || 
             (this.vpas!=null &&
              this.vpas.equals(other.getVpas()))) &&
            ((this.eciSubmitted3DS==null && other.getEciSubmitted3DS()==null) || 
             (this.eciSubmitted3DS!=null &&
              this.eciSubmitted3DS.equals(other.getEciSubmitted3DS())));
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
        if (getVpas() != null) {
            _hashCode += getVpas().hashCode();
        }
        if (getEciSubmitted3DS() != null) {
            _hashCode += getEciSubmitted3DS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThreeDSecureResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vpas");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Vpas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eciSubmitted3DS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EciSubmitted3DS"));
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
