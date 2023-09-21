/** author = suhas */

// Main linked list class contain variables and methods
public class LL {
    private Node head;
    private Node tail;
    private int size;

    // Constructor method for linked list class
    public LL() {
        this.size = 0;
    }

    // Method to insert at first position
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Method to insert at last position
    public void insertLast(int value) {
        Node node = new Node(value);
        if (size == 0) {
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    // Method to display all the elements in the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Method to insert at particular index
    public void insertIndex(int value, int index) {
        if (index < 0 && index > size) {
            System.out.println("Please enter a valid index");
            return;
        }
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size - 1) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // Method to delete the first element
    public int deleteFirst() {
        if (size == 0) {
            return -1;
        }
        int ans = head.value;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return ans;
    }

    // Method to delete the last element
    public int deleteLast() {
        if (size == 0) {
            return -1;
        }
        if (size == 1) {
            return deleteFirst();
        }
        int ans = tail.value;
        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return ans;
    }

    // Method to delete at particular index
    public int deleteIndex(int index) {
        if (index < 0 && index > size) {
            return -1;
        }
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int ans = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return ans;
    }

    // Internal Class node contains variables and methods
    private class Node {
        int value;
        Node next;

        // constructor method for class node
        public Node(int value) {
            this.value = value;
        }

        // Constructor method for class node
        public Node(int value, LL.Node next) {
            this.value = value;
            this.next = next;
        }

    }

    // Main method to excecut the program
    public static void main(String[] args) {
        LL obj = new LL();
        obj.insertFirst(3);
        obj.insertFirst(2);
        obj.insertFirst(1);
        obj.insertLast(4);
        obj.insertLast(5);
        obj.insertFirst(0);
        obj.display();
        obj.insertIndex(10, 2);
        obj.insertIndex(20, 3);
        obj.display();
        System.out.println(obj.deleteFirst());
        obj.display();
        System.out.println(obj.deleteLast());
        obj.display();
        System.out.println(obj.deleteIndex(2));
        System.out.println(obj.deleteIndex(1));
        obj.display();
    }
}