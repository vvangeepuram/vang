/**
 * CategoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Container for data on the primary category of listing.
 */
public class CategoryType  implements java.io.Serializable {
    private java.lang.Boolean autoPayEnabled;

    private java.lang.Boolean b2BVATEnabled;

    private java.lang.Boolean catalogEnabled;

    private java.lang.String categoryID;

    private java.lang.Integer categoryLevel;

    private java.lang.String categoryName;

    private java.lang.String[] categoryParentID;

    private java.lang.String[] categoryParentName;

    /* CSIDList is not present if Attributes enabled. */
    private java.lang.String[] CSIDList;

    private java.lang.Boolean expired;

    private java.lang.Boolean intlAutosFixedCat;

    private java.lang.Boolean leafCategory;

    private java.lang.Boolean virtual;

    public CategoryType() {
    }

    public CategoryType(
           java.lang.Boolean autoPayEnabled,
           java.lang.Boolean b2BVATEnabled,
           java.lang.Boolean catalogEnabled,
           java.lang.String categoryID,
           java.lang.Integer categoryLevel,
           java.lang.String categoryName,
           java.lang.String[] categoryParentID,
           java.lang.String[] categoryParentName,
           java.lang.String[] CSIDList,
           java.lang.Boolean expired,
           java.lang.Boolean intlAutosFixedCat,
           java.lang.Boolean leafCategory,
           java.lang.Boolean virtual) {
           this.autoPayEnabled = autoPayEnabled;
           this.b2BVATEnabled = b2BVATEnabled;
           this.catalogEnabled = catalogEnabled;
           this.categoryID = categoryID;
           this.categoryLevel = categoryLevel;
           this.categoryName = categoryName;
           this.categoryParentID = categoryParentID;
           this.categoryParentName = categoryParentName;
           this.CSIDList = CSIDList;
           this.expired = expired;
           this.intlAutosFixedCat = intlAutosFixedCat;
           this.leafCategory = leafCategory;
           this.virtual = virtual;
    }


    /**
     * Gets the autoPayEnabled value for this CategoryType.
     * 
     * @return autoPayEnabled
     */
    public java.lang.Boolean getAutoPayEnabled() {
        return autoPayEnabled;
    }


    /**
     * Sets the autoPayEnabled value for this CategoryType.
     * 
     * @param autoPayEnabled
     */
    public void setAutoPayEnabled(java.lang.Boolean autoPayEnabled) {
        this.autoPayEnabled = autoPayEnabled;
    }


    /**
     * Gets the b2BVATEnabled value for this CategoryType.
     * 
     * @return b2BVATEnabled
     */
    public java.lang.Boolean getB2BVATEnabled() {
        return b2BVATEnabled;
    }


    /**
     * Sets the b2BVATEnabled value for this CategoryType.
     * 
     * @param b2BVATEnabled
     */
    public void setB2BVATEnabled(java.lang.Boolean b2BVATEnabled) {
        this.b2BVATEnabled = b2BVATEnabled;
    }


    /**
     * Gets the catalogEnabled value for this CategoryType.
     * 
     * @return catalogEnabled
     */
    public java.lang.Boolean getCatalogEnabled() {
        return catalogEnabled;
    }


    /**
     * Sets the catalogEnabled value for this CategoryType.
     * 
     * @param catalogEnabled
     */
    public void setCatalogEnabled(java.lang.Boolean catalogEnabled) {
        this.catalogEnabled = catalogEnabled;
    }


    /**
     * Gets the categoryID value for this CategoryType.
     * 
     * @return categoryID
     */
    public java.lang.String getCategoryID() {
        return categoryID;
    }


    /**
     * Sets the categoryID value for this CategoryType.
     * 
     * @param categoryID
     */
    public void setCategoryID(java.lang.String categoryID) {
        this.categoryID = categoryID;
    }


    /**
     * Gets the categoryLevel value for this CategoryType.
     * 
     * @return categoryLevel
     */
    public java.lang.Integer getCategoryLevel() {
        return categoryLevel;
    }


    /**
     * Sets the categoryLevel value for this CategoryType.
     * 
     * @param categoryLevel
     */
    public void setCategoryLevel(java.lang.Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }


    /**
     * Gets the categoryName value for this CategoryType.
     * 
     * @return categoryName
     */
    public java.lang.String getCategoryName() {
        return categoryName;
    }


    /**
     * Sets the categoryName value for this CategoryType.
     * 
     * @param categoryName
     */
    public void setCategoryName(java.lang.String categoryName) {
        this.categoryName = categoryName;
    }


    /**
     * Gets the categoryParentID value for this CategoryType.
     * 
     * @return categoryParentID
     */
    public java.lang.String[] getCategoryParentID() {
        return categoryParentID;
    }


    /**
     * Sets the categoryParentID value for this CategoryType.
     * 
     * @param categoryParentID
     */
    public void setCategoryParentID(java.lang.String[] categoryParentID) {
        this.categoryParentID = categoryParentID;
    }

    public java.lang.String getCategoryParentID(int i) {
        return this.categoryParentID[i];
    }

    public void setCategoryParentID(int i, java.lang.String _value) {
        this.categoryParentID[i] = _value;
    }


    /**
     * Gets the categoryParentName value for this CategoryType.
     * 
     * @return categoryParentName
     */
    public java.lang.String[] getCategoryParentName() {
        return categoryParentName;
    }


    /**
     * Sets the categoryParentName value for this CategoryType.
     * 
     * @param categoryParentName
     */
    public void setCategoryParentName(java.lang.String[] categoryParentName) {
        this.categoryParentName = categoryParentName;
    }

    public java.lang.String getCategoryParentName(int i) {
        return this.categoryParentName[i];
    }

    public void setCategoryParentName(int i, java.lang.String _value) {
        this.categoryParentName[i] = _value;
    }


    /**
     * Gets the CSIDList value for this CategoryType.
     * 
     * @return CSIDList   * CSIDList is not present if Attributes enabled.
     */
    public java.lang.String[] getCSIDList() {
        return CSIDList;
    }


    /**
     * Sets the CSIDList value for this CategoryType.
     * 
     * @param CSIDList   * CSIDList is not present if Attributes enabled.
     */
    public void setCSIDList(java.lang.String[] CSIDList) {
        this.CSIDList = CSIDList;
    }

    public java.lang.String getCSIDList(int i) {
        return this.CSIDList[i];
    }

    public void setCSIDList(int i, java.lang.String _value) {
        this.CSIDList[i] = _value;
    }


    /**
     * Gets the expired value for this CategoryType.
     * 
     * @return expired
     */
    public java.lang.Boolean getExpired() {
        return expired;
    }


    /**
     * Sets the expired value for this CategoryType.
     * 
     * @param expired
     */
    public void setExpired(java.lang.Boolean expired) {
        this.expired = expired;
    }


    /**
     * Gets the intlAutosFixedCat value for this CategoryType.
     * 
     * @return intlAutosFixedCat
     */
    public java.lang.Boolean getIntlAutosFixedCat() {
        return intlAutosFixedCat;
    }


    /**
     * Sets the intlAutosFixedCat value for this CategoryType.
     * 
     * @param intlAutosFixedCat
     */
    public void setIntlAutosFixedCat(java.lang.Boolean intlAutosFixedCat) {
        this.intlAutosFixedCat = intlAutosFixedCat;
    }


    /**
     * Gets the leafCategory value for this CategoryType.
     * 
     * @return leafCategory
     */
    public java.lang.Boolean getLeafCategory() {
        return leafCategory;
    }


    /**
     * Sets the leafCategory value for this CategoryType.
     * 
     * @param leafCategory
     */
    public void setLeafCategory(java.lang.Boolean leafCategory) {
        this.leafCategory = leafCategory;
    }


    /**
     * Gets the virtual value for this CategoryType.
     * 
     * @return virtual
     */
    public java.lang.Boolean getVirtual() {
        return virtual;
    }


    /**
     * Sets the virtual value for this CategoryType.
     * 
     * @param virtual
     */
    public void setVirtual(java.lang.Boolean virtual) {
        this.virtual = virtual;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoryType)) return false;
        CategoryType other = (CategoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoPayEnabled==null && other.getAutoPayEnabled()==null) || 
             (this.autoPayEnabled!=null &&
              this.autoPayEnabled.equals(other.getAutoPayEnabled()))) &&
            ((this.b2BVATEnabled==null && other.getB2BVATEnabled()==null) || 
             (this.b2BVATEnabled!=null &&
              this.b2BVATEnabled.equals(other.getB2BVATEnabled()))) &&
            ((this.catalogEnabled==null && other.getCatalogEnabled()==null) || 
             (this.catalogEnabled!=null &&
              this.catalogEnabled.equals(other.getCatalogEnabled()))) &&
            ((this.categoryID==null && other.getCategoryID()==null) || 
             (this.categoryID!=null &&
              this.categoryID.equals(other.getCategoryID()))) &&
            ((this.categoryLevel==null && other.getCategoryLevel()==null) || 
             (this.categoryLevel!=null &&
              this.categoryLevel.equals(other.getCategoryLevel()))) &&
            ((this.categoryName==null && other.getCategoryName()==null) || 
             (this.categoryName!=null &&
              this.categoryName.equals(other.getCategoryName()))) &&
            ((this.categoryParentID==null && other.getCategoryParentID()==null) || 
             (this.categoryParentID!=null &&
              java.util.Arrays.equals(this.categoryParentID, other.getCategoryParentID()))) &&
            ((this.categoryParentName==null && other.getCategoryParentName()==null) || 
             (this.categoryParentName!=null &&
              java.util.Arrays.equals(this.categoryParentName, other.getCategoryParentName()))) &&
            ((this.CSIDList==null && other.getCSIDList()==null) || 
             (this.CSIDList!=null &&
              java.util.Arrays.equals(this.CSIDList, other.getCSIDList()))) &&
            ((this.expired==null && other.getExpired()==null) || 
             (this.expired!=null &&
              this.expired.equals(other.getExpired()))) &&
            ((this.intlAutosFixedCat==null && other.getIntlAutosFixedCat()==null) || 
             (this.intlAutosFixedCat!=null &&
              this.intlAutosFixedCat.equals(other.getIntlAutosFixedCat()))) &&
            ((this.leafCategory==null && other.getLeafCategory()==null) || 
             (this.leafCategory!=null &&
              this.leafCategory.equals(other.getLeafCategory()))) &&
            ((this.virtual==null && other.getVirtual()==null) || 
             (this.virtual!=null &&
              this.virtual.equals(other.getVirtual())));
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
        if (getAutoPayEnabled() != null) {
            _hashCode += getAutoPayEnabled().hashCode();
        }
        if (getB2BVATEnabled() != null) {
            _hashCode += getB2BVATEnabled().hashCode();
        }
        if (getCatalogEnabled() != null) {
            _hashCode += getCatalogEnabled().hashCode();
        }
        if (getCategoryID() != null) {
            _hashCode += getCategoryID().hashCode();
        }
        if (getCategoryLevel() != null) {
            _hashCode += getCategoryLevel().hashCode();
        }
        if (getCategoryName() != null) {
            _hashCode += getCategoryName().hashCode();
        }
        if (getCategoryParentID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryParentID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoryParentID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategoryParentName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryParentName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoryParentName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCSIDList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCSIDList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCSIDList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpired() != null) {
            _hashCode += getExpired().hashCode();
        }
        if (getIntlAutosFixedCat() != null) {
            _hashCode += getIntlAutosFixedCat().hashCode();
        }
        if (getLeafCategory() != null) {
            _hashCode += getLeafCategory().hashCode();
        }
        if (getVirtual() != null) {
            _hashCode += getVirtual().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CategoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CategoryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AutoPayEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("b2BVATEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "B2BVATEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalogEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CatalogEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CategoryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CategoryLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CategoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryParentID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CategoryParentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryParentName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CategoryParentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSIDList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CSIDList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Expired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intlAutosFixedCat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IntlAutosFixedCat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leafCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LeafCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtual");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Virtual"));
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
