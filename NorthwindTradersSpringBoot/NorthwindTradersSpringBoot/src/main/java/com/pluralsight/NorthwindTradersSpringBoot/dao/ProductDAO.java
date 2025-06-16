package com.pluralsight.NorthwindTradersSpringBoot.dao;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;

import java.util.List;

public interface ProductDAO {
    public List<Product> getAll();
    public Product getByProductID();
    public void delete();
    public void add(Product product);
}