/**
 * FlowControlDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class FlowControlDetailsType  implements java.io.Serializable {
    /* The URL to redirect to for an unpayable transaction.  This
     * field is currently used only
     * 								for the inline checkout flow. */
    private java.lang.String errorURL;

    /* The URL to redirect to after a user clicks the "Pay" or "Continue"
     * button on the merchant's
     * 								site.  This field is currently used only for the inline checkout
     * flow. */
    private java.lang.String inContextReturnURL;

    public FlowControlDetailsType() {
    }

    public FlowControlDetailsType(
           java.lang.String errorURL,
           java.lang.String inContextReturnURL) {
           this.errorURL = errorURL;
           this.inContextReturnURL = inContextReturnURL;
    }


    /**
     * Gets the errorURL value for this FlowControlDetailsType.
     * 
     * @return errorURL   * The URL to redirect to for an unpayable transaction.  This
     * field is currently used only
     * 								for the inline checkout flow.
     */
    public java.lang.String getErrorURL() {
        return errorURL;
    }


    /**
     * Sets the errorURL value for this FlowControlDetailsType.
     * 
     * @param errorURL   * The URL to redirect to for an unpayable transaction.  This
     * field is currently used only
     * 								for the inline checkout flow.
     */
    public void setErrorURL(java.lang.String errorURL) {
        this.errorURL = errorURL;
    }


    /**
     * Gets the inContextReturnURL value for this FlowControlDetailsType.
     * 
     * @return inContextReturnURL   * The URL to redirect to after a user clicks the "Pay" or "Continue"
     * button on the merchant's
     * 								site.  This field is currently used only for the inline checkout
     * flow.
     */
    public java.lang.String getInContextReturnURL() {
        return inContextReturnURL;
    }


    /**
     * Sets the inContextReturnURL value for this FlowControlDetailsType.
     * 
     * @param inContextReturnURL   * The URL to redirect to after a user clicks the "Pay" or "Continue"
     * button on the merchant's
     * 								site.  This field is currently used only for the inline checkout
     * flow.
     */
    public void setInContextReturnURL(java.lang.String inContextReturnURL) {
        this.inContextReturnURL = inContextReturnURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlowControlDetailsType)) return false;
        FlowControlDetailsType other = (FlowControlDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorURL==null && other.getErrorURL()==null) || 
             (this.errorURL!=null &&
              this.errorURL.equals(other.getErrorURL()))) &&
            ((this.inContextReturnURL==null && other.getInContextReturnURL()==null) || 
             (this.inContextReturnURL!=null &&
              this.inContextReturnURL.equals(other.getInContextReturnURL())));
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
        if (getErrorURL() != null) {
            _hashCode += getErrorURL().hashCode();
        }
        if (getInContextReturnURL() != null) {
            _hashCode += getInContextReturnURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlowControlDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlowControlDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inContextReturnURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InContextReturnURL"));
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
