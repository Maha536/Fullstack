package com.cts.training.web.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy =IdValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IdPrefix {
	
	public String code() default "CTS";
	public String message() default "Invalid code..";
	
	//cumpolsary we have to add
	
	public Class<?>[]  groups() default {};
	public Class<? extends Payload>[]  payload() default {};
		

}
