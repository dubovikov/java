package com.packt.webstore.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private String cartId;
    private Map<String, CartItem> cartItemMap;
    private BigDecimal grandTotal;

    public Cart() {
        cartItemMap = new HashMap<>();
        grandTotal = new BigDecimal(0);
    }

    public String getCartId() {

        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Map<String, CartItem> getCartItemMap() {
        return cartItemMap;
    }

    public void setCartItemMap(Map<String, CartItem> cartItemMap) {
        this.cartItemMap = cartItemMap;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Cart(String cartId) {
        this();
        this.cartId = cartId;
    }

    public void addCartItem(CartItem cartItem) {
        String productId = cartItem.getProduct().getProductId();
        if (cartItemMap.containsKey(productId)){
            CartItem cartItem1=cartItemMap.get(productId);
            cartItem1.setQuantity(cartItem1.getQuantity()+cartItem.getQuantity());
        }else {
            cartItemMap.put(productId,cartItem);
        }
        updateGrandTotal();
    }
    public void removeCartItem(CartItem cartItem){
        String productId = cartItem.getProduct().getProductId();
        cartItemMap.remove(productId);
        updateGrandTotal();
    }

    @Override
    public int hashCode() {
        final int prime=71;
        int result=1;
        result=prime*result+((cartId==null)?0:cartId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)
            return true;
        if (obj==null)
            return false;
        if (getClass()!=obj.getClass())
            return false;
        Cart cart =(Cart)obj;
        if (cartId==null){
            if (cart.cartId!=null)
                return false;
        }else if (!cartId.equals(cart.cartId))
            return false;
        return true;
    }

    public void updateGrandTotal(){
        grandTotal=new BigDecimal(0);
        for (CartItem cartItem:cartItemMap.values()){
            grandTotal=grandTotal.add(cartItem.getTotalPrice());
        }
    }
}
