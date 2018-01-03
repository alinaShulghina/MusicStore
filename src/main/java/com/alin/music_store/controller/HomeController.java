package com.alin.music_store.controller;

import com.alin.music_store.dao.ProductDao;
import com.alin.music_store.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by alin- on 03.01.2018.
 */

@Controller
public class HomeController {

    private ProductDao productDao = new ProductDao();

    @RequestMapping("/")
    public String showHome() {
        return "index";
    }

    @RequestMapping("/products")
    public String getProducts(Model model) {
        List<Product> products = productDao.getProducts();
        model.addAttribute("products", products);
        return "products";
    }


    @RequestMapping("/products/details/{productId}")
    public String getProductDetails(@PathVariable long productId, Model model) {
        Product product = productDao.getById(productId);
        model.addAttribute("product", product);
        return "productDetails";
    }


}
