package Logbook.Week5;

class StockDemo {
    private final StockList stock;

    // Constructor initializes StockList
    public StockDemo() {
        stock = new StockList();
    }

    // Run method to call all test methods
    public void run() {
        System.out.println("Running Stock Demo...");
        addTestProducts();
        printStock();
        searchProductTest();
        removeProductTest();
        printStock();
        System.out.println("Stock Demo Complete.");
    }

    // Add test products to the stock list
    private void addTestProducts() {
        System.out.println("\nAdding products to stock...");
        stock.addProduct(new Product(101, "Laptop", 10));
        stock.addProduct(new Product(102, "Smartphone", 20));
        stock.addProduct(new Product(103, "Headphones", 15));
        System.out.println("\nProducts successfully added.");
    }

    // Print the stock list
    private void printStock() {
        System.out.println("\nCurrent Stock:");
        stock.printStock();
    }

    // Search for a specific product
    private void searchProductTest() {
        int searchId = 103;  // Looking for "Headphones"
        System.out.println("\nSearching for product with ID " + searchId + "...");
        Product product = stock.findProductById(searchId);
        if (product != null) {
            System.out.println("Product found:");
            product.print();
        } else {
            System.out.println("Product not found.");
        }
    }

    // Remove a product and test stock update
    private void removeProductTest() {
        int removeId = 102;  // Removing "Smartphone"
        System.out.println("\nRemoving product with ID " + removeId + "...");
        stock.removeProduct(removeId);
    }

    // Main method to run the test
    public static void main(String[] args) {
        StockDemo demo = new StockDemo();
        demo.run();  // Calls the run() method
    }
}