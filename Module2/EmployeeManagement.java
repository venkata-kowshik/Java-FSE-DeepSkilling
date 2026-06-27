public class EmployeeManagement {

    public static void main(String[] args) {

        String[] employees = new String[5];
        int count = 0;

        // Add
        employees[count++] = "John";
        employees[count++] = "Alice";
        employees[count++] = "David";

        // Traverse
        System.out.println("Employee List:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }

        // Search
        String search = "Alice";
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (employees[i].equals(search)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Employee Found");
        else
            System.out.println("Employee Not Found");

        // Delete
        String delete = "Alice";

        for (int i = 0; i < count; i++) {
            if (employees[i].equals(delete)) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                count--;
                break;
            }
        }

        // Display after delete
        System.out.println("After Deletion:");

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }
}