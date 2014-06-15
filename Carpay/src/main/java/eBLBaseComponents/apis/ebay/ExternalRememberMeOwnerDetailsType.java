/**
 * ExternalRememberMeOwnerDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ExternalRememberMeOwnerDetailsType  implements java.io.Serializable {
    /* A discriminant that tells SetEC what kind of data the ExternalRememberMeOwnerID
     * parameter contains.
     * 								Currently, the owner must be either the API actor or omitted/none.
     * In the future, we may allow the
     * 								owner to be a 3rd party merchant account.
     * 								Possible values are:
     * 								None, ignore the ExternalRememberMeOwnerID.  An empty value
     * for this field also signifies None.
     * 								Email, the owner ID is an email address
     * 								SecureMerchantAccountID, the owner id is a string representing
     * the secure merchant account ID */
    private java.lang.String externalRememberMeOwnerIDType;

    /* When opting in to bypass login via remember me, this parameter
     * specifies the merchant account
     * 								associated with the remembered login.  Currentl, the owner
     * must be either the API actor or omitted/none.
     * 								In the future, we may allow the owner to be a 3rd party merchant
     * account.
     * 								If the Owner ID Type field is not present or "None", this
     * parameter is ignored. */
    private java.lang.String externalRememberMeOwnerID;

    public ExternalRememberMeOwnerDetailsType() {
    }

    public ExternalRememberMeOwnerDetailsType(
           java.lang.String externalRememberMeOwnerIDType,
           java.lang.String externalRememberMeOwnerID) {
           this.externalRememberMeOwnerIDType = externalRememberMeOwnerIDType;
           this.externalRememberMeOwnerID = externalRememberMeOwnerID;
    }


    /**
     * Gets the externalRememberMeOwnerIDType value for this ExternalRememberMeOwnerDetailsType.
     * 
     * @return externalRememberMeOwnerIDType   * A discriminant that tells SetEC what kind of data the ExternalRememberMeOwnerID
     * parameter contains.
     * 								Currently, the owner must be either the API actor or omitted/none.
     * In the future, we may allow the
     * 								owner to be a 3rd party merchant account.
     * 								Possible values are:
     * 								None, ignore the ExternalRememberMeOwnerID.  An empty value
     * for this field also signifies None.
     * 								Email, the owner ID is an email address
     * 								SecureMerchantAccountID, the owner id is a string representing
     * the secure merchant account ID
     */
    public java.lang.String getExternalRememberMeOwnerIDType() {
        return externalRememberMeOwnerIDType;
    }


    /**
     * Sets the externalRememberMeOwnerIDType value for this ExternalRememberMeOwnerDetailsType.
     * 
     * @param externalRememberMeOwnerIDType   * A discriminant that tells SetEC what kind of data the ExternalRememberMeOwnerID
     * parameter contains.
     * 								Currently, the owner must be either the API actor or omitted/none.
     * In the future, we may allow the
     * 								owner to be a 3rd party merchant account.
     * 								Possible values are:
     * 								None, ignore the ExternalRememberMeOwnerID.  An empty value
     * for this field also signifies None.
     * 								Email, the owner ID is an email address
     * 								SecureMerchantAccountID, the owner id is a string representing
     * the secure merchant account ID
     */
    public void setExternalRememberMeOwnerIDType(java.lang.String externalRememberMeOwnerIDType) {
        this.externalRememberMeOwnerIDType = externalRememberMeOwnerIDType;
    }


    /**
     * Gets the externalRememberMeOwnerID value for this ExternalRememberMeOwnerDetailsType.
     * 
     * @return externalRememberMeOwnerID   * When opting in to bypass login via remember me, this parameter
     * specifies the merchant account
     * 								associated with the remembered login.  Currentl, the owner
     * must be either the API actor or omitted/none.
     * 								In the future, we may allow the owner to be a 3rd party merchant
     * account.
     * 								If the Owner ID Type field is not present or "None", this
     * parameter is ignored.
     */
    public java.lang.String getExternalRememberMeOwnerID() {
        return externalRememberMeOwnerID;
    }


    /**
     * Sets the externalRememberMeOwnerID value for this ExternalRememberMeOwnerDetailsType.
     * 
     * @param externalRememberMeOwnerID   * When opting in to bypass login via remember me, this parameter
     * specifies the merchant account
     * 								associated with the remembered login.  Currentl, the owner
     * must be either the API actor or omitted/none.
     * 								In the future, we may allow the owner to be a 3rd party merchant
     * account.
     * 								If the Owner ID Type field is not present or "None", this
     * parameter is ignored.
     */
    public void setExternalRememberMeOwnerID(java.lang.String externalRememberMeOwnerID) {
        this.externalRememberMeOwnerID = externalRememberMeOwnerID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalRememberMeOwnerDetailsType)) return false;
        ExternalRememberMeOwnerDetailsType other = (ExternalRememberMeOwnerDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalRememberMeOwnerIDType==null && other.getExternalRememberMeOwnerIDType()==null) || 
             (this.externalRememberMeOwnerIDType!=null &&
              this.externalRememberMeOwnerIDType.equals(other.getExternalRememberMeOwnerIDType()))) &&
            ((this.externalRememberMeOwnerID==null && other.getExternalRememberMeOwnerID()==null) || 
             (this.externalRememberMeOwnerID!=null &&
              this.externalRememberMeOwnerID.equals(other.getExternalRememberMeOwnerID())));
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
        if (getExternalRememberMeOwnerIDType() != null) {
            _hashCode += getExternalRememberMeOwnerIDType().hashCode();
        }
        if (getExternalRememberMeOwnerID() != null) {
            _hashCode += getExternalRememberMeOwnerID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalRememberMeOwnerDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeOwnerDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRememberMeOwnerIDType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeOwnerIDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRememberMeOwnerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeOwnerID"));
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
