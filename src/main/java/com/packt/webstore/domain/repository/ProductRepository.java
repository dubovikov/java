package com.packt.webstore.domain.repository;

/**
 * Created by Evgen on 07.10.2016.
 */
import com.packt.webstore.domain.Product;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProductRepository {
    List <Product> getAllProducts();
    Product getProductById(String productID);
    List<Product> getProductByCategory(String category);
    Set<Product> getProductByFilter(Map<String,List<String>> filterParam);
    void addProduct(Product product);
}
