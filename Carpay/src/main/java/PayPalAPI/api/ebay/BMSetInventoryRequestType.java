/**
 * BMSetInventoryRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BMSetInventoryRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* Hosted Button ID of button you wish to change.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 10 single-byte numeric characters */
    private java.lang.String hostedButtonID;

    /* Is Inventory tracked.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				0 or 1 */
    private java.lang.String trackInv;

    /* Is PNL Tracked.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				0 or 1 */
    private java.lang.String trackPnl;

    private eBLBaseComponents.apis.ebay.ItemTrackingDetailsType itemTrackingDetails;

    /* Option Index.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 1 single-byte alphanumeric characters */
    private java.lang.String optionIndex;

    private eBLBaseComponents.apis.ebay.OptionTrackingDetailsType[] optionTrackingDetails;

    /* URL of page to display when an item is soldout.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String soldoutURL;

    /* Whether to use the same digital download key repeatedly. */
    private java.lang.String reuseDigitalDownloadKeys;

    /* Whether to append these keys to the list or not (replace). */
    private java.lang.String appendDigitalDownloadKeys;

    /* Zero or more digital download keys to distribute to customers
     * after transaction is completed.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 1000 single-byte alphanumeric
     * characters */
    private java.lang.String[] digitalDownloadKeys;

    public BMSetInventoryRequestType() {
    }

    public BMSetInventoryRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String hostedButtonID,
           java.lang.String trackInv,
           java.lang.String trackPnl,
           eBLBaseComponents.apis.ebay.ItemTrackingDetailsType itemTrackingDetails,
           java.lang.String optionIndex,
           eBLBaseComponents.apis.ebay.OptionTrackingDetailsType[] optionTrackingDetails,
           java.lang.String soldoutURL,
           java.lang.String reuseDigitalDownloadKeys,
           java.lang.String appendDigitalDownloadKeys,
           java.lang.String[] digitalDownloadKeys) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.hostedButtonID = hostedButtonID;
        this.trackInv = trackInv;
        this.trackPnl = trackPnl;
        this.itemTrackingDetails = itemTrackingDetails;
        this.optionIndex = optionIndex;
        this.optionTrackingDetails = optionTrackingDetails;
        this.soldoutURL = soldoutURL;
        this.reuseDigitalDownloadKeys = reuseDigitalDownloadKeys;
        this.appendDigitalDownloadKeys = appendDigitalDownloadKeys;
        this.digitalDownloadKeys = digitalDownloadKeys;
    }


    /**
     * Gets the hostedButtonID value for this BMSetInventoryRequestType.
     * 
     * @return hostedButtonID   * Hosted Button ID of button you wish to change.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 10 single-byte numeric characters
     */
    public java.lang.String getHostedButtonID() {
        return hostedButtonID;
    }


    /**
     * Sets the hostedButtonID value for this BMSetInventoryRequestType.
     * 
     * @param hostedButtonID   * Hosted Button ID of button you wish to change.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 10 single-byte numeric characters
     */
    public void setHostedButtonID(java.lang.String hostedButtonID) {
        this.hostedButtonID = hostedButtonID;
    }


    /**
     * Gets the trackInv value for this BMSetInventoryRequestType.
     * 
     * @return trackInv   * Is Inventory tracked.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				0 or 1
     */
    public java.lang.String getTrackInv() {
        return trackInv;
    }


    /**
     * Sets the trackInv value for this BMSetInventoryRequestType.
     * 
     * @param trackInv   * Is Inventory tracked.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				0 or 1
     */
    public void setTrackInv(java.lang.String trackInv) {
        this.trackInv = trackInv;
    }


    /**
     * Gets the trackPnl value for this BMSetInventoryRequestType.
     * 
     * @return trackPnl   * Is PNL Tracked.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				0 or 1
     */
    public java.lang.String getTrackPnl() {
        return trackPnl;
    }


    /**
     * Sets the trackPnl value for this BMSetInventoryRequestType.
     * 
     * @param trackPnl   * Is PNL Tracked.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				0 or 1
     */
    public void setTrackPnl(java.lang.String trackPnl) {
        this.trackPnl = trackPnl;
    }


    /**
     * Gets the itemTrackingDetails value for this BMSetInventoryRequestType.
     * 
     * @return itemTrackingDetails
     */
    public eBLBaseComponents.apis.ebay.ItemTrackingDetailsType getItemTrackingDetails() {
        return itemTrackingDetails;
    }


    /**
     * Sets the itemTrackingDetails value for this BMSetInventoryRequestType.
     * 
     * @param itemTrackingDetails
     */
    public void setItemTrackingDetails(eBLBaseComponents.apis.ebay.ItemTrackingDetailsType itemTrackingDetails) {
        this.itemTrackingDetails = itemTrackingDetails;
    }


    /**
     * Gets the optionIndex value for this BMSetInventoryRequestType.
     * 
     * @return optionIndex   * Option Index.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 1 single-byte alphanumeric characters
     */
    public java.lang.String getOptionIndex() {
        return optionIndex;
    }


    /**
     * Sets the optionIndex value for this BMSetInventoryRequestType.
     * 
     * @param optionIndex   * Option Index.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 1 single-byte alphanumeric characters
     */
    public void setOptionIndex(java.lang.String optionIndex) {
        this.optionIndex = optionIndex;
    }


    /**
     * Gets the optionTrackingDetails value for this BMSetInventoryRequestType.
     * 
     * @return optionTrackingDetails
     */
    public eBLBaseComponents.apis.ebay.OptionTrackingDetailsType[] getOptionTrackingDetails() {
        return optionTrackingDetails;
    }


    /**
     * Sets the optionTrackingDetails value for this BMSetInventoryRequestType.
     * 
     * @param optionTrackingDetails
     */
    public void setOptionTrackingDetails(eBLBaseComponents.apis.ebay.OptionTrackingDetailsType[] optionTrackingDetails) {
        this.optionTrackingDetails = optionTrackingDetails;
    }

    public eBLBaseComponents.apis.ebay.OptionTrackingDetailsType getOptionTrackingDetails(int i) {
        return this.optionTrackingDetails[i];
    }

    public void setOptionTrackingDetails(int i, eBLBaseComponents.apis.ebay.OptionTrackingDetailsType _value) {
        this.optionTrackingDetails[i] = _value;
    }


    /**
     * Gets the soldoutURL value for this BMSetInventoryRequestType.
     * 
     * @return soldoutURL   * URL of page to display when an item is soldout.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getSoldoutURL() {
        return soldoutURL;
    }


    /**
     * Sets the soldoutURL value for this BMSetInventoryRequestType.
     * 
     * @param soldoutURL   * URL of page to display when an item is soldout.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setSoldoutURL(java.lang.String soldoutURL) {
        this.soldoutURL = soldoutURL;
    }


    /**
     * Gets the reuseDigitalDownloadKeys value for this BMSetInventoryRequestType.
     * 
     * @return reuseDigitalDownloadKeys   * Whether to use the same digital download key repeatedly.
     */
    public java.lang.String getReuseDigitalDownloadKeys() {
        return reuseDigitalDownloadKeys;
    }


    /**
     * Sets the reuseDigitalDownloadKeys value for this BMSetInventoryRequestType.
     * 
     * @param reuseDigitalDownloadKeys   * Whether to use the same digital download key repeatedly.
     */
    public void setReuseDigitalDownloadKeys(java.lang.String reuseDigitalDownloadKeys) {
        this.reuseDigitalDownloadKeys = reuseDigitalDownloadKeys;
    }


    /**
     * Gets the appendDigitalDownloadKeys value for this BMSetInventoryRequestType.
     * 
     * @return appendDigitalDownloadKeys   * Whether to append these keys to the list or not (replace).
     */
    public java.lang.String getAppendDigitalDownloadKeys() {
        return appendDigitalDownloadKeys;
    }


    /**
     * Sets the appendDigitalDownloadKeys value for this BMSetInventoryRequestType.
     * 
     * @param appendDigitalDownloadKeys   * Whether to append these keys to the list or not (replace).
     */
    public void setAppendDigitalDownloadKeys(java.lang.String appendDigitalDownloadKeys) {
        this.appendDigitalDownloadKeys = appendDigitalDownloadKeys;
    }


    /**
     * Gets the digitalDownloadKeys value for this BMSetInventoryRequestType.
     * 
     * @return digitalDownloadKeys   * Zero or more digital download keys to distribute to customers
     * after transaction is completed.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 1000 single-byte alphanumeric
     * characters
     */
    public java.lang.String[] getDigitalDownloadKeys() {
        return digitalDownloadKeys;
    }


    /**
     * Sets the digitalDownloadKeys value for this BMSetInventoryRequestType.
     * 
     * @param digitalDownloadKeys   * Zero or more digital download keys to distribute to customers
     * after transaction is completed.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 				Character length and limitations: 1000 single-byte alphanumeric
     * characters
     */
    public void setDigitalDownloadKeys(java.lang.String[] digitalDownloadKeys) {
        this.digitalDownloadKeys = digitalDownloadKeys;
    }

    public java.lang.String getDigitalDownloadKeys(int i) {
        return this.digitalDownloadKeys[i];
    }

    public void setDigitalDownloadKeys(int i, java.lang.String _value) {
        this.digitalDownloadKeys[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BMSetInventoryRequestType)) return false;
        BMSetInventoryRequestType other = (BMSetInventoryRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostedButtonID==null && other.getHostedButtonID()==null) || 
             (this.hostedButtonID!=null &&
              this.hostedButtonID.equals(other.getHostedButtonID()))) &&
            ((this.trackInv==null && other.getTrackInv()==null) || 
             (this.trackInv!=null &&
              this.trackInv.equals(other.getTrackInv()))) &&
            ((this.trackPnl==null && other.getTrackPnl()==null) || 
             (this.trackPnl!=null &&
              this.trackPnl.equals(other.getTrackPnl()))) &&
            ((this.itemTrackingDetails==null && other.getItemTrackingDetails()==null) || 
             (this.itemTrackingDetails!=null &&
              this.itemTrackingDetails.equals(other.getItemTrackingDetails()))) &&
            ((this.optionIndex==null && other.getOptionIndex()==null) || 
             (this.optionIndex!=null &&
              this.optionIndex.equals(other.getOptionIndex()))) &&
            ((this.optionTrackingDetails==null && other.getOptionTrackingDetails()==null) || 
             (this.optionTrackingDetails!=null &&
              java.util.Arrays.equals(this.optionTrackingDetails, other.getOptionTrackingDetails()))) &&
            ((this.soldoutURL==null && other.getSoldoutURL()==null) || 
             (this.soldoutURL!=null &&
              this.soldoutURL.equals(other.getSoldoutURL()))) &&
            ((this.reuseDigitalDownloadKeys==null && other.getReuseDigitalDownloadKeys()==null) || 
             (this.reuseDigitalDownloadKeys!=null &&
              this.reuseDigitalDownloadKeys.equals(other.getReuseDigitalDownloadKeys()))) &&
            ((this.appendDigitalDownloadKeys==null && other.getAppendDigitalDownloadKeys()==null) || 
             (this.appendDigitalDownloadKeys!=null &&
              this.appendDigitalDownloadKeys.equals(other.getAppendDigitalDownloadKeys()))) &&
            ((this.digitalDownloadKeys==null && other.getDigitalDownloadKeys()==null) || 
             (this.digitalDownloadKeys!=null &&
              java.util.Arrays.equals(this.digitalDownloadKeys, other.getDigitalDownloadKeys())));
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
        if (getHostedButtonID() != null) {
            _hashCode += getHostedButtonID().hashCode();
        }
        if (getTrackInv() != null) {
            _hashCode += getTrackInv().hashCode();
        }
        if (getTrackPnl() != null) {
            _hashCode += getTrackPnl().hashCode();
        }
        if (getItemTrackingDetails() != null) {
            _hashCode += getItemTrackingDetails().hashCode();
        }
        if (getOptionIndex() != null) {
            _hashCode += getOptionIndex().hashCode();
        }
        if (getOptionTrackingDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptionTrackingDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptionTrackingDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSoldoutURL() != null) {
            _hashCode += getSoldoutURL().hashCode();
        }
        if (getReuseDigitalDownloadKeys() != null) {
            _hashCode += getReuseDigitalDownloadKeys().hashCode();
        }
        if (getAppendDigitalDownloadKeys() != null) {
            _hashCode += getAppendDigitalDownloadKeys().hashCode();
        }
        if (getDigitalDownloadKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDigitalDownloadKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDigitalDownloadKeys(), i);
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
        new org.apache.axis.description.TypeDesc(BMSetInventoryRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMSetInventoryRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostedButtonID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "HostedButtonID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackInv");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TrackInv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackPnl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TrackPnl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTrackingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemTrackingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemTrackingDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "OptionIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionTrackingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionTrackingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionTrackingDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldoutURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SoldoutURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reuseDigitalDownloadKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReuseDigitalDownloadKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appendDigitalDownloadKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "AppendDigitalDownloadKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitalDownloadKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DigitalDownloadKeys"));
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
