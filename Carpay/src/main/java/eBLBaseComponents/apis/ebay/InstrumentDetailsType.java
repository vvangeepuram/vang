/**
 * InstrumentDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * InstrumentDetailsType
 * 				Promotional Instrument Information.
 */
public class InstrumentDetailsType  implements java.io.Serializable {
    /* This field holds the category of the instrument only when it
     * is promotional. Return value 1 represents BML, 2 reprasents PLCC/Cobranded. */
    private java.lang.String instrumentCategory;

    /* This field holds the InstrumentID issued by external party
     * corresponding to the funding source used in payment. */
    private java.lang.String instrumentID;

    public InstrumentDetailsType() {
    }

    public InstrumentDetailsType(
           java.lang.String instrumentCategory,
           java.lang.String instrumentID) {
           this.instrumentCategory = instrumentCategory;
           this.instrumentID = instrumentID;
    }


    /**
     * Gets the instrumentCategory value for this InstrumentDetailsType.
     * 
     * @return instrumentCategory   * This field holds the category of the instrument only when it
     * is promotional. Return value 1 represents BML, 2 reprasents PLCC/Cobranded.
     */
    public java.lang.String getInstrumentCategory() {
        return instrumentCategory;
    }


    /**
     * Sets the instrumentCategory value for this InstrumentDetailsType.
     * 
     * @param instrumentCategory   * This field holds the category of the instrument only when it
     * is promotional. Return value 1 represents BML, 2 reprasents PLCC/Cobranded.
     */
    public void setInstrumentCategory(java.lang.String instrumentCategory) {
        this.instrumentCategory = instrumentCategory;
    }


    /**
     * Gets the instrumentID value for this InstrumentDetailsType.
     * 
     * @return instrumentID   * This field holds the InstrumentID issued by external party
     * corresponding to the funding source used in payment.
     */
    public java.lang.String getInstrumentID() {
        return instrumentID;
    }


    /**
     * Sets the instrumentID value for this InstrumentDetailsType.
     * 
     * @param instrumentID   * This field holds the InstrumentID issued by external party
     * corresponding to the funding source used in payment.
     */
    public void setInstrumentID(java.lang.String instrumentID) {
        this.instrumentID = instrumentID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstrumentDetailsType)) return false;
        InstrumentDetailsType other = (InstrumentDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instrumentCategory==null && other.getInstrumentCategory()==null) || 
             (this.instrumentCategory!=null &&
              this.instrumentCategory.equals(other.getInstrumentCategory()))) &&
            ((this.instrumentID==null && other.getInstrumentID()==null) || 
             (this.instrumentID!=null &&
              this.instrumentID.equals(other.getInstrumentID())));
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
        if (getInstrumentCategory() != null) {
            _hashCode += getInstrumentCategory().hashCode();
        }
        if (getInstrumentID() != null) {
            _hashCode += getInstrumentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstrumentDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InstrumentDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instrumentCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InstrumentCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instrumentID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InstrumentID"));
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
