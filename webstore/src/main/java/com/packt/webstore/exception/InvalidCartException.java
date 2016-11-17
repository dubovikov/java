package com.packt.webstore.exception;

/**
 * Created by Julivi on 17.11.2016.
 */
public class InvalidCartException extends RuntimeException {

    private static final long serialVersionUID = -5192041563033358491L;
    private String cartId;

    public String getCartId() {
        return cartId;
    }
    public InvalidCartException(String cartId){
        this.cartId=cartId;
    }
}
