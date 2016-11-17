package com.packt.webstore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Julivi on 17.11.2016.
 */
public class ShippingDetail implements Serializable {

    private static final long serialVersionUID = 6359438150412047803L;
    private String name;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date shippingDate;
    private Address shippingAdres;

    public ShippingDetail() {
        this.shippingAdres=new Address();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public Address getShippingAdres() {
        return shippingAdres;
    }

    public void setShippingAdres(Address shippingAdres) {
        this.shippingAdres = shippingAdres;
    }
}
