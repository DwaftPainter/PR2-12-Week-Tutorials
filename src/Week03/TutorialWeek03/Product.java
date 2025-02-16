package Week03.TutorialWeek03;

import java.util.Scanner;

public class Product {
    public String name;
    public double price;
    public double discount = 0;

    public Product (String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product () {

    }
    public void displayInformation() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Product Price: " + this.price);
        System.out.println("Discount: " + this.discount);
        System.out.println("Import Tax: " + getImportTax());
    }

    private double getImportTax() {
        return this.price * (0.1);
    }

    public void input(Scanner scanner) {
        System.out.println("Enter product name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter product price: ");
        this.price = scanner.nextDouble();
        System.out.println("Enter product discount: ");
        this.discount = scanner.nextDouble();
        String tmp = scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Create two Product objects
        Product product1 = new Product();
        Product product2 = new Product();

// Input details for both products
        System.out.println("Enter details for Product 1:");
        product1.input(scanner);

        System.out.println("Enter details for Product 2:");
        product2.input(scanner);

// Display details of both products
        System.out.println("\nProduct 1 Details:");
        product1.displayInformation();

        System.out.println("\nProduct 2 Details:");
        product2.displayInformation();

        scanner.close(); // Close the scanner
    }
}
