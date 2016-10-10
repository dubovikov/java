package com.packt.webstore.domain;

/**
 * Created by Evgen on 07.10.2016.
 */
import java.math.BigDecimal;

public class Product {
    private String productId;
    private String name;
    private BigDecimal unitPrice;
    private String description;
    private String manufacturer;
    private String category;
    private long unitsInStock;
    private long unitsInOrder;
    private boolean discontinued;
    private String condition;
    public Product() {
        super();
    }
    public Product(String productId, String name, BigDecimal unitPrice) {
        this.productId = productId;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((productId == null) ? 0 : productId.hashCode());
        return result;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setDiscontinued(boolean discontinued) {

        this.discontinued = discontinued;
    }

    public void setUnitsInOrder(long unitsInOrder) {

        this.unitsInOrder = unitsInOrder;
    }

    public void setUnitsInStock(long unitsInStock) {

        this.unitsInStock = unitsInStock;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public void setUnitPrice(BigDecimal unitPrice) {

        this.unitPrice = unitPrice;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setProductId(String productId) {

        this.productId = productId;
    }

    public String getCondition() {

        return condition;
    }

    public boolean isDiscontinued() {

        return discontinued;
    }

    public long getUnitsInOrder() {

        return unitsInOrder;
    }

    public long getUnitsInStock() {

        return unitsInStock;
    }

    public String getCategory() {

        return category;
    }

    public String getManufacturer() {

        return manufacturer;
    }

    public String getDescription() {

        return description;
    }

    public BigDecimal getUnitPrice() {

        return unitPrice;
    }

    public String getName() {

        return name;
    }

    public String getProductId() {

        return productId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (productId == null) {
            if (other.productId != null)
                return false;
        } else if (!productId.equals(other.productId))
            return false;
        return true;
    }
}
