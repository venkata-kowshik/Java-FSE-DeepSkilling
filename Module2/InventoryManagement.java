import java.util.HashMap;

class Product {

    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventoryManagement {

    static HashMap<Integer, Product> map = new HashMap<>();

    // Add Product
    static void addProduct(Product p) {
        map.put(p.productId, p);
    }

    // Update Product
    static void updateProduct(int id, int quantity) {
        if (map.containsKey(id)) {
            map.get(id).quantity = quantity;
        }
    }

    // Delete Product
    static void deleteProduct(int id) {
        map.remove(id);
    }

    // Display Products
    static void displayProducts() {
        for (Product p : map.values()) {
            System.out.println(p.productId + " "
                    + p.productName + " "
                    + p.quantity + " "
                    + p.price);
        }
    }

    public static void main(String[] args) {

        addProduct(new Product(1, "Laptop", 10, 50000));
        addProduct(new Product(2, "Mouse", 20, 500));

        System.out.println("Products:");
        displayProducts();

        updateProduct(1, 15);

        deleteProduct(2);

        System.out.println("\nAfter Update and Delete:");
        displayProducts();
    }
}