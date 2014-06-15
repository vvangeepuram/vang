/**
 * ActivationDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ActivationDetailsType  implements java.io.Serializable {
    private CoreComponentTypes.apis.ebay.BasicAmountType initialAmount;

    private eBLBaseComponents.apis.ebay.FailedPaymentActionType failedInitialAmountAction;

    public ActivationDetailsType() {
    }

    public ActivationDetailsType(
           CoreComponentTypes.apis.ebay.BasicAmountType initialAmount,
           eBLBaseComponents.apis.ebay.FailedPaymentActionType failedInitialAmountAction) {
           this.initialAmount = initialAmount;
           this.failedInitialAmountAction = failedInitialAmountAction;
    }


    /**
     * Gets the initialAmount value for this ActivationDetailsType.
     * 
     * @return initialAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getInitialAmount() {
        return initialAmount;
    }


    /**
     * Sets the initialAmount value for this ActivationDetailsType.
     * 
     * @param initialAmount
     */
    public void setInitialAmount(CoreComponentTypes.apis.ebay.BasicAmountType initialAmount) {
        this.initialAmount = initialAmount;
    }


    /**
     * Gets the failedInitialAmountAction value for this ActivationDetailsType.
     * 
     * @return failedInitialAmountAction
     */
    public eBLBaseComponents.apis.ebay.FailedPaymentActionType getFailedInitialAmountAction() {
        return failedInitialAmountAction;
    }


    /**
     * Sets the failedInitialAmountAction value for this ActivationDetailsType.
     * 
     * @param failedInitialAmountAction
     */
    public void setFailedInitialAmountAction(eBLBaseComponents.apis.ebay.FailedPaymentActionType failedInitialAmountAction) {
        this.failedInitialAmountAction = failedInitialAmountAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivationDetailsType)) return false;
        ActivationDetailsType other = (ActivationDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.initialAmount==null && other.getInitialAmount()==null) || 
             (this.initialAmount!=null &&
              this.initialAmount.equals(other.getInitialAmount()))) &&
            ((this.failedInitialAmountAction==null && other.getFailedInitialAmountAction()==null) || 
             (this.failedInitialAmountAction!=null &&
              this.failedInitialAmountAction.equals(other.getFailedInitialAmountAction())));
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
        if (getInitialAmount() != null) {
            _hashCode += getInitialAmount().hashCode();
        }
        if (getFailedInitialAmountAction() != null) {
            _hashCode += getFailedInitialAmountAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivationDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ActivationDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InitialAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedInitialAmountAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FailedInitialAmountAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FailedPaymentActionType"));
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
