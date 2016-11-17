package com.packt.webstore.domain;

/**
 * Created by Julivi on 17.11.2016.
 */
public class Address {
    private String doorNo;
    private String streetName;
    private String areaName;
    private String state;
    private String country;
    private String zipCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (!doorNo.equals(address.doorNo)) return false;
        if (!streetName.equals(address.streetName)) return false;
        if (!areaName.equals(address.areaName)) return false;
        if (!state.equals(address.state)) return false;
        if (!country.equals(address.country)) return false;
        return zipCode.equals(address.zipCode);

    }

    @Override
    public int hashCode() {
        int result = doorNo.hashCode();
        result = 31 * result + streetName.hashCode();
        result = 31 * result + areaName.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + country.hashCode();
        result = 31 * result + zipCode.hashCode();
        return result;
    }

    public void setDoorNo(String doorNo) {

        this.doorNo = doorNo;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDoorNo() {

        return doorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getAreaName() {
        return areaName;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }
}
