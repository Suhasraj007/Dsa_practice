public class Main{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtFirst(3);
        list.insertAtFirst(2);
        list.insertAtFirst(1);
        list.insertAtLast(5);
        list.insertAtLast(6);
        list.insertAtIndex(4, 3);

        list.deleteAtHead();
        list.deleteAtTail();
        list.deleteAtIndex(2);

        System.out.println(list.size());

        list.display();
    }
}