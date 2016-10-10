package com.packt.webstore.controller;

/**
 * Created by Evgen on 07.10.2016.
 */

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @RequestMapping("/products")
    public String list(Model model) {
        model.addAttribute("products", productRepository.getAllProducts());
        return "products";
    }
}
