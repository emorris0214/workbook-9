package com.pluralsight.NorthwindTradersSpringBoot.dao;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> getAll();
    Product getByProductId(int id);
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
}