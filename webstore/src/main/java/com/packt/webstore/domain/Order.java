package com.packt.webstore.domain;

import java.io.Serializable;

/**
 * Created by Julivi on 17.11.2016.
 */
public class Order implements Serializable {

    private static final long serialVersionUID = 5901006628728637705L;
    private Long orderId;
    private Cart cart;
    private Customer customer;
    private ShippingDetail shippingDetail;

    public Order() {
        this.shippingDetail=new ShippingDetail();
        this.customer=new Customer();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (!orderId.equals(order.orderId)) return false;
        if (!cart.equals(order.cart)) return false;
        if (!customer.equals(order.customer)) return false;
        return shippingDetail.equals(order.shippingDetail);

    }

    @Override
    public int hashCode() {
        int result = orderId.hashCode();
        result = 31 * result + cart.hashCode();
        result = 31 * result + customer.hashCode();
        result = 31 * result + shippingDetail.hashCode();
        return result;
    }

    public Long getOrderId() {

        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShippingDetail getShippingDetail() {
        return shippingDetail;
    }

    public void setShippingDetail(ShippingDetail shippingDetail) {
        this.shippingDetail = shippingDetail;
    }
}
