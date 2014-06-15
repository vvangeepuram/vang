<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type = "text/css" rel = "stylesheet" href = "resources/css/main.css"/>
<script src = "resources/js/lib/jquery.js"></script>
<script src = "resources/js/dist/jquery.validate.js"></script>
<script src= "resources/js/dist/additional-methods.js" ></script>
<script src = "resources/js/main.js"></script>
<meta name="layout" content="bootstrap-main"/>
<title>Contact Information</title>
</head>
<body>

	<div class="main-container">
		<div class="top-container">
			<img src="${vehicle.imageURL}" width="250" height="190"/>
			<img class="sold-tag" src="/Carpay/img/img_sold_126x126.png" width="126" height="126"/>
			<img class="dealer-logo" src="/Carpay/img/logo_fsvolvo_228x74.png" width="137" height="44"/>
			<br/><br/><br/>
			<h2>Congratulations, ${person.firstName}!</h2>
			<h3>The car is yours!</h3>
			<div class="carTitle2">${vehicle.description}</div>
			<div class="carPrice">${vehicle.salePrice }</div>
		</div>
		<div class="bottom-container">
			<div class="thk-msg-container">
				<p class="thk-msg-row"><b class="green-text">NEXT STEP:</b> Somebody from Fathers & Sons will email or 
				call you to setup a time to visit  the dealership to complete your transaction. </p>
				
				<p class="thk-msg-row">Your car is reserved for you and the price won't change. When you come in, you
				will be able to determine your payment and financing options, trade-in value if any, and any service
				enhancements for your car.</p>
				<div class="thk-caution">
					<p>If we don't hear back from you after 24 hours, your deposit will be refunded and this car will 
					be available for other customers. To cancel your deposit or if you have any questions, call 
					Fathers & Sons at <strong>(866) 981-7654.</strong></p>
				</div>
				<p>Your deal is done, but would you like to do more steps of the buying process online?</p>
			</div>
			<div class="thk-btn-container">
					<g:submitButton class="btn btn-primary" id="svyBtn" name="next" value="YES, PLEASE" onclick="location.href = '/CarPay/carPayContactInformation/survey?vin=${vehicle?.vin }&customerId=${person?.id }'"/>
					<p>
						<a href="#" id="closeBtn" class="btn-link-text" >No, Thank you.</a>
					</p>
				
			</div>
		</div>
	</div>

</body>
</html>