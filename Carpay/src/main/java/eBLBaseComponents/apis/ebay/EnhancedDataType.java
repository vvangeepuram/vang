/**
 * EnhancedDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Enhanced Data Information. Example: AID for Airlines
 */
public class EnhancedDataType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.AirlineItineraryType airlineItinerary;

    public EnhancedDataType() {
    }

    public EnhancedDataType(
           eBLBaseComponents.apis.ebay.AirlineItineraryType airlineItinerary) {
           this.airlineItinerary = airlineItinerary;
    }


    /**
     * Gets the airlineItinerary value for this EnhancedDataType.
     * 
     * @return airlineItinerary
     */
    public eBLBaseComponents.apis.ebay.AirlineItineraryType getAirlineItinerary() {
        return airlineItinerary;
    }


    /**
     * Sets the airlineItinerary value for this EnhancedDataType.
     * 
     * @param airlineItinerary
     */
    public void setAirlineItinerary(eBLBaseComponents.apis.ebay.AirlineItineraryType airlineItinerary) {
        this.airlineItinerary = airlineItinerary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnhancedDataType)) return false;
        EnhancedDataType other = (EnhancedDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airlineItinerary==null && other.getAirlineItinerary()==null) || 
             (this.airlineItinerary!=null &&
              this.airlineItinerary.equals(other.getAirlineItinerary())));
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
        if (getAirlineItinerary() != null) {
            _hashCode += getAirlineItinerary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnhancedDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnhancedDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airlineItinerary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AirlineItinerary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AirlineItineraryType"));
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
