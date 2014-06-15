/**
 * GetIncentiveEvaluationRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class GetIncentiveEvaluationRequestDetailsType  implements java.io.Serializable {
    private java.lang.String externalBuyerId;

    private java.lang.String[] incentiveCodes;

    private eBLBaseComponents.apis.ebay.IncentiveApplyIndicationType[] applyIndication;

    private eBLBaseComponents.apis.ebay.IncentiveBucketType[] buckets;

    private CoreComponentTypes.apis.ebay.BasicAmountType cartTotalAmt;

    private eBLBaseComponents.apis.ebay.IncentiveRequestDetailsType requestDetails;

    public GetIncentiveEvaluationRequestDetailsType() {
    }

    public GetIncentiveEvaluationRequestDetailsType(
           java.lang.String externalBuyerId,
           java.lang.String[] incentiveCodes,
           eBLBaseComponents.apis.ebay.IncentiveApplyIndicationType[] applyIndication,
           eBLBaseComponents.apis.ebay.IncentiveBucketType[] buckets,
           CoreComponentTypes.apis.ebay.BasicAmountType cartTotalAmt,
           eBLBaseComponents.apis.ebay.IncentiveRequestDetailsType requestDetails) {
           this.externalBuyerId = externalBuyerId;
           this.incentiveCodes = incentiveCodes;
           this.applyIndication = applyIndication;
           this.buckets = buckets;
           this.cartTotalAmt = cartTotalAmt;
           this.requestDetails = requestDetails;
    }


    /**
     * Gets the externalBuyerId value for this GetIncentiveEvaluationRequestDetailsType.
     * 
     * @return externalBuyerId
     */
    public java.lang.String getExternalBuyerId() {
        return externalBuyerId;
    }


    /**
     * Sets the externalBuyerId value for this GetIncentiveEvaluationRequestDetailsType.
     * 
     * @param externalBuyerId
     */
    public void setExternalBuyerId(java.lang.String externalBuyerId) {
        this.externalBuyerId = externalBuyerId;
    }


    /**
     * Gets the incentiveCodes value for this GetIncentiveEvaluationRequestDetailsType.
     * 
     * @return incentiveCodes
     */
    public java.lang.String[] getIncentiveCodes() {
        return incentiveCodes;
    }


    /**
     * Sets the incentiveCodes value for this GetIncentiveEvaluationRequestDetailsType.
     * 
     * @param incentiveCodes
     */
    public void setIncentiveCodes(java.lang.String[] incentiveCodes) {
        this.incentiveCodes = incentiveCodes;
    }

    public java.lang.String getIncentiveCodes(int i) {
        return this.incentiveCodes[i];
    }

    public void setIncentiveCodes(int i, java.lang.String _value) {
        this.incentiveCodes[i] = _value;
    }


    /**
     * Gets the applyIndication value for this GetIncentiveEvaluationRequestDetailsType.
     * 
     * @return applyIndication
     */
    public eBLBaseComponents.apis.ebay.IncentiveApplyIndicationType[] getApplyIndication() {
        return applyIndication;
    }


    /**
     * Sets the applyIndication value for this GetIncentiveEvaluationRequestDetailsType.
     * 
     * @param applyIndication
     */
    public void setApplyIndication(eBLBaseComponents.apis.ebay.IncentiveApplyIndicationType[] applyIndication) {
        this.applyIndication = applyIndication;
    }

    public eBLBaseComponents.apis.ebay.IncentiveApplyIndicationType getApplyIndication(int i) {
        return this.applyIndication[i];
    }

    public void setApplyIndication(int i, eBLBaseComponents.apis.ebay.IncentiveApplyIndicationType _value) {
        this.applyIndication[i] = _value;
    }


    /**
     * Gets the buckets value for this GetIncentiveEvaluationRequestDetailsType.
     * 
     * @return buckets
     */
    public eBLBaseComponents.apis.ebay.IncentiveBucketType[] getBuckets() {
        return buckets;
    }


    /**
     * Sets the buckets value for this GetIncentiveEvaluationRequestDetailsType.
     * 
     * @param buckets
     */
    public void setBuckets(eBLBaseComponents.apis.ebay.IncentiveBucketType[] buckets) {
        this.buckets = buckets;
    }

    public eBLBaseComponents.apis.ebay.IncentiveBucketType getBuckets(int i) {
        return this.buckets[i];
    }

    public void setBuckets(int i, eBLBaseComponents.apis.ebay.IncentiveBucketType _value) {
        this.buckets[i] = _value;
    }


    /**
     * Gets the cartTotalAmt value for this GetIncentiveEvaluationRequestDetailsType.
     * 
     * @return cartTotalAmt
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getCartTotalAmt() {
        return cartTotalAmt;
    }


    /**
     * Sets the cartTotalAmt value for this GetIncentiveEvaluationRequestDetailsType.
     * 
     * @param cartTotalAmt
     */
    public void setCartTotalAmt(CoreComponentTypes.apis.ebay.BasicAmountType cartTotalAmt) {
        this.cartTotalAmt = cartTotalAmt;
    }


    /**
     * Gets the requestDetails value for this GetIncentiveEvaluationRequestDetailsType.
     * 
     * @return requestDetails
     */
    public eBLBaseComponents.apis.ebay.IncentiveRequestDetailsType getRequestDetails() {
        return requestDetails;
    }


    /**
     * Sets the requestDetails value for this GetIncentiveEvaluationRequestDetailsType.
     * 
     * @param requestDetails
     */
    public void setRequestDetails(eBLBaseComponents.apis.ebay.IncentiveRequestDetailsType requestDetails) {
        this.requestDetails = requestDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetIncentiveEvaluationRequestDetailsType)) return false;
        GetIncentiveEvaluationRequestDetailsType other = (GetIncentiveEvaluationRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalBuyerId==null && other.getExternalBuyerId()==null) || 
             (this.externalBuyerId!=null &&
              this.externalBuyerId.equals(other.getExternalBuyerId()))) &&
            ((this.incentiveCodes==null && other.getIncentiveCodes()==null) || 
             (this.incentiveCodes!=null &&
              java.util.Arrays.equals(this.incentiveCodes, other.getIncentiveCodes()))) &&
            ((this.applyIndication==null && other.getApplyIndication()==null) || 
             (this.applyIndication!=null &&
              java.util.Arrays.equals(this.applyIndication, other.getApplyIndication()))) &&
            ((this.buckets==null && other.getBuckets()==null) || 
             (this.buckets!=null &&
              java.util.Arrays.equals(this.buckets, other.getBuckets()))) &&
            ((this.cartTotalAmt==null && other.getCartTotalAmt()==null) || 
             (this.cartTotalAmt!=null &&
              this.cartTotalAmt.equals(other.getCartTotalAmt()))) &&
            ((this.requestDetails==null && other.getRequestDetails()==null) || 
             (this.requestDetails!=null &&
              this.requestDetails.equals(other.getRequestDetails())));
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
        if (getExternalBuyerId() != null) {
            _hashCode += getExternalBuyerId().hashCode();
        }
        if (getIncentiveCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncentiveCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncentiveCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplyIndication() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyIndication());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyIndication(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuckets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuckets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuckets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCartTotalAmt() != null) {
            _hashCode += getCartTotalAmt().hashCode();
        }
        if (getRequestDetails() != null) {
            _hashCode += getRequestDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetIncentiveEvaluationRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetIncentiveEvaluationRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalBuyerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalBuyerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incentiveCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyIndication");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ApplyIndication"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveApplyIndicationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buckets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Buckets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveBucketType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartTotalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CartTotalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RequestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveRequestDetailsType"));
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
