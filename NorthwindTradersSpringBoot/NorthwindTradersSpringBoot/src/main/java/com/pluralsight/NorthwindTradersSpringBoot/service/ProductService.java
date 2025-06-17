package com.pluralsight.NorthwindTradersSpringBoot.service;

import com.pluralsight.NorthwindTradersSpringBoot.dao.ProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {


    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "Chai", 1, 18.0));
        products.add(new Product(2, "Chang", 1, 19.0));
        products.add(new Product(3, "Aniseed Syrup", 2, 10.0));
        products.add(new Product(5, "Chef Anton's Gumbo Mix", 2, 21.35));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(p -> p.getProductId() == id)
                .findFirst()
                .orElse(null);
    }

//    public ProductService(ProductDAO productDao) {
//        this.productDao = productDao;
//    }
//
//    public void addProduct(Product product) {
//        productDao.add(product);
//    }
//
//
//    public void deleteProduct(int productId) {
//        productDao.delete(productId);
    }


