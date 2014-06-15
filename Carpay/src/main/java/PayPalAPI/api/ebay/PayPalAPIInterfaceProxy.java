package PayPalAPI.api.ebay;

public class PayPalAPIInterfaceProxy implements PayPalAPI.api.ebay.PayPalAPIInterface {
  private String _endpoint = null;
  private PayPalAPI.api.ebay.PayPalAPIInterface payPalAPIInterface = null;
  
  public PayPalAPIInterfaceProxy() {
    _initPayPalAPIInterfaceProxy();
  }
  
  public PayPalAPIInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initPayPalAPIInterfaceProxy();
  }
  
  private void _initPayPalAPIInterfaceProxy() {
    try {
      payPalAPIInterface = (new PayPalAPI.api.ebay.PayPalAPIInterfaceServiceLocator()).getPayPalAPI();
      if (payPalAPIInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)payPalAPIInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)payPalAPIInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (payPalAPIInterface != null)
      ((javax.xml.rpc.Stub)payPalAPIInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public PayPalAPI.api.ebay.PayPalAPIInterface getPayPalAPIInterface() {
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface;
  }
  
  public PayPalAPI.api.ebay.RefundTransactionResponseType refundTransaction(PayPalAPI.api.ebay.RefundTransactionReq refundTransactionRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.refundTransaction(refundTransactionRequest);
  }
  
  public PayPalAPI.api.ebay.InitiateRecoupResponseType initiateRecoup(PayPalAPI.api.ebay.InitiateRecoupReq initiateRecoupRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.initiateRecoup(initiateRecoupRequest);
  }
  
  public PayPalAPI.api.ebay.CompleteRecoupResponseType completeRecoup(PayPalAPI.api.ebay.CompleteRecoupReq completeRecoupRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.completeRecoup(completeRecoupRequest);
  }
  
  public PayPalAPI.api.ebay.CancelRecoupResponseType cancelRecoup(PayPalAPI.api.ebay.CancelRecoupReq cancelRecoupRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.cancelRecoup(cancelRecoupRequest);
  }
  
  public PayPalAPI.api.ebay.GetTransactionDetailsResponseType getTransactionDetails(PayPalAPI.api.ebay.GetTransactionDetailsReq getTransactionDetailsRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.getTransactionDetails(getTransactionDetailsRequest);
  }
  
  public PayPalAPI.api.ebay.BMCreateButtonResponseType BMCreateButton(PayPalAPI.api.ebay.BMCreateButtonReq BMCreateButtonRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.BMCreateButton(BMCreateButtonRequest);
  }
  
  public PayPalAPI.api.ebay.BMUpdateButtonResponseType BMUpdateButton(PayPalAPI.api.ebay.BMUpdateButtonReq BMUpdateButtonRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.BMUpdateButton(BMUpdateButtonRequest);
  }
  
  public PayPalAPI.api.ebay.BMManageButtonStatusResponseType BMManageButtonStatus(PayPalAPI.api.ebay.BMManageButtonStatusReq BMManageButtonStatusRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.BMManageButtonStatus(BMManageButtonStatusRequest);
  }
  
  public PayPalAPI.api.ebay.BMGetButtonDetailsResponseType BMGetButtonDetails(PayPalAPI.api.ebay.BMGetButtonDetailsReq BMGetButtonDetailsRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.BMGetButtonDetails(BMGetButtonDetailsRequest);
  }
  
  public PayPalAPI.api.ebay.BMSetInventoryResponseType BMSetInventory(PayPalAPI.api.ebay.BMSetInventoryReq BMSetInventoryRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.BMSetInventory(BMSetInventoryRequest);
  }
  
  public PayPalAPI.api.ebay.BMGetInventoryResponseType BMGetInventory(PayPalAPI.api.ebay.BMGetInventoryReq BMGetInventoryRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.BMGetInventory(BMGetInventoryRequest);
  }
  
  public PayPalAPI.api.ebay.BMButtonSearchResponseType BMButtonSearch(PayPalAPI.api.ebay.BMButtonSearchReq BMButtonSearchRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.BMButtonSearch(BMButtonSearchRequest);
  }
  
  public PayPalAPI.api.ebay.BillUserResponseType billUser(PayPalAPI.api.ebay.BillUserReq billUserRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.billUser(billUserRequest);
  }
  
  public PayPalAPI.api.ebay.TransactionSearchResponseType transactionSearch(PayPalAPI.api.ebay.TransactionSearchReq transactionSearchRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.transactionSearch(transactionSearchRequest);
  }
  
  public PayPalAPI.api.ebay.MassPayResponseType massPay(PayPalAPI.api.ebay.MassPayReq massPayRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.massPay(massPayRequest);
  }
  
  public PayPalAPI.api.ebay.BAUpdateResponseType billAgreementUpdate(PayPalAPI.api.ebay.BillAgreementUpdateReq billAgreementUpdateRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.billAgreementUpdate(billAgreementUpdateRequest);
  }
  
  public PayPalAPI.api.ebay.AddressVerifyResponseType addressVerify(PayPalAPI.api.ebay.AddressVerifyReq addressVerifyRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.addressVerify(addressVerifyRequest);
  }
  
  public PayPalAPI.api.ebay.EnterBoardingResponseType enterBoarding(PayPalAPI.api.ebay.EnterBoardingReq enterBoardingRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.enterBoarding(enterBoardingRequest);
  }
  
  public PayPalAPI.api.ebay.GetBoardingDetailsResponseType getBoardingDetails(PayPalAPI.api.ebay.GetBoardingDetailsReq getBoardingDetailsRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.getBoardingDetails(getBoardingDetailsRequest);
  }
  
  public PayPalAPI.api.ebay.CreateMobilePaymentResponseType createMobilePayment(PayPalAPI.api.ebay.CreateMobilePaymentReq createMobilePaymentRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.createMobilePayment(createMobilePaymentRequest);
  }
  
  public PayPalAPI.api.ebay.GetMobileStatusResponseType getMobileStatus(PayPalAPI.api.ebay.GetMobileStatusReq getMobileStatusRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.getMobileStatus(getMobileStatusRequest);
  }
  
  public PayPalAPI.api.ebay.SetMobileCheckoutResponseType setMobileCheckout(PayPalAPI.api.ebay.SetMobileCheckoutReq setMobileCheckoutRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.setMobileCheckout(setMobileCheckoutRequest);
  }
  
  public PayPalAPI.api.ebay.DoMobileCheckoutPaymentResponseType doMobileCheckoutPayment(PayPalAPI.api.ebay.DoMobileCheckoutPaymentReq doMobileCheckoutPaymentRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.doMobileCheckoutPayment(doMobileCheckoutPaymentRequest);
  }
  
  public PayPalAPI.api.ebay.GetBalanceResponseType getBalance(PayPalAPI.api.ebay.GetBalanceReq getBalanceRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.getBalance(getBalanceRequest);
  }
  
  public PayPalAPI.api.ebay.GetPalDetailsResponseType getPalDetails(PayPalAPI.api.ebay.GetPalDetailsReq getPalDetailsRequest) throws java.rmi.RemoteException{
    if (payPalAPIInterface == null)
      _initPayPalAPIInterfaceProxy();
    return payPalAPIInterface.getPalDetails(getPalDetailsRequest);
  }
  
  
}