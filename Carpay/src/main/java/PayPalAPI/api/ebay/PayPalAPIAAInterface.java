/**
 * PayPalAPIAAInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public interface PayPalAPIAAInterface extends java.rmi.Remote {
    public PayPalAPI.api.ebay.DoExpressCheckoutPaymentResponseType doExpressCheckoutPayment(PayPalAPI.api.ebay.DoExpressCheckoutPaymentReq doExpressCheckoutPaymentRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentResponseType doUATPExpressCheckoutPayment(PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentReq doUATPExpressCheckoutPaymentRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.SetAuthFlowParamResponseType setAuthFlowParam(PayPalAPI.api.ebay.SetAuthFlowParamReq setAuthFlowParamRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.GetAuthDetailsResponseType getAuthDetails(PayPalAPI.api.ebay.GetAuthDetailsReq getAuthDetailsRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.SetAccessPermissionsResponseType setAccessPermissions(PayPalAPI.api.ebay.SetAccessPermissionsReq setAccessPermissionsRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.UpdateAccessPermissionsResponseType updateAccessPermissions(PayPalAPI.api.ebay.UpdateAccessPermissionsReq updateAccessPermissionsRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.GetAccessPermissionDetailsResponseType getAccessPermissionDetails(PayPalAPI.api.ebay.GetAccessPermissionDetailsReq getAccessPermissionDetailsRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.GetIncentiveEvaluationResponseType getIncentiveEvaluation(PayPalAPI.api.ebay.GetIncentiveEvaluationReq getIncentiveEvaluationRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.SetExpressCheckoutResponseType setExpressCheckout(PayPalAPI.api.ebay.SetExpressCheckoutReq setExpressCheckoutRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.ExecuteCheckoutOperationsResponseType executeCheckoutOperations(PayPalAPI.api.ebay.ExecuteCheckoutOperationsReq executeCheckoutOperationsRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.GetExpressCheckoutDetailsResponseType getExpressCheckoutDetails(PayPalAPI.api.ebay.GetExpressCheckoutDetailsReq getExpressCheckoutDetailsRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.DoDirectPaymentResponseType doDirectPayment(PayPalAPI.api.ebay.DoDirectPaymentReq doDirectPaymentRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.ManagePendingTransactionStatusResponseType managePendingTransactionStatus(PayPalAPI.api.ebay.ManagePendingTransactionStatusReq managePendingTransactionStatusRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.DoCancelResponseType doCancel(PayPalAPI.api.ebay.DoCancelReq doCancelRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.DoCaptureResponseType doCapture(PayPalAPI.api.ebay.DoCaptureReq doCaptureRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.DoReauthorizationResponseType doReauthorization(PayPalAPI.api.ebay.DoReauthorizationReq doReauthorizationRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.DoVoidResponseType doVoid(PayPalAPI.api.ebay.DoVoidReq doVoidRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.DoAuthorizationResponseType doAuthorization(PayPalAPI.api.ebay.DoAuthorizationReq doAuthorizationRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.UpdateAuthorizationResponseType updateAuthorization(PayPalAPI.api.ebay.UpdateAuthorizationReq updateAuthorizationRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.SetCustomerBillingAgreementResponseType setCustomerBillingAgreement(PayPalAPI.api.ebay.SetCustomerBillingAgreementReq setCustomerBillingAgreementRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsResponseType getBillingAgreementCustomerDetails(PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsReq getBillingAgreementCustomerDetailsRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.CreateBillingAgreementResponseType createBillingAgreement(PayPalAPI.api.ebay.CreateBillingAgreementReq createBillingAgreementRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.DoReferenceTransactionResponseType doReferenceTransaction(PayPalAPI.api.ebay.DoReferenceTransactionReq doReferenceTransactionRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.DoNonReferencedCreditResponseType doNonReferencedCredit(PayPalAPI.api.ebay.DoNonReferencedCreditReq doNonReferencedCreditRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.DoUATPAuthorizationResponseType doUATPAuthorization(PayPalAPI.api.ebay.DoUATPAuthorizationReq doUATPAuthorizationRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.CreateRecurringPaymentsProfileResponseType createRecurringPaymentsProfile(PayPalAPI.api.ebay.CreateRecurringPaymentsProfileReq createRecurringPaymentsProfileRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsResponseType getRecurringPaymentsProfileDetails(PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsReq getRecurringPaymentsProfileDetailsRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusResponseType manageRecurringPaymentsProfileStatus(PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusReq manageRecurringPaymentsProfileStatusRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.BillOutstandingAmountResponseType billOutstandingAmount(PayPalAPI.api.ebay.BillOutstandingAmountReq billOutstandingAmountRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileResponseType updateRecurringPaymentsProfile(PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileReq updateRecurringPaymentsProfileRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.ReverseTransactionResponseType reverseTransaction(PayPalAPI.api.ebay.ReverseTransactionReq reverseTransactionRequest) throws java.rmi.RemoteException;
    public PayPalAPI.api.ebay.ExternalRememberMeOptOutResponseType externalRememberMeOptOut(PayPalAPI.api.ebay.ExternalRememberMeOptOutReq externalRememberMeOptOutRequest) throws java.rmi.RemoteException;
}
