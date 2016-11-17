package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Order;

/**
 * Created by Julivi on 17.11.2016.
 */
public interface OrderRepository {
    Long saveOrder(Order order);
}
