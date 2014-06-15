/**
 * PaginationResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class PaginationResultType  implements java.io.Serializable {
    private java.lang.Integer totalNumberOfPages;

    private java.lang.Integer totalNumberOfEntries;

    public PaginationResultType() {
    }

    public PaginationResultType(
           java.lang.Integer totalNumberOfPages,
           java.lang.Integer totalNumberOfEntries) {
           this.totalNumberOfPages = totalNumberOfPages;
           this.totalNumberOfEntries = totalNumberOfEntries;
    }


    /**
     * Gets the totalNumberOfPages value for this PaginationResultType.
     * 
     * @return totalNumberOfPages
     */
    public java.lang.Integer getTotalNumberOfPages() {
        return totalNumberOfPages;
    }


    /**
     * Sets the totalNumberOfPages value for this PaginationResultType.
     * 
     * @param totalNumberOfPages
     */
    public void setTotalNumberOfPages(java.lang.Integer totalNumberOfPages) {
        this.totalNumberOfPages = totalNumberOfPages;
    }


    /**
     * Gets the totalNumberOfEntries value for this PaginationResultType.
     * 
     * @return totalNumberOfEntries
     */
    public java.lang.Integer getTotalNumberOfEntries() {
        return totalNumberOfEntries;
    }


    /**
     * Sets the totalNumberOfEntries value for this PaginationResultType.
     * 
     * @param totalNumberOfEntries
     */
    public void setTotalNumberOfEntries(java.lang.Integer totalNumberOfEntries) {
        this.totalNumberOfEntries = totalNumberOfEntries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaginationResultType)) return false;
        PaginationResultType other = (PaginationResultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalNumberOfPages==null && other.getTotalNumberOfPages()==null) || 
             (this.totalNumberOfPages!=null &&
              this.totalNumberOfPages.equals(other.getTotalNumberOfPages()))) &&
            ((this.totalNumberOfEntries==null && other.getTotalNumberOfEntries()==null) || 
             (this.totalNumberOfEntries!=null &&
              this.totalNumberOfEntries.equals(other.getTotalNumberOfEntries())));
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
        if (getTotalNumberOfPages() != null) {
            _hashCode += getTotalNumberOfPages().hashCode();
        }
        if (getTotalNumberOfEntries() != null) {
            _hashCode += getTotalNumberOfEntries().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaginationResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaginationResultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumberOfPages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TotalNumberOfPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumberOfEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TotalNumberOfEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
