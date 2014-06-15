/**
 * GetBalanceResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class GetBalanceResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    private CoreComponentTypes.apis.ebay.BasicAmountType balance;

    private java.util.Calendar balanceTimeStamp;

    private CoreComponentTypes.apis.ebay.BasicAmountType[] balanceHoldings;

    public GetBalanceResponseType() {
    }

    public GetBalanceResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           CoreComponentTypes.apis.ebay.BasicAmountType balance,
           java.util.Calendar balanceTimeStamp,
           CoreComponentTypes.apis.ebay.BasicAmountType[] balanceHoldings) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.balance = balance;
        this.balanceTimeStamp = balanceTimeStamp;
        this.balanceHoldings = balanceHoldings;
    }


    /**
     * Gets the balance value for this GetBalanceResponseType.
     * 
     * @return balance
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this GetBalanceResponseType.
     * 
     * @param balance
     */
    public void setBalance(CoreComponentTypes.apis.ebay.BasicAmountType balance) {
        this.balance = balance;
    }


    /**
     * Gets the balanceTimeStamp value for this GetBalanceResponseType.
     * 
     * @return balanceTimeStamp
     */
    public java.util.Calendar getBalanceTimeStamp() {
        return balanceTimeStamp;
    }


    /**
     * Sets the balanceTimeStamp value for this GetBalanceResponseType.
     * 
     * @param balanceTimeStamp
     */
    public void setBalanceTimeStamp(java.util.Calendar balanceTimeStamp) {
        this.balanceTimeStamp = balanceTimeStamp;
    }


    /**
     * Gets the balanceHoldings value for this GetBalanceResponseType.
     * 
     * @return balanceHoldings
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType[] getBalanceHoldings() {
        return balanceHoldings;
    }


    /**
     * Sets the balanceHoldings value for this GetBalanceResponseType.
     * 
     * @param balanceHoldings
     */
    public void setBalanceHoldings(CoreComponentTypes.apis.ebay.BasicAmountType[] balanceHoldings) {
        this.balanceHoldings = balanceHoldings;
    }

    public CoreComponentTypes.apis.ebay.BasicAmountType getBalanceHoldings(int i) {
        return this.balanceHoldings[i];
    }

    public void setBalanceHoldings(int i, CoreComponentTypes.apis.ebay.BasicAmountType _value) {
        this.balanceHoldings[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBalanceResponseType)) return false;
        GetBalanceResponseType other = (GetBalanceResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.balanceTimeStamp==null && other.getBalanceTimeStamp()==null) || 
             (this.balanceTimeStamp!=null &&
              this.balanceTimeStamp.equals(other.getBalanceTimeStamp()))) &&
            ((this.balanceHoldings==null && other.getBalanceHoldings()==null) || 
             (this.balanceHoldings!=null &&
              java.util.Arrays.equals(this.balanceHoldings, other.getBalanceHoldings())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getBalanceTimeStamp() != null) {
            _hashCode += getBalanceTimeStamp().hashCode();
        }
        if (getBalanceHoldings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalanceHoldings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalanceHoldings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBalanceResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBalanceResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BalanceTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceHoldings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BalanceHoldings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
