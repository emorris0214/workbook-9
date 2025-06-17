package com.pluralsight.NorthwindTradersSpringBoot.dao;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import java.util.List;

public interface ProductDAO {
    List<Product> getAll();
    Product getByProductId(int productId);
    void delete(int id);

    void add(Product product);
}