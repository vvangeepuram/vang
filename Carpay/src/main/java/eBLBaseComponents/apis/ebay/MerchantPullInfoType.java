/**
 * MerchantPullInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * MerchantPullInfoType 
 * 				Information about the merchant pull.
 */
public class MerchantPullInfoType  implements java.io.Serializable {
    /* Current status of billing agreement */
    private eBLBaseComponents.apis.ebay.MerchantPullStatusCodeType mpStatus;

    /* Monthly maximum payment amount */
    private CoreComponentTypes.apis.ebay.BasicAmountType mpMax;

    /* The value of the mp_custom variable that you specified in a
     * FORM submission to PayPal during the creation or updating of a customer
     * billing agreement */
    private java.lang.String mpCustom;

    /* The value of the mp_desc variable (description of goods or
     * services) associated with the billing agreement */
    private java.lang.String desc;

    /* Invoice value as set by BillUserRequest API call */
    private java.lang.String invoice;

    /* Custom field as set by BillUserRequest API call */
    private java.lang.String custom;

    /* Note: This field is no longer used and is always empty. */
    private java.lang.String paymentSourceID;

    public MerchantPullInfoType() {
    }

    public MerchantPullInfoType(
           eBLBaseComponents.apis.ebay.MerchantPullStatusCodeType mpStatus,
           CoreComponentTypes.apis.ebay.BasicAmountType mpMax,
           java.lang.String mpCustom,
           java.lang.String desc,
           java.lang.String invoice,
           java.lang.String custom,
           java.lang.String paymentSourceID) {
           this.mpStatus = mpStatus;
           this.mpMax = mpMax;
           this.mpCustom = mpCustom;
           this.desc = desc;
           this.invoice = invoice;
           this.custom = custom;
           this.paymentSourceID = paymentSourceID;
    }


    /**
     * Gets the mpStatus value for this MerchantPullInfoType.
     * 
     * @return mpStatus   * Current status of billing agreement
     */
    public eBLBaseComponents.apis.ebay.MerchantPullStatusCodeType getMpStatus() {
        return mpStatus;
    }


    /**
     * Sets the mpStatus value for this MerchantPullInfoType.
     * 
     * @param mpStatus   * Current status of billing agreement
     */
    public void setMpStatus(eBLBaseComponents.apis.ebay.MerchantPullStatusCodeType mpStatus) {
        this.mpStatus = mpStatus;
    }


    /**
     * Gets the mpMax value for this MerchantPullInfoType.
     * 
     * @return mpMax   * Monthly maximum payment amount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getMpMax() {
        return mpMax;
    }


    /**
     * Sets the mpMax value for this MerchantPullInfoType.
     * 
     * @param mpMax   * Monthly maximum payment amount
     */
    public void setMpMax(CoreComponentTypes.apis.ebay.BasicAmountType mpMax) {
        this.mpMax = mpMax;
    }


    /**
     * Gets the mpCustom value for this MerchantPullInfoType.
     * 
     * @return mpCustom   * The value of the mp_custom variable that you specified in a
     * FORM submission to PayPal during the creation or updating of a customer
     * billing agreement
     */
    public java.lang.String getMpCustom() {
        return mpCustom;
    }


    /**
     * Sets the mpCustom value for this MerchantPullInfoType.
     * 
     * @param mpCustom   * The value of the mp_custom variable that you specified in a
     * FORM submission to PayPal during the creation or updating of a customer
     * billing agreement
     */
    public void setMpCustom(java.lang.String mpCustom) {
        this.mpCustom = mpCustom;
    }


    /**
     * Gets the desc value for this MerchantPullInfoType.
     * 
     * @return desc   * The value of the mp_desc variable (description of goods or
     * services) associated with the billing agreement
     */
    public java.lang.String getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this MerchantPullInfoType.
     * 
     * @param desc   * The value of the mp_desc variable (description of goods or
     * services) associated with the billing agreement
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }


    /**
     * Gets the invoice value for this MerchantPullInfoType.
     * 
     * @return invoice   * Invoice value as set by BillUserRequest API call
     */
    public java.lang.String getInvoice() {
        return invoice;
    }


    /**
     * Sets the invoice value for this MerchantPullInfoType.
     * 
     * @param invoice   * Invoice value as set by BillUserRequest API call
     */
    public void setInvoice(java.lang.String invoice) {
        this.invoice = invoice;
    }


    /**
     * Gets the custom value for this MerchantPullInfoType.
     * 
     * @return custom   * Custom field as set by BillUserRequest API call
     */
    public java.lang.String getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this MerchantPullInfoType.
     * 
     * @param custom   * Custom field as set by BillUserRequest API call
     */
    public void setCustom(java.lang.String custom) {
        this.custom = custom;
    }


    /**
     * Gets the paymentSourceID value for this MerchantPullInfoType.
     * 
     * @return paymentSourceID   * Note: This field is no longer used and is always empty.
     */
    public java.lang.String getPaymentSourceID() {
        return paymentSourceID;
    }


    /**
     * Sets the paymentSourceID value for this MerchantPullInfoType.
     * 
     * @param paymentSourceID   * Note: This field is no longer used and is always empty.
     */
    public void setPaymentSourceID(java.lang.String paymentSourceID) {
        this.paymentSourceID = paymentSourceID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantPullInfoType)) return false;
        MerchantPullInfoType other = (MerchantPullInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mpStatus==null && other.getMpStatus()==null) || 
             (this.mpStatus!=null &&
              this.mpStatus.equals(other.getMpStatus()))) &&
            ((this.mpMax==null && other.getMpMax()==null) || 
             (this.mpMax!=null &&
              this.mpMax.equals(other.getMpMax()))) &&
            ((this.mpCustom==null && other.getMpCustom()==null) || 
             (this.mpCustom!=null &&
              this.mpCustom.equals(other.getMpCustom()))) &&
            ((this.desc==null && other.getDesc()==null) || 
             (this.desc!=null &&
              this.desc.equals(other.getDesc()))) &&
            ((this.invoice==null && other.getInvoice()==null) || 
             (this.invoice!=null &&
              this.invoice.equals(other.getInvoice()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
            ((this.paymentSourceID==null && other.getPaymentSourceID()==null) || 
             (this.paymentSourceID!=null &&
              this.paymentSourceID.equals(other.getPaymentSourceID())));
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
        if (getMpStatus() != null) {
            _hashCode += getMpStatus().hashCode();
        }
        if (getMpMax() != null) {
            _hashCode += getMpMax().hashCode();
        }
        if (getMpCustom() != null) {
            _hashCode += getMpCustom().hashCode();
        }
        if (getDesc() != null) {
            _hashCode += getDesc().hashCode();
        }
        if (getInvoice() != null) {
            _hashCode += getInvoice().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        if (getPaymentSourceID() != null) {
            _hashCode += getPaymentSourceID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchantPullInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MpStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullStatusCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpMax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MpMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpCustom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MpCustom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Invoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentSourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentSourceID"));
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
