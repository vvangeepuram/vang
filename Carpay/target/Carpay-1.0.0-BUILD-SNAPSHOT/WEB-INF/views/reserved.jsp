<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="resources/css/main.css" />
<script src="resources/js/dist/jquery.validate.js" ></script>
<script src="resources/js/dist/jquery.validate.min.js" ></script>
<script src = "resources/js/dist/additional-methods.js"></script>
<script src="resources/js/main.js"></script>
<script src = "resources/js/lib/jquery.js"></script>
<meta name="layout" content="bootstrap-main" />
<title>Contact Information</title>
</head>
<body>

 
	<div class="main-container">
		<g:render template="vehicleInfo" />
		
		<div class="right-container">
			<h2>Vehicle Not Available</h2>
			<h3>Sorry, there is already an online deposit reservation for this vehicle. Deposit reservations
			are good for <strong>24 hours</strong>, so please contact the dealer for current status of this
			vehicle or to request more information.
			<br/><br/><br/>
			<strong>Fathers & Sons</strong><br/>
			1(866) 981-7654<br/>
			sales@fatherssons.com
			</h3><br/><br/>
			<p class="button">
				<g:submitButton class="btn btn-primary" id="closeBtn" name="next" onclick="close(); return false;" value="CLOSE" />
			</p>
			
		</div>
	</div>
</body>
</html>