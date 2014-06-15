/**
 * SiteHostedPictureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class SiteHostedPictureType  implements java.io.Serializable {
    /* URLs for item picture that are stored/hosted at eBay site. */
    private org.apache.axis.types.URI[] pictureURL;

    /* Type of display for photos used for PhotoHosting slide show.
     * 
     * 			                   Here are display options:
     *     							None = No special Picture Services features.
     *     							SlideShow = Slideshow of multiple pictures.
     *     							SuperSize = Super-size format picture.
     *     							PicturePack = Picture Pack.
     *     				             		Default is 'None'. */
    private eBLBaseComponents.apis.ebay.PhotoDisplayCodeType photoDisplay;

    /* This will be either "Featured" or "Gallery". */
    private eBLBaseComponents.apis.ebay.GalleryTypeCodeType galleryType;

    public SiteHostedPictureType() {
    }

    public SiteHostedPictureType(
           org.apache.axis.types.URI[] pictureURL,
           eBLBaseComponents.apis.ebay.PhotoDisplayCodeType photoDisplay,
           eBLBaseComponents.apis.ebay.GalleryTypeCodeType galleryType) {
           this.pictureURL = pictureURL;
           this.photoDisplay = photoDisplay;
           this.galleryType = galleryType;
    }


    /**
     * Gets the pictureURL value for this SiteHostedPictureType.
     * 
     * @return pictureURL   * URLs for item picture that are stored/hosted at eBay site.
     */
    public org.apache.axis.types.URI[] getPictureURL() {
        return pictureURL;
    }


    /**
     * Sets the pictureURL value for this SiteHostedPictureType.
     * 
     * @param pictureURL   * URLs for item picture that are stored/hosted at eBay site.
     */
    public void setPictureURL(org.apache.axis.types.URI[] pictureURL) {
        this.pictureURL = pictureURL;
    }

    public org.apache.axis.types.URI getPictureURL(int i) {
        return this.pictureURL[i];
    }

    public void setPictureURL(int i, org.apache.axis.types.URI _value) {
        this.pictureURL[i] = _value;
    }


    /**
     * Gets the photoDisplay value for this SiteHostedPictureType.
     * 
     * @return photoDisplay   * Type of display for photos used for PhotoHosting slide show.
     * 
     * 			                   Here are display options:
     *     							None = No special Picture Services features.
     *     							SlideShow = Slideshow of multiple pictures.
     *     							SuperSize = Super-size format picture.
     *     							PicturePack = Picture Pack.
     *     				             		Default is 'None'.
     */
    public eBLBaseComponents.apis.ebay.PhotoDisplayCodeType getPhotoDisplay() {
        return photoDisplay;
    }


    /**
     * Sets the photoDisplay value for this SiteHostedPictureType.
     * 
     * @param photoDisplay   * Type of display for photos used for PhotoHosting slide show.
     * 
     * 			                   Here are display options:
     *     							None = No special Picture Services features.
     *     							SlideShow = Slideshow of multiple pictures.
     *     							SuperSize = Super-size format picture.
     *     							PicturePack = Picture Pack.
     *     				             		Default is 'None'.
     */
    public void setPhotoDisplay(eBLBaseComponents.apis.ebay.PhotoDisplayCodeType photoDisplay) {
        this.photoDisplay = photoDisplay;
    }


    /**
     * Gets the galleryType value for this SiteHostedPictureType.
     * 
     * @return galleryType   * This will be either "Featured" or "Gallery".
     */
    public eBLBaseComponents.apis.ebay.GalleryTypeCodeType getGalleryType() {
        return galleryType;
    }


    /**
     * Sets the galleryType value for this SiteHostedPictureType.
     * 
     * @param galleryType   * This will be either "Featured" or "Gallery".
     */
    public void setGalleryType(eBLBaseComponents.apis.ebay.GalleryTypeCodeType galleryType) {
        this.galleryType = galleryType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteHostedPictureType)) return false;
        SiteHostedPictureType other = (SiteHostedPictureType) obj;
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
              java.util.Arrays.equals(this.pictureURL, other.getPictureURL()))) &&
            ((this.photoDisplay==null && other.getPhotoDisplay()==null) || 
             (this.photoDisplay!=null &&
              this.photoDisplay.equals(other.getPhotoDisplay()))) &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPictureURL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPictureURL(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhotoDisplay() != null) {
            _hashCode += getPhotoDisplay().hashCode();
        }
        if (getGalleryType() != null) {
            _hashCode += getGalleryType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteHostedPictureType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SiteHostedPictureType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pictureURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PictureURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photoDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PhotoDisplay"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PhotoDisplayCodeType"));
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
