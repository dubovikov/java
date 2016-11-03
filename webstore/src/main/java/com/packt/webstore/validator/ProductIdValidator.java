package com.packt.webstore.validator;

import com.packt.webstore.domain.Product;
import com.packt.webstore.exception.ProductNotFoundException;
import com.packt.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Julivi on 26.10.2016.
 */
public class ProductIdValidator implements ConstraintValidator<ProductId,String> {
    @Autowired
    private ProductService productService;

    @Override
    public void initialize(ProductId productId) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        Product product;
        try {
            product=productService.getProductById(s);
        }catch (ProductNotFoundException e){
            return true;
        }
        if (product!=null){
            return false;
        }
        return true;
    }
}
