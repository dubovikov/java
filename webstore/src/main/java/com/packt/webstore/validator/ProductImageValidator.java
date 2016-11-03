package com.packt.webstore.validator;

import com.packt.webstore.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Set;

public class ProductImageValidator implements Validator {
    private long allowedSize=2500;

    @Override
    public boolean supports(Class<?> aClass) {
        return Product.class.isAssignableFrom(aClass);
    }

    public void setAllowedSize(long allowedSize) {
        this.allowedSize = allowedSize;
    }

    @Override
    public void validate(Object o, Errors errors) {
        Product product = (Product) o;
        if (allowedSize < product.getProductImage().getSize() || product.getProductImage().isEmpty()) {
            errors.rejectValue("productImage", "com.packt.webstore.validator.ProductImageValidator.message");
        }
    }
}
