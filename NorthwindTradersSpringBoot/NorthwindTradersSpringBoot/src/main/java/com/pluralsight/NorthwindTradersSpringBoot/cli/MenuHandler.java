package com.pluralsight.NorthwindTradersSpringBoot.cli;

import com.pluralsight.NorthwindTradersSpringBoot.cli.screen.MenuScreen;
import com.pluralsight.NorthwindTradersSpringBoot.cli.screen.ProductListScreen;
import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import com.pluralsight.NorthwindTradersSpringBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MenuHandler {

    private final MenuScreen menuScreen;
    private final ProductListScreen productListScreen;
    private final ProductService productService;
    private final Utils utils;

    @Autowired
    public MenuHandler(MenuScreen menuScreen,
                       ProductListScreen productListScreen,
                       ProductService productService,
                       Utils utils) {
        this.menuScreen = menuScreen;
        this.productListScreen = productListScreen;
        this.productService = productService;
        this.utils = utils;
    }

    public void showMainMenu() {
        menuScreen.displayMenu();
        String option = utils.getUserInput();
        handleUserOption(option);
    }

    private void handleUserOption(String option) {
        switch (option) {
            case "0" -> exitScreen();
            case "1" -> showAllProducts();
//            case "2" -> addProduct();
//            case "3" -> deleteProduct();
            default -> {
                System.out.println("Invalid option. Please try again.");
                showMainMenu();
            }
        }
    }

    private void showAllProducts() {
        productListScreen.displayAllProducts(productService.getAllProducts());
        utils.pauseBriefly();
        showMainMenu();
    }

//    private void addProduct() {
//        System.out.print("Enter Product Name: ");
//        String name = utils.getUserInput();
//
//        System.out.print("Enter Quantity Per Unit: ");
//        String quantityPerUnit = utils.getUserInput();
//
//        System.out.print("Enter Unit Price: ");
//        double unitPrice = Double.parseDouble(utils.getUserInput());
//
//        System.out.print("Enter Units In Stock: ");
//        int unitsInStock = Integer.parseInt(utils.getUserInput());
//
//        Product newProduct = new Product(0, name, quantityPerUnit, unitPrice, unitsInStock);
//        productService.addProduct(newProduct);
//
//        System.out.println("Product added successfully.");
//        utils.pauseBriefly();
//        showMainMenu();
//    }
//
//    private void deleteProduct() {
//        System.out.print("Enter Product ID to delete: ");
//        int productId = Integer.parseInt(utils.getUserInput());
//        productService.deleteProduct(productId);
//        System.out.println("Product deleted successfully.");
//        utils.pauseBriefly();
//        showMainMenu();
//    }

    private void exitScreen() {
        System.out.println("Thank you for using Northwind Traders CLI.");
        System.exit(0);
    }
}