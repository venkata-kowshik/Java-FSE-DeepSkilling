public class TaskManagement {

    // Node class
    static class Node {
        int taskId;
        Node next;

        Node(int taskId) {
            this.taskId = taskId;
        }
    }

    static Node head = null;

    // Add Task
    static void addTask(int id) {

        Node newNode = new Node(id);

        if (head == null) {
            head = newNode;
        } else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    // Search Task
    static void searchTask(int id) {

        Node temp = head;

        while (temp != null) {

            if (temp.taskId == id) {
                System.out.println("Task Found");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }

    // Display Tasks
    static void displayTasks() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.taskId + " ");

            temp = temp.next;
        }

        System.out.println();
    }

    // Delete Task
    static void deleteTask(int id) {

        if (head == null)
            return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {

        addTask(1);
        addTask(2);
        addTask(3);

        System.out.println("Tasks:");
        displayTasks();

        searchTask(2);

        deleteTask(2);

        System.out.println("After Delete:");
        displayTasks();
    }
}