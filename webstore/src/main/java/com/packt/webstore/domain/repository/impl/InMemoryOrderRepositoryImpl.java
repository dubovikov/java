package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Order;
import com.packt.webstore.domain.repository.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Julivi on 17.11.2016.
 */
@Repository
public class InMemoryOrderRepositoryImpl implements OrderRepository {
    private Map<Long,Order> listOfOrder;
    private long nextOrderId;

    public InMemoryOrderRepositoryImpl() {
        this.listOfOrder=new HashMap<>();
        this.nextOrderId=1000;
    }

    @Override
    public Long saveOrder(Order order) {
        order.setOrderId(getNextOrderId());
        listOfOrder.put(order.getOrderId(),order);
        return order.getOrderId();
    }

    public long getNextOrderId() {
        return nextOrderId++;
    }
}
