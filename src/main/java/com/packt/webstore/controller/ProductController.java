package com.packt.webstore.controller;

/**
 * Created by Evgen on 07.10.2016.
 */

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.packt.webstore.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping
    public String list(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/all")
    public String allProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/{category}")
    public String getProductByCategory(Model model,
                                       @PathVariable("category") String productCategory) {
        model.addAttribute("products", productService.getProductByCategory(productCategory));
        return "products";
    }
    @RequestMapping("/filter/{ByCriteria}")
    public String getProductsByFilter(@MatrixVariable(pathVar = "ByCriteria")Map<String,List<String>> filterParam, Model model){
        model.addAttribute("products", productService.getProductsByFilter(filterParam));
        return "products";
    }
    @RequestMapping("/product")
    public String getProductById(@RequestParam("id") String productId, Model model){
        model.addAttribute("product",productService.getProductById(productId));
        return "product";
    }


}
