/**
 * ThreeDSecureRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * The Common 3DS fields. Common for both GTD and DCC API's.
 */
public class ThreeDSecureRequestType  implements java.io.Serializable {
    private java.lang.String eci3Ds;

    private java.lang.String cavv;

    private java.lang.String xid;

    private java.lang.String mpiVendor3Ds;

    private java.lang.String authStatus3Ds;

    public ThreeDSecureRequestType() {
    }

    public ThreeDSecureRequestType(
           java.lang.String eci3Ds,
           java.lang.String cavv,
           java.lang.String xid,
           java.lang.String mpiVendor3Ds,
           java.lang.String authStatus3Ds) {
           this.eci3Ds = eci3Ds;
           this.cavv = cavv;
           this.xid = xid;
           this.mpiVendor3Ds = mpiVendor3Ds;
           this.authStatus3Ds = authStatus3Ds;
    }


    /**
     * Gets the eci3Ds value for this ThreeDSecureRequestType.
     * 
     * @return eci3Ds
     */
    public java.lang.String getEci3Ds() {
        return eci3Ds;
    }


    /**
     * Sets the eci3Ds value for this ThreeDSecureRequestType.
     * 
     * @param eci3Ds
     */
    public void setEci3Ds(java.lang.String eci3Ds) {
        this.eci3Ds = eci3Ds;
    }


    /**
     * Gets the cavv value for this ThreeDSecureRequestType.
     * 
     * @return cavv
     */
    public java.lang.String getCavv() {
        return cavv;
    }


    /**
     * Sets the cavv value for this ThreeDSecureRequestType.
     * 
     * @param cavv
     */
    public void setCavv(java.lang.String cavv) {
        this.cavv = cavv;
    }


    /**
     * Gets the xid value for this ThreeDSecureRequestType.
     * 
     * @return xid
     */
    public java.lang.String getXid() {
        return xid;
    }


    /**
     * Sets the xid value for this ThreeDSecureRequestType.
     * 
     * @param xid
     */
    public void setXid(java.lang.String xid) {
        this.xid = xid;
    }


    /**
     * Gets the mpiVendor3Ds value for this ThreeDSecureRequestType.
     * 
     * @return mpiVendor3Ds
     */
    public java.lang.String getMpiVendor3Ds() {
        return mpiVendor3Ds;
    }


    /**
     * Sets the mpiVendor3Ds value for this ThreeDSecureRequestType.
     * 
     * @param mpiVendor3Ds
     */
    public void setMpiVendor3Ds(java.lang.String mpiVendor3Ds) {
        this.mpiVendor3Ds = mpiVendor3Ds;
    }


    /**
     * Gets the authStatus3Ds value for this ThreeDSecureRequestType.
     * 
     * @return authStatus3Ds
     */
    public java.lang.String getAuthStatus3Ds() {
        return authStatus3Ds;
    }


    /**
     * Sets the authStatus3Ds value for this ThreeDSecureRequestType.
     * 
     * @param authStatus3Ds
     */
    public void setAuthStatus3Ds(java.lang.String authStatus3Ds) {
        this.authStatus3Ds = authStatus3Ds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThreeDSecureRequestType)) return false;
        ThreeDSecureRequestType other = (ThreeDSecureRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eci3Ds==null && other.getEci3Ds()==null) || 
             (this.eci3Ds!=null &&
              this.eci3Ds.equals(other.getEci3Ds()))) &&
            ((this.cavv==null && other.getCavv()==null) || 
             (this.cavv!=null &&
              this.cavv.equals(other.getCavv()))) &&
            ((this.xid==null && other.getXid()==null) || 
             (this.xid!=null &&
              this.xid.equals(other.getXid()))) &&
            ((this.mpiVendor3Ds==null && other.getMpiVendor3Ds()==null) || 
             (this.mpiVendor3Ds!=null &&
              this.mpiVendor3Ds.equals(other.getMpiVendor3Ds()))) &&
            ((this.authStatus3Ds==null && other.getAuthStatus3Ds()==null) || 
             (this.authStatus3Ds!=null &&
              this.authStatus3Ds.equals(other.getAuthStatus3Ds())));
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
        if (getEci3Ds() != null) {
            _hashCode += getEci3Ds().hashCode();
        }
        if (getCavv() != null) {
            _hashCode += getCavv().hashCode();
        }
        if (getXid() != null) {
            _hashCode += getXid().hashCode();
        }
        if (getMpiVendor3Ds() != null) {
            _hashCode += getMpiVendor3Ds().hashCode();
        }
        if (getAuthStatus3Ds() != null) {
            _hashCode += getAuthStatus3Ds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThreeDSecureRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eci3Ds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Eci3ds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cavv");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Cavv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Xid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpiVendor3Ds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MpiVendor3ds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authStatus3Ds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthStatus3ds"));
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
