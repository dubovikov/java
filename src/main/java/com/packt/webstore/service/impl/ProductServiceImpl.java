package com.packt.webstore.service.impl;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Julivi on 17.10.2016.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public Set<Product> getProductsByFilter(Map<String, List<String>> filterParam) {
        return productRepository.getProductByFilter(filterParam);
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return productRepository.getProductByCategory(category);
    }

    @Override
    public Product getProductById(String productId) {
        return productRepository.getProductById(productId);
    }
}
