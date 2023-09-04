public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        return quantity > 0;
    }


    public boolean isCategory(String categoryToCheck) {
        return category.equals(categoryToCheck);
    }

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