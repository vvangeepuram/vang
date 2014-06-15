/**
 * PaymentTransactionSearchResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * PaymentTransactionSearchResultType 
 * 				Results from a PaymentTransaction search
 */
public class PaymentTransactionSearchResultType  implements java.io.Serializable {
    /* The date and time (in UTC/GMT format) the transaction occurred */
    private java.util.Calendar timestamp;

    /* The time zone of the transaction */
    private java.lang.String timezone;

    /* The type of the transaction */
    private java.lang.String type;

    /* The email address of the payer */
    private java.lang.String payer;

    /* Display name of the payer */
    private java.lang.String payerDisplayName;

    /* The transaction ID of the seller */
    private java.lang.String transactionID;

    /* The status of the transaction */
    private java.lang.String status;

    /* The total gross amount charged, including any profile shipping
     * cost and taxes */
    private CoreComponentTypes.apis.ebay.BasicAmountType grossAmount;

    /* The fee that PayPal charged for the transaction */
    private CoreComponentTypes.apis.ebay.BasicAmountType feeAmount;

    /* The net amount of the transaction */
    private CoreComponentTypes.apis.ebay.BasicAmountType netAmount;

    public PaymentTransactionSearchResultType() {
    }

    public PaymentTransactionSearchResultType(
           java.util.Calendar timestamp,
           java.lang.String timezone,
           java.lang.String type,
           java.lang.String payer,
           java.lang.String payerDisplayName,
           java.lang.String transactionID,
           java.lang.String status,
           CoreComponentTypes.apis.ebay.BasicAmountType grossAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType feeAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType netAmount) {
           this.timestamp = timestamp;
           this.timezone = timezone;
           this.type = type;
           this.payer = payer;
           this.payerDisplayName = payerDisplayName;
           this.transactionID = transactionID;
           this.status = status;
           this.grossAmount = grossAmount;
           this.feeAmount = feeAmount;
           this.netAmount = netAmount;
    }


    /**
     * Gets the timestamp value for this PaymentTransactionSearchResultType.
     * 
     * @return timestamp   * The date and time (in UTC/GMT format) the transaction occurred
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this PaymentTransactionSearchResultType.
     * 
     * @param timestamp   * The date and time (in UTC/GMT format) the transaction occurred
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the timezone value for this PaymentTransactionSearchResultType.
     * 
     * @return timezone   * The time zone of the transaction
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this PaymentTransactionSearchResultType.
     * 
     * @param timezone   * The time zone of the transaction
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the type value for this PaymentTransactionSearchResultType.
     * 
     * @return type   * The type of the transaction
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this PaymentTransactionSearchResultType.
     * 
     * @param type   * The type of the transaction
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the payer value for this PaymentTransactionSearchResultType.
     * 
     * @return payer   * The email address of the payer
     */
    public java.lang.String getPayer() {
        return payer;
    }


    /**
     * Sets the payer value for this PaymentTransactionSearchResultType.
     * 
     * @param payer   * The email address of the payer
     */
    public void setPayer(java.lang.String payer) {
        this.payer = payer;
    }


    /**
     * Gets the payerDisplayName value for this PaymentTransactionSearchResultType.
     * 
     * @return payerDisplayName   * Display name of the payer
     */
    public java.lang.String getPayerDisplayName() {
        return payerDisplayName;
    }


    /**
     * Sets the payerDisplayName value for this PaymentTransactionSearchResultType.
     * 
     * @param payerDisplayName   * Display name of the payer
     */
    public void setPayerDisplayName(java.lang.String payerDisplayName) {
        this.payerDisplayName = payerDisplayName;
    }


    /**
     * Gets the transactionID value for this PaymentTransactionSearchResultType.
     * 
     * @return transactionID   * The transaction ID of the seller
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this PaymentTransactionSearchResultType.
     * 
     * @param transactionID   * The transaction ID of the seller
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the status value for this PaymentTransactionSearchResultType.
     * 
     * @return status   * The status of the transaction
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PaymentTransactionSearchResultType.
     * 
     * @param status   * The status of the transaction
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the grossAmount value for this PaymentTransactionSearchResultType.
     * 
     * @return grossAmount   * The total gross amount charged, including any profile shipping
     * cost and taxes
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getGrossAmount() {
        return grossAmount;
    }


    /**
     * Sets the grossAmount value for this PaymentTransactionSearchResultType.
     * 
     * @param grossAmount   * The total gross amount charged, including any profile shipping
     * cost and taxes
     */
    public void setGrossAmount(CoreComponentTypes.apis.ebay.BasicAmountType grossAmount) {
        this.grossAmount = grossAmount;
    }


    /**
     * Gets the feeAmount value for this PaymentTransactionSearchResultType.
     * 
     * @return feeAmount   * The fee that PayPal charged for the transaction
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this PaymentTransactionSearchResultType.
     * 
     * @param feeAmount   * The fee that PayPal charged for the transaction
     */
    public void setFeeAmount(CoreComponentTypes.apis.ebay.BasicAmountType feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the netAmount value for this PaymentTransactionSearchResultType.
     * 
     * @return netAmount   * The net amount of the transaction
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this PaymentTransactionSearchResultType.
     * 
     * @param netAmount   * The net amount of the transaction
     */
    public void setNetAmount(CoreComponentTypes.apis.ebay.BasicAmountType netAmount) {
        this.netAmount = netAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentTransactionSearchResultType)) return false;
        PaymentTransactionSearchResultType other = (PaymentTransactionSearchResultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.payer==null && other.getPayer()==null) || 
             (this.payer!=null &&
              this.payer.equals(other.getPayer()))) &&
            ((this.payerDisplayName==null && other.getPayerDisplayName()==null) || 
             (this.payerDisplayName!=null &&
              this.payerDisplayName.equals(other.getPayerDisplayName()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.grossAmount==null && other.getGrossAmount()==null) || 
             (this.grossAmount!=null &&
              this.grossAmount.equals(other.getGrossAmount()))) &&
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
            ((this.netAmount==null && other.getNetAmount()==null) || 
             (this.netAmount!=null &&
              this.netAmount.equals(other.getNetAmount())));
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
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPayer() != null) {
            _hashCode += getPayer().hashCode();
        }
        if (getPayerDisplayName() != null) {
            _hashCode += getPayerDisplayName().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getGrossAmount() != null) {
            _hashCode += getGrossAmount().hashCode();
        }
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
        }
        if (getNetAmount() != null) {
            _hashCode += getNetAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentTransactionSearchResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionSearchResultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Payer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GrossAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FeeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "NetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
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
