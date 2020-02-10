package com.cts.training.web.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdValidator implements ConstraintValidator<IdPrefix,String>{
	private String expectedCode;
	@Override
	public void initialize(IdPrefix constraintAnnotation) {
		
		this.expectedCode = constraintAnnotation.code();
	}
	
	@Override
	public boolean isValid(String givenData, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if(givenData != null && givenData.startsWith(this.expectedCode))
			return true;
		
		return false;
	}

}
