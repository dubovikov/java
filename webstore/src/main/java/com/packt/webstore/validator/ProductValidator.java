package com.packt.webstore.validator;


import com.packt.webstore.domain.Product;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import java.util.HashSet;
import java.util.Set;

public class ProductValidator implements Validator {
    @Autowired
    private javax.validation.Validator beansValidator;
    private Set<Validator> springValidator;

    public ProductValidator() {
        springValidator=new HashSet<>();
    }

    public void setSpringValidator(Set<Validator> springValidator) {
        this.springValidator = springValidator;
    }

    public void validate(Object o, Errors errors) {
        Set<ConstraintViolation<Object>> constraintViolations = beansValidator.validate(o);
        for (ConstraintViolation<Object> constraintValidator:constraintViolations){
            String propertyPath= constraintValidator.getPropertyPath().toString();
            String message=constraintValidator.getMessage();
            errors.rejectValue(propertyPath," ",message);
        }
        for (Validator validator:springValidator){
            validator.validate(o, errors);
        }

    }

    public boolean supports(Class<?> clazz){
        return Product.class.isAssignableFrom(clazz);

    }
}
