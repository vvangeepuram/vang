/**
 * ListingDesignerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Identifies the Layout and the Theme template 
 * 	       		associated with the item. in case of revision - all data
 * can be min occur = 0
 */
public class ListingDesignerType  implements java.io.Serializable {
    /* Identifies the Layout template associated with the item. */
    private java.lang.Integer layoutID;

    /* A value of true for OptimalPictureSize indicates that the picture
     * 
     * 						URL will be enlarged to fit description of the item. */
    private java.lang.Boolean optimalPictureSize;

    /* Identifies the Theme template associated with the item. */
    private java.lang.Integer themeID;

    public ListingDesignerType() {
    }

    public ListingDesignerType(
           java.lang.Integer layoutID,
           java.lang.Boolean optimalPictureSize,
           java.lang.Integer themeID) {
           this.layoutID = layoutID;
           this.optimalPictureSize = optimalPictureSize;
           this.themeID = themeID;
    }


    /**
     * Gets the layoutID value for this ListingDesignerType.
     * 
     * @return layoutID   * Identifies the Layout template associated with the item.
     */
    public java.lang.Integer getLayoutID() {
        return layoutID;
    }


    /**
     * Sets the layoutID value for this ListingDesignerType.
     * 
     * @param layoutID   * Identifies the Layout template associated with the item.
     */
    public void setLayoutID(java.lang.Integer layoutID) {
        this.layoutID = layoutID;
    }


    /**
     * Gets the optimalPictureSize value for this ListingDesignerType.
     * 
     * @return optimalPictureSize   * A value of true for OptimalPictureSize indicates that the picture
     * 
     * 						URL will be enlarged to fit description of the item.
     */
    public java.lang.Boolean getOptimalPictureSize() {
        return optimalPictureSize;
    }


    /**
     * Sets the optimalPictureSize value for this ListingDesignerType.
     * 
     * @param optimalPictureSize   * A value of true for OptimalPictureSize indicates that the picture
     * 
     * 						URL will be enlarged to fit description of the item.
     */
    public void setOptimalPictureSize(java.lang.Boolean optimalPictureSize) {
        this.optimalPictureSize = optimalPictureSize;
    }


    /**
     * Gets the themeID value for this ListingDesignerType.
     * 
     * @return themeID   * Identifies the Theme template associated with the item.
     */
    public java.lang.Integer getThemeID() {
        return themeID;
    }


    /**
     * Sets the themeID value for this ListingDesignerType.
     * 
     * @param themeID   * Identifies the Theme template associated with the item.
     */
    public void setThemeID(java.lang.Integer themeID) {
        this.themeID = themeID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListingDesignerType)) return false;
        ListingDesignerType other = (ListingDesignerType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.layoutID==null && other.getLayoutID()==null) || 
             (this.layoutID!=null &&
              this.layoutID.equals(other.getLayoutID()))) &&
            ((this.optimalPictureSize==null && other.getOptimalPictureSize()==null) || 
             (this.optimalPictureSize!=null &&
              this.optimalPictureSize.equals(other.getOptimalPictureSize()))) &&
            ((this.themeID==null && other.getThemeID()==null) || 
             (this.themeID!=null &&
              this.themeID.equals(other.getThemeID())));
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
        if (getLayoutID() != null) {
            _hashCode += getLayoutID().hashCode();
        }
        if (getOptimalPictureSize() != null) {
            _hashCode += getOptimalPictureSize().hashCode();
        }
        if (getThemeID() != null) {
            _hashCode += getThemeID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListingDesignerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingDesignerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LayoutID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optimalPictureSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptimalPictureSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("themeID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThemeID"));
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
