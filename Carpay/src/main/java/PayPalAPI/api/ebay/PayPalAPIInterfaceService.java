/**
 * PayPalAPIInterfaceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public interface PayPalAPIInterfaceService extends javax.xml.rpc.Service {
    public java.lang.String getPayPalAPIAddress();

    public PayPalAPI.api.ebay.PayPalAPIInterface getPayPalAPI() throws javax.xml.rpc.ServiceException;

    public PayPalAPI.api.ebay.PayPalAPIInterface getPayPalAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getPayPalAPIAAAddress();

    public PayPalAPI.api.ebay.PayPalAPIAAInterface getPayPalAPIAA() throws javax.xml.rpc.ServiceException;

    public PayPalAPI.api.ebay.PayPalAPIAAInterface getPayPalAPIAA(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
