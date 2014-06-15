<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type = "text/css" rel = "stylesheet" href = "resources/css/main.css"/>

<script src = "resources/js/dist/jquery.validate.js"></script>
<script src = "resources/js/dist/jquery.validate.min.js"></script>
<script src= "resources/js/dist/additional-methods.js" ></script>
<script src = "resources/js/main.js"></script>
<script src = "resources/js/lib/jquery.js"></script>

<meta name="layout" content="bootstrap-main"/>

<title>Insert title here</title>
</head>
<body>
	<div class="main-container">
		<div class="right-container">
			<b style="margin-top:30px; margin-right: 14px;">Step 2 of 2</b>
			<h2>Purchase Vehicle</h2>
			<h3>Please enter your credit card & billing information to place your <strong>$500 deposit.</strong></h3>
			<h3>Your deposit will secure this car, its yours! The deposit is good for 24 hours and you can also cancel anytime before
			      then for a full refund.</strong></h3>
			<div class="error_div">
				${errorMessage }
			</div> 
			<form class = "" name = "purchaseForm" action="purchase">
				<div class="row">
					<div class="span4">
						<div class="container">
							<input class="span4" name="ccNum" id="cp_ccNum" placeholder="Card Number" value=""/>
							<input class="span3" name="expDate" id="cp_expDate" placeholder="mm/yyyy" value=""/>
							<input class="span3" name="cvv" id="cp_cvv" placeholder="CVV" value=""/>
						</div>
						<div class="container">
							<input class="span3" id="cp_zip" name="zip" placeholder="Billing Zip" value=""/>
						</div>
						<div>
							<input type="submit" class="btn btn-primary" id="purchaseBtn" name="next" value="PURCHASE VEHICLE"/>
						</div>
					</div>
				</div>
			</form>
			     	<h4><strong>What happens after I submit my deposit?</strong> Fathers & Sons will contact you to review 
					your financing options and setup a time to complete the remaining paperwork needed to drive home your new car.
					Cancel any time for a refund of your full deposit. If we don't hear back from you 
					after 24 hours, your deposit will be refunded and this car will be available for other customers. </h4>
		</div>
	</div>
</body>
</html>