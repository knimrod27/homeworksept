public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    // Constructor to initialize the Product object
    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }

    // Getter method for quantity
    public int getQuantity() {
        return quantity;
    }

    // Getter method for category
    public String getCategory() {
        return category;
    }

    // Check if the product has stock (quantity is not 0)
    public boolean hasStock() {
        return quantity > 0;
    }

    // Check if the product belongs to a specific category
    public boolean isCategory(String categoryToCheck) {
        return category.equals(categoryToCheck);
    }

    // Override the toString() method to provide a human-readable representation of the object
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                '}';
    }
}