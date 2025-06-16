package com.pluralsight.NorthwindTradersSpringBoot.dao;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDAO implements ProductDAO {
    private List<Product> products;

    public SimpleProductDAO() {
        this.products = new ArrayList<>();
        this.products.add(new Product(1234, "Monkey D. Luffy Plushie", "Toy", 19.99));
        this.products.add(new Product(1235, "Luna Moth Squishmallow", "Toy", 25.00));
        this.products.add(new Product(1236, "One Piece, Volume 106", "Book", 15.99));
    }

    @Override
    public List<Product> getAll() {
        return this.products;
    }

    @Override
    public Product getByProductID() {
        return null;
    }


    @Override
    public void delete() {

    }

    @Override
    public void add(Product product) {
        this.products.add(product);
    }

}