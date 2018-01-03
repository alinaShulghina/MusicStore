package com.alin.music_store.dao;

import com.alin.music_store.entity.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alin- on 03.01.2018.
 */
public class ProductDao {

    private List<Product> products;

    public List<Product> getProducts() {
        products = new ArrayList<>();
        Product product = new Product();
        product.setId(1);
        product.setName("Guitar");
        product.setCategory("instruments");
        product.setCondition("new");
        product.setDescription("This is the best guitar ever!");
        product.setPrice(1700);
        product.setStatus("Active");
        product.setUnitInStock(5);
        product.setManufacturer("Kolut");

        products.add(product);
        Product product1 = new Product();
        product1.setId(2);
        product1.setName("Piano");
        product1.setStatus("Active");
        product1.setPrice(2000);
        product1.setDescription("Great piano");
        product1.setCondition("New");
        product1.setCategory("Instrument");
        product1.setManufacturer("Heltop");
        product1.setUnitInStock(1);

        products.add(product1);

        return products;
    }

    public Product getById(long id) {
        return products.stream().filter(product -> product.getId() == id).findFirst().get();
    }
}
