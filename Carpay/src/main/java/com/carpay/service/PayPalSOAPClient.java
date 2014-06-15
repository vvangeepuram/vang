package com.carpay.service;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import PayPalAPI.api.ebay.DoDirectPaymentReq;
import PayPalAPI.api.ebay.DoDirectPaymentRequestType;
import PayPalAPI.api.ebay.DoDirectPaymentResponseType;
import PayPalAPI.api.ebay.PayPalAPIAAInterface;
import PayPalAPI.api.ebay.PayPalAPIAAInterfaceProxy;
import eBLBaseComponents.apis.ebay.CreditCardDetailsType;
import eBLBaseComponents.apis.ebay.CreditCardTypeType;
import eBLBaseComponents.apis.ebay.CustomSecurityHeaderType;
import eBLBaseComponents.apis.ebay.DoDirectPaymentRequestDetailsType;
import eBLBaseComponents.apis.ebay.PaymentActionCodeType;
import eBLBaseComponents.apis.ebay.PaymentDetailsType;
import eBLBaseComponents.apis.ebay.UserIdPasswordType;
/*Uses the javax.xml.ws.WebServiceRef annotation to declare a reference to a web service. 
@WebServiceRef uses the wsdlLocation element to specify the URI of the deployed service’s WSDL file.*/
@WebServiceRef(wsdlLocation="https://www.sandbox.paypal.com/wsdl/PayPalSvc.wsdl")
public class PayPalSOAPClient {
	
	
	
	public static void main(String[] args) throws RemoteException {
		//PaymentCard pc;
		DoDirectPaymentReq req = new DoDirectPaymentReq();
		//Create soap api request and response objects
		DoDirectPaymentRequestType request = new DoDirectPaymentRequestType();
		request.setVersion("56.0");
		req.setDoDirectPaymentRequest(request);
		DoDirectPaymentResponseType response;
		DoDirectPaymentRequestDetailsType reqDetails = new DoDirectPaymentRequestDetailsType();
		request.setDoDirectPaymentRequestDetails(reqDetails);
		CreditCardDetailsType ccDetails = new CreditCardDetailsType();
		reqDetails.setCreditCard(ccDetails);
		//ccDetails.setCreditCardNumber(CreditCardNumberTypeType.);
		ccDetails.setCreditCardType(CreditCardTypeType.Visa);
		//ccDetails.setExpMonth(expMonth);
		ccDetails.setCreditCardNumber("41111111111111111");
		ccDetails.setExpMonth(12);
		ccDetails.setExpYear(2014);
		ccDetails.setCVV2("123");
		reqDetails.setIPAddress("10.1.1.1");
//		reqDetails.setMerchantSessionId();
		
		PaymentDetailsType payDetails = new PaymentDetailsType();
		reqDetails.setPaymentDetails(payDetails);
		reqDetails.setPaymentAction(PaymentActionCodeType.Authorization);
		
		
		PayPalAPIAAInterfaceProxy proxy = new PayPalAPIAAInterfaceProxy("https://api-3t.sandbox.paypal.com");
	
		PayPalAPIAAInterface aaproxy = proxy.getPayPalAPIAAInterface();
		CustomSecurityHeaderType header = new CustomSecurityHeaderType();
		UserIdPasswordType credentials = new UserIdPasswordType();
		credentials.setUsername("praveen-facilitator_api1.vangeepuram.net");
		credentials.setPassword("1391056552");
		credentials.setSignature("AQU0e5vuZCvSg-XJploSa.sGUDlpAkRjxJ7MVNInu.ltEtQE521lVkCw");
		header.setCredentials(credentials);
		response = aaproxy.doDirectPayment(req);
		
		Binding binding = ((BindingProvider) aaproxy).getBinding();
		
		List<Handler> handlerList = new ArrayList<Handler>();

		handlerList.add(new SOAPHandler<SOAPMessageContext>() {
		    @Override
		    public boolean handleMessage(final SOAPMessageContext context) {        
		        try {
		            // checking whether handled message is outbound one as per Martin Strauss answer
		            final Boolean outbound = (Boolean) context.get("javax.xml.ws.handler.message.outbound");
		            if (outbound != null && outbound) {
		                // obtaining marshaller which should marshal instance to xml
		                final Marshaller marshaller = JAXBContext.newInstance(CustomSecurityHeaderType.class).createMarshaller();
		                // adding header because otherwise it's null
		                final SOAPHeader soapHeader = context.getMessage().getSOAPPart().getEnvelope().addHeader();
		                // marshalling instance (appending) to SOAP header's xml node
		            }
		        } catch (final Exception e) {
		            throw new RuntimeException(e);
		        }
		        return true;
		    }

			@Override
			public void close(MessageContext context) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean handleFault(SOAPMessageContext context) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Set<QName> getHeaders() {
				// TODO Auto-generated method stub
				return null;
			}

		    // ... default implementations of other methods go here

		});	
	}
	
	public void initializePayPalInterface() {
	
	}
	
	
	
	
	
	

}
