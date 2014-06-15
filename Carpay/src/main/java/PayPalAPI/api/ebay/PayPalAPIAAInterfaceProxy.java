package PayPalAPI.api.ebay;

public class PayPalAPIAAInterfaceProxy implements PayPalAPI.api.ebay.PayPalAPIAAInterface {
  private String _endpoint = null;
  private PayPalAPI.api.ebay.PayPalAPIAAInterface payPalAPIAAInterface = null;
  
  public PayPalAPIAAInterfaceProxy() {
    _initPayPalAPIAAInterfaceProxy();
  }
  
  public PayPalAPIAAInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initPayPalAPIAAInterfaceProxy();
  }
  
  private void _initPayPalAPIAAInterfaceProxy() {
    try {
      payPalAPIAAInterface = (new PayPalAPI.api.ebay.PayPalAPIInterfaceServiceLocator()).getPayPalAPIAA();
      if (payPalAPIAAInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)payPalAPIAAInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)payPalAPIAAInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (payPalAPIAAInterface != null)
      ((javax.xml.rpc.Stub)payPalAPIAAInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public PayPalAPI.api.ebay.PayPalAPIAAInterface getPayPalAPIAAInterface() {
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface;
  }
  
  public PayPalAPI.api.ebay.DoExpressCheckoutPaymentResponseType doExpressCheckoutPayment(PayPalAPI.api.ebay.DoExpressCheckoutPaymentReq doExpressCheckoutPaymentRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.doExpressCheckoutPayment(doExpressCheckoutPaymentRequest);
  }
  
  public PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentResponseType doUATPExpressCheckoutPayment(PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentReq doUATPExpressCheckoutPaymentRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.doUATPExpressCheckoutPayment(doUATPExpressCheckoutPaymentRequest);
  }
  
  public PayPalAPI.api.ebay.SetAuthFlowParamResponseType setAuthFlowParam(PayPalAPI.api.ebay.SetAuthFlowParamReq setAuthFlowParamRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.setAuthFlowParam(setAuthFlowParamRequest);
  }
  
  public PayPalAPI.api.ebay.GetAuthDetailsResponseType getAuthDetails(PayPalAPI.api.ebay.GetAuthDetailsReq getAuthDetailsRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.getAuthDetails(getAuthDetailsRequest);
  }
  
  public PayPalAPI.api.ebay.SetAccessPermissionsResponseType setAccessPermissions(PayPalAPI.api.ebay.SetAccessPermissionsReq setAccessPermissionsRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.setAccessPermissions(setAccessPermissionsRequest);
  }
  
  public PayPalAPI.api.ebay.UpdateAccessPermissionsResponseType updateAccessPermissions(PayPalAPI.api.ebay.UpdateAccessPermissionsReq updateAccessPermissionsRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.updateAccessPermissions(updateAccessPermissionsRequest);
  }
  
  public PayPalAPI.api.ebay.GetAccessPermissionDetailsResponseType getAccessPermissionDetails(PayPalAPI.api.ebay.GetAccessPermissionDetailsReq getAccessPermissionDetailsRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.getAccessPermissionDetails(getAccessPermissionDetailsRequest);
  }
  
  public PayPalAPI.api.ebay.GetIncentiveEvaluationResponseType getIncentiveEvaluation(PayPalAPI.api.ebay.GetIncentiveEvaluationReq getIncentiveEvaluationRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.getIncentiveEvaluation(getIncentiveEvaluationRequest);
  }
  
  public PayPalAPI.api.ebay.SetExpressCheckoutResponseType setExpressCheckout(PayPalAPI.api.ebay.SetExpressCheckoutReq setExpressCheckoutRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.setExpressCheckout(setExpressCheckoutRequest);
  }
  
  public PayPalAPI.api.ebay.ExecuteCheckoutOperationsResponseType executeCheckoutOperations(PayPalAPI.api.ebay.ExecuteCheckoutOperationsReq executeCheckoutOperationsRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.executeCheckoutOperations(executeCheckoutOperationsRequest);
  }
  
  public PayPalAPI.api.ebay.GetExpressCheckoutDetailsResponseType getExpressCheckoutDetails(PayPalAPI.api.ebay.GetExpressCheckoutDetailsReq getExpressCheckoutDetailsRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.getExpressCheckoutDetails(getExpressCheckoutDetailsRequest);
  }
  
  public PayPalAPI.api.ebay.DoDirectPaymentResponseType doDirectPayment(PayPalAPI.api.ebay.DoDirectPaymentReq doDirectPaymentRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.doDirectPayment(doDirectPaymentRequest);
  }
  
  public PayPalAPI.api.ebay.ManagePendingTransactionStatusResponseType managePendingTransactionStatus(PayPalAPI.api.ebay.ManagePendingTransactionStatusReq managePendingTransactionStatusRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.managePendingTransactionStatus(managePendingTransactionStatusRequest);
  }
  
  public PayPalAPI.api.ebay.DoCancelResponseType doCancel(PayPalAPI.api.ebay.DoCancelReq doCancelRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.doCancel(doCancelRequest);
  }
  
  public PayPalAPI.api.ebay.DoCaptureResponseType doCapture(PayPalAPI.api.ebay.DoCaptureReq doCaptureRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.doCapture(doCaptureRequest);
  }
  
  public PayPalAPI.api.ebay.DoReauthorizationResponseType doReauthorization(PayPalAPI.api.ebay.DoReauthorizationReq doReauthorizationRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.doReauthorization(doReauthorizationRequest);
  }
  
  public PayPalAPI.api.ebay.DoVoidResponseType doVoid(PayPalAPI.api.ebay.DoVoidReq doVoidRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.doVoid(doVoidRequest);
  }
  
  public PayPalAPI.api.ebay.DoAuthorizationResponseType doAuthorization(PayPalAPI.api.ebay.DoAuthorizationReq doAuthorizationRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.doAuthorization(doAuthorizationRequest);
  }
  
  public PayPalAPI.api.ebay.UpdateAuthorizationResponseType updateAuthorization(PayPalAPI.api.ebay.UpdateAuthorizationReq updateAuthorizationRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.updateAuthorization(updateAuthorizationRequest);
  }
  
  public PayPalAPI.api.ebay.SetCustomerBillingAgreementResponseType setCustomerBillingAgreement(PayPalAPI.api.ebay.SetCustomerBillingAgreementReq setCustomerBillingAgreementRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.setCustomerBillingAgreement(setCustomerBillingAgreementRequest);
  }
  
  public PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsResponseType getBillingAgreementCustomerDetails(PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsReq getBillingAgreementCustomerDetailsRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.getBillingAgreementCustomerDetails(getBillingAgreementCustomerDetailsRequest);
  }
  
  public PayPalAPI.api.ebay.CreateBillingAgreementResponseType createBillingAgreement(PayPalAPI.api.ebay.CreateBillingAgreementReq createBillingAgreementRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.createBillingAgreement(createBillingAgreementRequest);
  }
  
  public PayPalAPI.api.ebay.DoReferenceTransactionResponseType doReferenceTransaction(PayPalAPI.api.ebay.DoReferenceTransactionReq doReferenceTransactionRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.doReferenceTransaction(doReferenceTransactionRequest);
  }
  
  public PayPalAPI.api.ebay.DoNonReferencedCreditResponseType doNonReferencedCredit(PayPalAPI.api.ebay.DoNonReferencedCreditReq doNonReferencedCreditRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.doNonReferencedCredit(doNonReferencedCreditRequest);
  }
  
  public PayPalAPI.api.ebay.DoUATPAuthorizationResponseType doUATPAuthorization(PayPalAPI.api.ebay.DoUATPAuthorizationReq doUATPAuthorizationRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.doUATPAuthorization(doUATPAuthorizationRequest);
  }
  
  public PayPalAPI.api.ebay.CreateRecurringPaymentsProfileResponseType createRecurringPaymentsProfile(PayPalAPI.api.ebay.CreateRecurringPaymentsProfileReq createRecurringPaymentsProfileRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.createRecurringPaymentsProfile(createRecurringPaymentsProfileRequest);
  }
  
  public PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsResponseType getRecurringPaymentsProfileDetails(PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsReq getRecurringPaymentsProfileDetailsRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.getRecurringPaymentsProfileDetails(getRecurringPaymentsProfileDetailsRequest);
  }
  
  public PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusResponseType manageRecurringPaymentsProfileStatus(PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusReq manageRecurringPaymentsProfileStatusRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.manageRecurringPaymentsProfileStatus(manageRecurringPaymentsProfileStatusRequest);
  }
  
  public PayPalAPI.api.ebay.BillOutstandingAmountResponseType billOutstandingAmount(PayPalAPI.api.ebay.BillOutstandingAmountReq billOutstandingAmountRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.billOutstandingAmount(billOutstandingAmountRequest);
  }
  
  public PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileResponseType updateRecurringPaymentsProfile(PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileReq updateRecurringPaymentsProfileRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.updateRecurringPaymentsProfile(updateRecurringPaymentsProfileRequest);
  }
  
  public PayPalAPI.api.ebay.ReverseTransactionResponseType reverseTransaction(PayPalAPI.api.ebay.ReverseTransactionReq reverseTransactionRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.reverseTransaction(reverseTransactionRequest);
  }
  
  public PayPalAPI.api.ebay.ExternalRememberMeOptOutResponseType externalRememberMeOptOut(PayPalAPI.api.ebay.ExternalRememberMeOptOutReq externalRememberMeOptOutRequest) throws java.rmi.RemoteException{
    if (payPalAPIAAInterface == null)
      _initPayPalAPIAAInterfaceProxy();
    return payPalAPIAAInterface.externalRememberMeOptOut(externalRememberMeOptOutRequest);
  }
  
  
}