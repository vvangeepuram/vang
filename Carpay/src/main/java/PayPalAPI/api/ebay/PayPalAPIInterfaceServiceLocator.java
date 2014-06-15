/**
 * PayPalAPIInterfaceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class PayPalAPIInterfaceServiceLocator extends org.apache.axis.client.Service implements PayPalAPI.api.ebay.PayPalAPIInterfaceService {

    public PayPalAPIInterfaceServiceLocator() {
    }


    public PayPalAPIInterfaceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PayPalAPIInterfaceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PayPalAPI
    private java.lang.String PayPalAPI_address = "https://api.sandbox.paypal.com/2.0/";

    public java.lang.String getPayPalAPIAddress() {
        return PayPalAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PayPalAPIWSDDServiceName = "PayPalAPI";

    public java.lang.String getPayPalAPIWSDDServiceName() {
        return PayPalAPIWSDDServiceName;
    }

    public void setPayPalAPIWSDDServiceName(java.lang.String name) {
        PayPalAPIWSDDServiceName = name;
    }

    public PayPalAPI.api.ebay.PayPalAPIInterface getPayPalAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PayPalAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPayPalAPI(endpoint);
    }

    public PayPalAPI.api.ebay.PayPalAPIInterface getPayPalAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PayPalAPI.api.ebay.PayPalAPISoapBindingStub _stub = new PayPalAPI.api.ebay.PayPalAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getPayPalAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPayPalAPIEndpointAddress(java.lang.String address) {
        PayPalAPI_address = address;
    }


    // Use to get a proxy class for PayPalAPIAA
    private java.lang.String PayPalAPIAA_address = "https://api-aa.sandbox.paypal.com/2.0/";

    public java.lang.String getPayPalAPIAAAddress() {
        return PayPalAPIAA_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PayPalAPIAAWSDDServiceName = "PayPalAPIAA";

    public java.lang.String getPayPalAPIAAWSDDServiceName() {
        return PayPalAPIAAWSDDServiceName;
    }

    public void setPayPalAPIAAWSDDServiceName(java.lang.String name) {
        PayPalAPIAAWSDDServiceName = name;
    }

    public PayPalAPI.api.ebay.PayPalAPIAAInterface getPayPalAPIAA() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PayPalAPIAA_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPayPalAPIAA(endpoint);
    }

    public PayPalAPI.api.ebay.PayPalAPIAAInterface getPayPalAPIAA(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PayPalAPI.api.ebay.PayPalAPIAASoapBindingStub _stub = new PayPalAPI.api.ebay.PayPalAPIAASoapBindingStub(portAddress, this);
            _stub.setPortName(getPayPalAPIAAWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPayPalAPIAAEndpointAddress(java.lang.String address) {
        PayPalAPIAA_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PayPalAPI.api.ebay.PayPalAPIInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                PayPalAPI.api.ebay.PayPalAPISoapBindingStub _stub = new PayPalAPI.api.ebay.PayPalAPISoapBindingStub(new java.net.URL(PayPalAPI_address), this);
                _stub.setPortName(getPayPalAPIWSDDServiceName());
                return _stub;
            }
            if (PayPalAPI.api.ebay.PayPalAPIAAInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                PayPalAPI.api.ebay.PayPalAPIAASoapBindingStub _stub = new PayPalAPI.api.ebay.PayPalAPIAASoapBindingStub(new java.net.URL(PayPalAPIAA_address), this);
                _stub.setPortName(getPayPalAPIAAWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PayPalAPI".equals(inputPortName)) {
            return getPayPalAPI();
        }
        else if ("PayPalAPIAA".equals(inputPortName)) {
            return getPayPalAPIAA();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "PayPalAPIInterfaceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "PayPalAPI"));
            ports.add(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "PayPalAPIAA"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PayPalAPI".equals(portName)) {
            setPayPalAPIEndpointAddress(address);
        }
        else 
if ("PayPalAPIAA".equals(portName)) {
            setPayPalAPIAAEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
