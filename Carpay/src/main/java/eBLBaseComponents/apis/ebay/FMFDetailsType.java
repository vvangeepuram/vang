/**
 * FMFDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Thes are filters that could result in accept/deny/pending action.
 */
public class FMFDetailsType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] acceptFilters;

    private eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] pendingFilters;

    private eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] denyFilters;

    private eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] reportFilters;

    public FMFDetailsType() {
    }

    public FMFDetailsType(
           eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] acceptFilters,
           eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] pendingFilters,
           eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] denyFilters,
           eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] reportFilters) {
           this.acceptFilters = acceptFilters;
           this.pendingFilters = pendingFilters;
           this.denyFilters = denyFilters;
           this.reportFilters = reportFilters;
    }


    /**
     * Gets the acceptFilters value for this FMFDetailsType.
     * 
     * @return acceptFilters
     */
    public eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] getAcceptFilters() {
        return acceptFilters;
    }


    /**
     * Sets the acceptFilters value for this FMFDetailsType.
     * 
     * @param acceptFilters
     */
    public void setAcceptFilters(eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] acceptFilters) {
        this.acceptFilters = acceptFilters;
    }


    /**
     * Gets the pendingFilters value for this FMFDetailsType.
     * 
     * @return pendingFilters
     */
    public eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] getPendingFilters() {
        return pendingFilters;
    }


    /**
     * Sets the pendingFilters value for this FMFDetailsType.
     * 
     * @param pendingFilters
     */
    public void setPendingFilters(eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] pendingFilters) {
        this.pendingFilters = pendingFilters;
    }


    /**
     * Gets the denyFilters value for this FMFDetailsType.
     * 
     * @return denyFilters
     */
    public eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] getDenyFilters() {
        return denyFilters;
    }


    /**
     * Sets the denyFilters value for this FMFDetailsType.
     * 
     * @param denyFilters
     */
    public void setDenyFilters(eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] denyFilters) {
        this.denyFilters = denyFilters;
    }


    /**
     * Gets the reportFilters value for this FMFDetailsType.
     * 
     * @return reportFilters
     */
    public eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] getReportFilters() {
        return reportFilters;
    }


    /**
     * Sets the reportFilters value for this FMFDetailsType.
     * 
     * @param reportFilters
     */
    public void setReportFilters(eBLBaseComponents.apis.ebay.RiskFilterDetailsType[] reportFilters) {
        this.reportFilters = reportFilters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FMFDetailsType)) return false;
        FMFDetailsType other = (FMFDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acceptFilters==null && other.getAcceptFilters()==null) || 
             (this.acceptFilters!=null &&
              java.util.Arrays.equals(this.acceptFilters, other.getAcceptFilters()))) &&
            ((this.pendingFilters==null && other.getPendingFilters()==null) || 
             (this.pendingFilters!=null &&
              java.util.Arrays.equals(this.pendingFilters, other.getPendingFilters()))) &&
            ((this.denyFilters==null && other.getDenyFilters()==null) || 
             (this.denyFilters!=null &&
              java.util.Arrays.equals(this.denyFilters, other.getDenyFilters()))) &&
            ((this.reportFilters==null && other.getReportFilters()==null) || 
             (this.reportFilters!=null &&
              java.util.Arrays.equals(this.reportFilters, other.getReportFilters())));
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
        if (getAcceptFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcceptFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcceptFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPendingFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPendingFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPendingFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDenyFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDenyFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDenyFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReportFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportFilters(), i);
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
        new org.apache.axis.description.TypeDesc(FMFDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FMFDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AcceptFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RiskFilterDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Filters"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PendingFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RiskFilterDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Filters"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denyFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DenyFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RiskFilterDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Filters"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReportFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RiskFilterDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Filters"));
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
