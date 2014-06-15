/**
 * RecurringPaymentsSummaryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class RecurringPaymentsSummaryType  implements java.io.Serializable {
    private java.util.Calendar nextBillingDate;

    private int numberCyclesCompleted;

    private int numberCyclesRemaining;

    private CoreComponentTypes.apis.ebay.BasicAmountType outstandingBalance;

    private int failedPaymentCount;

    private java.util.Calendar lastPaymentDate;

    private CoreComponentTypes.apis.ebay.BasicAmountType lastPaymentAmount;

    public RecurringPaymentsSummaryType() {
    }

    public RecurringPaymentsSummaryType(
           java.util.Calendar nextBillingDate,
           int numberCyclesCompleted,
           int numberCyclesRemaining,
           CoreComponentTypes.apis.ebay.BasicAmountType outstandingBalance,
           int failedPaymentCount,
           java.util.Calendar lastPaymentDate,
           CoreComponentTypes.apis.ebay.BasicAmountType lastPaymentAmount) {
           this.nextBillingDate = nextBillingDate;
           this.numberCyclesCompleted = numberCyclesCompleted;
           this.numberCyclesRemaining = numberCyclesRemaining;
           this.outstandingBalance = outstandingBalance;
           this.failedPaymentCount = failedPaymentCount;
           this.lastPaymentDate = lastPaymentDate;
           this.lastPaymentAmount = lastPaymentAmount;
    }


    /**
     * Gets the nextBillingDate value for this RecurringPaymentsSummaryType.
     * 
     * @return nextBillingDate
     */
    public java.util.Calendar getNextBillingDate() {
        return nextBillingDate;
    }


    /**
     * Sets the nextBillingDate value for this RecurringPaymentsSummaryType.
     * 
     * @param nextBillingDate
     */
    public void setNextBillingDate(java.util.Calendar nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }


    /**
     * Gets the numberCyclesCompleted value for this RecurringPaymentsSummaryType.
     * 
     * @return numberCyclesCompleted
     */
    public int getNumberCyclesCompleted() {
        return numberCyclesCompleted;
    }


    /**
     * Sets the numberCyclesCompleted value for this RecurringPaymentsSummaryType.
     * 
     * @param numberCyclesCompleted
     */
    public void setNumberCyclesCompleted(int numberCyclesCompleted) {
        this.numberCyclesCompleted = numberCyclesCompleted;
    }


    /**
     * Gets the numberCyclesRemaining value for this RecurringPaymentsSummaryType.
     * 
     * @return numberCyclesRemaining
     */
    public int getNumberCyclesRemaining() {
        return numberCyclesRemaining;
    }


    /**
     * Sets the numberCyclesRemaining value for this RecurringPaymentsSummaryType.
     * 
     * @param numberCyclesRemaining
     */
    public void setNumberCyclesRemaining(int numberCyclesRemaining) {
        this.numberCyclesRemaining = numberCyclesRemaining;
    }


    /**
     * Gets the outstandingBalance value for this RecurringPaymentsSummaryType.
     * 
     * @return outstandingBalance
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getOutstandingBalance() {
        return outstandingBalance;
    }


    /**
     * Sets the outstandingBalance value for this RecurringPaymentsSummaryType.
     * 
     * @param outstandingBalance
     */
    public void setOutstandingBalance(CoreComponentTypes.apis.ebay.BasicAmountType outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }


    /**
     * Gets the failedPaymentCount value for this RecurringPaymentsSummaryType.
     * 
     * @return failedPaymentCount
     */
    public int getFailedPaymentCount() {
        return failedPaymentCount;
    }


    /**
     * Sets the failedPaymentCount value for this RecurringPaymentsSummaryType.
     * 
     * @param failedPaymentCount
     */
    public void setFailedPaymentCount(int failedPaymentCount) {
        this.failedPaymentCount = failedPaymentCount;
    }


    /**
     * Gets the lastPaymentDate value for this RecurringPaymentsSummaryType.
     * 
     * @return lastPaymentDate
     */
    public java.util.Calendar getLastPaymentDate() {
        return lastPaymentDate;
    }


    /**
     * Sets the lastPaymentDate value for this RecurringPaymentsSummaryType.
     * 
     * @param lastPaymentDate
     */
    public void setLastPaymentDate(java.util.Calendar lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }


    /**
     * Gets the lastPaymentAmount value for this RecurringPaymentsSummaryType.
     * 
     * @return lastPaymentAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getLastPaymentAmount() {
        return lastPaymentAmount;
    }


    /**
     * Sets the lastPaymentAmount value for this RecurringPaymentsSummaryType.
     * 
     * @param lastPaymentAmount
     */
    public void setLastPaymentAmount(CoreComponentTypes.apis.ebay.BasicAmountType lastPaymentAmount) {
        this.lastPaymentAmount = lastPaymentAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecurringPaymentsSummaryType)) return false;
        RecurringPaymentsSummaryType other = (RecurringPaymentsSummaryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nextBillingDate==null && other.getNextBillingDate()==null) || 
             (this.nextBillingDate!=null &&
              this.nextBillingDate.equals(other.getNextBillingDate()))) &&
            this.numberCyclesCompleted == other.getNumberCyclesCompleted() &&
            this.numberCyclesRemaining == other.getNumberCyclesRemaining() &&
            ((this.outstandingBalance==null && other.getOutstandingBalance()==null) || 
             (this.outstandingBalance!=null &&
              this.outstandingBalance.equals(other.getOutstandingBalance()))) &&
            this.failedPaymentCount == other.getFailedPaymentCount() &&
            ((this.lastPaymentDate==null && other.getLastPaymentDate()==null) || 
             (this.lastPaymentDate!=null &&
              this.lastPaymentDate.equals(other.getLastPaymentDate()))) &&
            ((this.lastPaymentAmount==null && other.getLastPaymentAmount()==null) || 
             (this.lastPaymentAmount!=null &&
              this.lastPaymentAmount.equals(other.getLastPaymentAmount())));
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
        if (getNextBillingDate() != null) {
            _hashCode += getNextBillingDate().hashCode();
        }
        _hashCode += getNumberCyclesCompleted();
        _hashCode += getNumberCyclesRemaining();
        if (getOutstandingBalance() != null) {
            _hashCode += getOutstandingBalance().hashCode();
        }
        _hashCode += getFailedPaymentCount();
        if (getLastPaymentDate() != null) {
            _hashCode += getLastPaymentDate().hashCode();
        }
        if (getLastPaymentAmount() != null) {
            _hashCode += getLastPaymentAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecurringPaymentsSummaryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringPaymentsSummaryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBillingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "NextBillingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberCyclesCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "NumberCyclesCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberCyclesRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "NumberCyclesRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outstandingBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OutstandingBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedPaymentCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FailedPaymentCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPaymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LastPaymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPaymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LastPaymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
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
