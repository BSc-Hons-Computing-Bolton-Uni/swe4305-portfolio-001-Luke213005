package Logbook.Week5;

import java.util.ArrayList;

class StockList {
    private final ArrayList<Product> products;

    // Constructor initializes the product list
    public StockList() {
        products = new ArrayList<>();
    }

    // Add a product to stock
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added product: " + product.getName());
    }

    // Remove a product by ID
    public void removeProduct(int id) {
        Product productToRemove = findProductById(id);
        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Removed product: " + productToRemove.getName());
        } else {
            System.out.println("Product not found.");
        }
    }

    // Find a product by ID
    public Product findProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    // Print all products in stock
    public void printStock() {
        if (products.isEmpty()) {
            System.out.println("Stock is empty.");
        } else {
            for (Product product : products) {
                product.print();
            }
        }
    }
}