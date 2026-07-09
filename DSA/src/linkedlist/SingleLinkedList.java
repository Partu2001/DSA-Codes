package linkedlist;
public class SingleLinkedList {
    Node head;
    public void insertList(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
 
    
    public void printReverse(Node node) {
        if (node == null) {
            return;
        }
        printReverse(node.next);
        System.out.print(node.data + " -> ");
    }


    public void deleteList(int value) {
        if (head == null) {
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    
    public static void main(String[] args) {

        SingleLinkedList sl = new SingleLinkedList();
        sl.insertList(10);
        sl.insertList(20);
        sl.insertList(30);
        sl.insertList(40);

        System.out.println("Original List:");
        sl.display();

        int key = 10;
        if (sl.search(key)) {
            System.out.println(key + " found in linked list");
        } else {
            System.out.println(key + " not found in linked list");
        }

        System.out.println("Reversed List:");
        sl.printReverse(sl.head);
        System.out.println("NULL");

        sl.deleteList(30);
        System.out.println("After deleting 30:");
        sl.display();
    }
}