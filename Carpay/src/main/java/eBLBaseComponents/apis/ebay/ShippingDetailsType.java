/**
 * ShippingDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Specifies the shipping payment details.
 */
public class ShippingDetailsType  implements java.io.Serializable {
    /* Indicates whether the buyer edited the payment amount. */
    private java.lang.Boolean allowPaymentEdit;

    /* Calculated shipping rate details.  If present, then the calculated
     * shipping rate option was used. */
    private eBLBaseComponents.apis.ebay.CalculatedShippingRateType calculatedShippingRate;

    /* Indicates whether the payment instructions are included (e.g.,
     * for updating the
     *                                	  details of a transaction). */
    private java.lang.Boolean changePaymentInstructions;

    /* Flat shipping rate details. If present, then the flat shipping
     * rate option was used. */
    private eBLBaseComponents.apis.ebay.FlatShippingRateType[] flatShippingRate;

    /* Total cost of insurance for the transaction. */
    private CoreComponentTypes.apis.ebay.AmountType insuranceTotal;

    /* Indicates whether buyer selected to have insurance. */
    private java.lang.Boolean insuranceWanted;

    /* Payment instuctions. */
    private java.lang.String paymentInstructions;

    /* Sales tax details. Sales tax applicable for only US sites.
     *                                     For non-US sites this sub-element
     * should not be used. */
    private eBLBaseComponents.apis.ebay.SalesTaxType salesTax;

    /* Postal/Zip code from where the seller will ship the item. */
    private java.lang.String sellerPostalCode;

    public ShippingDetailsType() {
    }

    public ShippingDetailsType(
           java.lang.Boolean allowPaymentEdit,
           eBLBaseComponents.apis.ebay.CalculatedShippingRateType calculatedShippingRate,
           java.lang.Boolean changePaymentInstructions,
           eBLBaseComponents.apis.ebay.FlatShippingRateType[] flatShippingRate,
           CoreComponentTypes.apis.ebay.AmountType insuranceTotal,
           java.lang.Boolean insuranceWanted,
           java.lang.String paymentInstructions,
           eBLBaseComponents.apis.ebay.SalesTaxType salesTax,
           java.lang.String sellerPostalCode) {
           this.allowPaymentEdit = allowPaymentEdit;
           this.calculatedShippingRate = calculatedShippingRate;
           this.changePaymentInstructions = changePaymentInstructions;
           this.flatShippingRate = flatShippingRate;
           this.insuranceTotal = insuranceTotal;
           this.insuranceWanted = insuranceWanted;
           this.paymentInstructions = paymentInstructions;
           this.salesTax = salesTax;
           this.sellerPostalCode = sellerPostalCode;
    }


    /**
     * Gets the allowPaymentEdit value for this ShippingDetailsType.
     * 
     * @return allowPaymentEdit   * Indicates whether the buyer edited the payment amount.
     */
    public java.lang.Boolean getAllowPaymentEdit() {
        return allowPaymentEdit;
    }


    /**
     * Sets the allowPaymentEdit value for this ShippingDetailsType.
     * 
     * @param allowPaymentEdit   * Indicates whether the buyer edited the payment amount.
     */
    public void setAllowPaymentEdit(java.lang.Boolean allowPaymentEdit) {
        this.allowPaymentEdit = allowPaymentEdit;
    }


    /**
     * Gets the calculatedShippingRate value for this ShippingDetailsType.
     * 
     * @return calculatedShippingRate   * Calculated shipping rate details.  If present, then the calculated
     * shipping rate option was used.
     */
    public eBLBaseComponents.apis.ebay.CalculatedShippingRateType getCalculatedShippingRate() {
        return calculatedShippingRate;
    }


    /**
     * Sets the calculatedShippingRate value for this ShippingDetailsType.
     * 
     * @param calculatedShippingRate   * Calculated shipping rate details.  If present, then the calculated
     * shipping rate option was used.
     */
    public void setCalculatedShippingRate(eBLBaseComponents.apis.ebay.CalculatedShippingRateType calculatedShippingRate) {
        this.calculatedShippingRate = calculatedShippingRate;
    }


    /**
     * Gets the changePaymentInstructions value for this ShippingDetailsType.
     * 
     * @return changePaymentInstructions   * Indicates whether the payment instructions are included (e.g.,
     * for updating the
     *                                	  details of a transaction).
     */
    public java.lang.Boolean getChangePaymentInstructions() {
        return changePaymentInstructions;
    }


    /**
     * Sets the changePaymentInstructions value for this ShippingDetailsType.
     * 
     * @param changePaymentInstructions   * Indicates whether the payment instructions are included (e.g.,
     * for updating the
     *                                	  details of a transaction).
     */
    public void setChangePaymentInstructions(java.lang.Boolean changePaymentInstructions) {
        this.changePaymentInstructions = changePaymentInstructions;
    }


    /**
     * Gets the flatShippingRate value for this ShippingDetailsType.
     * 
     * @return flatShippingRate   * Flat shipping rate details. If present, then the flat shipping
     * rate option was used.
     */
    public eBLBaseComponents.apis.ebay.FlatShippingRateType[] getFlatShippingRate() {
        return flatShippingRate;
    }


    /**
     * Sets the flatShippingRate value for this ShippingDetailsType.
     * 
     * @param flatShippingRate   * Flat shipping rate details. If present, then the flat shipping
     * rate option was used.
     */
    public void setFlatShippingRate(eBLBaseComponents.apis.ebay.FlatShippingRateType[] flatShippingRate) {
        this.flatShippingRate = flatShippingRate;
    }

    public eBLBaseComponents.apis.ebay.FlatShippingRateType getFlatShippingRate(int i) {
        return this.flatShippingRate[i];
    }

    public void setFlatShippingRate(int i, eBLBaseComponents.apis.ebay.FlatShippingRateType _value) {
        this.flatShippingRate[i] = _value;
    }


    /**
     * Gets the insuranceTotal value for this ShippingDetailsType.
     * 
     * @return insuranceTotal   * Total cost of insurance for the transaction.
     */
    public CoreComponentTypes.apis.ebay.AmountType getInsuranceTotal() {
        return insuranceTotal;
    }


    /**
     * Sets the insuranceTotal value for this ShippingDetailsType.
     * 
     * @param insuranceTotal   * Total cost of insurance for the transaction.
     */
    public void setInsuranceTotal(CoreComponentTypes.apis.ebay.AmountType insuranceTotal) {
        this.insuranceTotal = insuranceTotal;
    }


    /**
     * Gets the insuranceWanted value for this ShippingDetailsType.
     * 
     * @return insuranceWanted   * Indicates whether buyer selected to have insurance.
     */
    public java.lang.Boolean getInsuranceWanted() {
        return insuranceWanted;
    }


    /**
     * Sets the insuranceWanted value for this ShippingDetailsType.
     * 
     * @param insuranceWanted   * Indicates whether buyer selected to have insurance.
     */
    public void setInsuranceWanted(java.lang.Boolean insuranceWanted) {
        this.insuranceWanted = insuranceWanted;
    }


    /**
     * Gets the paymentInstructions value for this ShippingDetailsType.
     * 
     * @return paymentInstructions   * Payment instuctions.
     */
    public java.lang.String getPaymentInstructions() {
        return paymentInstructions;
    }


    /**
     * Sets the paymentInstructions value for this ShippingDetailsType.
     * 
     * @param paymentInstructions   * Payment instuctions.
     */
    public void setPaymentInstructions(java.lang.String paymentInstructions) {
        this.paymentInstructions = paymentInstructions;
    }


    /**
     * Gets the salesTax value for this ShippingDetailsType.
     * 
     * @return salesTax   * Sales tax details. Sales tax applicable for only US sites.
     *                                     For non-US sites this sub-element
     * should not be used.
     */
    public eBLBaseComponents.apis.ebay.SalesTaxType getSalesTax() {
        return salesTax;
    }


    /**
     * Sets the salesTax value for this ShippingDetailsType.
     * 
     * @param salesTax   * Sales tax details. Sales tax applicable for only US sites.
     *                                     For non-US sites this sub-element
     * should not be used.
     */
    public void setSalesTax(eBLBaseComponents.apis.ebay.SalesTaxType salesTax) {
        this.salesTax = salesTax;
    }


    /**
     * Gets the sellerPostalCode value for this ShippingDetailsType.
     * 
     * @return sellerPostalCode   * Postal/Zip code from where the seller will ship the item.
     */
    public java.lang.String getSellerPostalCode() {
        return sellerPostalCode;
    }


    /**
     * Sets the sellerPostalCode value for this ShippingDetailsType.
     * 
     * @param sellerPostalCode   * Postal/Zip code from where the seller will ship the item.
     */
    public void setSellerPostalCode(java.lang.String sellerPostalCode) {
        this.sellerPostalCode = sellerPostalCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingDetailsType)) return false;
        ShippingDetailsType other = (ShippingDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowPaymentEdit==null && other.getAllowPaymentEdit()==null) || 
             (this.allowPaymentEdit!=null &&
              this.allowPaymentEdit.equals(other.getAllowPaymentEdit()))) &&
            ((this.calculatedShippingRate==null && other.getCalculatedShippingRate()==null) || 
             (this.calculatedShippingRate!=null &&
              this.calculatedShippingRate.equals(other.getCalculatedShippingRate()))) &&
            ((this.changePaymentInstructions==null && other.getChangePaymentInstructions()==null) || 
             (this.changePaymentInstructions!=null &&
              this.changePaymentInstructions.equals(other.getChangePaymentInstructions()))) &&
            ((this.flatShippingRate==null && other.getFlatShippingRate()==null) || 
             (this.flatShippingRate!=null &&
              java.util.Arrays.equals(this.flatShippingRate, other.getFlatShippingRate()))) &&
            ((this.insuranceTotal==null && other.getInsuranceTotal()==null) || 
             (this.insuranceTotal!=null &&
              this.insuranceTotal.equals(other.getInsuranceTotal()))) &&
            ((this.insuranceWanted==null && other.getInsuranceWanted()==null) || 
             (this.insuranceWanted!=null &&
              this.insuranceWanted.equals(other.getInsuranceWanted()))) &&
            ((this.paymentInstructions==null && other.getPaymentInstructions()==null) || 
             (this.paymentInstructions!=null &&
              this.paymentInstructions.equals(other.getPaymentInstructions()))) &&
            ((this.salesTax==null && other.getSalesTax()==null) || 
             (this.salesTax!=null &&
              this.salesTax.equals(other.getSalesTax()))) &&
            ((this.sellerPostalCode==null && other.getSellerPostalCode()==null) || 
             (this.sellerPostalCode!=null &&
              this.sellerPostalCode.equals(other.getSellerPostalCode())));
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
        if (getAllowPaymentEdit() != null) {
            _hashCode += getAllowPaymentEdit().hashCode();
        }
        if (getCalculatedShippingRate() != null) {
            _hashCode += getCalculatedShippingRate().hashCode();
        }
        if (getChangePaymentInstructions() != null) {
            _hashCode += getChangePaymentInstructions().hashCode();
        }
        if (getFlatShippingRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlatShippingRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlatShippingRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInsuranceTotal() != null) {
            _hashCode += getInsuranceTotal().hashCode();
        }
        if (getInsuranceWanted() != null) {
            _hashCode += getInsuranceWanted().hashCode();
        }
        if (getPaymentInstructions() != null) {
            _hashCode += getPaymentInstructions().hashCode();
        }
        if (getSalesTax() != null) {
            _hashCode += getSalesTax().hashCode();
        }
        if (getSellerPostalCode() != null) {
            _hashCode += getSellerPostalCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPaymentEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AllowPaymentEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculatedShippingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CalculatedShippingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CalculatedShippingRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changePaymentInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ChangePaymentInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flatShippingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlatShippingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlatShippingRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InsuranceTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceWanted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InsuranceWanted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SalesTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SalesTaxType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerPostalCode"));
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
