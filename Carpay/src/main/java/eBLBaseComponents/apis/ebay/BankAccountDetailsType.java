/**
 * BankAccountDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * BankAccountDetailsType
 */
public class BankAccountDetailsType  implements java.io.Serializable {
    /* Name of bank
     * 			
     * 						
     * 			Character length and limitations: 192 alphanumeric characters */
    private java.lang.String name;

    /* Type of bank account: Checking or Savings */
    private eBLBaseComponents.apis.ebay.BankAccountTypeType type;

    /* Merchantâs bank routing number
     * 
     * 						
     * Character length and limitations: 23 alphanumeric characters */
    private java.lang.String routingNumber;

    /* Merchantâs bank account number
     * 
     * 						
     * Character length and limitations: 256 alphanumeric characters */
    private java.lang.String accountNumber;

    public BankAccountDetailsType() {
    }

    public BankAccountDetailsType(
           java.lang.String name,
           eBLBaseComponents.apis.ebay.BankAccountTypeType type,
           java.lang.String routingNumber,
           java.lang.String accountNumber) {
           this.name = name;
           this.type = type;
           this.routingNumber = routingNumber;
           this.accountNumber = accountNumber;
    }


    /**
     * Gets the name value for this BankAccountDetailsType.
     * 
     * @return name   * Name of bank
     * 			
     * 						
     * 			Character length and limitations: 192 alphanumeric characters
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BankAccountDetailsType.
     * 
     * @param name   * Name of bank
     * 			
     * 						
     * 			Character length and limitations: 192 alphanumeric characters
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this BankAccountDetailsType.
     * 
     * @return type   * Type of bank account: Checking or Savings
     */
    public eBLBaseComponents.apis.ebay.BankAccountTypeType getType() {
        return type;
    }


    /**
     * Sets the type value for this BankAccountDetailsType.
     * 
     * @param type   * Type of bank account: Checking or Savings
     */
    public void setType(eBLBaseComponents.apis.ebay.BankAccountTypeType type) {
        this.type = type;
    }


    /**
     * Gets the routingNumber value for this BankAccountDetailsType.
     * 
     * @return routingNumber   * Merchantâs bank routing number
     * 
     * 						
     * Character length and limitations: 23 alphanumeric characters
     */
    public java.lang.String getRoutingNumber() {
        return routingNumber;
    }


    /**
     * Sets the routingNumber value for this BankAccountDetailsType.
     * 
     * @param routingNumber   * Merchantâs bank routing number
     * 
     * 						
     * Character length and limitations: 23 alphanumeric characters
     */
    public void setRoutingNumber(java.lang.String routingNumber) {
        this.routingNumber = routingNumber;
    }


    /**
     * Gets the accountNumber value for this BankAccountDetailsType.
     * 
     * @return accountNumber   * Merchantâs bank account number
     * 
     * 						
     * Character length and limitations: 256 alphanumeric characters
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this BankAccountDetailsType.
     * 
     * @param accountNumber   * Merchantâs bank account number
     * 
     * 						
     * Character length and limitations: 256 alphanumeric characters
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankAccountDetailsType)) return false;
        BankAccountDetailsType other = (BankAccountDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.routingNumber==null && other.getRoutingNumber()==null) || 
             (this.routingNumber!=null &&
              this.routingNumber.equals(other.getRoutingNumber()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getRoutingNumber() != null) {
            _hashCode += getRoutingNumber().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankAccountDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BankAccountDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BankAccountTypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RoutingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
