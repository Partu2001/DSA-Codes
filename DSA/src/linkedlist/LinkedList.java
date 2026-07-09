package linkedlist;

import java.util.Scanner;

public class LinkedList {
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
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

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

    public static void main(String[] args) {

        LinkedList sl = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1.Insert Element");
            System.out.println("2.Display List");
            System.out.println("3.Search Element");
            System.out.println("4. Quit");
           
           
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter the Number of elements: ");
                int n = sc.nextInt();

                for (int i = 0; i < n; i++) {
                    System.out.print("Enter value " + (i + 1) + ": ");
                    int value = sc.nextInt();
                    sl.insertList(value);
                }
                break;
                    
                case 2:
                    sl.display();
                    break;    

                case 3:
                    System.out.print("Enter value to search: ");
                    int key = sc.nextInt();
                    if (sl.search(key)) {
                        System.out.println("Element found");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;

                case 4:
                    System.out.println("Quit");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}