/**
 * OptionTrackingDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class OptionTrackingDetailsType  implements java.io.Serializable {
    /* Option Number. */
    private java.lang.String optionNumber;

    /* Option Quantity. */
    private java.lang.String optionQty;

    /* Option Select Name. */
    private java.lang.String optionSelect;

    /* Option Quantity Delta. */
    private java.lang.String optionQtyDelta;

    /* Option Alert. */
    private java.lang.String optionAlert;

    /* Option Cost. */
    private java.lang.String optionCost;

    public OptionTrackingDetailsType() {
    }

    public OptionTrackingDetailsType(
           java.lang.String optionNumber,
           java.lang.String optionQty,
           java.lang.String optionSelect,
           java.lang.String optionQtyDelta,
           java.lang.String optionAlert,
           java.lang.String optionCost) {
           this.optionNumber = optionNumber;
           this.optionQty = optionQty;
           this.optionSelect = optionSelect;
           this.optionQtyDelta = optionQtyDelta;
           this.optionAlert = optionAlert;
           this.optionCost = optionCost;
    }


    /**
     * Gets the optionNumber value for this OptionTrackingDetailsType.
     * 
     * @return optionNumber   * Option Number.
     */
    public java.lang.String getOptionNumber() {
        return optionNumber;
    }


    /**
     * Sets the optionNumber value for this OptionTrackingDetailsType.
     * 
     * @param optionNumber   * Option Number.
     */
    public void setOptionNumber(java.lang.String optionNumber) {
        this.optionNumber = optionNumber;
    }


    /**
     * Gets the optionQty value for this OptionTrackingDetailsType.
     * 
     * @return optionQty   * Option Quantity.
     */
    public java.lang.String getOptionQty() {
        return optionQty;
    }


    /**
     * Sets the optionQty value for this OptionTrackingDetailsType.
     * 
     * @param optionQty   * Option Quantity.
     */
    public void setOptionQty(java.lang.String optionQty) {
        this.optionQty = optionQty;
    }


    /**
     * Gets the optionSelect value for this OptionTrackingDetailsType.
     * 
     * @return optionSelect   * Option Select Name.
     */
    public java.lang.String getOptionSelect() {
        return optionSelect;
    }


    /**
     * Sets the optionSelect value for this OptionTrackingDetailsType.
     * 
     * @param optionSelect   * Option Select Name.
     */
    public void setOptionSelect(java.lang.String optionSelect) {
        this.optionSelect = optionSelect;
    }


    /**
     * Gets the optionQtyDelta value for this OptionTrackingDetailsType.
     * 
     * @return optionQtyDelta   * Option Quantity Delta.
     */
    public java.lang.String getOptionQtyDelta() {
        return optionQtyDelta;
    }


    /**
     * Sets the optionQtyDelta value for this OptionTrackingDetailsType.
     * 
     * @param optionQtyDelta   * Option Quantity Delta.
     */
    public void setOptionQtyDelta(java.lang.String optionQtyDelta) {
        this.optionQtyDelta = optionQtyDelta;
    }


    /**
     * Gets the optionAlert value for this OptionTrackingDetailsType.
     * 
     * @return optionAlert   * Option Alert.
     */
    public java.lang.String getOptionAlert() {
        return optionAlert;
    }


    /**
     * Sets the optionAlert value for this OptionTrackingDetailsType.
     * 
     * @param optionAlert   * Option Alert.
     */
    public void setOptionAlert(java.lang.String optionAlert) {
        this.optionAlert = optionAlert;
    }


    /**
     * Gets the optionCost value for this OptionTrackingDetailsType.
     * 
     * @return optionCost   * Option Cost.
     */
    public java.lang.String getOptionCost() {
        return optionCost;
    }


    /**
     * Sets the optionCost value for this OptionTrackingDetailsType.
     * 
     * @param optionCost   * Option Cost.
     */
    public void setOptionCost(java.lang.String optionCost) {
        this.optionCost = optionCost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OptionTrackingDetailsType)) return false;
        OptionTrackingDetailsType other = (OptionTrackingDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.optionNumber==null && other.getOptionNumber()==null) || 
             (this.optionNumber!=null &&
              this.optionNumber.equals(other.getOptionNumber()))) &&
            ((this.optionQty==null && other.getOptionQty()==null) || 
             (this.optionQty!=null &&
              this.optionQty.equals(other.getOptionQty()))) &&
            ((this.optionSelect==null && other.getOptionSelect()==null) || 
             (this.optionSelect!=null &&
              this.optionSelect.equals(other.getOptionSelect()))) &&
            ((this.optionQtyDelta==null && other.getOptionQtyDelta()==null) || 
             (this.optionQtyDelta!=null &&
              this.optionQtyDelta.equals(other.getOptionQtyDelta()))) &&
            ((this.optionAlert==null && other.getOptionAlert()==null) || 
             (this.optionAlert!=null &&
              this.optionAlert.equals(other.getOptionAlert()))) &&
            ((this.optionCost==null && other.getOptionCost()==null) || 
             (this.optionCost!=null &&
              this.optionCost.equals(other.getOptionCost())));
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
        if (getOptionNumber() != null) {
            _hashCode += getOptionNumber().hashCode();
        }
        if (getOptionQty() != null) {
            _hashCode += getOptionQty().hashCode();
        }
        if (getOptionSelect() != null) {
            _hashCode += getOptionSelect().hashCode();
        }
        if (getOptionQtyDelta() != null) {
            _hashCode += getOptionQtyDelta().hashCode();
        }
        if (getOptionAlert() != null) {
            _hashCode += getOptionAlert().hashCode();
        }
        if (getOptionCost() != null) {
            _hashCode += getOptionCost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OptionTrackingDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionTrackingDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionQty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionQty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionSelect");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionSelect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionQtyDelta");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionQtyDelta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionAlert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionAlert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionCost"));
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
