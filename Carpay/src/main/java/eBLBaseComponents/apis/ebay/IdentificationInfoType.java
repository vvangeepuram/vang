/**
 * IdentificationInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class IdentificationInfoType  implements java.io.Serializable {
    /* Mobile specific buyer identification. */
    private eBLBaseComponents.apis.ebay.MobileIDInfoType mobileIDInfo;

    /* Contains login bypass information. */
    private eBLBaseComponents.apis.ebay.RememberMeIDInfoType rememberMeIDInfo;

    /* Identity Access Token. */
    private eBLBaseComponents.apis.ebay.IdentityTokenInfoType identityTokenInfo;

    public IdentificationInfoType() {
    }

    public IdentificationInfoType(
           eBLBaseComponents.apis.ebay.MobileIDInfoType mobileIDInfo,
           eBLBaseComponents.apis.ebay.RememberMeIDInfoType rememberMeIDInfo,
           eBLBaseComponents.apis.ebay.IdentityTokenInfoType identityTokenInfo) {
           this.mobileIDInfo = mobileIDInfo;
           this.rememberMeIDInfo = rememberMeIDInfo;
           this.identityTokenInfo = identityTokenInfo;
    }


    /**
     * Gets the mobileIDInfo value for this IdentificationInfoType.
     * 
     * @return mobileIDInfo   * Mobile specific buyer identification.
     */
    public eBLBaseComponents.apis.ebay.MobileIDInfoType getMobileIDInfo() {
        return mobileIDInfo;
    }


    /**
     * Sets the mobileIDInfo value for this IdentificationInfoType.
     * 
     * @param mobileIDInfo   * Mobile specific buyer identification.
     */
    public void setMobileIDInfo(eBLBaseComponents.apis.ebay.MobileIDInfoType mobileIDInfo) {
        this.mobileIDInfo = mobileIDInfo;
    }


    /**
     * Gets the rememberMeIDInfo value for this IdentificationInfoType.
     * 
     * @return rememberMeIDInfo   * Contains login bypass information.
     */
    public eBLBaseComponents.apis.ebay.RememberMeIDInfoType getRememberMeIDInfo() {
        return rememberMeIDInfo;
    }


    /**
     * Sets the rememberMeIDInfo value for this IdentificationInfoType.
     * 
     * @param rememberMeIDInfo   * Contains login bypass information.
     */
    public void setRememberMeIDInfo(eBLBaseComponents.apis.ebay.RememberMeIDInfoType rememberMeIDInfo) {
        this.rememberMeIDInfo = rememberMeIDInfo;
    }


    /**
     * Gets the identityTokenInfo value for this IdentificationInfoType.
     * 
     * @return identityTokenInfo   * Identity Access Token.
     */
    public eBLBaseComponents.apis.ebay.IdentityTokenInfoType getIdentityTokenInfo() {
        return identityTokenInfo;
    }


    /**
     * Sets the identityTokenInfo value for this IdentificationInfoType.
     * 
     * @param identityTokenInfo   * Identity Access Token.
     */
    public void setIdentityTokenInfo(eBLBaseComponents.apis.ebay.IdentityTokenInfoType identityTokenInfo) {
        this.identityTokenInfo = identityTokenInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificationInfoType)) return false;
        IdentificationInfoType other = (IdentificationInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mobileIDInfo==null && other.getMobileIDInfo()==null) || 
             (this.mobileIDInfo!=null &&
              this.mobileIDInfo.equals(other.getMobileIDInfo()))) &&
            ((this.rememberMeIDInfo==null && other.getRememberMeIDInfo()==null) || 
             (this.rememberMeIDInfo!=null &&
              this.rememberMeIDInfo.equals(other.getRememberMeIDInfo()))) &&
            ((this.identityTokenInfo==null && other.getIdentityTokenInfo()==null) || 
             (this.identityTokenInfo!=null &&
              this.identityTokenInfo.equals(other.getIdentityTokenInfo())));
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
        if (getMobileIDInfo() != null) {
            _hashCode += getMobileIDInfo().hashCode();
        }
        if (getRememberMeIDInfo() != null) {
            _hashCode += getRememberMeIDInfo().hashCode();
        }
        if (getIdentityTokenInfo() != null) {
            _hashCode += getIdentityTokenInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificationInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IdentificationInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileIDInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MobileIDInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MobileIDInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rememberMeIDInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RememberMeIDInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RememberMeIDInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityTokenInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IdentityTokenInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IdentityTokenInfoType"));
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
