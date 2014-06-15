package com.carpay.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.carpay.Domain.Person;

public class FormValidation implements Validator {
	
	
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "field.required");
		
		
		
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
