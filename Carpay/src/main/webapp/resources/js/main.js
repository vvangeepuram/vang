$(function() {
	
	$('[placeholder]').focus(function(){
		var input = $(this);
		if (input.val() == input.attr('placeholder')){
			input.val('');
			input.removeClass('placeholder');
		}
	}).blur(function() {
		var input = $(this);
		if(input.val() == '' || input.val() == input.attr('placeholder')){
			input.addClass('placeholder');
			input.val(input.attr('placeholder'));
	}
	}).blur();
	$('[placeholder]').parents('form').submit(function(){
		$(this).find('[placeholder]').each(function(){
			var input = $(this);
			if(input.val() == input.attr('placeholder')) {
				input.val('');
			}
		});
	});

//set up form valdiation on the #register form element
$("#Person").validate({
	
	//Specify the valdation rules
	rules: {
		firstName:"required",
		lastName:"required",
		email: {
			required:true,
			email:true
		},
		phoneNumber: {
			required:true,
			phoneUS:true
		}
	},
	
	//Specify validation error messages
	messages: {
		firstName:"",
		lastName:"",
		email:"",
		phoneNumber: {
			required: "",
			phoneUS: ""
		}
	},
	
	submitHandler: function(form) {
		form.submit();
	}
	});
});
