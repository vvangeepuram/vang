/**
 * VendorHostedPictureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class VendorHostedPictureType  implements java.io.Serializable {
    /* URLs for item picture that are stored/hosted at eBay site. */
    private org.apache.axis.types.URI pictureURL;

    /* URL for a picture for the gallery. If the GalleryFeatured 
     * 			             		argument is true, a value must be supplied for either
     * 
     * 			             		the GalleryURL or the PictureURL argument. 
     * 						In either case:
     * 							(a) If a URL is provided for only PictureURL, it is used 
     * 							as the Gallery thumbnail. 
     * 							(b) If a URL is provided for both GalleryURL and 
     * 							PictureURL, then the picture indicated in GalleryURL 
     * 							is used as the thumbnail. 
     * 						The image used for the Gallery thumbnail (specified 
     * 						in the GalleryURL or PictureURL argument) must be 
     * 						in one of the graphics formats JPEG, BMP, TIF, or GIF. */
    private org.apache.axis.types.URI galleryURL;

    /* This will be either "Featured" or "Gallery". */
    private eBLBaseComponents.apis.ebay.GalleryTypeCodeType galleryType;

    public VendorHostedPictureType() {
    }

    public VendorHostedPictureType(
           org.apache.axis.types.URI pictureURL,
           org.apache.axis.types.URI galleryURL,
           eBLBaseComponents.apis.ebay.GalleryTypeCodeType galleryType) {
           this.pictureURL = pictureURL;
           this.galleryURL = galleryURL;
           this.galleryType = galleryType;
    }


    /**
     * Gets the pictureURL value for this VendorHostedPictureType.
     * 
     * @return pictureURL   * URLs for item picture that are stored/hosted at eBay site.
     */
    public org.apache.axis.types.URI getPictureURL() {
        return pictureURL;
    }


    /**
     * Sets the pictureURL value for this VendorHostedPictureType.
     * 
     * @param pictureURL   * URLs for item picture that are stored/hosted at eBay site.
     */
    public void setPictureURL(org.apache.axis.types.URI pictureURL) {
        this.pictureURL = pictureURL;
    }


    /**
     * Gets the galleryURL value for this VendorHostedPictureType.
     * 
     * @return galleryURL   * URL for a picture for the gallery. If the GalleryFeatured 
     * 			             		argument is true, a value must be supplied for either
     * 
     * 			             		the GalleryURL or the PictureURL argument. 
     * 						In either case:
     * 							(a) If a URL is provided for only PictureURL, it is used 
     * 							as the Gallery thumbnail. 
     * 							(b) If a URL is provided for both GalleryURL and 
     * 							PictureURL, then the picture indicated in GalleryURL 
     * 							is used as the thumbnail. 
     * 						The image used for the Gallery thumbnail (specified 
     * 						in the GalleryURL or PictureURL argument) must be 
     * 						in one of the graphics formats JPEG, BMP, TIF, or GIF.
     */
    public org.apache.axis.types.URI getGalleryURL() {
        return galleryURL;
    }


    /**
     * Sets the galleryURL value for this VendorHostedPictureType.
     * 
     * @param galleryURL   * URL for a picture for the gallery. If the GalleryFeatured 
     * 			             		argument is true, a value must be supplied for either
     * 
     * 			             		the GalleryURL or the PictureURL argument. 
     * 						In either case:
     * 							(a) If a URL is provided for only PictureURL, it is used 
     * 							as the Gallery thumbnail. 
     * 							(b) If a URL is provided for both GalleryURL and 
     * 							PictureURL, then the picture indicated in GalleryURL 
     * 							is used as the thumbnail. 
     * 						The image used for the Gallery thumbnail (specified 
     * 						in the GalleryURL or PictureURL argument) must be 
     * 						in one of the graphics formats JPEG, BMP, TIF, or GIF.
     */
    public void setGalleryURL(org.apache.axis.types.URI galleryURL) {
        this.galleryURL = galleryURL;
    }


    /**
     * Gets the galleryType value for this VendorHostedPictureType.
     * 
     * @return galleryType   * This will be either "Featured" or "Gallery".
     */
    public eBLBaseComponents.apis.ebay.GalleryTypeCodeType getGalleryType() {
        return galleryType;
    }


    /**
     * Sets the galleryType value for this VendorHostedPictureType.
     * 
     * @param galleryType   * This will be either "Featured" or "Gallery".
     */
    public void setGalleryType(eBLBaseComponents.apis.ebay.GalleryTypeCodeType galleryType) {
        this.galleryType = galleryType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorHostedPictureType)) return false;
        VendorHostedPictureType other = (VendorHostedPictureType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pictureURL==null && other.getPictureURL()==null) || 
             (this.pictureURL!=null &&
              this.pictureURL.equals(other.getPictureURL()))) &&
            ((this.galleryURL==null && other.getGalleryURL()==null) || 
             (this.galleryURL!=null &&
              this.galleryURL.equals(other.getGalleryURL()))) &&
            ((this.galleryType==null && other.getGalleryType()==null) || 
             (this.galleryType!=null &&
              this.galleryType.equals(other.getGalleryType())));
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
        if (getPictureURL() != null) {
            _hashCode += getPictureURL().hashCode();
        }
        if (getGalleryURL() != null) {
            _hashCode += getGalleryURL().hashCode();
        }
        if (getGalleryType() != null) {
            _hashCode += getGalleryType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorHostedPictureType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VendorHostedPictureType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pictureURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PictureURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("galleryURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GalleryURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("galleryType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GalleryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GalleryTypeCodeType"));
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
