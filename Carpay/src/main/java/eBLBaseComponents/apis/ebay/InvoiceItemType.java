/**
 * InvoiceItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Describes an individual item for an invoice.
 */
public class InvoiceItemType  implements java.io.Serializable {
    /* a human readable item nameOptional
     * 								Character length and limits: 127 single-byte characters */
    private java.lang.String name;

    /* a human readable item descriptionOptional
     * 								Character length and limits: 127 single-byte characters */
    private java.lang.String description;

    /* The International Article Number or 
     * 								Universal Product Code (UPC) for the item.
     * 								Empty string is allowed.
     * 								Character length and limits: 17 single-byte characters */
    private java.lang.String EAN;

    /* The Stock-Keeping Unit or other identification 
     * 								code assigned to the item.
     * 								Character length and limits: 64 single-byte characters */
    private java.lang.String SKU;

    /* A retailer could apply different return policies on different
     * items.
     * 								Each return policy would be identified using a label or identifier.
     * 								This return policy identifier should be set here.  
     * 								This identifier will be displayed next to the item in the
     * e-Receipt.
     * 								Character length and limits: 8 single-byte characters */
    private java.lang.String returnPolicyIdentifier;

    /* total price of this item */
    private CoreComponentTypes.apis.ebay.BasicAmountType price;

    /* price per item quantity */
    private CoreComponentTypes.apis.ebay.BasicAmountType itemPrice;

    /* quantity of the item (non-negative) */
    private java.lang.Double itemCount;

    /* Unit of measure for the itemCount */
    private eBLBaseComponents.apis.ebay.UnitOfMeasure itemCountUnit;

    /* discount applied to this item */
    private eBLBaseComponents.apis.ebay.DiscountType[] discount;

    /* identifies whether this item is taxable or not.  
     * 								If not passed, this will be assumed to be true. */
    private java.lang.Boolean taxable;

    /* The tax percentage applied to the item.
     * 								This is only used for displaying in the receipt, it is not
     * used in pricing calculations.
     * 								Note: we have totalTax at invoice level. It's up to the caller
     * to do the calculations for setting that other element. */
    private java.lang.Double taxRate;

    /* Additional fees to this item */
    private eBLBaseComponents.apis.ebay.AdditionalFeeType[] additionalFees;

    /* identifies whether this is reimbursable or not.
     * 								If not pass, this will be assumed to be true. */
    private java.lang.Boolean reimbursable;

    /* Manufacturer part number. */
    private java.lang.String MPN;

    /* International Standard Book Number.
     * 								Reference http://en.wikipedia.org/wiki/ISBN
     * 								Character length and limits: 32 single-byte characters */
    private java.lang.String ISBN;

    /* Price Look-Up code
     * 								Reference http://en.wikipedia.org/wiki/Price_Look-Up_code
     * 								Character length and limits: 5 single-byte characters */
    private java.lang.String PLU;

    /* Character length and limits: 32 single-byte characters */
    private java.lang.String modelNumber;

    /* Character length and limits: 32 single-byte characters */
    private java.lang.String styleNumber;

    public InvoiceItemType() {
    }

    public InvoiceItemType(
           java.lang.String name,
           java.lang.String description,
           java.lang.String EAN,
           java.lang.String SKU,
           java.lang.String returnPolicyIdentifier,
           CoreComponentTypes.apis.ebay.BasicAmountType price,
           CoreComponentTypes.apis.ebay.BasicAmountType itemPrice,
           java.lang.Double itemCount,
           eBLBaseComponents.apis.ebay.UnitOfMeasure itemCountUnit,
           eBLBaseComponents.apis.ebay.DiscountType[] discount,
           java.lang.Boolean taxable,
           java.lang.Double taxRate,
           eBLBaseComponents.apis.ebay.AdditionalFeeType[] additionalFees,
           java.lang.Boolean reimbursable,
           java.lang.String MPN,
           java.lang.String ISBN,
           java.lang.String PLU,
           java.lang.String modelNumber,
           java.lang.String styleNumber) {
           this.name = name;
           this.description = description;
           this.EAN = EAN;
           this.SKU = SKU;
           this.returnPolicyIdentifier = returnPolicyIdentifier;
           this.price = price;
           this.itemPrice = itemPrice;
           this.itemCount = itemCount;
           this.itemCountUnit = itemCountUnit;
           this.discount = discount;
           this.taxable = taxable;
           this.taxRate = taxRate;
           this.additionalFees = additionalFees;
           this.reimbursable = reimbursable;
           this.MPN = MPN;
           this.ISBN = ISBN;
           this.PLU = PLU;
           this.modelNumber = modelNumber;
           this.styleNumber = styleNumber;
    }


    /**
     * Gets the name value for this InvoiceItemType.
     * 
     * @return name   * a human readable item nameOptional
     * 								Character length and limits: 127 single-byte characters
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this InvoiceItemType.
     * 
     * @param name   * a human readable item nameOptional
     * 								Character length and limits: 127 single-byte characters
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this InvoiceItemType.
     * 
     * @return description   * a human readable item descriptionOptional
     * 								Character length and limits: 127 single-byte characters
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this InvoiceItemType.
     * 
     * @param description   * a human readable item descriptionOptional
     * 								Character length and limits: 127 single-byte characters
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the EAN value for this InvoiceItemType.
     * 
     * @return EAN   * The International Article Number or 
     * 								Universal Product Code (UPC) for the item.
     * 								Empty string is allowed.
     * 								Character length and limits: 17 single-byte characters
     */
    public java.lang.String getEAN() {
        return EAN;
    }


    /**
     * Sets the EAN value for this InvoiceItemType.
     * 
     * @param EAN   * The International Article Number or 
     * 								Universal Product Code (UPC) for the item.
     * 								Empty string is allowed.
     * 								Character length and limits: 17 single-byte characters
     */
    public void setEAN(java.lang.String EAN) {
        this.EAN = EAN;
    }


    /**
     * Gets the SKU value for this InvoiceItemType.
     * 
     * @return SKU   * The Stock-Keeping Unit or other identification 
     * 								code assigned to the item.
     * 								Character length and limits: 64 single-byte characters
     */
    public java.lang.String getSKU() {
        return SKU;
    }


    /**
     * Sets the SKU value for this InvoiceItemType.
     * 
     * @param SKU   * The Stock-Keeping Unit or other identification 
     * 								code assigned to the item.
     * 								Character length and limits: 64 single-byte characters
     */
    public void setSKU(java.lang.String SKU) {
        this.SKU = SKU;
    }


    /**
     * Gets the returnPolicyIdentifier value for this InvoiceItemType.
     * 
     * @return returnPolicyIdentifier   * A retailer could apply different return policies on different
     * items.
     * 								Each return policy would be identified using a label or identifier.
     * 								This return policy identifier should be set here.  
     * 								This identifier will be displayed next to the item in the
     * e-Receipt.
     * 								Character length and limits: 8 single-byte characters
     */
    public java.lang.String getReturnPolicyIdentifier() {
        return returnPolicyIdentifier;
    }


    /**
     * Sets the returnPolicyIdentifier value for this InvoiceItemType.
     * 
     * @param returnPolicyIdentifier   * A retailer could apply different return policies on different
     * items.
     * 								Each return policy would be identified using a label or identifier.
     * 								This return policy identifier should be set here.  
     * 								This identifier will be displayed next to the item in the
     * e-Receipt.
     * 								Character length and limits: 8 single-byte characters
     */
    public void setReturnPolicyIdentifier(java.lang.String returnPolicyIdentifier) {
        this.returnPolicyIdentifier = returnPolicyIdentifier;
    }


    /**
     * Gets the price value for this InvoiceItemType.
     * 
     * @return price   * total price of this item
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getPrice() {
        return price;
    }


    /**
     * Sets the price value for this InvoiceItemType.
     * 
     * @param price   * total price of this item
     */
    public void setPrice(CoreComponentTypes.apis.ebay.BasicAmountType price) {
        this.price = price;
    }


    /**
     * Gets the itemPrice value for this InvoiceItemType.
     * 
     * @return itemPrice   * price per item quantity
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getItemPrice() {
        return itemPrice;
    }


    /**
     * Sets the itemPrice value for this InvoiceItemType.
     * 
     * @param itemPrice   * price per item quantity
     */
    public void setItemPrice(CoreComponentTypes.apis.ebay.BasicAmountType itemPrice) {
        this.itemPrice = itemPrice;
    }


    /**
     * Gets the itemCount value for this InvoiceItemType.
     * 
     * @return itemCount   * quantity of the item (non-negative)
     */
    public java.lang.Double getItemCount() {
        return itemCount;
    }


    /**
     * Sets the itemCount value for this InvoiceItemType.
     * 
     * @param itemCount   * quantity of the item (non-negative)
     */
    public void setItemCount(java.lang.Double itemCount) {
        this.itemCount = itemCount;
    }


    /**
     * Gets the itemCountUnit value for this InvoiceItemType.
     * 
     * @return itemCountUnit   * Unit of measure for the itemCount
     */
    public eBLBaseComponents.apis.ebay.UnitOfMeasure getItemCountUnit() {
        return itemCountUnit;
    }


    /**
     * Sets the itemCountUnit value for this InvoiceItemType.
     * 
     * @param itemCountUnit   * Unit of measure for the itemCount
     */
    public void setItemCountUnit(eBLBaseComponents.apis.ebay.UnitOfMeasure itemCountUnit) {
        this.itemCountUnit = itemCountUnit;
    }


    /**
     * Gets the discount value for this InvoiceItemType.
     * 
     * @return discount   * discount applied to this item
     */
    public eBLBaseComponents.apis.ebay.DiscountType[] getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this InvoiceItemType.
     * 
     * @param discount   * discount applied to this item
     */
    public void setDiscount(eBLBaseComponents.apis.ebay.DiscountType[] discount) {
        this.discount = discount;
    }

    public eBLBaseComponents.apis.ebay.DiscountType getDiscount(int i) {
        return this.discount[i];
    }

    public void setDiscount(int i, eBLBaseComponents.apis.ebay.DiscountType _value) {
        this.discount[i] = _value;
    }


    /**
     * Gets the taxable value for this InvoiceItemType.
     * 
     * @return taxable   * identifies whether this item is taxable or not.  
     * 								If not passed, this will be assumed to be true.
     */
    public java.lang.Boolean getTaxable() {
        return taxable;
    }


    /**
     * Sets the taxable value for this InvoiceItemType.
     * 
     * @param taxable   * identifies whether this item is taxable or not.  
     * 								If not passed, this will be assumed to be true.
     */
    public void setTaxable(java.lang.Boolean taxable) {
        this.taxable = taxable;
    }


    /**
     * Gets the taxRate value for this InvoiceItemType.
     * 
     * @return taxRate   * The tax percentage applied to the item.
     * 								This is only used for displaying in the receipt, it is not
     * used in pricing calculations.
     * 								Note: we have totalTax at invoice level. It's up to the caller
     * to do the calculations for setting that other element.
     */
    public java.lang.Double getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this InvoiceItemType.
     * 
     * @param taxRate   * The tax percentage applied to the item.
     * 								This is only used for displaying in the receipt, it is not
     * used in pricing calculations.
     * 								Note: we have totalTax at invoice level. It's up to the caller
     * to do the calculations for setting that other element.
     */
    public void setTaxRate(java.lang.Double taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the additionalFees value for this InvoiceItemType.
     * 
     * @return additionalFees   * Additional fees to this item
     */
    public eBLBaseComponents.apis.ebay.AdditionalFeeType[] getAdditionalFees() {
        return additionalFees;
    }


    /**
     * Sets the additionalFees value for this InvoiceItemType.
     * 
     * @param additionalFees   * Additional fees to this item
     */
    public void setAdditionalFees(eBLBaseComponents.apis.ebay.AdditionalFeeType[] additionalFees) {
        this.additionalFees = additionalFees;
    }

    public eBLBaseComponents.apis.ebay.AdditionalFeeType getAdditionalFees(int i) {
        return this.additionalFees[i];
    }

    public void setAdditionalFees(int i, eBLBaseComponents.apis.ebay.AdditionalFeeType _value) {
        this.additionalFees[i] = _value;
    }


    /**
     * Gets the reimbursable value for this InvoiceItemType.
     * 
     * @return reimbursable   * identifies whether this is reimbursable or not.
     * 								If not pass, this will be assumed to be true.
     */
    public java.lang.Boolean getReimbursable() {
        return reimbursable;
    }


    /**
     * Sets the reimbursable value for this InvoiceItemType.
     * 
     * @param reimbursable   * identifies whether this is reimbursable or not.
     * 								If not pass, this will be assumed to be true.
     */
    public void setReimbursable(java.lang.Boolean reimbursable) {
        this.reimbursable = reimbursable;
    }


    /**
     * Gets the MPN value for this InvoiceItemType.
     * 
     * @return MPN   * Manufacturer part number.
     */
    public java.lang.String getMPN() {
        return MPN;
    }


    /**
     * Sets the MPN value for this InvoiceItemType.
     * 
     * @param MPN   * Manufacturer part number.
     */
    public void setMPN(java.lang.String MPN) {
        this.MPN = MPN;
    }


    /**
     * Gets the ISBN value for this InvoiceItemType.
     * 
     * @return ISBN   * International Standard Book Number.
     * 								Reference http://en.wikipedia.org/wiki/ISBN
     * 								Character length and limits: 32 single-byte characters
     */
    public java.lang.String getISBN() {
        return ISBN;
    }


    /**
     * Sets the ISBN value for this InvoiceItemType.
     * 
     * @param ISBN   * International Standard Book Number.
     * 								Reference http://en.wikipedia.org/wiki/ISBN
     * 								Character length and limits: 32 single-byte characters
     */
    public void setISBN(java.lang.String ISBN) {
        this.ISBN = ISBN;
    }


    /**
     * Gets the PLU value for this InvoiceItemType.
     * 
     * @return PLU   * Price Look-Up code
     * 								Reference http://en.wikipedia.org/wiki/Price_Look-Up_code
     * 								Character length and limits: 5 single-byte characters
     */
    public java.lang.String getPLU() {
        return PLU;
    }


    /**
     * Sets the PLU value for this InvoiceItemType.
     * 
     * @param PLU   * Price Look-Up code
     * 								Reference http://en.wikipedia.org/wiki/Price_Look-Up_code
     * 								Character length and limits: 5 single-byte characters
     */
    public void setPLU(java.lang.String PLU) {
        this.PLU = PLU;
    }


    /**
     * Gets the modelNumber value for this InvoiceItemType.
     * 
     * @return modelNumber   * Character length and limits: 32 single-byte characters
     */
    public java.lang.String getModelNumber() {
        return modelNumber;
    }


    /**
     * Sets the modelNumber value for this InvoiceItemType.
     * 
     * @param modelNumber   * Character length and limits: 32 single-byte characters
     */
    public void setModelNumber(java.lang.String modelNumber) {
        this.modelNumber = modelNumber;
    }


    /**
     * Gets the styleNumber value for this InvoiceItemType.
     * 
     * @return styleNumber   * Character length and limits: 32 single-byte characters
     */
    public java.lang.String getStyleNumber() {
        return styleNumber;
    }


    /**
     * Sets the styleNumber value for this InvoiceItemType.
     * 
     * @param styleNumber   * Character length and limits: 32 single-byte characters
     */
    public void setStyleNumber(java.lang.String styleNumber) {
        this.styleNumber = styleNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceItemType)) return false;
        InvoiceItemType other = (InvoiceItemType) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.EAN==null && other.getEAN()==null) || 
             (this.EAN!=null &&
              this.EAN.equals(other.getEAN()))) &&
            ((this.SKU==null && other.getSKU()==null) || 
             (this.SKU!=null &&
              this.SKU.equals(other.getSKU()))) &&
            ((this.returnPolicyIdentifier==null && other.getReturnPolicyIdentifier()==null) || 
             (this.returnPolicyIdentifier!=null &&
              this.returnPolicyIdentifier.equals(other.getReturnPolicyIdentifier()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.itemPrice==null && other.getItemPrice()==null) || 
             (this.itemPrice!=null &&
              this.itemPrice.equals(other.getItemPrice()))) &&
            ((this.itemCount==null && other.getItemCount()==null) || 
             (this.itemCount!=null &&
              this.itemCount.equals(other.getItemCount()))) &&
            ((this.itemCountUnit==null && other.getItemCountUnit()==null) || 
             (this.itemCountUnit!=null &&
              this.itemCountUnit.equals(other.getItemCountUnit()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              java.util.Arrays.equals(this.discount, other.getDiscount()))) &&
            ((this.taxable==null && other.getTaxable()==null) || 
             (this.taxable!=null &&
              this.taxable.equals(other.getTaxable()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.additionalFees==null && other.getAdditionalFees()==null) || 
             (this.additionalFees!=null &&
              java.util.Arrays.equals(this.additionalFees, other.getAdditionalFees()))) &&
            ((this.reimbursable==null && other.getReimbursable()==null) || 
             (this.reimbursable!=null &&
              this.reimbursable.equals(other.getReimbursable()))) &&
            ((this.MPN==null && other.getMPN()==null) || 
             (this.MPN!=null &&
              this.MPN.equals(other.getMPN()))) &&
            ((this.ISBN==null && other.getISBN()==null) || 
             (this.ISBN!=null &&
              this.ISBN.equals(other.getISBN()))) &&
            ((this.PLU==null && other.getPLU()==null) || 
             (this.PLU!=null &&
              this.PLU.equals(other.getPLU()))) &&
            ((this.modelNumber==null && other.getModelNumber()==null) || 
             (this.modelNumber!=null &&
              this.modelNumber.equals(other.getModelNumber()))) &&
            ((this.styleNumber==null && other.getStyleNumber()==null) || 
             (this.styleNumber!=null &&
              this.styleNumber.equals(other.getStyleNumber())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEAN() != null) {
            _hashCode += getEAN().hashCode();
        }
        if (getSKU() != null) {
            _hashCode += getSKU().hashCode();
        }
        if (getReturnPolicyIdentifier() != null) {
            _hashCode += getReturnPolicyIdentifier().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getItemPrice() != null) {
            _hashCode += getItemPrice().hashCode();
        }
        if (getItemCount() != null) {
            _hashCode += getItemCount().hashCode();
        }
        if (getItemCountUnit() != null) {
            _hashCode += getItemCountUnit().hashCode();
        }
        if (getDiscount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxable() != null) {
            _hashCode += getTaxable().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getAdditionalFees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalFees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalFees(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReimbursable() != null) {
            _hashCode += getReimbursable().hashCode();
        }
        if (getMPN() != null) {
            _hashCode += getMPN().hashCode();
        }
        if (getISBN() != null) {
            _hashCode += getISBN().hashCode();
        }
        if (getPLU() != null) {
            _hashCode += getPLU().hashCode();
        }
        if (getModelNumber() != null) {
            _hashCode += getModelNumber().hashCode();
        }
        if (getStyleNumber() != null) {
            _hashCode += getStyleNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InvoiceItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("EAN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SKU");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnPolicyIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReturnPolicyIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCountUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemCountUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UnitOfMeasure"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DiscountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Taxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalFees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AdditionalFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AdditionalFeeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reimbursable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Reimbursable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MPN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MPN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISBN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ISBN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLU");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PLU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ModelNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("styleNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StyleNumber"));
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
