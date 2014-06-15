/**
 * TransactionStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class TransactionStatusType  implements java.io.Serializable {
    /* Indicates the success or failure of an eBay Online Payment
     * for 
     * 						the transaction. If the payment failed, the value returned indicates
     * 
     * 						the reason for the failure. Possible values:
     *     							0 = No payment failure.
     *     							3 = Buyer's eCheck bounced.
     *     							4 = Buyer's credit card failed.
     *     							5 = Buyer failed payment as reported by seller.
     *     							7 = Payment from buyer to seller is in PayPal process,
     * but has not yet been completed. */
    private java.lang.Integer eBayPaymentStatus;

    /* Indicates the current state of the checkout process for the
     * transaction. Possible values:
     *     						0 = Checkout complete.
     *     						1 = Checkout incomplete. No details specified.
     *     						2 = Buyer requests total.
     *     						3 = Seller responded to buyer's request. */
    private java.lang.Integer incompleteState;

    /* Indicates last date and time checkout status or incomplete
     * state was updated 
     *                        			(in GMT). */
    private java.util.Calendar lastTimeModified;

    /* Payment method used by the buyer. (See BuyerPaymentCodeList/Type). */
    private eBLBaseComponents.apis.ebay.BuyerPaymentMethodCodeType paymentMethodUsed;

    /* Indicates whether the transaction process complete or incomplete.
     * 
     *                        			Possible values:
     *     							1 = Incomplete
     *     							2 = Complete */
    private java.lang.Integer statusIs;

    public TransactionStatusType() {
    }

    public TransactionStatusType(
           java.lang.Integer eBayPaymentStatus,
           java.lang.Integer incompleteState,
           java.util.Calendar lastTimeModified,
           eBLBaseComponents.apis.ebay.BuyerPaymentMethodCodeType paymentMethodUsed,
           java.lang.Integer statusIs) {
           this.eBayPaymentStatus = eBayPaymentStatus;
           this.incompleteState = incompleteState;
           this.lastTimeModified = lastTimeModified;
           this.paymentMethodUsed = paymentMethodUsed;
           this.statusIs = statusIs;
    }


    /**
     * Gets the eBayPaymentStatus value for this TransactionStatusType.
     * 
     * @return eBayPaymentStatus   * Indicates the success or failure of an eBay Online Payment
     * for 
     * 						the transaction. If the payment failed, the value returned indicates
     * 
     * 						the reason for the failure. Possible values:
     *     							0 = No payment failure.
     *     							3 = Buyer's eCheck bounced.
     *     							4 = Buyer's credit card failed.
     *     							5 = Buyer failed payment as reported by seller.
     *     							7 = Payment from buyer to seller is in PayPal process,
     * but has not yet been completed.
     */
    public java.lang.Integer getEBayPaymentStatus() {
        return eBayPaymentStatus;
    }


    /**
     * Sets the eBayPaymentStatus value for this TransactionStatusType.
     * 
     * @param eBayPaymentStatus   * Indicates the success or failure of an eBay Online Payment
     * for 
     * 						the transaction. If the payment failed, the value returned indicates
     * 
     * 						the reason for the failure. Possible values:
     *     							0 = No payment failure.
     *     							3 = Buyer's eCheck bounced.
     *     							4 = Buyer's credit card failed.
     *     							5 = Buyer failed payment as reported by seller.
     *     							7 = Payment from buyer to seller is in PayPal process,
     * but has not yet been completed.
     */
    public void setEBayPaymentStatus(java.lang.Integer eBayPaymentStatus) {
        this.eBayPaymentStatus = eBayPaymentStatus;
    }


    /**
     * Gets the incompleteState value for this TransactionStatusType.
     * 
     * @return incompleteState   * Indicates the current state of the checkout process for the
     * transaction. Possible values:
     *     						0 = Checkout complete.
     *     						1 = Checkout incomplete. No details specified.
     *     						2 = Buyer requests total.
     *     						3 = Seller responded to buyer's request.
     */
    public java.lang.Integer getIncompleteState() {
        return incompleteState;
    }


    /**
     * Sets the incompleteState value for this TransactionStatusType.
     * 
     * @param incompleteState   * Indicates the current state of the checkout process for the
     * transaction. Possible values:
     *     						0 = Checkout complete.
     *     						1 = Checkout incomplete. No details specified.
     *     						2 = Buyer requests total.
     *     						3 = Seller responded to buyer's request.
     */
    public void setIncompleteState(java.lang.Integer incompleteState) {
        this.incompleteState = incompleteState;
    }


    /**
     * Gets the lastTimeModified value for this TransactionStatusType.
     * 
     * @return lastTimeModified   * Indicates last date and time checkout status or incomplete
     * state was updated 
     *                        			(in GMT).
     */
    public java.util.Calendar getLastTimeModified() {
        return lastTimeModified;
    }


    /**
     * Sets the lastTimeModified value for this TransactionStatusType.
     * 
     * @param lastTimeModified   * Indicates last date and time checkout status or incomplete
     * state was updated 
     *                        			(in GMT).
     */
    public void setLastTimeModified(java.util.Calendar lastTimeModified) {
        this.lastTimeModified = lastTimeModified;
    }


    /**
     * Gets the paymentMethodUsed value for this TransactionStatusType.
     * 
     * @return paymentMethodUsed   * Payment method used by the buyer. (See BuyerPaymentCodeList/Type).
     */
    public eBLBaseComponents.apis.ebay.BuyerPaymentMethodCodeType getPaymentMethodUsed() {
        return paymentMethodUsed;
    }


    /**
     * Sets the paymentMethodUsed value for this TransactionStatusType.
     * 
     * @param paymentMethodUsed   * Payment method used by the buyer. (See BuyerPaymentCodeList/Type).
     */
    public void setPaymentMethodUsed(eBLBaseComponents.apis.ebay.BuyerPaymentMethodCodeType paymentMethodUsed) {
        this.paymentMethodUsed = paymentMethodUsed;
    }


    /**
     * Gets the statusIs value for this TransactionStatusType.
     * 
     * @return statusIs   * Indicates whether the transaction process complete or incomplete.
     * 
     *                        			Possible values:
     *     							1 = Incomplete
     *     							2 = Complete
     */
    public java.lang.Integer getStatusIs() {
        return statusIs;
    }


    /**
     * Sets the statusIs value for this TransactionStatusType.
     * 
     * @param statusIs   * Indicates whether the transaction process complete or incomplete.
     * 
     *                        			Possible values:
     *     							1 = Incomplete
     *     							2 = Complete
     */
    public void setStatusIs(java.lang.Integer statusIs) {
        this.statusIs = statusIs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionStatusType)) return false;
        TransactionStatusType other = (TransactionStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eBayPaymentStatus==null && other.getEBayPaymentStatus()==null) || 
             (this.eBayPaymentStatus!=null &&
              this.eBayPaymentStatus.equals(other.getEBayPaymentStatus()))) &&
            ((this.incompleteState==null && other.getIncompleteState()==null) || 
             (this.incompleteState!=null &&
              this.incompleteState.equals(other.getIncompleteState()))) &&
            ((this.lastTimeModified==null && other.getLastTimeModified()==null) || 
             (this.lastTimeModified!=null &&
              this.lastTimeModified.equals(other.getLastTimeModified()))) &&
            ((this.paymentMethodUsed==null && other.getPaymentMethodUsed()==null) || 
             (this.paymentMethodUsed!=null &&
              this.paymentMethodUsed.equals(other.getPaymentMethodUsed()))) &&
            ((this.statusIs==null && other.getStatusIs()==null) || 
             (this.statusIs!=null &&
              this.statusIs.equals(other.getStatusIs())));
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
        if (getEBayPaymentStatus() != null) {
            _hashCode += getEBayPaymentStatus().hashCode();
        }
        if (getIncompleteState() != null) {
            _hashCode += getIncompleteState().hashCode();
        }
        if (getLastTimeModified() != null) {
            _hashCode += getLastTimeModified().hashCode();
        }
        if (getPaymentMethodUsed() != null) {
            _hashCode += getPaymentMethodUsed().hashCode();
        }
        if (getStatusIs() != null) {
            _hashCode += getStatusIs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionStatusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionStatusType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayPaymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "eBayPaymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incompleteState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncompleteState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTimeModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LastTimeModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentMethodUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerPaymentMethodCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusIs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StatusIs"));
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
