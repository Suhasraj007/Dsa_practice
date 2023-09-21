public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    public void insertAtFirst(int val){
        Node newNode = new Node(val,head);
        head = newNode;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertAtLast(int val){

        if(head == null){
            insertAtFirst(val);
            return;
        }

        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void display(){
        if(head == null){
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        
        System.out.print("End");
    }

    public int size(){
        return size;
    }

    public void insertAtIndex(int val, int index){
        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        if (index == size) {
            insertAtLast(val);
            return;
        }

        Node temp = getNode(index-1);
        Node newNode = new Node(val,temp.next);
        temp.next = newNode;
        size++;
    }

    public int deleteAtHead(){
        if(head == null){
            return -1;
        }
        int ans = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return ans;
    }

    public int deleteAtTail(){
        if(head == null){
            return -1;
        }

        if (size <= 1) {
            return deleteAtHead();
        }

        int ans = tail.val;
        Node node = getNode(size - 2);
        tail = node;
        tail.next = null;
        size--;
        return ans;
    }

    public int deleteAtIndex(int index){
        if(head == null){
            return -1;
        }
        if (index == 0) {
            return deleteAtHead();
        }
        if (index == size - 1) {
            return deleteAtTail();
        }

        Node node = getNode(index-1);
        int ans = node.next.val;
        node.next = node.next.next;
        size--;
        return ans;
    }

    public Node getNode(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }

        return node;
    }

    class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
