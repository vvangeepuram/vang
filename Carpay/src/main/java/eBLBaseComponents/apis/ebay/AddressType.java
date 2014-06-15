/**
 * AddressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class AddressType  implements java.io.Serializable {
    /* Person's name associated with this address. 
     * Character length and limitations: 32 single-byte alphanumeric characters */
    private java.lang.String name;

    /* First street address. 
     * Character length and limitations: 300 single-byte alphanumeric characters */
    private java.lang.String street1;

    /* Second street address. 
     * Character length and limitations: 300 single-byte alphanumeric characters */
    private java.lang.String street2;

    /* Name of city. 
     * Character length and limitations: 120 single-byte alphanumeric characters */
    private java.lang.String cityName;

    /* State or province. 
     * Character length and limitations: 120 single-byte alphanumeric characters
     * 
     * 						
     * 			For Canada and the USA, StateOrProvince must be the standard 2-character
     * abbreviation of a state or province. */
    private java.lang.String stateOrProvince;

    /* ISO 3166 standard country code
     * 			Character limit: Two single-byte characters. */
    private eBLBaseComponents.apis.ebay.CountryCodeType country;

    /* IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     * 					
     * 						
     * 			           This element should only be used in response elements
     * and typically
     * 			           should not be used in creating request messages which
     * specify the 
     * 			           name of a country using the Country element (which refers
     * to a
     * 			           2-letter country code). */
    private java.lang.String countryName;

    /* Telephone number associated with this address */
    private java.lang.String phone;

    private java.lang.String postalCode;

    /* IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile,
     * or UpdateRecurringPaymentsProfile. */
    private java.lang.String addressID;

    /* IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile. */
    private eBLBaseComponents.apis.ebay.AddressOwnerCodeType addressOwner;

    /* IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile. */
    private java.lang.String externalAddressID;

    /* IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     * 
     * 						
     * 			           Only applicable to SellerPaymentAddress today. Seller's
     * international name that is associated with the payment address. */
    private java.lang.String internationalName;

    /* IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     * 
     * 						
     * Only applicable to SellerPaymentAddress today. International state
     * and city for the seller's payment address. */
    private java.lang.String internationalStateAndCity;

    /* IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     * 
     * 						
     * Only applicable to SellerPaymentAddress today. Seller's international
     * street address that is associated with the payment address. */
    private java.lang.String internationalStreet;

    /* Status of the address on file with PayPal.
     * 
     * 														IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile. */
    private eBLBaseComponents.apis.ebay.AddressStatusCodeType addressStatus;

    /* Returns Normalization Status of the Address. Possible values
     * are Normalized, Unnormalized, and None. */
    private eBLBaseComponents.apis.ebay.AddressNormalizationStatusCodeType addressNormalizationStatus;

    public AddressType() {
    }

    public AddressType(
           java.lang.String name,
           java.lang.String street1,
           java.lang.String street2,
           java.lang.String cityName,
           java.lang.String stateOrProvince,
           eBLBaseComponents.apis.ebay.CountryCodeType country,
           java.lang.String countryName,
           java.lang.String phone,
           java.lang.String postalCode,
           java.lang.String addressID,
           eBLBaseComponents.apis.ebay.AddressOwnerCodeType addressOwner,
           java.lang.String externalAddressID,
           java.lang.String internationalName,
           java.lang.String internationalStateAndCity,
           java.lang.String internationalStreet,
           eBLBaseComponents.apis.ebay.AddressStatusCodeType addressStatus,
           eBLBaseComponents.apis.ebay.AddressNormalizationStatusCodeType addressNormalizationStatus) {
           this.name = name;
           this.street1 = street1;
           this.street2 = street2;
           this.cityName = cityName;
           this.stateOrProvince = stateOrProvince;
           this.country = country;
           this.countryName = countryName;
           this.phone = phone;
           this.postalCode = postalCode;
           this.addressID = addressID;
           this.addressOwner = addressOwner;
           this.externalAddressID = externalAddressID;
           this.internationalName = internationalName;
           this.internationalStateAndCity = internationalStateAndCity;
           this.internationalStreet = internationalStreet;
           this.addressStatus = addressStatus;
           this.addressNormalizationStatus = addressNormalizationStatus;
    }


    /**
     * Gets the name value for this AddressType.
     * 
     * @return name   * Person's name associated with this address. 
     * Character length and limitations: 32 single-byte alphanumeric characters
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AddressType.
     * 
     * @param name   * Person's name associated with this address. 
     * Character length and limitations: 32 single-byte alphanumeric characters
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the street1 value for this AddressType.
     * 
     * @return street1   * First street address. 
     * Character length and limitations: 300 single-byte alphanumeric characters
     */
    public java.lang.String getStreet1() {
        return street1;
    }


    /**
     * Sets the street1 value for this AddressType.
     * 
     * @param street1   * First street address. 
     * Character length and limitations: 300 single-byte alphanumeric characters
     */
    public void setStreet1(java.lang.String street1) {
        this.street1 = street1;
    }


    /**
     * Gets the street2 value for this AddressType.
     * 
     * @return street2   * Second street address. 
     * Character length and limitations: 300 single-byte alphanumeric characters
     */
    public java.lang.String getStreet2() {
        return street2;
    }


    /**
     * Sets the street2 value for this AddressType.
     * 
     * @param street2   * Second street address. 
     * Character length and limitations: 300 single-byte alphanumeric characters
     */
    public void setStreet2(java.lang.String street2) {
        this.street2 = street2;
    }


    /**
     * Gets the cityName value for this AddressType.
     * 
     * @return cityName   * Name of city. 
     * Character length and limitations: 120 single-byte alphanumeric characters
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this AddressType.
     * 
     * @param cityName   * Name of city. 
     * Character length and limitations: 120 single-byte alphanumeric characters
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the stateOrProvince value for this AddressType.
     * 
     * @return stateOrProvince   * State or province. 
     * Character length and limitations: 120 single-byte alphanumeric characters
     * 
     * 						
     * 			For Canada and the USA, StateOrProvince must be the standard 2-character
     * abbreviation of a state or province.
     */
    public java.lang.String getStateOrProvince() {
        return stateOrProvince;
    }


    /**
     * Sets the stateOrProvince value for this AddressType.
     * 
     * @param stateOrProvince   * State or province. 
     * Character length and limitations: 120 single-byte alphanumeric characters
     * 
     * 						
     * 			For Canada and the USA, StateOrProvince must be the standard 2-character
     * abbreviation of a state or province.
     */
    public void setStateOrProvince(java.lang.String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }


    /**
     * Gets the country value for this AddressType.
     * 
     * @return country   * ISO 3166 standard country code
     * 			Character limit: Two single-byte characters.
     */
    public eBLBaseComponents.apis.ebay.CountryCodeType getCountry() {
        return country;
    }


    /**
     * Sets the country value for this AddressType.
     * 
     * @param country   * ISO 3166 standard country code
     * 			Character limit: Two single-byte characters.
     */
    public void setCountry(eBLBaseComponents.apis.ebay.CountryCodeType country) {
        this.country = country;
    }


    /**
     * Gets the countryName value for this AddressType.
     * 
     * @return countryName   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     * 					
     * 						
     * 			           This element should only be used in response elements
     * and typically
     * 			           should not be used in creating request messages which
     * specify the 
     * 			           name of a country using the Country element (which refers
     * to a
     * 			           2-letter country code).
     */
    public java.lang.String getCountryName() {
        return countryName;
    }


    /**
     * Sets the countryName value for this AddressType.
     * 
     * @param countryName   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     * 					
     * 						
     * 			           This element should only be used in response elements
     * and typically
     * 			           should not be used in creating request messages which
     * specify the 
     * 			           name of a country using the Country element (which refers
     * to a
     * 			           2-letter country code).
     */
    public void setCountryName(java.lang.String countryName) {
        this.countryName = countryName;
    }


    /**
     * Gets the phone value for this AddressType.
     * 
     * @return phone   * Telephone number associated with this address
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this AddressType.
     * 
     * @param phone   * Telephone number associated with this address
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the postalCode value for this AddressType.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this AddressType.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the addressID value for this AddressType.
     * 
     * @return addressID   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile,
     * or UpdateRecurringPaymentsProfile.
     */
    public java.lang.String getAddressID() {
        return addressID;
    }


    /**
     * Sets the addressID value for this AddressType.
     * 
     * @param addressID   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile,
     * or UpdateRecurringPaymentsProfile.
     */
    public void setAddressID(java.lang.String addressID) {
        this.addressID = addressID;
    }


    /**
     * Gets the addressOwner value for this AddressType.
     * 
     * @return addressOwner   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     */
    public eBLBaseComponents.apis.ebay.AddressOwnerCodeType getAddressOwner() {
        return addressOwner;
    }


    /**
     * Sets the addressOwner value for this AddressType.
     * 
     * @param addressOwner   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     */
    public void setAddressOwner(eBLBaseComponents.apis.ebay.AddressOwnerCodeType addressOwner) {
        this.addressOwner = addressOwner;
    }


    /**
     * Gets the externalAddressID value for this AddressType.
     * 
     * @return externalAddressID   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     */
    public java.lang.String getExternalAddressID() {
        return externalAddressID;
    }


    /**
     * Sets the externalAddressID value for this AddressType.
     * 
     * @param externalAddressID   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     */
    public void setExternalAddressID(java.lang.String externalAddressID) {
        this.externalAddressID = externalAddressID;
    }


    /**
     * Gets the internationalName value for this AddressType.
     * 
     * @return internationalName   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     * 
     * 						
     * 			           Only applicable to SellerPaymentAddress today. Seller's
     * international name that is associated with the payment address.
     */
    public java.lang.String getInternationalName() {
        return internationalName;
    }


    /**
     * Sets the internationalName value for this AddressType.
     * 
     * @param internationalName   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     * 
     * 						
     * 			           Only applicable to SellerPaymentAddress today. Seller's
     * international name that is associated with the payment address.
     */
    public void setInternationalName(java.lang.String internationalName) {
        this.internationalName = internationalName;
    }


    /**
     * Gets the internationalStateAndCity value for this AddressType.
     * 
     * @return internationalStateAndCity   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     * 
     * 						
     * Only applicable to SellerPaymentAddress today. International state
     * and city for the seller's payment address.
     */
    public java.lang.String getInternationalStateAndCity() {
        return internationalStateAndCity;
    }


    /**
     * Sets the internationalStateAndCity value for this AddressType.
     * 
     * @param internationalStateAndCity   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     * 
     * 						
     * Only applicable to SellerPaymentAddress today. International state
     * and city for the seller's payment address.
     */
    public void setInternationalStateAndCity(java.lang.String internationalStateAndCity) {
        this.internationalStateAndCity = internationalStateAndCity;
    }


    /**
     * Gets the internationalStreet value for this AddressType.
     * 
     * @return internationalStreet   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     * 
     * 						
     * Only applicable to SellerPaymentAddress today. Seller's international
     * street address that is associated with the payment address.
     */
    public java.lang.String getInternationalStreet() {
        return internationalStreet;
    }


    /**
     * Sets the internationalStreet value for this AddressType.
     * 
     * @param internationalStreet   * IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     * 
     * 						
     * Only applicable to SellerPaymentAddress today. Seller's international
     * street address that is associated with the payment address.
     */
    public void setInternationalStreet(java.lang.String internationalStreet) {
        this.internationalStreet = internationalStreet;
    }


    /**
     * Gets the addressStatus value for this AddressType.
     * 
     * @return addressStatus   * Status of the address on file with PayPal.
     * 
     * 														IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     */
    public eBLBaseComponents.apis.ebay.AddressStatusCodeType getAddressStatus() {
        return addressStatus;
    }


    /**
     * Sets the addressStatus value for this AddressType.
     * 
     * @param addressStatus   * Status of the address on file with PayPal.
     * 
     * 														IMPORTANT: Do not set this element for SetExpressCheckout,
     * DoExpressCheckoutPayment, DoDirectPayment, CreateRecurringPaymentsProfile
     * or UpdateRecurringPaymentsProfile.
     */
    public void setAddressStatus(eBLBaseComponents.apis.ebay.AddressStatusCodeType addressStatus) {
        this.addressStatus = addressStatus;
    }


    /**
     * Gets the addressNormalizationStatus value for this AddressType.
     * 
     * @return addressNormalizationStatus   * Returns Normalization Status of the Address. Possible values
     * are Normalized, Unnormalized, and None.
     */
    public eBLBaseComponents.apis.ebay.AddressNormalizationStatusCodeType getAddressNormalizationStatus() {
        return addressNormalizationStatus;
    }


    /**
     * Sets the addressNormalizationStatus value for this AddressType.
     * 
     * @param addressNormalizationStatus   * Returns Normalization Status of the Address. Possible values
     * are Normalized, Unnormalized, and None.
     */
    public void setAddressNormalizationStatus(eBLBaseComponents.apis.ebay.AddressNormalizationStatusCodeType addressNormalizationStatus) {
        this.addressNormalizationStatus = addressNormalizationStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressType)) return false;
        AddressType other = (AddressType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.street1==null && other.getStreet1()==null) || 
             (this.street1!=null &&
              this.street1.equals(other.getStreet1()))) &&
            ((this.street2==null && other.getStreet2()==null) || 
             (this.street2!=null &&
              this.street2.equals(other.getStreet2()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.stateOrProvince==null && other.getStateOrProvince()==null) || 
             (this.stateOrProvince!=null &&
              this.stateOrProvince.equals(other.getStateOrProvince()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.countryName==null && other.getCountryName()==null) || 
             (this.countryName!=null &&
              this.countryName.equals(other.getCountryName()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.addressID==null && other.getAddressID()==null) || 
             (this.addressID!=null &&
              this.addressID.equals(other.getAddressID()))) &&
            ((this.addressOwner==null && other.getAddressOwner()==null) || 
             (this.addressOwner!=null &&
              this.addressOwner.equals(other.getAddressOwner()))) &&
            ((this.externalAddressID==null && other.getExternalAddressID()==null) || 
             (this.externalAddressID!=null &&
              this.externalAddressID.equals(other.getExternalAddressID()))) &&
            ((this.internationalName==null && other.getInternationalName()==null) || 
             (this.internationalName!=null &&
              this.internationalName.equals(other.getInternationalName()))) &&
            ((this.internationalStateAndCity==null && other.getInternationalStateAndCity()==null) || 
             (this.internationalStateAndCity!=null &&
              this.internationalStateAndCity.equals(other.getInternationalStateAndCity()))) &&
            ((this.internationalStreet==null && other.getInternationalStreet()==null) || 
             (this.internationalStreet!=null &&
              this.internationalStreet.equals(other.getInternationalStreet()))) &&
            ((this.addressStatus==null && other.getAddressStatus()==null) || 
             (this.addressStatus!=null &&
              this.addressStatus.equals(other.getAddressStatus()))) &&
            ((this.addressNormalizationStatus==null && other.getAddressNormalizationStatus()==null) || 
             (this.addressNormalizationStatus!=null &&
              this.addressNormalizationStatus.equals(other.getAddressNormalizationStatus())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStreet1() != null) {
            _hashCode += getStreet1().hashCode();
        }
        if (getStreet2() != null) {
            _hashCode += getStreet2().hashCode();
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getStateOrProvince() != null) {
            _hashCode += getStateOrProvince().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCountryName() != null) {
            _hashCode += getCountryName().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getAddressID() != null) {
            _hashCode += getAddressID().hashCode();
        }
        if (getAddressOwner() != null) {
            _hashCode += getAddressOwner().hashCode();
        }
        if (getExternalAddressID() != null) {
            _hashCode += getExternalAddressID().hashCode();
        }
        if (getInternationalName() != null) {
            _hashCode += getInternationalName().hashCode();
        }
        if (getInternationalStateAndCity() != null) {
            _hashCode += getInternationalStateAndCity().hashCode();
        }
        if (getInternationalStreet() != null) {
            _hashCode += getInternationalStreet().hashCode();
        }
        if (getAddressStatus() != null) {
            _hashCode += getAddressStatus().hashCode();
        }
        if (getAddressNormalizationStatus() != null) {
            _hashCode += getAddressNormalizationStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Street1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Street2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateOrProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StateOrProvince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CountryCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CountryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressOwnerCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalAddressID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalAddressID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InternationalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalStateAndCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InternationalStateAndCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InternationalStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressStatusCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNormalizationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressNormalizationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressNormalizationStatusCodeType"));
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
