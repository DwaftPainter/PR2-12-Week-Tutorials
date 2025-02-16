package Week04.TutorialWeek04;

public class Product {
    //Attributes
    private String name;
    private double price;
    private double discount;

    //Constructors
    public Product() {
    }

    public Product(String name, double price, int discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    //Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    //Getter Methods
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getDiscount() {
        return this.discount;
    }

    public double calculateImportTax() {
        return this.price / 10;
    }

    public void displayInformation() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Unit Price: $" + this.price);
        System.out.println("Discount: " + this.discount + "%");
        System.out.println("Import Tax: $" + calculateImportTax());
    }
}
