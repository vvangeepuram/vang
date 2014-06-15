/**
 * ProductCategoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ProductCategoryType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProductCategoryType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Other = new org.apache.axis.types.Token("Other");
    public static final org.apache.axis.types.Token _Airlines = new org.apache.axis.types.Token("Airlines");
    public static final org.apache.axis.types.Token _Antiques = new org.apache.axis.types.Token("Antiques");
    public static final org.apache.axis.types.Token _Art = new org.apache.axis.types.Token("Art");
    public static final org.apache.axis.types.Token _Cameras_Photos = new org.apache.axis.types.Token("Cameras_Photos");
    public static final org.apache.axis.types.Token _Cars_Boats_Vehicles_Parts = new org.apache.axis.types.Token("Cars_Boats_Vehicles_Parts");
    public static final org.apache.axis.types.Token _CellPhones_Telecom = new org.apache.axis.types.Token("CellPhones_Telecom");
    public static final org.apache.axis.types.Token _Coins_PaperMoney = new org.apache.axis.types.Token("Coins_PaperMoney");
    public static final org.apache.axis.types.Token _Collectibles = new org.apache.axis.types.Token("Collectibles");
    public static final org.apache.axis.types.Token _Computers_Networking = new org.apache.axis.types.Token("Computers_Networking");
    public static final org.apache.axis.types.Token _ConsumerElectronics = new org.apache.axis.types.Token("ConsumerElectronics");
    public static final org.apache.axis.types.Token _Jewelry_Watches = new org.apache.axis.types.Token("Jewelry_Watches");
    public static final org.apache.axis.types.Token _MusicalInstruments = new org.apache.axis.types.Token("MusicalInstruments");
    public static final org.apache.axis.types.Token _RealEstate = new org.apache.axis.types.Token("RealEstate");
    public static final org.apache.axis.types.Token _SportsMemorabilia_Cards_FanShop = new org.apache.axis.types.Token("SportsMemorabilia_Cards_FanShop");
    public static final org.apache.axis.types.Token _Stamps = new org.apache.axis.types.Token("Stamps");
    public static final org.apache.axis.types.Token _Tickets = new org.apache.axis.types.Token("Tickets");
    public static final org.apache.axis.types.Token _Travels = new org.apache.axis.types.Token("Travels");
    public static final org.apache.axis.types.Token _Gambling = new org.apache.axis.types.Token("Gambling");
    public static final org.apache.axis.types.Token _Alcohol = new org.apache.axis.types.Token("Alcohol");
    public static final org.apache.axis.types.Token _Tobacco = new org.apache.axis.types.Token("Tobacco");
    public static final org.apache.axis.types.Token _MoneyTransfer = new org.apache.axis.types.Token("MoneyTransfer");
    public static final org.apache.axis.types.Token _Software = new org.apache.axis.types.Token("Software");
    public static final ProductCategoryType Other = new ProductCategoryType(_Other);
    public static final ProductCategoryType Airlines = new ProductCategoryType(_Airlines);
    public static final ProductCategoryType Antiques = new ProductCategoryType(_Antiques);
    public static final ProductCategoryType Art = new ProductCategoryType(_Art);
    public static final ProductCategoryType Cameras_Photos = new ProductCategoryType(_Cameras_Photos);
    public static final ProductCategoryType Cars_Boats_Vehicles_Parts = new ProductCategoryType(_Cars_Boats_Vehicles_Parts);
    public static final ProductCategoryType CellPhones_Telecom = new ProductCategoryType(_CellPhones_Telecom);
    public static final ProductCategoryType Coins_PaperMoney = new ProductCategoryType(_Coins_PaperMoney);
    public static final ProductCategoryType Collectibles = new ProductCategoryType(_Collectibles);
    public static final ProductCategoryType Computers_Networking = new ProductCategoryType(_Computers_Networking);
    public static final ProductCategoryType ConsumerElectronics = new ProductCategoryType(_ConsumerElectronics);
    public static final ProductCategoryType Jewelry_Watches = new ProductCategoryType(_Jewelry_Watches);
    public static final ProductCategoryType MusicalInstruments = new ProductCategoryType(_MusicalInstruments);
    public static final ProductCategoryType RealEstate = new ProductCategoryType(_RealEstate);
    public static final ProductCategoryType SportsMemorabilia_Cards_FanShop = new ProductCategoryType(_SportsMemorabilia_Cards_FanShop);
    public static final ProductCategoryType Stamps = new ProductCategoryType(_Stamps);
    public static final ProductCategoryType Tickets = new ProductCategoryType(_Tickets);
    public static final ProductCategoryType Travels = new ProductCategoryType(_Travels);
    public static final ProductCategoryType Gambling = new ProductCategoryType(_Gambling);
    public static final ProductCategoryType Alcohol = new ProductCategoryType(_Alcohol);
    public static final ProductCategoryType Tobacco = new ProductCategoryType(_Tobacco);
    public static final ProductCategoryType MoneyTransfer = new ProductCategoryType(_MoneyTransfer);
    public static final ProductCategoryType Software = new ProductCategoryType(_Software);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static ProductCategoryType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        ProductCategoryType enumeration = (ProductCategoryType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProductCategoryType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProductCategoryType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProductCategoryType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
