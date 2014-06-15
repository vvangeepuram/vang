/**
 * AirlineItineraryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * AID for Airlines
 */
public class AirlineItineraryType  implements java.io.Serializable {
    private java.lang.String passengerName;

    private java.lang.String issueDate;

    private java.lang.String travelAgencyName;

    private java.lang.String travelAgencyCode;

    private java.lang.String ticketNumber;

    private java.lang.String issuingCarrierCode;

    private java.lang.String customerCode;

    private CoreComponentTypes.apis.ebay.BasicAmountType totalFare;

    private CoreComponentTypes.apis.ebay.BasicAmountType totalTaxes;

    private CoreComponentTypes.apis.ebay.BasicAmountType totalFee;

    private java.lang.String restrictedTicket;

    private java.lang.String clearingSequence;

    private java.lang.String clearingCount;

    private eBLBaseComponents.apis.ebay.FlightDetailsType[] flightDetails;

    public AirlineItineraryType() {
    }

    public AirlineItineraryType(
           java.lang.String passengerName,
           java.lang.String issueDate,
           java.lang.String travelAgencyName,
           java.lang.String travelAgencyCode,
           java.lang.String ticketNumber,
           java.lang.String issuingCarrierCode,
           java.lang.String customerCode,
           CoreComponentTypes.apis.ebay.BasicAmountType totalFare,
           CoreComponentTypes.apis.ebay.BasicAmountType totalTaxes,
           CoreComponentTypes.apis.ebay.BasicAmountType totalFee,
           java.lang.String restrictedTicket,
           java.lang.String clearingSequence,
           java.lang.String clearingCount,
           eBLBaseComponents.apis.ebay.FlightDetailsType[] flightDetails) {
           this.passengerName = passengerName;
           this.issueDate = issueDate;
           this.travelAgencyName = travelAgencyName;
           this.travelAgencyCode = travelAgencyCode;
           this.ticketNumber = ticketNumber;
           this.issuingCarrierCode = issuingCarrierCode;
           this.customerCode = customerCode;
           this.totalFare = totalFare;
           this.totalTaxes = totalTaxes;
           this.totalFee = totalFee;
           this.restrictedTicket = restrictedTicket;
           this.clearingSequence = clearingSequence;
           this.clearingCount = clearingCount;
           this.flightDetails = flightDetails;
    }


    /**
     * Gets the passengerName value for this AirlineItineraryType.
     * 
     * @return passengerName
     */
    public java.lang.String getPassengerName() {
        return passengerName;
    }


    /**
     * Sets the passengerName value for this AirlineItineraryType.
     * 
     * @param passengerName
     */
    public void setPassengerName(java.lang.String passengerName) {
        this.passengerName = passengerName;
    }


    /**
     * Gets the issueDate value for this AirlineItineraryType.
     * 
     * @return issueDate
     */
    public java.lang.String getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this AirlineItineraryType.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.lang.String issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the travelAgencyName value for this AirlineItineraryType.
     * 
     * @return travelAgencyName
     */
    public java.lang.String getTravelAgencyName() {
        return travelAgencyName;
    }


    /**
     * Sets the travelAgencyName value for this AirlineItineraryType.
     * 
     * @param travelAgencyName
     */
    public void setTravelAgencyName(java.lang.String travelAgencyName) {
        this.travelAgencyName = travelAgencyName;
    }


    /**
     * Gets the travelAgencyCode value for this AirlineItineraryType.
     * 
     * @return travelAgencyCode
     */
    public java.lang.String getTravelAgencyCode() {
        return travelAgencyCode;
    }


    /**
     * Sets the travelAgencyCode value for this AirlineItineraryType.
     * 
     * @param travelAgencyCode
     */
    public void setTravelAgencyCode(java.lang.String travelAgencyCode) {
        this.travelAgencyCode = travelAgencyCode;
    }


    /**
     * Gets the ticketNumber value for this AirlineItineraryType.
     * 
     * @return ticketNumber
     */
    public java.lang.String getTicketNumber() {
        return ticketNumber;
    }


    /**
     * Sets the ticketNumber value for this AirlineItineraryType.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(java.lang.String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }


    /**
     * Gets the issuingCarrierCode value for this AirlineItineraryType.
     * 
     * @return issuingCarrierCode
     */
    public java.lang.String getIssuingCarrierCode() {
        return issuingCarrierCode;
    }


    /**
     * Sets the issuingCarrierCode value for this AirlineItineraryType.
     * 
     * @param issuingCarrierCode
     */
    public void setIssuingCarrierCode(java.lang.String issuingCarrierCode) {
        this.issuingCarrierCode = issuingCarrierCode;
    }


    /**
     * Gets the customerCode value for this AirlineItineraryType.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this AirlineItineraryType.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the totalFare value for this AirlineItineraryType.
     * 
     * @return totalFare
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTotalFare() {
        return totalFare;
    }


    /**
     * Sets the totalFare value for this AirlineItineraryType.
     * 
     * @param totalFare
     */
    public void setTotalFare(CoreComponentTypes.apis.ebay.BasicAmountType totalFare) {
        this.totalFare = totalFare;
    }


    /**
     * Gets the totalTaxes value for this AirlineItineraryType.
     * 
     * @return totalTaxes
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTotalTaxes() {
        return totalTaxes;
    }


    /**
     * Sets the totalTaxes value for this AirlineItineraryType.
     * 
     * @param totalTaxes
     */
    public void setTotalTaxes(CoreComponentTypes.apis.ebay.BasicAmountType totalTaxes) {
        this.totalTaxes = totalTaxes;
    }


    /**
     * Gets the totalFee value for this AirlineItineraryType.
     * 
     * @return totalFee
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTotalFee() {
        return totalFee;
    }


    /**
     * Sets the totalFee value for this AirlineItineraryType.
     * 
     * @param totalFee
     */
    public void setTotalFee(CoreComponentTypes.apis.ebay.BasicAmountType totalFee) {
        this.totalFee = totalFee;
    }


    /**
     * Gets the restrictedTicket value for this AirlineItineraryType.
     * 
     * @return restrictedTicket
     */
    public java.lang.String getRestrictedTicket() {
        return restrictedTicket;
    }


    /**
     * Sets the restrictedTicket value for this AirlineItineraryType.
     * 
     * @param restrictedTicket
     */
    public void setRestrictedTicket(java.lang.String restrictedTicket) {
        this.restrictedTicket = restrictedTicket;
    }


    /**
     * Gets the clearingSequence value for this AirlineItineraryType.
     * 
     * @return clearingSequence
     */
    public java.lang.String getClearingSequence() {
        return clearingSequence;
    }


    /**
     * Sets the clearingSequence value for this AirlineItineraryType.
     * 
     * @param clearingSequence
     */
    public void setClearingSequence(java.lang.String clearingSequence) {
        this.clearingSequence = clearingSequence;
    }


    /**
     * Gets the clearingCount value for this AirlineItineraryType.
     * 
     * @return clearingCount
     */
    public java.lang.String getClearingCount() {
        return clearingCount;
    }


    /**
     * Sets the clearingCount value for this AirlineItineraryType.
     * 
     * @param clearingCount
     */
    public void setClearingCount(java.lang.String clearingCount) {
        this.clearingCount = clearingCount;
    }


    /**
     * Gets the flightDetails value for this AirlineItineraryType.
     * 
     * @return flightDetails
     */
    public eBLBaseComponents.apis.ebay.FlightDetailsType[] getFlightDetails() {
        return flightDetails;
    }


    /**
     * Sets the flightDetails value for this AirlineItineraryType.
     * 
     * @param flightDetails
     */
    public void setFlightDetails(eBLBaseComponents.apis.ebay.FlightDetailsType[] flightDetails) {
        this.flightDetails = flightDetails;
    }

    public eBLBaseComponents.apis.ebay.FlightDetailsType getFlightDetails(int i) {
        return this.flightDetails[i];
    }

    public void setFlightDetails(int i, eBLBaseComponents.apis.ebay.FlightDetailsType _value) {
        this.flightDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirlineItineraryType)) return false;
        AirlineItineraryType other = (AirlineItineraryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.passengerName==null && other.getPassengerName()==null) || 
             (this.passengerName!=null &&
              this.passengerName.equals(other.getPassengerName()))) &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            ((this.travelAgencyName==null && other.getTravelAgencyName()==null) || 
             (this.travelAgencyName!=null &&
              this.travelAgencyName.equals(other.getTravelAgencyName()))) &&
            ((this.travelAgencyCode==null && other.getTravelAgencyCode()==null) || 
             (this.travelAgencyCode!=null &&
              this.travelAgencyCode.equals(other.getTravelAgencyCode()))) &&
            ((this.ticketNumber==null && other.getTicketNumber()==null) || 
             (this.ticketNumber!=null &&
              this.ticketNumber.equals(other.getTicketNumber()))) &&
            ((this.issuingCarrierCode==null && other.getIssuingCarrierCode()==null) || 
             (this.issuingCarrierCode!=null &&
              this.issuingCarrierCode.equals(other.getIssuingCarrierCode()))) &&
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode()))) &&
            ((this.totalFare==null && other.getTotalFare()==null) || 
             (this.totalFare!=null &&
              this.totalFare.equals(other.getTotalFare()))) &&
            ((this.totalTaxes==null && other.getTotalTaxes()==null) || 
             (this.totalTaxes!=null &&
              this.totalTaxes.equals(other.getTotalTaxes()))) &&
            ((this.totalFee==null && other.getTotalFee()==null) || 
             (this.totalFee!=null &&
              this.totalFee.equals(other.getTotalFee()))) &&
            ((this.restrictedTicket==null && other.getRestrictedTicket()==null) || 
             (this.restrictedTicket!=null &&
              this.restrictedTicket.equals(other.getRestrictedTicket()))) &&
            ((this.clearingSequence==null && other.getClearingSequence()==null) || 
             (this.clearingSequence!=null &&
              this.clearingSequence.equals(other.getClearingSequence()))) &&
            ((this.clearingCount==null && other.getClearingCount()==null) || 
             (this.clearingCount!=null &&
              this.clearingCount.equals(other.getClearingCount()))) &&
            ((this.flightDetails==null && other.getFlightDetails()==null) || 
             (this.flightDetails!=null &&
              java.util.Arrays.equals(this.flightDetails, other.getFlightDetails())));
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
        if (getPassengerName() != null) {
            _hashCode += getPassengerName().hashCode();
        }
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        if (getTravelAgencyName() != null) {
            _hashCode += getTravelAgencyName().hashCode();
        }
        if (getTravelAgencyCode() != null) {
            _hashCode += getTravelAgencyCode().hashCode();
        }
        if (getTicketNumber() != null) {
            _hashCode += getTicketNumber().hashCode();
        }
        if (getIssuingCarrierCode() != null) {
            _hashCode += getIssuingCarrierCode().hashCode();
        }
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getTotalFare() != null) {
            _hashCode += getTotalFare().hashCode();
        }
        if (getTotalTaxes() != null) {
            _hashCode += getTotalTaxes().hashCode();
        }
        if (getTotalFee() != null) {
            _hashCode += getTotalFee().hashCode();
        }
        if (getRestrictedTicket() != null) {
            _hashCode += getRestrictedTicket().hashCode();
        }
        if (getClearingSequence() != null) {
            _hashCode += getClearingSequence().hashCode();
        }
        if (getClearingCount() != null) {
            _hashCode += getClearingCount().hashCode();
        }
        if (getFlightDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlightDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlightDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirlineItineraryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AirlineItineraryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PassengerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelAgencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TravelAgencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelAgencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TravelAgencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TicketNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuingCarrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IssuingCarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CustomerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFare");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TotalFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TotalTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TotalFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictedTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RestrictedTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearingSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ClearingSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearingCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ClearingCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlightDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlightDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
