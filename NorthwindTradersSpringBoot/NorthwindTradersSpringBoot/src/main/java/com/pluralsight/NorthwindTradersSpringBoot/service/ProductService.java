package com.pluralsight.NorthwindTradersSpringBoot.service;

import com.pluralsight.NorthwindTradersSpringBoot.dao.CustomerDAO;
import com.pluralsight.NorthwindTradersSpringBoot.dao.ProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {


    private final ProductDAO productDao;

    @Autowired
    public ProductService(ProductDAO productDao) {
        this.productDao = productDao;
    }

    public void addProduct(Product product) {
        productDao.add(product);
    }

    public List<Productr> getAllProducts() {
        return productDao.getAll();
    }

}