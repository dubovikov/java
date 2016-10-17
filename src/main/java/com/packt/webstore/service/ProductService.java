package com.packt.webstore.service;

import com.packt.webstore.domain.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Julivi on 17.10.2016.
 */
public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(String productId);
    List<Product> getProductByCategory(String category);
    Set<Product> getProductsByFilter(Map<String,List<String>> filterParam);
}
