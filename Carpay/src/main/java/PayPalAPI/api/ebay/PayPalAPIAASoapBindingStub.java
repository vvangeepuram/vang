/**
 * PayPalAPIAASoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class PayPalAPIAASoapBindingStub extends org.apache.axis.client.Stub implements PayPalAPI.api.ebay.PayPalAPIAAInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[32];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoExpressCheckoutPayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoExpressCheckoutPaymentReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoExpressCheckoutPaymentReq"), PayPalAPI.api.ebay.DoExpressCheckoutPaymentReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoExpressCheckoutPaymentResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.DoExpressCheckoutPaymentResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoExpressCheckoutPaymentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoUATPExpressCheckoutPayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPExpressCheckoutPaymentReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoUATPExpressCheckoutPaymentReq"), PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPExpressCheckoutPaymentResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPExpressCheckoutPaymentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetAuthFlowParam");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetAuthFlowParamReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">SetAuthFlowParamReq"), PayPalAPI.api.ebay.SetAuthFlowParamReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetAuthFlowParamResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.SetAuthFlowParamResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetAuthFlowParamResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAuthDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAuthDetailsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetAuthDetailsReq"), PayPalAPI.api.ebay.GetAuthDetailsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAuthDetailsResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.GetAuthDetailsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAuthDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetAccessPermissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetAccessPermissionsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">SetAccessPermissionsReq"), PayPalAPI.api.ebay.SetAccessPermissionsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetAccessPermissionsResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.SetAccessPermissionsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetAccessPermissionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAccessPermissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAccessPermissionsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">UpdateAccessPermissionsReq"), PayPalAPI.api.ebay.UpdateAccessPermissionsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAccessPermissionsResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.UpdateAccessPermissionsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAccessPermissionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccessPermissionDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAccessPermissionDetailsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetAccessPermissionDetailsReq"), PayPalAPI.api.ebay.GetAccessPermissionDetailsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAccessPermissionDetailsResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.GetAccessPermissionDetailsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAccessPermissionDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetIncentiveEvaluation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetIncentiveEvaluationReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetIncentiveEvaluationReq"), PayPalAPI.api.ebay.GetIncentiveEvaluationReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetIncentiveEvaluationResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.GetIncentiveEvaluationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetIncentiveEvaluationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetExpressCheckout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetExpressCheckoutReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">SetExpressCheckoutReq"), PayPalAPI.api.ebay.SetExpressCheckoutReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetExpressCheckoutResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.SetExpressCheckoutResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetExpressCheckoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExecuteCheckoutOperations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExecuteCheckoutOperationsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ExecuteCheckoutOperationsReq"), PayPalAPI.api.ebay.ExecuteCheckoutOperationsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExecuteCheckoutOperationsResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.ExecuteCheckoutOperationsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExecuteCheckoutOperationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetExpressCheckoutDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetExpressCheckoutDetailsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetExpressCheckoutDetailsReq"), PayPalAPI.api.ebay.GetExpressCheckoutDetailsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetExpressCheckoutDetailsResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.GetExpressCheckoutDetailsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetExpressCheckoutDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoDirectPayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoDirectPaymentReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoDirectPaymentReq"), PayPalAPI.api.ebay.DoDirectPaymentReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoDirectPaymentResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.DoDirectPaymentResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoDirectPaymentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManagePendingTransactionStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManagePendingTransactionStatusReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ManagePendingTransactionStatusReq"), PayPalAPI.api.ebay.ManagePendingTransactionStatusReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManagePendingTransactionStatusResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.ManagePendingTransactionStatusResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManagePendingTransactionStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoCancel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCancelReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoCancelReq"), PayPalAPI.api.ebay.DoCancelReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCancelResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.DoCancelResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCancelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoCapture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCaptureReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoCaptureReq"), PayPalAPI.api.ebay.DoCaptureReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCaptureResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.DoCaptureResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCaptureResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoReauthorization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReauthorizationReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoReauthorizationReq"), PayPalAPI.api.ebay.DoReauthorizationReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReauthorizationResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.DoReauthorizationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReauthorizationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoVoid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoVoidReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoVoidReq"), PayPalAPI.api.ebay.DoVoidReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoVoidResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.DoVoidResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoVoidResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAuthorization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoAuthorizationReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoAuthorizationReq"), PayPalAPI.api.ebay.DoAuthorizationReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoAuthorizationResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.DoAuthorizationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoAuthorizationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAuthorization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAuthorizationReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">UpdateAuthorizationReq"), PayPalAPI.api.ebay.UpdateAuthorizationReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAuthorizationResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.UpdateAuthorizationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAuthorizationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoUATPAuthorization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPAuthorizationReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoUATPAuthorizationReq"), PayPalAPI.api.ebay.DoUATPAuthorizationReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPAuthorizationResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.DoUATPAuthorizationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPAuthorizationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetCustomerBillingAgreement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetCustomerBillingAgreementReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">SetCustomerBillingAgreementReq"), PayPalAPI.api.ebay.SetCustomerBillingAgreementReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetCustomerBillingAgreementResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.SetCustomerBillingAgreementResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetCustomerBillingAgreementResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBillingAgreementCustomerDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBillingAgreementCustomerDetailsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetBillingAgreementCustomerDetailsReq"), PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBillingAgreementCustomerDetailsResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBillingAgreementCustomerDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateBillingAgreement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateBillingAgreementReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">CreateBillingAgreementReq"), PayPalAPI.api.ebay.CreateBillingAgreementReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateBillingAgreementResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.CreateBillingAgreementResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateBillingAgreementResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoReferenceTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReferenceTransactionReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoReferenceTransactionReq"), PayPalAPI.api.ebay.DoReferenceTransactionReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReferenceTransactionResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.DoReferenceTransactionResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReferenceTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateRecurringPaymentsProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateRecurringPaymentsProfileReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">CreateRecurringPaymentsProfileReq"), PayPalAPI.api.ebay.CreateRecurringPaymentsProfileReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateRecurringPaymentsProfileResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.CreateRecurringPaymentsProfileResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateRecurringPaymentsProfileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRecurringPaymentsProfileDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetRecurringPaymentsProfileDetailsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetRecurringPaymentsProfileDetailsReq"), PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetRecurringPaymentsProfileDetailsResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetRecurringPaymentsProfileDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ManageRecurringPaymentsProfileStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManageRecurringPaymentsProfileStatusReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ManageRecurringPaymentsProfileStatusReq"), PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManageRecurringPaymentsProfileStatusResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManageRecurringPaymentsProfileStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BillOutstandingAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillOutstandingAmountReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BillOutstandingAmountReq"), PayPalAPI.api.ebay.BillOutstandingAmountReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillOutstandingAmountResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.BillOutstandingAmountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillOutstandingAmountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateRecurringPaymentsProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateRecurringPaymentsProfileReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">UpdateRecurringPaymentsProfileReq"), PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateRecurringPaymentsProfileResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateRecurringPaymentsProfileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoNonReferencedCredit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoNonReferencedCreditReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoNonReferencedCreditReq"), PayPalAPI.api.ebay.DoNonReferencedCreditReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoNonReferencedCreditResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.DoNonReferencedCreditResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoNonReferencedCreditResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReverseTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReverseTransactionReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ReverseTransactionReq"), PayPalAPI.api.ebay.ReverseTransactionReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReverseTransactionResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.ReverseTransactionResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReverseTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExternalRememberMeOptOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExternalRememberMeOptOutReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ExternalRememberMeOptOutReq"), PayPalAPI.api.ebay.ExternalRememberMeOptOutReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExternalRememberMeOptOutResponseType"));
        oper.setReturnClass(PayPalAPI.api.ebay.ExternalRememberMeOptOutResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExternalRememberMeOptOutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

    }

    public PayPalAPIAASoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PayPalAPIAASoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PayPalAPIAASoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">AddressVerifyReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.AddressVerifyReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BillAgreementUpdateReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BillAgreementUpdateReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BillOutstandingAmountReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BillOutstandingAmountReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BillUserReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BillUserReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BMButtonSearchReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMButtonSearchReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BMCreateButtonReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMCreateButtonReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BMGetButtonDetailsReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMGetButtonDetailsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BMGetInventoryReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMGetInventoryReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BMManageButtonStatusReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMManageButtonStatusReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BMSetInventoryReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMSetInventoryReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BMUpdateButtonReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMUpdateButtonReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">CancelRecoupReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CancelRecoupReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">CompleteRecoupReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CompleteRecoupReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">CreateBillingAgreementReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CreateBillingAgreementReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">CreateMobilePaymentReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CreateMobilePaymentReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">CreateRecurringPaymentsProfileReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CreateRecurringPaymentsProfileReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoAuthorizationReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoAuthorizationReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoCancelReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoCancelReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoCaptureReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoCaptureReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoDirectPaymentReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoDirectPaymentReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoExpressCheckoutPaymentReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoExpressCheckoutPaymentReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoMobileCheckoutPaymentReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoMobileCheckoutPaymentReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoNonReferencedCreditReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoNonReferencedCreditReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoReauthorizationReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoReauthorizationReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoReferenceTransactionReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoReferenceTransactionReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoUATPAuthorizationReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoUATPAuthorizationReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoUATPExpressCheckoutPaymentReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoVoidReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoVoidReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">EnterBoardingReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.EnterBoardingReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ExecuteCheckoutOperationsReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ExecuteCheckoutOperationsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ExternalRememberMeOptOutReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ExternalRememberMeOptOutReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetAccessPermissionDetailsReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetAccessPermissionDetailsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetAuthDetailsReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetAuthDetailsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetBalanceReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetBalanceReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetBillingAgreementCustomerDetailsReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetBoardingDetailsReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetBoardingDetailsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetExpressCheckoutDetailsReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetExpressCheckoutDetailsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetIncentiveEvaluationReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetIncentiveEvaluationReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetMobileStatusReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetMobileStatusReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetPalDetailsReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetPalDetailsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetRecurringPaymentsProfileDetailsReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetTransactionDetailsReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetTransactionDetailsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">InitiateRecoupReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.InitiateRecoupReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ManagePendingTransactionStatusReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ManagePendingTransactionStatusReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ManageRecurringPaymentsProfileStatusReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">MassPayReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.MassPayReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">RefundTransactionReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.RefundTransactionReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ReverseTransactionReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ReverseTransactionReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">SetAccessPermissionsReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetAccessPermissionsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">SetAuthFlowParamReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetAuthFlowParamReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">SetCustomerBillingAgreementReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetCustomerBillingAgreementReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">SetExpressCheckoutReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetExpressCheckoutReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">SetMobileCheckoutReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetMobileCheckoutReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">TransactionSearchReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.TransactionSearchReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">UpdateAccessPermissionsReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.UpdateAccessPermissionsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">UpdateAuthorizationReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.UpdateAuthorizationReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">UpdateRecurringPaymentsProfileReq");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "AddressVerifyRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.AddressVerifyRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "AddressVerifyResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.AddressVerifyResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BAUpdateRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BAUpdateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BAUpdateResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BAUpdateResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillOutstandingAmountRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BillOutstandingAmountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillOutstandingAmountResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BillOutstandingAmountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillUserRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BillUserRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillUserResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BillUserResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMButtonSearchRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMButtonSearchRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMButtonSearchResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMButtonSearchResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMCreateButtonRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMCreateButtonRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMCreateButtonResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMCreateButtonResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMGetButtonDetailsRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMGetButtonDetailsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMGetButtonDetailsResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMGetButtonDetailsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMGetInventoryRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMGetInventoryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMGetInventoryResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMGetInventoryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMManageButtonStatusRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMManageButtonStatusRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMManageButtonStatusResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMManageButtonStatusResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMSetInventoryRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMSetInventoryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMSetInventoryResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMSetInventoryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMUpdateButtonRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMUpdateButtonRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMUpdateButtonResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.BMUpdateButtonResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CancelRecoupRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CancelRecoupRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CancelRecoupResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CancelRecoupResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CompleteRecoupRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CompleteRecoupRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CompleteRecoupResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CompleteRecoupResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateBillingAgreementRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CreateBillingAgreementRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateBillingAgreementResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CreateBillingAgreementResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateMobilePaymentRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CreateMobilePaymentRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateMobilePaymentResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CreateMobilePaymentResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateRecurringPaymentsProfileRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CreateRecurringPaymentsProfileRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateRecurringPaymentsProfileResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.CreateRecurringPaymentsProfileResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoAuthorizationRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoAuthorizationRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoAuthorizationResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoAuthorizationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCancelRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoCancelRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCancelResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoCancelResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCaptureRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoCaptureRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCaptureResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoCaptureResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoDirectPaymentRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoDirectPaymentRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoDirectPaymentResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoDirectPaymentResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoExpressCheckoutPaymentRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoExpressCheckoutPaymentRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoExpressCheckoutPaymentResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoExpressCheckoutPaymentResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoMobileCheckoutPaymentRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoMobileCheckoutPaymentRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoMobileCheckoutPaymentResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoMobileCheckoutPaymentResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoNonReferencedCreditRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoNonReferencedCreditRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoNonReferencedCreditResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoNonReferencedCreditResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReauthorizationRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoReauthorizationRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReauthorizationResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoReauthorizationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReferenceTransactionRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoReferenceTransactionRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReferenceTransactionResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoReferenceTransactionResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPAuthorizationRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoUATPAuthorizationRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPAuthorizationResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoUATPAuthorizationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPExpressCheckoutPaymentRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPExpressCheckoutPaymentResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoVoidRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoVoidRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoVoidResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.DoVoidResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "EnterBoardingRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.EnterBoardingRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "EnterBoardingResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.EnterBoardingResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExecuteCheckoutOperationsRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ExecuteCheckoutOperationsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExecuteCheckoutOperationsResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ExecuteCheckoutOperationsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExternalRememberMeOptOutRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ExternalRememberMeOptOutRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExternalRememberMeOptOutResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ExternalRememberMeOptOutResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAccessPermissionDetailsRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetAccessPermissionDetailsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAccessPermissionDetailsResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetAccessPermissionDetailsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAuthDetailsRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetAuthDetailsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAuthDetailsResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetAuthDetailsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBalanceRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetBalanceRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBalanceResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetBalanceResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBillingAgreementCustomerDetailsRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBillingAgreementCustomerDetailsResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBoardingDetailsRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetBoardingDetailsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBoardingDetailsResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetBoardingDetailsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetExpressCheckoutDetailsRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetExpressCheckoutDetailsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetExpressCheckoutDetailsResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetExpressCheckoutDetailsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetIncentiveEvaluationRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetIncentiveEvaluationRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetIncentiveEvaluationResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetIncentiveEvaluationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetMobileStatusRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetMobileStatusRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetMobileStatusResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetMobileStatusResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetPalDetailsRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetPalDetailsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetPalDetailsResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetPalDetailsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetRecurringPaymentsProfileDetailsRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetRecurringPaymentsProfileDetailsResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetTransactionDetailsRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetTransactionDetailsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetTransactionDetailsResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.GetTransactionDetailsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "InitiateRecoupRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.InitiateRecoupRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "InitiateRecoupResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.InitiateRecoupResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "InstallmentDetailsType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.InstallmentDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManagePendingTransactionStatusRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ManagePendingTransactionStatusRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManagePendingTransactionStatusResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ManagePendingTransactionStatusResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManageRecurringPaymentsProfileStatusRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManageRecurringPaymentsProfileStatusResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "MassPayRequestItemType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.MassPayRequestItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "MassPayRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.MassPayRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "MassPayResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.MassPayResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "OptionDetailsType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.OptionDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "OptionSelectionDetailsType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.OptionSelectionDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "RefundTransactionRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.RefundTransactionRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "RefundTransactionResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.RefundTransactionResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReverseTransactionRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ReverseTransactionRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReverseTransactionResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.ReverseTransactionResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetAccessPermissionsRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetAccessPermissionsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetAccessPermissionsResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetAccessPermissionsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetAuthFlowParamRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetAuthFlowParamRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetAuthFlowParamResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetAuthFlowParamResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetCustomerBillingAgreementRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetCustomerBillingAgreementRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetCustomerBillingAgreementResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetCustomerBillingAgreementResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetExpressCheckoutRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetExpressCheckoutRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetExpressCheckoutResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetExpressCheckoutResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetMobileCheckoutRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetMobileCheckoutRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetMobileCheckoutResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.SetMobileCheckoutResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionSearchRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.TransactionSearchRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionSearchResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.TransactionSearchResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAccessPermissionsRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.UpdateAccessPermissionsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAccessPermissionsResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.UpdateAccessPermissionsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAuthorizationRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.UpdateAuthorizationRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAuthorizationResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.UpdateAuthorizationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateRecurringPaymentsProfileRequestType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateRecurringPaymentsProfileResponseType");
            cachedSerQNames.add(qName);
            cls = PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType");
            cachedSerQNames.add(qName);
            cls = CoreComponentTypes.apis.ebay.AmountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType");
            cachedSerQNames.add(qName);
            cls = CoreComponentTypes.apis.ebay.BasicAmountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "MeasureType");
            cachedSerQNames.add(qName);
            cls = CoreComponentTypes.apis.ebay.MeasureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "QuantityType");
            cachedSerQNames.add(qName);
            cls = CoreComponentTypes.apis.ebay.QuantityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "UUIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AbstractRequestType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AbstractRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AbstractResponseType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AbstractResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AccountEntryType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AccountEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AccountStateCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AccountStateCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AccountSummaryType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AccountSummaryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AckCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AckCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ActivationDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ActivationDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AdditionalAccountType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AdditionalAccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AdditionalFeeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AdditionalFeeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressNormalizationStatusCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AddressNormalizationStatusCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressOwnerCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AddressOwnerCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressStatusCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AddressStatusCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AirlineItineraryType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AirlineItineraryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AllowedPaymentMethodType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AllowedPaymentMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "APIAuthenticationType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.APIAuthenticationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "APICredentialsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.APICredentialsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "APIType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.APIType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ApprovalSubTypeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ApprovalSubTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ApprovalTypeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ApprovalTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AttributeSetType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ValType[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AttributeType");
            qName2 = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Attribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AttributeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ValType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ValType");
            qName2 = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Value");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuctionInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AuctionInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuctionTypeCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AuctionTypeCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthFlowTokenType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AuthorizationInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationRequestType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AuthorizationRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationResponseType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AuthorizationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AutoBillType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AutoBillType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AverageMonthlyVolumeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AverageMonthlyVolumeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AverageTransactionPriceType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.AverageTransactionPriceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BalanceCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BalanceCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BankAccountDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BankAccountDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BankAccountTypeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BankAccountTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BankIDCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BankIDCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BAUpdateResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BAUpdateResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BillingAgreementDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingApprovalDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BillingApprovalDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BillingCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BillingPeriodDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodDetailsType_Update");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BillingPeriodDetailsType_Update.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BillingPeriodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillOutstandingAmountRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BillOutstandingAmountRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillOutstandingAmountResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BillOutstandingAmountResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BMLOfferInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BMLOfferInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BoardingStatusType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BoardingStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessCategoryType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BusinessCategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BusinessInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessOwnerInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BusinessOwnerInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessSubCategoryType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BusinessSubCategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessTypeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BusinessTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ButtonCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonImageType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ButtonImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonSearchResultType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ButtonSearchResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonStatusType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ButtonStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonSubTypeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ButtonSubTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonTypeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ButtonTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BuyerDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerDetailType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BuyerDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerPaymentMethodCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BuyerPaymentMethodCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerProtectionCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BuyerProtectionCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BuyerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyNowTextType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.BuyNowTextType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CalculatedShippingRateType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CalculatedShippingRateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CategoryArrayType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CategoryType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Category");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CategoryType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ChannelType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ChannelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CharityType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CharityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CheckoutStatusCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CheckoutStatusCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CompleteCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CompleteCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CountryCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CountryCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupledBucketsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CoupledBucketsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupledPaymentInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CoupledPaymentInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupleType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CoupleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreateMobilePaymentRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CreateMobilePaymentRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreateRecurringPaymentsProfileRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CreateRecurringPaymentsProfileRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreateRecurringPaymentsProfileResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CreateRecurringPaymentsProfileResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CreditCardDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardNumberTypeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CreditCardNumberTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardTypeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CreditCardTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CrossPromotionsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CrossPromotionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CurrencyCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CurrencyCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CustomSecurityHeaderType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.CustomSecurityHeaderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DepositTypeCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DepositTypeCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DetailLevelCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DetailLevelCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DeviceDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DeviceDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DiscountInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DiscountInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DiscountType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DiscountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DisplayControlDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DisplayControlDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoCaptureResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DoCaptureResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoDirectPaymentRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DoDirectPaymentRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoExpressCheckoutPaymentRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoExpressCheckoutPaymentResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoMobileCheckoutPaymentResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DoMobileCheckoutPaymentResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoNonReferencedCreditRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DoNonReferencedCreditRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoNonReferencedCreditResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DoNonReferencedCreditResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoReferenceTransactionRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DoReferenceTransactionRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoReferenceTransactionResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DoReferenceTransactionResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DyneticClientType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.DyneticClientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EbayCheckoutType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.EbayCheckoutType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EbayItemPaymentDetailsItemType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.EbayItemPaymentDetailsItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EmailAddressType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnhancedDataType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.EnhancedDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnterBoardingRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.EnterBoardingRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnterBoardingTokenType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorParameterType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ErrorParameterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ErrorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EscrowCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.EscrowCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExecuteCheckoutOperationsRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ExecuteCheckoutOperationsRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExecuteCheckoutOperationsResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ExecuteCheckoutOperationsResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExpressCheckoutTokenType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalPartnerTrackingDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ExternalPartnerTrackingDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeOptInDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ExternalRememberMeOptInDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeOwnerDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ExternalRememberMeOwnerDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeStatusDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ExternalRememberMeStatusDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FailedPaymentActionType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.FailedPaymentActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FaultDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.FaultDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FeedbackRatingStarCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.FeedbackRatingStarCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FeesType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.FeeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FeeType");
            qName2 = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Fee");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FeeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.FeeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlatShippingRateType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.FlatShippingRateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlightDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.FlightDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlowControlDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.FlowControlDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FMFDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.FMFDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FMFPendingTransactionActionType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.FMFPendingTransactionActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FundingSourceDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.FundingSourceDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GalleryTypeCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.GalleryTypeCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GeneralPaymentMethodCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.GeneralPaymentMethodCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetAccessPermissionDetailsResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.GetAccessPermissionDetailsResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetAuthDetailsResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.GetAuthDetailsResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetBillingAgreementCustomerDetailsResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetBoardingDetailsResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.GetBoardingDetailsResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetExpressCheckoutDetailsResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetIncentiveEvaluationRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.GetIncentiveEvaluationRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetIncentiveEvaluationResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.GetIncentiveEvaluationResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetMobileStatusRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.GetMobileStatusRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetRecurringPaymentsProfileDetailsResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.GetRecurringPaymentsProfileDetailsResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftServicesCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.GiftServicesCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "HitCounterCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.HitCounterCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IdentificationInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IdentificationInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IdentityTokenInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IdentityTokenInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveAppliedDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveAppliedDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveAppliedStatusType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveAppliedStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveAppliedToType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveAppliedToType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveApplyIndicationType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveApplyIndicationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveBucketType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveBucketType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveDetailType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveItemType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveRequestCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveRequestCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveRequestDetailLevelCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveRequestDetailLevelCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveSiteAppliedOnType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveSiteAppliedOnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveTypeCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.IncentiveTypeCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InfoSharingDirectivesType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.InfoSharingDirectivesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InstrumentDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.InstrumentDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InsuranceOptionCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.InsuranceOptionCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InvoiceItemType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.InvoiceItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemArrayType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ItemType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Item");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemCategoryType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ItemCategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemTrackingDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ItemTrackingDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LandingPageType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.LandingPageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LanguageCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingDesignerType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ListingDesignerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ListingDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingDurationCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ListingDurationCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingEnhancementsCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ListingEnhancementsCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingTypeCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ListingTypeCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListOfAttributeSetType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ValType[][][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AttributeSetType");
            qName2 = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AttributeSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ManageRecurringPaymentsProfileStatusRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ManageRecurringPaymentsProfileStatusRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ManageRecurringPaymentsProfileStatusResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ManageRecurringPaymentsProfileStatusResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MarketingCategoryType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.MarketingCategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MatchStatusCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.MatchStatusCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchandizingPrefCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.MerchandizingPrefCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantDataType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.MerchantDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.MerchantPullInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullPaymentCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.MerchantPullPaymentCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullPaymentResponseType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.MerchantPullPaymentResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullPaymentType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.MerchantPullPaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullStatusCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.MerchantPullStatusCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantStoreDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.MerchantStoreDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MobileIDInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.MobileIDInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MobilePaymentCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.MobilePaymentCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MobileRecipientCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.MobileRecipientCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ModifiedFieldType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ModifiedFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ModifyCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ModifyCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "NameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OfferCouponInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.OfferCouponInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OfferDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.OfferDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionTrackingDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.OptionTrackingDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.OptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionTypeListType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.OptionTypeListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OrderDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.OrderDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OrderID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OtherPaymentMethodDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.OtherPaymentMethodDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaginationResultType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaginationResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaginationType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaginationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PayerInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentActionCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentActionCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentCategoryType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentCategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsItemType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentDetailsItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDirectivesType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentDirectivesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentItemInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentItemInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentItemType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentMeansType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentMeansType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentNotificationServiceCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentNotificationServiceCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentReasonType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentReasonType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentRequestInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentRequestInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentStatusCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentStatusCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentStatusIDCodeType");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionClassCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentTransactionClassCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentTransactionCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionSearchResultType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentTransactionSearchResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionStatusCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentTransactionStatusCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentTransactionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayPalUserStatusCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PayPalUserStatusCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PendingStatusCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PendingStatusCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PercentageRevenueFromOnlineSalesType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PercentageRevenueFromOnlineSalesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PersonNameType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PersonNameType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PhoneNumberType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PhoneNumberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PhotoDisplayCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PhotoDisplayCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "POSTransactionCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.POSTransactionCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProductCategoryType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ProductCategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotedItemType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PromotedItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotionItemPriceTypeCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PromotionItemPriceTypeCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotionItemSelectionCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PromotionItemSelectionCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotionMethodCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PromotionMethodCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotionSchemeCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PromotionSchemeCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PurchasePurposeTypeCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.PurchasePurposeTypeCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReceiverInfoCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ReceiverInfoCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReceiverInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ReceiverInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringFlagType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.RecurringFlagType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringPaymentsProfileDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringPaymentsProfileStatusType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.RecurringPaymentsProfileStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringPaymentsSummaryType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.RecurringPaymentsSummaryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RedeemedOfferType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.RedeemedOfferType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReferenceCreditCardDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ReferenceCreditCardDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefreshTokenStatusDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.RefreshTokenStatusDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefundInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.RefundInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefundSourceCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.RefundSourceCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefundType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.RefundType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RememberMeIDInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.RememberMeIDInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReversalReasonCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ReversalReasonCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReverseTransactionRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ReverseTransactionRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReverseTransactionResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ReverseTransactionResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReviseStatusType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ReviseStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RiskFilterDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.RiskFilterDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RiskFilterListType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.RiskFilterDetailsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RiskFilterDetailsType");
            qName2 = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Filters");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SalesTaxType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SalesTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SalesVenueType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SalesVenueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SalutationType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ScheduleDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ScheduleDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SchedulingInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SchedulingInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SellerDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerLevelCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SellerLevelCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerPaymentMethodCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SellerPaymentMethodCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SellerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellingStatusType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SellingStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SenderDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SenderDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetAccessPermissionsRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SetAccessPermissionsRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetAuthFlowParamRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SetAuthFlowParamRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetCustomerBillingAgreementRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SetCustomerBillingAgreementRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetDataRequestType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SetDataRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetDataResponseType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SetDataResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetEbayMobileCheckoutRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SetEbayMobileCheckoutRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetExpressCheckoutRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SetExpressCheckoutRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetMobileCheckoutRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SetMobileCheckoutRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SeverityCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SeverityCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingCarrierDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ShippingCarrierDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ShippingDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ShippingInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingOptionCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ShippingOptionCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingOptionType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ShippingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingPackageCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ShippingPackageCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingRatesTypeCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ShippingRatesTypeCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingRegionCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ShippingRegionCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingServiceCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ShippingServiceCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingTermsCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ShippingTermsCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SiteCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SiteCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SiteHostedPictureType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SiteHostedPictureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SolutionTypeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SolutionTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StatusChangeActionType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.StatusChangeActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StorefrontType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.StorefrontType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StoreVisibilityStatusType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.StoreVisibilityStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SubscribeTextType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SubscribeTextType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SubscriptionInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SubscriptionInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SubscriptionTermsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.SubscriptionTermsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SuffixType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxIdDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.TaxIdDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.TaxInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureInfoType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ThreeDSecureInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureRequestType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ThreeDSecureRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureResponseType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ThreeDSecureResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TotalType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.TotalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionEntityType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.TransactionEntityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionStatusType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.TransactionStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.TransactionType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Transaction");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.TransactionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TupleType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.TupleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UATPDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.UATPDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UnitCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.UnitCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UnitOfMeasure");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.UnitOfMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UpdateRecurringPaymentsProfileRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.UpdateRecurringPaymentsProfileRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UpdateRecurringPaymentsProfileResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.UpdateRecurringPaymentsProfileResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserChannelCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.UserChannelCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserIdPasswordType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.UserIdPasswordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserSelectedFundingSourceType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.UserSelectedFundingSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserSelectedOptionType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.UserSelectedOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserStatusCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.UserStatusCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserWithdrawalLimitTypeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.UserWithdrawalLimitTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ValType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.ValType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VATDetailsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.VATDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VATStatusCodeType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.VATStatusCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VendorHostedPictureType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.VendorHostedPictureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "WalletItemsType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.WalletItemsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "WalletItemType");
            cachedSerQNames.add(qName);
            cls = eBLBaseComponents.apis.ebay.WalletItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedCancelRecoupRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = EnhancedDataTypes.apis.ebay.EnhancedCancelRecoupRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedCheckoutDataType");
            cachedSerQNames.add(qName);
            cls = EnhancedDataTypes.apis.ebay.EnhancedCheckoutDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedCompleteRecoupRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = EnhancedDataTypes.apis.ebay.EnhancedCompleteRecoupRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedCompleteRecoupResponseDetailsType");
            cachedSerQNames.add(qName);
            cls = EnhancedDataTypes.apis.ebay.EnhancedCompleteRecoupResponseDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedInitiateRecoupRequestDetailsType");
            cachedSerQNames.add(qName);
            cls = EnhancedDataTypes.apis.ebay.EnhancedInitiateRecoupRequestDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedItemDataType");
            cachedSerQNames.add(qName);
            cls = EnhancedDataTypes.apis.ebay.EnhancedItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedPayerInfoType");
            cachedSerQNames.add(qName);
            cls = EnhancedDataTypes.apis.ebay.EnhancedPayerInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedPaymentDataType");
            cachedSerQNames.add(qName);
            cls = EnhancedDataTypes.apis.ebay.EnhancedPaymentDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedPaymentInfoType");
            cachedSerQNames.add(qName);
            cls = EnhancedDataTypes.apis.ebay.EnhancedPaymentInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public PayPalAPI.api.ebay.DoExpressCheckoutPaymentResponseType doExpressCheckoutPayment(PayPalAPI.api.ebay.DoExpressCheckoutPaymentReq doExpressCheckoutPaymentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DoExpressCheckoutPayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {doExpressCheckoutPaymentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.DoExpressCheckoutPaymentResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.DoExpressCheckoutPaymentResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.DoExpressCheckoutPaymentResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentResponseType doUATPExpressCheckoutPayment(PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentReq doUATPExpressCheckoutPaymentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DoUATPExpressCheckoutPayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {doUATPExpressCheckoutPaymentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.SetAuthFlowParamResponseType setAuthFlowParam(PayPalAPI.api.ebay.SetAuthFlowParamReq setAuthFlowParamRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetAuthFlowParam"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setAuthFlowParamRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.SetAuthFlowParamResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.SetAuthFlowParamResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.SetAuthFlowParamResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.GetAuthDetailsResponseType getAuthDetails(PayPalAPI.api.ebay.GetAuthDetailsReq getAuthDetailsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAuthDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getAuthDetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.GetAuthDetailsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.GetAuthDetailsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.GetAuthDetailsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.SetAccessPermissionsResponseType setAccessPermissions(PayPalAPI.api.ebay.SetAccessPermissionsReq setAccessPermissionsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetAccessPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setAccessPermissionsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.SetAccessPermissionsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.SetAccessPermissionsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.SetAccessPermissionsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.UpdateAccessPermissionsResponseType updateAccessPermissions(PayPalAPI.api.ebay.UpdateAccessPermissionsReq updateAccessPermissionsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAccessPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateAccessPermissionsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.UpdateAccessPermissionsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.UpdateAccessPermissionsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.UpdateAccessPermissionsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.GetAccessPermissionDetailsResponseType getAccessPermissionDetails(PayPalAPI.api.ebay.GetAccessPermissionDetailsReq getAccessPermissionDetailsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAccessPermissionDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getAccessPermissionDetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.GetAccessPermissionDetailsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.GetAccessPermissionDetailsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.GetAccessPermissionDetailsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.GetIncentiveEvaluationResponseType getIncentiveEvaluation(PayPalAPI.api.ebay.GetIncentiveEvaluationReq getIncentiveEvaluationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetIncentiveEvaluation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getIncentiveEvaluationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.GetIncentiveEvaluationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.GetIncentiveEvaluationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.GetIncentiveEvaluationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.SetExpressCheckoutResponseType setExpressCheckout(PayPalAPI.api.ebay.SetExpressCheckoutReq setExpressCheckoutRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetExpressCheckout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setExpressCheckoutRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.SetExpressCheckoutResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.SetExpressCheckoutResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.SetExpressCheckoutResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.ExecuteCheckoutOperationsResponseType executeCheckoutOperations(PayPalAPI.api.ebay.ExecuteCheckoutOperationsReq executeCheckoutOperationsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ExecuteCheckoutOperations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {executeCheckoutOperationsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.ExecuteCheckoutOperationsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.ExecuteCheckoutOperationsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.ExecuteCheckoutOperationsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.GetExpressCheckoutDetailsResponseType getExpressCheckoutDetails(PayPalAPI.api.ebay.GetExpressCheckoutDetailsReq getExpressCheckoutDetailsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetExpressCheckoutDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getExpressCheckoutDetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.GetExpressCheckoutDetailsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.GetExpressCheckoutDetailsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.GetExpressCheckoutDetailsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.DoDirectPaymentResponseType doDirectPayment(PayPalAPI.api.ebay.DoDirectPaymentReq doDirectPaymentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DoDirectPayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {doDirectPaymentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.DoDirectPaymentResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.DoDirectPaymentResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.DoDirectPaymentResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.ManagePendingTransactionStatusResponseType managePendingTransactionStatus(PayPalAPI.api.ebay.ManagePendingTransactionStatusReq managePendingTransactionStatusRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManagePendingTransactionStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {managePendingTransactionStatusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.ManagePendingTransactionStatusResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.ManagePendingTransactionStatusResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.ManagePendingTransactionStatusResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.DoCancelResponseType doCancel(PayPalAPI.api.ebay.DoCancelReq doCancelRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DoCancel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {doCancelRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.DoCancelResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.DoCancelResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.DoCancelResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.DoCaptureResponseType doCapture(PayPalAPI.api.ebay.DoCaptureReq doCaptureRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DoCapture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {doCaptureRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.DoCaptureResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.DoCaptureResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.DoCaptureResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.DoReauthorizationResponseType doReauthorization(PayPalAPI.api.ebay.DoReauthorizationReq doReauthorizationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DoReauthorization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {doReauthorizationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.DoReauthorizationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.DoReauthorizationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.DoReauthorizationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.DoVoidResponseType doVoid(PayPalAPI.api.ebay.DoVoidReq doVoidRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DoVoid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {doVoidRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.DoVoidResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.DoVoidResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.DoVoidResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.DoAuthorizationResponseType doAuthorization(PayPalAPI.api.ebay.DoAuthorizationReq doAuthorizationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DoAuthorization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {doAuthorizationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.DoAuthorizationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.DoAuthorizationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.DoAuthorizationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.UpdateAuthorizationResponseType updateAuthorization(PayPalAPI.api.ebay.UpdateAuthorizationReq updateAuthorizationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAuthorization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateAuthorizationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.UpdateAuthorizationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.UpdateAuthorizationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.UpdateAuthorizationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.DoUATPAuthorizationResponseType doUATPAuthorization(PayPalAPI.api.ebay.DoUATPAuthorizationReq doUATPAuthorizationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DoUATPAuthorization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {doUATPAuthorizationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.DoUATPAuthorizationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.DoUATPAuthorizationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.DoUATPAuthorizationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.SetCustomerBillingAgreementResponseType setCustomerBillingAgreement(PayPalAPI.api.ebay.SetCustomerBillingAgreementReq setCustomerBillingAgreementRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetCustomerBillingAgreement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setCustomerBillingAgreementRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.SetCustomerBillingAgreementResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.SetCustomerBillingAgreementResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.SetCustomerBillingAgreementResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsResponseType getBillingAgreementCustomerDetails(PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsReq getBillingAgreementCustomerDetailsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBillingAgreementCustomerDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getBillingAgreementCustomerDetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.CreateBillingAgreementResponseType createBillingAgreement(PayPalAPI.api.ebay.CreateBillingAgreementReq createBillingAgreementRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateBillingAgreement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createBillingAgreementRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.CreateBillingAgreementResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.CreateBillingAgreementResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.CreateBillingAgreementResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.DoReferenceTransactionResponseType doReferenceTransaction(PayPalAPI.api.ebay.DoReferenceTransactionReq doReferenceTransactionRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DoReferenceTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {doReferenceTransactionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.DoReferenceTransactionResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.DoReferenceTransactionResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.DoReferenceTransactionResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.CreateRecurringPaymentsProfileResponseType createRecurringPaymentsProfile(PayPalAPI.api.ebay.CreateRecurringPaymentsProfileReq createRecurringPaymentsProfileRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateRecurringPaymentsProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createRecurringPaymentsProfileRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.CreateRecurringPaymentsProfileResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.CreateRecurringPaymentsProfileResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.CreateRecurringPaymentsProfileResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsResponseType getRecurringPaymentsProfileDetails(PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsReq getRecurringPaymentsProfileDetailsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetRecurringPaymentsProfileDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getRecurringPaymentsProfileDetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.GetRecurringPaymentsProfileDetailsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusResponseType manageRecurringPaymentsProfileStatus(PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusReq manageRecurringPaymentsProfileStatusRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ManageRecurringPaymentsProfileStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {manageRecurringPaymentsProfileStatusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.ManageRecurringPaymentsProfileStatusResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.BillOutstandingAmountResponseType billOutstandingAmount(PayPalAPI.api.ebay.BillOutstandingAmountReq billOutstandingAmountRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BillOutstandingAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {billOutstandingAmountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.BillOutstandingAmountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.BillOutstandingAmountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.BillOutstandingAmountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileResponseType updateRecurringPaymentsProfile(PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileReq updateRecurringPaymentsProfileRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateRecurringPaymentsProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateRecurringPaymentsProfileRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.UpdateRecurringPaymentsProfileResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.DoNonReferencedCreditResponseType doNonReferencedCredit(PayPalAPI.api.ebay.DoNonReferencedCreditReq doNonReferencedCreditRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DoNonReferencedCredit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {doNonReferencedCreditRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.DoNonReferencedCreditResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.DoNonReferencedCreditResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.DoNonReferencedCreditResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.ReverseTransactionResponseType reverseTransaction(PayPalAPI.api.ebay.ReverseTransactionReq reverseTransactionRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ReverseTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reverseTransactionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.ReverseTransactionResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.ReverseTransactionResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.ReverseTransactionResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PayPalAPI.api.ebay.ExternalRememberMeOptOutResponseType externalRememberMeOptOut(PayPalAPI.api.ebay.ExternalRememberMeOptOutReq externalRememberMeOptOutRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ExternalRememberMeOptOut"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {externalRememberMeOptOutRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PayPalAPI.api.ebay.ExternalRememberMeOptOutResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (PayPalAPI.api.ebay.ExternalRememberMeOptOutResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, PayPalAPI.api.ebay.ExternalRememberMeOptOutResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
