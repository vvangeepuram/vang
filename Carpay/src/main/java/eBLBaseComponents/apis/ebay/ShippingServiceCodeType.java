/**
 * ShippingServiceCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ShippingServiceCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShippingServiceCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _UPSGround = new org.apache.axis.types.Token("UPSGround");
    public static final org.apache.axis.types.Token _UPS3rdDay = new org.apache.axis.types.Token("UPS3rdDay");
    public static final org.apache.axis.types.Token _UPS2ndDay = new org.apache.axis.types.Token("UPS2ndDay");
    public static final org.apache.axis.types.Token _UPSNextDay = new org.apache.axis.types.Token("UPSNextDay");
    public static final org.apache.axis.types.Token _USPSPriority = new org.apache.axis.types.Token("USPSPriority");
    public static final org.apache.axis.types.Token _USPSParcel = new org.apache.axis.types.Token("USPSParcel");
    public static final org.apache.axis.types.Token _USPSMedia = new org.apache.axis.types.Token("USPSMedia");
    public static final org.apache.axis.types.Token _USPSFirstClass = new org.apache.axis.types.Token("USPSFirstClass");
    public static final org.apache.axis.types.Token _ShippingMethodStandard = new org.apache.axis.types.Token("ShippingMethodStandard");
    public static final org.apache.axis.types.Token _ShippingMethodExpress = new org.apache.axis.types.Token("ShippingMethodExpress");
    public static final org.apache.axis.types.Token _ShippingMethodNextDay = new org.apache.axis.types.Token("ShippingMethodNextDay");
    public static final org.apache.axis.types.Token _USPSExpressMail = new org.apache.axis.types.Token("USPSExpressMail");
    public static final org.apache.axis.types.Token _USPSGround = new org.apache.axis.types.Token("USPSGround");
    public static final org.apache.axis.types.Token _Download = new org.apache.axis.types.Token("Download");
    public static final org.apache.axis.types.Token _WillCall_Or_Pickup = new org.apache.axis.types.Token("WillCall_Or_Pickup");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final ShippingServiceCodeType UPSGround = new ShippingServiceCodeType(_UPSGround);
    public static final ShippingServiceCodeType UPS3rdDay = new ShippingServiceCodeType(_UPS3rdDay);
    public static final ShippingServiceCodeType UPS2ndDay = new ShippingServiceCodeType(_UPS2ndDay);
    public static final ShippingServiceCodeType UPSNextDay = new ShippingServiceCodeType(_UPSNextDay);
    public static final ShippingServiceCodeType USPSPriority = new ShippingServiceCodeType(_USPSPriority);
    public static final ShippingServiceCodeType USPSParcel = new ShippingServiceCodeType(_USPSParcel);
    public static final ShippingServiceCodeType USPSMedia = new ShippingServiceCodeType(_USPSMedia);
    public static final ShippingServiceCodeType USPSFirstClass = new ShippingServiceCodeType(_USPSFirstClass);
    public static final ShippingServiceCodeType ShippingMethodStandard = new ShippingServiceCodeType(_ShippingMethodStandard);
    public static final ShippingServiceCodeType ShippingMethodExpress = new ShippingServiceCodeType(_ShippingMethodExpress);
    public static final ShippingServiceCodeType ShippingMethodNextDay = new ShippingServiceCodeType(_ShippingMethodNextDay);
    public static final ShippingServiceCodeType USPSExpressMail = new ShippingServiceCodeType(_USPSExpressMail);
    public static final ShippingServiceCodeType USPSGround = new ShippingServiceCodeType(_USPSGround);
    public static final ShippingServiceCodeType Download = new ShippingServiceCodeType(_Download);
    public static final ShippingServiceCodeType WillCall_Or_Pickup = new ShippingServiceCodeType(_WillCall_Or_Pickup);
    public static final ShippingServiceCodeType CustomCode = new ShippingServiceCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static ShippingServiceCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        ShippingServiceCodeType enumeration = (ShippingServiceCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ShippingServiceCodeType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.Token(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingServiceCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingServiceCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
