/**
 * BusinessInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * BusinessInfoType
 */
public class BusinessInfoType  implements java.io.Serializable {
    /* Type of business, such as corporation or sole proprietorship */
    private eBLBaseComponents.apis.ebay.BusinessTypeType type;

    /* Official name of business
     * 
     * 						
     * Character length and limitations: 75 alphanumeric characters */
    private java.lang.String name;

    /* Merchantâs business postal address */
    private eBLBaseComponents.apis.ebay.AddressType address;

    /* Businessâs primary telephone number
     * 
     * 						
     * Character length and limitations: 20 alphanumeric characters */
    private java.lang.String workPhone;

    /* Line of business, as defined in the enumerations */
    private eBLBaseComponents.apis.ebay.BusinessCategoryType category;

    /* Business sub-category, as defined in the enumerations */
    private eBLBaseComponents.apis.ebay.BusinessSubCategoryType subCategory;

    /* Average transaction price, as defined by the enumerations. */
    private eBLBaseComponents.apis.ebay.AverageTransactionPriceType averagePrice;

    /* Average monthly sales volume, as defined by the enumerations. */
    private eBLBaseComponents.apis.ebay.AverageMonthlyVolumeType averageMonthlyVolume;

    /* Main sales venue, such as eBay */
    private eBLBaseComponents.apis.ebay.SalesVenueType salesVenue;

    /* Primary URL of business
     * 			
     * 						Character length and limitations: 2,048 alphanumeric characters */
    private java.lang.String website;

    /* Percentage of revenue attributable to online sales, as defined
     * by the enumerations */
    private eBLBaseComponents.apis.ebay.PercentageRevenueFromOnlineSalesType revenueFromOnlineSales;

    /* Date the merchantâs business was established */
    private java.util.Calendar businessEstablished;

    /* Email address to contact businessâs customer service
     * 
     * 						
     * Character length and limitations: 127 alphanumeric characters */
    private java.lang.String customerServiceEmail;

    /* Telephone number to contact businessâs customer service
     * 
     * 						Character length and limitations: 32 alphanumeric characters */
    private java.lang.String customerServicePhone;

    public BusinessInfoType() {
    }

    public BusinessInfoType(
           eBLBaseComponents.apis.ebay.BusinessTypeType type,
           java.lang.String name,
           eBLBaseComponents.apis.ebay.AddressType address,
           java.lang.String workPhone,
           eBLBaseComponents.apis.ebay.BusinessCategoryType category,
           eBLBaseComponents.apis.ebay.BusinessSubCategoryType subCategory,
           eBLBaseComponents.apis.ebay.AverageTransactionPriceType averagePrice,
           eBLBaseComponents.apis.ebay.AverageMonthlyVolumeType averageMonthlyVolume,
           eBLBaseComponents.apis.ebay.SalesVenueType salesVenue,
           java.lang.String website,
           eBLBaseComponents.apis.ebay.PercentageRevenueFromOnlineSalesType revenueFromOnlineSales,
           java.util.Calendar businessEstablished,
           java.lang.String customerServiceEmail,
           java.lang.String customerServicePhone) {
           this.type = type;
           this.name = name;
           this.address = address;
           this.workPhone = workPhone;
           this.category = category;
           this.subCategory = subCategory;
           this.averagePrice = averagePrice;
           this.averageMonthlyVolume = averageMonthlyVolume;
           this.salesVenue = salesVenue;
           this.website = website;
           this.revenueFromOnlineSales = revenueFromOnlineSales;
           this.businessEstablished = businessEstablished;
           this.customerServiceEmail = customerServiceEmail;
           this.customerServicePhone = customerServicePhone;
    }


    /**
     * Gets the type value for this BusinessInfoType.
     * 
     * @return type   * Type of business, such as corporation or sole proprietorship
     */
    public eBLBaseComponents.apis.ebay.BusinessTypeType getType() {
        return type;
    }


    /**
     * Sets the type value for this BusinessInfoType.
     * 
     * @param type   * Type of business, such as corporation or sole proprietorship
     */
    public void setType(eBLBaseComponents.apis.ebay.BusinessTypeType type) {
        this.type = type;
    }


    /**
     * Gets the name value for this BusinessInfoType.
     * 
     * @return name   * Official name of business
     * 
     * 						
     * Character length and limitations: 75 alphanumeric characters
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BusinessInfoType.
     * 
     * @param name   * Official name of business
     * 
     * 						
     * Character length and limitations: 75 alphanumeric characters
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the address value for this BusinessInfoType.
     * 
     * @return address   * Merchantâs business postal address
     */
    public eBLBaseComponents.apis.ebay.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this BusinessInfoType.
     * 
     * @param address   * Merchantâs business postal address
     */
    public void setAddress(eBLBaseComponents.apis.ebay.AddressType address) {
        this.address = address;
    }


    /**
     * Gets the workPhone value for this BusinessInfoType.
     * 
     * @return workPhone   * Businessâs primary telephone number
     * 
     * 						
     * Character length and limitations: 20 alphanumeric characters
     */
    public java.lang.String getWorkPhone() {
        return workPhone;
    }


    /**
     * Sets the workPhone value for this BusinessInfoType.
     * 
     * @param workPhone   * Businessâs primary telephone number
     * 
     * 						
     * Character length and limitations: 20 alphanumeric characters
     */
    public void setWorkPhone(java.lang.String workPhone) {
        this.workPhone = workPhone;
    }


    /**
     * Gets the category value for this BusinessInfoType.
     * 
     * @return category   * Line of business, as defined in the enumerations
     */
    public eBLBaseComponents.apis.ebay.BusinessCategoryType getCategory() {
        return category;
    }


    /**
     * Sets the category value for this BusinessInfoType.
     * 
     * @param category   * Line of business, as defined in the enumerations
     */
    public void setCategory(eBLBaseComponents.apis.ebay.BusinessCategoryType category) {
        this.category = category;
    }


    /**
     * Gets the subCategory value for this BusinessInfoType.
     * 
     * @return subCategory   * Business sub-category, as defined in the enumerations
     */
    public eBLBaseComponents.apis.ebay.BusinessSubCategoryType getSubCategory() {
        return subCategory;
    }


    /**
     * Sets the subCategory value for this BusinessInfoType.
     * 
     * @param subCategory   * Business sub-category, as defined in the enumerations
     */
    public void setSubCategory(eBLBaseComponents.apis.ebay.BusinessSubCategoryType subCategory) {
        this.subCategory = subCategory;
    }


    /**
     * Gets the averagePrice value for this BusinessInfoType.
     * 
     * @return averagePrice   * Average transaction price, as defined by the enumerations.
     */
    public eBLBaseComponents.apis.ebay.AverageTransactionPriceType getAveragePrice() {
        return averagePrice;
    }


    /**
     * Sets the averagePrice value for this BusinessInfoType.
     * 
     * @param averagePrice   * Average transaction price, as defined by the enumerations.
     */
    public void setAveragePrice(eBLBaseComponents.apis.ebay.AverageTransactionPriceType averagePrice) {
        this.averagePrice = averagePrice;
    }


    /**
     * Gets the averageMonthlyVolume value for this BusinessInfoType.
     * 
     * @return averageMonthlyVolume   * Average monthly sales volume, as defined by the enumerations.
     */
    public eBLBaseComponents.apis.ebay.AverageMonthlyVolumeType getAverageMonthlyVolume() {
        return averageMonthlyVolume;
    }


    /**
     * Sets the averageMonthlyVolume value for this BusinessInfoType.
     * 
     * @param averageMonthlyVolume   * Average monthly sales volume, as defined by the enumerations.
     */
    public void setAverageMonthlyVolume(eBLBaseComponents.apis.ebay.AverageMonthlyVolumeType averageMonthlyVolume) {
        this.averageMonthlyVolume = averageMonthlyVolume;
    }


    /**
     * Gets the salesVenue value for this BusinessInfoType.
     * 
     * @return salesVenue   * Main sales venue, such as eBay
     */
    public eBLBaseComponents.apis.ebay.SalesVenueType getSalesVenue() {
        return salesVenue;
    }


    /**
     * Sets the salesVenue value for this BusinessInfoType.
     * 
     * @param salesVenue   * Main sales venue, such as eBay
     */
    public void setSalesVenue(eBLBaseComponents.apis.ebay.SalesVenueType salesVenue) {
        this.salesVenue = salesVenue;
    }


    /**
     * Gets the website value for this BusinessInfoType.
     * 
     * @return website   * Primary URL of business
     * 			
     * 						Character length and limitations: 2,048 alphanumeric characters
     */
    public java.lang.String getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this BusinessInfoType.
     * 
     * @param website   * Primary URL of business
     * 			
     * 						Character length and limitations: 2,048 alphanumeric characters
     */
    public void setWebsite(java.lang.String website) {
        this.website = website;
    }


    /**
     * Gets the revenueFromOnlineSales value for this BusinessInfoType.
     * 
     * @return revenueFromOnlineSales   * Percentage of revenue attributable to online sales, as defined
     * by the enumerations
     */
    public eBLBaseComponents.apis.ebay.PercentageRevenueFromOnlineSalesType getRevenueFromOnlineSales() {
        return revenueFromOnlineSales;
    }


    /**
     * Sets the revenueFromOnlineSales value for this BusinessInfoType.
     * 
     * @param revenueFromOnlineSales   * Percentage of revenue attributable to online sales, as defined
     * by the enumerations
     */
    public void setRevenueFromOnlineSales(eBLBaseComponents.apis.ebay.PercentageRevenueFromOnlineSalesType revenueFromOnlineSales) {
        this.revenueFromOnlineSales = revenueFromOnlineSales;
    }


    /**
     * Gets the businessEstablished value for this BusinessInfoType.
     * 
     * @return businessEstablished   * Date the merchantâs business was established
     */
    public java.util.Calendar getBusinessEstablished() {
        return businessEstablished;
    }


    /**
     * Sets the businessEstablished value for this BusinessInfoType.
     * 
     * @param businessEstablished   * Date the merchantâs business was established
     */
    public void setBusinessEstablished(java.util.Calendar businessEstablished) {
        this.businessEstablished = businessEstablished;
    }


    /**
     * Gets the customerServiceEmail value for this BusinessInfoType.
     * 
     * @return customerServiceEmail   * Email address to contact businessâs customer service
     * 
     * 						
     * Character length and limitations: 127 alphanumeric characters
     */
    public java.lang.String getCustomerServiceEmail() {
        return customerServiceEmail;
    }


    /**
     * Sets the customerServiceEmail value for this BusinessInfoType.
     * 
     * @param customerServiceEmail   * Email address to contact businessâs customer service
     * 
     * 						
     * Character length and limitations: 127 alphanumeric characters
     */
    public void setCustomerServiceEmail(java.lang.String customerServiceEmail) {
        this.customerServiceEmail = customerServiceEmail;
    }


    /**
     * Gets the customerServicePhone value for this BusinessInfoType.
     * 
     * @return customerServicePhone   * Telephone number to contact businessâs customer service
     * 
     * 						Character length and limitations: 32 alphanumeric characters
     */
    public java.lang.String getCustomerServicePhone() {
        return customerServicePhone;
    }


    /**
     * Sets the customerServicePhone value for this BusinessInfoType.
     * 
     * @param customerServicePhone   * Telephone number to contact businessâs customer service
     * 
     * 						Character length and limitations: 32 alphanumeric characters
     */
    public void setCustomerServicePhone(java.lang.String customerServicePhone) {
        this.customerServicePhone = customerServicePhone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessInfoType)) return false;
        BusinessInfoType other = (BusinessInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.workPhone==null && other.getWorkPhone()==null) || 
             (this.workPhone!=null &&
              this.workPhone.equals(other.getWorkPhone()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.subCategory==null && other.getSubCategory()==null) || 
             (this.subCategory!=null &&
              this.subCategory.equals(other.getSubCategory()))) &&
            ((this.averagePrice==null && other.getAveragePrice()==null) || 
             (this.averagePrice!=null &&
              this.averagePrice.equals(other.getAveragePrice()))) &&
            ((this.averageMonthlyVolume==null && other.getAverageMonthlyVolume()==null) || 
             (this.averageMonthlyVolume!=null &&
              this.averageMonthlyVolume.equals(other.getAverageMonthlyVolume()))) &&
            ((this.salesVenue==null && other.getSalesVenue()==null) || 
             (this.salesVenue!=null &&
              this.salesVenue.equals(other.getSalesVenue()))) &&
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite()))) &&
            ((this.revenueFromOnlineSales==null && other.getRevenueFromOnlineSales()==null) || 
             (this.revenueFromOnlineSales!=null &&
              this.revenueFromOnlineSales.equals(other.getRevenueFromOnlineSales()))) &&
            ((this.businessEstablished==null && other.getBusinessEstablished()==null) || 
             (this.businessEstablished!=null &&
              this.businessEstablished.equals(other.getBusinessEstablished()))) &&
            ((this.customerServiceEmail==null && other.getCustomerServiceEmail()==null) || 
             (this.customerServiceEmail!=null &&
              this.customerServiceEmail.equals(other.getCustomerServiceEmail()))) &&
            ((this.customerServicePhone==null && other.getCustomerServicePhone()==null) || 
             (this.customerServicePhone!=null &&
              this.customerServicePhone.equals(other.getCustomerServicePhone())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getWorkPhone() != null) {
            _hashCode += getWorkPhone().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getSubCategory() != null) {
            _hashCode += getSubCategory().hashCode();
        }
        if (getAveragePrice() != null) {
            _hashCode += getAveragePrice().hashCode();
        }
        if (getAverageMonthlyVolume() != null) {
            _hashCode += getAverageMonthlyVolume().hashCode();
        }
        if (getSalesVenue() != null) {
            _hashCode += getSalesVenue().hashCode();
        }
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
        }
        if (getRevenueFromOnlineSales() != null) {
            _hashCode += getRevenueFromOnlineSales().hashCode();
        }
        if (getBusinessEstablished() != null) {
            _hashCode += getBusinessEstablished().hashCode();
        }
        if (getCustomerServiceEmail() != null) {
            _hashCode += getCustomerServiceEmail().hashCode();
        }
        if (getCustomerServicePhone() != null) {
            _hashCode += getCustomerServicePhone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "WorkPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessCategoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SubCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessSubCategoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averagePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AveragePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AverageTransactionPriceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageMonthlyVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AverageMonthlyVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AverageMonthlyVolumeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesVenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SalesVenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SalesVenueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Website"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueFromOnlineSales");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RevenueFromOnlineSales"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PercentageRevenueFromOnlineSalesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessEstablished");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessEstablished"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerServiceEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CustomerServiceEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerServicePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CustomerServicePhone"));
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
