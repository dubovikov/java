package com.packt.webstore.domain;

import java.io.Serializable;

public class Customer implements Serializable{

    private static final long serialVersionUID = -2231541779450990917L;
    private String customerId;
    private String name;
    private Address billingAdress;
    private String phoneNumer;

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public String getCustomerId() {

        return customerId;
    }

    public Customer() {super();
        this.billingAdress=new Address();

    }

    public Address getBillingAdress() {
        return billingAdress;
    }

    public void setBillingAdress(Address billingAdress) {
        this.billingAdress = billingAdress;
    }

    public String getPhoneNumer() {
        return phoneNumer;
    }

    public void setPhoneNumer(String phoneNumer) {
        this.phoneNumer = phoneNumer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!customerId.equals(customer.customerId)) return false;
        if (!name.equals(customer.name)) return false;
        if (!billingAdress.equals(customer.billingAdress)) return false;
        return phoneNumer.equals(customer.phoneNumer);

    }

    @Override
    public int hashCode() {
        int result = customerId.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + billingAdress.hashCode();
        result = 31 * result + phoneNumer.hashCode();
        return result;
    }

    public Customer(String customerId, String name) {
        this();
        this.customerId = customerId;
        this.name = name;

    }
}
