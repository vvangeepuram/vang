/**
 * ItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ItemType  implements java.io.Serializable {
    /* Returns custom, application-specific data associated 
     * 			               	with the item. The data in this field is stored
     * with the item 
     * 			               	in the items table at eBay, but is not used in
     * any way by 
     * 			               	eBay. Use ApplicationData to store such special
     * information 
     * 			               	as a part or SKU number. Maximum 32 characters
     * in length. */
    private java.lang.String applicationData;

    /* Carries one or more instances of the AttributeSet in a list. */
    private eBLBaseComponents.apis.ebay.ValType[][][] listOfAttributeSets;

    /* If true (1), indicates that the seller requested immediate
     * 
     * 			               	payment for the item. False (0) if immediate payment
     * was 
     * 			               	not requested. (Does not indicate whether the item
     * is 
     * 			               	still a candidate for puchase via immediate payment.)
     * 
     * 			               	Only applicable for items listed on US and UK sites
     * in 
     * 			               	categories that support immediate payment, when
     * seller 
     * 			              	has a Premier or Business PayPal account. */
    private java.lang.Boolean autoPay;

    /* Indicates the status of the item's eligibility for the Buyer
     * 
     * 			               	Protection Program. Possible values:
     *     							ItemIneligible - Item is ineligible (e.g., category not
     * applicable)
     *     						 	ItemEligible - Item is eligible per standard criteria
     * 
     *     							ItemMarkedIneligible - Item marked ineligible per special
     * criteria (e.g., seller's account closed)
     *     							ItemMarkedIneligible - Item marked elegible per other criteria
     * 						Applicable for items listed to the US site and for the Parts
     * 
     * 						and Accessories category (6028) or Everything Else category
     * 
     * 						(10368) (or their subcategories) on the eBay Motors site. */
    private eBLBaseComponents.apis.ebay.BuyerProtectionCodeType buyerProtection;

    /* Amount a Buyer would need to bid to take advantage 
     * 			               	of the Buy It Now feature. Not applicable to Fixed-Price
     * 
     * 			               	items (Type = 7 or 9) or AdFormat-type listings.
     * For 
     * 			               	Fixed-Price items, see StartPrice instead. */
    private CoreComponentTypes.apis.ebay.AmountType buyItNowPrice;

    /* Charity listing container. */
    private eBLBaseComponents.apis.ebay.CharityType charity;

    /* 2-letter ISO 3166 Country Code. */
    private eBLBaseComponents.apis.ebay.CountryCodeType country;

    /* CrossPromotions container, if applicable shows promoted items */
    private eBLBaseComponents.apis.ebay.CrossPromotionsType crossPromotion;

    /* 3-letter ISO Currency Code. */
    private eBLBaseComponents.apis.ebay.CurrencyCodeType currency;

    /* Item Description. */
    private java.lang.String description;

    /* Online Escrow paid for by buyer or seller. Cannot use 
     * 			              	with real estate auctions. Escrow is recommended
     * for 
     * 			              	for transactions over $500. Escrow service, 
     * 			              	available via Escrow.com, protects both buyer and
     * 
     * 			              	seller by acting as a trusted third-party during
     * the 
     * 			              	transaction and managing the payment process
     * 			              	from start to finish. Also, if escrow by seller
     * option used,
     * 			              	then for Motors, this means that Escrow will be
     * 
     * 			              	negotiated at the end of the auction. */
    private eBLBaseComponents.apis.ebay.EscrowCodeType escrow;

    /* If set, a generic gift icon displays in the listing's 
     * 			              	Title. GiftIcon must be set to to be able to use
     * 
     * 			              	GiftServices options (e.g., GiftExpressShipping,
     * 
     * 			              	GiftShipToRecipient, or GiftWrap). */
    private java.lang.Integer giftIcon;

    /* Gift service options offered by the seller of 
     * 			              	the listed item. */
    private eBLBaseComponents.apis.ebay.GiftServicesCodeType[] giftServices;

    /* Optional hit counter for the item's listing page. Possible
     * 
     * 			               	values are:
     * 			               		"NoHitCounter"  
     * 							"HonestyStyle"  
     * 							"GreenLED"  
     * 							"Hidden" */
    private eBLBaseComponents.apis.ebay.HitCounterCodeType hitCounter;

    /* The ID that uniquely identifies the item listing. */
    private java.lang.String itemID;

    /* Includes listing details in terms of start and 
     * 			               	end time of listing (in GMT) as well as other 
     * 			               	details (e.g., orginal item for second chance,
     * 			               	converted start price, etc.). */
    private eBLBaseComponents.apis.ebay.ListingDetailsType listingDetails;

    /* When an item is first listed (using AddItem), a Layout template
     * 
     * 			              	or a Theme template (or both) can be assigned to
     * the item. 
     * 			              	A Layout template is assigned to a new item by specifying
     * 
     * 			              	the Layout template ID (in the AddItem input argument
     * 
     * 			              	LayoutID). Similarly, a Theme template is assigned
     * to the 
     * 			              	item using the ThemeID argument. */
    private eBLBaseComponents.apis.ebay.ListingDesignerType listingDesigner;

    /* Describes the number of days the auction will be active. */
    private eBLBaseComponents.apis.ebay.ListingDurationCodeType listingDuration;

    /* Describes the types of enhancment supported
     * 			               	for the item's listing. */
    private eBLBaseComponents.apis.ebay.ListingEnhancementsCodeType[] listingEnhancement;

    /* Describes the type of listing for the item a seller 
     * 			               	has chosen (e.g., Chinese, Dutch, FixedPrice, etc.). */
    private eBLBaseComponents.apis.ebay.ListingTypeCodeType listingType;

    /* Indicates the geographical location of the item. */
    private java.lang.String location;

    /* Needed for add item only for partners. */
    private java.lang.String partnerCode;

    /* Needed for add item only for partners. */
    private java.lang.String partnerName;

    /* List of payment methods accepted by a seller from a buyer for
     * 
     * 			               	a (checkout) transaction. */
    private eBLBaseComponents.apis.ebay.BuyerPaymentMethodCodeType[] paymentMethods;

    /* Valid PayPal e-mail address if seller has chosen PayPal 
     * 			                	as a payment method for the listed item. */
    private java.lang.String payPalEmailAddress;

    /* Container for data on the primary category of listing. */
    private eBLBaseComponents.apis.ebay.CategoryType primaryCategory;

    /* Private auction. Not applicable to Fixed Price items. */
    private java.lang.Boolean privateListing;

    /* Number of items being sold in the auction. */
    private java.lang.Integer quantity;

    /* Region where the item is listed. See Region Table for values.
     * 
     * 			               	If the item is listed with a Region of 0 (zero),
     * then this return 
     * 			               	field denotes no region association with the item,
     * meaning 
     * 			               	that it is not listing the item regionally. */
    private java.lang.String regionID;

    /* If true, creates a link from the old listing for the item to
     * the new 
     * 			               	relist page, which accommodates users who might
     * still look for 
     * 			               	the item under its old item ID. Also adds the relist
     * ID to the old 
     * 			               	listing's record in the eBay database, which can
     * be returned by 
     * 			               	calling GetItem for the old ItemId. If your application
     * creates the 
     * 			               	listing page for the user, you need to add the
     * relist link option to 
     * 			              	your application for your users. */
    private java.lang.Boolean relistLink;

    /* Indicates the reserve price for a reserve auction. Returned
     * 
     * 					 	only if DetailLevel = 4. ReservePrice is only returned for
     * 
     * 					 	auctions with a reserve price where the user calling GetItem
     * 
     * 					 	is the item's seller. Returned as null for International Fixed
     * 
     * 					 	Price items. For more information on reserve price auctions,
     * 
     * 					 	see http://pages.ebay.com/help/basics/f-format.html#1. */
    private CoreComponentTypes.apis.ebay.AmountType reservePrice;

    /* Revise Status contains information about the item being
     * 			                  revised. */
    private eBLBaseComponents.apis.ebay.ReviseStatusType reviseStatus;

    private java.util.Calendar scheduleTime;

    /* Container for data on the secondary category of listing. 
     * 			            		Secondary category is optional. */
    private eBLBaseComponents.apis.ebay.CategoryType secondaryCategory;

    /* Item picture information for pictures hosted at eBay site. */
    private eBLBaseComponents.apis.ebay.SiteHostedPictureType siteHostedPicture;

    /* Seller user. */
    private eBLBaseComponents.apis.ebay.UserType seller;

    /* Container for for selling status information (e.g., BidCount,
     * 			            		BidIncrement, HighBidder, MinimimumToBid, etc). */
    private eBLBaseComponents.apis.ebay.SellingStatusType sellingStatus;

    /* Specifies where the seller is willing to ship the item. 
     * 			               		Default "SiteOnly". Valid values are: 
     * 			               	 	SiteOnly (the default)
     *     						 	WorldWide
     *     						 	SitePlusRegions
     *     							 WillNotShip
     * 					 	If SitePlusRegions is selected, then at least one 
     * 					 	regions argument (ShipToNorthAmerica, ShipToEurope, 
     * 					 	etc.) must also be set. */
    private eBLBaseComponents.apis.ebay.ShippingOptionCodeType shippingOption;

    /* Contains the shipping payment related information for the 
     *                               	  	listed item. */
    private eBLBaseComponents.apis.ebay.ShippingDetailsType shippingDetails;

    /* Regions that seller will ship to. */
    private eBLBaseComponents.apis.ebay.ShippingRegionCodeType[] shippingRegions;

    /* Describes who pays for the delivery of an item (e.g., buyer
     * 
     * 			               	or seller). */
    private eBLBaseComponents.apis.ebay.ShippingTermsCodeType shippingTerms;

    /* eBay site on which item is listed. */
    private eBLBaseComponents.apis.ebay.SiteCodeType site;

    /* Starting price for the item. For Type=7 or Type=9 (Fixed Price)
     * 
     * 			            		items, if the item price (MinimumBid) is revised,
     * this field 
     * 			            		returns the new price. */
    private CoreComponentTypes.apis.ebay.AmountType startPrice;

    /* Storefront is shown for any item that 
     * 			             		belongs to an eBay Store owner, regardless of 
     * 			             		whether it is fixed price or auction type.  Not
     * 
     * 			             		returned for International Fixed Price items. */
    private eBLBaseComponents.apis.ebay.StorefrontType storefront;

    /* Subtitle to use in addition to the title. Provides more keywords
     * when buyers search in titles and descriptions. */
    private java.lang.String subTitle;

    /* Time until the the end of the listing (e.g., the amount of
     * time left 
     * 			              	in an active auction). */
    private org.apache.axis.types.Duration timeLeft;

    /* Name of the item as it appears for auctions. */
    private java.lang.String title;

    /* Universally unique constraint tag. The UUID is unique to a
     * category. */
    private java.lang.String UUID;

    /* VAT info container. */
    private eBLBaseComponents.apis.ebay.VATDetailsType VATDetails;

    /* Item picture information for pictures hosted at vendor (i.e.,
     * remote) site. */
    private eBLBaseComponents.apis.ebay.VendorHostedPictureType vendorHostedPicture;

    public ItemType() {
    }

    public ItemType(
           java.lang.String applicationData,
           eBLBaseComponents.apis.ebay.ValType[][][] listOfAttributeSets,
           java.lang.Boolean autoPay,
           eBLBaseComponents.apis.ebay.BuyerProtectionCodeType buyerProtection,
           CoreComponentTypes.apis.ebay.AmountType buyItNowPrice,
           eBLBaseComponents.apis.ebay.CharityType charity,
           eBLBaseComponents.apis.ebay.CountryCodeType country,
           eBLBaseComponents.apis.ebay.CrossPromotionsType crossPromotion,
           eBLBaseComponents.apis.ebay.CurrencyCodeType currency,
           java.lang.String description,
           eBLBaseComponents.apis.ebay.EscrowCodeType escrow,
           java.lang.Integer giftIcon,
           eBLBaseComponents.apis.ebay.GiftServicesCodeType[] giftServices,
           eBLBaseComponents.apis.ebay.HitCounterCodeType hitCounter,
           java.lang.String itemID,
           eBLBaseComponents.apis.ebay.ListingDetailsType listingDetails,
           eBLBaseComponents.apis.ebay.ListingDesignerType listingDesigner,
           eBLBaseComponents.apis.ebay.ListingDurationCodeType listingDuration,
           eBLBaseComponents.apis.ebay.ListingEnhancementsCodeType[] listingEnhancement,
           eBLBaseComponents.apis.ebay.ListingTypeCodeType listingType,
           java.lang.String location,
           java.lang.String partnerCode,
           java.lang.String partnerName,
           eBLBaseComponents.apis.ebay.BuyerPaymentMethodCodeType[] paymentMethods,
           java.lang.String payPalEmailAddress,
           eBLBaseComponents.apis.ebay.CategoryType primaryCategory,
           java.lang.Boolean privateListing,
           java.lang.Integer quantity,
           java.lang.String regionID,
           java.lang.Boolean relistLink,
           CoreComponentTypes.apis.ebay.AmountType reservePrice,
           eBLBaseComponents.apis.ebay.ReviseStatusType reviseStatus,
           java.util.Calendar scheduleTime,
           eBLBaseComponents.apis.ebay.CategoryType secondaryCategory,
           eBLBaseComponents.apis.ebay.SiteHostedPictureType siteHostedPicture,
           eBLBaseComponents.apis.ebay.UserType seller,
           eBLBaseComponents.apis.ebay.SellingStatusType sellingStatus,
           eBLBaseComponents.apis.ebay.ShippingOptionCodeType shippingOption,
           eBLBaseComponents.apis.ebay.ShippingDetailsType shippingDetails,
           eBLBaseComponents.apis.ebay.ShippingRegionCodeType[] shippingRegions,
           eBLBaseComponents.apis.ebay.ShippingTermsCodeType shippingTerms,
           eBLBaseComponents.apis.ebay.SiteCodeType site,
           CoreComponentTypes.apis.ebay.AmountType startPrice,
           eBLBaseComponents.apis.ebay.StorefrontType storefront,
           java.lang.String subTitle,
           org.apache.axis.types.Duration timeLeft,
           java.lang.String title,
           java.lang.String UUID,
           eBLBaseComponents.apis.ebay.VATDetailsType VATDetails,
           eBLBaseComponents.apis.ebay.VendorHostedPictureType vendorHostedPicture) {
           this.applicationData = applicationData;
           this.listOfAttributeSets = listOfAttributeSets;
           this.autoPay = autoPay;
           this.buyerProtection = buyerProtection;
           this.buyItNowPrice = buyItNowPrice;
           this.charity = charity;
           this.country = country;
           this.crossPromotion = crossPromotion;
           this.currency = currency;
           this.description = description;
           this.escrow = escrow;
           this.giftIcon = giftIcon;
           this.giftServices = giftServices;
           this.hitCounter = hitCounter;
           this.itemID = itemID;
           this.listingDetails = listingDetails;
           this.listingDesigner = listingDesigner;
           this.listingDuration = listingDuration;
           this.listingEnhancement = listingEnhancement;
           this.listingType = listingType;
           this.location = location;
           this.partnerCode = partnerCode;
           this.partnerName = partnerName;
           this.paymentMethods = paymentMethods;
           this.payPalEmailAddress = payPalEmailAddress;
           this.primaryCategory = primaryCategory;
           this.privateListing = privateListing;
           this.quantity = quantity;
           this.regionID = regionID;
           this.relistLink = relistLink;
           this.reservePrice = reservePrice;
           this.reviseStatus = reviseStatus;
           this.scheduleTime = scheduleTime;
           this.secondaryCategory = secondaryCategory;
           this.siteHostedPicture = siteHostedPicture;
           this.seller = seller;
           this.sellingStatus = sellingStatus;
           this.shippingOption = shippingOption;
           this.shippingDetails = shippingDetails;
           this.shippingRegions = shippingRegions;
           this.shippingTerms = shippingTerms;
           this.site = site;
           this.startPrice = startPrice;
           this.storefront = storefront;
           this.subTitle = subTitle;
           this.timeLeft = timeLeft;
           this.title = title;
           this.UUID = UUID;
           this.VATDetails = VATDetails;
           this.vendorHostedPicture = vendorHostedPicture;
    }


    /**
     * Gets the applicationData value for this ItemType.
     * 
     * @return applicationData   * Returns custom, application-specific data associated 
     * 			               	with the item. The data in this field is stored
     * with the item 
     * 			               	in the items table at eBay, but is not used in
     * any way by 
     * 			               	eBay. Use ApplicationData to store such special
     * information 
     * 			               	as a part or SKU number. Maximum 32 characters
     * in length.
     */
    public java.lang.String getApplicationData() {
        return applicationData;
    }


    /**
     * Sets the applicationData value for this ItemType.
     * 
     * @param applicationData   * Returns custom, application-specific data associated 
     * 			               	with the item. The data in this field is stored
     * with the item 
     * 			               	in the items table at eBay, but is not used in
     * any way by 
     * 			               	eBay. Use ApplicationData to store such special
     * information 
     * 			               	as a part or SKU number. Maximum 32 characters
     * in length.
     */
    public void setApplicationData(java.lang.String applicationData) {
        this.applicationData = applicationData;
    }


    /**
     * Gets the listOfAttributeSets value for this ItemType.
     * 
     * @return listOfAttributeSets   * Carries one or more instances of the AttributeSet in a list.
     */
    public eBLBaseComponents.apis.ebay.ValType[][][] getListOfAttributeSets() {
        return listOfAttributeSets;
    }


    /**
     * Sets the listOfAttributeSets value for this ItemType.
     * 
     * @param listOfAttributeSets   * Carries one or more instances of the AttributeSet in a list.
     */
    public void setListOfAttributeSets(eBLBaseComponents.apis.ebay.ValType[][][] listOfAttributeSets) {
        this.listOfAttributeSets = listOfAttributeSets;
    }


    /**
     * Gets the autoPay value for this ItemType.
     * 
     * @return autoPay   * If true (1), indicates that the seller requested immediate
     * 
     * 			               	payment for the item. False (0) if immediate payment
     * was 
     * 			               	not requested. (Does not indicate whether the item
     * is 
     * 			               	still a candidate for puchase via immediate payment.)
     * 
     * 			               	Only applicable for items listed on US and UK sites
     * in 
     * 			               	categories that support immediate payment, when
     * seller 
     * 			              	has a Premier or Business PayPal account.
     */
    public java.lang.Boolean getAutoPay() {
        return autoPay;
    }


    /**
     * Sets the autoPay value for this ItemType.
     * 
     * @param autoPay   * If true (1), indicates that the seller requested immediate
     * 
     * 			               	payment for the item. False (0) if immediate payment
     * was 
     * 			               	not requested. (Does not indicate whether the item
     * is 
     * 			               	still a candidate for puchase via immediate payment.)
     * 
     * 			               	Only applicable for items listed on US and UK sites
     * in 
     * 			               	categories that support immediate payment, when
     * seller 
     * 			              	has a Premier or Business PayPal account.
     */
    public void setAutoPay(java.lang.Boolean autoPay) {
        this.autoPay = autoPay;
    }


    /**
     * Gets the buyerProtection value for this ItemType.
     * 
     * @return buyerProtection   * Indicates the status of the item's eligibility for the Buyer
     * 
     * 			               	Protection Program. Possible values:
     *     							ItemIneligible - Item is ineligible (e.g., category not
     * applicable)
     *     						 	ItemEligible - Item is eligible per standard criteria
     * 
     *     							ItemMarkedIneligible - Item marked ineligible per special
     * criteria (e.g., seller's account closed)
     *     							ItemMarkedIneligible - Item marked elegible per other criteria
     * 						Applicable for items listed to the US site and for the Parts
     * 
     * 						and Accessories category (6028) or Everything Else category
     * 
     * 						(10368) (or their subcategories) on the eBay Motors site.
     */
    public eBLBaseComponents.apis.ebay.BuyerProtectionCodeType getBuyerProtection() {
        return buyerProtection;
    }


    /**
     * Sets the buyerProtection value for this ItemType.
     * 
     * @param buyerProtection   * Indicates the status of the item's eligibility for the Buyer
     * 
     * 			               	Protection Program. Possible values:
     *     							ItemIneligible - Item is ineligible (e.g., category not
     * applicable)
     *     						 	ItemEligible - Item is eligible per standard criteria
     * 
     *     							ItemMarkedIneligible - Item marked ineligible per special
     * criteria (e.g., seller's account closed)
     *     							ItemMarkedIneligible - Item marked elegible per other criteria
     * 						Applicable for items listed to the US site and for the Parts
     * 
     * 						and Accessories category (6028) or Everything Else category
     * 
     * 						(10368) (or their subcategories) on the eBay Motors site.
     */
    public void setBuyerProtection(eBLBaseComponents.apis.ebay.BuyerProtectionCodeType buyerProtection) {
        this.buyerProtection = buyerProtection;
    }


    /**
     * Gets the buyItNowPrice value for this ItemType.
     * 
     * @return buyItNowPrice   * Amount a Buyer would need to bid to take advantage 
     * 			               	of the Buy It Now feature. Not applicable to Fixed-Price
     * 
     * 			               	items (Type = 7 or 9) or AdFormat-type listings.
     * For 
     * 			               	Fixed-Price items, see StartPrice instead.
     */
    public CoreComponentTypes.apis.ebay.AmountType getBuyItNowPrice() {
        return buyItNowPrice;
    }


    /**
     * Sets the buyItNowPrice value for this ItemType.
     * 
     * @param buyItNowPrice   * Amount a Buyer would need to bid to take advantage 
     * 			               	of the Buy It Now feature. Not applicable to Fixed-Price
     * 
     * 			               	items (Type = 7 or 9) or AdFormat-type listings.
     * For 
     * 			               	Fixed-Price items, see StartPrice instead.
     */
    public void setBuyItNowPrice(CoreComponentTypes.apis.ebay.AmountType buyItNowPrice) {
        this.buyItNowPrice = buyItNowPrice;
    }


    /**
     * Gets the charity value for this ItemType.
     * 
     * @return charity   * Charity listing container.
     */
    public eBLBaseComponents.apis.ebay.CharityType getCharity() {
        return charity;
    }


    /**
     * Sets the charity value for this ItemType.
     * 
     * @param charity   * Charity listing container.
     */
    public void setCharity(eBLBaseComponents.apis.ebay.CharityType charity) {
        this.charity = charity;
    }


    /**
     * Gets the country value for this ItemType.
     * 
     * @return country   * 2-letter ISO 3166 Country Code.
     */
    public eBLBaseComponents.apis.ebay.CountryCodeType getCountry() {
        return country;
    }


    /**
     * Sets the country value for this ItemType.
     * 
     * @param country   * 2-letter ISO 3166 Country Code.
     */
    public void setCountry(eBLBaseComponents.apis.ebay.CountryCodeType country) {
        this.country = country;
    }


    /**
     * Gets the crossPromotion value for this ItemType.
     * 
     * @return crossPromotion   * CrossPromotions container, if applicable shows promoted items
     */
    public eBLBaseComponents.apis.ebay.CrossPromotionsType getCrossPromotion() {
        return crossPromotion;
    }


    /**
     * Sets the crossPromotion value for this ItemType.
     * 
     * @param crossPromotion   * CrossPromotions container, if applicable shows promoted items
     */
    public void setCrossPromotion(eBLBaseComponents.apis.ebay.CrossPromotionsType crossPromotion) {
        this.crossPromotion = crossPromotion;
    }


    /**
     * Gets the currency value for this ItemType.
     * 
     * @return currency   * 3-letter ISO Currency Code.
     */
    public eBLBaseComponents.apis.ebay.CurrencyCodeType getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ItemType.
     * 
     * @param currency   * 3-letter ISO Currency Code.
     */
    public void setCurrency(eBLBaseComponents.apis.ebay.CurrencyCodeType currency) {
        this.currency = currency;
    }


    /**
     * Gets the description value for this ItemType.
     * 
     * @return description   * Item Description.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ItemType.
     * 
     * @param description   * Item Description.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the escrow value for this ItemType.
     * 
     * @return escrow   * Online Escrow paid for by buyer or seller. Cannot use 
     * 			              	with real estate auctions. Escrow is recommended
     * for 
     * 			              	for transactions over $500. Escrow service, 
     * 			              	available via Escrow.com, protects both buyer and
     * 
     * 			              	seller by acting as a trusted third-party during
     * the 
     * 			              	transaction and managing the payment process
     * 			              	from start to finish. Also, if escrow by seller
     * option used,
     * 			              	then for Motors, this means that Escrow will be
     * 
     * 			              	negotiated at the end of the auction.
     */
    public eBLBaseComponents.apis.ebay.EscrowCodeType getEscrow() {
        return escrow;
    }


    /**
     * Sets the escrow value for this ItemType.
     * 
     * @param escrow   * Online Escrow paid for by buyer or seller. Cannot use 
     * 			              	with real estate auctions. Escrow is recommended
     * for 
     * 			              	for transactions over $500. Escrow service, 
     * 			              	available via Escrow.com, protects both buyer and
     * 
     * 			              	seller by acting as a trusted third-party during
     * the 
     * 			              	transaction and managing the payment process
     * 			              	from start to finish. Also, if escrow by seller
     * option used,
     * 			              	then for Motors, this means that Escrow will be
     * 
     * 			              	negotiated at the end of the auction.
     */
    public void setEscrow(eBLBaseComponents.apis.ebay.EscrowCodeType escrow) {
        this.escrow = escrow;
    }


    /**
     * Gets the giftIcon value for this ItemType.
     * 
     * @return giftIcon   * If set, a generic gift icon displays in the listing's 
     * 			              	Title. GiftIcon must be set to to be able to use
     * 
     * 			              	GiftServices options (e.g., GiftExpressShipping,
     * 
     * 			              	GiftShipToRecipient, or GiftWrap).
     */
    public java.lang.Integer getGiftIcon() {
        return giftIcon;
    }


    /**
     * Sets the giftIcon value for this ItemType.
     * 
     * @param giftIcon   * If set, a generic gift icon displays in the listing's 
     * 			              	Title. GiftIcon must be set to to be able to use
     * 
     * 			              	GiftServices options (e.g., GiftExpressShipping,
     * 
     * 			              	GiftShipToRecipient, or GiftWrap).
     */
    public void setGiftIcon(java.lang.Integer giftIcon) {
        this.giftIcon = giftIcon;
    }


    /**
     * Gets the giftServices value for this ItemType.
     * 
     * @return giftServices   * Gift service options offered by the seller of 
     * 			              	the listed item.
     */
    public eBLBaseComponents.apis.ebay.GiftServicesCodeType[] getGiftServices() {
        return giftServices;
    }


    /**
     * Sets the giftServices value for this ItemType.
     * 
     * @param giftServices   * Gift service options offered by the seller of 
     * 			              	the listed item.
     */
    public void setGiftServices(eBLBaseComponents.apis.ebay.GiftServicesCodeType[] giftServices) {
        this.giftServices = giftServices;
    }

    public eBLBaseComponents.apis.ebay.GiftServicesCodeType getGiftServices(int i) {
        return this.giftServices[i];
    }

    public void setGiftServices(int i, eBLBaseComponents.apis.ebay.GiftServicesCodeType _value) {
        this.giftServices[i] = _value;
    }


    /**
     * Gets the hitCounter value for this ItemType.
     * 
     * @return hitCounter   * Optional hit counter for the item's listing page. Possible
     * 
     * 			               	values are:
     * 			               		"NoHitCounter"  
     * 							"HonestyStyle"  
     * 							"GreenLED"  
     * 							"Hidden"
     */
    public eBLBaseComponents.apis.ebay.HitCounterCodeType getHitCounter() {
        return hitCounter;
    }


    /**
     * Sets the hitCounter value for this ItemType.
     * 
     * @param hitCounter   * Optional hit counter for the item's listing page. Possible
     * 
     * 			               	values are:
     * 			               		"NoHitCounter"  
     * 							"HonestyStyle"  
     * 							"GreenLED"  
     * 							"Hidden"
     */
    public void setHitCounter(eBLBaseComponents.apis.ebay.HitCounterCodeType hitCounter) {
        this.hitCounter = hitCounter;
    }


    /**
     * Gets the itemID value for this ItemType.
     * 
     * @return itemID   * The ID that uniquely identifies the item listing.
     */
    public java.lang.String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this ItemType.
     * 
     * @param itemID   * The ID that uniquely identifies the item listing.
     */
    public void setItemID(java.lang.String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the listingDetails value for this ItemType.
     * 
     * @return listingDetails   * Includes listing details in terms of start and 
     * 			               	end time of listing (in GMT) as well as other 
     * 			               	details (e.g., orginal item for second chance,
     * 			               	converted start price, etc.).
     */
    public eBLBaseComponents.apis.ebay.ListingDetailsType getListingDetails() {
        return listingDetails;
    }


    /**
     * Sets the listingDetails value for this ItemType.
     * 
     * @param listingDetails   * Includes listing details in terms of start and 
     * 			               	end time of listing (in GMT) as well as other 
     * 			               	details (e.g., orginal item for second chance,
     * 			               	converted start price, etc.).
     */
    public void setListingDetails(eBLBaseComponents.apis.ebay.ListingDetailsType listingDetails) {
        this.listingDetails = listingDetails;
    }


    /**
     * Gets the listingDesigner value for this ItemType.
     * 
     * @return listingDesigner   * When an item is first listed (using AddItem), a Layout template
     * 
     * 			              	or a Theme template (or both) can be assigned to
     * the item. 
     * 			              	A Layout template is assigned to a new item by specifying
     * 
     * 			              	the Layout template ID (in the AddItem input argument
     * 
     * 			              	LayoutID). Similarly, a Theme template is assigned
     * to the 
     * 			              	item using the ThemeID argument.
     */
    public eBLBaseComponents.apis.ebay.ListingDesignerType getListingDesigner() {
        return listingDesigner;
    }


    /**
     * Sets the listingDesigner value for this ItemType.
     * 
     * @param listingDesigner   * When an item is first listed (using AddItem), a Layout template
     * 
     * 			              	or a Theme template (or both) can be assigned to
     * the item. 
     * 			              	A Layout template is assigned to a new item by specifying
     * 
     * 			              	the Layout template ID (in the AddItem input argument
     * 
     * 			              	LayoutID). Similarly, a Theme template is assigned
     * to the 
     * 			              	item using the ThemeID argument.
     */
    public void setListingDesigner(eBLBaseComponents.apis.ebay.ListingDesignerType listingDesigner) {
        this.listingDesigner = listingDesigner;
    }


    /**
     * Gets the listingDuration value for this ItemType.
     * 
     * @return listingDuration   * Describes the number of days the auction will be active.
     */
    public eBLBaseComponents.apis.ebay.ListingDurationCodeType getListingDuration() {
        return listingDuration;
    }


    /**
     * Sets the listingDuration value for this ItemType.
     * 
     * @param listingDuration   * Describes the number of days the auction will be active.
     */
    public void setListingDuration(eBLBaseComponents.apis.ebay.ListingDurationCodeType listingDuration) {
        this.listingDuration = listingDuration;
    }


    /**
     * Gets the listingEnhancement value for this ItemType.
     * 
     * @return listingEnhancement   * Describes the types of enhancment supported
     * 			               	for the item's listing.
     */
    public eBLBaseComponents.apis.ebay.ListingEnhancementsCodeType[] getListingEnhancement() {
        return listingEnhancement;
    }


    /**
     * Sets the listingEnhancement value for this ItemType.
     * 
     * @param listingEnhancement   * Describes the types of enhancment supported
     * 			               	for the item's listing.
     */
    public void setListingEnhancement(eBLBaseComponents.apis.ebay.ListingEnhancementsCodeType[] listingEnhancement) {
        this.listingEnhancement = listingEnhancement;
    }

    public eBLBaseComponents.apis.ebay.ListingEnhancementsCodeType getListingEnhancement(int i) {
        return this.listingEnhancement[i];
    }

    public void setListingEnhancement(int i, eBLBaseComponents.apis.ebay.ListingEnhancementsCodeType _value) {
        this.listingEnhancement[i] = _value;
    }


    /**
     * Gets the listingType value for this ItemType.
     * 
     * @return listingType   * Describes the type of listing for the item a seller 
     * 			               	has chosen (e.g., Chinese, Dutch, FixedPrice, etc.).
     */
    public eBLBaseComponents.apis.ebay.ListingTypeCodeType getListingType() {
        return listingType;
    }


    /**
     * Sets the listingType value for this ItemType.
     * 
     * @param listingType   * Describes the type of listing for the item a seller 
     * 			               	has chosen (e.g., Chinese, Dutch, FixedPrice, etc.).
     */
    public void setListingType(eBLBaseComponents.apis.ebay.ListingTypeCodeType listingType) {
        this.listingType = listingType;
    }


    /**
     * Gets the location value for this ItemType.
     * 
     * @return location   * Indicates the geographical location of the item.
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ItemType.
     * 
     * @param location   * Indicates the geographical location of the item.
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the partnerCode value for this ItemType.
     * 
     * @return partnerCode   * Needed for add item only for partners.
     */
    public java.lang.String getPartnerCode() {
        return partnerCode;
    }


    /**
     * Sets the partnerCode value for this ItemType.
     * 
     * @param partnerCode   * Needed for add item only for partners.
     */
    public void setPartnerCode(java.lang.String partnerCode) {
        this.partnerCode = partnerCode;
    }


    /**
     * Gets the partnerName value for this ItemType.
     * 
     * @return partnerName   * Needed for add item only for partners.
     */
    public java.lang.String getPartnerName() {
        return partnerName;
    }


    /**
     * Sets the partnerName value for this ItemType.
     * 
     * @param partnerName   * Needed for add item only for partners.
     */
    public void setPartnerName(java.lang.String partnerName) {
        this.partnerName = partnerName;
    }


    /**
     * Gets the paymentMethods value for this ItemType.
     * 
     * @return paymentMethods   * List of payment methods accepted by a seller from a buyer for
     * 
     * 			               	a (checkout) transaction.
     */
    public eBLBaseComponents.apis.ebay.BuyerPaymentMethodCodeType[] getPaymentMethods() {
        return paymentMethods;
    }


    /**
     * Sets the paymentMethods value for this ItemType.
     * 
     * @param paymentMethods   * List of payment methods accepted by a seller from a buyer for
     * 
     * 			               	a (checkout) transaction.
     */
    public void setPaymentMethods(eBLBaseComponents.apis.ebay.BuyerPaymentMethodCodeType[] paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public eBLBaseComponents.apis.ebay.BuyerPaymentMethodCodeType getPaymentMethods(int i) {
        return this.paymentMethods[i];
    }

    public void setPaymentMethods(int i, eBLBaseComponents.apis.ebay.BuyerPaymentMethodCodeType _value) {
        this.paymentMethods[i] = _value;
    }


    /**
     * Gets the payPalEmailAddress value for this ItemType.
     * 
     * @return payPalEmailAddress   * Valid PayPal e-mail address if seller has chosen PayPal 
     * 			                	as a payment method for the listed item.
     */
    public java.lang.String getPayPalEmailAddress() {
        return payPalEmailAddress;
    }


    /**
     * Sets the payPalEmailAddress value for this ItemType.
     * 
     * @param payPalEmailAddress   * Valid PayPal e-mail address if seller has chosen PayPal 
     * 			                	as a payment method for the listed item.
     */
    public void setPayPalEmailAddress(java.lang.String payPalEmailAddress) {
        this.payPalEmailAddress = payPalEmailAddress;
    }


    /**
     * Gets the primaryCategory value for this ItemType.
     * 
     * @return primaryCategory   * Container for data on the primary category of listing.
     */
    public eBLBaseComponents.apis.ebay.CategoryType getPrimaryCategory() {
        return primaryCategory;
    }


    /**
     * Sets the primaryCategory value for this ItemType.
     * 
     * @param primaryCategory   * Container for data on the primary category of listing.
     */
    public void setPrimaryCategory(eBLBaseComponents.apis.ebay.CategoryType primaryCategory) {
        this.primaryCategory = primaryCategory;
    }


    /**
     * Gets the privateListing value for this ItemType.
     * 
     * @return privateListing   * Private auction. Not applicable to Fixed Price items.
     */
    public java.lang.Boolean getPrivateListing() {
        return privateListing;
    }


    /**
     * Sets the privateListing value for this ItemType.
     * 
     * @param privateListing   * Private auction. Not applicable to Fixed Price items.
     */
    public void setPrivateListing(java.lang.Boolean privateListing) {
        this.privateListing = privateListing;
    }


    /**
     * Gets the quantity value for this ItemType.
     * 
     * @return quantity   * Number of items being sold in the auction.
     */
    public java.lang.Integer getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ItemType.
     * 
     * @param quantity   * Number of items being sold in the auction.
     */
    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the regionID value for this ItemType.
     * 
     * @return regionID   * Region where the item is listed. See Region Table for values.
     * 
     * 			               	If the item is listed with a Region of 0 (zero),
     * then this return 
     * 			               	field denotes no region association with the item,
     * meaning 
     * 			               	that it is not listing the item regionally.
     */
    public java.lang.String getRegionID() {
        return regionID;
    }


    /**
     * Sets the regionID value for this ItemType.
     * 
     * @param regionID   * Region where the item is listed. See Region Table for values.
     * 
     * 			               	If the item is listed with a Region of 0 (zero),
     * then this return 
     * 			               	field denotes no region association with the item,
     * meaning 
     * 			               	that it is not listing the item regionally.
     */
    public void setRegionID(java.lang.String regionID) {
        this.regionID = regionID;
    }


    /**
     * Gets the relistLink value for this ItemType.
     * 
     * @return relistLink   * If true, creates a link from the old listing for the item to
     * the new 
     * 			               	relist page, which accommodates users who might
     * still look for 
     * 			               	the item under its old item ID. Also adds the relist
     * ID to the old 
     * 			               	listing's record in the eBay database, which can
     * be returned by 
     * 			               	calling GetItem for the old ItemId. If your application
     * creates the 
     * 			               	listing page for the user, you need to add the
     * relist link option to 
     * 			              	your application for your users.
     */
    public java.lang.Boolean getRelistLink() {
        return relistLink;
    }


    /**
     * Sets the relistLink value for this ItemType.
     * 
     * @param relistLink   * If true, creates a link from the old listing for the item to
     * the new 
     * 			               	relist page, which accommodates users who might
     * still look for 
     * 			               	the item under its old item ID. Also adds the relist
     * ID to the old 
     * 			               	listing's record in the eBay database, which can
     * be returned by 
     * 			               	calling GetItem for the old ItemId. If your application
     * creates the 
     * 			               	listing page for the user, you need to add the
     * relist link option to 
     * 			              	your application for your users.
     */
    public void setRelistLink(java.lang.Boolean relistLink) {
        this.relistLink = relistLink;
    }


    /**
     * Gets the reservePrice value for this ItemType.
     * 
     * @return reservePrice   * Indicates the reserve price for a reserve auction. Returned
     * 
     * 					 	only if DetailLevel = 4. ReservePrice is only returned for
     * 
     * 					 	auctions with a reserve price where the user calling GetItem
     * 
     * 					 	is the item's seller. Returned as null for International Fixed
     * 
     * 					 	Price items. For more information on reserve price auctions,
     * 
     * 					 	see http://pages.ebay.com/help/basics/f-format.html#1.
     */
    public CoreComponentTypes.apis.ebay.AmountType getReservePrice() {
        return reservePrice;
    }


    /**
     * Sets the reservePrice value for this ItemType.
     * 
     * @param reservePrice   * Indicates the reserve price for a reserve auction. Returned
     * 
     * 					 	only if DetailLevel = 4. ReservePrice is only returned for
     * 
     * 					 	auctions with a reserve price where the user calling GetItem
     * 
     * 					 	is the item's seller. Returned as null for International Fixed
     * 
     * 					 	Price items. For more information on reserve price auctions,
     * 
     * 					 	see http://pages.ebay.com/help/basics/f-format.html#1.
     */
    public void setReservePrice(CoreComponentTypes.apis.ebay.AmountType reservePrice) {
        this.reservePrice = reservePrice;
    }


    /**
     * Gets the reviseStatus value for this ItemType.
     * 
     * @return reviseStatus   * Revise Status contains information about the item being
     * 			                  revised.
     */
    public eBLBaseComponents.apis.ebay.ReviseStatusType getReviseStatus() {
        return reviseStatus;
    }


    /**
     * Sets the reviseStatus value for this ItemType.
     * 
     * @param reviseStatus   * Revise Status contains information about the item being
     * 			                  revised.
     */
    public void setReviseStatus(eBLBaseComponents.apis.ebay.ReviseStatusType reviseStatus) {
        this.reviseStatus = reviseStatus;
    }


    /**
     * Gets the scheduleTime value for this ItemType.
     * 
     * @return scheduleTime
     */
    public java.util.Calendar getScheduleTime() {
        return scheduleTime;
    }


    /**
     * Sets the scheduleTime value for this ItemType.
     * 
     * @param scheduleTime
     */
    public void setScheduleTime(java.util.Calendar scheduleTime) {
        this.scheduleTime = scheduleTime;
    }


    /**
     * Gets the secondaryCategory value for this ItemType.
     * 
     * @return secondaryCategory   * Container for data on the secondary category of listing. 
     * 			            		Secondary category is optional.
     */
    public eBLBaseComponents.apis.ebay.CategoryType getSecondaryCategory() {
        return secondaryCategory;
    }


    /**
     * Sets the secondaryCategory value for this ItemType.
     * 
     * @param secondaryCategory   * Container for data on the secondary category of listing. 
     * 			            		Secondary category is optional.
     */
    public void setSecondaryCategory(eBLBaseComponents.apis.ebay.CategoryType secondaryCategory) {
        this.secondaryCategory = secondaryCategory;
    }


    /**
     * Gets the siteHostedPicture value for this ItemType.
     * 
     * @return siteHostedPicture   * Item picture information for pictures hosted at eBay site.
     */
    public eBLBaseComponents.apis.ebay.SiteHostedPictureType getSiteHostedPicture() {
        return siteHostedPicture;
    }


    /**
     * Sets the siteHostedPicture value for this ItemType.
     * 
     * @param siteHostedPicture   * Item picture information for pictures hosted at eBay site.
     */
    public void setSiteHostedPicture(eBLBaseComponents.apis.ebay.SiteHostedPictureType siteHostedPicture) {
        this.siteHostedPicture = siteHostedPicture;
    }


    /**
     * Gets the seller value for this ItemType.
     * 
     * @return seller   * Seller user.
     */
    public eBLBaseComponents.apis.ebay.UserType getSeller() {
        return seller;
    }


    /**
     * Sets the seller value for this ItemType.
     * 
     * @param seller   * Seller user.
     */
    public void setSeller(eBLBaseComponents.apis.ebay.UserType seller) {
        this.seller = seller;
    }


    /**
     * Gets the sellingStatus value for this ItemType.
     * 
     * @return sellingStatus   * Container for for selling status information (e.g., BidCount,
     * 			            		BidIncrement, HighBidder, MinimimumToBid, etc).
     */
    public eBLBaseComponents.apis.ebay.SellingStatusType getSellingStatus() {
        return sellingStatus;
    }


    /**
     * Sets the sellingStatus value for this ItemType.
     * 
     * @param sellingStatus   * Container for for selling status information (e.g., BidCount,
     * 			            		BidIncrement, HighBidder, MinimimumToBid, etc).
     */
    public void setSellingStatus(eBLBaseComponents.apis.ebay.SellingStatusType sellingStatus) {
        this.sellingStatus = sellingStatus;
    }


    /**
     * Gets the shippingOption value for this ItemType.
     * 
     * @return shippingOption   * Specifies where the seller is willing to ship the item. 
     * 			               		Default "SiteOnly". Valid values are: 
     * 			               	 	SiteOnly (the default)
     *     						 	WorldWide
     *     						 	SitePlusRegions
     *     							 WillNotShip
     * 					 	If SitePlusRegions is selected, then at least one 
     * 					 	regions argument (ShipToNorthAmerica, ShipToEurope, 
     * 					 	etc.) must also be set.
     */
    public eBLBaseComponents.apis.ebay.ShippingOptionCodeType getShippingOption() {
        return shippingOption;
    }


    /**
     * Sets the shippingOption value for this ItemType.
     * 
     * @param shippingOption   * Specifies where the seller is willing to ship the item. 
     * 			               		Default "SiteOnly". Valid values are: 
     * 			               	 	SiteOnly (the default)
     *     						 	WorldWide
     *     						 	SitePlusRegions
     *     							 WillNotShip
     * 					 	If SitePlusRegions is selected, then at least one 
     * 					 	regions argument (ShipToNorthAmerica, ShipToEurope, 
     * 					 	etc.) must also be set.
     */
    public void setShippingOption(eBLBaseComponents.apis.ebay.ShippingOptionCodeType shippingOption) {
        this.shippingOption = shippingOption;
    }


    /**
     * Gets the shippingDetails value for this ItemType.
     * 
     * @return shippingDetails   * Contains the shipping payment related information for the 
     *                               	  	listed item.
     */
    public eBLBaseComponents.apis.ebay.ShippingDetailsType getShippingDetails() {
        return shippingDetails;
    }


    /**
     * Sets the shippingDetails value for this ItemType.
     * 
     * @param shippingDetails   * Contains the shipping payment related information for the 
     *                               	  	listed item.
     */
    public void setShippingDetails(eBLBaseComponents.apis.ebay.ShippingDetailsType shippingDetails) {
        this.shippingDetails = shippingDetails;
    }


    /**
     * Gets the shippingRegions value for this ItemType.
     * 
     * @return shippingRegions   * Regions that seller will ship to.
     */
    public eBLBaseComponents.apis.ebay.ShippingRegionCodeType[] getShippingRegions() {
        return shippingRegions;
    }


    /**
     * Sets the shippingRegions value for this ItemType.
     * 
     * @param shippingRegions   * Regions that seller will ship to.
     */
    public void setShippingRegions(eBLBaseComponents.apis.ebay.ShippingRegionCodeType[] shippingRegions) {
        this.shippingRegions = shippingRegions;
    }

    public eBLBaseComponents.apis.ebay.ShippingRegionCodeType getShippingRegions(int i) {
        return this.shippingRegions[i];
    }

    public void setShippingRegions(int i, eBLBaseComponents.apis.ebay.ShippingRegionCodeType _value) {
        this.shippingRegions[i] = _value;
    }


    /**
     * Gets the shippingTerms value for this ItemType.
     * 
     * @return shippingTerms   * Describes who pays for the delivery of an item (e.g., buyer
     * 
     * 			               	or seller).
     */
    public eBLBaseComponents.apis.ebay.ShippingTermsCodeType getShippingTerms() {
        return shippingTerms;
    }


    /**
     * Sets the shippingTerms value for this ItemType.
     * 
     * @param shippingTerms   * Describes who pays for the delivery of an item (e.g., buyer
     * 
     * 			               	or seller).
     */
    public void setShippingTerms(eBLBaseComponents.apis.ebay.ShippingTermsCodeType shippingTerms) {
        this.shippingTerms = shippingTerms;
    }


    /**
     * Gets the site value for this ItemType.
     * 
     * @return site   * eBay site on which item is listed.
     */
    public eBLBaseComponents.apis.ebay.SiteCodeType getSite() {
        return site;
    }


    /**
     * Sets the site value for this ItemType.
     * 
     * @param site   * eBay site on which item is listed.
     */
    public void setSite(eBLBaseComponents.apis.ebay.SiteCodeType site) {
        this.site = site;
    }


    /**
     * Gets the startPrice value for this ItemType.
     * 
     * @return startPrice   * Starting price for the item. For Type=7 or Type=9 (Fixed Price)
     * 
     * 			            		items, if the item price (MinimumBid) is revised,
     * this field 
     * 			            		returns the new price.
     */
    public CoreComponentTypes.apis.ebay.AmountType getStartPrice() {
        return startPrice;
    }


    /**
     * Sets the startPrice value for this ItemType.
     * 
     * @param startPrice   * Starting price for the item. For Type=7 or Type=9 (Fixed Price)
     * 
     * 			            		items, if the item price (MinimumBid) is revised,
     * this field 
     * 			            		returns the new price.
     */
    public void setStartPrice(CoreComponentTypes.apis.ebay.AmountType startPrice) {
        this.startPrice = startPrice;
    }


    /**
     * Gets the storefront value for this ItemType.
     * 
     * @return storefront   * Storefront is shown for any item that 
     * 			             		belongs to an eBay Store owner, regardless of 
     * 			             		whether it is fixed price or auction type.  Not
     * 
     * 			             		returned for International Fixed Price items.
     */
    public eBLBaseComponents.apis.ebay.StorefrontType getStorefront() {
        return storefront;
    }


    /**
     * Sets the storefront value for this ItemType.
     * 
     * @param storefront   * Storefront is shown for any item that 
     * 			             		belongs to an eBay Store owner, regardless of 
     * 			             		whether it is fixed price or auction type.  Not
     * 
     * 			             		returned for International Fixed Price items.
     */
    public void setStorefront(eBLBaseComponents.apis.ebay.StorefrontType storefront) {
        this.storefront = storefront;
    }


    /**
     * Gets the subTitle value for this ItemType.
     * 
     * @return subTitle   * Subtitle to use in addition to the title. Provides more keywords
     * when buyers search in titles and descriptions.
     */
    public java.lang.String getSubTitle() {
        return subTitle;
    }


    /**
     * Sets the subTitle value for this ItemType.
     * 
     * @param subTitle   * Subtitle to use in addition to the title. Provides more keywords
     * when buyers search in titles and descriptions.
     */
    public void setSubTitle(java.lang.String subTitle) {
        this.subTitle = subTitle;
    }


    /**
     * Gets the timeLeft value for this ItemType.
     * 
     * @return timeLeft   * Time until the the end of the listing (e.g., the amount of
     * time left 
     * 			              	in an active auction).
     */
    public org.apache.axis.types.Duration getTimeLeft() {
        return timeLeft;
    }


    /**
     * Sets the timeLeft value for this ItemType.
     * 
     * @param timeLeft   * Time until the the end of the listing (e.g., the amount of
     * time left 
     * 			              	in an active auction).
     */
    public void setTimeLeft(org.apache.axis.types.Duration timeLeft) {
        this.timeLeft = timeLeft;
    }


    /**
     * Gets the title value for this ItemType.
     * 
     * @return title   * Name of the item as it appears for auctions.
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ItemType.
     * 
     * @param title   * Name of the item as it appears for auctions.
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the UUID value for this ItemType.
     * 
     * @return UUID   * Universally unique constraint tag. The UUID is unique to a
     * category.
     */
    public java.lang.String getUUID() {
        return UUID;
    }


    /**
     * Sets the UUID value for this ItemType.
     * 
     * @param UUID   * Universally unique constraint tag. The UUID is unique to a
     * category.
     */
    public void setUUID(java.lang.String UUID) {
        this.UUID = UUID;
    }


    /**
     * Gets the VATDetails value for this ItemType.
     * 
     * @return VATDetails   * VAT info container.
     */
    public eBLBaseComponents.apis.ebay.VATDetailsType getVATDetails() {
        return VATDetails;
    }


    /**
     * Sets the VATDetails value for this ItemType.
     * 
     * @param VATDetails   * VAT info container.
     */
    public void setVATDetails(eBLBaseComponents.apis.ebay.VATDetailsType VATDetails) {
        this.VATDetails = VATDetails;
    }


    /**
     * Gets the vendorHostedPicture value for this ItemType.
     * 
     * @return vendorHostedPicture   * Item picture information for pictures hosted at vendor (i.e.,
     * remote) site.
     */
    public eBLBaseComponents.apis.ebay.VendorHostedPictureType getVendorHostedPicture() {
        return vendorHostedPicture;
    }


    /**
     * Sets the vendorHostedPicture value for this ItemType.
     * 
     * @param vendorHostedPicture   * Item picture information for pictures hosted at vendor (i.e.,
     * remote) site.
     */
    public void setVendorHostedPicture(eBLBaseComponents.apis.ebay.VendorHostedPictureType vendorHostedPicture) {
        this.vendorHostedPicture = vendorHostedPicture;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemType)) return false;
        ItemType other = (ItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationData==null && other.getApplicationData()==null) || 
             (this.applicationData!=null &&
              this.applicationData.equals(other.getApplicationData()))) &&
            ((this.listOfAttributeSets==null && other.getListOfAttributeSets()==null) || 
             (this.listOfAttributeSets!=null &&
              java.util.Arrays.equals(this.listOfAttributeSets, other.getListOfAttributeSets()))) &&
            ((this.autoPay==null && other.getAutoPay()==null) || 
             (this.autoPay!=null &&
              this.autoPay.equals(other.getAutoPay()))) &&
            ((this.buyerProtection==null && other.getBuyerProtection()==null) || 
             (this.buyerProtection!=null &&
              this.buyerProtection.equals(other.getBuyerProtection()))) &&
            ((this.buyItNowPrice==null && other.getBuyItNowPrice()==null) || 
             (this.buyItNowPrice!=null &&
              this.buyItNowPrice.equals(other.getBuyItNowPrice()))) &&
            ((this.charity==null && other.getCharity()==null) || 
             (this.charity!=null &&
              this.charity.equals(other.getCharity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.crossPromotion==null && other.getCrossPromotion()==null) || 
             (this.crossPromotion!=null &&
              this.crossPromotion.equals(other.getCrossPromotion()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.escrow==null && other.getEscrow()==null) || 
             (this.escrow!=null &&
              this.escrow.equals(other.getEscrow()))) &&
            ((this.giftIcon==null && other.getGiftIcon()==null) || 
             (this.giftIcon!=null &&
              this.giftIcon.equals(other.getGiftIcon()))) &&
            ((this.giftServices==null && other.getGiftServices()==null) || 
             (this.giftServices!=null &&
              java.util.Arrays.equals(this.giftServices, other.getGiftServices()))) &&
            ((this.hitCounter==null && other.getHitCounter()==null) || 
             (this.hitCounter!=null &&
              this.hitCounter.equals(other.getHitCounter()))) &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.listingDetails==null && other.getListingDetails()==null) || 
             (this.listingDetails!=null &&
              this.listingDetails.equals(other.getListingDetails()))) &&
            ((this.listingDesigner==null && other.getListingDesigner()==null) || 
             (this.listingDesigner!=null &&
              this.listingDesigner.equals(other.getListingDesigner()))) &&
            ((this.listingDuration==null && other.getListingDuration()==null) || 
             (this.listingDuration!=null &&
              this.listingDuration.equals(other.getListingDuration()))) &&
            ((this.listingEnhancement==null && other.getListingEnhancement()==null) || 
             (this.listingEnhancement!=null &&
              java.util.Arrays.equals(this.listingEnhancement, other.getListingEnhancement()))) &&
            ((this.listingType==null && other.getListingType()==null) || 
             (this.listingType!=null &&
              this.listingType.equals(other.getListingType()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.partnerCode==null && other.getPartnerCode()==null) || 
             (this.partnerCode!=null &&
              this.partnerCode.equals(other.getPartnerCode()))) &&
            ((this.partnerName==null && other.getPartnerName()==null) || 
             (this.partnerName!=null &&
              this.partnerName.equals(other.getPartnerName()))) &&
            ((this.paymentMethods==null && other.getPaymentMethods()==null) || 
             (this.paymentMethods!=null &&
              java.util.Arrays.equals(this.paymentMethods, other.getPaymentMethods()))) &&
            ((this.payPalEmailAddress==null && other.getPayPalEmailAddress()==null) || 
             (this.payPalEmailAddress!=null &&
              this.payPalEmailAddress.equals(other.getPayPalEmailAddress()))) &&
            ((this.primaryCategory==null && other.getPrimaryCategory()==null) || 
             (this.primaryCategory!=null &&
              this.primaryCategory.equals(other.getPrimaryCategory()))) &&
            ((this.privateListing==null && other.getPrivateListing()==null) || 
             (this.privateListing!=null &&
              this.privateListing.equals(other.getPrivateListing()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.regionID==null && other.getRegionID()==null) || 
             (this.regionID!=null &&
              this.regionID.equals(other.getRegionID()))) &&
            ((this.relistLink==null && other.getRelistLink()==null) || 
             (this.relistLink!=null &&
              this.relistLink.equals(other.getRelistLink()))) &&
            ((this.reservePrice==null && other.getReservePrice()==null) || 
             (this.reservePrice!=null &&
              this.reservePrice.equals(other.getReservePrice()))) &&
            ((this.reviseStatus==null && other.getReviseStatus()==null) || 
             (this.reviseStatus!=null &&
              this.reviseStatus.equals(other.getReviseStatus()))) &&
            ((this.scheduleTime==null && other.getScheduleTime()==null) || 
             (this.scheduleTime!=null &&
              this.scheduleTime.equals(other.getScheduleTime()))) &&
            ((this.secondaryCategory==null && other.getSecondaryCategory()==null) || 
             (this.secondaryCategory!=null &&
              this.secondaryCategory.equals(other.getSecondaryCategory()))) &&
            ((this.siteHostedPicture==null && other.getSiteHostedPicture()==null) || 
             (this.siteHostedPicture!=null &&
              this.siteHostedPicture.equals(other.getSiteHostedPicture()))) &&
            ((this.seller==null && other.getSeller()==null) || 
             (this.seller!=null &&
              this.seller.equals(other.getSeller()))) &&
            ((this.sellingStatus==null && other.getSellingStatus()==null) || 
             (this.sellingStatus!=null &&
              this.sellingStatus.equals(other.getSellingStatus()))) &&
            ((this.shippingOption==null && other.getShippingOption()==null) || 
             (this.shippingOption!=null &&
              this.shippingOption.equals(other.getShippingOption()))) &&
            ((this.shippingDetails==null && other.getShippingDetails()==null) || 
             (this.shippingDetails!=null &&
              this.shippingDetails.equals(other.getShippingDetails()))) &&
            ((this.shippingRegions==null && other.getShippingRegions()==null) || 
             (this.shippingRegions!=null &&
              java.util.Arrays.equals(this.shippingRegions, other.getShippingRegions()))) &&
            ((this.shippingTerms==null && other.getShippingTerms()==null) || 
             (this.shippingTerms!=null &&
              this.shippingTerms.equals(other.getShippingTerms()))) &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite()))) &&
            ((this.startPrice==null && other.getStartPrice()==null) || 
             (this.startPrice!=null &&
              this.startPrice.equals(other.getStartPrice()))) &&
            ((this.storefront==null && other.getStorefront()==null) || 
             (this.storefront!=null &&
              this.storefront.equals(other.getStorefront()))) &&
            ((this.subTitle==null && other.getSubTitle()==null) || 
             (this.subTitle!=null &&
              this.subTitle.equals(other.getSubTitle()))) &&
            ((this.timeLeft==null && other.getTimeLeft()==null) || 
             (this.timeLeft!=null &&
              this.timeLeft.equals(other.getTimeLeft()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.UUID==null && other.getUUID()==null) || 
             (this.UUID!=null &&
              this.UUID.equals(other.getUUID()))) &&
            ((this.VATDetails==null && other.getVATDetails()==null) || 
             (this.VATDetails!=null &&
              this.VATDetails.equals(other.getVATDetails()))) &&
            ((this.vendorHostedPicture==null && other.getVendorHostedPicture()==null) || 
             (this.vendorHostedPicture!=null &&
              this.vendorHostedPicture.equals(other.getVendorHostedPicture())));
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
        if (getApplicationData() != null) {
            _hashCode += getApplicationData().hashCode();
        }
        if (getListOfAttributeSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfAttributeSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfAttributeSets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutoPay() != null) {
            _hashCode += getAutoPay().hashCode();
        }
        if (getBuyerProtection() != null) {
            _hashCode += getBuyerProtection().hashCode();
        }
        if (getBuyItNowPrice() != null) {
            _hashCode += getBuyItNowPrice().hashCode();
        }
        if (getCharity() != null) {
            _hashCode += getCharity().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCrossPromotion() != null) {
            _hashCode += getCrossPromotion().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEscrow() != null) {
            _hashCode += getEscrow().hashCode();
        }
        if (getGiftIcon() != null) {
            _hashCode += getGiftIcon().hashCode();
        }
        if (getGiftServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHitCounter() != null) {
            _hashCode += getHitCounter().hashCode();
        }
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getListingDetails() != null) {
            _hashCode += getListingDetails().hashCode();
        }
        if (getListingDesigner() != null) {
            _hashCode += getListingDesigner().hashCode();
        }
        if (getListingDuration() != null) {
            _hashCode += getListingDuration().hashCode();
        }
        if (getListingEnhancement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListingEnhancement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListingEnhancement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListingType() != null) {
            _hashCode += getListingType().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getPartnerCode() != null) {
            _hashCode += getPartnerCode().hashCode();
        }
        if (getPartnerName() != null) {
            _hashCode += getPartnerName().hashCode();
        }
        if (getPaymentMethods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentMethods());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentMethods(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayPalEmailAddress() != null) {
            _hashCode += getPayPalEmailAddress().hashCode();
        }
        if (getPrimaryCategory() != null) {
            _hashCode += getPrimaryCategory().hashCode();
        }
        if (getPrivateListing() != null) {
            _hashCode += getPrivateListing().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRegionID() != null) {
            _hashCode += getRegionID().hashCode();
        }
        if (getRelistLink() != null) {
            _hashCode += getRelistLink().hashCode();
        }
        if (getReservePrice() != null) {
            _hashCode += getReservePrice().hashCode();
        }
        if (getReviseStatus() != null) {
            _hashCode += getReviseStatus().hashCode();
        }
        if (getScheduleTime() != null) {
            _hashCode += getScheduleTime().hashCode();
        }
        if (getSecondaryCategory() != null) {
            _hashCode += getSecondaryCategory().hashCode();
        }
        if (getSiteHostedPicture() != null) {
            _hashCode += getSiteHostedPicture().hashCode();
        }
        if (getSeller() != null) {
            _hashCode += getSeller().hashCode();
        }
        if (getSellingStatus() != null) {
            _hashCode += getSellingStatus().hashCode();
        }
        if (getShippingOption() != null) {
            _hashCode += getShippingOption().hashCode();
        }
        if (getShippingDetails() != null) {
            _hashCode += getShippingDetails().hashCode();
        }
        if (getShippingRegions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingRegions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingRegions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShippingTerms() != null) {
            _hashCode += getShippingTerms().hashCode();
        }
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        if (getStartPrice() != null) {
            _hashCode += getStartPrice().hashCode();
        }
        if (getStorefront() != null) {
            _hashCode += getStorefront().hashCode();
        }
        if (getSubTitle() != null) {
            _hashCode += getSubTitle().hashCode();
        }
        if (getTimeLeft() != null) {
            _hashCode += getTimeLeft().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUUID() != null) {
            _hashCode += getUUID().hashCode();
        }
        if (getVATDetails() != null) {
            _hashCode += getVATDetails().hashCode();
        }
        if (getVendorHostedPicture() != null) {
            _hashCode += getVendorHostedPicture().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ApplicationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfAttributeSets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListOfAttributeSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AttributeSetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AttributeSet"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AutoPay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerProtection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerProtection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerProtectionCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyItNowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyItNowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Charity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CharityType"));
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
        elemField.setFieldName("crossPromotion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CrossPromotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CrossPromotionsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CurrencyCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escrow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Escrow"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EscrowCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftServices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftServicesCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hitCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "HitCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "HitCounterCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemIDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listingDesigner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingDesigner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingDesignerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listingDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingDurationCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listingEnhancement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingEnhancement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingEnhancementsCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingTypeCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PartnerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PartnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethods");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentMethods"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentMethods"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayPalEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PrimaryCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CategoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateListing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PrivateListing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RegionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relistLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RelistLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReservePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReviseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReviseStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ScheduleTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SecondaryCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CategoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteHostedPicture");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SiteHostedPicture"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SiteHostedPictureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seller");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Seller"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellingStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingOptionCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingRegions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingRegions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingRegions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingTermsCodeType"));
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
        elemField.setFieldName("startPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StartPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storefront");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Storefront"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StorefrontType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SubTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TimeLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "UUIDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VATDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VATDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VATDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorHostedPicture");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VendorHostedPicture"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VendorHostedPictureType"));
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
