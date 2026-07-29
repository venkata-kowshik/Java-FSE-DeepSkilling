public class LibraryManagement {

    // Linear Search
    static void linearSearch(String[] books, String key) {

        for (int i = 0; i < books.length; i++) {

            if (books[i].equals(key)) {
                System.out.println("Book Found (Linear Search)");
                return;
            }
        }

        System.out.println("Book Not Found");
    }

    // Binary Search
    static void binarySearch(String[] books, String key) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (books[mid].equals(key)) {
                System.out.println("Book Found (Binary Search)");
                return;
            }

            if (key.compareTo(books[mid]) < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }

        System.out.println("Book Not Found");
    }

    public static void main(String[] args) {

        // Books must be sorted
        String[] books = {
            "C",
            "DSA",
            "Java",
            "Python"
        };

        linearSearch(books, "Java");

        binarySearch(books, "Java");
    }
}