package com.packt.webstore.domain.repository;

/**
 * Created by Evgen on 07.10.2016.
 */
import com.packt.webstore.domain.Product;
import java.util.List;
public interface ProductRepository {
    List <Product> getAllProducts();
}
