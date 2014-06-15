/**
 * RecurringPaymentsProfileDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class RecurringPaymentsProfileDetailsType  implements java.io.Serializable {
    /* Subscriber name - if missing, will use name in buyer's account */
    private java.lang.String subscriberName;

    /* Subscriber address - if missing, will use address in buyer's
     * account */
    private eBLBaseComponents.apis.ebay.AddressType subscriberShippingAddress;

    /* When does this Profile begin billing? */
    private java.util.Calendar billingStartDate;

    /* Your own unique invoice or tracking number.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String profileReference;

    public RecurringPaymentsProfileDetailsType() {
    }

    public RecurringPaymentsProfileDetailsType(
           java.lang.String subscriberName,
           eBLBaseComponents.apis.ebay.AddressType subscriberShippingAddress,
           java.util.Calendar billingStartDate,
           java.lang.String profileReference) {
           this.subscriberName = subscriberName;
           this.subscriberShippingAddress = subscriberShippingAddress;
           this.billingStartDate = billingStartDate;
           this.profileReference = profileReference;
    }


    /**
     * Gets the subscriberName value for this RecurringPaymentsProfileDetailsType.
     * 
     * @return subscriberName   * Subscriber name - if missing, will use name in buyer's account
     */
    public java.lang.String getSubscriberName() {
        return subscriberName;
    }


    /**
     * Sets the subscriberName value for this RecurringPaymentsProfileDetailsType.
     * 
     * @param subscriberName   * Subscriber name - if missing, will use name in buyer's account
     */
    public void setSubscriberName(java.lang.String subscriberName) {
        this.subscriberName = subscriberName;
    }


    /**
     * Gets the subscriberShippingAddress value for this RecurringPaymentsProfileDetailsType.
     * 
     * @return subscriberShippingAddress   * Subscriber address - if missing, will use address in buyer's
     * account
     */
    public eBLBaseComponents.apis.ebay.AddressType getSubscriberShippingAddress() {
        return subscriberShippingAddress;
    }


    /**
     * Sets the subscriberShippingAddress value for this RecurringPaymentsProfileDetailsType.
     * 
     * @param subscriberShippingAddress   * Subscriber address - if missing, will use address in buyer's
     * account
     */
    public void setSubscriberShippingAddress(eBLBaseComponents.apis.ebay.AddressType subscriberShippingAddress) {
        this.subscriberShippingAddress = subscriberShippingAddress;
    }


    /**
     * Gets the billingStartDate value for this RecurringPaymentsProfileDetailsType.
     * 
     * @return billingStartDate   * When does this Profile begin billing?
     */
    public java.util.Calendar getBillingStartDate() {
        return billingStartDate;
    }


    /**
     * Sets the billingStartDate value for this RecurringPaymentsProfileDetailsType.
     * 
     * @param billingStartDate   * When does this Profile begin billing?
     */
    public void setBillingStartDate(java.util.Calendar billingStartDate) {
        this.billingStartDate = billingStartDate;
    }


    /**
     * Gets the profileReference value for this RecurringPaymentsProfileDetailsType.
     * 
     * @return profileReference   * Your own unique invoice or tracking number.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getProfileReference() {
        return profileReference;
    }


    /**
     * Sets the profileReference value for this RecurringPaymentsProfileDetailsType.
     * 
     * @param profileReference   * Your own unique invoice or tracking number.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setProfileReference(java.lang.String profileReference) {
        this.profileReference = profileReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecurringPaymentsProfileDetailsType)) return false;
        RecurringPaymentsProfileDetailsType other = (RecurringPaymentsProfileDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberName==null && other.getSubscriberName()==null) || 
             (this.subscriberName!=null &&
              this.subscriberName.equals(other.getSubscriberName()))) &&
            ((this.subscriberShippingAddress==null && other.getSubscriberShippingAddress()==null) || 
             (this.subscriberShippingAddress!=null &&
              this.subscriberShippingAddress.equals(other.getSubscriberShippingAddress()))) &&
            ((this.billingStartDate==null && other.getBillingStartDate()==null) || 
             (this.billingStartDate!=null &&
              this.billingStartDate.equals(other.getBillingStartDate()))) &&
            ((this.profileReference==null && other.getProfileReference()==null) || 
             (this.profileReference!=null &&
              this.profileReference.equals(other.getProfileReference())));
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
        if (getSubscriberName() != null) {
            _hashCode += getSubscriberName().hashCode();
        }
        if (getSubscriberShippingAddress() != null) {
            _hashCode += getSubscriberShippingAddress().hashCode();
        }
        if (getBillingStartDate() != null) {
            _hashCode += getBillingStartDate().hashCode();
        }
        if (getProfileReference() != null) {
            _hashCode += getProfileReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecurringPaymentsProfileDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringPaymentsProfileDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SubscriberName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberShippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SubscriberShippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProfileReference"));
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
