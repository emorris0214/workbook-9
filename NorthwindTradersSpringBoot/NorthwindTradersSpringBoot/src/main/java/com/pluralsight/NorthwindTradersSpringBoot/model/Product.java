package com.pluralsight.NorthwindTradersSpringBoot.model;

public class Product {
    protected int productId;
    protected String name;
    protected String category;
    protected double price;

    public Product(int productId, String name, String category, double price) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
    }
}
