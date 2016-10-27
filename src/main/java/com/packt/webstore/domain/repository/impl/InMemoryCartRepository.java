package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Cart;
import com.packt.webstore.domain.repository.CartRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Repository
public class InMemoryCartRepository implements CartRepository {
    private Map<String, Cart> cartMap;

    public InMemoryCartRepository() {
        cartMap = new HashMap<>();
    }

    @Override
    public Cart create(Cart cart) {
        if (cartMap.keySet().contains(cart.getCartId())) {
            throw new IllegalArgumentException(String.format("Can not create a cart. A cart with the give id (%) aldrady exist", cart.getCartId()));
        }
        cartMap.put(cart.getCartId(), cart);
        return cart;
    }

    @Override
    public Cart read(String cartId) {
        return cartMap.get(cartId);
    }

    @Override
    public void update(String cartId, Cart cart) {
        if (cartMap.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("Can not update cart. The cart with the give id (%) does not does not exist", cartId));
        }
        cartMap.put(cartId, cart);
    }

    @Override
    public void delete(String cartId) {
        if (cartMap.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("Can not delete cart. The cart with the give id (%) does not does not exist", cartId));
        }
        cartMap.remove(cartId);
    }
}