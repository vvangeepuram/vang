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
	<div class = "main-container">
	 <jsp:include page="vehicleInfo.jsp"/>
	 <div class = "right-container">
		<b style="margin-top:30px; margin-right: 14px;">Step 1 of 2</b>
	 	<h2>Contact Information</h2>
	    <h3>Please provide your contact information before we proceed to purchase your vehicle</h3>
	 	
		<form id="Person" name="contactInfoForm" action="save" method="POST" onsubmit="">
			<div class = "row">
				<div class = "span4">
					<div class = "controls controls-row">
						<input id = "cp_firstName" name = "firstName" type = "text" value="" placeholder = "First Name" class = "span2"/>
						<input id = "cp_lastName" name = "lastName" type = "text" value="" placeholder = "Last Name" class = "span2"/>
					</div>
					<div class = "container">	
						<input id = "cp_email" name = "email" type = "text" value="" placeholder = "Email" class = "span4"/>
					</div>	
					<div class = "container">
						<input id = "cp_phoneNumber" name = "phoneNumber" type = "text" value="" placeholder = "Phone Number" class = "span3"/>
					</div>	
						<input class="btn btn-primary" type = "submit" id = "submitBtn" value = "Next"/>
				</div>
			</div>
		</form>
	 </div>	
	</div>	
</body>
</html>