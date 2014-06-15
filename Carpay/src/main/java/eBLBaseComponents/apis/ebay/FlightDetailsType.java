/**
 * FlightDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Details of leg information
 */
public class FlightDetailsType  implements java.io.Serializable {
    private java.lang.String conjuctionTicket;

    private java.lang.String exchangeTicket;

    private java.lang.String couponNumber;

    private java.lang.String serviceClass;

    private java.lang.String travelDate;

    private java.lang.String carrierCode;

    private java.lang.String stopOverPermitted;

    private java.lang.String departureAirport;

    private java.lang.String arrivalAirport;

    private java.lang.String flightNumber;

    private java.lang.String departureTime;

    private java.lang.String arrivalTime;

    private java.lang.String fareBasisCode;

    private CoreComponentTypes.apis.ebay.BasicAmountType fare;

    private CoreComponentTypes.apis.ebay.BasicAmountType taxes;

    private CoreComponentTypes.apis.ebay.BasicAmountType fee;

    private java.lang.String endorsementOrRestrictions;

    public FlightDetailsType() {
    }

    public FlightDetailsType(
           java.lang.String conjuctionTicket,
           java.lang.String exchangeTicket,
           java.lang.String couponNumber,
           java.lang.String serviceClass,
           java.lang.String travelDate,
           java.lang.String carrierCode,
           java.lang.String stopOverPermitted,
           java.lang.String departureAirport,
           java.lang.String arrivalAirport,
           java.lang.String flightNumber,
           java.lang.String departureTime,
           java.lang.String arrivalTime,
           java.lang.String fareBasisCode,
           CoreComponentTypes.apis.ebay.BasicAmountType fare,
           CoreComponentTypes.apis.ebay.BasicAmountType taxes,
           CoreComponentTypes.apis.ebay.BasicAmountType fee,
           java.lang.String endorsementOrRestrictions) {
           this.conjuctionTicket = conjuctionTicket;
           this.exchangeTicket = exchangeTicket;
           this.couponNumber = couponNumber;
           this.serviceClass = serviceClass;
           this.travelDate = travelDate;
           this.carrierCode = carrierCode;
           this.stopOverPermitted = stopOverPermitted;
           this.departureAirport = departureAirport;
           this.arrivalAirport = arrivalAirport;
           this.flightNumber = flightNumber;
           this.departureTime = departureTime;
           this.arrivalTime = arrivalTime;
           this.fareBasisCode = fareBasisCode;
           this.fare = fare;
           this.taxes = taxes;
           this.fee = fee;
           this.endorsementOrRestrictions = endorsementOrRestrictions;
    }


    /**
     * Gets the conjuctionTicket value for this FlightDetailsType.
     * 
     * @return conjuctionTicket
     */
    public java.lang.String getConjuctionTicket() {
        return conjuctionTicket;
    }


    /**
     * Sets the conjuctionTicket value for this FlightDetailsType.
     * 
     * @param conjuctionTicket
     */
    public void setConjuctionTicket(java.lang.String conjuctionTicket) {
        this.conjuctionTicket = conjuctionTicket;
    }


    /**
     * Gets the exchangeTicket value for this FlightDetailsType.
     * 
     * @return exchangeTicket
     */
    public java.lang.String getExchangeTicket() {
        return exchangeTicket;
    }


    /**
     * Sets the exchangeTicket value for this FlightDetailsType.
     * 
     * @param exchangeTicket
     */
    public void setExchangeTicket(java.lang.String exchangeTicket) {
        this.exchangeTicket = exchangeTicket;
    }


    /**
     * Gets the couponNumber value for this FlightDetailsType.
     * 
     * @return couponNumber
     */
    public java.lang.String getCouponNumber() {
        return couponNumber;
    }


    /**
     * Sets the couponNumber value for this FlightDetailsType.
     * 
     * @param couponNumber
     */
    public void setCouponNumber(java.lang.String couponNumber) {
        this.couponNumber = couponNumber;
    }


    /**
     * Gets the serviceClass value for this FlightDetailsType.
     * 
     * @return serviceClass
     */
    public java.lang.String getServiceClass() {
        return serviceClass;
    }


    /**
     * Sets the serviceClass value for this FlightDetailsType.
     * 
     * @param serviceClass
     */
    public void setServiceClass(java.lang.String serviceClass) {
        this.serviceClass = serviceClass;
    }


    /**
     * Gets the travelDate value for this FlightDetailsType.
     * 
     * @return travelDate
     */
    public java.lang.String getTravelDate() {
        return travelDate;
    }


    /**
     * Sets the travelDate value for this FlightDetailsType.
     * 
     * @param travelDate
     */
    public void setTravelDate(java.lang.String travelDate) {
        this.travelDate = travelDate;
    }


    /**
     * Gets the carrierCode value for this FlightDetailsType.
     * 
     * @return carrierCode
     */
    public java.lang.String getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this FlightDetailsType.
     * 
     * @param carrierCode
     */
    public void setCarrierCode(java.lang.String carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the stopOverPermitted value for this FlightDetailsType.
     * 
     * @return stopOverPermitted
     */
    public java.lang.String getStopOverPermitted() {
        return stopOverPermitted;
    }


    /**
     * Sets the stopOverPermitted value for this FlightDetailsType.
     * 
     * @param stopOverPermitted
     */
    public void setStopOverPermitted(java.lang.String stopOverPermitted) {
        this.stopOverPermitted = stopOverPermitted;
    }


    /**
     * Gets the departureAirport value for this FlightDetailsType.
     * 
     * @return departureAirport
     */
    public java.lang.String getDepartureAirport() {
        return departureAirport;
    }


    /**
     * Sets the departureAirport value for this FlightDetailsType.
     * 
     * @param departureAirport
     */
    public void setDepartureAirport(java.lang.String departureAirport) {
        this.departureAirport = departureAirport;
    }


    /**
     * Gets the arrivalAirport value for this FlightDetailsType.
     * 
     * @return arrivalAirport
     */
    public java.lang.String getArrivalAirport() {
        return arrivalAirport;
    }


    /**
     * Sets the arrivalAirport value for this FlightDetailsType.
     * 
     * @param arrivalAirport
     */
    public void setArrivalAirport(java.lang.String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }


    /**
     * Gets the flightNumber value for this FlightDetailsType.
     * 
     * @return flightNumber
     */
    public java.lang.String getFlightNumber() {
        return flightNumber;
    }


    /**
     * Sets the flightNumber value for this FlightDetailsType.
     * 
     * @param flightNumber
     */
    public void setFlightNumber(java.lang.String flightNumber) {
        this.flightNumber = flightNumber;
    }


    /**
     * Gets the departureTime value for this FlightDetailsType.
     * 
     * @return departureTime
     */
    public java.lang.String getDepartureTime() {
        return departureTime;
    }


    /**
     * Sets the departureTime value for this FlightDetailsType.
     * 
     * @param departureTime
     */
    public void setDepartureTime(java.lang.String departureTime) {
        this.departureTime = departureTime;
    }


    /**
     * Gets the arrivalTime value for this FlightDetailsType.
     * 
     * @return arrivalTime
     */
    public java.lang.String getArrivalTime() {
        return arrivalTime;
    }


    /**
     * Sets the arrivalTime value for this FlightDetailsType.
     * 
     * @param arrivalTime
     */
    public void setArrivalTime(java.lang.String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    /**
     * Gets the fareBasisCode value for this FlightDetailsType.
     * 
     * @return fareBasisCode
     */
    public java.lang.String getFareBasisCode() {
        return fareBasisCode;
    }


    /**
     * Sets the fareBasisCode value for this FlightDetailsType.
     * 
     * @param fareBasisCode
     */
    public void setFareBasisCode(java.lang.String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }


    /**
     * Gets the fare value for this FlightDetailsType.
     * 
     * @return fare
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getFare() {
        return fare;
    }


    /**
     * Sets the fare value for this FlightDetailsType.
     * 
     * @param fare
     */
    public void setFare(CoreComponentTypes.apis.ebay.BasicAmountType fare) {
        this.fare = fare;
    }


    /**
     * Gets the taxes value for this FlightDetailsType.
     * 
     * @return taxes
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this FlightDetailsType.
     * 
     * @param taxes
     */
    public void setTaxes(CoreComponentTypes.apis.ebay.BasicAmountType taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the fee value for this FlightDetailsType.
     * 
     * @return fee
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this FlightDetailsType.
     * 
     * @param fee
     */
    public void setFee(CoreComponentTypes.apis.ebay.BasicAmountType fee) {
        this.fee = fee;
    }


    /**
     * Gets the endorsementOrRestrictions value for this FlightDetailsType.
     * 
     * @return endorsementOrRestrictions
     */
    public java.lang.String getEndorsementOrRestrictions() {
        return endorsementOrRestrictions;
    }


    /**
     * Sets the endorsementOrRestrictions value for this FlightDetailsType.
     * 
     * @param endorsementOrRestrictions
     */
    public void setEndorsementOrRestrictions(java.lang.String endorsementOrRestrictions) {
        this.endorsementOrRestrictions = endorsementOrRestrictions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightDetailsType)) return false;
        FlightDetailsType other = (FlightDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conjuctionTicket==null && other.getConjuctionTicket()==null) || 
             (this.conjuctionTicket!=null &&
              this.conjuctionTicket.equals(other.getConjuctionTicket()))) &&
            ((this.exchangeTicket==null && other.getExchangeTicket()==null) || 
             (this.exchangeTicket!=null &&
              this.exchangeTicket.equals(other.getExchangeTicket()))) &&
            ((this.couponNumber==null && other.getCouponNumber()==null) || 
             (this.couponNumber!=null &&
              this.couponNumber.equals(other.getCouponNumber()))) &&
            ((this.serviceClass==null && other.getServiceClass()==null) || 
             (this.serviceClass!=null &&
              this.serviceClass.equals(other.getServiceClass()))) &&
            ((this.travelDate==null && other.getTravelDate()==null) || 
             (this.travelDate!=null &&
              this.travelDate.equals(other.getTravelDate()))) &&
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            ((this.stopOverPermitted==null && other.getStopOverPermitted()==null) || 
             (this.stopOverPermitted!=null &&
              this.stopOverPermitted.equals(other.getStopOverPermitted()))) &&
            ((this.departureAirport==null && other.getDepartureAirport()==null) || 
             (this.departureAirport!=null &&
              this.departureAirport.equals(other.getDepartureAirport()))) &&
            ((this.arrivalAirport==null && other.getArrivalAirport()==null) || 
             (this.arrivalAirport!=null &&
              this.arrivalAirport.equals(other.getArrivalAirport()))) &&
            ((this.flightNumber==null && other.getFlightNumber()==null) || 
             (this.flightNumber!=null &&
              this.flightNumber.equals(other.getFlightNumber()))) &&
            ((this.departureTime==null && other.getDepartureTime()==null) || 
             (this.departureTime!=null &&
              this.departureTime.equals(other.getDepartureTime()))) &&
            ((this.arrivalTime==null && other.getArrivalTime()==null) || 
             (this.arrivalTime!=null &&
              this.arrivalTime.equals(other.getArrivalTime()))) &&
            ((this.fareBasisCode==null && other.getFareBasisCode()==null) || 
             (this.fareBasisCode!=null &&
              this.fareBasisCode.equals(other.getFareBasisCode()))) &&
            ((this.fare==null && other.getFare()==null) || 
             (this.fare!=null &&
              this.fare.equals(other.getFare()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              this.taxes.equals(other.getTaxes()))) &&
            ((this.fee==null && other.getFee()==null) || 
             (this.fee!=null &&
              this.fee.equals(other.getFee()))) &&
            ((this.endorsementOrRestrictions==null && other.getEndorsementOrRestrictions()==null) || 
             (this.endorsementOrRestrictions!=null &&
              this.endorsementOrRestrictions.equals(other.getEndorsementOrRestrictions())));
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
        if (getConjuctionTicket() != null) {
            _hashCode += getConjuctionTicket().hashCode();
        }
        if (getExchangeTicket() != null) {
            _hashCode += getExchangeTicket().hashCode();
        }
        if (getCouponNumber() != null) {
            _hashCode += getCouponNumber().hashCode();
        }
        if (getServiceClass() != null) {
            _hashCode += getServiceClass().hashCode();
        }
        if (getTravelDate() != null) {
            _hashCode += getTravelDate().hashCode();
        }
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        if (getStopOverPermitted() != null) {
            _hashCode += getStopOverPermitted().hashCode();
        }
        if (getDepartureAirport() != null) {
            _hashCode += getDepartureAirport().hashCode();
        }
        if (getArrivalAirport() != null) {
            _hashCode += getArrivalAirport().hashCode();
        }
        if (getFlightNumber() != null) {
            _hashCode += getFlightNumber().hashCode();
        }
        if (getDepartureTime() != null) {
            _hashCode += getDepartureTime().hashCode();
        }
        if (getArrivalTime() != null) {
            _hashCode += getArrivalTime().hashCode();
        }
        if (getFareBasisCode() != null) {
            _hashCode += getFareBasisCode().hashCode();
        }
        if (getFare() != null) {
            _hashCode += getFare().hashCode();
        }
        if (getTaxes() != null) {
            _hashCode += getTaxes().hashCode();
        }
        if (getFee() != null) {
            _hashCode += getFee().hashCode();
        }
        if (getEndorsementOrRestrictions() != null) {
            _hashCode += getEndorsementOrRestrictions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlightDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conjuctionTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ConjuctionTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExchangeTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CouponNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ServiceClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TravelDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopOverPermitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StopOverPermitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureAirport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DepartureAirport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalAirport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ArrivalAirport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlightNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DepartureTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ArrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareBasisCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FareBasisCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fare");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Fare"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endorsementOrRestrictions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EndorsementOrRestrictions"));
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
