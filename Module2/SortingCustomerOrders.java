public class SortingCustomerOrders {

    // Bubble Sort
    static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    // Partition Method
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Display Array
    static void display(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] orders = {500, 200, 900, 100};

        System.out.println("Before Sorting:");
        display(orders);

        quickSort(orders, 0, orders.length - 1);

        System.out.println("After Quick Sort:");
        display(orders);
    }
}