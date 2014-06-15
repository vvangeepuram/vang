/**
 * OtherPaymentMethodDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Lists the Payment Methods (other than PayPal) that the use can
 * pay with e.g. Money Order. 
 * 				Optional.
 */
public class OtherPaymentMethodDetailsType  implements java.io.Serializable {
    /* The identifier of the Payment Method. */
    private java.lang.String otherPaymentMethodId;

    /* Valid values are 'Method', 'SubMethod'. */
    private java.lang.String otherPaymentMethodType;

    /* The name of the Payment Method. */
    private java.lang.String otherPaymentMethodLabel;

    /* The short description of the Payment Method, goes along with
     * the label. */
    private java.lang.String otherPaymentMethodLabelDescription;

    /* The title for the long description. */
    private java.lang.String otherPaymentMethodLongDescriptionTitle;

    /* The long description of the Payment Method. */
    private java.lang.String otherPaymentMethodLongDescription;

    /* The icon of the Payment Method. */
    private java.lang.String otherPaymentMethodIcon;

    /* If this flag is true, then OtherPaymentMethodIcon is required
     * to have a valid value; the label will be hidden and only ICON will
     * be shown. */
    private java.lang.Boolean otherPaymentMethodHideLabel;

    public OtherPaymentMethodDetailsType() {
    }

    public OtherPaymentMethodDetailsType(
           java.lang.String otherPaymentMethodId,
           java.lang.String otherPaymentMethodType,
           java.lang.String otherPaymentMethodLabel,
           java.lang.String otherPaymentMethodLabelDescription,
           java.lang.String otherPaymentMethodLongDescriptionTitle,
           java.lang.String otherPaymentMethodLongDescription,
           java.lang.String otherPaymentMethodIcon,
           java.lang.Boolean otherPaymentMethodHideLabel) {
           this.otherPaymentMethodId = otherPaymentMethodId;
           this.otherPaymentMethodType = otherPaymentMethodType;
           this.otherPaymentMethodLabel = otherPaymentMethodLabel;
           this.otherPaymentMethodLabelDescription = otherPaymentMethodLabelDescription;
           this.otherPaymentMethodLongDescriptionTitle = otherPaymentMethodLongDescriptionTitle;
           this.otherPaymentMethodLongDescription = otherPaymentMethodLongDescription;
           this.otherPaymentMethodIcon = otherPaymentMethodIcon;
           this.otherPaymentMethodHideLabel = otherPaymentMethodHideLabel;
    }


    /**
     * Gets the otherPaymentMethodId value for this OtherPaymentMethodDetailsType.
     * 
     * @return otherPaymentMethodId   * The identifier of the Payment Method.
     */
    public java.lang.String getOtherPaymentMethodId() {
        return otherPaymentMethodId;
    }


    /**
     * Sets the otherPaymentMethodId value for this OtherPaymentMethodDetailsType.
     * 
     * @param otherPaymentMethodId   * The identifier of the Payment Method.
     */
    public void setOtherPaymentMethodId(java.lang.String otherPaymentMethodId) {
        this.otherPaymentMethodId = otherPaymentMethodId;
    }


    /**
     * Gets the otherPaymentMethodType value for this OtherPaymentMethodDetailsType.
     * 
     * @return otherPaymentMethodType   * Valid values are 'Method', 'SubMethod'.
     */
    public java.lang.String getOtherPaymentMethodType() {
        return otherPaymentMethodType;
    }


    /**
     * Sets the otherPaymentMethodType value for this OtherPaymentMethodDetailsType.
     * 
     * @param otherPaymentMethodType   * Valid values are 'Method', 'SubMethod'.
     */
    public void setOtherPaymentMethodType(java.lang.String otherPaymentMethodType) {
        this.otherPaymentMethodType = otherPaymentMethodType;
    }


    /**
     * Gets the otherPaymentMethodLabel value for this OtherPaymentMethodDetailsType.
     * 
     * @return otherPaymentMethodLabel   * The name of the Payment Method.
     */
    public java.lang.String getOtherPaymentMethodLabel() {
        return otherPaymentMethodLabel;
    }


    /**
     * Sets the otherPaymentMethodLabel value for this OtherPaymentMethodDetailsType.
     * 
     * @param otherPaymentMethodLabel   * The name of the Payment Method.
     */
    public void setOtherPaymentMethodLabel(java.lang.String otherPaymentMethodLabel) {
        this.otherPaymentMethodLabel = otherPaymentMethodLabel;
    }


    /**
     * Gets the otherPaymentMethodLabelDescription value for this OtherPaymentMethodDetailsType.
     * 
     * @return otherPaymentMethodLabelDescription   * The short description of the Payment Method, goes along with
     * the label.
     */
    public java.lang.String getOtherPaymentMethodLabelDescription() {
        return otherPaymentMethodLabelDescription;
    }


    /**
     * Sets the otherPaymentMethodLabelDescription value for this OtherPaymentMethodDetailsType.
     * 
     * @param otherPaymentMethodLabelDescription   * The short description of the Payment Method, goes along with
     * the label.
     */
    public void setOtherPaymentMethodLabelDescription(java.lang.String otherPaymentMethodLabelDescription) {
        this.otherPaymentMethodLabelDescription = otherPaymentMethodLabelDescription;
    }


    /**
     * Gets the otherPaymentMethodLongDescriptionTitle value for this OtherPaymentMethodDetailsType.
     * 
     * @return otherPaymentMethodLongDescriptionTitle   * The title for the long description.
     */
    public java.lang.String getOtherPaymentMethodLongDescriptionTitle() {
        return otherPaymentMethodLongDescriptionTitle;
    }


    /**
     * Sets the otherPaymentMethodLongDescriptionTitle value for this OtherPaymentMethodDetailsType.
     * 
     * @param otherPaymentMethodLongDescriptionTitle   * The title for the long description.
     */
    public void setOtherPaymentMethodLongDescriptionTitle(java.lang.String otherPaymentMethodLongDescriptionTitle) {
        this.otherPaymentMethodLongDescriptionTitle = otherPaymentMethodLongDescriptionTitle;
    }


    /**
     * Gets the otherPaymentMethodLongDescription value for this OtherPaymentMethodDetailsType.
     * 
     * @return otherPaymentMethodLongDescription   * The long description of the Payment Method.
     */
    public java.lang.String getOtherPaymentMethodLongDescription() {
        return otherPaymentMethodLongDescription;
    }


    /**
     * Sets the otherPaymentMethodLongDescription value for this OtherPaymentMethodDetailsType.
     * 
     * @param otherPaymentMethodLongDescription   * The long description of the Payment Method.
     */
    public void setOtherPaymentMethodLongDescription(java.lang.String otherPaymentMethodLongDescription) {
        this.otherPaymentMethodLongDescription = otherPaymentMethodLongDescription;
    }


    /**
     * Gets the otherPaymentMethodIcon value for this OtherPaymentMethodDetailsType.
     * 
     * @return otherPaymentMethodIcon   * The icon of the Payment Method.
     */
    public java.lang.String getOtherPaymentMethodIcon() {
        return otherPaymentMethodIcon;
    }


    /**
     * Sets the otherPaymentMethodIcon value for this OtherPaymentMethodDetailsType.
     * 
     * @param otherPaymentMethodIcon   * The icon of the Payment Method.
     */
    public void setOtherPaymentMethodIcon(java.lang.String otherPaymentMethodIcon) {
        this.otherPaymentMethodIcon = otherPaymentMethodIcon;
    }


    /**
     * Gets the otherPaymentMethodHideLabel value for this OtherPaymentMethodDetailsType.
     * 
     * @return otherPaymentMethodHideLabel   * If this flag is true, then OtherPaymentMethodIcon is required
     * to have a valid value; the label will be hidden and only ICON will
     * be shown.
     */
    public java.lang.Boolean getOtherPaymentMethodHideLabel() {
        return otherPaymentMethodHideLabel;
    }


    /**
     * Sets the otherPaymentMethodHideLabel value for this OtherPaymentMethodDetailsType.
     * 
     * @param otherPaymentMethodHideLabel   * If this flag is true, then OtherPaymentMethodIcon is required
     * to have a valid value; the label will be hidden and only ICON will
     * be shown.
     */
    public void setOtherPaymentMethodHideLabel(java.lang.Boolean otherPaymentMethodHideLabel) {
        this.otherPaymentMethodHideLabel = otherPaymentMethodHideLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherPaymentMethodDetailsType)) return false;
        OtherPaymentMethodDetailsType other = (OtherPaymentMethodDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.otherPaymentMethodId==null && other.getOtherPaymentMethodId()==null) || 
             (this.otherPaymentMethodId!=null &&
              this.otherPaymentMethodId.equals(other.getOtherPaymentMethodId()))) &&
            ((this.otherPaymentMethodType==null && other.getOtherPaymentMethodType()==null) || 
             (this.otherPaymentMethodType!=null &&
              this.otherPaymentMethodType.equals(other.getOtherPaymentMethodType()))) &&
            ((this.otherPaymentMethodLabel==null && other.getOtherPaymentMethodLabel()==null) || 
             (this.otherPaymentMethodLabel!=null &&
              this.otherPaymentMethodLabel.equals(other.getOtherPaymentMethodLabel()))) &&
            ((this.otherPaymentMethodLabelDescription==null && other.getOtherPaymentMethodLabelDescription()==null) || 
             (this.otherPaymentMethodLabelDescription!=null &&
              this.otherPaymentMethodLabelDescription.equals(other.getOtherPaymentMethodLabelDescription()))) &&
            ((this.otherPaymentMethodLongDescriptionTitle==null && other.getOtherPaymentMethodLongDescriptionTitle()==null) || 
             (this.otherPaymentMethodLongDescriptionTitle!=null &&
              this.otherPaymentMethodLongDescriptionTitle.equals(other.getOtherPaymentMethodLongDescriptionTitle()))) &&
            ((this.otherPaymentMethodLongDescription==null && other.getOtherPaymentMethodLongDescription()==null) || 
             (this.otherPaymentMethodLongDescription!=null &&
              this.otherPaymentMethodLongDescription.equals(other.getOtherPaymentMethodLongDescription()))) &&
            ((this.otherPaymentMethodIcon==null && other.getOtherPaymentMethodIcon()==null) || 
             (this.otherPaymentMethodIcon!=null &&
              this.otherPaymentMethodIcon.equals(other.getOtherPaymentMethodIcon()))) &&
            ((this.otherPaymentMethodHideLabel==null && other.getOtherPaymentMethodHideLabel()==null) || 
             (this.otherPaymentMethodHideLabel!=null &&
              this.otherPaymentMethodHideLabel.equals(other.getOtherPaymentMethodHideLabel())));
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
        if (getOtherPaymentMethodId() != null) {
            _hashCode += getOtherPaymentMethodId().hashCode();
        }
        if (getOtherPaymentMethodType() != null) {
            _hashCode += getOtherPaymentMethodType().hashCode();
        }
        if (getOtherPaymentMethodLabel() != null) {
            _hashCode += getOtherPaymentMethodLabel().hashCode();
        }
        if (getOtherPaymentMethodLabelDescription() != null) {
            _hashCode += getOtherPaymentMethodLabelDescription().hashCode();
        }
        if (getOtherPaymentMethodLongDescriptionTitle() != null) {
            _hashCode += getOtherPaymentMethodLongDescriptionTitle().hashCode();
        }
        if (getOtherPaymentMethodLongDescription() != null) {
            _hashCode += getOtherPaymentMethodLongDescription().hashCode();
        }
        if (getOtherPaymentMethodIcon() != null) {
            _hashCode += getOtherPaymentMethodIcon().hashCode();
        }
        if (getOtherPaymentMethodHideLabel() != null) {
            _hashCode += getOtherPaymentMethodHideLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtherPaymentMethodDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OtherPaymentMethodDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPaymentMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OtherPaymentMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPaymentMethodType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OtherPaymentMethodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPaymentMethodLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OtherPaymentMethodLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPaymentMethodLabelDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OtherPaymentMethodLabelDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPaymentMethodLongDescriptionTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OtherPaymentMethodLongDescriptionTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPaymentMethodLongDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OtherPaymentMethodLongDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPaymentMethodIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OtherPaymentMethodIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPaymentMethodHideLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OtherPaymentMethodHideLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
