public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ana", 18, false);
        Person person2 = new Person("Pisti", 42, true);
        Person person3 = new Person("Andrei", 24, false);
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

        Product product1 = new Product("Phone", 800, 50, "Electronics");
        Product product2 = new Product("Book", 10, 30, "Books");
        Product product3 = new Product("Suncream", 2.5, 0, "Skincare");


        System.out.println("Product 1:");
        printProductInfo(product1);

        System.out.println("\nProduct 2:");
        printProductInfo(product2);

        System.out.println("\nProduct 3:");
        printProductInfo(product3);


        System.out.println("\nProduct 1 has stock: " + product1.hasStock());
        System.out.println("Product 2 has stock: " + product2.hasStock());
        System.out.println("Product 3 has stock: " + product3.hasStock());

        String categoryToCheck = "Books";
        System.out.println("\nProduct 1 is in the " + categoryToCheck + " category: " + product1.isCategory(categoryToCheck));
        System.out.println("Product 2 is in the " + categoryToCheck + " category: " + product2.isCategory(categoryToCheck));
        System.out.println("Product 3 is in the " + categoryToCheck + " category: " + product3.isCategory(categoryToCheck));
    }


    public static void printProductInfo(Product product) {
        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Category: " + product.getCategory());
    }
}






