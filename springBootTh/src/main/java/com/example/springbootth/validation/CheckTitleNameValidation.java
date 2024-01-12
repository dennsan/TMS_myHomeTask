package com.example.springbootth.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TitleValidation.class)
public @interface CheckTitleNameValidation {

    String message() default "mast by filled and not start ";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
