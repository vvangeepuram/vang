/**
 * UserType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class UserType  implements java.io.Serializable {
    private java.lang.Boolean aboutMePage;

    private java.lang.String EAISToken;

    private java.lang.String email;

    /* Feedback scores are a quantitative expression of the desirability
     * of dealing 
     * 			  		with that person as a Buyer or a Seller in auction transactions.
     * Each 
     * 			  		auction transaction can result in one feedback entry for a
     * given user 
     * 			  		(the Buyer can leave one feedback about the Seller and the
     * Seller can leave 
     * 			  		one feedback about the Buyer). That one feedback can be positive,
     * negative, 
     * 			  		or neutral. The aggregated feedback counts for a particular
     * user represent 
     * 			  		that user's overall feedback score (referred to as a "feedback
     * rating" on the 
     * 			  		eBay site). This rating is commonly expressed as the eBay Feedback
     * score
     * 			  		for the user. */
    private java.lang.Integer feedbackScore;

    private java.lang.Boolean feedbackPrivate;

    private eBLBaseComponents.apis.ebay.FeedbackRatingStarCodeType feedbackRatingStar;

    private java.lang.Boolean IDVerified;

    private java.lang.Boolean newUser;

    private eBLBaseComponents.apis.ebay.AddressType registrationAddress;

    private java.util.Calendar registrationDate;

    private eBLBaseComponents.apis.ebay.SiteCodeType site;

    private eBLBaseComponents.apis.ebay.UserStatusCodeType status;

    private java.lang.String userID;

    private java.lang.Boolean userIDChanged;

    private java.util.Calendar userIDLastChanged;

    /* If present, indicates whether or not the user is subject to
     * VAT. 
     * 			              Users who have registered with eBay as VAT-exempt
     * are not 
     * 			              subject to VAT. See Value-Added Tax (VAT). Not returned
     * for 
     * 			              users whose country of residence is outside the EU.
     * 
     * 			              Possible values for the user's status:
     *     						2 = Residence in an EU country but user registered as VAT-exempt
     * 						3 = Residence in an EU country and user not registered as VAT-exempt */
    private eBLBaseComponents.apis.ebay.VATStatusCodeType VATStatus;

    private eBLBaseComponents.apis.ebay.BuyerType buyerInfo;

    private eBLBaseComponents.apis.ebay.SellerType sellerInfo;

    public UserType() {
    }

    public UserType(
           java.lang.Boolean aboutMePage,
           java.lang.String EAISToken,
           java.lang.String email,
           java.lang.Integer feedbackScore,
           java.lang.Boolean feedbackPrivate,
           eBLBaseComponents.apis.ebay.FeedbackRatingStarCodeType feedbackRatingStar,
           java.lang.Boolean IDVerified,
           java.lang.Boolean newUser,
           eBLBaseComponents.apis.ebay.AddressType registrationAddress,
           java.util.Calendar registrationDate,
           eBLBaseComponents.apis.ebay.SiteCodeType site,
           eBLBaseComponents.apis.ebay.UserStatusCodeType status,
           java.lang.String userID,
           java.lang.Boolean userIDChanged,
           java.util.Calendar userIDLastChanged,
           eBLBaseComponents.apis.ebay.VATStatusCodeType VATStatus,
           eBLBaseComponents.apis.ebay.BuyerType buyerInfo,
           eBLBaseComponents.apis.ebay.SellerType sellerInfo) {
           this.aboutMePage = aboutMePage;
           this.EAISToken = EAISToken;
           this.email = email;
           this.feedbackScore = feedbackScore;
           this.feedbackPrivate = feedbackPrivate;
           this.feedbackRatingStar = feedbackRatingStar;
           this.IDVerified = IDVerified;
           this.newUser = newUser;
           this.registrationAddress = registrationAddress;
           this.registrationDate = registrationDate;
           this.site = site;
           this.status = status;
           this.userID = userID;
           this.userIDChanged = userIDChanged;
           this.userIDLastChanged = userIDLastChanged;
           this.VATStatus = VATStatus;
           this.buyerInfo = buyerInfo;
           this.sellerInfo = sellerInfo;
    }


    /**
     * Gets the aboutMePage value for this UserType.
     * 
     * @return aboutMePage
     */
    public java.lang.Boolean getAboutMePage() {
        return aboutMePage;
    }


    /**
     * Sets the aboutMePage value for this UserType.
     * 
     * @param aboutMePage
     */
    public void setAboutMePage(java.lang.Boolean aboutMePage) {
        this.aboutMePage = aboutMePage;
    }


    /**
     * Gets the EAISToken value for this UserType.
     * 
     * @return EAISToken
     */
    public java.lang.String getEAISToken() {
        return EAISToken;
    }


    /**
     * Sets the EAISToken value for this UserType.
     * 
     * @param EAISToken
     */
    public void setEAISToken(java.lang.String EAISToken) {
        this.EAISToken = EAISToken;
    }


    /**
     * Gets the email value for this UserType.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserType.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the feedbackScore value for this UserType.
     * 
     * @return feedbackScore   * Feedback scores are a quantitative expression of the desirability
     * of dealing 
     * 			  		with that person as a Buyer or a Seller in auction transactions.
     * Each 
     * 			  		auction transaction can result in one feedback entry for a
     * given user 
     * 			  		(the Buyer can leave one feedback about the Seller and the
     * Seller can leave 
     * 			  		one feedback about the Buyer). That one feedback can be positive,
     * negative, 
     * 			  		or neutral. The aggregated feedback counts for a particular
     * user represent 
     * 			  		that user's overall feedback score (referred to as a "feedback
     * rating" on the 
     * 			  		eBay site). This rating is commonly expressed as the eBay Feedback
     * score
     * 			  		for the user.
     */
    public java.lang.Integer getFeedbackScore() {
        return feedbackScore;
    }


    /**
     * Sets the feedbackScore value for this UserType.
     * 
     * @param feedbackScore   * Feedback scores are a quantitative expression of the desirability
     * of dealing 
     * 			  		with that person as a Buyer or a Seller in auction transactions.
     * Each 
     * 			  		auction transaction can result in one feedback entry for a
     * given user 
     * 			  		(the Buyer can leave one feedback about the Seller and the
     * Seller can leave 
     * 			  		one feedback about the Buyer). That one feedback can be positive,
     * negative, 
     * 			  		or neutral. The aggregated feedback counts for a particular
     * user represent 
     * 			  		that user's overall feedback score (referred to as a "feedback
     * rating" on the 
     * 			  		eBay site). This rating is commonly expressed as the eBay Feedback
     * score
     * 			  		for the user.
     */
    public void setFeedbackScore(java.lang.Integer feedbackScore) {
        this.feedbackScore = feedbackScore;
    }


    /**
     * Gets the feedbackPrivate value for this UserType.
     * 
     * @return feedbackPrivate
     */
    public java.lang.Boolean getFeedbackPrivate() {
        return feedbackPrivate;
    }


    /**
     * Sets the feedbackPrivate value for this UserType.
     * 
     * @param feedbackPrivate
     */
    public void setFeedbackPrivate(java.lang.Boolean feedbackPrivate) {
        this.feedbackPrivate = feedbackPrivate;
    }


    /**
     * Gets the feedbackRatingStar value for this UserType.
     * 
     * @return feedbackRatingStar
     */
    public eBLBaseComponents.apis.ebay.FeedbackRatingStarCodeType getFeedbackRatingStar() {
        return feedbackRatingStar;
    }


    /**
     * Sets the feedbackRatingStar value for this UserType.
     * 
     * @param feedbackRatingStar
     */
    public void setFeedbackRatingStar(eBLBaseComponents.apis.ebay.FeedbackRatingStarCodeType feedbackRatingStar) {
        this.feedbackRatingStar = feedbackRatingStar;
    }


    /**
     * Gets the IDVerified value for this UserType.
     * 
     * @return IDVerified
     */
    public java.lang.Boolean getIDVerified() {
        return IDVerified;
    }


    /**
     * Sets the IDVerified value for this UserType.
     * 
     * @param IDVerified
     */
    public void setIDVerified(java.lang.Boolean IDVerified) {
        this.IDVerified = IDVerified;
    }


    /**
     * Gets the newUser value for this UserType.
     * 
     * @return newUser
     */
    public java.lang.Boolean getNewUser() {
        return newUser;
    }


    /**
     * Sets the newUser value for this UserType.
     * 
     * @param newUser
     */
    public void setNewUser(java.lang.Boolean newUser) {
        this.newUser = newUser;
    }


    /**
     * Gets the registrationAddress value for this UserType.
     * 
     * @return registrationAddress
     */
    public eBLBaseComponents.apis.ebay.AddressType getRegistrationAddress() {
        return registrationAddress;
    }


    /**
     * Sets the registrationAddress value for this UserType.
     * 
     * @param registrationAddress
     */
    public void setRegistrationAddress(eBLBaseComponents.apis.ebay.AddressType registrationAddress) {
        this.registrationAddress = registrationAddress;
    }


    /**
     * Gets the registrationDate value for this UserType.
     * 
     * @return registrationDate
     */
    public java.util.Calendar getRegistrationDate() {
        return registrationDate;
    }


    /**
     * Sets the registrationDate value for this UserType.
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(java.util.Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }


    /**
     * Gets the site value for this UserType.
     * 
     * @return site
     */
    public eBLBaseComponents.apis.ebay.SiteCodeType getSite() {
        return site;
    }


    /**
     * Sets the site value for this UserType.
     * 
     * @param site
     */
    public void setSite(eBLBaseComponents.apis.ebay.SiteCodeType site) {
        this.site = site;
    }


    /**
     * Gets the status value for this UserType.
     * 
     * @return status
     */
    public eBLBaseComponents.apis.ebay.UserStatusCodeType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UserType.
     * 
     * @param status
     */
    public void setStatus(eBLBaseComponents.apis.ebay.UserStatusCodeType status) {
        this.status = status;
    }


    /**
     * Gets the userID value for this UserType.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this UserType.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }


    /**
     * Gets the userIDChanged value for this UserType.
     * 
     * @return userIDChanged
     */
    public java.lang.Boolean getUserIDChanged() {
        return userIDChanged;
    }


    /**
     * Sets the userIDChanged value for this UserType.
     * 
     * @param userIDChanged
     */
    public void setUserIDChanged(java.lang.Boolean userIDChanged) {
        this.userIDChanged = userIDChanged;
    }


    /**
     * Gets the userIDLastChanged value for this UserType.
     * 
     * @return userIDLastChanged
     */
    public java.util.Calendar getUserIDLastChanged() {
        return userIDLastChanged;
    }


    /**
     * Sets the userIDLastChanged value for this UserType.
     * 
     * @param userIDLastChanged
     */
    public void setUserIDLastChanged(java.util.Calendar userIDLastChanged) {
        this.userIDLastChanged = userIDLastChanged;
    }


    /**
     * Gets the VATStatus value for this UserType.
     * 
     * @return VATStatus   * If present, indicates whether or not the user is subject to
     * VAT. 
     * 			              Users who have registered with eBay as VAT-exempt
     * are not 
     * 			              subject to VAT. See Value-Added Tax (VAT). Not returned
     * for 
     * 			              users whose country of residence is outside the EU.
     * 
     * 			              Possible values for the user's status:
     *     						2 = Residence in an EU country but user registered as VAT-exempt
     * 						3 = Residence in an EU country and user not registered as VAT-exempt
     */
    public eBLBaseComponents.apis.ebay.VATStatusCodeType getVATStatus() {
        return VATStatus;
    }


    /**
     * Sets the VATStatus value for this UserType.
     * 
     * @param VATStatus   * If present, indicates whether or not the user is subject to
     * VAT. 
     * 			              Users who have registered with eBay as VAT-exempt
     * are not 
     * 			              subject to VAT. See Value-Added Tax (VAT). Not returned
     * for 
     * 			              users whose country of residence is outside the EU.
     * 
     * 			              Possible values for the user's status:
     *     						2 = Residence in an EU country but user registered as VAT-exempt
     * 						3 = Residence in an EU country and user not registered as VAT-exempt
     */
    public void setVATStatus(eBLBaseComponents.apis.ebay.VATStatusCodeType VATStatus) {
        this.VATStatus = VATStatus;
    }


    /**
     * Gets the buyerInfo value for this UserType.
     * 
     * @return buyerInfo
     */
    public eBLBaseComponents.apis.ebay.BuyerType getBuyerInfo() {
        return buyerInfo;
    }


    /**
     * Sets the buyerInfo value for this UserType.
     * 
     * @param buyerInfo
     */
    public void setBuyerInfo(eBLBaseComponents.apis.ebay.BuyerType buyerInfo) {
        this.buyerInfo = buyerInfo;
    }


    /**
     * Gets the sellerInfo value for this UserType.
     * 
     * @return sellerInfo
     */
    public eBLBaseComponents.apis.ebay.SellerType getSellerInfo() {
        return sellerInfo;
    }


    /**
     * Sets the sellerInfo value for this UserType.
     * 
     * @param sellerInfo
     */
    public void setSellerInfo(eBLBaseComponents.apis.ebay.SellerType sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserType)) return false;
        UserType other = (UserType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aboutMePage==null && other.getAboutMePage()==null) || 
             (this.aboutMePage!=null &&
              this.aboutMePage.equals(other.getAboutMePage()))) &&
            ((this.EAISToken==null && other.getEAISToken()==null) || 
             (this.EAISToken!=null &&
              this.EAISToken.equals(other.getEAISToken()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.feedbackScore==null && other.getFeedbackScore()==null) || 
             (this.feedbackScore!=null &&
              this.feedbackScore.equals(other.getFeedbackScore()))) &&
            ((this.feedbackPrivate==null && other.getFeedbackPrivate()==null) || 
             (this.feedbackPrivate!=null &&
              this.feedbackPrivate.equals(other.getFeedbackPrivate()))) &&
            ((this.feedbackRatingStar==null && other.getFeedbackRatingStar()==null) || 
             (this.feedbackRatingStar!=null &&
              this.feedbackRatingStar.equals(other.getFeedbackRatingStar()))) &&
            ((this.IDVerified==null && other.getIDVerified()==null) || 
             (this.IDVerified!=null &&
              this.IDVerified.equals(other.getIDVerified()))) &&
            ((this.newUser==null && other.getNewUser()==null) || 
             (this.newUser!=null &&
              this.newUser.equals(other.getNewUser()))) &&
            ((this.registrationAddress==null && other.getRegistrationAddress()==null) || 
             (this.registrationAddress!=null &&
              this.registrationAddress.equals(other.getRegistrationAddress()))) &&
            ((this.registrationDate==null && other.getRegistrationDate()==null) || 
             (this.registrationDate!=null &&
              this.registrationDate.equals(other.getRegistrationDate()))) &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.userIDChanged==null && other.getUserIDChanged()==null) || 
             (this.userIDChanged!=null &&
              this.userIDChanged.equals(other.getUserIDChanged()))) &&
            ((this.userIDLastChanged==null && other.getUserIDLastChanged()==null) || 
             (this.userIDLastChanged!=null &&
              this.userIDLastChanged.equals(other.getUserIDLastChanged()))) &&
            ((this.VATStatus==null && other.getVATStatus()==null) || 
             (this.VATStatus!=null &&
              this.VATStatus.equals(other.getVATStatus()))) &&
            ((this.buyerInfo==null && other.getBuyerInfo()==null) || 
             (this.buyerInfo!=null &&
              this.buyerInfo.equals(other.getBuyerInfo()))) &&
            ((this.sellerInfo==null && other.getSellerInfo()==null) || 
             (this.sellerInfo!=null &&
              this.sellerInfo.equals(other.getSellerInfo())));
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
        if (getAboutMePage() != null) {
            _hashCode += getAboutMePage().hashCode();
        }
        if (getEAISToken() != null) {
            _hashCode += getEAISToken().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFeedbackScore() != null) {
            _hashCode += getFeedbackScore().hashCode();
        }
        if (getFeedbackPrivate() != null) {
            _hashCode += getFeedbackPrivate().hashCode();
        }
        if (getFeedbackRatingStar() != null) {
            _hashCode += getFeedbackRatingStar().hashCode();
        }
        if (getIDVerified() != null) {
            _hashCode += getIDVerified().hashCode();
        }
        if (getNewUser() != null) {
            _hashCode += getNewUser().hashCode();
        }
        if (getRegistrationAddress() != null) {
            _hashCode += getRegistrationAddress().hashCode();
        }
        if (getRegistrationDate() != null) {
            _hashCode += getRegistrationDate().hashCode();
        }
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getUserIDChanged() != null) {
            _hashCode += getUserIDChanged().hashCode();
        }
        if (getUserIDLastChanged() != null) {
            _hashCode += getUserIDLastChanged().hashCode();
        }
        if (getVATStatus() != null) {
            _hashCode += getVATStatus().hashCode();
        }
        if (getBuyerInfo() != null) {
            _hashCode += getBuyerInfo().hashCode();
        }
        if (getSellerInfo() != null) {
            _hashCode += getSellerInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aboutMePage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AboutMePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EAISToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EAISToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackScore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FeedbackScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackPrivate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FeedbackPrivate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackRatingStar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FeedbackRatingStar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FeedbackRatingStarCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDVerified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IDVerified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "NewUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RegistrationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RegistrationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Site"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SiteCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserStatusCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserIDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIDChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserIDChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIDLastChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserIDLastChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VATStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VATStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VATStatusCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerType"));
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
