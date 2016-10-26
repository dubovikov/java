package com.packt.webstore.exception;

/**
 * Created by Julivi on 26.10.2016.
 */
public class ProductNotFoundException extends RuntimeException {
    private static final long serialVersionUID =-694354952032299587L;
    private String productId;

    public String getProductId() {
        return productId;
    }
    public ProductNotFoundException(String productId) {
        this.productId = productId;
    }
}
