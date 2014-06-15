/**
 * RefreshTokenStatusDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class RefreshTokenStatusDetailsType  implements java.io.Serializable {
    /* Required field that reports status of opt-in or login bypass
     * attempt.
     * 									 0 = Success, successful opt-in or RefreshToken corresponding
     * to AccessToken specified
     * 									     in SetExpressCheckout is valid (user is still opted
     * in).
     * 									 1 = New RefreshToken was generated (user is still opted
     * in).
     * 									 2 = Invalid ID, RefreshToken corresponding to AccessToken
     * specified in SetExpressCheckout
     * 									     is invalid (user is opted out).
     * 									-2 = Internal Error, system error or outage during opt-in
     * or login bypass.  Can retry
     * 									     opt-in or login bypass next time.  Flow will force full
     * authentication and allow
     * 									     buyer to complete transaction.
     * 									-1 = None, the field does not represent any valid value of
     * the status. */
    private java.math.BigInteger refreshTokenStatus;

    /* Identifier returned on external-remember-me-opt-in to allow
     * the merchant to request
     * 								bypass of PayPal login */
    private java.lang.String refreshToken;

    /* The immutable_id is the user's unique value per merchant that
     * should never ever change for that account. 
     * 								This would be the key used to uniquely identify the user */
    private java.lang.String immutableID;

    public RefreshTokenStatusDetailsType() {
    }

    public RefreshTokenStatusDetailsType(
           java.math.BigInteger refreshTokenStatus,
           java.lang.String refreshToken,
           java.lang.String immutableID) {
           this.refreshTokenStatus = refreshTokenStatus;
           this.refreshToken = refreshToken;
           this.immutableID = immutableID;
    }


    /**
     * Gets the refreshTokenStatus value for this RefreshTokenStatusDetailsType.
     * 
     * @return refreshTokenStatus   * Required field that reports status of opt-in or login bypass
     * attempt.
     * 									 0 = Success, successful opt-in or RefreshToken corresponding
     * to AccessToken specified
     * 									     in SetExpressCheckout is valid (user is still opted
     * in).
     * 									 1 = New RefreshToken was generated (user is still opted
     * in).
     * 									 2 = Invalid ID, RefreshToken corresponding to AccessToken
     * specified in SetExpressCheckout
     * 									     is invalid (user is opted out).
     * 									-2 = Internal Error, system error or outage during opt-in
     * or login bypass.  Can retry
     * 									     opt-in or login bypass next time.  Flow will force full
     * authentication and allow
     * 									     buyer to complete transaction.
     * 									-1 = None, the field does not represent any valid value of
     * the status.
     */
    public java.math.BigInteger getRefreshTokenStatus() {
        return refreshTokenStatus;
    }


    /**
     * Sets the refreshTokenStatus value for this RefreshTokenStatusDetailsType.
     * 
     * @param refreshTokenStatus   * Required field that reports status of opt-in or login bypass
     * attempt.
     * 									 0 = Success, successful opt-in or RefreshToken corresponding
     * to AccessToken specified
     * 									     in SetExpressCheckout is valid (user is still opted
     * in).
     * 									 1 = New RefreshToken was generated (user is still opted
     * in).
     * 									 2 = Invalid ID, RefreshToken corresponding to AccessToken
     * specified in SetExpressCheckout
     * 									     is invalid (user is opted out).
     * 									-2 = Internal Error, system error or outage during opt-in
     * or login bypass.  Can retry
     * 									     opt-in or login bypass next time.  Flow will force full
     * authentication and allow
     * 									     buyer to complete transaction.
     * 									-1 = None, the field does not represent any valid value of
     * the status.
     */
    public void setRefreshTokenStatus(java.math.BigInteger refreshTokenStatus) {
        this.refreshTokenStatus = refreshTokenStatus;
    }


    /**
     * Gets the refreshToken value for this RefreshTokenStatusDetailsType.
     * 
     * @return refreshToken   * Identifier returned on external-remember-me-opt-in to allow
     * the merchant to request
     * 								bypass of PayPal login
     */
    public java.lang.String getRefreshToken() {
        return refreshToken;
    }


    /**
     * Sets the refreshToken value for this RefreshTokenStatusDetailsType.
     * 
     * @param refreshToken   * Identifier returned on external-remember-me-opt-in to allow
     * the merchant to request
     * 								bypass of PayPal login
     */
    public void setRefreshToken(java.lang.String refreshToken) {
        this.refreshToken = refreshToken;
    }


    /**
     * Gets the immutableID value for this RefreshTokenStatusDetailsType.
     * 
     * @return immutableID   * The immutable_id is the user's unique value per merchant that
     * should never ever change for that account. 
     * 								This would be the key used to uniquely identify the user
     */
    public java.lang.String getImmutableID() {
        return immutableID;
    }


    /**
     * Sets the immutableID value for this RefreshTokenStatusDetailsType.
     * 
     * @param immutableID   * The immutable_id is the user's unique value per merchant that
     * should never ever change for that account. 
     * 								This would be the key used to uniquely identify the user
     */
    public void setImmutableID(java.lang.String immutableID) {
        this.immutableID = immutableID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefreshTokenStatusDetailsType)) return false;
        RefreshTokenStatusDetailsType other = (RefreshTokenStatusDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refreshTokenStatus==null && other.getRefreshTokenStatus()==null) || 
             (this.refreshTokenStatus!=null &&
              this.refreshTokenStatus.equals(other.getRefreshTokenStatus()))) &&
            ((this.refreshToken==null && other.getRefreshToken()==null) || 
             (this.refreshToken!=null &&
              this.refreshToken.equals(other.getRefreshToken()))) &&
            ((this.immutableID==null && other.getImmutableID()==null) || 
             (this.immutableID!=null &&
              this.immutableID.equals(other.getImmutableID())));
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
        if (getRefreshTokenStatus() != null) {
            _hashCode += getRefreshTokenStatus().hashCode();
        }
        if (getRefreshToken() != null) {
            _hashCode += getRefreshToken().hashCode();
        }
        if (getImmutableID() != null) {
            _hashCode += getImmutableID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RefreshTokenStatusDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefreshTokenStatusDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshTokenStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefreshTokenStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefreshToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("immutableID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ImmutableID"));
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
