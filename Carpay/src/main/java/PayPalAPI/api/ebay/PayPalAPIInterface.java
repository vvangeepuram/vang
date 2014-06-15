/**
 * PayPalAPIInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public interface PayPalAPIInterface extends java.rmi.Remote {
    public PayPalAPI.api.ebay.RefundTransactionResponseType refundTransaction(PayPalAPI.api.ebay.RefundTransactionReq refundTransactionRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.InitiateRecoupResponseType initiateRecoup(PayPalAPI.api.ebay.InitiateRecoupReq initiateRecoupRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.CompleteRecoupResponseType completeRecoup(PayPalAPI.api.ebay.CompleteRecoupReq completeRecoupRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.CancelRecoupResponseType cancelRecoup(PayPalAPI.api.ebay.CancelRecoupReq cancelRecoupRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.GetTransactionDetailsResponseType getTransactionDetails(PayPalAPI.api.ebay.GetTransactionDetailsReq getTransactionDetailsRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.BMCreateButtonResponseType BMCreateButton(PayPalAPI.api.ebay.BMCreateButtonReq BMCreateButtonRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.BMUpdateButtonResponseType BMUpdateButton(PayPalAPI.api.ebay.BMUpdateButtonReq BMUpdateButtonRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.BMManageButtonStatusResponseType BMManageButtonStatus(PayPalAPI.api.ebay.BMManageButtonStatusReq BMManageButtonStatusRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.BMGetButtonDetailsResponseType BMGetButtonDetails(PayPalAPI.api.ebay.BMGetButtonDetailsReq BMGetButtonDetailsRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.BMSetInventoryResponseType BMSetInventory(PayPalAPI.api.ebay.BMSetInventoryReq BMSetInventoryRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.BMGetInventoryResponseType BMGetInventory(PayPalAPI.api.ebay.BMGetInventoryReq BMGetInventoryRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.BMButtonSearchResponseType BMButtonSearch(PayPalAPI.api.ebay.BMButtonSearchReq BMButtonSearchRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.BillUserResponseType billUser(PayPalAPI.api.ebay.BillUserReq billUserRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.TransactionSearchResponseType transactionSearch(PayPalAPI.api.ebay.TransactionSearchReq transactionSearchRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.MassPayResponseType massPay(PayPalAPI.api.ebay.MassPayReq massPayRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.BAUpdateResponseType billAgreementUpdate(PayPalAPI.api.ebay.BillAgreementUpdateReq billAgreementUpdateRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.AddressVerifyResponseType addressVerify(PayPalAPI.api.ebay.AddressVerifyReq addressVerifyRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.EnterBoardingResponseType enterBoarding(PayPalAPI.api.ebay.EnterBoardingReq enterBoardingRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.GetBoardingDetailsResponseType getBoardingDetails(PayPalAPI.api.ebay.GetBoardingDetailsReq getBoardingDetailsRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.CreateMobilePaymentResponseType createMobilePayment(PayPalAPI.api.ebay.CreateMobilePaymentReq createMobilePaymentRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.GetMobileStatusResponseType getMobileStatus(PayPalAPI.api.ebay.GetMobileStatusReq getMobileStatusRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.SetMobileCheckoutResponseType setMobileCheckout(PayPalAPI.api.ebay.SetMobileCheckoutReq setMobileCheckoutRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.DoMobileCheckoutPaymentResponseType doMobileCheckoutPayment(PayPalAPI.api.ebay.DoMobileCheckoutPaymentReq doMobileCheckoutPaymentRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.GetBalanceResponseType getBalance(PayPalAPI.api.ebay.GetBalanceReq getBalanceRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.GetPalDetailsResponseType getPalDetails(PayPalAPI.api.ebay.GetPalDetailsReq getPalDetailsRequest) throws java.rmi.RemoteException;
}
