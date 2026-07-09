package queue;

public class TestQueue {

    int arr[];
    int front, rear, size, n;

    public TestQueue(int n) {
        this.n = n;
        arr = new int[n];
        front = 0;
        rear = -1;
        size = 0;
    }

    
    public void enqueue(int data) {
        if(size == n) {
            System.out.println("Queue Overflow");
            return;
        }
        rear++;
        arr[rear] = data;
        size++;
    }

    
    public void dequeue() {
        if(size == 0) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Removed : " + arr[front]);
        front++;
        size--;
    }

    
    public void peek() {
        if(size == 0) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front Element : " + arr[front]);
    }

    public void display() {
        if(size == 0) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue : ");
        for(int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        TestQueue q = new TestQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        
        q.display();

        q.dequeue();

        q.peek();

        q.display();
    }
}