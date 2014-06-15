/**
 * VATDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Contains information required To list a business item.
 *                        BusinessSeller - only for add item, the RestrictedToBusiness
 * and VATPercent for both get and add,
 *                        for revise all must be optional
 */
public class VATDetailsType  implements java.io.Serializable {
    private java.lang.Boolean businessSeller;

    private java.lang.Boolean restrictedToBusiness;

    private java.lang.Float VATPercent;

    public VATDetailsType() {
    }

    public VATDetailsType(
           java.lang.Boolean businessSeller,
           java.lang.Boolean restrictedToBusiness,
           java.lang.Float VATPercent) {
           this.businessSeller = businessSeller;
           this.restrictedToBusiness = restrictedToBusiness;
           this.VATPercent = VATPercent;
    }


    /**
     * Gets the businessSeller value for this VATDetailsType.
     * 
     * @return businessSeller
     */
    public java.lang.Boolean getBusinessSeller() {
        return businessSeller;
    }


    /**
     * Sets the businessSeller value for this VATDetailsType.
     * 
     * @param businessSeller
     */
    public void setBusinessSeller(java.lang.Boolean businessSeller) {
        this.businessSeller = businessSeller;
    }


    /**
     * Gets the restrictedToBusiness value for this VATDetailsType.
     * 
     * @return restrictedToBusiness
     */
    public java.lang.Boolean getRestrictedToBusiness() {
        return restrictedToBusiness;
    }


    /**
     * Sets the restrictedToBusiness value for this VATDetailsType.
     * 
     * @param restrictedToBusiness
     */
    public void setRestrictedToBusiness(java.lang.Boolean restrictedToBusiness) {
        this.restrictedToBusiness = restrictedToBusiness;
    }


    /**
     * Gets the VATPercent value for this VATDetailsType.
     * 
     * @return VATPercent
     */
    public java.lang.Float getVATPercent() {
        return VATPercent;
    }


    /**
     * Sets the VATPercent value for this VATDetailsType.
     * 
     * @param VATPercent
     */
    public void setVATPercent(java.lang.Float VATPercent) {
        this.VATPercent = VATPercent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VATDetailsType)) return false;
        VATDetailsType other = (VATDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.businessSeller==null && other.getBusinessSeller()==null) || 
             (this.businessSeller!=null &&
              this.businessSeller.equals(other.getBusinessSeller()))) &&
            ((this.restrictedToBusiness==null && other.getRestrictedToBusiness()==null) || 
             (this.restrictedToBusiness!=null &&
              this.restrictedToBusiness.equals(other.getRestrictedToBusiness()))) &&
            ((this.VATPercent==null && other.getVATPercent()==null) || 
             (this.VATPercent!=null &&
              this.VATPercent.equals(other.getVATPercent())));
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
        if (getBusinessSeller() != null) {
            _hashCode += getBusinessSeller().hashCode();
        }
        if (getRestrictedToBusiness() != null) {
            _hashCode += getRestrictedToBusiness().hashCode();
        }
        if (getVATPercent() != null) {
            _hashCode += getVATPercent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VATDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VATDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessSeller");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessSeller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictedToBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RestrictedToBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VATPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VATPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
