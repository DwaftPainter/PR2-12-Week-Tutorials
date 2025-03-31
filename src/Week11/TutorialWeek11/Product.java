package Week11.TutorialWeek11;

import Week09.TutorialWeek09.NotPossibleException;

public class Product implements java.io.Serializable {
    private String name;
    private double price;

    public Product(String name, double price) throws NotPossibleException {
        validateName(name, "init");
        validatePrice(price, "init");
        this.name = name.trim();
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) throws NotPossibleException {
        validateName(name, "setter");
        this.name = name;
    }

    public void setPrice(double price) throws NotPossibleException {
            validatePrice(price, "setter");
            this.price = price;
    }

    private void validateName(String s, String message) throws NotPossibleException {
        if (s.isBlank() || s.length() > 50) {
            throw new NotPossibleException(message + " - Product name must be between 1 and 50 characters and cannot be empty.");
        }
    }

    private void validatePrice(double price, String message) throws NotPossibleException {
        if (price < 0) {
            throw new NotPossibleException(message + " - Product price must be non-negative.");
        }
    }

    public String toString() {
        return String.format("Product[{name=%s, " + (price % 1 == 0 ? "price=%.1f}]" : "price=%.2f}]"), name, price);
    }
}
