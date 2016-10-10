package com.packt.webstore.domain;

public class Customer {
    private String customerId;
    private String name;
    private String address;
    private String noOfOrdersMade;

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNoOfOrdersMade(String noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }

    public String getNoOfOrdersMade() {

        return noOfOrdersMade;
    }

    public String getAddress() {

        return address;
    }

    public String getName() {

        return name;
    }

    public String getCustomerId() {

        return customerId;
    }

    public Customer() {super();

    }

    public Customer(String customerId, String name, String address, String noOfOrdersMade) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.noOfOrdersMade = noOfOrdersMade;
    }
}
