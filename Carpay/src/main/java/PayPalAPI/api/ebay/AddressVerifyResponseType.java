/**
 * AddressVerifyResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class AddressVerifyResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    /* Confirmation of a match, with one of the following tokens:
     * 							
     * 										
     * None: The input value of the Email object does not match any email
     * address on file at PayPal.
     * 	
     * 										
     * Confirmed: If the value of the StreetMatch object is Matched, PayPal
     * responds that the entire postal address is confirmed.
     * 	
     * 										
     * Unconfirmed: PayPal responds that the postal address is unconfirmed */
    private eBLBaseComponents.apis.ebay.AddressStatusCodeType confirmationCode;

    /* PayPal has compared the postal address you want to verify with
     * the postal address on file at PayPal.
     * 								
     * 										
     * 								None: The input value of the Email object does not match any
     * email address on file at PayPal. In addition, an error response is
     * returned. No further comparison of other input values has been made.
     * 									
     * 										
     * Matched: The street address matches the street address on file at
     * PayPal.
     * 	
     * 										
     * Unmatched: The street address does not match the street address on
     * file at PayPal. */
    private eBLBaseComponents.apis.ebay.MatchStatusCodeType streetMatch;

    /* PayPal has compared the zip code you want to verify with the
     * zip code on file for the email address. 
     * 								
     * 										
     * 								None: The street address was unmatched. No further comparison
     * of other input values has been made.
     * 																
     * 										Matched: The zip code matches the zip code on file at PayPal.
     * 																								
     * 										Unmatched: The zip code does not match the zip code on file
     * at PayPal. */
    private eBLBaseComponents.apis.ebay.MatchStatusCodeType zipMatch;

    /* Two-character country code (ISO 3166) on file for the PayPal
     * email address. */
    private eBLBaseComponents.apis.ebay.CountryCodeType countryCode;

    /* The token prevents a buyer from using any street address other
     * than the address on file at PayPal during additional purchases he
     * might make from the merchant. It contains encrypted information about
     * the user’s street address and email address. You can pass the value
     * of the token with the Buy Now button HTML address_api_token variable
     * so that PayPal prevents the buyer from using any street address or
     * email address other than those verified by PayPal. The token is valid
     * for 24 hours. 
     * 								
     * Character length and limitations: 94 single-byte characters */
    private java.lang.String payPalToken;

    public AddressVerifyResponseType() {
    }

    public AddressVerifyResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.AddressStatusCodeType confirmationCode,
           eBLBaseComponents.apis.ebay.MatchStatusCodeType streetMatch,
           eBLBaseComponents.apis.ebay.MatchStatusCodeType zipMatch,
           eBLBaseComponents.apis.ebay.CountryCodeType countryCode,
           java.lang.String payPalToken) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.confirmationCode = confirmationCode;
        this.streetMatch = streetMatch;
        this.zipMatch = zipMatch;
        this.countryCode = countryCode;
        this.payPalToken = payPalToken;
    }


    /**
     * Gets the confirmationCode value for this AddressVerifyResponseType.
     * 
     * @return confirmationCode   * Confirmation of a match, with one of the following tokens:
     * 							
     * 										
     * None: The input value of the Email object does not match any email
     * address on file at PayPal.
     * 	
     * 										
     * Confirmed: If the value of the StreetMatch object is Matched, PayPal
     * responds that the entire postal address is confirmed.
     * 	
     * 										
     * Unconfirmed: PayPal responds that the postal address is unconfirmed
     */
    public eBLBaseComponents.apis.ebay.AddressStatusCodeType getConfirmationCode() {
        return confirmationCode;
    }


    /**
     * Sets the confirmationCode value for this AddressVerifyResponseType.
     * 
     * @param confirmationCode   * Confirmation of a match, with one of the following tokens:
     * 							
     * 										
     * None: The input value of the Email object does not match any email
     * address on file at PayPal.
     * 	
     * 										
     * Confirmed: If the value of the StreetMatch object is Matched, PayPal
     * responds that the entire postal address is confirmed.
     * 	
     * 										
     * Unconfirmed: PayPal responds that the postal address is unconfirmed
     */
    public void setConfirmationCode(eBLBaseComponents.apis.ebay.AddressStatusCodeType confirmationCode) {
        this.confirmationCode = confirmationCode;
    }


    /**
     * Gets the streetMatch value for this AddressVerifyResponseType.
     * 
     * @return streetMatch   * PayPal has compared the postal address you want to verify with
     * the postal address on file at PayPal.
     * 								
     * 										
     * 								None: The input value of the Email object does not match any
     * email address on file at PayPal. In addition, an error response is
     * returned. No further comparison of other input values has been made.
     * 									
     * 										
     * Matched: The street address matches the street address on file at
     * PayPal.
     * 	
     * 										
     * Unmatched: The street address does not match the street address on
     * file at PayPal.
     */
    public eBLBaseComponents.apis.ebay.MatchStatusCodeType getStreetMatch() {
        return streetMatch;
    }


    /**
     * Sets the streetMatch value for this AddressVerifyResponseType.
     * 
     * @param streetMatch   * PayPal has compared the postal address you want to verify with
     * the postal address on file at PayPal.
     * 								
     * 										
     * 								None: The input value of the Email object does not match any
     * email address on file at PayPal. In addition, an error response is
     * returned. No further comparison of other input values has been made.
     * 									
     * 										
     * Matched: The street address matches the street address on file at
     * PayPal.
     * 	
     * 										
     * Unmatched: The street address does not match the street address on
     * file at PayPal.
     */
    public void setStreetMatch(eBLBaseComponents.apis.ebay.MatchStatusCodeType streetMatch) {
        this.streetMatch = streetMatch;
    }


    /**
     * Gets the zipMatch value for this AddressVerifyResponseType.
     * 
     * @return zipMatch   * PayPal has compared the zip code you want to verify with the
     * zip code on file for the email address. 
     * 								
     * 										
     * 								None: The street address was unmatched. No further comparison
     * of other input values has been made.
     * 																
     * 										Matched: The zip code matches the zip code on file at PayPal.
     * 																								
     * 										Unmatched: The zip code does not match the zip code on file
     * at PayPal.
     */
    public eBLBaseComponents.apis.ebay.MatchStatusCodeType getZipMatch() {
        return zipMatch;
    }


    /**
     * Sets the zipMatch value for this AddressVerifyResponseType.
     * 
     * @param zipMatch   * PayPal has compared the zip code you want to verify with the
     * zip code on file for the email address. 
     * 								
     * 										
     * 								None: The street address was unmatched. No further comparison
     * of other input values has been made.
     * 																
     * 										Matched: The zip code matches the zip code on file at PayPal.
     * 																								
     * 										Unmatched: The zip code does not match the zip code on file
     * at PayPal.
     */
    public void setZipMatch(eBLBaseComponents.apis.ebay.MatchStatusCodeType zipMatch) {
        this.zipMatch = zipMatch;
    }


    /**
     * Gets the countryCode value for this AddressVerifyResponseType.
     * 
     * @return countryCode   * Two-character country code (ISO 3166) on file for the PayPal
     * email address.
     */
    public eBLBaseComponents.apis.ebay.CountryCodeType getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this AddressVerifyResponseType.
     * 
     * @param countryCode   * Two-character country code (ISO 3166) on file for the PayPal
     * email address.
     */
    public void setCountryCode(eBLBaseComponents.apis.ebay.CountryCodeType countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the payPalToken value for this AddressVerifyResponseType.
     * 
     * @return payPalToken   * The token prevents a buyer from using any street address other
     * than the address on file at PayPal during additional purchases he
     * might make from the merchant. It contains encrypted information about
     * the user’s street address and email address. You can pass the value
     * of the token with the Buy Now button HTML address_api_token variable
     * so that PayPal prevents the buyer from using any street address or
     * email address other than those verified by PayPal. The token is valid
     * for 24 hours. 
     * 								
     * Character length and limitations: 94 single-byte characters
     */
    public java.lang.String getPayPalToken() {
        return payPalToken;
    }


    /**
     * Sets the payPalToken value for this AddressVerifyResponseType.
     * 
     * @param payPalToken   * The token prevents a buyer from using any street address other
     * than the address on file at PayPal during additional purchases he
     * might make from the merchant. It contains encrypted information about
     * the user’s street address and email address. You can pass the value
     * of the token with the Buy Now button HTML address_api_token variable
     * so that PayPal prevents the buyer from using any street address or
     * email address other than those verified by PayPal. The token is valid
     * for 24 hours. 
     * 								
     * Character length and limitations: 94 single-byte characters
     */
    public void setPayPalToken(java.lang.String payPalToken) {
        this.payPalToken = payPalToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressVerifyResponseType)) return false;
        AddressVerifyResponseType other = (AddressVerifyResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.confirmationCode==null && other.getConfirmationCode()==null) || 
             (this.confirmationCode!=null &&
              this.confirmationCode.equals(other.getConfirmationCode()))) &&
            ((this.streetMatch==null && other.getStreetMatch()==null) || 
             (this.streetMatch!=null &&
              this.streetMatch.equals(other.getStreetMatch()))) &&
            ((this.zipMatch==null && other.getZipMatch()==null) || 
             (this.zipMatch!=null &&
              this.zipMatch.equals(other.getZipMatch()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.payPalToken==null && other.getPayPalToken()==null) || 
             (this.payPalToken!=null &&
              this.payPalToken.equals(other.getPayPalToken())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getConfirmationCode() != null) {
            _hashCode += getConfirmationCode().hashCode();
        }
        if (getStreetMatch() != null) {
            _hashCode += getStreetMatch().hashCode();
        }
        if (getZipMatch() != null) {
            _hashCode += getZipMatch().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getPayPalToken() != null) {
            _hashCode += getPayPalToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressVerifyResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "AddressVerifyResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ConfirmationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressStatusCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "StreetMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MatchStatusCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ZipMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MatchStatusCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CountryCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "PayPalToken"));
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
