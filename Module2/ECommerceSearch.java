public class ECommerceSearch {

    // Linear Search
    static void linear(String[] products, String key) {

        for (String product : products) {

            if (product.equals(key)) {
                System.out.println("Found");
                return;
            }

        }

        System.out.println("Not Found");
    }

    // Binary Search
    static void binary(String[] products, String key) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(products[mid]);

            if (result == 0) {
                System.out.println("Found");
                return;
            }

            if (result < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) {

        String[] products = {
                "Keyboard",
                "Laptop",
                "Mouse",
                "Phone"
        };

        linear(products, "Mouse");

        binary(products, "Mouse");
    }
}